package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzpg implements bzox {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreDelegateImpl");
    public final bzph b;
    public final bzpj c;
    public final bzpm d;
    public final bzpl e;
    public final bzpi f;
    public final bzpk g;
    public final cazj h;
    private final aurx i;
    private final fdjx j;
    private final fcyh k;
    private final aqef l;
    private final byeq m;

    public bzpg(bzph bzphVar, bzpj bzpjVar, bzpm bzpmVar, bzpl bzplVar, bzpi bzpiVar, bzpk bzpkVar, aurx aurxVar, byeq byeqVar, fdjx fdjxVar, fcyh fcyhVar, cazj cazjVar, aqef aqefVar) {
        aurxVar.getClass();
        byeqVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        cazjVar.getClass();
        this.b = bzphVar;
        this.c = bzpjVar;
        this.d = bzpmVar;
        this.e = bzplVar;
        this.f = bzpiVar;
        this.g = bzpkVar;
        this.i = aurxVar;
        this.m = byeqVar;
        this.j = fdjxVar;
        this.k = fcyhVar;
        this.h = cazjVar;
        this.l = aqefVar;
    }

    public static final cbcu i(cand candVar, boolean z, boolean z2, String str) {
        caxr caxrVar = new caxr();
        if (str != null) {
            caxrVar.b = str;
        }
        return (z && z2) ? cbcu.g("cms_local_media_restore_requiring_wifi_and_battery_not_low", candVar, caxrVar.a()) : z ? cbcu.g("cms_local_media_restore_requiring_wifi", candVar, caxrVar.a()) : z2 ? cbcu.g("cms_local_media_restore_requiring_battery_not_low", candVar, caxrVar.a()) : cbcu.g("cms_local_media_restore", candVar, caxrVar.a());
    }

    @Override // defpackage.bzox
    public final eiju a(String str, int i) {
        str.getClass();
        return auvw.c(this.j, fcyi.a, fdjz.a, new bzpe(this, str, i, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bzox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final boolean r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bzpf
            if (r0 == 0) goto L13
            r0 = r7
            bzpf r0 = (defpackage.bzpf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bzpf r0 = new bzpf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "resetQueuesForWifiSettingChange"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            boolean r6 = r0.a
            defpackage.fctl.b(r7)
            goto L4f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            byeq r7 = r5.m
            bzoy r2 = new bzoy
            r2.<init>()
            eiju r7 = r7.a(r3, r2)
            r7.getClass()
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.lang.Integer r7 = (java.lang.Integer) r7
            ekrg r0 = defpackage.bzpg.a
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleCmsMediaRestore"
            r0.X(r1, r2)
            r1 = 174(0xae, float:2.44E-43)
            java.lang.String r2 = "CmsLocalMediaRestoreDelegateImpl.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreDelegateImpl"
            ekrw r0 = r0.h(r4, r3, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            r7.getClass()
            java.lang.String r1 = "Re-enqueued media restore for %d parts. requireWifi=%s"
            int r7 = r7.intValue()
            r0.x(r1, r7, r6)
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzpg.b(boolean, fcxy):java.lang.Object");
    }

    @Override // defpackage.bzox
    public final void c() {
        ((cazj) this.b.a.b()).f("cms_local_media_restore");
        ((cazj) this.c.a.b()).f("cms_local_media_restore_requiring_charging");
        ((cazj) this.d.a.b()).f("cms_local_media_restore_requiring_wifi");
        ((cazj) this.e.a.b()).f("cms_local_media_restore_requiring_wifi_and_charging");
        ((cazj) this.f.a.b()).f("cms_local_media_restore_requiring_battery_not_low");
        ((cazj) this.g.a.b()).f("cms_local_media_restore_requiring_wifi_and_battery_not_low");
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleCmsMediaRestore");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreDelegateImpl", "cancelAllPending", 193, "CmsLocalMediaRestoreDelegateImpl.kt")).q("Cancelled all queued media restores.");
    }

    @Override // defpackage.bzox
    public final void d(String str, int i, boolean z, boolean z2) {
        str.getClass();
        camy camyVar = (camy) cand.a.createBuilder();
        camyVar.getClass();
        caiz.b(i, camyVar);
        caiz.c(str, camyVar);
        this.h.a(i(caiz.a(camyVar), z, z2, str));
    }

    @Override // defpackage.bzox
    public final eiju e(String str, int i) {
        str.getClass();
        return auvw.c(this.j, fcyi.a, fdjz.a, new bzpc(this, str, i, null));
    }

    @Override // defpackage.bzox
    public final void f(List list, int i, boolean z) {
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            camy camyVar = (camy) cand.a.createBuilder();
            camyVar.getClass();
            caiz.b(i, camyVar);
            caiz.c(str, camyVar);
            arrayList.add(i(caiz.a(camyVar), z, true, str));
        }
        this.h.d(ekfv.a(arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0186, code lost:
    
        if (defpackage.fdin.a(r12, r0, r7) != r8) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.bzox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r17, defpackage.evvp r18, int r19, boolean r20, int r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzpg.g(int, evvp, int, boolean, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r14, int r15, boolean r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzpg.h(java.lang.String, int, boolean, fcxy):java.lang.Object");
    }
}
