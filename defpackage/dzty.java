package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzty {
    public abstract dztz a();

    public abstract dzty b(int i);

    public abstract void c(int i);

    public abstract void d(float f);

    public final dzty e(boolean z) {
        return b(true != z ? 2 : 3);
    }

    public final dztz f() {
        dztz dztzVarA = a();
        dztv dztvVar = (dztv) dztzVarA;
        ejwl.m(dztvVar.a >= 0, "Rate limit per second must be >= 0");
        float f = dztvVar.b;
        ejwl.m(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
        return dztzVarA;
    }
}
