package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azu {
    public static final azu a;
    public final float b;
    public final lcb c;
    public final lcb d;

    static {
        azt aztVar = new azt();
        aztVar.a = 1.0f;
        Float fValueOf = Float.valueOf(0.0f);
        aztVar.b = new lcb(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        aztVar.c = new lcb(fValueOf2, fValueOf2);
        a = new azu(aztVar.a, aztVar.b, aztVar.c);
    }

    public azu(float f, lcb lcbVar, lcb lcbVar2) {
        this.b = f;
        this.c = lcbVar;
        this.d = lcbVar2;
    }
}
