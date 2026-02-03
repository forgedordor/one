package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvot implements bvos {
    public final fcsu a;
    public final egej b;
    public final fcsu c;
    public final fcsu d;
    public final cqce e;
    public final ekrg f;
    private final Context g;
    private final fdjx h;

    /* compiled from: PG */
    public interface a {
        bvmv aI();
    }

    public bvot(Context context, fdjx fdjxVar, fcsu fcsuVar, egej egejVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        egejVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.g = context;
        this.h = fdjxVar;
        this.a = fcsuVar;
        this.b = egejVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = cqce.g("BugleGDitto", "GaiaDevicePairingOptOutManagerImpl");
        this.f = ekrg.c("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingOptOutManagerImpl");
    }

    @Override // defpackage.bvos
    public final eiju a() {
        return auvw.c(this.h, fcyi.a, fdjz.a, new bvou(this, null));
    }

    @Override // defpackage.bvos
    public final eiju b(efwo efwoVar) {
        efwoVar.getClass();
        return auvw.c(this.h, fcyi.a, fdjz.a, new bvow(efwoVar, this, null));
    }

    @Override // defpackage.bvos
    public final eiju c(egbv egbvVar) {
        return auvw.c(this.h, fcyi.a, fdjz.a, new bvoy(egbvVar, this, null));
    }

    @Override // defpackage.bvos
    public final eiju d(efwo efwoVar) {
        return auvw.c(this.h, fcyi.a, fdjz.a, new bvpd(this, efwoVar, null));
    }

    public final a e(efwo efwoVar) {
        Object objA = ehlh.a(this.g, a.class, efwoVar);
        objA.getClass();
        return (a) objA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r11.k(4, r10, true, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.bvoz
            if (r0 == 0) goto L13
            r0 = r11
            bvoz r0 = (defpackage.bvoz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvoz r0 = new bvoz
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 4
            r4 = 2
            r5 = 0
            r6 = 3
            r7 = 1
            if (r2 == 0) goto L43
            if (r2 == r7) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r6) goto L2f
            defpackage.fctl.b(r11)
            goto L7b
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.String r10 = r0.d
            defpackage.fctl.b(r11)
            goto L6a
        L3d:
            java.lang.String r10 = r0.d
            defpackage.fctl.b(r11)
            goto L57
        L43:
            defpackage.fctl.b(r11)
            bvpo r11 = defpackage.bvpp.a
            bvpa r2 = new bvpa
            r2.<init>(r9, r5)
            r0.d = r10
            r0.c = r7
            java.lang.Object r11 = r11.a(r10, r6, r2, r0)
            if (r11 == r1) goto L7e
        L57:
            efwo r11 = (defpackage.efwo) r11
            bvpo r2 = defpackage.bvpp.a
            bvpb r8 = new bvpb
            r8.<init>(r9, r5)
            r0.d = r10
            r0.c = r4
            java.lang.Object r11 = r2.a(r11, r3, r8, r0)
            if (r11 == r1) goto L7e
        L6a:
            bvot$a r11 = (bvot.a) r11
            bvmv r11 = r11.aI()
            r0.d = r5
            r0.c = r6
            java.lang.Object r10 = r11.k(r3, r10, r7, r0)
            if (r10 != r1) goto L7b
            goto L7e
        L7b:
            fctx r10 = defpackage.fctx.a
            return r10
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvot.f(java.lang.String, fcxy):java.lang.Object");
    }

    public final void g(String str, bvpp bvppVar) {
        this.e.s("GaiaPairingOptOutException while opting out Gaia device pairing", bvppVar);
        fcsu fcsuVar = this.c;
        ((ains) fcsuVar.b()).e("Bugle.Gaia.Pairing.Disabled.Count", 2);
        ains ainsVar = (ains) fcsuVar.b();
        int i = bvppVar.b;
        if (i == 0) {
            throw null;
        }
        ainsVar.e(str, i - 1);
    }

    public final void h(String str, Throwable th) {
        this.e.s("Unknown error while opting out Gaia device pairing", th);
        fcsu fcsuVar = this.c;
        ((ains) fcsuVar.b()).e("Bugle.Gaia.Pairing.Disabled.Count", 2);
        ((ains) fcsuVar.b()).e(str, 0);
    }
}
