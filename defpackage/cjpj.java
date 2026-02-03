package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpj implements cjpk {
    public final fcsu a;
    public final fcsu b;
    private final fcsu c;
    private final fdjx d;

    public cjpj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        this.c = fcsuVar;
        this.a = fcsuVar2;
        this.b = fcsuVar3;
        this.d = fdjxVar;
    }

    public static final String d(dggk dggkVar) {
        String str = dggkVar.a;
        if (str.length() <= 4) {
            return str;
        }
        String strSubstring = str.substring(0, 4);
        strSubstring.getClass();
        String strSubstring2 = str.substring(4, str.length());
        strSubstring2.getClass();
        return strSubstring.concat(new fdgl("[0-9]").b(strSubstring2, "X"));
    }

    private final void g(int i, dggn dggnVar) {
        auvw.k(this.d, null, null, new cjpi(this, i, dggnVar, null), 3);
    }

    @Override // defpackage.cjpk
    public final void a(dggn dggnVar) {
        g(16, dggnVar);
    }

    @Override // defpackage.cjpk
    public final void b(dggn dggnVar) {
        g(15, dggnVar);
    }

    public final void c(enys enysVar) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.RCS_PROVISIONING_MANAGER_EVENT, ellgVar);
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.bV = enysVar;
        ellhVar.h |= 16;
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ((aimb) this.c.b()).a().h((ellg) builder, aioj.LOG_SPEC_RCS_PROVISIONING_MANAGER_EVENTS);
    }

    @Override // defpackage.cjpk
    public final void e(int i, Integer num, dggk dggkVar, boolean z) {
        auvw.k(this.d, null, null, new cjpg(this, dggkVar, num, z, i, null), 3);
    }

    @Override // defpackage.cjpk
    public final void f(int i, Integer num, dggk dggkVar, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        auvw.k(this.d, null, null, new cjph(this, dggkVar, num, str, str2, z, i, null), 3);
    }
}
