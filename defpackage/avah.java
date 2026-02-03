package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avah extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    long f;
    int g;
    final /* synthetic */ fdpl h;
    final /* synthetic */ int i;
    final /* synthetic */ long j;
    final /* synthetic */ fdpm k;
    final /* synthetic */ fdat l;
    private /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avah(fdpl fdplVar, int i, long j, fdpm fdpmVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.h = fdplVar;
        this.i = i;
        this.j = j;
        this.k = fdpmVar;
        this.l = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avah) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0086 -> B:13:0x0088). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            r14 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r14.g
            if (r1 == 0) goto L1b
            long r1 = r14.f
            int r3 = r14.e
            java.lang.Object r4 = r14.d
            java.lang.Object r5 = r14.c
            java.lang.Object r6 = r14.b
            java.lang.Object r7 = r14.a
            java.lang.Object r8 = r14.m
            fdcg r8 = (defpackage.fdcg) r8
            defpackage.fctl.b(r15)
            goto L88
        L1b:
            defpackage.fctl.b(r15)
            java.lang.Object r15 = r14.m
            fdjx r15 = (defpackage.fdjx) r15
            fdcg r1 = new fdcg
            r1.<init>()
            fdce r2 = new fdce
            r2.<init>()
            fdpl r3 = r14.h
            r4 = 0
            r5 = 2
            fdpl r3 = defpackage.fdpn.a(r3, r4, r5)
            fdou r15 = defpackage.fdpw.b(r3, r15)
            int r3 = r14.i
            long r4 = r14.j
            fdpm r6 = r14.k
            fdat r7 = r14.l
            r8 = r1
            r12 = r6
            r6 = r15
            r13 = r7
            r7 = r2
            r1 = r4
            r5 = r12
            r4 = r13
        L48:
            feaq r15 = new feaq
            fcyh r9 = r14.u()
            r15.<init>(r9)
            feam r9 = r6.B()
            avaf r10 = new avaf
            r11 = 0
            r10.<init>(r8, r5, r11)
            r15.a(r9, r10)
            r9 = r7
            fdce r9 = (defpackage.fdce) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L71
            int r10 = r8.a
            if (r10 > r3) goto L71
            avag r10 = new avag
            r10.<init>(r4, r5, r9, r11)
            defpackage.feak.b(r15, r1, r10)
        L71:
            r14.m = r8
            r14.a = r7
            r14.b = r6
            r14.c = r5
            r14.d = r4
            r14.e = r3
            r14.f = r1
            r9 = 1
            r14.g = r9
            java.lang.Object r15 = defpackage.feaq.d(r15, r14)
            if (r15 == r0) goto L94
        L88:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L91
            goto L48
        L91:
            fctx r15 = defpackage.fctx.a
            return r15
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avah.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avah avahVar = new avah(this.h, this.i, this.j, this.k, this.l, fcxyVar);
        avahVar.m = obj;
        return avahVar;
    }
}
