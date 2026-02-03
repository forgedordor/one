package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgi implements dew {
    public final float a;
    public final float b;
    public final Object c;

    public dgi() {
        this(null, 7);
    }

    @Override // defpackage.ddz
    public final /* synthetic */ diw a(dib dibVar) {
        Object obj = this.c;
        return new djk(this.a, this.b, obj == null ? null : (deh) dibVar.a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dgi)) {
            return false;
        }
        dgi dgiVar = (dgi) obj;
        return dgiVar.a == this.a && dgiVar.b == this.b && fdbq.f(dgiVar.c, this.c);
    }

    public final int hashCode() {
        Object obj = this.c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b);
    }

    public dgi(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public /* synthetic */ dgi(Object obj, int i) {
        this(1 != (i & 1) ? 0.0f : 1.0f, (i & 2) != 0 ? 1500.0f : 0.0f, (i & 4) != 0 ? null : obj);
    }
}
