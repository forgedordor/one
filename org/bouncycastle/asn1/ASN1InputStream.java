package org.bouncycastle.asn1;

import defpackage.a;
import defpackage.ffwk;
import defpackage.ffxd;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ASN1InputStream extends FilterInputStream implements BERTags, InputStreamRetargetInterface {
    public final int a;
    private final boolean b;
    private final byte[][] c;

    public ASN1InputStream(InputStream inputStream) {
        this(inputStream, StreamUtil.a(inputStream));
    }

    static int a(InputStream inputStream, int i, boolean z) throws IOException {
        int i2 = inputStream.read();
        if ((i2 >>> 7) == 0) {
            return i2;
        }
        if (i2 == 128) {
            return -1;
        }
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i2 == 255) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i3 = i2 & 127;
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i4 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i4 = (i4 << 8) + i6;
            i5++;
        } while (i5 < i3);
        if (i4 < i || z) {
            return i4;
        }
        throw new IOException(a.s(i, i4, "corrupted stream - out of bounds length found: ", " >= "));
    }

    static int b(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if (i3 < 31) {
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i4 = i3 & 127;
        if (i4 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((i3 & 128) != 0) {
            if ((i4 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            int i5 = i4 << 7;
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i4 = i5 | (i6 & 127);
            i3 = i6;
        }
        return i4;
    }

    static ASN1Primitive e(int i, DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws IOException {
        try {
            switch (i) {
                case 1:
                    return ASN1Boolean.e(g(definiteLengthInputStream, bArr));
                case 2:
                    return new ASN1Integer(definiteLengthInputStream.a());
                case 3:
                    return ASN1BitString.h(definiteLengthInputStream.a());
                case 4:
                    return new DEROctetString(definiteLengthInputStream.a());
                case 5:
                    if (definiteLengthInputStream.a().length == 0) {
                        return DERNull.a;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    ASN1ObjectIdentifier.j(definiteLengthInputStream.b);
                    return ASN1ObjectIdentifier.g(g(definiteLengthInputStream, bArr), true);
                case 7:
                    return new ASN1ObjectDescriptor(new DERGraphicString(definiteLengthInputStream.a()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException(a.e(i, "unknown tag ", " encountered"));
                case 10:
                    return ASN1Enumerated.g(g(definiteLengthInputStream, bArr), true);
                case 12:
                    return new DERUTF8String(definiteLengthInputStream.a());
                case 13:
                    ASN1RelativeOID.f(definiteLengthInputStream.b);
                    byte[] bArrG = g(definiteLengthInputStream, bArr);
                    ASN1RelativeOID.f(bArrG.length);
                    ASN1RelativeOID aSN1RelativeOID = (ASN1RelativeOID) ASN1RelativeOID.a.get(new ASN1ObjectIdentifier.OidHandle(bArrG));
                    if (aSN1RelativeOID != null) {
                        return aSN1RelativeOID;
                    }
                    if (ASN1RelativeOID.i(bArrG)) {
                        return new ASN1RelativeOID(ffwk.c(bArrG));
                    }
                    throw new IllegalArgumentException("invalid relative OID contents");
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException(a.e(i, "unsupported tag ", " encountered"));
                case 18:
                    return new DERNumericString(definiteLengthInputStream.a());
                case 19:
                    return new DERPrintableString(definiteLengthInputStream.a());
                case 20:
                    return new DERT61String(definiteLengthInputStream.a());
                case 21:
                    return new DERVideotexString(definiteLengthInputStream.a());
                case 22:
                    return new DERIA5String(definiteLengthInputStream.a());
                case 23:
                    return new ASN1UTCTime(definiteLengthInputStream.a());
                case 24:
                    return new ASN1GeneralizedTime(definiteLengthInputStream.a());
                case 25:
                    return new DERGraphicString(definiteLengthInputStream.a());
                case 26:
                    return new DERVisibleString(definiteLengthInputStream.a());
                case 27:
                    return new DERGeneralString(definiteLengthInputStream.a());
                case 28:
                    byte[] bArrA = definiteLengthInputStream.a();
                    int i2 = ASN1UniversalString.b;
                    return new DERUniversalString(bArrA);
                case 30:
                    int i3 = definiteLengthInputStream.b;
                    if ((i3 & 1) != 0) {
                        throw new IOException("malformed BMPString encoding encountered");
                    }
                    int i4 = i3 / 2;
                    char[] cArr = new char[i4];
                    byte[] bArr2 = new byte[8];
                    int i5 = 0;
                    int i6 = 0;
                    while (i3 >= 8) {
                        if (ffxd.b(definiteLengthInputStream, bArr2, 8) != 8) {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                        cArr[i6] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
                        cArr[i6 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
                        cArr[i6 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
                        cArr[i6 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
                        i3 -= 8;
                        i6 += 4;
                    }
                    if (i3 > 0) {
                        if (ffxd.b(definiteLengthInputStream, bArr2, i3) != i3) {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                        do {
                            int i7 = i5 + 1;
                            int i8 = bArr2[i5] << 8;
                            i5 += 2;
                            cArr[i6] = (char) ((bArr2[i7] & 255) | i8);
                            i6++;
                        } while (i5 < i3);
                    }
                    if (definiteLengthInputStream.b == 0 && i4 == i6) {
                        return new DERBMPString(cArr);
                    }
                    throw new IllegalStateException();
            }
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        } catch (IllegalStateException e2) {
            throw new ASN1Exception(e2.getMessage(), e2);
        }
    }

    private static byte[] g(DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws IOException {
        int i = definiteLengthInputStream.b;
        int length = bArr.length;
        if (i >= 11) {
            return definiteLengthInputStream.a();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        int length2 = bArr2.length;
        if (i != length2) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i == 0) {
            return bArr2;
        }
        int i2 = definiteLengthInputStream.d;
        if (i >= i2) {
            throw new IOException(a.s(i2, i, "corrupted stream - out of bounds length found: ", " >= "));
        }
        int iB = i - ffxd.b(definiteLengthInputStream.c, bArr2, length2);
        definiteLengthInputStream.b = iB;
        if (iB == 0) {
            definiteLengthInputStream.b();
            return bArr2;
        }
        throw new EOFException("DEF length " + definiteLengthInputStream.a + " object truncated by " + definiteLengthInputStream.b);
    }

    final ASN1EncodableVector c() {
        ASN1Primitive aSN1PrimitiveF = f();
        if (aSN1PrimitiveF == null) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            aSN1EncodableVector.b(aSN1PrimitiveF);
            aSN1PrimitiveF = f();
        } while (aSN1PrimitiveF != null);
        return aSN1EncodableVector;
    }

    final ASN1EncodableVector d(DefiniteLengthInputStream definiteLengthInputStream) {
        int i = definiteLengthInputStream.b;
        return i <= 0 ? new ASN1EncodableVector(0) : new ASN1InputStream(definiteLengthInputStream, i, this.b, this.c).c();
    }

    public final ASN1Primitive f() {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iB = b(this, i);
        int i2 = this.a;
        int i3 = 0;
        int iA = a(this, i2, false);
        if (iA < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            int i4 = i & 192;
            int i5 = this.a;
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this, i5), i5, this.c);
            if (i4 != 0) {
                return aSN1StreamParser.d(i4, iB);
            }
            if (iB == 3) {
                return BERBitStringParser.a(aSN1StreamParser);
            }
            if (iB == 4) {
                return BEROctetStringParser.a(aSN1StreamParser);
            }
            if (iB == 8) {
                return DERExternalParser.a(aSN1StreamParser);
            }
            if (iB == 16) {
                return BERSequenceParser.a(aSN1StreamParser);
            }
            if (iB == 17) {
                return BERSetParser.a(aSN1StreamParser);
            }
            throw new IOException("unknown BER object encountered");
        }
        try {
            DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this, iA, i2);
            if ((i & 224) == 0) {
                return e(iB, definiteLengthInputStream, this.c);
            }
            int i6 = i & 192;
            if (i6 != 0) {
                return (i & 32) == 0 ? ASN1TaggedObject.h(i6, iB, definiteLengthInputStream.a()) : ASN1TaggedObject.g(i6, iB, d(definiteLengthInputStream));
            }
            if (iB == 3) {
                ASN1EncodableVector aSN1EncodableVectorD = d(definiteLengthInputStream);
                int i7 = aSN1EncodableVectorD.c;
                ASN1BitString[] aSN1BitStringArr = new ASN1BitString[i7];
                while (i3 != i7) {
                    ASN1Encodable aSN1EncodableA = aSN1EncodableVectorD.a(i3);
                    if (!(aSN1EncodableA instanceof ASN1BitString)) {
                        throw new ASN1Exception("unknown object encountered in constructed BIT STRING: ".concat(String.valueOf(String.valueOf(aSN1EncodableA.getClass()))));
                    }
                    aSN1BitStringArr[i3] = (ASN1BitString) aSN1EncodableA;
                    i3++;
                }
                return new BERBitString(aSN1BitStringArr);
            }
            if (iB != 4) {
                if (iB == 8) {
                    return new DLExternal(DLFactory.a(d(definiteLengthInputStream)));
                }
                if (iB == 16) {
                    return definiteLengthInputStream.b <= 0 ? DLFactory.a : this.b ? new LazyEncodedSequence(definiteLengthInputStream.a()) : DLFactory.a(d(definiteLengthInputStream));
                }
                if (iB == 17) {
                    return DLFactory.b(d(definiteLengthInputStream));
                }
                throw new IOException(a.e(iB, "unknown tag ", " encountered"));
            }
            ASN1EncodableVector aSN1EncodableVectorD2 = d(definiteLengthInputStream);
            int i8 = aSN1EncodableVectorD2.c;
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[i8];
            while (i3 != i8) {
                ASN1Encodable aSN1EncodableA2 = aSN1EncodableVectorD2.a(i3);
                if (!(aSN1EncodableA2 instanceof ASN1OctetString)) {
                    throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: ".concat(String.valueOf(String.valueOf(aSN1EncodableA2.getClass()))));
                }
                aSN1OctetStringArr[i3] = (ASN1OctetString) aSN1EncodableA2;
                i3++;
            }
            return new BEROctetString(aSN1OctetStringArr);
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception("corrupted stream detected", e);
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public ASN1InputStream(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public ASN1InputStream(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    private ASN1InputStream(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.a = i;
        this.b = z;
        this.c = bArr;
    }

    public ASN1InputStream(InputStream inputStream, byte[] bArr) {
        this(inputStream, StreamUtil.a(inputStream), true);
    }

    public ASN1InputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public ASN1InputStream(byte[] bArr, byte[] bArr2) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }
}
