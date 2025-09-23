import pyfiglet
import time

# Texto que você quer
texto = "Nassau Strike"

# Cria o figlet no estilo "speed"
figlet = pyfiglet.Figlet(font="speed")
figlet_text = figlet.renderText(texto)

# Printando caractere por caractere
for char in figlet_text:
    print(char, end='', flush=True)
    