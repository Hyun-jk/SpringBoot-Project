package com.example.study.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//Http�������� ����� DTO�̴�.

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDTO<T> {
	private String error;
	//�� ������Ʈ�� ��� Todo�� �ϳ��� ��ȯ�ϴ� ��캸�� ����Ʈ�� ��ȯ�ϱ� ������ �����͸� ����Ʈ�� ��ȯ�ϵ��� ��.
	private List<T> data; 
}
