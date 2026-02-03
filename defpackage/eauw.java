package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eauw {
    public abstract easz a();

    public abstract eaux b();

    public abstract Integer c();

    public abstract Integer d();

    public abstract void e(Integer num);

    public abstract void f(Integer num);

    public final eaux g() {
        easz easzVarA = a();
        if (d() == null && c() == null) {
            int iB = easzVarA.b();
            if (iB > 0) {
                f(Integer.valueOf(iB));
            }
            int iA = easzVarA.a();
            if (iA > 0) {
                e(Integer.valueOf(iA));
            }
        }
        return b();
    }
}
