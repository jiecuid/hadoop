package cn.itcast.bigdata.rpc;

/**
 * �ӿ�������ͨ��˫����ͬ���ص�Լ�������߽�Э��
 * @author
 *
 */
public interface DemoNamenodeProtocol {
	
	//����ͨ��˫��һ�µİ汾��
	public static final long versionID = 1L;
	
	//����ͨ��˫�����Ե��õķ���
	public String getMetaData(String filePath);
	

}
