package myPack;
public interface Stack 
{
    void init();
    void push(int x);
    int pop();
    int peek();
    int size();
    void display();
    void underflow();
    void overflow();
}
