package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zci extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ fduf h;
    final /* synthetic */ fduj i;
    final /* synthetic */ ajlt j;
    final /* synthetic */ zcj k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zci(fduf fdufVar, fduj fdujVar, ajlt ajltVar, zcj zcjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.h = fdufVar;
        this.i = fdujVar;
        this.j = ajltVar;
        this.k = zcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zci) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x003e -> B:9:0x0041). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.g
            if (r1 == 0) goto L16
            java.lang.Object r1 = r11.f
            java.lang.Object r2 = r11.e
            java.lang.Object r3 = r11.d
            java.lang.Object r4 = r11.c
            java.lang.Object r5 = r11.b
            java.lang.Object r6 = r11.a
            defpackage.fctl.b(r12)
            goto L41
        L16:
            defpackage.fctl.b(r12)
            fduf r12 = r11.h
            fduj r1 = r11.i
            ajlt r2 = r11.j
            zcj r3 = r11.k
            r6 = r12
            r5 = r1
            r4 = r2
        L24:
            java.lang.Object r2 = r6.c()
            r1 = r2
            dkzl r1 = (defpackage.dkzl) r1
            r11.a = r6
            r11.b = r5
            r11.c = r4
            r11.d = r3
            r11.e = r2
            r11.f = r1
            r12 = 1
            r11.g = r12
            java.lang.Object r12 = defpackage.fdtc.a(r5, r11)
            if (r12 != r0) goto L41
            return r0
        L41:
            bxfb r12 = (defpackage.bxfb) r12
            r7 = 0
            if (r12 == 0) goto L49
            java.lang.String r8 = r12.a
            goto L4a
        L49:
            r8 = r7
        L4a:
            if (r12 == 0) goto L4e
            android.net.Uri r7 = r12.b
        L4e:
            if (r8 == 0) goto L77
            if (r7 == 0) goto L77
            r12 = r3
            zcj r12 = (defpackage.zcj) r12
            android.content.Context r12 = r12.a
            int r9 = defpackage.zvy.a
            r4.getClass()
            dkzn r9 = new dkzn
            ajmc r10 = r4.d()
            java.lang.String r12 = defpackage.zvy.b(r10, r12)
            dkzt r10 = new dkzt
            r10.<init>(r7)
            r9.<init>(r12, r8, r10)
            dkzl r1 = (defpackage.dkzl) r1
            fdae r12 = r1.b
            dkzl r1 = new dkzl
            r1.<init>(r9, r12)
        L77:
            boolean r12 = r6.g(r2, r1)
            if (r12 != 0) goto L7e
            goto L24
        L7e:
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zci.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zci(this.h, this.i, this.j, this.k, fcxyVar);
    }
}
