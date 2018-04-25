package webapp;

/**
 * 卖票,实现runnable接口，重写run方法
 */
public class Ticket implements Runnable{

    //有100张票
    private int ticket=100;
    //创建锁对象
    private Object object=new Object();
    private Boolean flag=true;

    @Override
    public void run() {
                while (flag){
                    //t1,t2,t3都走到这里
                    //假设t1抢到cpu控制权
                    //假设t2抢到CPU执行权,t2就要进来,发现门是关着的,进不去,所以就等着
                    //门(开，关)
                    synchronized (object){   //发现这里的代码将来是会被锁上的，所以t1进来以后,就锁了(关)
                        if (ticket>0){
                            try {
                                Thread.sleep(100);    //t1睡着了
                            }catch (InterruptedException e){
                                System.out.println("线程中断");
                            }
                            System.out.println(Thread.currentThread().getName()+"正在售出第"+(ticket--)+"张票!");
                        }else {
                            System.out.println(Thread.currentThread().getName()+"票卖完了！");
                            flag=false;
                        }
                    }     //t1出来，门开了
                }
    }
}
