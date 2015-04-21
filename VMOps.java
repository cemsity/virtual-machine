public class VMOps// ALL PSUEDOCODE
{
 IntStack s = new IntStack(20);
 public void CONST(int n)
 {
   s.push(n);
 }// end CONST

LOAD(int a) { d = data[a]; push(d);}//end LOAD

STO(int a) {d = pop(); data[a] = d;}//end STO

ADD() {y = pop()
x = pop()
d = x + y
push(d)
}//end ADD

SUB()
{
y = pop()
x = pop()
d = x - y
push(d)
}//end SUB

MUL()
{
y = pop()
x = pop()
d = x * y
push(d)
}// end MUL

DIV()
{
y = pop()
x = pop()
d = x / y
push(d)


}//end DIV

EQL() 
{
y = pop()
x = pop()
if x == y push(1) 
else push(0)
}//end EQL

LSS() 
{
y = pop()
x = pop()
if x < y push(1) else push(0)
}//end LSS

GTR()
{
y = pop()
x = pop()
if x > y push(1) else push(0)
}//end LSS

JMP(A) 
{
   pc = a
}//end JMP

FJMP(a)
{
   if (pop() == 0) pc = a
}//end FJMP

READ
{
d = nextInt(); push(d)
}//end READ

WRITE
{
println( pop() )
}//end WRITE

CALL(a)
{
push(pc + 1); pc = a
}//end CALL

RET
{
   pc = pop();
}//end RET

HALT
{
CATCH FIRE
}

}//end class



