/**
 * Cannot make a static reference to the non-static field error
 *  static으로 선언되지 않은 메서드와 필드를 참조할 수 없어서 발생하는 오류이다.
 *  static 멤버의 컴파일 시점에서는 static이 아닌 메서드나 필드는 정의 되지 않았다.
 * 
 *  오류 해결?
 *  방법 1) 모든 메서드와 필드를 static 멤버로 바꾸기
 *  방법 2) 클래스 객체를 직접 생성해서 접근하기 ex) 객체.메소드() or 객체.필드 형식으로 접근
 * 
 * static 변수 특징
 * 클래스 멤버이다 // 클래스 변수이다
 * 객체를 생성하지 않고도 static 자원에 접근 가능하다
 * static 메서드와 필드는 static 메모리 영역에 존재하므로 객체가 생성되기 이전에 이미 할당되어 있다
 *  그렇기 때문에, 객체 생성 없이도 바로 접근이 가능하고.. 메모리에 한번 할당되면 프로그램이 종료되는 시점에 해제된다
 * 
 * 메모리 영역(static vs heap 영역)
 * static 영역 메모리? 1. 클래스들이 모여 있다 2. GC가 관리하지 않아 static변수는 프로그램이 종료될 때까지 
 * 메모리 할당된 채로 존재하므로 시스템 장애 초래 가능 3. 자주 사용되면 메모리관리에 좋지 않다.
 * 
 * heap 영역 메모리? 1. 객체가 모여있다(new 연산을 통해 만들어진것들) 2.GC가 관리함(Garbage Collctor에 의해 수시로 관리받음) 
 * */

 /*구구단 출력 하기*/
 public class error{
    public void main(String[] args){
     int [][] arr;
     arr = new int[8][9];
     
        for(int i = 0; i<arr.length;i++){
            System.out.println("times table:" + i+1 );
            for(int j =1 ; j <= arr[0].length; j++){
                System.out.print((i+1) + "X " + j + (i+1)*j+ " ");
            }
        }
     
    }
 }