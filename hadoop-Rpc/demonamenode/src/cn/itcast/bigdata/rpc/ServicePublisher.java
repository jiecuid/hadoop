package cn.itcast.bigdata.rpc;

import java.io.IOException;

import org.apache.hadoop.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Builder;
import org.apache.hadoop.ipc.RPC.Server;

public class ServicePublisher {
	
	public static void main(String[] args) throws Exception {
		Builder builder = new RPC.Builder(new Configuration());

		builder.setProtocol(DemoNamenodeProtocol.class)
		.setInstance(new DemoNameNodeImpl())
		.setBindAddress("hdp-server-01")
		.setPort(10000);
		
		Server server = builder.build();
		server.start();
		
		
	}

}
