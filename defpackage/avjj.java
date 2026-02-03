package defpackage;

import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avjj implements avjf {
    public static final eksp a = eksp.c("BugleContacts");
    public final egsh b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;

    public avjj(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, egsh egshVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        egshVar.getClass();
        fcsuVar6.getClass();
        fcsuVar8.getClass();
        this.e = fdjxVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.b = egshVar;
        this.c = fcsuVar6;
        this.j = fcsuVar7;
        this.d = fcsuVar8;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.avjf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.avjg
            if (r0 == 0) goto L13
            r0 = r8
            avjg r0 = (defpackage.avjg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avjg r0 = new avjg
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 4
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            eieu r0 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L70
        L2d:
            r8 = move-exception
            goto L7c
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            eieu r2 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L3e
            r8 = r2
            goto L5c
        L3e:
            r8 = move-exception
            r0 = r2
            goto L7c
        L41:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "ContactsSync#forceSync"
            eieu r8 = defpackage.eiiy.h(r8)
            fcsu r2 = r7.h     // Catch: java.lang.Throwable -> L78
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L78
            avii r2 = (defpackage.avii) r2     // Catch: java.lang.Throwable -> L78
            r0.d = r8     // Catch: java.lang.Throwable -> L78
            r0.c = r5     // Catch: java.lang.Throwable -> L78
            java.lang.Object r2 = r2.a(r3, r0)     // Catch: java.lang.Throwable -> L78
            if (r2 == r1) goto L77
        L5c:
            fcsu r2 = r7.i     // Catch: java.lang.Throwable -> L78
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L78
            avjo r2 = (defpackage.avjo) r2     // Catch: java.lang.Throwable -> L78
            r0.d = r8     // Catch: java.lang.Throwable -> L78
            r0.c = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r2.a(r3, r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L6f
            goto L77
        L6f:
            r0 = r8
        L70:
            r8 = 0
            defpackage.fczl.a(r0, r8)
            fctx r8 = defpackage.fctx.a
            return r8
        L77:
            return r1
        L78:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7c:
            throw r8     // Catch: java.lang.Throwable -> L7d
        L7d:
            r1 = move-exception
            defpackage.fczl.a(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avjj.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.avjf
    public final void b() {
        if (((avbt) this.j.b()).a()) {
            ((eksl) a.h()).q("Registering contacts observers");
            avih avihVar = (avih) this.f.b();
            ((egxv) avihVar.b.b()).d(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, false, avihVar);
            avjn avjnVar = (avjn) this.g.b();
            ((egxv) avjnVar.b.b()).d(ContactsContract.DeletedContacts.CONTENT_URI, false, avjnVar);
            auvw.k(this.e, null, null, new avjh(this, null), 3);
        }
    }

    @Override // defpackage.avjf
    public final void c() {
        ((eksl) a.h()).q("Unregistering contacts observers");
        ((avih) this.f.b()).b();
        ((avjn) this.g.b()).b();
        auvw.k(this.e, null, null, new avji(this, null), 3);
    }
}
