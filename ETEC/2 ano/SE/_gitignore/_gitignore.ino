
// C++ code
//
int valor = 0;

void setup()
{
  pinMode(A3, INPUT);
  Serial.begin(9600);
  pinMode(10, OUTPUT); //Vermelhho
  pinMode(7, OUTPUT); //Cinza
  pinMode(4, OUTPUT); //Verde
}

void loop()
{
  valor = analogRead(A3);
  Serial.println(valor);
  if (valor <=100 ) {
    digitalWrite(10, LOW);
    digitalWrite(7, LOW);
    digitalWrite(4, LOW);
  }
  
  if (valor > 300) {
    digitalWrite(10, HIGH);
    digitalWrite(7, LOW);
    digitalWrite(4, LOW);
  }
  if (valor > 500) {
     digitalWrite(7, HIGH);
     digitalWrite(4, LOW);
     digitalWrite(10, HIGH);  
    }
   if (valor > 950) {
     digitalWrite(4, HIGH);
     digitalWrite(10, HIGH);
     digitalWrite(7, HIGH);
  }
  delay(10); // Delay a little bit to improve simulation performance
}
