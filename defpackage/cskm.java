package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cskm extends fcyz implements fdat {
    int a;
    final /* synthetic */ csch b;
    final /* synthetic */ cskp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cskm(fcxy fcxyVar, csch cschVar, cskp cskpVar) {
        super(2, fcxyVar);
        this.b = cschVar;
        this.c = cskpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cskm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r15 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r14.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/spam/rcs/RcsWithSpamHeaderProtection$classify$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "BugleSpam"
            r5 = 1
            java.lang.String r6 = "RcsWithSpamHeaderProtection.kt"
            defpackage.fctl.b(r15)
            if (r1 == 0) goto L16
            if (r1 == r5) goto L15
            goto L74
        L15:
            return r15
        L16:
            java.lang.Object r15 = r14.d
            fdjx r15 = (defpackage.fdjx) r15
            csch r15 = r14.b
            int r1 = r15.m
            r7 = 3
            if (r1 == r7) goto L3e
            ekrg r15 = defpackage.cskp.a
            ekrw r15 = r15.e()
            ekrz r0 = defpackage.eksq.a
            r15.X(r0, r4)
            r0 = 51
            ekrw r15 = r15.h(r3, r2, r0, r6)
            ekrd r15 = (defpackage.ekrd) r15
            java.lang.String r0 = "Not RCS protocol, skipping RCS enforcement."
            r15.q(r0)
            csdd r15 = defpackage.csdc.a()
            return r15
        L3e:
            cskl r1 = r15.g
            if (r1 == 0) goto L4e
            cskp r15 = r14.c
            r14.a = r5
            java.lang.Object r15 = r15.h(r1, r14)
            if (r15 != r0) goto L4d
            goto L73
        L4d:
            return r15
        L4e:
            java.lang.Integer r1 = r15.f
            if (r1 != 0) goto L53
            goto L5c
        L53:
            int r7 = r1.intValue()
            if (r7 != r5) goto L5c
            csdo r15 = defpackage.csdo.b
            goto L81
        L5c:
            r5 = 2
            if (r1 != 0) goto L60
            goto L69
        L60:
            int r1 = r1.intValue()
            if (r1 != r5) goto L69
            csdo r15 = defpackage.csdo.c
            goto L81
        L69:
            cskp r1 = r14.c
            r14.a = r5
            java.lang.Object r15 = r1.g(r15, r14)
            if (r15 != r0) goto L74
        L73:
            return r0
        L74:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L7f
            csdo r15 = defpackage.csdo.b
            goto L81
        L7f:
            csdo r15 = defpackage.csdo.a
        L81:
            r9 = r15
            csdo r15 = defpackage.csdo.a
            boolean r15 = defpackage.fdbq.f(r9, r15)
            if (r15 == 0) goto La7
            ekrg r15 = defpackage.cskp.a
            ekrw r15 = r15.e()
            ekrz r0 = defpackage.eksq.a
            r15.X(r0, r4)
            r0 = 70
            ekrw r15 = r15.h(r3, r2, r0, r6)
            ekrd r15 = (defpackage.ekrd) r15
            java.lang.String r0 = "No spam warning header in incoming message, skipping RCS enforcement."
            r15.q(r0)
            csdd r15 = defpackage.csdc.a()
            return r15
        La7:
            csdd r7 = new csdd
            eoff r8 = defpackage.eoff.SPAM
            r12 = 0
            r13 = 28
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cskm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cskm cskmVar = new cskm(fcxyVar, this.b, this.c);
        cskmVar.d = obj;
        return cskmVar;
    }
}
