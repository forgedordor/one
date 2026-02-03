package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csbe implements csbb {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/automationdetection/DroidguardAutomationDetectorImpl");
    private static final Set c = new LinkedHashSet();
    private static final Set d = new LinkedHashSet();
    public final Context b;

    public csbe(Context context) {
        context.getClass();
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.csbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.basd r10, java.util.Map r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.csbc
            java.lang.String r1 = "DroidguardAutomationDetectorImpl.kt"
            if (r0 == 0) goto L15
            r0 = r12
            csbc r0 = (defpackage.csbc) r0
            int r2 = r0.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.c = r2
            goto L1a
        L15:
            csbc r0 = new csbc
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            fdci r10 = r0.d
            eieu r11 = r0.e
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            goto Lb4
        L2f:
            r10 = move-exception
            goto Lc0
        L32:
            r12 = move-exception
            goto L89
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            defpackage.fctl.b(r12)
            fcyh r12 = r0.u()
            boolean r12 = defpackage.eicg.b(r12)
            if (r12 == 0) goto Lc6
            java.lang.String r12 = "DroidguardAutomationDetectorImpl#getDroidguardBlob"
            eieu r12 = defpackage.eiiy.h(r12)
            boolean r10 = r9.h(r10)     // Catch: java.lang.Throwable -> Lbe
            if (r10 == 0) goto Lba
            fdci r10 = new fdci     // Catch: java.lang.Throwable -> Lbe
            r10.<init>()     // Catch: java.lang.Throwable -> Lbe
            long r6 = defpackage.fdhi.a     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            cczv r3 = defpackage.crtr.G     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            java.lang.Object r3 = r3.e()     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            r3.getClass()     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            long r6 = r3.longValue()     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            fdhl r3 = defpackage.fdhl.c     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            long r6 = defpackage.fdhk.g(r6, r3)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            csbd r3 = new csbd     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            r3.<init>(r10, r9, r11, r5)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            r0.e = r12     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            r0.d = r10     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            r0.c = r4     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            java.lang.Object r11 = defpackage.fdna.b(r6, r3, r0)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> Lbe
            if (r11 == r2) goto L84
            r11 = r12
            goto Lb4
        L84:
            return r2
        L85:
            r11 = move-exception
            r8 = r12
            r12 = r11
            r11 = r8
        L89:
            ekrg r0 = defpackage.csbe.a     // Catch: java.lang.Throwable -> L2f
            ekrw r0 = r0.j()     // Catch: java.lang.Throwable -> L2f
            ekrz r2 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "BugleSpam"
            r0.X(r2, r3)     // Catch: java.lang.Throwable -> L2f
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L2f
            ekrw r12 = r0.g(r12)     // Catch: java.lang.Throwable -> L2f
            ekrd r12 = (defpackage.ekrd) r12     // Catch: java.lang.Throwable -> L2f
            eksk r0 = defpackage.eksk.FULL     // Catch: java.lang.Throwable -> L2f
            r12.Z(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "com/google/android/apps/messaging/shared/util/spam/automationdetection/DroidguardAutomationDetectorImpl"
            java.lang.String r2 = "getDroidguardBlob"
            r3 = 98
            ekrw r12 = r12.h(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L2f
            ekrd r12 = (defpackage.ekrd) r12     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "Automation Detection: getDroidguardBlob failed"
            r12.q(r0)     // Catch: java.lang.Throwable -> L2f
        Lb4:
            java.lang.Object r10 = r10.a     // Catch: java.lang.Throwable -> L2f
            defpackage.fczl.a(r11, r5)
            return r10
        Lba:
            defpackage.fczl.a(r12, r5)
            return r5
        Lbe:
            r10 = move-exception
            r11 = r12
        Lc0:
            throw r10     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r12 = move-exception
            defpackage.fczl.a(r11, r10)
            throw r12
        Lc6:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csbe.a(basd, java.util.Map, fcxy):java.lang.Object");
    }

    @Override // defpackage.csbb
    public final Object b(fcxy fcxyVar) throws Throwable {
        Object objB = cezm.a.a(this.b).b(fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    @Override // defpackage.csbb
    public final synchronized void c(ConversationIdType conversationIdType) {
        c.add(conversationIdType);
    }

    @Override // defpackage.csbb
    public final synchronized void d(basd basdVar, ConversationIdType conversationIdType) {
        basdVar.getClass();
        conversationIdType.getClass();
        if (g(conversationIdType)) {
            d.add(basdVar);
        }
    }

    @Override // defpackage.csbb
    public final synchronized void e(ConversationIdType conversationIdType) {
        Set set = c;
        if (set.contains(conversationIdType)) {
            set.remove(conversationIdType);
        }
    }

    @Override // defpackage.csbb
    public final synchronized void f(basd basdVar) {
        Set set = d;
        if (set.contains(basdVar)) {
            set.remove(basdVar);
        }
    }

    public final synchronized boolean g(ConversationIdType conversationIdType) {
        return c.contains(conversationIdType);
    }

    public final synchronized boolean h(basd basdVar) {
        basdVar.getClass();
        return d.contains(basdVar);
    }
}
