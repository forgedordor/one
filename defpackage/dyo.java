package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyo extends fcyy implements fdat {
    long a;
    int b;
    final /* synthetic */ ise c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyo(ise iseVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = iseVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dyo) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0033 -> B:8:0x0035). Please report as a decompilation issue!!! */
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
            long r1 = r6.a
            java.lang.Object r3 = r6.d
            ire r3 = (defpackage.ire) r3
            defpackage.fctl.b(r7)
            goto L35
        L10:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.d
            ire r7 = (defpackage.ire) r7
            ise r1 = r6.c
            jou r2 = r7.q()
            r2.h()
            long r1 = r1.b
            r3 = 40
            long r1 = r1 + r3
            r3 = r7
        L26:
            r6.d = r3
            r6.a = r1
            r7 = 1
            r6.b = r7
            r7 = 0
            r4 = 3
            java.lang.Object r7 = defpackage.dzm.g(r3, r7, r6, r4)
            if (r7 == r0) goto L3f
        L35:
            ise r7 = (defpackage.ise) r7
            long r4 = r7.b
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L3e
            goto L26
        L3e:
            return r7
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dyo dyoVar = new dyo(this.c, fcxyVar);
        dyoVar.d = obj;
        return dyoVar;
    }
}
