package com.anilemrah.dolap.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "productType")
public class ProductType {
	@DynamoDBHashKey(attributeName = "productTypeId")
	@DynamoDBAutoGeneratedKey
	private String id;
	@DynamoDBAttribute(attributeName = "productTypeName")
	private String productTypeName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	@Override
	public String toString() {
		return "ProductType [id=" + id + ", productTypeName=" + productTypeName + "]";
	}
}