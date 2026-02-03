package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aokg implements aokn {
    public final alrj a;
    private final fdjx b;
    private final awhh c;
    private final fctc d;

    public aokg(fdjx fdjxVar, awhh awhhVar, alrj alrjVar) {
        fdjxVar.getClass();
        alrjVar.getClass();
        this.b = fdjxVar;
        this.c = awhhVar;
        this.a = alrjVar;
        this.d = fctd.a(new fdae() { // from class: aokd
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.a.f();
            }
        });
    }

    private final alqm c() {
        return (alqm) this.d.a();
    }

    @Override // defpackage.aokn
    public final eiju a(aoer aoerVar) {
        return auvw.c(this.b, fcyi.a, fdjz.a, new aokf(this, aoerVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.aokn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aoer r8, defpackage.fcxy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aoke
            if (r0 == 0) goto L13
            r0 = r9
            aoke r0 = (defpackage.aoke) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aoke r0 = new aoke
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.fctl.b(r9)
            goto L6f
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.fctl.b(r9)
            awhh r9 = r7.c
            awhi r2 = defpackage.awhi.SMS
            int r5 = r8.b()
            alqm r6 = r7.c()
            eiju r2 = r9.a(r2, r5, r6)
            r2.getClass()
            fdkf r2 = defpackage.auvw.e(r2)
            awhi r5 = defpackage.awhi.MMS
            int r8 = r8.b()
            alqm r6 = r7.c()
            eiju r8 = r9.a(r5, r8, r6)
            r8.getClass()
            fdkf r8 = defpackage.auvw.e(r8)
            r9 = 2
            fdkf[] r9 = new defpackage.fdkf[r9]
            r9[r3] = r2
            r9[r4] = r8
            r0.c = r4
            java.lang.Object r9 = defpackage.fdii.b(r9, r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r9.get(r3)
            awhe r8 = (defpackage.awhe) r8
            java.lang.Object r9 = r9.get(r4)
            awhe r9 = (defpackage.awhe) r9
            aokh r0 = new aokh
            r0.<init>(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aokg.b(aoer, fcxy):java.lang.Object");
    }
}
