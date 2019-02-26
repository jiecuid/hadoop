package cn.itcast.bigdata.rpc;

/**
 * 接口是网络通信双方共同遵守的约定，或者叫协议
 * @author
 *
 */
public interface DemoNamenodeProtocol {
	
	//定义通信双方一致的版本号
	public static final long versionID = 1L;
	
	//定义通信双发可以调用的方法
	public String getMetaData(String filePath);
	

}
