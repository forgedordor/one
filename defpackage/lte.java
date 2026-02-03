package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lte {
    public final cue a;
    public final cue b;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.5f);
        new lte(new fcti(fValueOf, fValueOf), new fcti(fValueOf2, fValueOf2));
    }

    public lte(fcti... fctiVarArr) {
        fctiVarArr.getClass();
        int length = fctiVarArr.length;
        this.a = new cue(length);
        this.b = new cue(length);
        for (int i = 0; i < fctiVarArr.length; i++) {
            this.a.d(((Number) fctiVarArr[i].a).floatValue());
            this.b.d(((Number) fctiVarArr[i].b).floatValue());
        }
        ltl.c(this.a);
        ltl.c(this.b);
    }

    public final float a(float f) {
        return ltl.a(this.a, this.b, f);
    }
}
