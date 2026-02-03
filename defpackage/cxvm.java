package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxvm extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cxvq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxvm(cxvq cxvqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cxvqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxvm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r9 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[PHI: r1
      0x0037: PHI (r1v3 java.util.Iterator) = (r1v6 java.util.Iterator), (r1v7 java.util.Iterator), (r1v8 java.util.Iterator) binds: [B:11:0x0031, B:17:0x00d0, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d0 -> B:12:0x0037). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 == r2) goto L12
            java.lang.Object r1 = r8.a
            defpackage.fctl.b(r9)
            goto L37
        L12:
            java.lang.Object r1 = r8.a
            defpackage.fctl.b(r9)
            goto L80
        L18:
            defpackage.fctl.b(r9)
            goto L31
        L1c:
            defpackage.fctl.b(r9)
            cxvq r9 = r8.c
            fcsu r9 = r9.k
            java.lang.Object r9 = r9.b()
            dghj r9 = (defpackage.dghj) r9
            r8.b = r3
            java.lang.Object r9 = r9.j(r8)
            if (r9 == r0) goto Ld6
        L31:
            java.util.Set r9 = (java.util.Set) r9
            java.util.Iterator r1 = r9.iterator()
        L37:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto Ld3
            java.lang.Object r9 = r1.next()
            dggk r9 = (defpackage.dggk) r9
            ekrg r3 = defpackage.cxvq.a
            ekrw r3 = r3.h()
            ekrz r4 = defpackage.eksq.a
            java.lang.String r5 = "BugleCms"
            r3.X(r4, r5)
            r4 = 407(0x197, float:5.7E-43)
            java.lang.String r5 = "CloudStoreDebugMenuProviderImpl.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/ui/debug/cloudstore/CloudStoreDebugMenuProviderImpl$getPhoneAccountInfo$1"
            java.lang.String r7 = "invokeSuspend"
            ekrw r3 = r3.h(r6, r7, r4, r5)
            ekrd r3 = (defpackage.ekrd) r3
            java.lang.String r4 = "Getting MDE account info for a phone number."
            r3.q(r4)
            cxvq r3 = r8.c
            fcsu r3 = r3.l
            java.lang.Object r3 = r3.b()
            cejj r3 = (defpackage.cejj) r3
            java.lang.String r9 = r9.a
            eiju r9 = r3.b(r9)
            r9.getClass()
            r8.a = r1
            r8.b = r2
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 == r0) goto Ld6
        L80:
            cejg r9 = (defpackage.cejg) r9
            fcsu r3 = r9.i
            java.lang.Object r3 = r3.b()
            ahka r3 = (defpackage.ahka) r3
            cfre r3 = r9.j
            cfdx r4 = new cfdx
            r4.<init>(r3)
            cexm r3 = r9.o()
            eiju r3 = r3.c()
            eiju r3 = defpackage.eiju.g(r3)
            cein r5 = new cein
            r5.<init>()
            eosd r6 = r9.k
            eiju r3 = r3.i(r5, r6)
            ceip r5 = new ceip
            r5.<init>()
            eosc r9 = r9.q
            eiju r9 = r3.i(r5, r9)
            ceiq r3 = new ceiq
            r3.<init>()
            eiju r9 = r9.i(r3, r6)
            ceir r3 = new ceir
            r3.<init>()
            eoqg r4 = defpackage.eoqg.a
            eiju r9 = r9.h(r3, r4)
            r8.a = r1
            r3 = 3
            r8.b = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 != r0) goto L37
            goto Ld6
        Ld3:
            fctx r9 = defpackage.fctx.a
            return r9
        Ld6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxvm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cxvm(this.c, fcxyVar);
    }
}
