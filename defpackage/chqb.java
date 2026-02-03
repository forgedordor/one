package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chqb extends fcyz implements fdat {
    int a;
    final /* synthetic */ chqg b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chqb(fcxy fcxyVar, chqg chqgVar) {
        super(2, fcxyVar);
        this.b = chqgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chqb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Lb
            goto L1c
        Lb:
            java.lang.Object r7 = r6.c
            fdjx r7 = (defpackage.fdjx) r7
            chqg r7 = r6.b
            r6.a = r2
            fdap r7 = r7.c
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r0) goto L1c
            return r0
        L1c:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = r0
        L24:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r7.next()
            bojh r3 = (defpackage.bojh) r3
            chqg r4 = r6.b
            fcsu r4 = r4.b
            java.lang.Object r4 = r4.b()
            bakt r4 = (defpackage.bakt) r4
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r3.C()
            java.util.List r4 = r4.K(r5)
            boolean r3 = defpackage.chqa.a(r3)
            if (r3 == 0) goto L6c
            r4.getClass()
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L52
            goto L6c
        L52:
            java.util.Iterator r3 = r4.iterator()
        L56:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r3.next()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r4
            chpq r4 = r4.G()
            chpq r5 = defpackage.chpq.PROFILE_PEOPLE_SHARING_SOURCE
            if (r4 != r5) goto L56
            r3 = r2
            goto L6d
        L6c:
            r3 = r0
        L6d:
            int r3 = defpackage.chqa.b(r3)
            int r1 = r1 + r3
            goto L24
        L73:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chqb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chqb chqbVar = new chqb(fcxyVar, this.b);
        chqbVar.c = obj;
        return chqbVar;
    }
}
