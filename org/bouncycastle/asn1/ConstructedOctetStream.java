package org.bouncycastle.asn1;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ConstructedOctetStream extends InputStream implements InputStreamRetargetInterface {
    private final ASN1StreamParser a;
    private boolean b = true;
    private InputStream c;

    public ConstructedOctetStream(ASN1StreamParser aSN1StreamParser) {
        this.a = aSN1StreamParser;
    }

    private final ASN1OctetStringParser a() throws IOException {
        ASN1Encodable aSN1EncodableB = this.a.b();
        if (aSN1EncodableB == null) {
            return null;
        }
        if (aSN1EncodableB instanceof ASN1OctetStringParser) {
            return (ASN1OctetStringParser) aSN1EncodableB;
        }
        throw new IOException("unknown object encountered: ".concat(String.valueOf(String.valueOf(aSN1EncodableB.getClass()))));
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        ASN1OctetStringParser aSN1OctetStringParserA;
        if (this.c == null) {
            if (!this.b || (aSN1OctetStringParserA = a()) == null) {
                return -1;
            }
            this.b = false;
            this.c = aSN1OctetStringParserA.e();
        }
        while (true) {
            int i = this.c.read();
            if (i >= 0) {
                return i;
            }
            ASN1OctetStringParser aSN1OctetStringParserA2 = a();
            if (aSN1OctetStringParserA2 == null) {
                this.c = null;
                return -1;
            }
            this.c = aSN1OctetStringParserA2.e();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        ASN1OctetStringParser aSN1OctetStringParserA;
        int i3 = 0;
        if (this.c == null) {
            if (!this.b || (aSN1OctetStringParserA = a()) == null) {
                return -1;
            }
            this.b = false;
            this.c = aSN1OctetStringParserA.e();
        }
        while (true) {
            int i4 = this.c.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                ASN1OctetStringParser aSN1OctetStringParserA2 = a();
                if (aSN1OctetStringParserA2 == null) {
                    this.c = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.c = aSN1OctetStringParserA2.e();
            }
        }
    }
}
