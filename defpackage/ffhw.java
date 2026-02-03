package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffhw extends ffhr {
    private final InputStream a;
    private final String b;

    public ffhw(InputStream inputStream, String str) {
        this(inputStream, "application/octet-stream", str);
    }

    @Override // defpackage.ffhu
    public long a() {
        return -1L;
    }

    @Override // defpackage.ffhu
    public String e() {
        return null;
    }

    @Override // defpackage.ffht
    public String f() {
        return this.b;
    }

    @Override // defpackage.ffhu
    public String g() {
        return ffho.e;
    }

    @Override // defpackage.ffht
    public void h(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = this.a.read(bArr);
                if (i == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } finally {
            this.a.close();
        }
    }

    public InputStream i() {
        return this.a;
    }

    public ffhw(InputStream inputStream, String str, String str2) {
        super(str);
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        this.a = inputStream;
        this.b = str2;
    }
}
