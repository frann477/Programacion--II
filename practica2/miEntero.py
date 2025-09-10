class MiEntero:
    def __init__(self, v=0):
        self.valor = v

    def get_valor(self):
        return self.valor

    def es_par(self):
        if self.valor % 2 == 0:
            return True
        return False

    def es_impar(self):
        if self.valor % 2 != 0:
            return True
        return False

    def es_primo(self):
        cont = 0
        for i in range(1, self.valor + 1):
            if self.valor % i == 0:
                cont += 1
        if cont == 2:
            return True
        return False

    @staticmethod
    def es_par_int(x):
        if x % 2 == 0:
            return True
        else:
            return False

    @staticmethod
    def es_impar_int(x):
        if x % 2 != 0:
            return True
        else:
            return False

    @staticmethod
    def es_primo_int(x):
        cont = 0
        for i in range(1, x + 1):
            if x % i == 0:
                cont += 1
        if cont == 2:
            return True
        return False

    #  estáticos()
    @staticmethod
    def es_par_obj(x):
        if x.get_valor() % 2 == 0:
            return True
        else:
            return False

    @staticmethod
    def es_impar_obj(x):
        if x.get_valor() % 2 != 0:
            return True
        else:
            return False

    @staticmethod
    def es_primo_obj(x):
        cont = 0
        for i in range(1, x.get_valor() + 1):
            if x.get_valor() % i == 0:
                cont += 1
        if cont == 2:
            return True
        return False

    # metodos equals
    def equals(self, otro):
        if self.valor == otro.get_valor():
            print("son iguales!!!")
        else:
            print("NO son iguales!")

    # metodos parseInt
    @staticmethod
    def parse_int_char(chars):
        nuevo_numero = 0
        for c in chars:
            nuevo_numero = nuevo_numero * 10 + (ord(c) - ord('0'))
        return nuevo_numero

    @staticmethod
    def parse_int_str(x):
        nuevo_numero = 0
        for c in x:
            nuevo_numero = nuevo_numero * 10 + (ord(c) - ord('0'))
        return nuevo_numero



m1 = MiEntero(2)
print("m1 es par:", m1.es_par())
print("m1 es impar:", m1.es_impar())
print("m1 es primo:", m1.es_primo())

# metodosestaticos
print("3 es par:", MiEntero.es_par_int(3))
print("3 es impar:", MiEntero.es_impar_int(3))
print("3 es primo:", MiEntero.es_primo_int(3))

# estáticos ()
m2 = MiEntero(7)
print("m2 es par:", MiEntero.es_par_obj(m2))
print("m2 es impar:", MiEntero.es_impar_obj(m2))
print("m2 es primo:", MiEntero.es_primo_obj(m2))

print("---------metodo equals------------")
m3 = MiEntero(5)
m4 = MiEntero(5)
m3.equals(m4)

print("---------metodos parseInt---------")
v = ['1', '4', '3']
print("parseInt:", MiEntero.parse_int_char(v))

cadena = "123321"
print("parseInt:", MiEntero.parse_int_str(cadena))
