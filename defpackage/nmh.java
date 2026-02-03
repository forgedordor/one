package defpackage;

import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nmh {
    public final int a;
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final int d;

    public nmh(nme nmeVar) {
        float[] fArr = nmeVar.c;
        this.a = fArr.length / 3;
        this.b = mev.k(fArr);
        this.c = mev.k(nmeVar.d);
        int i = nmeVar.b;
        this.d = i != 1 ? i != 2 ? 4 : 6 : 5;
    }
}
