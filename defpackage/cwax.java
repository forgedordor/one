package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwax extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cway c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwax(cway cwayVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = cwayVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cwax cwaxVar = new cwax(this.c, (fcxy) obj3);
        cwaxVar.a = (ajlk) obj;
        cwaxVar.b = (ekgb) obj2;
        return cwaxVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.a
            java.lang.Object r0 = r4.b
            cway r1 = r4.c
            fcsu r2 = r1.d
            java.lang.Object r2 = r2.b()
            cphz r2 = (defpackage.cphz) r2
            ekgb r0 = (defpackage.ekgb) r0
            dkpf r5 = r2.b(r5, r0)
            r0 = 0
            if (r5 == 0) goto L29
            android.net.Uri r2 = r5.a
            java.lang.String r2 = r2.toString()
            r2.getClass()
            int r2 = r2.length()
            if (r2 > 0) goto L2a
        L29:
            r5 = r0
        L2a:
            cwaw r2 = new cwaw
            r2.<init>()
            cwba r1 = new cwba
            cwaz r3 = new cwaz
            r3.<init>(r0)
            r1.<init>(r5, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwax.b(java.lang.Object):java.lang.Object");
    }
}
