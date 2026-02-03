package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fju extends fcyy implements fdat {
    int a;
    final /* synthetic */ fdap b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fju(fdap fdapVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fju) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0021 -> B:9:0x0024). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r4.c
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r5)
            goto L24
        Lf:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.c
            ire r5 = (defpackage.ire) r5
            r1 = r5
        L17:
            iru r5 = defpackage.iru.a
            r4.c = r1
            r4.a = r2
            java.lang.Object r5 = r1.r(r5, r4)
            if (r5 != r0) goto L24
            return r0
        L24:
            irs r5 = (defpackage.irs) r5
            boolean r5 = defpackage.fjw.g(r5)
            r5 = r5 ^ r2
            fdap r3 = r4.b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3.invoke(r5)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fju.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fju fjuVar = new fju(this.b, fcxyVar);
        fjuVar.c = obj;
        return fjuVar;
    }
}
