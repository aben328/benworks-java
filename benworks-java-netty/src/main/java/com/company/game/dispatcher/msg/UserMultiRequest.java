package com.company.game.dispatcher.msg;

import com.company.game.dispatcher.annotation.UserMsgAndExecAnnotation;

/**
 * 乘法请求消息类
 * @author Roc
 * @date 2015年10月15日上午10:03:57
 */
@UserMsgAndExecAnnotation(msgType = MsgType.MULTI)
public class UserMultiRequest extends RequestMsgBase {

	private double leftNumber;

	private double RightNumber;

	public UserMultiRequest() {
		super(MsgType.MULTI);
	}

	public double getLeftNumber() {
		return leftNumber;
	}

	public void setLeftNumber(double leftNumber) {
		this.leftNumber = leftNumber;
	}

	public double getRightNumber() {
		return RightNumber;
	}

	public void setRightNumber(double rightNumber) {
		RightNumber = rightNumber;
	}
}