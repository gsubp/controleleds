int ledAmarelo = 11;
int ledVermelho = 9;
int ledVerde = 10;
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(ledAmarelo, OUTPUT);
  pinMode(ledVermelho, OUTPUT);
  pinMode(ledVerde, OUTPUT);  
}

void loop() {
  char read = Serial.read(); 
  switch(read){ 
    case 'a':{ligaDesliga(ledAmarelo);}break;
    case 'r':{ligaDesliga(ledVermelho);}break;
    case 'v':{ligaDesliga(ledVerde);}break;
  }
}

void ligaDesliga(int led){
  if(digitalRead(led))
    digitalWrite(led, LOW);
  else
    digitalWrite(led, HIGH);
}
