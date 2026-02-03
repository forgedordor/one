package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aidb extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ aidc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidb(aidc aidcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = aidcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aidb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r7.d(r6) == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto L10
            defpackage.fctl.b(r7)
            if (r1 == r2) goto L48
            goto L54
        L10:
            java.lang.Object r1 = r6.a
            defpackage.fctl.b(r7)
            goto L36
        L16:
            defpackage.fctl.b(r7)
            aidc r7 = r6.c
            cogw r1 = r7.a
            j$.time.Instant r1 = r1.f()
            long r4 = r1.toEpochMilli()
            j$.time.Duration r1 = j$.time.Duration.ofMillis(r4)
            r1.getClass()
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r7.c(r1, r6)
            if (r7 == r0) goto L57
        L36:
            aidc r7 = r6.c
            r1.getClass()
            r3 = 0
            r6.a = r3
            r6.b = r2
            j$.time.Duration r1 = (j$.time.Duration) r1
            java.lang.Object r7 = r7.b(r1, r6)
            if (r7 == r0) goto L57
        L48:
            aidc r7 = r6.c
            r1 = 3
            r6.b = r1
            java.lang.Object r7 = r7.d(r6)
            if (r7 != r0) goto L54
            goto L57
        L54:
            fctx r7 = defpackage.fctx.a
            return r7
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aidb(this.c, fcxyVar);
    }
}
