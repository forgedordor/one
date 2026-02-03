package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class j extends eslp {
    public final byte a() {
        int iD = d(4);
        if (iD != 0) {
            return this.b.get(iD + this.a);
        }
        return (byte) 0;
    }

    public final m b() {
        m mVar = new m();
        int iD = d(6);
        if (iD == 0) {
            return null;
        }
        int iC = c(iD + this.a);
        ByteBuffer byteBuffer = this.b;
        byteBuffer.getClass();
        mVar.h(iC, byteBuffer);
        return mVar;
    }
}
