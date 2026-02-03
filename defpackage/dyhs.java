package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyhs {
    public abstract dyhu a();

    public final dyhu b() {
        dyhu dyhuVarA = a();
        dyhx dyhxVar = (dyhx) dyhuVarA;
        ejwl.m((dyhxVar.c != -1) ^ (dyhxVar.b != null), "Either icon id or icon drawable must be specified");
        return dyhuVarA;
    }

    public abstract void c(dyhr dyhrVar);

    public abstract void d(ejwi ejwiVar);

    public abstract void e(int i);

    public abstract void f(int i);

    public abstract void g(String str);

    public abstract void h(int i);

    public abstract void i(boolean z);
}
