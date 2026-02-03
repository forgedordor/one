package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpu {
    public final hng a;
    public final boolean b;
    public final hrn c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public hpu(hng hngVar, Object obj, boolean z, hrn hrnVar, boolean z2) {
        this.a = hngVar;
        this.b = z;
        this.c = hrnVar;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        hmz.h("Unexpected form of a provided value");
        throw new fcta();
    }
}
