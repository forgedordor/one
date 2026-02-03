package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daqd extends fcyz implements fdat {
    int a;
    final /* synthetic */ aeum b;
    final /* synthetic */ daql c;
    Object d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daqd(fcxy fcxyVar, aeum aeumVar, daql daqlVar) {
        super(2, fcxyVar);
        this.b = aeumVar;
        this.c = daqlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daqd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005d -> B:11:0x005e). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            if (r1 == 0) goto L12
            java.lang.Object r1 = r5.e
            java.lang.Object r2 = r5.d
            java.lang.Object r3 = r5.f
            java.util.Collection r3 = (java.util.Collection) r3
            defpackage.fctl.b(r6)
            goto L5e
        L12:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.f
            fdjx r6 = (defpackage.fdjx) r6
            aeum r6 = r5.b
            ekgb r6 = r6.z()
            r6.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.fcva.p(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
        L32:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r2.next()
            adtz r6 = (defpackage.adtz) r6
            daql r3 = r5.c
            eksp r4 = defpackage.daql.a
            fcsu r4 = r3.b
            java.lang.Object r4 = r4.b()
            cogw r4 = (defpackage.cogw) r4
            acyx r6 = defpackage.acyx.aj(r6, r4)
            r5.f = r1
            r5.d = r2
            r5.e = r1
            r4 = 1
            r5.a = r4
            java.lang.Object r6 = r3.d(r6, r5)
            if (r6 == r0) goto L65
            r3 = r1
        L5e:
            cszp r6 = (defpackage.cszp) r6
            r1.add(r6)
            r1 = r3
            goto L32
        L65:
            return r0
        L66:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daqd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        daqd daqdVar = new daqd(fcxyVar, this.b, this.c);
        daqdVar.f = obj;
        return daqdVar;
    }
}
