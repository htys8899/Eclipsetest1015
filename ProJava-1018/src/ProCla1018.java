
public class ProCla1018 {

public static void main(String args[]){
MyThread myThread =new MyThread();

//MyThread myThread2= new MyThread();//2

Thread t1=new Thread(myThread);
Thread t2=new Thread(myThread);
//Thread t2= new Thread(myThread2); //2
t1.start();
t2.start();
}

}

class MyThread extends Thread {
//int i=0;//1
public void run() {
String name = Thread.currentThread().getName();
String inf=Thread.currentThread().toString();
long idnum = Thread.currentThread().getId();
for(int i=0;i<10;i++){//�������½�һ�����󣬻�����������//2�����Ǵ�ӡ20������
//for(;i<10;i++){//�½�һ�������ʱ�򣬴�ӡ11�����ҵ����� ,�½����������ʱ��//2�����ӡ20�����ݡ�//1
System.out.println("i----------"+i +",thread name=="+ name
+",threadid=="+ idnum+",thread inf=="+inf);
}
}
}