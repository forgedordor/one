package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class easy {
    public abstract easz a();

    public abstract void b(String str);

    public abstract void c(int i);

    public abstract void d(int i);

    public final easz e() {
        easz easzVarA = a();
        eaow eaowVar = (eaow) easzVarA;
        int i = eaowVar.c;
        ejwl.d(i >= 0, "Width must not be < 0, but was: %s.", i);
        int i2 = eaowVar.b;
        ejwl.d(i2 >= 0, "Height must not be < 0, but was: %s.", i2);
        ejwl.b(!eaowVar.d.isEmpty(), "PhotoReference must not be empty.");
        return easzVarA;
    }
}
