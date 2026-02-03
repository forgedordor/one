package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlyj implements dlym {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/audio/processor/AudioLevelProcessor");
    public final dlyk b;
    public final fdue c;
    public final fduj d;
    private final fdjx e;
    private fdlr f;

    public dlyj(fdjx fdjxVar, dlyk dlykVar) {
        fdjxVar.getClass();
        this.e = fdjxVar;
        this.b = dlykVar;
        fdue fdueVarE = fdun.e(0, 0, 0, 7);
        this.c = fdueVarE;
        this.d = new fdug(fdueVarE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.dlyc
            if (r0 == 0) goto L13
            r0 = r11
            dlyc r0 = (defpackage.dlyc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dlyc r0 = new dlyc
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r11)
            return r0
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L31:
            defpackage.fctl.b(r11)
            fdjd r6 = new fdjd
            r6.<init>()
            dlyk r11 = r10.b
            int r2 = r11.b
            int r4 = r11.c
            int r2 = r2 * r4
            long r4 = (long) r2
            j$.time.Duration r11 = r11.d
            long r7 = r11.toMillis()
            long r4 = r4 * r7
            j$.time.Duration r11 = defpackage.eoob.g(r3)
            long r7 = r11.toMillis()
            long r7 = r4 / r7
            ekrg r11 = defpackage.dlyj.a
            ekrw r11 = r11.h()
            r2 = 65
            java.lang.String r4 = "AudioLevelProcessor.kt"
            java.lang.String r5 = "com/google/android/libraries/compose/audio/processor/AudioLevelProcessor"
            java.lang.String r9 = "launchInputCoroutine"
            ekrw r11 = r11.h(r5, r9, r2, r4)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "Starting audio level processing with polling window of: %d"
            r11.s(r2, r7)
            fdjx r11 = r10.e
            dlyh r4 = new dlyh
            r9 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r9)
            r2 = 3
            r5 = 0
            fdlr r11 = defpackage.fdil.d(r11, r5, r5, r4, r2)
            r0.a = r11
            r0.d = r3
            java.lang.Object r0 = r6.hJ(r0)
            if (r0 != r1) goto L85
            return r1
        L85:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlyj.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.dlym
    public final Object b(fcxy fcxyVar) {
        return fctx.a;
    }

    @Override // defpackage.dlym
    public final Object c(fcxy fcxyVar) {
        fdlr fdlrVar = this.f;
        if (fdlrVar != null) {
            fdlrVar.t(new CancellationException("AudioLevelProcessor released."));
        }
        this.f = null;
        return fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dlym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dlyi
            if (r0 == 0) goto L13
            r0 = r5
            dlyi r0 = (defpackage.dlyi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlyi r0 = new dlyi
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dlyj r0 = r0.d
            defpackage.fctl.b(r5)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r0 = r4
        L40:
            fdlr r5 = (defpackage.fdlr) r5
            r0.f = r5
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlyj.d(fcxy):java.lang.Object");
    }
}
