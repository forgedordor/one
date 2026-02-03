package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alcf extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ alcm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alcf(alcm alcmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = alcmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alcf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r6 == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r6)
            goto L4e
        Ld:
            java.lang.Object r1 = r5.b
            java.lang.Object r3 = r5.a
            defpackage.fctl.b(r6)
            goto L3d
        L15:
            defpackage.fctl.b(r6)
            alcm r6 = r5.d
            alce r3 = new alce
            r3.<init>(r6)
            cmyk r1 = r6.f
            if (r1 != 0) goto L25
            cmxz r1 = r6.b
        L25:
            fcsu r4 = r6.d
            java.lang.Object r4 = r4.b()
            crjd r4 = (defpackage.crjd) r4
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r6 = r6.g
            r5.a = r3
            r5.b = r1
            r5.c = r2
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = r6.a
            java.lang.Object r6 = defpackage.crjd.b(r4, r6, r5)
            if (r6 == r0) goto L89
        L3d:
            java.util.List r6 = (java.util.List) r6
            r4 = 0
            r5.a = r4
            r5.b = r4
            r4 = 2
            r5.c = r4
            java.lang.Object r6 = r1.a(r6, r3, r2, r5)
            if (r6 != r0) goto L4e
            goto L89
        L4e:
            alcm r0 = r5.d
            fcsu r0 = r0.e
            r1 = r6
            ekgb r1 = (defpackage.ekgb) r1
            java.lang.Object r0 = r0.b()
            crif r0 = (defpackage.crif) r0
            ezai r2 = defpackage.ezai.SHOWN
            r0.o(r1, r2)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L71:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r6.next()
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r1 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r1
            r1.getClass()
            r0.add(r1)
            goto L71
        L84:
            ekgb r6 = defpackage.ekfv.a(r0)
            return r6
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alcf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alcf(this.d, fcxyVar);
    }
}
