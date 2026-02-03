package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahem extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ aher c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahem(fcxy fcxyVar, aher aherVar) {
        super(3, fcxyVar);
        this.c = aherVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ahem ahemVar = new ahem((fcxy) obj3, this.c);
        ahemVar.d = (fdpm) obj;
        ahemVar.b = obj2;
        return ahemVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e5, code lost:
    
        if (defpackage.fdpy.c(r1, r9, r8) == r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [fdpm] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Le
            defpackage.fctl.b(r9)
            goto Le8
        Le:
            java.lang.Object r1 = r8.d
            defpackage.fctl.b(r9)
            goto L4e
        L14:
            defpackage.fctl.b(r9)
            java.lang.Object r1 = r8.d
            java.lang.Object r9 = r8.b
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.booleanValue()
            ekrg r9 = defpackage.aher.a
            ekrw r9 = r9.h()
            ekrz r3 = defpackage.eksq.a
            java.lang.String r4 = "BugleProfiles"
            r9.X(r3, r4)
            r3 = 81
            java.lang.String r4 = "SendingAsUiAdapterImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl$special$$inlined$flatMapLatest$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r9 = r9.h(r5, r6, r3, r4)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r3 = "Checking sending as UI..."
            r9.q(r3)
            aher r9 = r8.c
            r8.d = r1
            r8.a = r2
            chna r9 = r9.i
            java.lang.Object r9 = r9.a(r8)
            if (r9 == r0) goto Leb
        L4e:
            chmw r9 = (defpackage.chmw) r9
            int r9 = r9.c
            chnc r9 = defpackage.chnc.b(r9)
            if (r9 != 0) goto L5a
            chnc r9 = defpackage.chnc.SHARE_TO_UNKNOWN
        L5a:
            r9.getClass()
            aher r2 = r8.c
            fdpl r3 = r2.c
            fdpl r3 = defpackage.fdqq.a(r3)
            fdpl r3 = defpackage.fdqc.a(r3)
            java.lang.String r4 = "composeConstraints"
            fdpl r3 = defpackage.auyk.a(r3, r4)
            ahed r4 = new ahed
            fdpl r5 = r2.e
            r4.<init>(r5)
            aheg r5 = new aheg
            r5.<init>(r4)
            ahdz r4 = new ahdz
            r4.<init>()
            fdpl r4 = defpackage.fdqq.b(r5, r4)
            java.lang.String r5 = "selfIdentity"
            fdpl r4 = defpackage.auyk.a(r4, r5)
            fdpl r5 = r2.d
            fdpl r5 = defpackage.fdqc.a(r5)
            java.lang.String r6 = "recipients"
            fdpl r5 = defpackage.auyk.a(r5, r6)
            ahei r6 = new ahei
            r7 = 0
            r6.<init>(r2, r9, r7)
            fdjx r9 = r2.b
            fdpl r4 = defpackage.avac.i(r4, r5, r9, r6)
            ahdy r5 = new ahdy
            r5.<init>()
            fdpl r4 = defpackage.fdqq.b(r4, r5)
            java.lang.String r5 = "recipientsEligibleForFirstTimeShare"
            fdpl r4 = defpackage.auyk.a(r4, r5)
            ahea r5 = new ahea
            r5.<init>(r2, r7)
            fdpl r3 = defpackage.avac.i(r3, r4, r9, r5)
            java.lang.String r4 = "SendingAsUiData"
            fdpl r3 = defpackage.auyk.a(r3, r4)
            aheq r4 = new aheq
            wre r2 = r2.k
            fdvc r2 = r2.a
            r4.<init>(r2)
            fdpl r2 = defpackage.fdqq.a(r4)
            java.lang.String r4 = "userHasDraft"
            fdpl r2 = defpackage.auyk.a(r2, r4)
            ahen r4 = new ahen
            r4.<init>(r7)
            fdpl r9 = defpackage.avac.i(r3, r2, r9, r4)
            r8.d = r7
            r2 = 2
            r8.a = r2
            java.lang.Object r9 = defpackage.fdpy.c(r1, r9, r8)
            if (r9 != r0) goto Le8
            goto Leb
        Le8:
            fctx r9 = defpackage.fctx.a
            return r9
        Leb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahem.b(java.lang.Object):java.lang.Object");
    }
}
