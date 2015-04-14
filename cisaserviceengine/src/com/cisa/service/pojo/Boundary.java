package com.cisa.service.pojo;

import java.io.Serializable;

public class Boundary implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8315930537048195455L;
	float left;
	float right;
	float top;
	float bottom;

	
	public Boundary() {
		// TODO Auto-generated constructor stub
	}
	
	public Boundary(float left, float right, float top, float bottom) {
		super();
		this.left = left;
		this.right = right;
		this.top = top;
		this.bottom = bottom;
	}

	public float getLeft() {
		return left;
	}

	public void setLeft(float left) {
		this.left = left;
	}

	public float getRight() {
		return right;
	}

	public void setRight(float right) {
		this.right = right;
	}

	public float getTop() {
		return top;
	}

	public void setTop(float top) {
		this.top = top;
	}

	public float getBottom() {
		return bottom;
	}

	public void setBottom(float bottom) {
		this.bottom = bottom;
	}
}