package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dfzx {
    public abstract dfzy a();

    public abstract void b(String str);

    public abstract void c(int i);

    public abstract void d(ewfe ewfeVar);

    public abstract void e(ebmr ebmrVar);

    public abstract void f(ekhx ekhxVar);

    public final void g(String str) {
        ewfd ewfdVar = (ewfd) ewfe.a.createBuilder();
        ewfdVar.copyOnWrite();
        ewfe ewfeVar = (ewfe) ewfdVar.instance;
        ewfeVar.b |= 1;
        ewfeVar.c = str;
        d((ewfe) ewfdVar.build());
    }
}
