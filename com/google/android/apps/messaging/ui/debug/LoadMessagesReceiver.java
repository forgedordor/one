package com.google.android.apps.messaging.ui.debug;

import android.content.Context;
import android.content.Intent;
import defpackage.auvw;
import defpackage.cxtg;
import defpackage.cxua;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.eygg;
import defpackage.fcsu;
import defpackage.fcyi;
import defpackage.fdap;
import defpackage.fdau;
import defpackage.fdbq;
import defpackage.fdjx;
import defpackage.fdjz;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LoadMessagesReceiver extends cxtg {
    public static final fdap a = new fdap() { // from class: cxtm
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            Intent intent = (Intent) obj;
            intent.getClass();
            return Integer.valueOf(intent.getIntExtra("num_messages", 1000));
        }
    };
    public static final fdap b = new fdap() { // from class: cxtn
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            Intent intent = (Intent) obj;
            intent.getClass();
            return Integer.valueOf(intent.getIntExtra("messages_offset", 0));
        }
    };
    public static final fdau c = new fdau() { // from class: cxto
        @Override // defpackage.fdau
        public final Object a(Object obj, Object obj2, Object obj3) {
            Intent intent = (Intent) obj;
            Context context = (Context) obj2;
            String str = (String) obj3;
            intent.getClass();
            context.getClass();
            str.getClass();
            String stringExtra = intent.getStringExtra("file_name");
            return stringExtra != null ? new File(stringExtra) : new File(context.getDataDir(), str);
        }
    };
    public static final ekrg d = ekrg.c("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver");
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;
    public fcsu i;
    public eygg j;
    public eygg k;
    public fcsu l;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        fcsu fcsuVar = this.e;
        if (fcsuVar == null) {
            fdbq.c("traceCreation");
            fcsuVar = null;
        }
        return ((eigp) fcsuVar.b()).a("LoadMessagesReceiver Receive broadcast");
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (fdbq.f(intent.getAction(), "com.google.android.apps.messaging.load_messages")) {
            boolean booleanExtra = intent.getBooleanExtra("load_data_from_file", true);
            Object objA = c.a(intent, context, "messages.csv");
            int iIntValue = ((Number) a.invoke(intent)).intValue();
            int iIntValue2 = ((Number) b.invoke(intent)).intValue();
            boolean booleanExtra2 = intent.getBooleanExtra("sync_bugle_db_after_load", true);
            ekrw ekrwVarH = d.h();
            ekrwVarH.X(eksq.a, "BugleDiagnostics");
            File file = (File) objA;
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/debug/LoadMessagesReceiver", "processBroadcast", 110, "LoadMessagesReceiver.kt")).K("Loading messages from csv file. loadDataFromFile=%s, filename=%s, numMessages=%s, offset=%s, syncBugleDbAfterLoad=%s", Boolean.valueOf(booleanExtra), file.getAbsolutePath(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Boolean.valueOf(booleanExtra2));
            fcsu fcsuVar = this.g;
            if (fcsuVar == null) {
                fdbq.c("backgroundScope");
                fcsuVar = null;
            }
            Object objB = fcsuVar.b();
            objB.getClass();
            q("LoadMessages", auvw.c((fdjx) objB, fcyi.a, fdjz.a, new cxua(booleanExtra, this, file, iIntValue, iIntValue2, booleanExtra2, context, null)));
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cldb
    public final String d() {
        return "";
    }

    public final eygg f() {
        eygg eyggVar = this.j;
        if (eyggVar != null) {
            return eyggVar;
        }
        fdbq.c("mmsSmsThreadIdResolver");
        return null;
    }

    public final eygg g() {
        eygg eyggVar = this.k;
        if (eyggVar != null) {
            return eyggVar;
        }
        fdbq.c("syncManager");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (defpackage.fdpy.a(r1, r6) == r7) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.io.File r13, int r14, int r15, boolean r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r17
            boolean r2 = r0 instanceof defpackage.cxtt
            if (r2 == 0) goto L15
            r2 = r0
            cxtt r2 = (defpackage.cxtt) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.d = r3
            goto L1a
        L15:
            cxtt r2 = new cxtt
            r2.<init>(r12, r0)
        L1a:
            r6 = r2
            java.lang.Object r0 = r6.b
            fcyl r7 = defpackage.fcyl.a
            int r2 = r6.d
            r3 = 1
            r4 = 0
            r8 = 2
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L37
            if (r2 != r8) goto L2f
            defpackage.fctl.b(r0)
            goto Lbf
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L37:
            boolean r2 = r6.a
            defpackage.fctl.b(r0)
            goto L71
        L3d:
            defpackage.fctl.b(r0)
            eygg r0 = r12.g()
            java.lang.Object r0 = r0.b()
            cmqf r0 = (defpackage.cmqf) r0
            r2 = 0
            r0.q(r2)
            fcsu r0 = r12.k()
            java.lang.Object r0 = r0.b()
            r0.getClass()
            fcyh r0 = (defpackage.fcyh) r0
            fcyh r0 = defpackage.eicg.a(r0)
            cxts r2 = new cxts
            r2.<init>(r4, r13, r15, r14)
            r5 = r16
            r6.a = r5
            r6.d = r3
            java.lang.Object r0 = defpackage.fdin.a(r0, r2, r6)
            if (r0 == r7) goto Lc2
            r2 = r5
        L71:
            java.util.List r0 = (java.util.List) r0
            fcsu r3 = r12.l()
            java.lang.Object r3 = r3.b()
            cogw r3 = (defpackage.cogw) r3
            long r9 = r3.a()
            fdpr r3 = new fdpr
            r3.<init>(r0)
            cxtr r0 = new cxtr
            r0.<init>(r3, r4, r12)
            fdui r3 = new fdui
            r3.<init>(r0)
            auxw r0 = new auxw
            r0.<init>(r3, r4)
            fdui r3 = new fdui
            r3.<init>(r0)
            fdpl r0 = defpackage.fdpn.a(r3, r8, r8)
            cxtu r3 = new cxtu
            r3.<init>(r12, r4)
            fdtm r11 = new fdtm
            r11.<init>(r0, r3)
            cxtv r0 = new cxtv
            r5 = 0
            r1 = r12
            r4 = r2
            r2 = r9
            r0.<init>(r1, r2, r4, r5)
            fdqt r1 = new fdqt
            r1.<init>(r11, r0)
            r6.d = r8
            java.lang.Object r0 = defpackage.fdpy.a(r1, r6)
            if (r0 != r7) goto Lbf
            goto Lc2
        Lbf:
            fctx r0 = defpackage.fctx.a
            return r0
        Lc2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver.h(java.io.File, int, int, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r44, android.content.Context r45, boolean r46, defpackage.fcxy r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver.i(int, android.content.Context, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r17, java.lang.String r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            boolean r3 = r2 instanceof defpackage.cxtz
            if (r3 == 0) goto L19
            r3 = r2
            cxtz r3 = (defpackage.cxtz) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            cxtz r3 = new cxtz
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.a
            fcyl r4 = defpackage.fcyl.a
            int r5 = r3.c
            r6 = 1
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L33
            java.lang.String r1 = r3.e
            java.lang.String r3 = r3.d
            defpackage.fctl.b(r2)
            r6 = r1
            r5 = r3
            goto L66
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            defpackage.fctl.b(r2)
            fcsu r2 = r0.k()
            java.lang.Object r2 = r2.b()
            r2.getClass()
            fcyh r2 = (defpackage.fcyh) r2
            fcyh r2 = defpackage.eicg.a(r2)
            cxty r5 = new cxty
            r7 = 0
            r5.<init>(r7, r0, r1)
            r3.d = r1
            r7 = r18
            r3.e = r7
            r3.c = r6
            java.lang.Object r2 = defpackage.fdin.a(r2, r5, r3)
            if (r2 != r4) goto L64
            return r4
        L64:
            r5 = r1
            r6 = r7
        L66:
            java.lang.Number r2 = (java.lang.Number) r2
            long r9 = r2.longValue()
            fcsu r1 = r0.l()
            java.lang.Object r1 = r1.b()
            cogw r1 = (defpackage.cogw) r1
            j$.time.Instant r1 = r1.f()
            long r7 = r1.toEpochMilli()
            r14 = 1
            r15 = 1
            r11 = -1
            r13 = 0
            android.content.ContentValues r1 = defpackage.cxsp.a(r5, r6, r7, r9, r11, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver.j(java.lang.String, java.lang.String, fcxy):java.lang.Object");
    }

    public final fcsu k() {
        fcsu fcsuVar = this.h;
        if (fcsuVar != null) {
            return fcsuVar;
        }
        fdbq.c("backgroundContext");
        return null;
    }

    public final fcsu l() {
        fcsu fcsuVar = this.f;
        if (fcsuVar != null) {
            return fcsuVar;
        }
        fdbq.c("clock");
        return null;
    }
}
