package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class k extends eslp {
    public final int a() {
        int iD = d(4);
        if (iD != 0) {
            return f(iD);
        }
        return 0;
    }

    public final j b(int i) {
        j jVar = new j();
        int iD = d(4);
        if (iD == 0) {
            return null;
        }
        int iC = c(e(iD) + (i * 4));
        ByteBuffer byteBuffer = this.b;
        byteBuffer.getClass();
        jVar.h(iC, byteBuffer);
        return jVar;
    }
}
