package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejcz implements ejcj {
    public final Context a;
    public final fcsu b;
    public final fcsu c;
    public final ekrg d;
    public final AtomicReference e;
    private final fcsu f;
    private final fdjx g;
    private final fcsu h;
    private final Set i;
    private final fctc j;
    private final fctc k;

    public ejcz(Context context, fcsu fcsuVar, fdjx fdjxVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.a = context;
        this.f = fcsuVar;
        this.g = fdjxVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.h = fcsuVar4;
        this.d = ekrg.c("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl");
        this.i = new LinkedHashSet();
        this.j = fctd.a(new fdae() { // from class: ejck
            @Override // defpackage.fdae
            public final Object invoke() {
                Context context2;
                ExecutorService executorService;
                Executor executor;
                Duration duration;
                ScheduledExecutorService scheduledExecutorService;
                ejcz ejczVar = this.a;
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new smm("AiCoreClientWorker"));
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new smm("AiCoreClientScheduler"));
                smr smrVar = new smr();
                smrVar.a = ejczVar.a;
                smrVar.b(sml.a);
                if (executorServiceNewCachedThreadPool == null) {
                    throw new NullPointerException("Null workerExecutor");
                }
                smrVar.b = executorServiceNewCachedThreadPool;
                smrVar.a();
                Duration duration2 = Duration.ZERO;
                if (duration2 == null) {
                    throw new NullPointerException("Null autoUnbindTimeoutMs");
                }
                smrVar.e = duration2;
                if (scheduledExecutorServiceNewScheduledThreadPool == null) {
                    throw new NullPointerException("Null autoUnbindScheduledExecutor");
                }
                smrVar.f = scheduledExecutorServiceNewScheduledThreadPool;
                smrVar.g = true;
                smrVar.h = (byte) (smrVar.h | 2);
                smrVar.b((Executor) ejczVar.b.b());
                smrVar.a();
                if (smrVar.h == 3 && (context2 = smrVar.a) != null && (executorService = smrVar.b) != null && (executor = smrVar.c) != null && (duration = smrVar.e) != null && (scheduledExecutorService = smrVar.f) != null) {
                    return ejcc.a(new sms(context2, executorService, executor, smrVar.d, duration, scheduledExecutorService, smrVar.g));
                }
                StringBuilder sb = new StringBuilder();
                if (smrVar.a == null) {
                    sb.append(" context");
                }
                if (smrVar.b == null) {
                    sb.append(" workerExecutor");
                }
                if (smrVar.c == null) {
                    sb.append(" callbackExecutor");
                }
                if ((smrVar.h & 1) == 0) {
                    sb.append(" bindImportantEnabled");
                }
                if (smrVar.e == null) {
                    sb.append(" autoUnbindTimeoutMs");
                }
                if (smrVar.f == null) {
                    sb.append(" autoUnbindScheduledExecutor");
                }
                if ((smrVar.h & 2) == 0) {
                    sb.append(" autoDownloadEnabled");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        });
        Object objB = fcsuVar4.b();
        objB.getClass();
        this.e = new AtomicReference(new ejcp((eony) objB));
        this.k = fctd.a(new fdae() { // from class: ejcl
            @Override // defpackage.fdae
            public final Object invoke() throws Resources.NotFoundException {
                String[] stringArray = this.a.a.getResources().getStringArray(R.array.suggested_text_starters);
                stringArray.getClass();
                return fcur.M(stringArray);
            }
        });
    }

    private final Object m(int i, Integer num, fcxy fcxyVar) {
        return num != null ? fdxs.c(h().b(i, num.intValue()), fcxyVar) : fdxs.c(h().a(i), fcxyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(smq smqVar, boolean z) {
        ejcp ejcpVar = (ejcp) this.e.get();
        if (ejcpVar.c()) {
            ejcpVar.b();
        } else if (z) {
            return;
        }
        fdil.d(this.g, null, null, new ejcx(this, smqVar, null), 3);
    }

    private static final spk o(ezdx ezdxVar) {
        evtg<ezdv> evtgVar = ezdxVar.b;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
        for (ezdv ezdvVar : evtgVar) {
            arrayList.add(new spe(ezdvVar.b == 30 ? (String) ezdvVar.c : "", "User".concat(String.valueOf(ezdvVar.d))));
        }
        ekgb ekgbVarN = ekgb.n(arrayList);
        smy smyVar = smy.a;
        if (ekgbVarN != null) {
            return new spf(ekgbVarN, smyVar);
        }
        throw new IllegalStateException("Missing required properties:".concat(" messages"));
    }

    @Override // defpackage.ejcj
    public final Object a(List list, fcxy fcxyVar) {
        return k(list, fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r11 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ejcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ezdx r7, int r8, long r9, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.ejcv
            if (r0 == 0) goto L13
            r0 = r11
            ejcv r0 = (defpackage.ejcv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ejcv r0 = new ejcv
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L2b
            goto L89
        L2b:
            r7 = move-exception
            goto L96
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            long r9 = r0.a
            ezdx r7 = r0.e
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L2b
            goto L4c
        L3d:
            defpackage.fctl.b(r11)
            r0.e = r7     // Catch: java.lang.Throwable -> L2b
            r0.a = r9     // Catch: java.lang.Throwable -> L2b
            r0.d = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r11 = r6.i(r8, r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r11 == r1) goto L95
        L4c:
            smq r11 = (defpackage.smq) r11     // Catch: java.lang.Throwable -> L2b
            if (r11 != 0) goto L51
            return r5
        L51:
            spk r7 = o(r7)     // Catch: java.lang.Throwable -> L2b
            fcsu r8 = r6.c     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Throwable -> L2b
            ejcc r8 = (defpackage.ejcc) r8     // Catch: java.lang.Throwable -> L2b
            smj r8 = r6.h()     // Catch: java.lang.Throwable -> L2b
            ejcr r2 = new ejcr     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L2b
            smp r8 = defpackage.ejcc.c(r8, r11, r2)     // Catch: java.lang.Throwable -> L2b
            com.google.common.util.concurrent.ListenableFuture r7 = r8.b(r7)     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L2b
            fcsu r11 = r6.f     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r11 = r11.b()     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.ScheduledExecutorService r11 = (java.util.concurrent.ScheduledExecutorService) r11     // Catch: java.lang.Throwable -> L2b
            com.google.common.util.concurrent.ListenableFuture r7 = defpackage.eork.p(r7, r9, r8, r11)     // Catch: java.lang.Throwable -> L2b
            r7.getClass()     // Catch: java.lang.Throwable -> L2b
            r0.e = r5     // Catch: java.lang.Throwable -> L2b
            r0.d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r11 = defpackage.fdxs.c(r7, r0)     // Catch: java.lang.Throwable -> L2b
            if (r11 == r1) goto L95
        L89:
            smx r11 = (defpackage.smx) r11     // Catch: java.lang.Throwable -> L2b
            int r7 = r11.a()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L2b
            return r8
        L95:
            return r1
        L96:
            ekrg r8 = r6.d
            ekrw r8 = r8.j()
            ekrz r9 = defpackage.eksq.a
            java.lang.String r10 = "BuglePenpal"
            r8.X(r9, r10)
            ekrd r8 = (defpackage.ekrd) r8
            ekrw r7 = r8.g(r7)
            r8 = 395(0x18b, float:5.54E-43)
            java.lang.String r9 = "PenpalOnDeviceClientImpl.kt"
            java.lang.String r10 = "com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl"
            java.lang.String r11 = "getTokenCount"
            ekrw r7 = r7.h(r10, r11, r8, r9)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "Getting token count failed"
            r7.q(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejcz.b(ezdx, int, long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0258 A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0262 A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026b A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145 A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, LOOP:3: B:74:0x01d5->B:76:0x01db, LOOP_END, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0205 A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0243 A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024e A[Catch: Exception -> 0x0033, TimeoutException -> 0x0036, smo -> 0x0039, TryCatch #2 {TimeoutException -> 0x0036, smo -> 0x0039, Exception -> 0x0033, blocks: (B:13:0x002e, B:54:0x0130, B:55:0x013f, B:57:0x0145, B:59:0x0156, B:60:0x015a, B:61:0x0168, B:63:0x016e, B:65:0x018c, B:66:0x0190, B:67:0x0199, B:69:0x019f, B:71:0x01b4, B:72:0x01bc, B:73:0x01c2, B:74:0x01d5, B:76:0x01db, B:77:0x01ee, B:78:0x01ff, B:80:0x0205, B:81:0x0215, B:82:0x0218, B:91:0x0232, B:83:0x021b, B:84:0x021e, B:85:0x0221, B:86:0x0224, B:87:0x0227, B:88:0x022a, B:89:0x022d, B:90:0x0230, B:30:0x00b8, B:32:0x00bf, B:33:0x00d6, B:34:0x00d9, B:110:0x0280, B:111:0x0283, B:35:0x00dd, B:36:0x00e4, B:44:0x00f3, B:46:0x00fa, B:48:0x00fe, B:51:0x0104, B:93:0x023a, B:95:0x0243, B:96:0x0248, B:98:0x024e, B:99:0x0253, B:101:0x0258, B:102:0x025d, B:104:0x0262, B:105:0x0267, B:107:0x026b, B:108:0x0270, B:109:0x027f, B:112:0x0284, B:113:0x028b), top: B:123:0x0026 }] */
    @Override // defpackage.ejcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r17, defpackage.epiv r18, int r19, int r20, java.lang.Integer r21, long r22, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejcz.c(java.lang.String, epiv, int, int, java.lang.Integer, long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9 A[Catch: Exception -> 0x002d, TimeoutException -> 0x0032, smo -> 0x0037, TryCatch #2 {TimeoutException -> 0x0032, smo -> 0x0037, Exception -> 0x002d, blocks: (B:13:0x0028, B:38:0x00e4, B:39:0x00f3, B:41:0x00f9, B:43:0x010a, B:44:0x010e, B:45:0x011c, B:47:0x0122, B:49:0x0133, B:50:0x0137, B:51:0x014f, B:53:0x0155, B:35:0x00c1), top: B:65:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122 A[Catch: Exception -> 0x002d, TimeoutException -> 0x0032, smo -> 0x0037, TryCatch #2 {TimeoutException -> 0x0032, smo -> 0x0037, Exception -> 0x002d, blocks: (B:13:0x0028, B:38:0x00e4, B:39:0x00f3, B:41:0x00f9, B:43:0x010a, B:44:0x010e, B:45:0x011c, B:47:0x0122, B:49:0x0133, B:50:0x0137, B:51:0x014f, B:53:0x0155, B:35:0x00c1), top: B:65:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155 A[Catch: Exception -> 0x002d, TimeoutException -> 0x0032, smo -> 0x0037, LOOP:2: B:51:0x014f->B:53:0x0155, LOOP_END, TRY_LEAVE, TryCatch #2 {TimeoutException -> 0x0032, smo -> 0x0037, Exception -> 0x002d, blocks: (B:13:0x0028, B:38:0x00e4, B:39:0x00f3, B:41:0x00f9, B:43:0x010a, B:44:0x010e, B:45:0x011c, B:47:0x0122, B:49:0x0133, B:50:0x0137, B:51:0x014f, B:53:0x0155, B:35:0x00c1), top: B:65:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ejcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ezdx r8, int r9, int r10, java.lang.Integer r11, long r12, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejcz.d(ezdx, int, int, java.lang.Integer, long, fcxy):java.lang.Object");
    }

    @Override // defpackage.ejcj
    public final String e(ezdx ezdxVar) {
        ezdxVar.getClass();
        ekgb<sko> ekgbVar = o(ezdxVar).d().a;
        ekgbVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        for (sko skoVar : ekgbVar) {
            arrayList.add(skoVar.a + ": " + skoVar.b);
        }
        return fcva.aF(arrayList, "\n", null, null, null, 62);
    }

    @Override // defpackage.ejcj
    public final String f(ezdx ezdxVar) {
        ezdxVar.getClass();
        String str = String.format("Given the conversation history between User0 and User1, predict what User0 will likely say next.\nConversation:\n%s\n\nUser0's Response: <ctrl23>", Arrays.copyOf(new Object[]{e(ezdxVar)}, 1));
        str.getClass();
        return str;
    }

    @Override // defpackage.ejcj
    public final void g() {
        fdil.d(this.g, null, null, new ejcq(this, null), 3);
    }

    public final smj h() {
        return (smj) this.j.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r12, java.lang.Integer r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.ejcs
            if (r0 == 0) goto L13
            r0 = r14
            ejcs r0 = (defpackage.ejcs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ejcs r0 = new ejcs
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r14)
            goto L3a
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            defpackage.fctl.b(r14)
            r0.c = r3
            java.lang.Object r14 = r11.j(r12, r13, r0)
            if (r14 == r1) goto L9f
        L3a:
            fcti r14 = (defpackage.fcti) r14
            java.lang.Object r12 = r14.a
            smq r12 = (defpackage.smq) r12
            java.lang.Object r13 = r14.b
            ejcd r13 = (defpackage.ejcd) r13
            ejcd r14 = defpackage.ejcd.a
            if (r13 == r14) goto L9e
            java.util.concurrent.atomic.AtomicReference r12 = r11.e
            java.lang.Object r12 = r12.get()
            ejcp r12 = (defpackage.ejcp) r12
            fdvc r14 = r12.f
            fdvc r0 = r12.g
            fdvc r1 = r12.h
            fdvc r12 = r12.i
            ejdb r2 = new ejdb
            r2.<init>(r14, r0, r1, r12)
            r13.getClass()
            java.util.Objects.toString(r13)
            java.lang.String r12 = r13.toString()
            java.lang.String r14 = "Features are not available, status: "
            java.lang.String r5 = r14.concat(r12)
            int r12 = r13.ordinal()
            if (r12 == r3) goto L98
            r14 = 2
            if (r12 == r14) goto L98
            r14 = 3
            if (r12 == r14) goto L8c
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r13)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "Unexpected value, "
            java.lang.String r13 = r14.concat(r13)
            r12.<init>(r13)
            throw r12
        L8c:
            ejde r4 = new ejde
            r9 = 0
            r10 = 26
            r6 = 0
            r7 = 7
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L9d
        L98:
            ejda r4 = new ejda
            r4.<init>(r5, r2)
        L9d:
            throw r4
        L9e:
            return r12
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejcz.i(int, java.lang.Integer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r11, java.lang.Integer r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejcz.j(int, java.lang.Integer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (r0 != r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
    
        if (r0 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [ejcz] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e4 -> B:37:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.List r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejcz.k(java.util.List, fcxy):java.lang.Object");
    }
}
