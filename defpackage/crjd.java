package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crjd {
    public final crks a;
    private final fcyh b;
    private final fcyh c;
    private final cogw d;

    public crjd(fcyh fcyhVar, fcyh fcyhVar2, crks crksVar, cogw cogwVar) {
        fcyhVar.getClass();
        fcyhVar2.getClass();
        cogwVar.getClass();
        this.b = fcyhVar;
        this.c = fcyhVar2;
        this.a = crksVar;
        this.d = cogwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (defpackage.fdin.a(r10, r0, r6) == r7) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12, defpackage.ezan r13, defpackage.ezaj r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r1 = r15 instanceof defpackage.crjc
            if (r1 == 0) goto L13
            r1 = r15
            crjc r1 = (defpackage.crjc) r1
            int r2 = r1.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L13
            int r2 = r2 - r4
            r1.c = r2
            goto L18
        L13:
            crjc r1 = new crjc
            r1.<init>(r11, r15)
        L18:
            r6 = r1
            java.lang.Object r0 = r6.a
            fcyl r7 = defpackage.fcyl.a
            int r1 = r6.c
            r8 = 2
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L35
            if (r1 != r8) goto L2d
            defpackage.fctl.b(r0)
            goto Lb8
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            ezan r1 = r6.e
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r2 = r6.d
            defpackage.fctl.b(r0)
            r4 = r1
            r5 = r2
            goto L60
        L3f:
            defpackage.fctl.b(r0)
            brmz r0 = defpackage.crjq.c(r12, r13, r14)
            fcyh r1 = r11.c
            fcyh r1 = defpackage.eicg.a(r1)
            crja r4 = new crja
            r4.<init>(r9, r0)
            r6.d = r12
            r6.e = r13
            r6.c = r2
            java.lang.Object r1 = defpackage.fdin.a(r1, r4, r6)
            if (r1 == r7) goto Lc1
            r5 = r12
            r4 = r13
            r0 = r1
        L60:
            ekgb r0 = (defpackage.ekgb) r0
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.fcva.p(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L74:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r0.next()
            brlo r2 = (defpackage.brlo) r2
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData r2 = defpackage.bbez.a(r2)
            r1.add(r2)
            goto L74
        L88:
            ekgb r2 = defpackage.ekfv.a(r1)
            cogw r0 = r11.d
            ekgb r0 = defpackage.crhk.a(r2, r0)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto Lc0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc0
            fcyh r0 = r11.b
            fcyh r10 = defpackage.eicg.a(r0)
            crjb r0 = new crjb
            r1 = 0
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r9
            r6.e = r9
            r6.c = r8
            java.lang.Object r0 = defpackage.fdin.a(r10, r0, r6)
            if (r0 != r7) goto Lb8
            goto Lc1
        Lb8:
            int r0 = defpackage.ekgb.d
            ekgb r0 = defpackage.ekoe.a
            r0.getClass()
            return r0
        Lc0:
            return r2
        Lc1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crjd.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ezan, ezaj, fcxy):java.lang.Object");
    }
}
