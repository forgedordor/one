package defpackage;

import androidx.car.app.model.Alert;
import io.grpc.Status;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byjl {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupSingleItemProcessor");
    public final fdjx a;
    private final aukz c;
    private final cogw d;
    private final byik e;
    private final bykf f;
    private final cpup g;
    private final cden h;
    private final apqc i;
    private final byiv j;
    private final cazc k;
    private final String l;
    private final int m;
    private final bypt n;
    private final emcd o;

    public byjl(Map map, aukz aukzVar, cogw cogwVar, byik byikVar, bykf bykfVar, cpup cpupVar, cden cdenVar, fdjx fdjxVar, apqc apqcVar, byiv byivVar, cazc cazcVar, String str, int i) {
        this.c = aukzVar;
        this.d = cogwVar;
        this.e = byikVar;
        this.f = bykfVar;
        this.g = cpupVar;
        this.h = cdenVar;
        this.a = fdjxVar;
        this.i = apqcVar;
        this.j = byivVar;
        this.k = cazcVar;
        this.l = str;
        this.m = i;
        bypt byptVar = (bypt) map.get(Integer.valueOf(byivVar.d));
        if (byptVar == null) {
            throw new IllegalArgumentException("No handler registered for table type " + byivVar + ".tableType");
        }
        this.n = byptVar;
        emcd emcdVarA = aukk.a(byivVar.d, byivVar.f);
        emcdVarA.getClass();
        this.o = emcdVarA;
    }

    static /* synthetic */ cbcw g(byjl byjlVar) {
        return byjlVar.h(fcvo.a);
    }

    private final cbcw h(List list) {
        ekrd ekrdVarA = b.a(Level.FINE);
        ekrdVarA.X(eksq.a, "BugleCms");
        ((ekrd) ekrdVarA.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupSingleItemProcessor", "reEnqueueResult", 247, "CmsBackupSingleItemProcessor.kt")).B("%s Re-enqueuing work at attempt threshold: pwqAttemptCount=%d.", k(), this.m);
        cazc cazcVar = this.k;
        byiv byivVar = this.j;
        int i = byivVar.h;
        int i2 = ((caxm) cazcVar).c + i;
        evvp evvpVarC = evxc.c(this.d.f().toEpochMilli());
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byiu byiuVar = (byiu) ((byiv) it.next()).toBuilder();
            byiuVar.copyOnWrite();
            byiv byivVar2 = (byiv) byiuVar.instance;
            evvpVarC.getClass();
            byivVar2.i = evvpVarC;
            byivVar2.b |= 64;
            arrayList.add((byiv) byiuVar.build());
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.f.b((byiv) it2.next(), Duration.ZERO));
        }
        int i3 = i2 + 1;
        if (i3 < i) {
            i3 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        byiu byiuVar2 = (byiu) byivVar.toBuilder();
        byiuVar2.copyOnWrite();
        byiv byivVar3 = (byiv) byiuVar2.instance;
        byivVar3.b |= 32;
        byivVar3.h = i3;
        evsn evsnVarBuild = byiuVar2.build();
        evsnVarBuild.getClass();
        return cbcw.j(ekfv.a(fcva.ah(arrayList2, fcva.b(this.f.b((byiv) evsnVarBuild, byjd.a(i3, byivVar.d))))));
    }

    private final cbcw i() {
        if (((caxm) this.k).c >= ((Number) byil.a.e()).intValue()) {
            return g(this);
        }
        ekrd ekrdVarA = b.a(Level.FINE);
        ekrdVarA.X(eksq.a, "BugleCms");
        ((ekrd) ekrdVarA.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupSingleItemProcessor", "retryResult", 236, "CmsBackupSingleItemProcessor.kt")).t("%s Returning pwq retry result.", k());
        return cbcw.m();
    }

    private final Object j(Throwable th, fcxy fcxyVar) {
        ekrd ekrdVarA = b.a(Level.WARNING);
        ekrdVarA.X(eksq.a, "BugleCms");
        ((ekrd) ekrdVarA.g(th).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupSingleItemProcessor", "abandonWorkToDeadLetterQueue", 315, "CmsBackupSingleItemProcessor.kt")).t("%s Abandoning repeatedly failing work to DLQ.", k());
        byik byikVar = this.e;
        byiv byivVar = this.j;
        Object objC = fdxs.c(byikVar.a(byivVar, th, byivVar.g, this.m), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    private final String k() {
        byiv byivVar = this.j;
        return "className=CmsBackupSingleItemProcessor, tableType=" + byivVar.d + ", itemId=" + byivVar.e + ", flags=" + byivVar.f + ", queue=" + ((caxm) this.k).b + ", accountId=" + byivVar.c + ", priorAttempts=" + byivVar.h + ", triggerName=" + byivVar.j + ".";
    }

    private final boolean l(Throwable th) {
        byiv byivVar = this.j;
        int i = byivVar.d;
        if (i == 7) {
            return false;
        }
        return this.m >= (cpzi.b(Status.c(th)) ? ((Integer) cpyl.c.e()).intValue() : ((Integer) cpyl.d.e()).intValue()) + (byik.d(byivVar.f, i) == bmqz.BACKUP_DELETE ? ((Integer) byil.b.e()).intValue() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.byqq r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.byje
            if (r0 == 0) goto L13
            r0 = r6
            byje r0 = (defpackage.byje) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            byje r0 = new byje
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            java.lang.Throwable r5 = r5.a
            r0.c = r3
            java.lang.Object r5 = r4.j(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            cbcw r5 = defpackage.cbcw.k()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byjl.a(byqq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (j(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.byqr r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.byjf
            if (r0 == 0) goto L13
            r0 = r7
            byjf r0 = (defpackage.byjf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            byjf r0 = new byjf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L4a
        L36:
            defpackage.fctl.b(r7)
            java.lang.Throwable r6 = r6.a
            boolean r7 = r5.l(r6)
            if (r7 == 0) goto L4f
            r0.c = r4
            java.lang.Object r6 = r5.j(r6, r0)
            if (r6 != r1) goto L4a
            goto L5d
        L4a:
            cbcw r6 = defpackage.cbcw.k()
            return r6
        L4f:
            boolean r7 = r6 instanceof defpackage.cpyx
            if (r7 == 0) goto L5f
            cpyx r6 = (defpackage.cpyx) r6
            r0.c = r3
            java.lang.Object r6 = r5.e(r6, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            return r6
        L5f:
            boolean r6 = r6 instanceof defpackage.bzzu
            if (r6 == 0) goto L68
            cbcw r6 = g(r5)
            return r6
        L68:
            cbcw r6 = r5.i()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byjl.b(byqr, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (j(r6, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.byqu r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.byjg
            if (r0 == 0) goto L13
            r0 = r7
            byjg r0 = (defpackage.byjg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            byjg r0 = new byjg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L6c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            byqu r6 = r0.d
            defpackage.fctl.b(r7)
            goto L4b
        L38:
            defpackage.fctl.b(r7)
            cpup r7 = r5.g
            eiju r7 = r7.a(r4)
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L76
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L58
            cbcw r6 = defpackage.cbcw.i()
            return r6
        L58:
            java.lang.Throwable r6 = r6.a
            boolean r7 = r5.l(r6)
            if (r7 == 0) goto L71
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = r5.j(r6, r0)
            if (r6 != r1) goto L6c
            goto L76
        L6c:
            cbcw r6 = defpackage.cbcw.k()
            return r6
        L71:
            cbcw r6 = r5.i()
            return r6
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byjl.c(byqu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.Exception r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.byjh
            if (r0 == 0) goto L13
            r0 = r11
            byjh r0 = (defpackage.byjh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            byjh r0 = new byjh
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "buildUnexpectedExceptionResult"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsBackupSingleItemProcessor"
            java.lang.String r5 = "BugleCms"
            r6 = 1
            java.lang.String r7 = "CmsBackupSingleItemProcessor.kt"
            if (r2 == 0) goto L3a
            if (r2 != r6) goto L32
            defpackage.fctl.b(r11)     // Catch: java.lang.Exception -> L30
            goto Lad
        L30:
            r10 = move-exception
            goto L8b
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            defpackage.fctl.b(r11)
            ekrg r11 = defpackage.byjl.b
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            ekrd r11 = r11.a(r2)
            ekrz r2 = defpackage.eksq.a
            r11.X(r2, r5)
            ekrw r11 = r11.g(r10)
            r2 = 106(0x6a, float:1.49E-43)
            ekrw r11 = r11.h(r4, r3, r2, r7)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = r9.k()
            java.lang.String r8 = "%s Unexpected failure while handling process result."
            r11.t(r8, r2)
            int r11 = r9.m
            if (r11 != r6) goto Lad
            aukz r11 = r9.c     // Catch: java.lang.Exception -> L30
            emcd r2 = r9.o     // Catch: java.lang.Exception -> L30
            byiv r8 = r9.j     // Catch: java.lang.Exception -> L30
            boolean r8 = r8.g     // Catch: java.lang.Exception -> L30
            r11.g(r2, r8, r6, r10)     // Catch: java.lang.Exception -> L30
            apqc r11 = r9.i     // Catch: java.lang.Exception -> L30
            boolean r11 = r11.a()     // Catch: java.lang.Exception -> L30
            if (r11 != 0) goto L85
            cden r11 = r9.h     // Catch: java.lang.Exception -> L30
            eiju r10 = r11.b(r10)     // Catch: java.lang.Exception -> L30
            r0.c = r6     // Catch: java.lang.Exception -> L30
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)     // Catch: java.lang.Exception -> L30
            if (r10 != r1) goto Lad
            return r1
        L85:
            java.lang.String r11 = "Unexpected failure while handling process result"
            defpackage.cpri.c(r11, r10)     // Catch: java.lang.Exception -> L30
            goto Lad
        L8b:
            ekrg r11 = defpackage.byjl.b
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            ekrd r11 = r11.a(r0)
            ekrz r0 = defpackage.eksq.a
            r11.X(r0, r5)
            ekrw r10 = r11.g(r10)
            r11 = 130(0x82, float:1.82E-43)
            ekrw r10 = r10.h(r4, r3, r11, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = r9.k()
            java.lang.String r0 = "%s Exception while trying to log previous exception."
            r10.t(r0, r11)
        Lad:
            cbcw r10 = r9.i()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byjl.d(java.lang.Exception, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0109, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cpyx r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byjl.e(cpyx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (r12 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e7, code lost:
    
        if (r12 != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        if (r12 != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        if (r12 != r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byjl.f(fcxy):java.lang.Object");
    }
}
