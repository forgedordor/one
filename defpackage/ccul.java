package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccul implements cfix {
    private static final ekrg a;
    private final fdjx b;
    private final ccud c;
    private final ahmf d;

    static {
        String.valueOf(ccin.a(3));
        a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/provision/MlsCapabilitiesDecorator");
    }

    public ccul(fdjx fdjxVar, ahmf ahmfVar, ccpm ccpmVar, ccud ccudVar, apwn apwnVar) {
        fdjxVar.getClass();
        ahmfVar.getClass();
        ccpmVar.getClass();
        apwnVar.getClass();
        this.b = fdjxVar;
        this.d = ahmfVar;
        this.c = ccudVar;
    }

    @Override // defpackage.cfix
    public final eiju a(ezny eznyVar, aubq aubqVar) {
        eznyVar.getClass();
        aubqVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new ccuj(this, eznyVar, aubqVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ezny r10, defpackage.fcxy r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ccuk
            if (r0 == 0) goto L13
            r0 = r11
            ccuk r0 = (defpackage.ccuk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ccuk r0 = new ccuk
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            if (r2 == 0) goto Le3
            r10 = 1
            r3 = 2
            r4 = 0
            r5 = 3
            if (r2 == r10) goto L3c
            if (r2 == r3) goto L36
            if (r2 != r5) goto L2e
            defpackage.fctl.b(r11)
            goto L8b
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)
            goto L56
        L3c:
            defpackage.fctl.b(r11)
            r10 = r11
            ccpl r10 = (defpackage.ccpl) r10
            java.lang.String r11 = r10.b()
            ahmf r2 = r9.d
            ccil r11 = defpackage.ccie.a(r2, r11)
            r0.a = r10
            r0.d = r3
            java.lang.Object r11 = r11.f(r0)
            if (r11 == r1) goto Le2
        L56:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.lang.String r2 = "decorateInternal"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/e2ee/mls/provision/MlsCapabilitiesDecorator"
            java.lang.String r6 = "BugleE2eeMls"
            java.lang.String r7 = "MlsCapabilitiesDecorator.kt"
            if (r11 != 0) goto L8c
            ekrg r11 = defpackage.ccul.a
            ekrw r11 = r11.e()
            ekrz r8 = defpackage.eksq.a
            r11.X(r8, r6)
            r6 = 63
            ekrw r11 = r11.h(r3, r2, r6, r7)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "Key packages not uploaded yet. Not decorating the capabilities."
            r11.q(r2)
            ccud r11 = r9.c
            r0.a = r4
            r0.d = r5
            java.lang.Object r10 = r11.d(r10, r0)
            if (r10 != r1) goto L8b
            goto Le2
        L8b:
            return r4
        L8c:
            ekrg r10 = defpackage.ccul.a
            ekrw r10 = r10.h()
            ekrz r11 = defpackage.eksq.a
            r10.X(r11, r6)
            r11 = 68
            ekrw r10 = r10.h(r3, r2, r11, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "Decorating MLS capabilities"
            r10.q(r11)
            eznv r10 = defpackage.eznv.a
            evsf r10 = r10.createBuilder()
            eznt r10 = (defpackage.eznt) r10
            r10.getClass()
            eznx r11 = defpackage.eznx.a
            evsf r0 = r11.createBuilder()
            eznw r0 = (defpackage.eznw) r0
            r0.getClass()
            java.lang.String r1 = "+g.gsma.rcs.mls.mls-version"
            defpackage.eykf.b(r1, r0)
            eznx r0 = defpackage.eykf.a(r0)
            defpackage.eyke.b(r0, r10)
            evsf r11 = r11.createBuilder()
            eznw r11 = (defpackage.eznw) r11
            r11.getClass()
            java.lang.String r0 = "v1"
            defpackage.eykf.b(r0, r11)
            eznx r11 = defpackage.eykf.a(r11)
            defpackage.eyke.c(r11, r10)
            defpackage.eyke.d(r5, r10)
            defpackage.eyke.a(r10)
            throw r4
        Le2:
            return r1
        Le3:
            defpackage.fctl.b(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccul.b(ezny, fcxy):java.lang.Object");
    }
}
