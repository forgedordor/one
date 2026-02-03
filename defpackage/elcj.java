package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class elcj implements elcu {
    @Override // defpackage.elcu
    public final elct a(ByteBuffer byteBuffer) {
        elcv elcvVarD = d(byteBuffer.remaining());
        elcvVarD.f(byteBuffer);
        return elcvVarD.r();
    }

    @Override // defpackage.elcu
    public final elct b(byte[] bArr) {
        return e(bArr, bArr.length);
    }

    @Override // defpackage.elcu
    public elct c(CharSequence charSequence, Charset charset) {
        return f().k(charSequence, charset).r();
    }

    public elcv d(int i) {
        ejwl.d(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return f();
    }

    public elct e(byte[] bArr, int i) {
        ejwl.k(0, i, bArr.length);
        elcv elcvVarD = d(i);
        elcvVarD.g(bArr, i);
        return elcvVarD.r();
    }
}
