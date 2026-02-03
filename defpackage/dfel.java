package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfel extends ffhq {
    private final long a;
    private final dfdv b;
    private final String c;

    public dfel(long j, dfdv dfdvVar, String str) {
        super(ffhn.STRICT, "b".concat(ebmh.a()), null);
        this.a = j;
        this.b = dfdvVar;
        this.c = str;
    }

    @Override // defpackage.ffhq, org.apache.http.HttpEntity
    public final void writeTo(OutputStream outputStream) throws IOException {
        super.writeTo(new dffw(this.a, (int) getContentLength(), outputStream, this.b, this.c));
    }
}
