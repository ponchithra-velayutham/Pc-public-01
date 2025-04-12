🧩 Problem Statement:
You are given a list representing a floor, where:

1 indicates a tile that needs to be painted

0 indicates a tile that does not need to be painted

The painter can paint consecutive tiles marked as 1 in a single move. However, if there's a 0 in between, the painter needs to start a new move to continue painting the next group of 1s.

Your task is to determine the minimum number of moves required to paint all the tiles that need to be painted.

📥 Input:
A list of integers containing only 0s and 1s.
Example:


[1, 1, 0, 1, 0, 0, 1, 1, 1]
📤 Output:
An integer representing the minimum number of moves the painter makes.



package com.example.selenium;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac  {
	


	public static void main(String[] args) {
		
		int input[] = {1,1,0,1,0,1,1};
		
		int moves = 0,i;
		for(i=0;i<input.length;i++)
		{
			if(input[i]==1)
			{
				moves = moves + 1;
				while(i<input.length && input[i] == 1)
				{
					i = i +1;
				}
			}
			else
			{
				i = i +1;
			}
		}
		System.out.print(moves);
	
	}

}
