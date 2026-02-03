package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnaq extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    int f;
    final /* synthetic */ dnau g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnaq(dnau dnauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.g = dnauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnaq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (r1.e(r2, r7) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005e -> B:13:0x005f). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L11
            int r0 = r7.e
            defpackage.fctl.b(r8)
            goto L9c
        L11:
            java.lang.Object r1 = r7.d
            java.lang.Object r4 = r7.c
            java.lang.Object r5 = r7.b
            java.lang.Object r6 = r7.a
            defpackage.fctl.b(r8)
            goto L5f
        L1d:
            defpackage.fctl.b(r8)
            dnau r8 = r7.g
            ekrg r1 = defpackage.dnau.a
            java.util.List r1 = r8.aW()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.fcva.p(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
            r6 = r4
            r4 = r1
            r1 = r6
            r6 = r8
        L3b:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L69
            java.lang.Object r8 = r4.next()
            dngy r8 = (defpackage.dngy) r8
            r5 = r6
            dnau r5 = (defpackage.dnau) r5
            dnhb r5 = r5.q()
            r7.a = r6
            r7.b = r1
            r7.c = r4
            r7.d = r1
            r7.f = r2
            java.lang.Object r8 = defpackage.dngz.d(r5, r8, r7)
            if (r8 == r0) goto L9a
            r5 = r1
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.booleanValue()
            r1.add(r8)
            r1 = r5
            goto L3b
        L69:
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r1.contains(r8)
            r8 = r8 ^ r2
            dnau r1 = r7.g
            ekrg r2 = defpackage.dnau.a
            dpim r2 = r1.bC()
            dmyw r2 = (defpackage.dmyw) r2
            dmiv r2 = r2.e
            if (r2 == 0) goto L9b
            dnhb r1 = r1.q()
            dngy r2 = defpackage.dngy.a
            r7.a = r3
            r7.b = r3
            r7.c = r3
            r7.d = r3
            r7.e = r8
            r4 = 2
            r7.f = r4
            java.lang.Object r1 = defpackage.dngz.d(r1, r2, r7)
            if (r1 != r0) goto L9b
        L9a:
            return r0
        L9b:
            r0 = r8
        L9c:
            if (r0 == 0) goto La6
            dnau r8 = r7.g
            ekrg r0 = defpackage.dnau.a
            r8.be()
            goto Lc5
        La6:
            dnau r8 = r7.g
            ekrg r0 = defpackage.dnau.a
            dngc r0 = r8.bA()
            dmzg r1 = new dmzg
            r1.<init>()
            java.lang.String r2 = "CameraGalleryScreen.PermissionsButton#onClick"
            android.view.View$OnClickListener r0 = r0.a(r2, r1)
            r1 = 2132087043(0x7f151103, float:1.981433E38)
            r2 = 2132087342(0x7f15122e, float:1.9814937E38)
            r8.bj(r1, r3, r2, r0)
            r8.bS()
        Lc5:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnaq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnaq(this.g, fcxyVar);
    }
}
