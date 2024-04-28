from Crypto.PublicKey import RSA


public_key_pem = '''-----BEGIN PUBLIC KEY-----
MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKZvGkUZbS5SXfQwBwHsZmj40Etco602mbMMpuieA7djbZPYO3aiBKYi/ecrgHc472p+SYFgPnbzgOwesS14b5cCAwEAAQ==
-----END PUBLIC KEY-----'''


# private_key = RSA.importKey(private_key_pem)
# print("private key components:")
# print("modulus:", private_key.n)
# print("decryption key:", private_key.d, "\n")

public_key = RSA.importKey(public_key_pem)
print("public key components:")
print("modulus:", public_key.n)
print(public_key.d)
print("encryption key:", public_key.e)
