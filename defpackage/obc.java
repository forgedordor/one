package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class obc {
    public long a;
    public final mdk b;
    public final mdp c;

    public obc(mdk mdkVar, mdp mdpVar, long j) {
        this.b = mdkVar;
        this.a = j;
        this.c = mdpVar;
    }

    public final void a(ByteBuffer byteBuffer, long j) {
        mee.a(j >= this.a);
        byteBuffer.position(byteBuffer.position() + (((int) (j - this.a)) * this.b.e));
        this.a = j;
    }
}
