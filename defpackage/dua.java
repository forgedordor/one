package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dua extends fcyy implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdap c;
    final /* synthetic */ fdat d;
    final /* synthetic */ fdae e;
    final /* synthetic */ fdae f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dua(fdap fdapVar, fdat fdatVar, fdae fdaeVar, fdae fdaeVar2, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = fdapVar;
        this.d = fdatVar;
        this.e = fdaeVar;
        this.f = fdaeVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dua) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if (r12 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.b
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L26
            if (r1 == r2) goto L1e
            if (r1 == r4) goto L13
            defpackage.fctl.b(r12)
            r10 = r11
            goto L8a
        L13:
            java.lang.Object r1 = r11.a
            java.lang.Object r2 = r11.g
            ire r2 = (defpackage.ire) r2
            defpackage.fctl.b(r12)
            r10 = r11
            goto L57
        L1e:
            java.lang.Object r1 = r11.g
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r12)
            goto L38
        L26:
            defpackage.fctl.b(r12)
            java.lang.Object r12 = r11.g
            r1 = r12
            ire r1 = (defpackage.ire) r1
            r11.g = r1
            r11.b = r2
            java.lang.Object r12 = defpackage.dzm.g(r1, r3, r11, r4)
            if (r12 == r0) goto La0
        L38:
            r5 = r1
            ise r12 = (defpackage.ise) r12
            fdcf r1 = new fdcf
            r1.<init>()
            long r6 = r12.a
            int r8 = r12.i
            dty r9 = new dty
            r9.<init>()
            r11.g = r5
            r11.a = r1
            r11.b = r4
            r10 = r11
            java.lang.Object r12 = defpackage.duh.d(r5, r6, r8, r9, r10)
            if (r12 == r0) goto La1
            r2 = r5
        L57:
            ise r12 = (defpackage.ise) r12
            if (r12 == 0) goto L9d
            fdap r4 = r10.c
            long r5 = r12.c
            ihs r7 = new ihs
            r7.<init>(r5)
            r4.invoke(r7)
            fdat r4 = r10.d
            fdcf r1 = (defpackage.fdcf) r1
            float r1 = r1.a
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            r4.a(r12, r5)
            dtz r1 = new dtz
            r1.<init>()
            r10.g = r3
            r10.a = r3
            r3 = 3
            r10.b = r3
            long r3 = r12.a
            java.lang.Object r12 = defpackage.duh.k(r2, r3, r1, r11)
            if (r12 != r0) goto L8a
            goto La1
        L8a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L98
            fdae r12 = r10.e
            r12.invoke()
            goto L9d
        L98:
            fdae r12 = r10.f
            r12.invoke()
        L9d:
            fctx r12 = defpackage.fctx.a
            return r12
        La0:
            r10 = r11
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dua.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dua duaVar = new dua(this.c, this.d, this.e, this.f, fcxyVar);
        duaVar.g = obj;
        return duaVar;
    }
}
