package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csks {
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    private final fcsu m;
    private final fcsu n;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/reclassification/SpamReclassification");
    private static final cczi l = cdag.e(cdag.b, "spam_max_reclassification_index", 100);
    public static final cczi b = cdag.e(cdag.b, "spam_max_reclassification_latency_hours", 24);

    public csks(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar11.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.m = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.j = fcsuVar9;
        this.k = fcsuVar10;
        this.n = fcsuVar11;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cskx r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.cskq
            java.lang.String r1 = "SpamReclassification.kt"
            if (r0 == 0) goto L15
            r0 = r15
            cskq r0 = (defpackage.cskq) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            cskq r0 = new cskq
            r0.<init>(r13, r15)
        L1a:
            java.lang.Object r15 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L39
            if (r3 != r5) goto L31
            eieu r14 = r0.d
            defpackage.fctl.b(r15)     // Catch: java.lang.Throwable -> L2d
            goto Lb9
        L2d:
            r0 = move-exception
            r15 = r0
            goto Lc5
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            defpackage.fctl.b(r15)
            java.lang.String r15 = "SpamReclassification.reclassifySpam"
            eieu r15 = defpackage.eiiy.a(r15)
            java.lang.String r3 = r14.d     // Catch: java.lang.Throwable -> Lc0
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r9 = defpackage.bary.b(r3)     // Catch: java.lang.Throwable -> Lc0
            csdl r3 = defpackage.csdl.a     // Catch: java.lang.Throwable -> Lc0
            int r3 = r14.c     // Catch: java.lang.Throwable -> Lc0
            csdl r10 = defpackage.csdk.a(r3)     // Catch: java.lang.Throwable -> Lc0
            int r11 = r14.e     // Catch: java.lang.Throwable -> Lc0
            cczi r14 = defpackage.csks.l     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r3 = r14.e()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> Lc0
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Lc0
            if (r11 < r3) goto L98
            ekrg r0 = defpackage.csks.a     // Catch: java.lang.Throwable -> Lc0
            ekrw r0 = r0.j()     // Catch: java.lang.Throwable -> Lc0
            ekrz r2 = defpackage.eksq.a     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = "BugleSpam"
            r0.X(r2, r3)     // Catch: java.lang.Throwable -> Lc0
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> Lc0
            ekrz r2 = defpackage.cqnc.b     // Catch: java.lang.Throwable -> Lc0
            r0.X(r2, r9)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/spam/reclassification/SpamReclassification"
            java.lang.String r3 = "reclassifySpam$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_util_spam_reclassification_spam_reclassification_AUTO_DEPS_ORIGINAL"
            r5 = 115(0x73, float:1.61E-43)
            ekrw r0 = r0.h(r2, r3, r5, r1)     // Catch: java.lang.Throwable -> Lc0
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "reclassification skipped: current index %d exceeds maximum %d"
            java.lang.Object r14 = r14.e()     // Catch: java.lang.Throwable -> Lc0
            r14.getClass()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Number r14 = (java.lang.Number) r14     // Catch: java.lang.Throwable -> Lc0
            int r14 = r14.intValue()     // Catch: java.lang.Throwable -> Lc0
            r0.u(r1, r11, r14)     // Catch: java.lang.Throwable -> Lc0
            fctx r14 = defpackage.fctx.a     // Catch: java.lang.Throwable -> Lc0
            defpackage.fczl.a(r15, r4)
            return r14
        L98:
            fcsu r14 = r13.n     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r14 = r14.b()     // Catch: java.lang.Throwable -> Lc0
            r14.getClass()     // Catch: java.lang.Throwable -> Lc0
            fcyh r14 = (defpackage.fcyh) r14     // Catch: java.lang.Throwable -> Lc0
            fcyh r14 = defpackage.eicg.a(r14)     // Catch: java.lang.Throwable -> Lc0
            cskr r6 = new cskr     // Catch: java.lang.Throwable -> Lc0
            r7 = 0
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lc0
            r0.d = r15     // Catch: java.lang.Throwable -> Lc0
            r0.c = r5     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r14 = defpackage.fdin.a(r14, r6, r0)     // Catch: java.lang.Throwable -> Lc0
            if (r14 == r2) goto Lbf
            r14 = r15
        Lb9:
            defpackage.fczl.a(r14, r4)
            fctx r14 = defpackage.fctx.a
            return r14
        Lbf:
            return r2
        Lc0:
            r0 = move-exception
            r14 = r0
            r12 = r15
            r15 = r14
            r14 = r12
        Lc5:
            throw r15     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r0 = move-exception
            defpackage.fczl.a(r14, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csks.a(cskx, fcxy):java.lang.Object");
    }

    public final void b(csdl csdlVar, MessageIdType messageIdType, csdd csddVar, int i) {
        Integer num = csddVar.d;
        if (num == null) {
            return;
        }
        cskv cskvVar = (cskv) this.m.b();
        cskw cskwVar = (cskw) cskx.a.createBuilder();
        cskwVar.getClass();
        int i2 = csdlVar.n;
        cskwVar.copyOnWrite();
        cskx cskxVar = (cskx) cskwVar.instance;
        cskxVar.b |= 1;
        cskxVar.c = i2;
        String strB = messageIdType.b();
        strB.getClass();
        cskwVar.copyOnWrite();
        cskx cskxVar2 = (cskx) cskwVar.instance;
        cskxVar2.b |= 2;
        cskxVar2.d = strB;
        cskwVar.copyOnWrite();
        cskx cskxVar3 = (cskx) cskwVar.instance;
        cskxVar3.b |= 4;
        cskxVar3.e = i;
        int iIntValue = num.intValue();
        cskwVar.copyOnWrite();
        cskx cskxVar4 = (cskx) cskwVar.instance;
        cskxVar4.b |= 8;
        cskxVar4.f = iIntValue;
        evsn evsnVarBuild = cskwVar.build();
        evsnVarBuild.getClass();
        int iIntValue2 = num.intValue();
        caxr caxrVar = new caxr();
        caxrVar.c = Duration.ofSeconds(iIntValue2);
        ((cazj) cskvVar.a.b()).g(cbcu.g("spam_reclassification_handler", (cskx) evsnVarBuild, caxrVar.a()));
    }
}
