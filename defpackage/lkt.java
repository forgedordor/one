package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lkt extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ llo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkt(llo lloVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = lloVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lkt) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (defpackage.fdpy.c(r2, r9, r8) != r0) goto L26;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.b
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L12
            defpackage.fctl.b(r9)
            goto Lad
        L12:
            java.lang.Object r1 = r8.a
            java.lang.Object r2 = r8.d
            fdpm r2 = (defpackage.fdpm) r2
            defpackage.fctl.b(r9)
            goto L5e
        L1c:
            java.lang.Object r1 = r8.d
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r9)
            goto L45
        L24:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.d
            fdpm r9 = (defpackage.fdpm) r9
            llo r1 = r8.c
            r8.d = r9
            r8.b = r3
            fdjx r3 = r1.b
            fcyh r3 = r3.hE()
            llh r5 = new llh
            r5.<init>(r1, r4)
            java.lang.Object r1 = defpackage.fdin.a(r3, r5, r8)
            if (r1 == r0) goto Lc3
            r7 = r1
            r1 = r9
            r9 = r7
        L45:
            lmv r9 = (defpackage.lmv) r9
            boolean r3 = r9 instanceof defpackage.ljt
            if (r3 == 0) goto La1
            r3 = r9
            ljt r3 = (defpackage.ljt) r3
            java.lang.Object r3 = r3.a
            r8.d = r1
            r8.a = r9
            r8.b = r2
            java.lang.Object r2 = r1.fO(r3, r8)
            if (r2 == r0) goto Lc3
            r2 = r1
            r1 = r9
        L5e:
            llo r9 = r8.c
            lkm r3 = new lkm
            r3.<init>(r9, r4)
            fdqz r5 = new fdqz
            llp r6 = r9.c
            fduf r6 = r6.a
            r5.<init>(r3, r6)
            lkn r3 = new lkn
            r3.<init>(r4)
            fdrw r6 = new fdrw
            r6.<init>(r5, r3)
            lko r3 = new lko
            lmv r1 = (defpackage.lmv) r1
            r3.<init>(r1, r4)
            fdrn r1 = new fdrn
            r1.<init>(r6, r3)
            lks r3 = new lks
            r3.<init>(r1)
            lkp r1 = new lkp
            r1.<init>(r9, r4)
            fdqt r9 = new fdqt
            r9.<init>(r3, r1)
            r8.d = r4
            r8.a = r4
            r1 = 3
            r8.b = r1
            java.lang.Object r9 = defpackage.fdpy.c(r2, r9, r8)
            if (r9 != r0) goto Lad
            goto Lc3
        La1:
            boolean r0 = r9 instanceof defpackage.lmz
            if (r0 != 0) goto Lbb
            boolean r0 = r9 instanceof defpackage.lmk
            if (r0 != 0) goto Lb6
            boolean r9 = r9 instanceof defpackage.lmf
            if (r9 == 0) goto Lb0
        Lad:
            fctx r9 = defpackage.fctx.a
            return r9
        Lb0:
            fctg r9 = new fctg
            r9.<init>()
            throw r9
        Lb6:
            lmk r9 = (defpackage.lmk) r9
            java.lang.Throwable r9 = r9.a
            throw r9
        Lbb:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r9.<init>(r0)
            throw r9
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lkt lktVar = new lkt(this.c, fcxyVar);
        lktVar.d = obj;
        return lktVar;
    }
}
