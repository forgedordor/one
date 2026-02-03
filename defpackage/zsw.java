package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsw extends fcyz implements fdap {
    int a;
    final /* synthetic */ alff b;
    final /* synthetic */ ztv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsw(alff alffVar, ztv ztvVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = alffVar;
        this.c = ztvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 0
            r3 = 1
            defpackage.fctl.b(r8)
            if (r1 == 0) goto Lc
            goto L3f
        Lc:
            alff r8 = r7.b
            alfd r1 = r8.a()
            alfd r4 = defpackage.alfd.e
            if (r1 != r4) goto L49
            ztv r1 = r7.c
            alfe r8 = (defpackage.alfe) r8
            r7.a = r3
            java.lang.String r4 = r8.d()
            if (r4 != 0) goto L27
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            goto L3c
        L27:
            java.lang.String r8 = r8.e()
            r5 = 11
            r1.m(r5)
            fcsu r1 = r1.E
            java.lang.Object r1 = r1.b()
            aspd r1 = (defpackage.aspd) r1
            java.lang.Object r8 = r1.a(r4, r8, r7)
        L3c:
            if (r8 != r0) goto L3f
            return r0
        L3f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L49
        L47:
            r2 = r3
            goto L97
        L49:
            ztv r8 = r7.c
            alff r0 = r7.b
            alfe r0 = (defpackage.alfe) r0
            java.lang.String r0 = r0.d()
            if (r0 == 0) goto L69
            int r1 = r0.length()
            if (r1 != 0) goto L5c
            goto L69
        L5c:
            fcsu r1 = r8.v
            java.lang.Object r1 = r1.b()
            cpbz r1 = (defpackage.cpbz) r1
            android.content.Intent r0 = r1.c(r0)
            goto L83
        L69:
            ekrg r0 = defpackage.ztv.a
            ekrw r0 = r0.h()
            r1 = 1182(0x49e, float:1.656E-42)
            java.lang.String r4 = "SuggestionUiAdapterImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl"
            java.lang.String r6 = "getWebIntent"
            ekrw r0 = r0.h(r5, r6, r1, r4)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "suggestion type web has empty uri. Cannot create web intent."
            r0.q(r1)
            r0 = 0
        L83:
            if (r0 == 0) goto L97
            fcsu r1 = r8.v
            java.lang.Object r1 = r1.b()
            cpbz r1 = (defpackage.cpbz) r1
            boolean r0 = r1.e(r0)
            if (r0 == 0) goto L97
            r8.m(r3)
            goto L47
        L97:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new zsw(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
