package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ervt implements eqsz {
    @Override // defpackage.eqsz
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new erwh(this, inputStream, bArr);
    }

    @Override // defpackage.eqsz
    public final OutputStream b(OutputStream outputStream, byte[] bArr) {
        return new erwi(this, outputStream, bArr);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract erwf g();

    public abstract erwg h(byte[] bArr);
}
