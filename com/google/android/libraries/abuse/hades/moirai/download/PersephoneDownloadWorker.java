package com.google.android.libraries.abuse.hades.moirai.download;

import android.content.Context;
import androidx.car.app.model.Alert;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.dhnv;
import defpackage.dhoc;
import defpackage.dhpi;
import defpackage.dhpk;
import defpackage.dhpl;
import defpackage.dhpt;
import defpackage.dhpv;
import defpackage.dhqw;
import defpackage.dhub;
import defpackage.dhxa;
import defpackage.dhxi;
import defpackage.diep;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.evqs;
import defpackage.fctx;
import defpackage.fdct;
import defpackage.qam;
import defpackage.qan;
import defpackage.qap;
import defpackage.seo;
import defpackage.sep;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PersephoneDownloadWorker extends CoroutineWorker {
    private static final ekrg f = ekrg.c("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker");
    public final Context e;
    private final dhxi g;
    private final dhqw h;
    private final diep i;
    private final dhoc j;
    private final dhxa k;
    private final dhpt l;
    private final dhpk m;
    private final dhpv n;
    private final dhub o;
    private final dhpl p;
    private final dhpi q;
    private final seo r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersephoneDownloadWorker(Context context, WorkerParameters workerParameters, dhxi dhxiVar, dhqw dhqwVar, diep diepVar, dhoc dhocVar, dhxa dhxaVar, dhpt dhptVar, dhpk dhpkVar, dhpv dhpvVar, dhub dhubVar, dhpl dhplVar, dhpi dhpiVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        dhxiVar.getClass();
        dhqwVar.getClass();
        diepVar.getClass();
        dhxaVar.getClass();
        dhptVar.getClass();
        dhpkVar.getClass();
        dhpvVar.getClass();
        dhubVar.getClass();
        dhplVar.getClass();
        this.e = context;
        this.g = dhxiVar;
        this.h = dhqwVar;
        this.i = diepVar;
        this.j = dhocVar;
        this.k = dhxaVar;
        this.l = dhptVar;
        this.m = dhpkVar;
        this.n = dhpvVar;
        this.o = dhubVar;
        this.p = dhplVar;
        this.q = dhpiVar;
        seo seoVar = (seo) sep.a.createBuilder();
        seoVar.getClass();
        this.r = seoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void m(com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker r3, defpackage.dhnv r4, defpackage.evqs r5, int r6, int r7, int r8, int r9) {
        /*
            seo r0 = r3.r
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            sep r1 = (defpackage.sep) r1
            sep r2 = defpackage.sep.a
            int r6 = r6 + (-1)
            r1.c = r6
            int r6 = r1.b
            r2 = 1
            r6 = r6 | r2
            r1.b = r6
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r6 = r0.instance
            sep r6 = (defpackage.sep) r6
            r1 = r9 & 8
            if (r1 == 0) goto L21
            r7 = r2
        L21:
            if (r7 == 0) goto L8a
            r9 = r9 & 16
            int r7 = r7 + (-1)
            r1 = 0
            if (r9 == 0) goto L2b
            r8 = r1
        L2b:
            r6.g = r7
            int r7 = r6.b
            r7 = r7 | 16
            r6.b = r7
            if (r8 != 0) goto L36
            goto L42
        L36:
            int r8 = r8 + (-2)
            if (r8 == 0) goto L60
            r6 = 2
            if (r8 == r2) goto L5f
            r2 = 3
            if (r8 == r6) goto L60
            if (r8 == r2) goto L5d
        L42:
            ekrg r6 = com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.f
            ekrw r6 = r6.h()
            r7 = 327(0x147, float:4.58E-43)
            java.lang.String r8 = "PersephoneDownloadWorker.kt"
            java.lang.String r9 = "com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker"
            java.lang.String r2 = "addLog"
            ekrw r6 = r6.h(r9, r2, r7, r8)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r7 = "No download status to provide to protectionDownload"
            r6.q(r7)
            r2 = r1
            goto L60
        L5d:
            r2 = 4
            goto L60
        L5f:
            r2 = r6
        L60:
            if (r2 == 0) goto L73
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r6 = r0.instance
            sep r6 = (defpackage.sep) r6
            int r2 = r2 + (-1)
            r6.f = r2
            int r7 = r6.b
            r7 = r7 | 8
            r6.b = r7
        L73:
            dhub r3 = r3.o
            java.lang.String r6 = r4.b
            dhuh r3 = r3.a(r6)
            if (r3 == 0) goto L89
            evsn r6 = r0.build()
            r6.getClass()
            sep r6 = (defpackage.sep) r6
            r3.b(r4, r5, r6)
        L89:
            return
        L8a:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.m(com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker, dhnv, evqs, int, int, int, int):void");
    }

    private static final qap n(int i) {
        ekrg ekrgVar = f;
        ((ekrd) ekrgVar.h().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 215, "PersephoneDownloadWorker.kt")).r("Current retry count: %s", i);
        ((ekrd) ekrgVar.h().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 216, "PersephoneDownloadWorker.kt")).r("Max download retry attempts: %s", Alert.DURATION_SHOW_INDEFINITELY);
        if (i < Integer.MAX_VALUE) {
            ((ekrd) ekrgVar.j().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 219, "PersephoneDownloadWorker.kt")).q("Retrying.");
            return new qan();
        }
        ((ekrd) ekrgVar.j().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneDownloadWorker", "retryOrFail", 224, "PersephoneDownloadWorker.kt")).q("Download worker reached max retry attempts. Abandoning download work.");
        return new qam();
    }

    private final Object o(dhnv dhnvVar, int i) {
        evqs evqsVar = evqs.b;
        evqsVar.getClass();
        m(this, dhnvVar, evqsVar, 4, i, 0, 16);
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0368, code lost:
    
        if (defpackage.fctx.a != r11) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (defpackage.fctx.a != r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0248, code lost:
    
        if (r0.d(r2, r8) != r11) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0126: MOVE (r4 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:295), block:B:44:0x0123 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x012d: MOVE (r2 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:302), block:B:46:0x012b */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00ee: MOVE (r4 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:239), block:B:34:0x00eb */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00f6: MOVE (r2 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:247), block:B:36:0x00f3 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0465 A[Catch: dhwn -> 0x0581, dhqx -> 0x0587, Exception -> 0x058b, TRY_LEAVE, TryCatch #6 {dhqx -> 0x0587, blocks: (B:156:0x0422, B:172:0x044c, B:174:0x0465), top: B:312:0x0422 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0542 A[Catch: Exception -> 0x056e, dhwn -> 0x0573, dhqx -> 0x0578, TRY_LEAVE, TryCatch #34 {dhwn -> 0x0573, blocks: (B:194:0x051e, B:199:0x0536, B:204:0x0542), top: B:321:0x051c }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x051e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0347 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023c A[PHI: r2
      0x023c: PHI (r2v33 dhnv) = (r2v30 dhnv), (r2v35 dhnv) binds: [B:84:0x023a, B:72:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r13v20, types: [dhqh] */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48, types: [eldz] */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker, qaq] */
    /* JADX WARN: Type inference failed for: r1v10, types: [etqc] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v37, types: [com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v14, types: [ekrw] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r4v45, types: [ekrw] */
    /* JADX WARN: Type inference failed for: r4v48, types: [ekrw] */
    /* JADX WARN: Type inference failed for: r5v20, types: [ekrw] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r31) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.dhnv r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dhqi
            if (r0 == 0) goto L13
            r0 = r7
            dhqi r0 = (defpackage.dhqi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dhqi r0 = new dhqi
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L85
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            dhpl r7 = r5.p
            java.lang.String r6 = r6.b
            sfj r6 = r7.a(r6)
            evtg r6 = r6.b
            r6.getClass()
            r7 = 10
            int r7 = defpackage.fcva.p(r6, r7)
            int r7 = defpackage.fcwa.a(r7)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r4 = 16
            int r7 = defpackage.fddu.f(r7, r4)
            r2.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        L5a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L71
            java.lang.Object r7 = r6.next()
            etqj r7 = (defpackage.etqj) r7
            java.lang.String r4 = r7.b
            r4.getClass()
            java.lang.String r7 = r7.c
            r2.put(r4, r7)
            goto L5a
        L71:
            dhpi r6 = r5.q
            if (r6 != 0) goto L76
            return r2
        L76:
            com.google.common.util.concurrent.ListenableFuture r6 = r6.a()
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L8c
            r6 = r2
        L85:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Map r6 = defpackage.fcwa.j(r6, r7)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.k(dhnv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.dhqv r22, defpackage.dhnv r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker.l(dhqv, dhnv, fcxy):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PersephoneDownloadWorker(Context context, WorkerParameters workerParameters, dhxi dhxiVar, dhqw dhqwVar, diep diepVar, Optional<dhoc> optional, dhxa dhxaVar, dhpt dhptVar, dhpk dhpkVar, dhpv dhpvVar, dhub dhubVar, dhpl dhplVar, Optional<dhpi> optional2) {
        this(context, workerParameters, dhxiVar, dhqwVar, diepVar, (dhoc) fdct.b(optional), dhxaVar, dhptVar, dhpkVar, dhpvVar, dhubVar, dhplVar, (dhpi) fdct.b(optional2));
        context.getClass();
        workerParameters.getClass();
        dhxiVar.getClass();
        dhqwVar.getClass();
        diepVar.getClass();
        optional.getClass();
        dhxaVar.getClass();
        dhptVar.getClass();
        dhpkVar.getClass();
        dhpvVar.getClass();
        dhubVar.getClass();
        dhplVar.getClass();
        optional2.getClass();
    }
}
