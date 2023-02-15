// C++ code
//
void setup()
{
  pinMode(7, OUTPUT);
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
}

void loop()
{
  digitalWrite(7, HIGH);
  delay(7000); // Wait for 1000 millisecond(s)
  digitalWrite(7, LOW);
  delay(2000); // Wait for 1000 millisecond(s)
  
   digitalWrite(12, HIGH);
  delay(3000); // Wait for 1000 millisecond(s)
  digitalWrite(12, LOW);
  delay(2000); // Wait for 1000 millisecond(s)
  
   digitalWrite(13, HIGH);
  delay(10000); // Wait for 1000 millisecond(s)
  digitalWrite(13, LOW);
  delay(2000); // Wait for 1000 millisecond(s)
}