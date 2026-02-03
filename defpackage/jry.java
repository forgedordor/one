package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jry {
    public final fdae a;
    public final fdae b;
    public final boolean c;

    public jry(fdae fdaeVar, fdae fdaeVar2, boolean z) {
        this.a = fdaeVar;
        this.b = fdaeVar2;
        this.c = z;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.b.invoke()).floatValue() + ", reverseScrolling=" + this.c + ')';
    }
}
