package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnzj extends fcyz implements fdat {
    int a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dnzl e;
    final /* synthetic */ dnzg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnzj(dnzl dnzlVar, dnzg dnzgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = dnzlVar;
        this.f = dnzgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnzj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002f -> B:11:0x0032). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.d
            if (r1 == 0) goto L10
            int r1 = r8.a
            java.lang.Object r2 = r8.c
            java.lang.Object r3 = r8.b
            defpackage.fctl.b(r9)
            goto L32
        L10:
            defpackage.fctl.b(r9)
            dnzl r9 = r8.e
            fdoa r9 = r9.d
            if (r9 == 0) goto L95
            fdoc r9 = r9.r()
            r1 = 0
            r2 = 0
            r3 = r1
            r1 = r2
            r2 = r9
        L22:
            r8.b = r3
            r8.c = r2
            r8.a = r1
            r9 = 1
            r8.d = r9
            java.lang.Object r9 = r2.a(r8)
            if (r9 != r0) goto L32
            return r0
        L32:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L78
            java.lang.Object r9 = r2.b()
            dnzm r9 = (defpackage.dnzm) r9
            if (r3 != 0) goto L43
            goto L76
        L43:
            int r1 = r1 + 1
            dnzl r4 = r8.e
            j$.time.Duration r5 = r9.a
            dnzm r3 = (defpackage.dnzm) r3
            j$.time.Duration r6 = r3.a
            rcl r7 = r4.a()
            j$.time.Duration r5 = r5.minus(r6)
            r5.getClass()
            long r5 = r5.toMillis()
            int r5 = (int) r5
            float r5 = (float) r5
            r6 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)
            r7.c = r5
            dnzg r5 = r8.f
            android.graphics.Bitmap r3 = r3.b
            rcl r4 = r4.a()
            android.graphics.Bitmap r3 = r5.a(r3)
            r4.b(r3)
        L76:
            r3 = r9
            goto L22
        L78:
            if (r3 == 0) goto L8f
            int r1 = r1 + 1
            dnzl r9 = r8.e
            dnzg r0 = r8.f
            dnzm r3 = (defpackage.dnzm) r3
            android.graphics.Bitmap r2 = r3.b
            rcl r9 = r9.a()
            android.graphics.Bitmap r0 = r0.a(r2)
            r9.b(r0)
        L8f:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r1)
            return r9
        L95:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnzj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnzj(this.e, this.f, fcxyVar);
    }
}
