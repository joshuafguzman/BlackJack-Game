import java.util.ArrayList;

public class BlackJack{

private String nickName;

private final ArrayList<Card> hand;

public BlackJack(String name){
	this.nickName = name;
	hand = new ArrayList<Card>();
}	
public String getNickname(){
	return nickName;
}
public void addCard(Card aCard){
	hand.add(aCard);
	
}
public int getHandSum(){
	int totalSum = 0;
	for(Card countSum: hand){
		totalSum += countSum.getFace().getFaceValue();
	}
	return totalSum;
}
public String getHandAsString(boolean hideCard){
	StringBuilder sb = new StringBuilder();
	sb.append(nickName + "\'s current hand:");
	sb.append('\n');
	for(int i =0; i< hand.size(); i++){
		if(i==0 &hideCard){
			sb.append("[Hidden card]");
			sb.append('\n');
		} else{
			sb.append(hand.get(i));
			sb.append('\n');
		}
	}
	return sb.toString();
    }
}