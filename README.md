# TDD_Day1_Homework

## 需求：
- 該11筆資料，如果要3筆成一組，取得Cost的總和的話，預期結果是 6,15, 24, 21
- 該11筆資料，如果是4筆一組，取得 Revenue 總和的話，預期結果會是 50,66,60
- 筆數輸入負數，預期會拋 ArgumentException
- 尋找的欄位若不存在，預期會拋 ArgumentException
- 筆數若輸入為0, 則傳回0
- 未來可能會新增其他欄位
- 希望這個API可以給其他 domain entity 用，例如 Employee

| Id   | Cost	| Revenue	| SellPrice |
|------|-----|-----|-----|
| 1	|1|	11|	21|
| 2	|2	|12|	22|
| 3	|3|	13|	23|
| 4	|4	|14	|24|
| 5	|5|	15|	25|
| 6	|6|	16|	26|
| 7	|7|	17|	27|
| 8	|8|18|	28|
| 9	|9|	19|	29|
| 10	|10|	20|	30|
| 11	|11|	21|	31|

## Sample
-	3筆一組，取Cost總和	= 6,15,24,21
-	4筆一組，取Revenue總和	= 50,66,60

## 題目解說
1. 來源可以是「任何型別的集合」
2. 可以任意決定幾筆一組
3. 回傳每一組 Σf(x) 的集合 - Σ結果型別可直接用int

## Run unit tests
`./gradlew test`

## Java testing libs
- JUnit - junit:junit:4.12
- (not used) Mockito - org.mockito:mockito-core:1.10.19
- Hamcrest - org.hamcrest:hamcrest-library:1.3

## Source code
- [Test code](/app/src/test/java/io/twincatstudio/tdd_dayonehomework/ProductCalculatorTest.java)
- [Production code](/app/src/main/java/io/twincatstudio/tdd_dayonehomework/)
