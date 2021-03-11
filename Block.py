# -*- coding: utf-8 -*-
"""

@author: barengific
"""

#block id
#hash of previous block

#transaction id
#transaction fee
#transaction amount/value

#wallet id from
#wallet id to
#-wallet: private key to sign, public key is verify sign is valid


#status: true || false

#send time && receive time --- fee should be charged based on how long hashing takes place

#total hash size

#total block size || in bytes 

#value when started  transaction
#value when finished transaction

#index/height

class Block:

    def __init__(self, index, chash, phash, tss, tse, datas):
        self.index = index
        self.chash = chash
        self.phash = phash
        self.tss = tss
        self.tse = tse
        self.datas = datas

    # Instance method
    def calcHast(self):
        return f"{self.name} is {self.age} years old"

    # Another instance method
    def speak(self, sound):
        return f"{self.name} says {sound}"
