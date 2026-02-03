package org.bouncycastle.asn1;

import defpackage.ffwu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class DERUTF8String extends ASN1UTF8String {
    public DERUTF8String() throws IOException {
        String str = ffwu.a;
        char[] charArray = "CMP-KEM".toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            try {
                int length = charArray.length;
                if (i >= length) {
                    super(byteArrayOutputStream.toByteArray());
                    return;
                }
                char c = charArray[i];
                if (c < 128) {
                    byteArrayOutputStream.write(c);
                } else if (c < 2048) {
                    byteArrayOutputStream.write((c >> 6) | 192);
                    byteArrayOutputStream.write((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    byteArrayOutputStream.write((c >> '\f') | 224);
                    byteArrayOutputStream.write(((c >> 6) & 63) | 128);
                    byteArrayOutputStream.write((c & '?') | 128);
                } else {
                    i++;
                    if (i >= length) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    char c2 = charArray[i];
                    if (c > 56319) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    int i2 = ((c2 & 1023) | ((c & 1023) << 10)) + 65536;
                    byteArrayOutputStream.write((i2 >> 18) | 240);
                    byteArrayOutputStream.write(((i2 >> 12) & 63) | 128);
                    byteArrayOutputStream.write(((i2 >> 6) & 63) | 128);
                    byteArrayOutputStream.write((i2 & 63) | 128);
                }
                i++;
            } catch (IOException unused) {
                throw new IllegalStateException("cannot encode string to byte array!");
            }
        }
    }

    public DERUTF8String(byte[] bArr) {
        super(bArr);
    }
}
