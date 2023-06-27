/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Phone
{
    public void call()
    {
        System.out.println("Phone made a call");
    }
    public void sms()
    {
        System.out.println("Phone did an sms");
    }
}
interface Camera 
{
    public void click();
    public void record();
}
interface MusicPlayer
{
    public void play();
    public void pause();
    public void stop();
}
class SmartPhone extends Phone implements Camera,MusicPlayer
{
    public void click()
    {
        System.out.println("Smart Phone clicked a photo");
    }
    public void record()
    {
        System.out.println("Smart Phone recorded a video");
    }
    public void play()
    {
        System.out.println("Smart Phone played the music");
    }
    public void pause()
    {
        System.out.println("Smart Phone paused the music");
    }
    public void stop()
    {
        System.out.println("Smart Phone stopped the music");
    }
}
public class phoneInterfaceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SmartPhone s = new SmartPhone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
    }
    
}
