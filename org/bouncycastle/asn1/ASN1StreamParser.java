package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ASN1StreamParser {
    public final InputStream a;
    private final int b;
    private final byte[][] c;

    public ASN1StreamParser(InputStream inputStream, int i, byte[][] bArr) {
        this.a = inputStream;
        this.b = i;
        this.c = bArr;
    }

    final ASN1Encodable a(int i) throws IOException {
        boolean z;
        InputStream inputStream = this.a;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).a(false);
        }
        int iB = ASN1InputStream.b(inputStream, i);
        int i2 = this.b;
        if (iB == 3 || iB == 4 || iB == 16 || iB == 17) {
            z = true;
        } else if (iB == 8) {
            iB = 8;
            z = true;
        } else {
            z = false;
        }
        int iA = ASN1InputStream.a(inputStream, i2, z);
        if (iA < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            int i3 = i & 192;
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(inputStream, i2), i2, this.c);
            if (i3 != 0) {
                return new BERTaggedObjectParser(i3, iB, aSN1StreamParser);
            }
            if (iB == 3) {
                return new BERBitStringParser(aSN1StreamParser);
            }
            if (iB == 4) {
                return new BEROctetStringParser(aSN1StreamParser);
            }
            if (iB == 8) {
                return new DERExternalParser(aSN1StreamParser);
            }
            if (iB == 16) {
                return new BERSequenceParser(aSN1StreamParser);
            }
            if (iB == 17) {
                return new BERSetParser(aSN1StreamParser);
            }
            throw new ASN1Exception("unknown BER object encountered: 0x".concat(String.valueOf(Integer.toHexString(iB))));
        }
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(inputStream, iA, i2);
        if ((i & 224) == 0) {
            if (iB == 3) {
                return new DLBitStringParser(definiteLengthInputStream);
            }
            if (iB == 4) {
                return new DEROctetStringParser(definiteLengthInputStream);
            }
            if (iB == 8) {
                throw new ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
            }
            if (iB == 16) {
                throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (iB == 17) {
                throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return ASN1InputStream.e(iB, definiteLengthInputStream, this.c);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        }
        int i4 = i & 192;
        ASN1StreamParser aSN1StreamParser2 = new ASN1StreamParser(definiteLengthInputStream, definiteLengthInputStream.d, this.c);
        if (i4 != 0) {
            return new DLTaggedObjectParser(i4, iB, (i & 32) != 0, aSN1StreamParser2);
        }
        if (iB == 3) {
            return new BERBitStringParser(aSN1StreamParser2);
        }
        if (iB == 4) {
            return new BEROctetStringParser(aSN1StreamParser2);
        }
        if (iB == 8) {
            return new DERExternalParser(aSN1StreamParser2);
        }
        if (iB == 16) {
            return new DLSequenceParser(aSN1StreamParser2);
        }
        if (iB == 17) {
            return new DLSetParser(aSN1StreamParser2);
        }
        throw new ASN1Exception("unknown DL object encountered: 0x".concat(String.valueOf(Integer.toHexString(iB))));
    }

    public final ASN1Encodable b() throws IOException {
        int i = this.a.read();
        if (i < 0) {
            return null;
        }
        return a(i);
    }

    final ASN1EncodableVector c() throws IOException {
        InputStream inputStream = this.a;
        int i = inputStream.read();
        if (i < 0) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            ASN1Encodable aSN1EncodableA = a(i);
            if (aSN1EncodableA instanceof InMemoryRepresentable) {
                aSN1EncodableVector.b(((InMemoryRepresentable) aSN1EncodableA).j());
            } else {
                aSN1EncodableVector.b(aSN1EncodableA.p());
            }
            i = inputStream.read();
        } while (i >= 0);
        return aSN1EncodableVector;
    }

    final ASN1Primitive d(int i, int i2) throws IOException {
        ASN1EncodableVector aSN1EncodableVectorC = c();
        int i3 = aSN1EncodableVectorC.c;
        if (i3 == 1) {
            return new BERTaggedObject(3, i, i2, aSN1EncodableVectorC.a(0));
        }
        return new BERTaggedObject(4, i, i2, i3 <= 0 ? BERFactory.a : new BERSequence(aSN1EncodableVectorC));
    }
}
