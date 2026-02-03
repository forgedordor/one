package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsa {
    public final InputStream a;

    private eqsa(InputStream inputStream) {
        this.a = inputStream;
    }

    public static eqsa a(byte[] bArr) {
        return new eqsa(new ByteArrayInputStream(bArr));
    }
}
