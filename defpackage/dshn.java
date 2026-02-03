package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dshn implements ejvr {
    @Override // defpackage.ejvr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final etnj apply(evmx evmxVar) {
        etnb etnbVar = (etnb) etnj.a.createBuilder();
        d(evmxVar, etnbVar);
        if ((evmxVar.b & 1) != 0) {
            boolean z = evmxVar.e;
            etnbVar.copyOnWrite();
            etnj etnjVar = (etnj) etnbVar.instance;
            etnjVar.b |= 4;
            etnjVar.f = z;
        }
        f(evmxVar, etnbVar);
        g(evmxVar, etnbVar);
        h(evmxVar, etnbVar);
        e(evmxVar, etnbVar);
        c(evmxVar, etnbVar);
        if ((evmxVar.b & 2) != 0) {
            ejvr ejvrVar = dsjl.a;
            evmw evmwVarB = evmw.b(evmxVar.f);
            if (evmwVarB == null) {
                evmwVarB = evmw.UI_THEME_UNSPECIFIED;
            }
            Object objApply = ejvrVar.apply(evmwVarB);
            etnbVar.copyOnWrite();
            etnj etnjVar2 = (etnj) etnbVar.instance;
            etnjVar2.g = ((etng) objApply).c;
            etnjVar2.b |= 8;
        }
        b(evmxVar, etnbVar);
        return (etnj) etnbVar.build();
    }

    public abstract void b(evmx evmxVar, etnb etnbVar);

    public abstract void c(evmx evmxVar, etnb etnbVar);

    public abstract void d(evmx evmxVar, etnb etnbVar);

    public abstract void e(evmx evmxVar, etnb etnbVar);

    public abstract void f(evmx evmxVar, etnb etnbVar);

    public abstract void g(evmx evmxVar, etnb etnbVar);

    public abstract void h(evmx evmxVar, etnb etnbVar);
}
