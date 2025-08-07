class DownloadTask extends Thread
{
    String fileName;
    int filesize;
    public DownloadTask(String fileName,int filesize)
    {
        this.fileName=fileName;
        this.filesize=filesize;
    }
    public void run()
    {
        int downloaded=0;
        try
        {
            while(downloaded<filesize)
            { 
                Thread.sleep(2000);
                downloaded+=10;
                if(downloaded>filesize)
                {
                    downloaded=filesize;
                }
                System.out.println(fileName+"Downloaded:"+downloaded+"MB/"+filesize+"MB");
            }
            System.out.println(fileName+"download complete.");
        }
        catch(InterruptedException e)
        {
            System.out.println(fileName+"download interrupted");
        }
    }
}
public class SoftwareDownloader 
{
    public static void main(String[] args) 
    {
        DownloadTask file1=new DownloadTask("File1.zip",50 );
        DownloadTask file2=new DownloadTask("File2.zip",70 );
        DownloadTask file3=new DownloadTask("File3.zip",60 );
        file1.start();
        file2.start();
        file3.start();
        try
        {
            file1.join();
            file2.join();
            file3.join();

        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("All downloads completed successfully");

        
    }
    
}
