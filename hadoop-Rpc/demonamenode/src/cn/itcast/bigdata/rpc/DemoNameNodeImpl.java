package cn.itcast.bigdata.rpc;

public class DemoNameNodeImpl implements DemoNamenodeProtocol{

	@Override
	public String getMetaData(String filePath) {
		
		return filePath +":[{blk_01:datanode10,datanode20,datanode21},{blk_02:datanode12,datanode21,datanode24}]";
	}

}
