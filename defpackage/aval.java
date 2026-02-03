package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aval extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    long e;
    int f;
    final /* synthetic */ fdpl g;
    final /* synthetic */ long h;
    final /* synthetic */ fdpm i;
    final /* synthetic */ fdau j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aval(fdpl fdplVar, long j, fdpm fdpmVar, fdau fdauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.g = fdplVar;
        this.h = j;
        this.i = fdpmVar;
        this.j = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aval) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0081 -> B:13:0x0083). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.f
            if (r1 == 0) goto L1b
            long r1 = r13.e
            java.lang.Object r3 = r13.d
            java.lang.Object r4 = r13.c
            java.lang.Object r5 = r13.b
            java.lang.Object r6 = r13.a
            java.lang.Object r7 = r13.k
            fdcg r7 = (defpackage.fdcg) r7
            defpackage.fctl.b(r14)
            r10 = r3
            r9 = r4
            r8 = r7
            goto L83
        L1b:
            defpackage.fctl.b(r14)
            java.lang.Object r14 = r13.k
            fdjx r14 = (defpackage.fdjx) r14
            fdcg r1 = new fdcg
            r1.<init>()
            fdce r2 = new fdce
            r2.<init>()
            fdpl r3 = r13.g
            r4 = 0
            r5 = 2
            fdpl r3 = defpackage.fdpn.a(r3, r4, r5)
            fdou r14 = defpackage.fdpw.b(r3, r14)
            long r3 = r13.h
            fdpm r5 = r13.i
            fdau r6 = r13.j
            r8 = r1
            r9 = r5
            r10 = r6
            r5 = r14
            r6 = r2
            r1 = r3
        L44:
            feaq r14 = new feaq
            fcyh r3 = r13.u()
            r14.<init>(r3)
            feam r3 = r5.B()
            avaj r7 = new avaj
            r11 = r6
            fdce r11 = (defpackage.fdce) r11
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r14.a(r3, r7)
            boolean r3 = r11.a
            if (r3 != 0) goto L6e
            int r3 = r8.a
            if (r3 > 0) goto L6e
            avak r3 = new avak
            r4 = 0
            r3.<init>(r10, r9, r11, r4)
            defpackage.feak.b(r14, r1, r3)
        L6e:
            r13.k = r8
            r13.a = r6
            r13.b = r5
            r13.c = r9
            r13.d = r10
            r13.e = r1
            r3 = 1
            r13.f = r3
            java.lang.Object r14 = defpackage.feaq.d(r14, r13)
            if (r14 == r0) goto L8f
        L83:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L8c
            goto L44
        L8c:
            fctx r14 = defpackage.fctx.a
            return r14
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aval.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aval avalVar = new aval(this.g, this.h, this.i, this.j, fcxyVar);
        avalVar.k = obj;
        return avalVar;
    }
}
