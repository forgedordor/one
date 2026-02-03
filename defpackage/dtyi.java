package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtyi extends ejtf {
    final /* synthetic */ dtyj a;

    public dtyi(dtyj dtyjVar) {
        this.a = dtyjVar;
    }

    @Override // defpackage.ejtf
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        dtyl dtylVar = (dtyl) obj;
        ((ekrd) ((ekrd) ((ekrd) dtyj.a.i()).g(th)).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugMainFragmentActionProviderImpl$1", "onFailure", 65, "MddDebugMainFragmentActionProviderImpl.java")).t("MDD Debug Action: %s failed", dtylVar != null ? dtylVar.a() : "UNKNOWN");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // defpackage.ejtf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            dtyl r5 = (defpackage.dtyl) r5
            java.lang.Void r6 = (java.lang.Void) r6
            java.lang.String r6 = "onSuccess"
            java.lang.String r0 = "com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugMainFragmentActionProviderImpl$1"
            java.lang.String r1 = "MddDebugMainFragmentActionProviderImpl.java"
            if (r5 != 0) goto L22
            ekrg r5 = defpackage.dtyj.a
            ekrw r5 = r5.j()
            ekrd r5 = (defpackage.ekrd) r5
            r2 = 43
            ekrw r5 = r5.h(r0, r6, r2, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "MDD Debug Action completed, but no ActionInfo was given. No additional operation will be performed"
            r5.q(r6)
            return
        L22:
            ekrg r2 = defpackage.dtyj.a
            ekrw r2 = r2.e()
            ekrd r2 = (defpackage.ekrd) r2
            r3 = 48
            ekrw r6 = r2.h(r0, r6, r3, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "MDD Debug Action succeeded: %s"
            r6.t(r0, r5)
            java.lang.String r5 = r5.a()
            int r6 = r5.hashCode()
            r0 = -1460314357(0xffffffffa8f55f0b, float:-2.7241682E-14)
            r1 = 2
            r2 = 1
            if (r6 == r0) goto L65
            r0 = -882694556(0xffffffffcb632664, float:-1.48865E7)
            if (r6 == r0) goto L5b
            r0 = 1160160022(0x4526a316, float:2666.1929)
            if (r6 == r0) goto L51
            goto L6f
        L51:
            java.lang.String r6 = "MDD.DEBUG.REFRESH_ACTION"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L6f
            r5 = r2
            goto L70
        L5b:
            java.lang.String r6 = "MDD.DEBUG.CLEAR_ACTION"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L6f
            r5 = 0
            goto L70
        L65:
            java.lang.String r6 = "MDD.DEBUG.TRIGGER_MDD_ACTION"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L6f
            r5 = r1
            goto L70
        L6f:
            r5 = -1
        L70:
            if (r5 == 0) goto L77
            if (r5 == r2) goto L77
            if (r5 == r1) goto L77
            goto L97
        L77:
            dtyj r5 = r4.a
            ea r5 = r5.b
            fr r5 = r5.I()
            r6 = 2131428319(0x7f0b03df, float:1.847828E38)
            ea r5 = r5.g(r6)
            dtxr r5 = (defpackage.dtxr) r5
            if (r5 == 0) goto L8f
            dtxy r5 = r5.a()
            goto L90
        L8f:
            r5 = 0
        L90:
            if (r5 == 0) goto L97
            dtxt r5 = r5.a
            r5.b()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtyi.b(java.lang.Object, java.lang.Object):void");
    }
}
