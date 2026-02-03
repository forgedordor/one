package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dltg extends fcyy implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ Class e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dltg(Class cls, fcxy fcxyVar) {
        super(fcxyVar);
        this.e = cls;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dltg) c((fdex) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        r9.f = r7;
        r9.a = r6;
        r9.b = r5;
        r9.c = r1;
        r9.d = 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r7.a(r1, r9) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c8, code lost:
    
        if (r7.a(defpackage.dltd.class, r9) == r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0061). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.d
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L10
            defpackage.fctl.b(r10)
            goto Lcb
        L10:
            java.lang.Object r1 = r9.c
            java.lang.Object r5 = r9.b
            java.lang.Object r6 = r9.a
            java.lang.Object r7 = r9.f
            fdex r7 = (defpackage.fdex) r7
            defpackage.fctl.b(r10)
            goto L61
        L1e:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.f
            fdex r10 = (defpackage.fdex) r10
            fcuq r1 = new fcuq
            r1.<init>()
            java.lang.Class r5 = r9.e
            r1.add(r5)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<dltd> r6 = defpackage.dltd.class
            r5[r3] = r6
            java.util.Set r5 = defpackage.fcwm.c(r5)
            r7 = r10
            r6 = r1
        L3b:
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto Lb7
            r10 = r6
            fcuq r10 = (defpackage.fcuq) r10
            java.lang.Object r10 = r10.removeFirst()
            r1 = r10
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r10 = r5.contains(r1)
            if (r10 != 0) goto L3b
            r9.f = r7
            r9.a = r6
            r9.b = r5
            r9.c = r1
            r9.d = r4
            java.lang.Object r10 = r7.a(r1, r9)
            if (r10 == r0) goto Lca
        L61:
            r5.add(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r10 = r1.getSuperclass()
            java.lang.Class[] r8 = new java.lang.Class[r4]
            r8[r3] = r10
            fcux r10 = new fcux
            r10.<init>(r8)
            java.lang.Class[] r1 = r1.getInterfaces()
            r1.getClass()
            java.util.List r1 = defpackage.fcur.c(r1)
            fdev[] r8 = new defpackage.fdev[r2]
            r8[r3] = r10
            fdev r10 = defpackage.fcva.ax(r1)
            r8[r4] = r10
            fcux r10 = new fcux
            r10.<init>(r8)
            fdfe r1 = new fdfe
            r1.<init>()
            fdes r8 = new fdes
            r8.<init>(r10, r1)
            fdev r10 = defpackage.fdey.i(r8)
            dlte r1 = new dlte
            r1.<init>()
            fdeq r8 = new fdeq
            r8.<init>(r10, r4, r1)
            dltf r10 = new dltf
            r10.<init>()
            fdev r10 = defpackage.fdey.j(r8, r10)
            fdfk r1 = new fdfk
            r1.<init>(r10)
            defpackage.fcva.y(r6, r1)
            goto L3b
        Lb7:
            r10 = 0
            r9.f = r10
            r9.a = r10
            r9.b = r10
            r9.c = r10
            r9.d = r2
            java.lang.Class<dltd> r10 = defpackage.dltd.class
            java.lang.Object r10 = r7.a(r10, r9)
            if (r10 != r0) goto Lcb
        Lca:
            return r0
        Lcb:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dltg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dltg dltgVar = new dltg(this.e, fcxyVar);
        dltgVar.f = obj;
        return dltgVar;
    }
}
