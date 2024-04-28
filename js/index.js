import { createPublicKey } from "crypto";

const pemPublicKey = `-----BEGIN PUBLIC KEY-----
MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKZvGkUZbS5SXfQwBwHsZmj40Etco602mbMMpuieA7djbZPYO3aiBKYi/ecrgHc472p+SYFgPnbzgOwesS14b5cCAwEAAQ==
-----END PUBLIC KEY-----`;
const publicKey = createPublicKey(pemPublicKey);
console.log(publicKey.export({ format: "jwk" }));
