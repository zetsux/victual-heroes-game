package vh.helper;

public class LevelBuilder {

	public static int[][] getLevel(){
		
		// 2D int Array which stores Level Data
		
		int [][] level = {
				
				// 24 X 18
				
		/*1*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*2*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*3*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*4*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*5*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*6*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*7*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*8*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*9*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*10*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*11*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*12*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*13*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*14*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*15*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*16*/		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		/*17*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		/*18*/		{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
		
		};
		
		return level;
	}
	
	public static int[][] getBackLayer(){
		
		int [][] backLayer = {
		
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
        {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
		
		};
        return backLayer;
		
	}
	
	public static int[][] getEnemyPath(){
		
		int[][] enemyPath = {
			
			{92, 93, 93, 94, 28, 92, 93, 93, 93, 94, 28, 28, 28, 28, 92, 93, 93, 93, 93, 94, 28, 28, 28, 28, 28, 28, 28, 92, 93, 93, 93, 93, 93, 93, 93, 94, 28, 28, 28, 28, 28, 28, 28, 28, 92, 93, 93, 93, 93, 94, 28, 28, 28, 28, 28, 28, 150, 151, 151, 151, 151, 151, 151, 151},
			{262, 263, 264, 265, 28, 262, 263, 263, 263, 265, 28, 28, 28, 28, 262, 263, 263, 263, 263, 265, 28, 28, 28, 28, 28, 28, 28, 262, 264, 264, 264, 264, 264, 264, 264, 265, 28, 28, 28, 28, 28, 28, 28, 28, 262, 264, 264, 264, 264, 265, 28, 28, 28, 28, 28, 28, 150, 151, 151, 151, 151, 151, 151, 151},
			{262, 69, 264, 265, 28, 262, 263, 70, 263, 265, 481, 482, 481, 482, 262, 263, 69, 70, 263, 265, 28, 28, 28, 28, 28, 28, 28, 262, 264, 329, 263, 329, 264, 264, 9, 265, 481, 482, 481, 482, 481, 482, 481, 482, 262, 264, 9, 9, 264, 265, 481, 482, 481, 482, 481, 482, 150, 151, 151, 151, 151, 151, 151, 151},
			{291, 98, 293, 294, 28, 291, 292, 99, 292, 294, 510, 511, 510, 511, 291, 292, 98, 99, 292, 294, 28, 28, 28, 28, 28, 28, 28, 291, 292, 292, 292, 292, 292, 292, 38, 294, 510, 511, 510, 511, 510, 511, 510, 511, 291, 292, 38, 38, 292, 294, 510, 511, 510, 511, 510, 511, 179, 180, 180, 180, 180, 180, 180, 180},
			{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 88, 89, 89, 89, 89, 89, 89, 89},
			{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 88, 89, 89, 89, 89, 89, 89, 89},
			{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 88, 154, 155, 89, 89, 89, 89, 89},
			{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 88, 89, 89, 89, 89, 89, 89, 89},
			{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 88, 89, 89, 89, 89, 154, 155, 89},
			{24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 26, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 22, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 26, 28, 28, 28, 88, 89, 89, 89, 89, 89, 89, 89},
			{82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 84, 28, 28, 28, 88, 89, 89, 89, 89, 89, 89, 89},
			{140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 82, 82, 84, 28, 28, 28, 28, 481, 482, 28, 481, 482, 28, 481, 482, 28, 481, 482, 28, 28, 28, 28, 80, 82, 82, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 82, 82, 84, 28, 28, 28, 88, 89, 89, 10, 11, 89, 89, 89},
			{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 510, 511, 28, 510, 511, 28, 510, 511, 28, 510, 511, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 88, 89, 89, 39, 40, 89, 89, 89},
			{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
			{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 353, 354, 354, 354, 354, 354, 354, 354, 354, 354, 355, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
			{459, 459, 459, 459, 459, 459, 460, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 382, 504, 505, 506, 383, 383, 383, 383, 383, 383, 384, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 22, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 82, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 382, 383, 383, 383, 383, 383, 383, 383, 383, 383, 384, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 382, 504, 505, 506, 383, 383, 383, 383, 383, 383, 384, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 82, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 142, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 411, 412, 412, 412, 412, 412, 412, 412, 412, 412, 413, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 585, 586, 586, 586, 586, 586, 586, 586, 586, 586, 587, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 614, 615, 615, 615, 615, 615, 615, 615, 615, 615, 616, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 614, 615, 615, 615, 615, 615, 615, 615, 615, 615, 616, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 614, 615, 615, 615, 615, 615, 615, 615, 615, 615, 616, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 614, 615, 615, 615, 615, 615, 615, 615, 615, 615, 616, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 643, 644, 644, 644, 644, 644, 644, 644, 644, 644, 645, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 121, 122, 122, 122, 122},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 150, 151, 151, 151, 151},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 179, 180, 180, 180, 180},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 585, 586, 586, 586, 586},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 614, 534, 534, 534, 534},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 82, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 82, 82, 84, 28, 28, 28, 80, 82, 82, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 614, 534, 534, 534, 534},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 80, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 84, 28, 28, 28, 80, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 614, 615, 615, 615, 615},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 138, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 142, 28, 28, 28, 138, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 614, 615, 9, 9, 615},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 643, 644, 38, 38, 644},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
			{270, 270, 270, 270, 270, 270, 270, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28}
				
		};
	
		return enemyPath;
	}
	
	public static int[][] getTowerPath(){
		

		int[][] towerPath = {
			
				{92, 93, 93, 94, 28, 92, 93, 93, 93, 94, 444, 445, 444, 445, 92, 93, 93, 93, 93, 94, 28, 28, 504, 505, 506, 28, 28, 92, 93, 93, 93, 93, 93, 93, 93, 94, 444, 445, 444, 445, 444, 445, 444, 445, 92, 93, 93, 93, 93, 94, 444, 445, 444, 445, 444, 445, 150, 151, 151, 151, 151, 151, 151, 151},
				{262, 263, 264, 265, 28, 262, 263, 263, 263, 265, 473, 474, 473, 474, 262, 263, 263, 263, 263, 265, 28, 169, 28, 28, 28, 170, 28, 262, 264, 264, 264, 264, 264, 264, 264, 265, 473, 474, 473, 474, 473, 474, 473, 474, 262, 264, 264, 264, 264, 265, 473, 474, 473, 474, 473, 474, 150, 151, 151, 151, 151, 151, 151, 151},
				{262, 69, 264, 265, 28, 262, 263, 70, 263, 265, 502, 503, 502, 503, 262, 263, 69, 70, 263, 265, 28, 198, 28, 28, 28, 199, 28, 262, 264, 329, 263, 329, 264, 264, 9, 265, 502, 503, 502, 503, 502, 503, 502, 503, 262, 264, 9, 9, 264, 265, 502, 503, 502, 503, 502, 503, 150, 151, 151, 151, 151, 151, 151, 151},
				{291, 98, 478, 294, 28, 291, 292, 99, 292, 294, 510, 511, 510, 511, 291, 292, 98, 99, 292, 294, 28, 28, 28, 28, 28, 28, 28, 478, 479, 480, 292, 478, 479, 480, 38, 294, 510, 511, 510, 511, 510, 511, 510, 511, 291, 292, 38, 38, 292, 294, 510, 511, 510, 511, 510, 511, 179, 180, 180, 180, 180, 180, 180, 180},
				{28, 28, 507, 506, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 507, 508, 509, 28, 507, 508, 509, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 88, 89, 89, 89, 89, 89, 89, 89},
				{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 88, 89, 89, 89, 89, 89, 89, 89},
				{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 88, 154, 155, 89, 89, 89, 89, 89},
				{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 88, 89, 89, 89, 89, 89, 89, 89},
				{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 88, 89, 89, 89, 89, 154, 155, 89},
				{24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 26, 28, 28, 28, 28, 444, 445, 28, 444, 445, 28, 444, 445, 28, 444, 445, 28, 28, 28, 28, 22, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 26, 28, 28, 28, 88, 89, 89, 89, 89, 89, 89, 89},
				{82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 84, 28, 28, 28, 28, 473, 474, 28, 473, 474, 28, 473, 474, 28, 473, 474, 28, 28, 28, 28, 80, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 84, 28, 28, 28, 88, 89, 89, 89, 89, 89, 89, 89},
				{140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 82, 82, 84, 28, 28, 28, 28, 502, 503, 28, 502, 503, 28, 502, 503, 28, 502, 503, 28, 28, 28, 28, 80, 82, 82, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 82, 82, 84, 28, 28, 28, 88, 89, 89, 10, 11, 89, 89, 89},
				{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 510, 511, 28, 510, 511, 28, 510, 511, 28, 510, 511, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 478, 479, 480, 39, 40, 478, 479, 480},
				{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 535, 536, 537, 538, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 507, 508, 509, 28, 28, 507, 508, 509},
				{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 353, 478, 354, 354, 354, 354, 354, 564, 565, 566, 567, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
				{444, 445, 444, 445, 444, 445, 460, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 382, 507, 506, 383, 383, 383, 480, 593, 594, 595, 596, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 22, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 82, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
				{473, 474, 473, 474, 473, 474, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 382, 383, 480, 383, 383, 504, 509, 622, 623, 624, 625, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
				{502, 503, 502, 503, 502, 503, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 382, 504, 509, 383, 383, 383, 383, 651, 652, 653, 654, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 82, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 142, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
				{270, 270, 270, 270, 270, 270, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 411, 412, 412, 412, 412, 412, 412, 412, 412, 412, 413, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
				{444, 445, 444, 445, 270, 270, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 183, 184, 184, 184, 184, 184, 184, 184, 184, 184, 185, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
				{473, 474, 473, 474, 270, 301, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 560, 615, 615, 615, 615, 615, 615, 615, 615, 615, 563, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
				{502, 503, 502, 503, 270, 270, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 589, 590, 590, 590, 590, 590, 590, 590, 590, 591, 592, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 458, 459, 459, 459, 459, 459, 459, 459, 459, 459, 459, 459, 459, 459, 459, 459, 459, 459, 459, 460},
				{270, 270, 270, 270, 270, 270, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 614, 615, 615, 615, 615, 615, 615, 615, 619, 620, 621, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 486, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270},
				{270, 270, 444, 445, 444, 445, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 614, 615, 615, 615, 10, 11, 615, 619, 648, 649, 616, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 486, 270, 272, 270, 270, 301, 270, 301, 270, 270, 272, 270, 270, 301, 270, 301, 270, 270, 272, 270},
				{270, 270, 473, 474, 473, 474, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 643, 644, 644, 644, 39, 40, 619, 648, 649, 644, 645, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 486, 301, 270, 301, 270, 270, 272, 270, 270, 301, 270, 301, 270, 270, 272, 270, 270, 301, 270, 301},
				{301, 270, 502, 503, 502, 503, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 478, 479, 480, 28, 28, 28, 648, 649, 478, 479, 480, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 486, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 270, 121, 122, 122, 122, 122},
				{270, 270, 270, 270, 270, 270, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 507, 508, 509, 28, 28, 28, 28, 28, 507, 508, 509, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 487, 488, 488, 488, 488, 488, 488, 488, 488, 488, 488, 488, 488, 488, 489, 150, 151, 151, 151, 151},
				{444, 445, 444, 445, 270, 270, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 179, 180, 180, 180, 180},
				{473, 474, 473, 474, 270, 301, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 585, 586, 586, 586, 586},
				{502, 503, 502, 503, 270, 270, 457, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 80, 82, 84, 28, 28, 28, 80, 82, 84, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 614, 534, 534, 534, 534},
				{270, 270, 270, 270, 270, 270, 457, 28, 28, 28, 80, 82, 82, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 82, 82, 84, 28, 28, 28, 80, 82, 82, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 614, 534, 534, 534, 534},
				{270, 270, 444, 445, 444, 445, 457, 28, 28, 28, 80, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 84, 28, 28, 28, 80, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 82, 614, 615, 615, 615, 615},
				{270, 270, 473, 474, 473, 474, 457, 28, 28, 28, 138, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 142, 28, 28, 28, 138, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 140, 614, 615, 9, 9, 615},
				{301, 270, 502, 503, 502, 503, 457, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 643, 644, 38, 38, 644},
				{270, 270, 270, 270, 270, 270, 457, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
				{270, 270, 270, 270, 270, 270, 457, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28}
				
		};
	
		return towerPath;
	}
}