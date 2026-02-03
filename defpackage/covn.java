package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class covn extends cayv {
    public final couz b;
    public final coun c;
    public final coir d;
    public final coii e;
    public String f = "";
    private final eosc i;
    private final eosc j;
    private final cgbn k;
    private final fcsu l;
    private final coyz m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private static final cczi g = cdag.e(cdag.b, "file_upload_max_retry_count", 5);
    private static final cczi h = cdag.e(cdag.b, "file_upload_retry_delay_seconds", 10);
    public static final eksp a = eksp.c("BugleFileTransfer");

    public covn(couz couzVar, eosc eoscVar, eosc eoscVar2, cgbn cgbnVar, coir coirVar, coii coiiVar, coun counVar, fcsu fcsuVar, coyz coyzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.b = couzVar;
        this.c = counVar;
        this.i = eoscVar;
        this.j = eoscVar2;
        this.k = cgbnVar;
        this.d = coirVar;
        this.e = coiiVar;
        this.l = fcsuVar;
        this.m = coyzVar;
        this.n = fcsuVar2;
        this.o = fcsuVar3;
        this.p = fcsuVar4;
        this.q = fcsuVar5;
    }

    public static coxh k(aucl auclVar, String str) {
        eieu eieuVarK = eiiy.k("FileUploadWorkHandler#newSendFileTransferResponse");
        try {
            couf coufVar = new couf();
            coufVar.c(auclVar);
            coufVar.a = basd.a(str);
            aucj aucjVar = auclVar.c;
            if (aucjVar == null) {
                aucjVar = aucj.a;
            }
            coufVar.b(aucjVar.f);
            coxh coxhVarA = coufVar.a();
            eieuVarK.close();
            return coxhVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) g.e()).intValue());
        caxzVarL.b(caze.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        caxzVarL.g(Duration.ofSeconds(((Integer) h.e()).intValue()).toMillis());
        caxzVarL.f(pza.a);
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        caxk caxkVar = (caxk) caxzVarL;
        caxkVar.a = pzhVar.a();
        caxkVar.b = this.k.b();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("FileUploadWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return couy.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String e() {
        return "FileUploadWorkHandler";
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final couy couyVar = (couy) evuhVar;
        this.f = couyVar.g;
        eksp ekspVar = a;
        eksl ekslVar = (eksl) ekspVar.h();
        ekrz ekrzVar = coie.a;
        ekslVar.X(ekrzVar, this.f);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "processPendingWorkItemAsync", 162, "FileUploadWorkHandler.java")).q("File upload is starting via work scheduler.");
        final cous cousVarA = new atan().apply(couyVar);
        fcsu fcsuVar = this.p;
        cokd cokdVar = (cokd) fcsuVar.b();
        if (((cokd) fcsuVar.b()).k(bary.b(this.f))) {
            eksl ekslVar2 = (eksl) ekspVar.h();
            ekslVar2.X(ekrzVar, this.f);
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "processPendingWorkItemAsync", 176, "FileUploadWorkHandler.java")).q("Upload has already a valid response, skipping and retry sending the XML.");
            return this.c.a(k((aucl) cokdVar.g(bary.b(this.f)).get(), couyVar.c), Optional.empty()).h(new ejvr() { // from class: covc
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar2 = covn.a;
                    return cbcw.i();
                }
            }, eoqg.a).f(Throwable.class, new eooz() { // from class: cove
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Throwable th = (Throwable) obj;
                    ((eksl) ((eksl) ((eksl) covn.a.j()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleUnexpectedException", (char) 209, "FileUploadWorkHandler.java")).q("Unexpected exception occurred during file upload.");
                    atbp atbpVarG = atbq.g();
                    atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
                    th.getClass();
                    atbpVarG.c(th);
                    atbq atbqVarA = atbpVarG.a();
                    couy couyVar2 = couyVar;
                    String str = couyVar2.c;
                    aubq aubqVar = couyVar2.l;
                    if (aubqVar == null) {
                        aubqVar = aubq.a;
                    }
                    cous cousVar = cousVarA;
                    cayy cayyVar2 = cayyVar;
                    return this.a.l(cayyVar2, cousVar, str, aubqVar, atbqVarA);
                }
            }, this.i);
        }
        eksl ekslVar3 = (eksl) ekspVar.h();
        ekslVar3.X(ekrzVar, this.f);
        ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "processPendingWorkItemAsync", 197, "FileUploadWorkHandler.java")).q("File upload is starting via work scheduler.");
        eieu eieuVarK = eiiy.k("FileUploadWorkHandler#uploadOrResume");
        try {
            aubq aubqVar = couyVar.l;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            ejwl.m((aubqVar.b & 2) != 0, "Cannot fetch auth token in the file transfer upload or resume path because a self-identity was not provided.");
            eiju eijuVarG = eiju.g(((ahkr) this.q.b()).a(aubqVar).a());
            eooz eoozVar = new eooz() { // from class: covg
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    evqs evqsVar = (evqs) obj;
                    couy couyVar2 = couyVar;
                    String str = couyVar2.h;
                    String strA = cova.a();
                    boolean zIsEmpty = TextUtils.isEmpty(str);
                    cous cousVar = cousVarA;
                    covn covnVar = this.a;
                    if (!zIsEmpty) {
                        return covnVar.b.c(cousVar, atiq.a(covnVar.f, strA), covnVar.d, str);
                    }
                    boolean z = ((caxm) cayyVar.a()).c == 0;
                    couz couzVar = covnVar.b;
                    atir atirVarA = atiq.a(covnVar.f, strA);
                    coir coirVar = covnVar.d;
                    aubq aubqVar2 = couyVar2.l;
                    if (aubqVar2 == null) {
                        aubqVar2 = aubq.a;
                    }
                    return couzVar.b(cousVar, atirVarA, coirVar, evqsVar, aubqVar2, z);
                }
            };
            eosc eoscVar = this.i;
            eiju eijuVarF = eijuVarG.i(eoozVar, eoscVar).e(eqco.class, new ejvr() { // from class: covl
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar2 = covn.a;
                    atbp atbpVarG = atbq.g();
                    atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_TACHYON_TOKEN_FAILURE);
                    atbpVarG.c((eqco) obj);
                    return new coyj(atbpVarG.a());
                }
            }, this.j).i(new eooz() { // from class: covm
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    coyk coykVar = (coyk) obj;
                    boolean z = coykVar instanceof coyj;
                    couy couyVar2 = couyVar;
                    covn covnVar = this.a;
                    if (!z) {
                        if (coykVar instanceof coyh) {
                            return covnVar.e.b(couyVar2.g).h(new ejvr() { // from class: covi
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    eksp ekspVar2 = covn.a;
                                    return cbcw.i();
                                }
                            }, eoqg.a);
                        }
                        if (!(coykVar instanceof coyi)) {
                            throw new AssertionError("Unreachable");
                        }
                        covb covbVar = ((coyi) coykVar).a;
                        return covnVar.c.a(covn.k(covbVar.a, couyVar2.c), covbVar.b).h(new ejvr() { // from class: covj
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                eksp ekspVar2 = covn.a;
                                return cbcw.i();
                            }
                        }, eoqg.a);
                    }
                    atbq atbqVar = ((coyj) coykVar).a;
                    if (((atbd) atbqVar).e.orElse(null) instanceof coiz) {
                        return covnVar.e.a(couyVar2.g).h(new ejvr() { // from class: covh
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                eksp ekspVar2 = covn.a;
                                return cbcw.i();
                            }
                        }, eoqg.a);
                    }
                    String str = couyVar2.c;
                    aubq aubqVar2 = couyVar2.l;
                    if (aubqVar2 == null) {
                        aubqVar2 = aubq.a;
                    }
                    cous cousVar = cousVarA;
                    return covnVar.l(cayyVar, cousVar, str, aubqVar2, atbqVar);
                }
            }, eoscVar).f(Throwable.class, new eooz() { // from class: covd
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Throwable th = (Throwable) obj;
                    ((eksl) ((eksl) ((eksl) covn.a.j()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "uploadOrResume", (char) 246, "FileUploadWorkHandler.java")).q("Unexpected exception occurred during file upload.");
                    couy couyVar2 = couyVar;
                    String str = couyVar2.c;
                    aubq aubqVar2 = couyVar2.l;
                    if (aubqVar2 == null) {
                        aubqVar2 = aubq.a;
                    }
                    aubq aubqVar3 = aubqVar2;
                    cous cousVar = cousVarA;
                    cayy cayyVar2 = cayyVar;
                    covn covnVar = this.a;
                    atbp atbpVarG = atbq.g();
                    atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
                    th.getClass();
                    atbpVarG.c(th);
                    return covnVar.l(cayyVar2, cousVar, str, aubqVar3, atbpVarG.a());
                }
            }, eoscVar);
            eieuVarK.b(eijuVarF);
            eieuVarK.close();
            return eijuVarF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju l(cayy cayyVar, cous cousVar, final String str, aubq aubqVar, final atbq atbqVar) {
        eksp ekspVar;
        aujk aujpVar;
        int i = ((caxm) cayyVar.a()).c;
        eksp ekspVar2 = a;
        atbd atbdVar = (atbd) atbqVar;
        ((eksl) ((eksl) ekspVar2.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 356, "FileUploadWorkHandler.java")).I("File transfer failure: HTTP response code = %d, reason = %s, detailed error message = %s", Integer.valueOf(atbdVar.b), atbdVar.a, atbqVar.k());
        emxe emxeVarA = ((atnv) this.l.b()).a(atbqVar);
        final int i2 = i + 1;
        emwy emwyVarJ = atbqVar.j(i2, emxeVarA);
        Throwable th = (Throwable) atbdVar.e.orElse(null);
        int iA = emxd.a(emxeVarA.c);
        if (iA == 0) {
            iA = 1;
        }
        if (!cayyVar.c()) {
            ((eksl) ((eksl) ((eksl) ekspVar2.j()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "shouldRetry", (char) 412, "FileUploadWorkHandler.java")).q("File upload failed as max retry count has been exceeded.");
        } else {
            if (iA != 2) {
                ((eksl) ((eksl) ((eksl) ekspVar2.j()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "shouldRetry", (char) 418, "FileUploadWorkHandler.java")).q("File upload failed with a recoverable error, scheduling retry.");
                MessageCoreData messageCoreDataX = ((baxe) this.n.b()).x(basd.a(str));
                if (messageCoreDataX == null) {
                    eksl ekslVar = (eksl) ekspVar2.j();
                    ekslVar.X(cqnc.e, str);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "logUploadFailedWithRetryAttempt", 489, "FileUploadWorkHandler.java")).q("Failed to log retry attempt, message is missing from the database.");
                    ekspVar = ekspVar2;
                } else {
                    String str2 = atbdVar.d;
                    if (str2.isEmpty()) {
                        ekspVar = ekspVar2;
                        this.m.a(messageCoreDataX, emwyVarJ, Optional.of(cousVar));
                    } else {
                        coyz coyzVar = this.m;
                        emwq emwqVar = (emwq) emws.a.createBuilder();
                        emwqVar.copyOnWrite();
                        emws emwsVar = (emws) emwqVar.instance;
                        str2.getClass();
                        ekspVar = ekspVar2;
                        emwsVar.b |= 8;
                        emwsVar.f = str2;
                        coyzVar.b(messageCoreDataX, emwyVarJ, (emws) emwqVar.build(), Optional.of(cousVar));
                    }
                }
                int iA2 = emxd.a(emxeVarA.c);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                int i3 = iA2 - 1;
                auga augaVar = (i3 == 0 || i3 == 1 || i3 == 2) ? auga.RECOVERY_STRATEGY_NONE : i3 != 3 ? auga.RECOVERY_STRATEGY_REFRESH_REGISTRATION : auga.RECOVERY_STRATEGY_REPROVISION;
                augaVar.getClass();
                ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 379, "FileUploadWorkHandler.java")).t("Applying recovery strategy [%s] before retrying.", augaVar.name());
                auji aujiVarA = ((auju) this.o.b()).a(augaVar);
                if (augaVar.equals(auga.RECOVERY_STRATEGY_REFRESH_REGISTRATION)) {
                    ejwl.m((aubqVar.b & 2) != 0, "Self chat endpoint must contain id.");
                    aujpVar = new aujp(aubqVar);
                } else {
                    aujpVar = aujk.b;
                }
                return aujiVarA.a(aujpVar).i(new eooz() { // from class: covf
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        aujh aujhVar = (aujh) obj;
                        if (aujhVar == aujh.a || aujhVar == aujh.c) {
                            ((eksl) ((eksl) covn.a.h()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 390, "FileUploadWorkHandler.java")).t("Recovery strategy result: [%s], retrying.", aujhVar);
                            return eijx.e(cbcw.m());
                        }
                        int i4 = i2;
                        atbq atbqVar2 = atbqVar;
                        String str3 = str;
                        covn covnVar = this.a;
                        ((eksl) ((eksl) covn.a.h()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "handleError", 393, "FileUploadWorkHandler.java")).q("Recovery strategy was not successful, file upload failed.");
                        return covnVar.m(str3, atbqVar2, i4);
                    }
                }, this.j);
            }
            ((eksl) ((eksl) ((eksl) ekspVar2.j()).g(th)).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkHandler", "shouldRetry", (char) 423, "FileUploadWorkHandler.java")).q("File upload failed as the current failure cannot be recovered.");
        }
        return m(str, atbqVar, i2);
    }

    public final eiju m(String str, atbq atbqVar, int i) {
        return this.c.b(str, atbqVar, i).h(new ejvr() { // from class: covk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = covn.a;
                return cbcw.k();
            }
        }, eoqg.a);
    }
}
