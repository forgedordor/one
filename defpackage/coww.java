package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coww {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final eosc b;
    public final coys c;
    public final coit d;
    public final fcsu e;
    public final Object f = new Object();
    public final Map g = new HashMap();

    public coww(eosc eoscVar, coys coysVar, coit coitVar, fcsu fcsuVar) {
        this.b = eoscVar;
        this.c = coysVar;
        this.d = coitVar;
        this.e = fcsuVar;
    }

    public final eiju a(final atir atirVar, final ejvr ejvrVar, final cous cousVar, final String str) {
        eijs eijsVarA = this.c.a(cousVar, new coyr() { // from class: cowq
            @Override // defpackage.coyr
            public final eycb a(couh couhVar, cous cousVar2) throws IOException {
                eksp ekspVar = coww.a;
                fcsu fcsuVar = ((coyc) couhVar).b;
                Uri uriA = cousVar2.a();
                return new eycl(((cqmz) fcsuVar.b()).f(uriA), ((cqmz) fcsuVar.b()).a(uriA), ((Integer) coyc.a.e()).intValue());
            }
        });
        eopl eoplVar = new eopl() { // from class: cowr
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                eycb eycbVar = (eycb) obj;
                eksp ekspVar = coww.a;
                eycbVar.getClass();
                ejwl.b(eycbVar.e() != -1, "DataStream is unknown size.");
                return new eopy((ListenableFuture) ejvrVar.apply(eycbVar));
            }
        };
        eosc eoscVar = this.b;
        return eijsVarA.g(eoplVar, eoscVar).g(new eopl() { // from class: cows
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                eiju eijuVarH;
                final eycv eycvVar = (eycv) obj;
                eycvVar.getClass();
                final atir atirVar2 = atirVar;
                coww cowwVar = this.a;
                synchronized (cowwVar.f) {
                    cowwVar.g.put(atirVar2, eycvVar);
                }
                final coit coitVar = cowwVar.d;
                final String str2 = atirVar2.a;
                if (str2 == null) {
                    ((eksl) ((eksl) coit.a.j()).h("com/google/android/apps/messaging/shared/transfer/FileTransferStartedCallbackHandler", "markMessageInProgress", 46, "FileTransferStartedCallbackHandler.java")).q("Upload id is empty. Message should already be marked in progress.");
                    eijuVarH = eijx.e(null);
                } else {
                    eijuVarH = ((cokd) coitVar.d.b()).c(str2, Optional.empty()).h(new ejvr() { // from class: cois
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cokf cokfVar = (cokf) obj2;
                            boolean zIsEmpty = cokfVar.b().isEmpty();
                            String str3 = str2;
                            if (zIsEmpty || cokfVar.a().isEmpty()) {
                                eksl ekslVar = (eksl) coit.a.j();
                                ekslVar.X(coie.a, str3);
                                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferStartedCallbackHandler", "markMessageInProgress", 59, "FileTransferStartedCallbackHandler.java")).q("Could not find a valid FileTransferMessageCoreData to handle file transfer starting callback.");
                                return null;
                            }
                            coit coitVar2 = coitVar;
                            ?? r5 = cokfVar.b().get();
                            comc comcVarP = ((cokk) cokfVar.a().get()).p();
                            r5.aW(comc.DOWNLOAD.equals(comcVarP) ? r5.o() : coitVar2.e.f().toEpochMilli(), comcVarP);
                            eksl ekslVar2 = (eksl) coit.a.h();
                            ekslVar2.X(coie.a, str3);
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferStartedCallbackHandler", "markMessageInProgress", 77, "FileTransferStartedCallbackHandler.java")).q("File transfer starting. Marking message in progress.");
                            ((baxe) coitVar2.c.b()).U(r5);
                            return null;
                        }
                    }, coitVar.b);
                }
                return new eopy(eijuVarH.i(new eooz() { // from class: cown
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        eksl ekslVar = (eksl) coww.a.h();
                        eycv eycvVar2 = eycvVar;
                        ekslVar.X(coie.b, eycvVar2.d());
                        atir atirVar3 = atirVar2;
                        ekslVar.X(coie.a, atirVar3.a);
                        ekslVar.X(coie.j, atirVar3.b);
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/ScottyFileUploader", "uploadInternal", 222, "ScottyFileUploader.java")).q("File upload is starting.");
                        return eycvVar2.b();
                    }
                }, cowwVar.b));
            }
        }, eoscVar).h().h(new ejvr() { // from class: cowt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                atir atirVar2 = atirVar;
                eycy eycyVar = (eycy) obj;
                final coww cowwVar = this.a;
                synchronized (cowwVar.f) {
                    cowwVar.g.remove(atirVar2);
                }
                String str2 = str;
                final cous cousVar2 = cousVar;
                return coup.a(eycyVar, new couo() { // from class: cowp
                    @Override // defpackage.couo
                    public final coyi a(ezuk ezukVar) {
                        auck auckVar = (auck) aucl.a.createBuilder();
                        cous cousVar3 = cousVar2;
                        aucj aucjVarH = coys.h(ezukVar, cousVar3.d(), cousVar3.c());
                        auckVar.copyOnWrite();
                        aucl auclVar = (aucl) auckVar.instance;
                        aucjVarH.getClass();
                        auclVar.c = aucjVarH;
                        auclVar.b |= 1;
                        return new coyi(new covb((aucl) auckVar.build()));
                    }
                }, str2);
            }
        }, eoscVar).e(Throwable.class, new ejvr() { // from class: cowu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                atir atirVar2 = atirVar;
                Throwable th = (Throwable) obj;
                coww cowwVar = this.a;
                synchronized (cowwVar.f) {
                    cowwVar.g.remove(atirVar2);
                }
                if (th instanceof CancellationException) {
                    return coyh.a;
                }
                String str2 = str;
                if (th instanceof FileNotFoundException) {
                    atbp atbpVarG = atbq.g();
                    atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_OPENING_THE_FILE_FAILED);
                    atbpVarG.c(th);
                    atbpVarG.g(str2);
                    return new coyj(atbpVarG.a());
                }
                if (th instanceof IllegalArgumentException) {
                    atbp atbpVarG2 = atbq.g();
                    atbpVarG2.f(coid.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_FILE_SIZE);
                    atbpVarG2.g(str2);
                    return new coyj(atbpVarG2.a());
                }
                atbp atbpVarG3 = atbq.g();
                atbpVarG3.f(coid.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
                atbpVarG3.c(th);
                atbpVarG3.g(str2);
                return new coyj(atbpVarG3.a());
            }
        }, eoscVar);
    }
}
