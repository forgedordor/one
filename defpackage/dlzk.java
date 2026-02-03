package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzk {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/audio/recorder/AudioRecorder");
    public final dmaz b;
    public final dmah c;
    public final dlzl d;
    public dlxt e;
    public dmaf f;
    public dmaw g;

    public dlzk(dmaz dmazVar, dmah dmahVar, dlzl dlzlVar) {
        this.b = dmazVar;
        this.c = dmahVar;
        this.d = dlzlVar;
    }

    public final Object a(fcxy fcxyVar) throws Throwable {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ((ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/recorder/AudioRecorder", "release", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "AudioRecorder.kt")).t("Releasing AudioRecorder for %s", this.d.a);
        dlxt dlxtVar = this.e;
        if (dlxtVar == null) {
            fdbq.c("audioGraph");
            dlxtVar = null;
        }
        Object objB = dlxtVar.b(fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.dlzj
            if (r0 == 0) goto L13
            r0 = r10
            dlzj r0 = (defpackage.dlzj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlzj r0 = new dlzj
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            defpackage.fctl.b(r10)
            goto L76
        L37:
            defpackage.fctl.b(r10)
            ekrg r10 = defpackage.dlzk.a
            ekrw r10 = r10.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r6 = "HugoAudio"
            r10.X(r2, r6)
            r2 = 94
            java.lang.String r6 = "AudioRecorder.kt"
            java.lang.String r7 = "com/google/android/libraries/compose/audio/recorder/AudioRecorder"
            java.lang.String r8 = "stop"
            ekrw r10 = r10.h(r7, r8, r2, r6)
            ekrd r10 = (defpackage.ekrd) r10
            dlzl r2 = r9.d
            java.lang.String r6 = "Stopping AudioRecorder for %s"
            android.net.Uri r2 = r2.a
            r10.t(r6, r2)
            dlxt r10 = r9.e
            if (r10 != 0) goto L68
            java.lang.String r10 = "audioGraph"
            defpackage.fdbq.c(r10)
            r10 = r3
        L68:
            r0.c = r5
            dmai r10 = r10.a
            java.lang.Object r10 = r10.a(r0)
            if (r10 == r1) goto L74
            fctx r10 = defpackage.fctx.a
        L74:
            if (r10 == r1) goto L8f
        L76:
            dmaf r10 = r9.f
            if (r10 != 0) goto L80
            java.lang.String r10 = "fileAudioSink"
            defpackage.fdbq.c(r10)
            goto L81
        L80:
            r3 = r10
        L81:
            r0.c = r4
            fdjc r10 = r3.g
            fdme r10 = (defpackage.fdme) r10
            java.lang.Object r10 = r10.hJ(r0)
            if (r10 != r1) goto L8e
            goto L8f
        L8e:
            return r10
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlzk.b(fcxy):java.lang.Object");
    }
}
