package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffhs extends ffhr {
    private final byte[] a;
    private final String b;

    public ffhs(byte[] bArr, String str) {
        this(bArr, "application/octet-stream", str);
    }

    @Override // defpackage.ffhu
    public long a() {
        return this.a.length;
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
        outputStream.write(this.a);
    }

    public ffhs(byte[] bArr, String str, String str2) {
        super(str);
        if (bArr == null) {
            throw new IllegalArgumentException("byte[] may not be null");
        }
        this.a = bArr;
        this.b = str2;
    }
}
