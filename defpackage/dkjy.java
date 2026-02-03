package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkjy extends fcyy implements fdat {
    int a;
    final /* synthetic */ hox b;
    final /* synthetic */ fdap c;
    final /* synthetic */ fdce d;
    final /* synthetic */ fdae e;
    final /* synthetic */ kji f;
    final /* synthetic */ iqa g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkjy(hox hoxVar, fdap fdapVar, fdce fdceVar, fdae fdaeVar, kji kjiVar, iqa iqaVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = hoxVar;
        this.c = fdapVar;
        this.d = fdceVar;
        this.e = fdaeVar;
        this.f = kjiVar;
        this.g = iqaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkjy) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (r11 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 == r4) goto L11
            defpackage.fctl.b(r11)
            goto L69
        L11:
            java.lang.Object r1 = r10.h
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r11)
            goto L48
        L19:
            java.lang.Object r1 = r10.h
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r11)
            goto L35
        L21:
            defpackage.fctl.b(r11)
            java.lang.Object r11 = r10.h
            ire r11 = (defpackage.ire) r11
            r10.h = r11
            r10.a = r3
            java.lang.Object r1 = defpackage.dzm.g(r11, r2, r10, r4)
            if (r1 == r0) goto Lb9
            r9 = r1
            r1 = r11
            r11 = r9
        L35:
            ise r11 = (defpackage.ise) r11
            long r5 = r11.a
            dkjw r11 = new dkjw
            r11.<init>()
            r10.h = r1
            r10.a = r4
            java.lang.Object r11 = defpackage.duh.e(r1, r5, r11, r10)
            if (r11 == r0) goto Lb9
        L48:
            ise r11 = (defpackage.ise) r11
            if (r11 == 0) goto Lb6
            kji r4 = r10.f
            hox r5 = r10.b
            fdce r6 = r10.d
            iqa r7 = r10.g
            fdap r8 = r10.c
            dkjx r3 = new dkjx
            r3.<init>()
            r10.h = r2
            r2 = 3
            r10.a = r2
            long r4 = r11.a
            java.lang.Object r11 = defpackage.duh.k(r1, r4, r3, r10)
            if (r11 != r0) goto L69
            goto Lb9
        L69:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r0 = 0
            r1 = 0
            if (r11 == 0) goto L95
            hox r11 = r10.b
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r11.b(r2)
            fdap r11 = r10.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r11.invoke(r2)
            fdce r11 = r10.d
            boolean r1 = r11.a
            if (r1 == 0) goto Lb6
            fdae r1 = r10.e
            r1.invoke()
            r11.a = r0
            goto Lb6
        L95:
            hox r11 = r10.b
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r11.b(r2)
            fdap r11 = r10.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r11.invoke(r2)
            fdce r11 = r10.d
            boolean r1 = r11.a
            if (r1 == 0) goto Lb6
            fdae r1 = r10.e
            r1.invoke()
            r11.a = r0
        Lb6:
            fctx r11 = defpackage.fctx.a
            return r11
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkjy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dkjy dkjyVar = new dkjy(this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
        dkjyVar.h = obj;
        return dkjyVar;
    }
}
