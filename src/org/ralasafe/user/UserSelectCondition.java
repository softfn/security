package org.ralasafe.user;


/**
 *
 * @author back
 *
 */
public class UserSelectCondition {
	private WhereElement whereElement;
	private GroupPart groupPart;
	private OrderPart orderPart;
	
	public GroupPart getGroupPart() {
		return groupPart;
	}
	public OrderPart getOrderPart() {
		return orderPart;
	}
	public WhereElement getWhereElement() {
		return whereElement;
	}
	public void setGroupPart( GroupPart groupPart ) {
		this.groupPart = groupPart;
	}
	public void setOrderPart( OrderPart orderPart ) {
		this.orderPart = orderPart;
	}
	public void setWhereElement( WhereElement whereElement ) {
		this.whereElement = whereElement;
	}
}
