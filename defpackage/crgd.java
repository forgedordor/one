package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crgd implements cray, cqci {
    private final fcsu A;
    private final crau B;
    private final fcsu C;
    private boolean D;
    private boolean E;
    private final fctc F;
    private final fctc G;
    private final fdap H;
    public final fcsu a;
    public final fcsu b;
    public final fcyh c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final cogw h;
    public final crhm i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final cqce n;
    public final ConcurrentMap o;
    public ejkp p;
    public long q;
    public final Locale r;
    public final feav s;
    private final Context t;
    private final fcsu u;
    private final fcsu v;
    private final fcyh w;
    private final eosc x;
    private final fcyh y;
    private final fdjx z;

    public crgd(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcyh fcyhVar, eosc eoscVar, fcyh fcyhVar2, fcyh fcyhVar3, fdjx fdjxVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, crau crauVar, fcsu fcsuVar9, fcsu fcsuVar10, cogw cogwVar, crhm crhmVar, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcyhVar.getClass();
        eoscVar.getClass();
        fcyhVar2.getClass();
        fcyhVar3.getClass();
        fdjxVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar8.getClass();
        crauVar.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        cogwVar.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        fcsuVar15.getClass();
        this.t = context;
        this.a = fcsuVar;
        this.u = fcsuVar2;
        this.b = fcsuVar3;
        this.v = fcsuVar4;
        this.w = fcyhVar;
        this.x = eoscVar;
        this.c = fcyhVar2;
        this.y = fcyhVar3;
        this.z = fdjxVar;
        this.d = fcsuVar5;
        this.A = fcsuVar6;
        this.e = fcsuVar7;
        this.f = fcsuVar8;
        this.B = crauVar;
        this.C = fcsuVar9;
        this.g = fcsuVar10;
        this.h = cogwVar;
        this.i = crhmVar;
        this.j = fcsuVar11;
        this.k = fcsuVar12;
        this.l = fcsuVar13;
        this.m = fcsuVar14;
        this.n = cqce.g("Bugle", "SmartSuggestionRequester");
        this.F = fctd.a(new fdae() { // from class: crfl
            @Override // defpackage.fdae
            public final Object invoke() {
                return new crgv((ejly) this.a.d.b());
            }
        });
        this.G = fctd.a(new fdae() { // from class: crfm
            @Override // defpackage.fdae
            public final Object invoke() {
                return new crgw((ejly) this.a.d.b());
            }
        });
        this.H = new elge(new crft(this, null));
        this.o = new ConcurrentHashMap();
        this.r = craf.c(context);
        this.s = new feaz();
    }

    public static final emir k(int i, long j) {
        emiq emiqVar = (emiq) emir.a.createBuilder();
        emiqVar.copyOnWrite();
        emir emirVar = (emir) emiqVar.instance;
        emirVar.c = i - 2;
        emirVar.b |= 1;
        emiqVar.copyOnWrite();
        emir emirVar2 = (emir) emiqVar.instance;
        emirVar2.b |= 2;
        emirVar2.d = j;
        evsn evsnVarBuild = emiqVar.build();
        evsnVarBuild.getClass();
        return (emir) evsnVarBuild;
    }

    private final void l() {
        try {
            this.n.p("Loading Smart Reply JNIs.");
            boolean z = (!this.B.a()) | this.E;
            this.E = z;
            if (!z) {
                crew.c();
                cqdk.b("sensitive_classifier_jni");
                cqdk.b("pumpkin_jni_android");
                this.D = true;
            }
        } catch (UnsatisfiedLinkError e) {
            if (!Thread.currentThread().isInterrupted()) {
                this.D = true;
            }
            cqbd cqbdVarE = this.n.e();
            cqbdVarE.I("Problem linking Smart Reply JNIs.");
            cqbdVarE.s(e);
            this.E = true;
        } catch (Throwable th) {
            if (!Thread.currentThread().isInterrupted()) {
                this.D = true;
            }
            cqbd cqbdVarE2 = this.n.e();
            cqbdVarE2.I("Problem loading Smart Reply JNIs.");
            cqbdVarE2.s(th);
            this.E = true;
        }
        if (this.E) {
            return;
        }
        try {
            cqdk.b("mediapipe_tasks_vision_jni");
        } catch (Throwable th2) {
            cqbd cqbdVarE3 = this.n.e();
            cqbdVarE3.I("Problem loading Mediapipe Text Classifier JNIs.");
            cqbdVarE3.s(th2);
        }
    }

    private final boolean m() {
        return this.p == null && !this.E;
    }

    @Override // defpackage.cray
    public final eiju a(List list) throws IOException {
        list.getClass();
        eieu eieuVarH = eiiy.h("SmartSuggestionRequesterImpl#generateSmartSuggestions");
        try {
            eiju eijuVarC = auvw.c(this.z, fcyi.a, fdjz.a, new crfu(this, list, null));
            fczl.a(eieuVarH, null);
            return eijuVarC;
        } finally {
        }
    }

    @Override // defpackage.cray
    public final eiju b(List list, final String str) {
        list.getClass();
        str.getClass();
        if (list.isEmpty()) {
            eiju eijuVarE = eijx.e(false);
            eijuVarE.getClass();
            return eijuVarE;
        }
        eiju eijuVarC = auvw.c(this.z, fcyi.a, fdjz.a, new crga(this, list, (MessageCoreData) list.get(0), null));
        Future future = (Future) this.o.put(str, eijuVarC);
        if (future != null) {
            future.cancel(false);
        }
        final fdap fdapVar = new fdap() { // from class: crfj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                return bool;
            }
        };
        return eijuVarC.h(new ejvr() { // from class: crfk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        }, this.x);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0994 A[Catch: all -> 0x09ab, Exception -> 0x0a15, TRY_ENTER, TryCatch #6 {all -> 0x09ab, blocks: (B:536:0x0994, B:537:0x0997, B:538:0x09aa, B:496:0x0905, B:497:0x0906, B:502:0x0939, B:503:0x0941), top: B:703:0x0906 }] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0bf2  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0709 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:706:0x0a6d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:762:0x0a51 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:799:0x084b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0b1e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:823:0x0939 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0169 A[Catch: Exception -> 0x0bd9, TryCatch #15 {Exception -> 0x0bd9, blocks: (B:88:0x0160, B:90:0x0169, B:91:0x016b, B:98:0x017f, B:109:0x0198, B:110:0x01a1, B:113:0x01a6, B:115:0x01b7, B:123:0x01c8, B:122:0x01c5, B:130:0x0202, B:131:0x0209, B:125:0x01ca, B:127:0x01ed, B:129:0x01f4, B:128:0x01f2, B:132:0x020a, B:76:0x0132, B:78:0x0137, B:80:0x013e, B:83:0x0147, B:85:0x014c, B:86:0x0155, B:79:0x013c, B:87:0x0156), top: B:714:0x0055, inners: #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    /* JADX WARN: Type inference failed for: r0v20, types: [euof, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ejkp c(defpackage.ejjv r52, defpackage.ekfw r53) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 3082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crgd.c(ejjv, ekfw):ejkp");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r5, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, defpackage.ekfw r7, defpackage.fcxy r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.crfo
            if (r0 == 0) goto L13
            r0 = r8
            crfo r0 = (defpackage.crfo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crfo r0 = new crfo
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            aioz r5 = r0.e
            eieu r6 = r0.f
            ekfw r7 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5d
        L2d:
            r5 = move-exception
            goto L73
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "SmartSuggestionRequesterImpl#createGetSuggestionsRequest"
            eieu r8 = defpackage.eiiy.h(r8)
            fcsu r2 = r4.g     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L71
            aioy r2 = (defpackage.aioy) r2     // Catch: java.lang.Throwable -> L71
            aioz r2 = r2.a()     // Catch: java.lang.Throwable -> L71
            r0.d = r7     // Catch: java.lang.Throwable -> L71
            r0.f = r8     // Catch: java.lang.Throwable -> L71
            r0.e = r2     // Catch: java.lang.Throwable -> L71
            r0.c = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r5 = r4.e(r5, r6, r0)     // Catch: java.lang.Throwable -> L71
            if (r5 == r1) goto L70
            r6 = r8
            r8 = r5
            r5 = r2
        L5d:
            ezcy r8 = (defpackage.ezcy) r8     // Catch: java.lang.Throwable -> L2d
            long r0 = r5.a()     // Catch: java.lang.Throwable -> L2d
            r5 = 5
            emir r5 = k(r5, r0)     // Catch: java.lang.Throwable -> L2d
            r7.h(r5)     // Catch: java.lang.Throwable -> L2d
            r5 = 0
            defpackage.fczl.a(r6, r5)
            return r8
        L70:
            return r1
        L71:
            r5 = move-exception
            r6 = r8
        L73:
            throw r5     // Catch: java.lang.Throwable -> L74
        L74:
            r7 = move-exception
            defpackage.fczl.a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crgd.d(java.util.List, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ekfw, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r6, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.crfq
            if (r0 == 0) goto L13
            r0 = r8
            crfq r0 = (defpackage.crfq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crfq r0 = new crfq
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fcyh r8 = r5.c
            fcyh r8 = defpackage.eicg.a(r8)
            crfp r2 = new crfp
            r4 = 0
            r2.<init>(r4, r5, r7, r6)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crgd.e(java.util.List, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crgd.f(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6 A[Catch: all -> 0x0107, TryCatch #2 {all -> 0x0107, blocks: (B:43:0x00de, B:45:0x00e6, B:46:0x00ea), top: B:60:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #2 {all -> 0x0107, blocks: (B:43:0x00de, B:45:0x00e6, B:46:0x00ea), top: B:60:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [crgd] */
    /* JADX WARN: Type inference failed for: r12v0, types: [ekfw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ekfw r12, defpackage.fcxy r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crgd.g(ekfw, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [ekfw] */
    /* JADX WARN: Type inference failed for: r0v14, types: [ekfw] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [crfz, fcxy] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r10v0, types: [fdae] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r10v24, types: [ajfq] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [fcyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [aioz] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aioz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ekfw r8, defpackage.aioz r9, defpackage.fdae r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crgd.h(ekfw, aioz, fdae, fcxy):java.lang.Object");
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        if (((Number) crfg.b.e()).intValue() > i) {
            return;
        }
        auvh.h(auvw.c(this.z, fcyi.a, fdjz.a, new crgc(this, null)));
    }

    public final void j(Throwable th) {
        if (((Boolean) ((cczi) crfg.e.get()).e()).booleanValue()) {
            auvh.h(((cden) this.j.b()).b(th));
        }
    }
}
