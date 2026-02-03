package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chrf implements efoj {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/profile/transport/IncomingProfileActionHandler");
    private final fdjx b;
    private final fcsu c;

    public chrf(fdjx fdjxVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.b = fdjxVar;
        this.c = fcsuVar;
    }

    @Override // defpackage.efoj
    public final /* bridge */ /* synthetic */ void a(evuh evuhVar, efoi efoiVar) {
        chrh chrhVar = (chrh) evuhVar;
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleProfiles");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/profile/transport/IncomingProfileActionHandler", "onMessageReceived", 29, "IncomingProfileActionHandler.kt");
        int iC = chrx.c(chrhVar.d);
        if (iC == 0) {
            iC = 1;
        }
        ekrdVar.t("Received profile action: %s", chrx.a(iC));
        int iC2 = chrx.c(chrhVar.d);
        if (iC2 == 0) {
            iC2 = 1;
        }
        int i = iC2 - 2;
        if (i == 1) {
            auvw.k(this.b, null, null, new chrd(this, chrhVar, efoiVar, null), 3);
            return;
        }
        if (i == 2) {
            auvw.k(this.b, null, null, new chre(this, efoiVar, null), 3);
            return;
        }
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleProfiles");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/profile/transport/IncomingProfileActionHandler", "onMessageReceived", 40, "IncomingProfileActionHandler.kt");
        int iC3 = chrx.c(chrhVar.d);
        ekrdVar2.t("Unable to handle profile action: %s", chrx.a(iC3 != 0 ? iC3 : 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        if (defpackage.fdxs.c(r9, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.alqm r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.chrb
            if (r0 == 0) goto L13
            r0 = r10
            chrb r0 = (defpackage.chrb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chrb r0 = new chrb
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r10)
            goto Lb3
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.fctl.b(r10)
            goto L4e
        L37:
            defpackage.fctl.b(r10)
            fcsu r10 = r8.c
            java.lang.Object r10 = r10.b()
            anty r10 = (defpackage.anty) r10
            eiju r9 = r10.p(r9)
            r0.c = r4
            java.lang.Object r10 = defpackage.fdxs.c(r9, r0)
            if (r10 == r1) goto Lb6
        L4e:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r10 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r10
            java.lang.String r9 = "handleProfileRevoke"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/profile/transport/IncomingProfileActionHandler"
            java.lang.String r4 = "BugleProfiles"
            java.lang.String r5 = "IncomingProfileActionHandler.kt"
            if (r10 != 0) goto L75
            ekrg r10 = defpackage.chrf.a
            ekrw r10 = r10.h()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r4)
            r0 = 74
            ekrw r9 = r10.h(r2, r9, r0, r5)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Not updating profile metadata, unable to find recipient"
            r9.q(r10)
            fctx r9 = defpackage.fctx.a
            return r9
        L75:
            ekrg r6 = defpackage.chrf.a
            ekrw r6 = r6.h()
            ekrz r7 = defpackage.eksq.a
            r6.X(r7, r4)
            r4 = 80
            ekrw r9 = r6.h(r2, r9, r4, r5)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r2 = "Received revoke action from recipient=%s, remove profile data"
            anue r4 = r10.F()
            r9.t(r2, r4)
            fcsu r9 = r8.c
            java.lang.Object r9 = r9.b()
            anty r9 = (defpackage.anty) r9
            anue r10 = r10.F()
            antu r2 = new antu
            r4 = 0
            r2.<init>(r4, r4, r4)
            eiju r9 = r9.H(r10, r2)
            r9.getClass()
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 != r1) goto Lb3
            goto Lb6
        Lb3:
            fctx r9 = defpackage.fctx.a
            return r9
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chrf.b(alqm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (defpackage.fdxs.c(r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.chsh r9, defpackage.alqm r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.chrc
            if (r0 == 0) goto L13
            r0 = r11
            chrc r0 = (defpackage.chrc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chrc r0 = new chrc
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r11)
            goto Ld2
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            chsh r9 = r0.d
            defpackage.fctl.b(r11)
            goto L52
        L39:
            defpackage.fctl.b(r11)
            fcsu r11 = r8.c
            java.lang.Object r11 = r11.b()
            anty r11 = (defpackage.anty) r11
            eiju r10 = r11.p(r10)
            r0.d = r9
            r0.c = r4
            java.lang.Object r11 = defpackage.fdxs.c(r10, r0)
            if (r11 == r1) goto Ld5
        L52:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r11 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r11
            java.lang.String r10 = "handleProfileShare"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/profile/transport/IncomingProfileActionHandler"
            java.lang.String r4 = "BugleProfiles"
            java.lang.String r5 = "IncomingProfileActionHandler.kt"
            if (r11 != 0) goto L79
            ekrg r9 = defpackage.chrf.a
            ekrw r9 = r9.h()
            ekrz r11 = defpackage.eksq.a
            r9.X(r11, r4)
            r11 = 52
            ekrw r9 = r9.h(r2, r10, r11, r5)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Not updating profile metadata, unable to find recipient"
            r9.q(r10)
            fctx r9 = defpackage.fctx.a
            return r9
        L79:
            ekrg r6 = defpackage.chrf.a
            ekrw r6 = r6.h()
            ekrz r7 = defpackage.eksq.a
            r6.X(r7, r4)
            r4 = 56
            ekrw r10 = r6.h(r2, r10, r4, r5)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r2 = "Received profile metadata from recipient=%s, updating DB"
            anue r4 = r11.F()
            r10.t(r2, r4)
            fcsu r10 = r8.c
            java.lang.Object r10 = r10.b()
            anty r10 = (defpackage.anty) r10
            anue r11 = r11.F()
            antu r2 = new antu
            java.lang.String r4 = r9.c
            java.lang.String r5 = r9.d
            evvp r9 = r9.e
            if (r9 != 0) goto Lad
            evvp r9 = defpackage.evvp.a
        Lad:
            r9.getClass()
            j$.time.Instant r9 = defpackage.evxd.d(r9)
            long r6 = r9.toEpochMilli()
            java.lang.String r9 = java.lang.String.valueOf(r6)
            r2.<init>(r4, r5, r9)
            eiju r9 = r10.H(r11, r2)
            r9.getClass()
            r10 = 0
            r0.d = r10
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 != r1) goto Ld2
            goto Ld5
        Ld2:
            fctx r9 = defpackage.fctx.a
            return r9
        Ld5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chrf.c(chsh, alqm, fcxy):java.lang.Object");
    }
}
