package world.cpp;

public class Synthesis {
    private long mHandle = 0;
    private native void destroy();
    private native void init(int fs,int fft_size,double frame_period);
    static{
        System.loadLibrary("world");
    }
    public Synthesis(int fs,int fft_size,double frame_period){
        init(fs,fft_size,frame_period);
    }
    @Override
    protected void finalize() throws Throwable {
        destroy();
        super.finalize();
    }
}
