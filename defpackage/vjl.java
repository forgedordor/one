package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjl {
    public final Optional a;
    public final fcsu b;
    public final fcsu c;
    public final efwo d;
    private final fcsu e;
    private final fdjx f;
    private final fcyh g;

    public vjl(Optional optional, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, efwo efwoVar, fdjx fdjxVar, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        efwoVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        this.a = optional;
        this.e = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = efwoVar;
        this.f = fdjxVar;
        this.g = fcyhVar;
    }

    public final void a(ajlt ajltVar, fdap fdapVar) {
        if (crtr.e()) {
            String strB = ajltVar.g().b();
            strB.getClass();
            if (fdgn.t(strB, "image") && !this.a.isEmpty()) {
                amvx amvxVarH = ((amvy) ajltVar.g()).h();
                if (amvxVarH == amvx.DISPLAY) {
                    fdapVar.invoke(ajltVar);
                    return;
                } else {
                    auvw.m(this.f, this.g, new vjk(this, fdapVar, ajltVar, amvxVarH, null), 2);
                    return;
                }
            }
        }
        fdapVar.invoke(ajltVar);
    }

    public final void b(final ajlt ajltVar, final fdap fdapVar) {
        ((ahax) this.e.b()).e(new fdap() { // from class: vjj
            /* JADX WARN: Type inference failed for: r0v2, types: [aaef, java.lang.Object] */
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final ahat ahatVar = (ahat) obj;
                ahatVar.getClass();
                ?? r0 = this.a.a.get();
                fdae fdaeVar = new fdae() { // from class: vjh
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahatVar.a();
                        return fctx.a;
                    }
                };
                final fdap fdapVar2 = fdapVar;
                final ajlt ajltVar2 = ajltVar;
                return r0.a(fdaeVar, new fdae() { // from class: vji
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahatVar.a();
                        fdapVar2.invoke(ajltVar2);
                        return fctx.a;
                    }
                });
            }
        });
    }
}
