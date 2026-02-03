package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nqm implements nqk {
    @Override // defpackage.nqk
    public final mbt a(nql nqlVar) {
        ByteBuffer byteBuffer = nqlVar.d;
        mee.f(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        mee.a(z);
        return b(nqlVar, byteBuffer);
    }

    protected abstract mbt b(nql nqlVar, ByteBuffer byteBuffer);
}
