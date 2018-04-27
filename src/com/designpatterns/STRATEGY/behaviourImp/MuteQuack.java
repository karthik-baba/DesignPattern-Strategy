package com.designpatterns.STRATEGY.behaviourImp;

import com.designpatterns.STRATEGY.behaviours.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<<SILENCE>>");
	}

}
