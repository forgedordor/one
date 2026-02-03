package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alew extends fcyz implements fdat {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ aley c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alew(String str, aley aleyVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = str;
        this.c = aleyVar;
        this.d = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alew) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1.h(r2, r3, r4, r5, 0.0f, false, false, r10) == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r11
      0x0023: PHI (r11v5 java.lang.Object) = (r11v3 java.lang.Object), (r11v0 java.lang.Object) binds: [B:9:0x0021, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 1
            defpackage.fctl.b(r11)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L23
            goto L5d
        Ld:
            java.lang.String r11 = r10.b
            if (r11 == 0) goto L5d
            aley r1 = r10.c
            alev r3 = new alev
            r4 = 0
            r3.<init>(r1, r11, r4)
            r10.a = r2
            fcyh r11 = r1.a
            java.lang.Object r11 = defpackage.fdin.a(r11, r3, r10)
            if (r11 == r0) goto L5c
        L23:
            r2 = r11
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r2 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r2
            if (r2 == 0) goto L5d
            aley r11 = r10.c
            fcsu r11 = r11.c
            java.lang.Object r1 = r11.b()
            j$.util.Optional r1 = (j$.util.Optional) r1
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L5d
            java.lang.Object r11 = r11.b()
            j$.util.Optional r11 = (j$.util.Optional) r11
            java.lang.Object r11 = r11.get()
            r1 = r11
            crbi r1 = (defpackage.crbi) r1
            boolean r5 = r10.d
            elqn r3 = defpackage.elqn.P2P_SUGGESTION_CLICK
            eyzv r4 = defpackage.eyzv.CONVERSATION_VIEW
            r11 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            r11 = 2
            r10.a = r11
            r6 = 0
            r8 = r7
            r9 = r10
            java.lang.Object r11 = r1.h(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L5d
        L5c:
            return r0
        L5d:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alew.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alew(this.b, this.c, this.d, fcxyVar);
    }
}
