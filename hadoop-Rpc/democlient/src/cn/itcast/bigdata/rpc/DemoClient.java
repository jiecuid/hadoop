package cn.itcast.bigdata.rpc;

import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class DemoClient {
	
	
	public static void main(String[] args) throws Exception {
		
		InetSocketAddress addr = new InetSocketAddress("hdp-server-01", 10000);
		DemoNamenodeProtocol demoNamenodeImpl = RPC.getProxy(DemoNamenodeProtocol.class, 1L, addr, new Configuration());
		
		
		String metaData = demoNamenodeImpl.getMetaData("/aaa/data.log");
		System.out.println(metaData);
		
	}
	

}
;