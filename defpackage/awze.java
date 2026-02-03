package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awze implements bati {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityForeignKeyUpgrader");
    public final arpd b;
    private final batf c;
    private final fdjx d;
    private final fdjx e;
    private final bvdj f;

    public awze(batf batfVar, arpd arpdVar, fdjx fdjxVar, fdjx fdjxVar2) {
        batfVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.c = batfVar;
        this.b = arpdVar;
        this.d = fdjxVar;
        this.e = fdjxVar2;
        this.f = bvdj.MY_IDENTITY_FOREIGN_KEY;
    }

    @Override // defpackage.bati
    public final long a() {
        return 2L;
    }

    @Override // defpackage.bati
    public final bvdj b() {
        return this.f;
    }

    @Override // defpackage.bati
    public final eiju c() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new awzb(this, null));
    }

    @Override // defpackage.bati
    public final eiju d(long j) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new awzc(this, j, null));
    }

    @Override // defpackage.bati
    public final eiju e(Optional optional) {
        optional.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new awzd(this, optional, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.awza
            if (r0 == 0) goto L13
            r0 = r6
            awza r0 = (defpackage.awza) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awza r0 = new awza
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            batf r6 = r5.c
            bvdj r2 = defpackage.bvdj.PARTICIPANTS_TABLE_MY_IDENTITY
            batc r4 = new batc
            r4.<init>()
            eosc r6 = r6.c
            eiju r6 = defpackage.eijx.g(r4, r6)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L5a
        L4c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L57
            basj r6 = defpackage.basj.EXECUTE_UPGRADE
            return r6
        L57:
            basj r6 = defpackage.basj.DISABLED
            return r6
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awze.f(fcxy):java.lang.Object");
    }
}
