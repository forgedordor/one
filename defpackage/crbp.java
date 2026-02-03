package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crbp extends fcyz implements fdat {
    int a;
    final /* synthetic */ crcm b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crbp(fcxy fcxyVar, crcm crcmVar, String str) {
        super(2, fcxyVar);
        this.b = crcmVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crbp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r1.h(r2, r3, r4, false, -1.0f, null, null, r10) == r0) goto L15;
     */
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
            if (r1 == r2) goto L29
            goto L44
        Ld:
            java.lang.Object r11 = r10.d
            fdjx r11 = (defpackage.fdjx) r11
            crcm r11 = r10.b
            java.lang.String r1 = r10.c
            fcyh r3 = r11.c
            fcyh r3 = defpackage.eicg.a(r3)
            crbq r4 = new crbq
            r5 = 0
            r4.<init>(r5, r11, r1)
            r10.a = r2
            java.lang.Object r11 = defpackage.fdin.a(r3, r4, r10)
            if (r11 == r0) goto L47
        L29:
            r2 = r11
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r2 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r2
            if (r2 == 0) goto L44
            crcm r1 = r10.b
            elqn r3 = defpackage.elqn.P2P_SUGGESTION_CALENDAR_EVENT_SAVED
            eyzv r4 = defpackage.eyzv.CONVERSATION_VIEW
            r11 = 2
            r10.a = r11
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = r10
            java.lang.Object r11 = r1.h(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L44
            goto L47
        L44:
            fctx r11 = defpackage.fctx.a
            return r11
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crbp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crbp crbpVar = new crbp(fcxyVar, this.b, this.c);
        crbpVar.d = obj;
        return crbpVar;
    }
}
