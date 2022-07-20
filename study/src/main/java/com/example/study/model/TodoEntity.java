package com.example.study.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
@Data	
public class TodoEntity {
	private String id; //�� ������Ʈ�� ���̵�
	private String userId; //�� ������Ʈ�� ������ ������� ���̵�
	private String title; //Todo Ÿ��Ʋ(��:��ϱ�)
	private boolean done;	//true = todo�� �Ϸ��� ���(checked)
}


/*
 @Builder������̼��� ����ϸ� Builder Ŭ������ ���� �������� �ʰ� Builder ������ ����� ������Ʈ�� ������ �� �ִ�.
 TodoEntity todo = TodoEntity.builder
 				   ().id("t-10328373)
 				   .userId("developer")
 				   .title("Implement Model")
 				   .build();
 */


 /*
 @NoArgsConstructor ������̼��� ����ϸ� �Ű������� ���� �����ڸ� �������ش�
 public TodoEntity(){
 }
 */
  

 /*
 @AllArgsConstrcutor ������̼��� Ŭ������ ��� ��� ������ �Ű������� �޴� �����ڸ� �������ش�.
 
 public TodoEntity(String id,String userId, String title, boolean done){
 	super();
 	this.id = id;
 	this.userId = userId;
 	this.title = title;
 	this.done = done;
 }
 */
 

 /*
 @Data ������̼��� Ŭ���� ��� ������ Getter/Setter �޼��带 �������ش�.
 public String getId(){
 	return id;
 }
 public void setId(String id){
 	this.id = id;
 }
 public String getUserId(){
 	return userId;
 }
 public String setUserId(String userId){
 	this.userId = userId;
 }
 public String getTitle(){
 	return title;
 }
 public String setTitle(String title){
 	this.title = title;
 }
 public boolean isDone(){
 	return done;
 }
 public void setDone(boolean doen){
 	this.done = done;
 }
 */
