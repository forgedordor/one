package defpackage;

import android.content.Context;
import j$.util.Map;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceco {
    public static final /* synthetic */ int a = 0;
    private static final Map b;
    private static final eksp c;
    private static final cczi d;
    private final Context e;
    private final Optional f;
    private final Optional g;
    private final cogw h;
    private final crqn i;
    private final cecr j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private exui p;

    static {
        epnh epnhVar = epnh.WRONG_VERIFICATION_CODE_SELECTED;
        exmt exmtVar = exmt.INTERNAL;
        epnh epnhVar2 = epnh.USER_CANCELED_VERIFICATION;
        exmt exmtVar2 = exmt.ABORTED;
        b = fcwa.g(new fcti(epnh.NONE, exmt.OK), new fcti(epnhVar, exmtVar), new fcti(epnh.VERIFICATION_TIMED_OUT, exmt.DEADLINE_EXCEEDED), new fcti(epnhVar2, exmtVar2), new fcti(epnh.USER_DENIED_VERIFICATION_NOT_ME, exmtVar2), new fcti(epnh.USER_CANCELED_VERIFICATION_ON_WEB, exmtVar2), new fcti(epnh.VERIFICATION_EMOJI_DOWNLOAD_FAILED, exmtVar2), new fcti(epnh.NEW_REQUEST_WHILE_WAITING_FOR_VERIFICATION, exmtVar2), new fcti(epnh.NOT_LATEST_ATTEMPT, exmtVar), new fcti(epnh.REQUEST_COMPLETE_WITH_UNKNOWN_RESULT, exmtVar), new fcti(epnh.VERIFICATION_DATA_SERVICE_NOT_PRESENT, exmtVar), new fcti(epnh.VERIFICATION_INTENTS_NOT_PRESENT, exmtVar), new fcti(epnh.REQUEST_OUT_OF_DATE, exmtVar), new fcti(epnh.REQUEST_NOT_RECEIVED_QUICKLY, exmtVar), new fcti(epnh.UKEY2_MESSAGE_MISSING, exmtVar), new fcti(epnh.UKEY2_ALERT_ERROR, exmtVar), new fcti(epnh.UKEY2_HANDSHAKE_ERROR, exmtVar), new fcti(epnh.UKEY2_OTHER_ERROR, exmtVar), new fcti(epnh.WRONG_UKEY2_MESSAGE_TYPE, exmtVar), new fcti(epnh.CMS_BACKUP_KEY_NOT_FOUND, exmtVar), new fcti(epnh.UNABLE_TO_ENCRYPT_CMS_BACKUP_KEY, exmtVar));
        c = eksp.c("BugleGDitto");
        d = cdag.f(cdag.b, "request_expiration_timeout_millis", 300000L);
    }

    public ceco(Context context, Optional optional, Optional optional2, cogw cogwVar, crqn crqnVar, cecr cecrVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        context.getClass();
        cogwVar.getClass();
        cecrVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.e = context;
        this.f = optional;
        this.g = optional2;
        this.h = cogwVar;
        this.i = crqnVar;
        this.j = cecrVar;
        this.k = fcsuVar;
        this.l = fcsuVar2;
        this.m = fcsuVar3;
        this.n = fcsuVar4;
        this.o = fcsuVar5;
    }

    public static /* synthetic */ void m(ceco cecoVar, String str, String str2, ewyb ewybVar, Integer num, Integer num2, int i) {
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        cecoVar.q(str, str2, ewybVar, num, num2, 2);
    }

    public static /* synthetic */ Optional r(ceco cecoVar, String str, String str2, epnh epnhVar, ewyb ewybVar, int i, int i2) {
        if ((i2 & 16) != 0) {
            i = 2;
        }
        return cecoVar.n(str, str2, epnhVar, ewybVar, i, null);
    }

    public final epnh a(cecq cecqVar) {
        cecqVar.getClass();
        switch (cecqVar.ordinal()) {
            case 1:
                ((eksl) c.h()).q("Sending Gaia pairing wrong verification code selected response");
                return epnh.WRONG_VERIFICATION_CODE_SELECTED;
            case 2:
                ((eksl) c.h()).q("Sending Gaia pairing user canceled verification response");
                return epnh.USER_CANCELED_VERIFICATION;
            case 3:
                ((eksl) c.h()).q("Sending Gaia pairing user canceled verification on web response");
                return epnh.USER_CANCELED_VERIFICATION_ON_WEB;
            case 4:
                ((eksl) c.h()).q("Sending Gaia pairing user denied verification response");
                return epnh.USER_DENIED_VERIFICATION_NOT_ME;
            case 5:
                ((eksl) c.j()).q("Sending Gaia pairing emoji downloaded failed response");
                return epnh.VERIFICATION_EMOJI_DOWNLOAD_FAILED;
            case 6:
                ((eksl) c.h()).q("Sending Gaia pairing verification time out response");
                return epnh.VERIFICATION_TIMED_OUT;
            case 7:
                ((eksl) c.h()).q("Sending Gaia pairing success response");
                return epnh.NONE;
            case 8:
                ((eksl) c.h()).q("Sending new request while waiting for verification response");
                return epnh.NEW_REQUEST_WHILE_WAITING_FOR_VERIFICATION;
            default:
                ((eksl) c.j()).q("Sending request complete with unknown result response");
                return epnh.REQUEST_COMPLETE_WITH_UNKNOWN_RESULT;
        }
    }

    public final epnh b(epnf epnfVar) {
        epnfVar.getClass();
        eksp ekspVar = c;
        ekspVar.n().C("Received client finish, attemptId: %s, timestamp: %d", epnfVar.c, epnfVar.e);
        if (fdbq.f(this.j.a.get(), epnfVar.c)) {
            return null;
        }
        ekspVar.n().t("Current attempt(%s) is not the latest attempt, ignoring", epnfVar.c);
        return epnh.NOT_LATEST_ATTEMPT;
    }

    public final epnh c(epnf epnfVar) {
        epnfVar.getClass();
        eksp ekspVar = c;
        ekspVar.n().C("Received client init, attemptId: %s, timestamp: %d", epnfVar.c, epnfVar.e);
        cecr cecrVar = this.j;
        AtomicReference atomicReference = cecrVar.a;
        if (fdbq.f(atomicReference.get(), epnfVar.c)) {
            return null;
        }
        AtomicLong atomicLong = cecrVar.b;
        if (atomicLong.get() >= epnfVar.e) {
            ekspVar.n().t("Current attempt(%s) is not the latest attempt, ignoring", epnfVar.c);
            return epnh.NOT_LATEST_ATTEMPT;
        }
        ekspVar.n().t("Current attempt(%s) is the latest attempt, updating", epnfVar.c);
        atomicReference.set(epnfVar.c);
        atomicLong.set(epnfVar.e);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cech
            if (r0 == 0) goto L13
            r0 = r5
            cech r0 = (defpackage.cech) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cech r0 = new cech
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            crqn r5 = r4.i
            cczi r2 = defpackage.bvfd.j
            java.lang.Object r2 = r2.e()
            java.lang.String r2 = (java.lang.String) r2
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a(r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            long r0 = java.lang.Long.parseLong(r5)
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceco.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r8v3, types: [bvqv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceco.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [bvqv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cecj
            if (r0 == 0) goto L13
            r0 = r5
            cecj r0 = (defpackage.cecj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cecj r0 = new cecj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            j$.util.Optional r5 = r4.f
            java.lang.Object r5 = r5.get()
            eiju r5 = r5.c()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L70
        L44:
            bvqq r5 = (defpackage.bvqq) r5
            r0 = 0
            if (r5 == 0) goto L6f
            int r5 = r5.ordinal()
            r1 = 5
            if (r5 == r1) goto L6c
            r1 = 10
            if (r5 == r1) goto L69
            r1 = 11
            if (r5 == r1) goto L66
            eksp r5 = defpackage.ceco.c
            ekrw r5 = r5.j()
            eksl r5 = (defpackage.eksl) r5
            java.lang.String r1 = "Expected a user cancel event, but found none."
            r5.q(r1)
            return r0
        L66:
            epnh r5 = defpackage.epnh.USER_CANCELED_VERIFICATION_ON_WEB
            return r5
        L69:
            epnh r5 = defpackage.epnh.USER_DENIED_VERIFICATION_NOT_ME
            return r5
        L6c:
            epnh r5 = defpackage.epnh.USER_CANCELED_VERIFICATION
            return r5
        L6f:
            return r0
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceco.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [bvqv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cect r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ceck
            if (r0 == 0) goto L13
            r0 = r6
            ceck r0 = (defpackage.ceck) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ceck r0 = new ceck
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cect r5 = r0.d
            defpackage.fctl.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            j$.util.Optional r6 = r4.f
            java.lang.Object r6 = r6.get()
            bvqq r2 = defpackage.bvqq.ERROR_UKEY2
            eiju r6 = r6.g(r2)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto Ld7
        L4a:
            cecr r6 = r4.j
            cecq r0 = defpackage.cecq.j
            r6.b(r0)
            int r6 = r5.a
            int r0 = r6 + (-1)
            r1 = 0
            if (r6 == 0) goto Ld6
            r6 = 2
            if (r0 == r3) goto L83
            if (r0 == r6) goto L70
            eksp r6 = defpackage.ceco.c
            ekrw r6 = r6.j()
            java.lang.String r0 = "OTHER_EXCEPTION"
            defpackage.a.N(r6, r0, r5)
            fcti r5 = new fcti
            epnh r6 = defpackage.epnh.UKEY2_OTHER_ERROR
            r5.<init>(r6, r1)
            return r5
        L70:
            eksp r6 = defpackage.ceco.c
            ekrw r6 = r6.j()
            java.lang.String r0 = "HANDSHAKE_EXCEPTION"
            defpackage.a.N(r6, r0, r5)
            fcti r5 = new fcti
            epnh r6 = defpackage.epnh.UKEY2_HANDSHAKE_ERROR
            r5.<init>(r6, r1)
            return r5
        L83:
            eksp r0 = defpackage.ceco.c
            ekrw r0 = r0.j()
            java.lang.String r1 = "ALERT_EXCEPTION"
            defpackage.a.N(r0, r1, r5)
            exuy r0 = defpackage.exuy.a
            evsf r0 = r0.createBuilder()
            exuv r0 = (defpackage.exuv) r0
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            exuy r1 = (defpackage.exuy) r1
            r1.c = r3
            int r2 = r1.b
            r2 = r2 | r3
            r1.b = r2
            java.lang.Throwable r5 = r5.getCause()
            r5.getClass()
            exuf r5 = (defpackage.exuf) r5
            exum r5 = r5.a
            byte[] r5 = r5.toByteArray()
            evqs r5 = defpackage.evqs.x(r5)
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            exuy r1 = (defpackage.exuy) r1
            int r2 = r1.b
            r6 = r6 | r2
            r1.b = r6
            r1.d = r5
            evsn r5 = r0.build()
            r5.getClass()
            exuy r5 = (defpackage.exuy) r5
            fcti r6 = new fcti
            epnh r0 = defpackage.epnh.UKEY2_ALERT_ERROR
            r6.<init>(r0, r5)
            return r6
        Ld6:
            throw r1
        Ld7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceco.g(cect, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r5, defpackage.epnf r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.cecm
            if (r0 == 0) goto L13
            r0 = r8
            cecm r0 = (defpackage.cecm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cecm r0 = new cecm
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r5 = r0.a
            epnf r7 = r0.e
            defpackage.fctl.b(r8)
            goto L6e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r8)
            j$.util.Optional r8 = r4.f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L4c
            eksp r5 = defpackage.ceco.c
            ekrw r5 = r5.n()
            java.lang.String r6 = "verificationDataService is not present"
            r5.q(r6)
            epnh r5 = defpackage.epnh.VERIFICATION_DATA_SERVICE_NOT_PRESENT
            return r5
        L4c:
            j$.util.Optional r8 = r4.g
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L62
            eksp r5 = defpackage.ceco.c
            ekrw r5 = r5.n()
            java.lang.String r6 = "pairingVerificationIntents is not present"
            r5.q(r6)
            epnh r5 = defpackage.epnh.VERIFICATION_INTENTS_NOT_PRESENT
            return r5
        L62:
            r0.e = r7
            r0.a = r5
            r0.d = r3
            java.lang.Object r8 = r4.d(r0)
            if (r8 == r1) goto Lcd
        L6e:
            java.lang.Number r8 = (java.lang.Number) r8
            long r0 = r8.longValue()
            long r2 = r7.e
            long r0 = r0 - r2
            cczi r8 = defpackage.ceco.d
            java.lang.Object r2 = r8.e()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L95
            eksp r5 = defpackage.ceco.c
            ekrw r5 = r5.n()
            java.lang.String r6 = "received the request initiated %s ms ago, ignoring"
            r5.s(r6, r0)
            epnh r5 = defpackage.epnh.REQUEST_OUT_OF_DATE
            return r5
        L95:
            java.lang.Object r8 = r8.e()
            java.lang.Number r8 = (java.lang.Number) r8
            long r0 = r8.longValue()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 > 0) goto Lbe
            int r5 = r7.b
            r5 = r5 & 2
            if (r5 == 0) goto Lae
            r5 = 0
            return r5
        Lae:
            eksp r5 = defpackage.ceco.c
            ekrw r5 = r5.j()
            eksl r5 = (defpackage.eksl) r5
            java.lang.String r6 = "The Ukey2Message is missing"
            r5.q(r6)
            epnh r5 = defpackage.epnh.UKEY2_MESSAGE_MISSING
            return r5
        Lbe:
            eksp r7 = defpackage.ceco.c
            ekrw r7 = r7.n()
            long r5 = r5 / r2
            java.lang.String r8 = "The age %s ms of the message is too old, ignoring"
            r7.s(r8, r5)
            epnh r5 = defpackage.epnh.REQUEST_NOT_RECEIVED_QUICKLY
            return r5
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceco.h(long, epnf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [bvqv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(byte[] r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceco.i(byte[], fcxy):java.lang.Object");
    }

    public final boolean j(String str) {
        boolean zBooleanValue;
        str.getClass();
        cecr cecrVar = this.j;
        synchronized (cecrVar.c) {
            Boolean bool = (Boolean) cecrVar.d.get(str);
            zBooleanValue = bool != null ? bool.booleanValue() : false;
        }
        if (zBooleanValue) {
            c.n().t("Received duplicated request (%s), ignoring", str);
            return true;
        }
        cecr cecrVar2 = this.j;
        synchronized (cecrVar2.c) {
            if (str.length() > 0) {
                cecrVar2.d.put(str, true);
            }
        }
        return false;
    }

    public final byte[] k(exuy exuyVar) throws cect {
        byte[] bArr;
        exuyVar.getClass();
        try {
            exug exugVar = exug.a;
            exui exuiVar = new exui(exugVar);
            this.p = exuiVar;
            exuiVar.b(exuyVar.toByteArray());
            exui exuiVar2 = this.p;
            if (exuiVar2 == null) {
                fdbq.c("handshake");
                exuiVar2 = null;
            }
            int i = exuiVar2.f;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                exup exupVar = (exup) exus.a.createBuilder();
                exupVar.copyOnWrite();
                exus exusVar = (exus) exupVar.instance;
                exusVar.b |= 1;
                exusVar.c = 1;
                evqs evqsVarX = evqs.x(exui.e());
                exupVar.copyOnWrite();
                exus exusVar2 = (exus) exupVar.instance;
                exusVar2.b |= 2;
                exusVar2.d = evqsVarX;
                exupVar.copyOnWrite();
                exus exusVar3 = (exus) exupVar.instance;
                exusVar3.b = 4 | exusVar3.b;
                exusVar3.f = "AES_256_CBC-HMAC_SHA256";
                HashMap map = exuiVar2.a;
                if (!map.containsKey(exugVar)) {
                    byte[] byteArray = exvc.a(exuiVar2.c.getPublic()).toByteArray();
                    exun exunVar = (exun) exuo.a.createBuilder();
                    evqs evqsVarX2 = evqs.x(byteArray);
                    exunVar.copyOnWrite();
                    exuo exuoVar = (exuo) exunVar.instance;
                    exuoVar.b |= 1;
                    exuoVar.c = evqsVarX2;
                    map.put(exugVar, exuiVar2.h(5, ((exuo) exunVar.build()).toByteArray()));
                }
                exuq exuqVar = (exuq) exur.a.createBuilder();
                exuqVar.copyOnWrite();
                exur exurVar = (exur) exuqVar.instance;
                exurVar.c = 100;
                exurVar.b |= 1;
                evqs evqsVarX3 = evqs.x(exuiVar2.f((byte[]) map.get(exugVar)));
                exuqVar.copyOnWrite();
                exur exurVar2 = (exur) exuqVar.instance;
                exurVar2.b |= 2;
                exurVar2.d = evqsVarX3;
                exur exurVar3 = (exur) exuqVar.build();
                exupVar.copyOnWrite();
                exus exusVar4 = (exus) exupVar.instance;
                exurVar3.getClass();
                evtg evtgVar = exusVar4.e;
                if (!evtgVar.c()) {
                    exusVar4.e = evsn.mutableCopy(evtgVar);
                }
                exusVar4.e.add(exurVar3);
                exuiVar2.d = exuiVar2.h(3, ((exus) exupVar.build()).toByteArray());
                exuiVar2.f = 2;
                bArr = exuiVar2.d;
            } else if (i2 == 2) {
                HashMap map2 = exuiVar2.a;
                exug exugVar2 = exuiVar2.b;
                if (!map2.containsKey(exugVar2)) {
                    exuiVar2.c(a.I(exugVar2, "Client state is CLIENT_AFTER_SERVER_INIT, and cipher is ", ", but no corresponding raw client finished message has been generated"));
                }
                exuiVar2.f = 7;
                bArr = (byte[]) map2.get(exugVar2);
            } else {
                if (i2 != 4) {
                    exuiVar2.c("Cannot get next message in state: ".concat(exuh.a(i)));
                    throw new AssertionError();
                }
                exuz exuzVar = (exuz) exva.a.createBuilder();
                exuzVar.copyOnWrite();
                exva exvaVar = (exva) exuzVar.instance;
                exvaVar.b |= 1;
                exvaVar.c = 1;
                evqs evqsVarX4 = evqs.x(exui.e());
                exuzVar.copyOnWrite();
                exva exvaVar2 = (exva) exuzVar.instance;
                exvaVar2.b |= 2;
                exvaVar2.d = evqsVarX4;
                int i3 = exuiVar2.b.b;
                exuzVar.copyOnWrite();
                exva exvaVar3 = (exva) exuzVar.instance;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                exvaVar3.e = i4;
                exvaVar3.b |= 4;
                evqs byteString = exvc.a(exuiVar2.c.getPublic()).toByteString();
                exuzVar.copyOnWrite();
                exva exvaVar4 = (exva) exuzVar.instance;
                exvaVar4.b |= 8;
                exvaVar4.f = byteString;
                exuiVar2.e = exuiVar2.h(4, ((exva) exuzVar.build()).toByteArray());
                exuiVar2.f = 6;
                bArr = exuiVar2.e;
            }
            bArr.getClass();
            return bArr;
        } catch (exue e) {
            throw new cect(e, 3);
        } catch (exuf e2) {
            throw new cect(e2, 2);
        } catch (Exception e3) {
            throw new cect(e3, 1);
        }
    }

    public final byte[] l(exuy exuyVar) throws cect {
        exuyVar.getClass();
        try {
            exui exuiVar = this.p;
            exui exuiVar2 = null;
            if (exuiVar == null) {
                fdbq.c("handshake");
                exuiVar = null;
            }
            exuiVar.b(exuyVar.toByteArray());
            exui exuiVar3 = this.p;
            if (exuiVar3 == null) {
                fdbq.c("handshake");
            } else {
                exuiVar2 = exuiVar3;
            }
            byte[] bArrG = exuiVar2.g();
            bArrG.getClass();
            return bArrG;
        } catch (exue e) {
            throw new cect(e, 3);
        } catch (exuf e2) {
            throw new cect(e2, 2);
        } catch (Exception e3) {
            throw new cect(e3, 1);
        }
    }

    public final Optional n(String str, String str2, epnh epnhVar, ewyb ewybVar, int i, exuy exuyVar) {
        str.getClass();
        str2.getClass();
        epnhVar.getClass();
        ewybVar.getClass();
        if (i == 0) {
            throw null;
        }
        if (epnhVar == epnh.USER_CANCELED_VERIFICATION_ON_WEB) {
            ewybVar = ewyb.CREATE_GAIA_PAIRING_CANCELED;
        }
        exmt exmtVar = (exmt) Map.EL.getOrDefault(b, epnhVar, exmt.UNKNOWN);
        ((bvio) this.n.b()).t(ewybVar, i, str2, str, epnhVar, exmtVar);
        epng epngVar = (epng) epni.a.createBuilder();
        epngVar.getClass();
        if (exuyVar != null) {
            epnj.h(exuyVar, epngVar);
        }
        epnj.f(str, epngVar);
        epnj.d(epnhVar, epngVar);
        epnj.g(exmtVar, epngVar);
        return Optional.of(epnj.a(epngVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [bvqv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.epnf r11, int r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.cecl
            if (r0 == 0) goto L13
            r0 = r13
            cecl r0 = (defpackage.cecl) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cecl r0 = new cecl
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r11 = r0.b
            int r12 = r0.a
            defpackage.fctl.b(r13)
            goto L7d
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            defpackage.fctl.b(r13)
            int r13 = r11.g
            int r7 = defpackage.fddu.g(r3, r13)
            eksp r13 = defpackage.ceco.c
            ekrw r2 = r13.h()
            eksl r2 = (defpackage.eksl) r2
            java.lang.String r4 = "verificationCodeRevision: %s"
            r2.r(r4, r7)
            int r11 = r11.h
            int r8 = defpackage.fddu.g(r3, r11)
            ekrw r11 = r13.h()
            eksl r11 = (defpackage.eksl) r11
            java.lang.String r13 = "confirmedKeyDerivation: %s"
            r11.r(r13, r8)
            j$.util.Optional r11 = r10.f
            cogw r13 = r10.h
            java.lang.Object r4 = r11.get()
            j$.time.Instant r11 = r13.f()
            long r5 = r11.toEpochMilli()
            r9 = r12
            eiju r11 = r4.l(r5, r7, r8, r9)
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r11 = defpackage.fdxs.c(r11, r0)
            if (r11 == r1) goto L8d
            r12 = r7
            r11 = r8
        L7d:
            fcti r13 = new fcti
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            r13.<init>(r0, r12)
            return r13
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceco.o(epnf, int, fcxy):java.lang.Object");
    }

    public final void p(String str, String str2, ewyb ewybVar, int i, int i2, int i3) {
        str2.getClass();
        ewybVar.getClass();
        ((bvio) this.n.b()).s(ewybVar, i3, str2, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void q(String str, String str2, ewyb ewybVar, Integer num, Integer num2, int i) {
        str.getClass();
        str2.getClass();
        ewybVar.getClass();
        ((bvio) this.n.b()).u(ewybVar, i, str2, str, num, num2);
    }
}
