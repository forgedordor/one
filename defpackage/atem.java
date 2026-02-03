package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atem extends cayv {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final conc b;
    public final coii c;
    private final eosc d;
    private final cgbn e;
    private final aten f;
    private final coir g;

    public atem(cgbn cgbnVar, eosc eoscVar, aten atenVar, coir coirVar, conc concVar, coii coiiVar) {
        this.e = cgbnVar;
        this.d = eoscVar;
        this.f = atenVar;
        this.g = coirVar;
        this.b = concVar;
        this.c = coiiVar;
    }

    private final eiju k(final conh conhVar, Optional optional, Optional optional2) {
        return this.f.a(conhVar.d, conhVar.h, conhVar.f, optional, optional2).i(new eooz() { // from class: atej
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws NumberFormatException {
                atef atefVar = (atef) obj;
                int iB = atefVar.b();
                final conh conhVar2 = conhVar;
                atem atemVar = this.a;
                if (iB == 1) {
                    conc concVar = atemVar.b;
                    final Uri uriC = atefVar.c();
                    eksl ekslVar = (eksl) coms.a.h();
                    ekslVar.X(coie.a, conhVar2.f);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "onDownloadSucceeded", 80, "BugleFileDownloadCallbackHandler.java")).q("Download succeeded callback is called.");
                    try {
                        final coqg coqgVarA = coms.a(conhVar2.g);
                        final coms comsVar = (coms) concVar;
                        return eijx.f(new Runnable() { // from class: comq
                            @Override // java.lang.Runnable
                            public final void run() {
                                conh conhVar3 = conhVar2;
                                cong congVarB = cong.b(conhVar3.c);
                                if (congVarB == null) {
                                    congVarB = cong.FILE;
                                }
                                coqg coqgVar = coqgVarA;
                                Uri uri = uriC;
                                coms comsVar2 = comsVar;
                                if (congVarB != cong.FILE) {
                                    ((cmxn) comsVar2.f.b()).k(coqgVar.b, new dzfh("ToOnInvokeThumbnailPostDownload"), cmxm.TACHYGRAM_MESSAGE_ARRIVED);
                                    cotu cotuVar = (cotu) cotv.a.createBuilder();
                                    String str = coqgVar.b;
                                    cotuVar.copyOnWrite();
                                    cotv cotvVar = (cotv) cotuVar.instance;
                                    str.getClass();
                                    cotvVar.b = str;
                                    String str2 = conhVar3.e;
                                    cotuVar.copyOnWrite();
                                    cotv cotvVar2 = (cotv) cotuVar.instance;
                                    str2.getClass();
                                    cotvVar2.d = str2;
                                    String string = uri.toString();
                                    cotuVar.copyOnWrite();
                                    cotv cotvVar3 = (cotv) cotuVar.instance;
                                    string.getClass();
                                    cotvVar3.c = string;
                                    ((cotw) comsVar2.c.b()).a((cotv) cotuVar.build());
                                    eksl ekslVar2 = (eksl) coms.a.h();
                                    ekslVar2.X(cqnc.e, coqgVar.b);
                                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "invokeThumbnailPostDownload", 199, "BugleFileDownloadCallbackHandler.java")).q("Thumbnail download completed is queued.");
                                    return;
                                }
                                String str3 = coqgVar.b;
                                coqc coqcVar = (coqc) coqd.a.createBuilder();
                                coqcVar.copyOnWrite();
                                coqd coqdVar = (coqd) coqcVar.instance;
                                str3.getClass();
                                coqdVar.b |= 1;
                                coqdVar.c = str3;
                                String str4 = conhVar3.e;
                                coqcVar.copyOnWrite();
                                coqd coqdVar2 = (coqd) coqcVar.instance;
                                str4.getClass();
                                coqdVar2.b |= 4;
                                coqdVar2.e = str4;
                                String string2 = uri.toString();
                                coqcVar.copyOnWrite();
                                coqd coqdVar3 = (coqd) coqcVar.instance;
                                string2.getClass();
                                coqdVar3.b |= 2;
                                coqdVar3.d = string2;
                                long j = conhVar3.h;
                                coqcVar.copyOnWrite();
                                coqd coqdVar4 = (coqd) coqcVar.instance;
                                coqdVar4.b |= 8;
                                coqdVar4.f = j;
                                enyw enywVarA = ((asrf) comsVar2.e.b()).a();
                                coqcVar.copyOnWrite();
                                coqd coqdVar5 = (coqd) coqcVar.instance;
                                coqdVar5.g = enywVarA.h;
                                coqdVar5.b |= 16;
                                coqd coqdVar6 = (coqd) coqcVar.build();
                                eksl ekslVar3 = (eksl) coms.a.h();
                                ekslVar3.X(coie.a, conhVar3.f);
                                ekslVar3.X(cqnc.e, str3);
                                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "invokeFilePostDownload", 177, "BugleFileDownloadCallbackHandler.java")).q("File download completed is queued.");
                                ((cmxn) comsVar2.f.b()).k(coqgVar.b, new dzfh("ToOnInvokeFilePostDownload"), cmxm.TACHYGRAM_MESSAGE_ARRIVED);
                                ((cazj) ((coqe) comsVar2.b.b()).a.b()).a(cbcu.f("file_download_completed", coqdVar6));
                            }
                        }, comsVar.g);
                    } catch (cond e) {
                        return eijx.d(e);
                    }
                }
                if (atefVar.b() == 3) {
                    String str = conhVar2.f;
                    ((eksl) ((eksl) ((eksl) atem.a.h()).g(atefVar.d())).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/FileDownloadWorkHandler", "download", 119, "FileDownloadWorkHandler.java")).t("Auto paused downloadId: %s", str);
                    return atemVar.c.a(str);
                }
                final atbq atbqVarA = atefVar.a();
                if (((atbd) atbqVarA).a.equals(coid.FILE_TRANSFER_FAILURE_REASON_MANUAL_CANCELLATION)) {
                    return atemVar.c.b(conhVar2.f);
                }
                conc concVar2 = atemVar.b;
                try {
                    coqg coqgVarA2 = coms.a(conhVar2.g);
                    coms comsVar2 = (coms) concVar2;
                    emxe emxeVarA = comsVar2.h.a(atbqVarA);
                    elof elofVar = (elof) elpg.b.createBuilder();
                    enyw enywVarA = ((asrf) comsVar2.e.b()).a();
                    elofVar.copyOnWrite();
                    elpg elpgVar = (elpg) elofVar.instance;
                    elpgVar.Y = enywVarA.h;
                    elpgVar.d |= 2097152;
                    emwy emwyVarI = atbqVarA.i(emxeVarA);
                    elofVar.copyOnWrite();
                    elpg elpgVar2 = (elpg) elofVar.instance;
                    emwyVarI.getClass();
                    elpgVar2.ak = emwyVarI;
                    elpgVar2.e |= 4;
                    elpg elpgVar3 = (elpg) elofVar.build();
                    coqo coqoVar = (coqo) coqp.a.createBuilder();
                    String str2 = coqgVarA2.b;
                    coqoVar.copyOnWrite();
                    coqp coqpVar = (coqp) coqoVar.instance;
                    str2.getClass();
                    coqpVar.b = 1 | coqpVar.b;
                    coqpVar.c = str2;
                    coqoVar.copyOnWrite();
                    coqp coqpVar2 = (coqp) coqoVar.instance;
                    elpgVar3.getClass();
                    coqpVar2.e = elpgVar3;
                    coqpVar2.b |= 4;
                    String str3 = conhVar2.d;
                    coqoVar.copyOnWrite();
                    coqp coqpVar3 = (coqp) coqoVar.instance;
                    str3.getClass();
                    coqpVar3.b |= 8;
                    coqpVar3.f = str3;
                    final coqp coqpVar4 = (coqp) coqoVar.build();
                    cong congVarB = cong.b(conhVar2.c);
                    if (congVarB == null) {
                        congVarB = cong.FILE;
                    }
                    if (!congVarB.equals(cong.THUMBNAIL)) {
                        return ((coqq) comsVar2.d.b()).a(coqpVar4).h(new ejvr() { // from class: comr
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                eksl ekslVar2 = (eksl) coms.a.h();
                                ekslVar2.X(cqnc.e, coqpVar4.c);
                                eksl ekslVar3 = (eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "onDownloadFailed", 143, "BugleFileDownloadCallbackHandler.java");
                                atbq atbqVar = atbqVarA;
                                int iB2 = emww.b(atbqVar.h().e);
                                if (iB2 == 0) {
                                    iB2 = 1;
                                }
                                emxa emxaVar = atbqVar.h().f;
                                if (emxaVar == null) {
                                    emxaVar = emxa.a;
                                }
                                ekslVar3.I("File download failed with reason: %s and http response code: %s, queued work item to process failure. Error details: %s", emww.a(iB2), Long.valueOf(emxaVar.c), atbqVar.k());
                                return null;
                            }
                        }, comsVar2.g);
                    }
                    eksl ekslVar2 = (eksl) coms.a.h();
                    ekslVar2.X(cqnc.e, coqpVar4.c);
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/BugleFileDownloadCallbackHandler", "onDownloadFailed", 131, "BugleFileDownloadCallbackHandler.java")).q("Thumbnail download failed.");
                    return eijx.e(null);
                } catch (cond e2) {
                    return eijx.d(e2);
                }
            }
        }, this.d).h(new ejvr() { // from class: atek
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = atem.a;
                return cbcw.i();
            }
        }, eoqg.a);
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        ((caxk) caxzVarL).b = this.e.b();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("FileDownloadWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return conh.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String e() {
        return "FileDownloadWorkHandler";
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        conh conhVar = (conh) evuhVar;
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(coie.a, conhVar.f);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/FileDownloadWorkHandler", "processPendingWorkItemAsync", 76, "FileDownloadWorkHandler.java")).q("File download is starting via work scheduler.");
        Optional optionalFilter = Optional.of(conhVar.i).filter(new Predicate() { // from class: atel
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                eksp ekspVar = atem.a;
                return !TextUtils.isEmpty((String) obj);
            }
        });
        cong congVarB = cong.b(conhVar.c);
        if (congVarB == null) {
            congVarB = cong.FILE;
        }
        cong congVar = cong.FILE;
        Optional optionalOf = congVarB.equals(congVar) ? Optional.of(this.g) : Optional.empty();
        cong congVarB2 = cong.b(conhVar.c);
        if (congVarB2 == null) {
            congVarB2 = congVar;
        }
        if (!congVarB2.equals(congVar)) {
            return k(conhVar, optionalOf, optionalFilter);
        }
        eieu eieuVarK = eiiy.k("HttpFileDownloader::download");
        try {
            eiju eijuVarK = k(conhVar, optionalOf, optionalFilter);
            eieuVarK.b(eijuVarK);
            eieuVarK.close();
            return eijuVarK;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
