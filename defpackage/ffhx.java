package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffhx extends ffhr {
    private final byte[] a;
    private final Charset b;

    public ffhx(String str) {
        this(str, "text/plain", null);
    }

    public static ffhx j(String str) {
        return l(str, null, null);
    }

    public static ffhx k(String str, Charset charset) {
        return l(str, null, charset);
    }

    public static ffhx l(String str, String str2, Charset charset) {
        try {
            return new ffhx(str, str2, charset);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(a.h(charset, "Charset ", " is not supported"), e);
        }
    }

    @Override // defpackage.ffhu
    public long a() {
        return this.a.length;
    }

    @Override // defpackage.ffhu
    public String e() {
        return this.b.name();
    }

    @Override // defpackage.ffht
    public String f() {
        return null;
    }

    @Override // defpackage.ffhu
    public String g() {
        return ffho.d;
    }

    @Override // defpackage.ffht
    public void h(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.a);
        byte[] bArr = new byte[4096];
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, i);
        }
    }

    public Reader i() {
        return new InputStreamReader(new ByteArrayInputStream(this.a), this.b);
    }

    public ffhx(String str, String str2, Charset charset) {
        super(str2);
        if (str == null) {
            throw new IllegalArgumentException("Text may not be null");
        }
        charset = charset == null ? Charset.forName("US-ASCII") : charset;
        this.a = str.getBytes(charset.name());
        this.b = charset;
    }

    public ffhx(String str, Charset charset) {
        this(str, "text/plain", charset);
    }
}
