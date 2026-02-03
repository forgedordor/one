package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvin {
    public static final cqce a = cqce.g("BugleNetwork", "SettingsUpdate");
    public final fcsu b;
    public final fcsu c;
    public final cfeh d;
    private final eosc e;
    private final cehg f;
    private final Optional g;
    private final crma h;

    public bvin(eosc eoscVar, cehg cehgVar, Optional optional, fcsu fcsuVar, crma crmaVar, cfeh cfehVar, fcsu fcsuVar2) {
        this.e = eoscVar;
        this.f = cehgVar;
        this.g = optional;
        this.b = fcsuVar;
        this.h = crmaVar;
        this.d = cfehVar;
        this.c = fcsuVar2;
    }

    public final eiju a(final ezol ezolVar, final Optional optional, final String str) {
        if (!((Boolean) ccze.i.e()).booleanValue()) {
            return eijx.e(ezjn.a);
        }
        if (!this.h.k()) {
            a.r("Skip settings update due to missing READ_PHONE_STATE permission.");
            return eijx.e(ezjn.a);
        }
        if (!this.g.isEmpty()) {
            return this.f.c().i(new eooz() { // from class: bvim
                /* JADX WARN: Removed duplicated region for block: B:7:0x005d  */
                @Override // defpackage.eooz
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r9) {
                    /*
                        r8 = this;
                        epee r9 = (defpackage.epee) r9
                        cqce r0 = defpackage.bvin.a
                        cqbd r1 = r0.d()
                        java.lang.String r2 = "Settings"
                        r1.A(r2, r9)
                        r1.r()
                        bvin r1 = r8.a
                        fcsu r2 = r1.c
                        java.lang.Object r2 = r2.b()
                        cdio r2 = (defpackage.cdio) r2
                        boolean r2 = r2.a()
                        java.lang.String r3 = r3
                        r4 = 5
                        if (r2 == 0) goto L5d
                        j$.util.Optional r2 = r2
                        boolean r5 = r2.isPresent()
                        if (r5 == 0) goto L5d
                        cfeh r5 = r1.d
                        java.lang.Object r2 = r2.get()
                        epby r6 = defpackage.epby.GET_UPDATES
                        bvks r2 = (defpackage.bvks) r2
                        cfef r2 = r5.a(r2, r6)
                        r2.c = r3
                        eoze r3 = defpackage.eoze.a
                        evsf r3 = r3.createBuilder()
                        eozc r3 = (defpackage.eozc) r3
                        r3.copyOnWrite()
                        MessageType extends evsn<MessageType, BuilderType> r5 = r3.instance
                        eoze r5 = (defpackage.eoze) r5
                        r9.getClass()
                        r5.c = r9
                        r5.b = r4
                        evsn r9 = r3.build()
                        r2.b(r9)
                        cfeg r9 = r2.a()
                        goto L8e
                    L5d:
                        ezol r2 = r4
                        cfeh r5 = r1.d
                        j$.util.Optional r6 = j$.util.Optional.empty()
                        epby r7 = defpackage.epby.GET_UPDATES
                        cfef r2 = r5.c(r2, r6, r7)
                        r2.c = r3
                        eoze r3 = defpackage.eoze.a
                        evsf r3 = r3.createBuilder()
                        eozc r3 = (defpackage.eozc) r3
                        r3.copyOnWrite()
                        MessageType extends evsn<MessageType, BuilderType> r5 = r3.instance
                        eoze r5 = (defpackage.eoze) r5
                        r9.getClass()
                        r5.c = r9
                        r5.b = r4
                        evsn r9 = r3.build()
                        r2.b(r9)
                        cfeg r9 = r2.a()
                    L8e:
                        fcsu r1 = r1.b
                        java.lang.Object r2 = r1.b()
                        j$.util.Optional r2 = (j$.util.Optional) r2
                        boolean r2 = r2.isEmpty()
                        if (r2 == 0) goto Lab
                        java.lang.String r9 = "DittoRetryExecutor is not available on this device."
                        r0.r(r9)
                        java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                        r0.<init>(r9)
                        eiju r9 = defpackage.eijx.d(r0)
                        return r9
                    Lab:
                        java.lang.Object r0 = r1.b()
                        j$.util.Optional r0 = (j$.util.Optional) r0
                        java.lang.Object r0 = r0.get()
                        cfya r0 = (defpackage.cfya) r0
                        eiju r0 = r0.a(r9)
                        r9.q(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bvim.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.e);
        }
        a.r("Skip settings update due to missing ditto foreground service");
        return eijx.e(ezjn.a);
    }
}
