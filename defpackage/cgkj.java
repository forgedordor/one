package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgkj {
    private final cghl a;
    private final cgik b;

    public cgkj(cgik cgikVar, cghl cghlVar) {
        this.b = cgikVar;
        this.a = cghlVar;
    }

    static cbog a(cglf cglfVar) {
        caxr caxrVar = new caxr();
        caxrVar.a = cglfVar.name();
        return caxrVar.a();
    }

    public final void b(cglf cglfVar, String str) {
        cgjo cgjoVar = (cgjo) cgjp.a.createBuilder();
        cgjoVar.copyOnWrite();
        cgjp cgjpVar = (cgjp) cgjoVar.instance;
        cgjpVar.c = cglfVar.j;
        cgjpVar.b |= 1;
        cgjoVar.copyOnWrite();
        cgjp cgjpVar2 = (cgjp) cgjoVar.instance;
        cgjpVar2.b |= 2;
        cgjpVar2.d = str;
        this.a.a((cgjp) cgjoVar.build(), a(cglfVar));
    }

    public final void c(cglf cglfVar) {
        cgjo cgjoVar = (cgjo) cgjp.a.createBuilder();
        cgjoVar.copyOnWrite();
        cgjp cgjpVar = (cgjp) cgjoVar.instance;
        cgjpVar.c = cglfVar.j;
        cgjpVar.b |= 1;
        this.a.a((cgjp) cgjoVar.build(), a(cglfVar));
    }

    public final void d(cgiw cgiwVar, Object obj, boolean z) {
        cgkk cgkkVar = (cgkk) cgiwVar.c().a(obj).toBuilder();
        cglf cglfVarD = cgiwVar.d();
        cgkkVar.copyOnWrite();
        cgkl cgklVar = (cgkl) cgkkVar.instance;
        cgklVar.e = cglfVarD.j;
        cgklVar.b |= 1;
        cgkkVar.copyOnWrite();
        cgkl cgklVar2 = (cgkl) cgkkVar.instance;
        cgklVar2.b |= 2;
        cgklVar2.f = z;
        ((cazj) this.b.a.b()).g(cbcu.g("create_notification", (cgkl) cgkkVar.build(), a(cgiwVar.d())));
    }
}
