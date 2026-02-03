package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcq implements afyy, afyx {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/DirectSendViewerNavigationHandler");
    private final Context b;
    private final czmb c;
    private final agax d;

    public agcq(Context context, czmb czmbVar, agax agaxVar) {
        this.b = context;
        this.c = czmbVar;
        this.d = agaxVar;
    }

    @Override // defpackage.afyx
    public final /* bridge */ /* synthetic */ Object a(afzx afzxVar, fcxy fcxyVar) {
        return d(fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.afyy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.agcn r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agcq.b(agcn, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.agcp
            if (r0 == 0) goto L13
            r0 = r8
            agcp r0 = (defpackage.agcp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            agcp r0 = new agcp
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.fctl.b(r8)
            agax r8 = r7.d
            aeo r2 = new aeo
            r2.<init>()
            r0.c = r3
            java.lang.String r3 = "com.google.android.apps.messaging.navigation.targets.DirectSendViewer"
            java.lang.Object r8 = r8.b(r3, r2, r0)
            if (r8 == r1) goto L80
        L43:
            adh r8 = (defpackage.adh) r8
            ekrg r0 = defpackage.agcq.a
            ekrw r1 = r0.f()
            r2 = 151(0x97, float:2.12E-43)
            java.lang.String r3 = "com/google/android/apps/messaging/navigation/targets/DirectSendViewerNavigationHandler"
            java.lang.String r4 = "resumeNavigation"
            java.lang.String r5 = "DirectSendViewer.kt"
            ekrw r1 = r1.h(r3, r4, r2, r5)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "MediaViewer activity result: %s"
            r1.t(r2, r8)
            int r1 = r8.a
            r2 = -1
            r6 = 0
            if (r1 != r2) goto L6e
            android.content.Intent r8 = r8.b
            if (r8 == 0) goto L6d
            com.google.android.apps.messaging.navigation.targets.DirectSendResult r8 = defpackage.agcm.a(r8)
            return r8
        L6d:
            return r6
        L6e:
            ekrw r8 = r0.j()
            r0 = 156(0x9c, float:2.19E-43)
            ekrw r8 = r8.h(r3, r4, r0, r5)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r0 = "Skipping MediaViewer activity result because of resultCode %s"
            r8.r(r0, r1)
            return r6
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agcq.d(fcxy):java.lang.Object");
    }
}
