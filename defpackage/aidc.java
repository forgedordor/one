package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidc implements ehwh {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/restore/synclet/MessagesRestoreCleanupDailySynclet");
    public final cogw a;
    private final fdjx c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final ahzu g;

    public aidc(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar, ahzv ahzvVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        cogwVar.getClass();
        ahzvVar.getClass();
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.a = cogwVar;
        this.g = ahzvVar.a(b, null, null);
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new aidb(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j$.time.Duration r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.aicy
            if (r0 == 0) goto L13
            r0 = r10
            aicy r0 = (defpackage.aicy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aicy r0 = new aicy
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            j$.time.Duration r9 = r0.d
            defpackage.fctl.b(r10)
            goto L4d
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            defpackage.fctl.b(r10)
            ahzu r10 = r8.g
            java.lang.String r2 = "MessagesRestoreDailySynclet deleting restore database and attachments for inactive executions"
            r10.g(r2)
            fcsu r10 = r8.e
            java.lang.Object r10 = r10.b()
            ahtm r10 = (defpackage.ahtm) r10
            r0.d = r9
            r0.c = r3
            java.lang.Object r10 = r10.e(r0)
            if (r10 == r1) goto L8c
        L4d:
            r5 = r9
            ekgb r10 = (defpackage.ekgb) r10
            ekqh r9 = r10.iterator()
            r9.getClass()
        L57:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L89
            java.lang.Object r10 = r9.next()
            ahto r10 = (defpackage.ahto) r10
            fcsu r0 = r8.f
            java.lang.Object r0 = r0.b()
            r2 = r0
            ahwi r2 = (defpackage.ahwi) r2
            java.util.UUID r4 = r10.a
            enzp r3 = defpackage.enzp.CLEAN_UP
            enzh r10 = defpackage.enzh.a
            evsf r10 = r10.createBuilder()
            enzf r10 = (defpackage.enzf) r10
            r10.getClass()
            r0 = 3
            defpackage.enms.b(r0, r10)
            enzh r6 = defpackage.enms.a(r10)
            r7 = 248(0xf8, float:3.48E-43)
            defpackage.ahwi.b(r2, r3, r4, r5, r6, r7)
            goto L57
        L89:
            fctx r9 = defpackage.fctx.a
            return r9
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidc.b(j$.time.Duration, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(j$.time.Duration r11, defpackage.fcxy r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.aicz
            if (r0 == 0) goto L13
            r0 = r12
            aicz r0 = (defpackage.aicz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aicz r0 = new aicz
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            j$.time.Duration r11 = r0.d
            defpackage.fctl.b(r12)
            goto L62
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            defpackage.fctl.b(r12)
            ahzu r12 = r10.g
            java.lang.String r2 = "MessagesRestoreDailySynclet marking restore executions past the restore expiry as closed"
            r12.g(r2)
            fcsu r12 = r10.d
            java.lang.Object r12 = r12.b()
            ahwd r12 = (defpackage.ahwd) r12
            r2 = 3
            aiaf[] r2 = new defpackage.aiaf[r2]
            r5 = 0
            aiaf r6 = defpackage.aiaf.WAITING_ON_APP_UPDATE
            r2[r5] = r6
            aiaf r5 = defpackage.aiaf.WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN
            r2[r4] = r5
            aiaf r5 = defpackage.aiaf.WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT
            r2[r3] = r5
            java.util.Set r2 = defpackage.fcwm.d(r2)
            r0.d = r11
            r0.c = r4
            java.lang.Object r12 = r12.e(r2, r0)
            if (r12 == r1) goto La0
        L62:
            r7 = r11
            ekgb r12 = (defpackage.ekgb) r12
            ekqh r11 = r12.iterator()
            r11.getClass()
        L6c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L9d
            java.lang.Object r12 = r11.next()
            ahto r12 = (defpackage.ahto) r12
            fcsu r0 = r10.f
            java.lang.Object r0 = r0.b()
            r4 = r0
            ahwi r4 = (defpackage.ahwi) r4
            java.util.UUID r6 = r12.a
            enzp r5 = defpackage.enzp.CLEAN_UP
            enzh r12 = defpackage.enzh.a
            evsf r12 = r12.createBuilder()
            enzf r12 = (defpackage.enzf) r12
            r12.getClass()
            defpackage.enms.b(r3, r12)
            enzh r8 = defpackage.enms.a(r12)
            r9 = 248(0xf8, float:3.48E-43)
            defpackage.ahwi.b(r4, r5, r6, r7, r8, r9)
            goto L6c
        L9d:
            fctx r11 = defpackage.fctx.a
            return r11
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidc.c(j$.time.Duration, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.aida
            if (r0 == 0) goto L13
            r0 = r11
            aida r0 = (defpackage.aida) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aida r0 = new aida
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            j$.time.Instant r0 = r0.d
            defpackage.fctl.b(r11)
            goto L56
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L31:
            defpackage.fctl.b(r11)
            ahzu r11 = r10.g
            java.lang.String r2 = "MessagesRestoreDailySynclet marking restore executions past the reprompt timeout as ready for reprompt"
            r11.g(r2)
            cogw r11 = r10.a
            fcsu r2 = r10.d
            j$.time.Instant r11 = r11.f()
            java.lang.Object r2 = r2.b()
            ahwd r2 = (defpackage.ahwd) r2
            r0.d = r11
            r0.c = r3
            java.lang.Object r0 = r2.p(r0)
            if (r0 == r1) goto L8c
            r9 = r0
            r0 = r11
            r11 = r9
        L56:
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r11 = r11.iterator()
        L5c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r11.next()
            ahto r1 = (defpackage.ahto) r1
            fcsu r2 = r10.f
            java.lang.Object r2 = r2.b()
            r3 = r2
            ahwi r3 = (defpackage.ahwi) r3
            java.util.UUID r5 = r1.a
            cogw r1 = r10.a
            enzp r4 = defpackage.enzp.WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT
            j$.time.Instant r1 = r1.f()
            j$.time.Duration r6 = j$.time.Duration.between(r0, r1)
            r6.getClass()
            r7 = 0
            r8 = 504(0x1f8, float:7.06E-43)
            defpackage.ahwi.b(r3, r4, r5, r6, r7, r8)
            goto L5c
        L89:
            fctx r11 = defpackage.fctx.a
            return r11
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidc.d(fcxy):java.lang.Object");
    }
}
