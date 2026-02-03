package org.bouncycastle.asn1;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ConstructedBitStream extends InputStream implements InputStreamRetargetInterface {
    private final ASN1StreamParser b;
    private ASN1BitStringParser d;
    private InputStream e;
    private boolean c = true;
    public int a = 0;

    public ConstructedBitStream(ASN1StreamParser aSN1StreamParser) {
        this.b = aSN1StreamParser;
    }

    private final ASN1BitStringParser a() throws IOException {
        ASN1Encodable aSN1EncodableB = this.b.b();
        if (aSN1EncodableB == null) {
            return null;
        }
        if (!(aSN1EncodableB instanceof ASN1BitStringParser)) {
            throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(aSN1EncodableB.getClass()))));
        }
        if (this.a == 0) {
            return (ASN1BitStringParser) aSN1EncodableB;
        }
        throw new IOException("only the last nested bitstring can have padding");
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.e == null) {
            if (this.c) {
                ASN1BitStringParser aSN1BitStringParserA = a();
                this.d = aSN1BitStringParserA;
                if (aSN1BitStringParserA != null) {
                    this.c = false;
                    this.e = aSN1BitStringParserA.g();
                }
            }
            return -1;
        }
        while (true) {
            int i = this.e.read();
            if (i >= 0) {
                return i;
            }
            this.a = this.d.f();
            ASN1BitStringParser aSN1BitStringParserA2 = a();
            this.d = aSN1BitStringParserA2;
            if (aSN1BitStringParserA2 == null) {
                this.e = null;
                return -1;
            }
            this.e = aSN1BitStringParserA2.g();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.e == null) {
            if (!this.c) {
                return -1;
            }
            ASN1BitStringParser aSN1BitStringParserA = a();
            this.d = aSN1BitStringParserA;
            if (aSN1BitStringParserA == null) {
                return -1;
            }
            this.c = false;
            this.e = aSN1BitStringParserA.g();
        }
        while (true) {
            int i4 = this.e.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.a = this.d.f();
                ASN1BitStringParser aSN1BitStringParserA2 = a();
                this.d = aSN1BitStringParserA2;
                if (aSN1BitStringParserA2 == null) {
                    this.e = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.e = aSN1BitStringParserA2.g();
            }
        }
    }
}
