package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhm extends fcyy implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdjx c;
    final /* synthetic */ hcj d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhm(fdjx fdjxVar, hcj hcjVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = fdjxVar;
        this.d = hcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hhm) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0028 -> B:9:0x002b). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r6.a
            java.lang.Object r2 = r6.e
            ire r2 = (defpackage.ire) r2
            defpackage.fctl.b(r7)
            goto L2b
        L10:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.e
            ire r7 = (defpackage.ire) r7
            iru r1 = defpackage.iru.b
            r2 = r7
        L1a:
            r6.e = r2
            r6.a = r1
            r7 = 1
            r6.b = r7
            r7 = r1
            iru r7 = (defpackage.iru) r7
            java.lang.Object r7 = r2.r(r7, r6)
            if (r7 != r0) goto L2b
            return r0
        L2b:
            irs r7 = (defpackage.irs) r7
            java.util.List r3 = r7.a
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            ise r3 = (defpackage.ise) r3
            int r3 = r3.i
            r4 = 2
            boolean r3 = defpackage.ita.b(r3, r4)
            if (r3 == 0) goto L1a
            int r7 = r7.e
            r3 = 4
            boolean r3 = defpackage.irw.a(r7, r3)
            if (r3 == 0) goto L57
            fdjx r7 = r6.c
            hcj r3 = r6.d
            hhl r4 = new hhl
            r5 = 0
            r4.<init>(r3, r5)
            r3 = 3
            defpackage.fdil.d(r7, r5, r5, r4, r3)
            goto L1a
        L57:
            r3 = 5
            boolean r7 = defpackage.irw.a(r7, r3)
            if (r7 == 0) goto L1a
            hcj r7 = r6.d
            r7.b()
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hhm hhmVar = new hhm(this.c, this.d, fcxyVar);
        hhmVar.e = obj;
        return hhmVar;
    }
}
