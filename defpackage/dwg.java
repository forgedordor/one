package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwg extends fcyy implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdae c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwg(fdae fdaeVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dwg) c((fdex) obj, (fcxy) obj2)).b(fctx.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002b -> B:12:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r3.a
            java.lang.Object r2 = r3.d
            fdex r2 = (defpackage.fdex) r2
            defpackage.fctl.b(r4)
            goto L2f
        L10:
            defpackage.fctl.b(r4)
            java.lang.Object r4 = r3.d
            fdex r4 = (defpackage.fdex) r4
            r2 = r4
        L18:
            fdae r4 = r3.c
            java.lang.Object r1 = r4.invoke()
            if (r1 == 0) goto L2e
            r3.d = r2
            r3.a = r1
            r4 = 1
            r3.b = r4
            java.lang.Object r4 = r2.a(r1, r3)
            if (r4 != r0) goto L2f
            return r0
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            goto L18
        L32:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dwg dwgVar = new dwg(this.c, fcxyVar);
        dwgVar.d = obj;
        return dwgVar;
    }
}
