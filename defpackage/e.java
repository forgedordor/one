package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class e extends eslp {
    public final f a(int i) {
        f fVar = new f();
        int iD = d(4);
        if (iD == 0) {
            return null;
        }
        int iC = c(e(iD) + (i * 4));
        ByteBuffer byteBuffer = this.b;
        byteBuffer.getClass();
        fVar.h(iC, byteBuffer);
        return fVar;
    }
}
