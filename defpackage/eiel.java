package defpackage;

import android.app.Service;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiel {
    eifp a;
    private final Service b;

    public eiel(Service service) {
        this.b = service;
    }

    private final eiez d() {
        return eidc.v() ? eiez.d(eigt.c(this.b)) : eiey.a;
    }

    private final String e(String str) {
        return str + " " + this.b.getClass().getSimpleName();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eifp a(android.content.Intent r7) {
        /*
            r6 = this;
            android.app.Service r0 = r6.b
            if (r7 == 0) goto L18
            long r1 = defpackage.eiid.a
            eifn r1 = defpackage.eiid.r(r7)
            if (r1 == 0) goto L18
            java.util.Set r1 = defpackage.eigt.c(r0)
            eiez r1 = defpackage.eiez.d(r1)
            r1.getClass()
            goto L1d
        L18:
            eiez r1 = defpackage.eiey.a
            r1.getClass()
        L1d:
            java.lang.Class r2 = r0.getClass()
            eifn r3 = defpackage.eidc.c()
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = ".onBind"
            java.lang.String r2 = r2.concat(r4)
            if (r7 != 0) goto L3a
            eifp r7 = defpackage.eien.a(r0, r2)
            goto L4f
        L3a:
            long r4 = defpackage.eiid.a
            eifn r7 = defpackage.eiid.r(r7)
            if (r7 != 0) goto L47
            eifp r7 = defpackage.eien.a(r0, r2)
            goto L4f
        L47:
            defpackage.eidc.g(r7)
            eiem r7 = new eiem
            r7.<init>()
        L4f:
            java.lang.String r0 = "onBind"
            java.lang.String r0 = r6.e(r0)
            eieu r0 = defpackage.eiiy.j(r0, r1)
            eiei r1 = new eiei
            r1.<init>(r0, r7, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiel.a(android.content.Intent):eifp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eifp b() {
        final eieh eiehVarF;
        eiez eiezVarD = d();
        final eifn eifnVarC = eidc.c();
        if (eidc.v()) {
            eiehVarF = null;
        } else {
            eifn eifnVarF = eidc.f();
            if (eifnVarF != null) {
                eiek eiekVar = new eiek();
                eidc.g(eifnVarF);
                eiex eiexVarB = eiez.b();
                eiexVarB.a(eifh.c, eiekVar);
                this.a = eiiy.j("Creating ".concat(String.valueOf(this.b.getClass().getSimpleName())), ((eiez) eiexVarB).f());
                eiehVarF = eifnVarF;
            } else {
                Service service = this.b;
                eiehVarF = eigt.b(service).f("com/google/apps/tiktok/tracing/ServiceLifecycleTraceManager", "ensureServiceRootTrace", 173, "Creating ".concat(String.valueOf(service.getClass().getSimpleName())), eifh.b);
            }
        }
        final eieu eieuVarJ = eiiy.j(e("onCreate"), eiezVarD);
        return new eifp() { // from class: eiej
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eieuVarJ.close();
                eifp eifpVar = this.a.a;
                if (eifpVar != null) {
                    eifpVar.close();
                }
                eifp eifpVar2 = eiehVarF;
                if (eifpVar2 != null) {
                    eifpVar2.close();
                }
                eidc.g(eifnVarC);
            }
        };
    }

    public final eifp c() {
        eieh eiehVarF;
        eiez eiezVarD = d();
        eifn eifnVarC = eidc.c();
        if (eidc.v()) {
            eiehVarF = null;
        } else {
            Service service = this.b;
            eiehVarF = eigt.b(service).f("com/google/apps/tiktok/tracing/ServiceLifecycleTraceManager", "ensureRootTrace", 187, "Destroying ".concat(String.valueOf(service.getClass().getSimpleName())), eifh.b);
        }
        return new eiei(eiiy.j(e("onDestroy"), eiezVarD), eiehVarF, eifnVarC);
    }
}
