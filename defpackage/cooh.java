package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.receiver.IncomingRcsEventReceiver;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cooh implements conr {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final fcsu b;
    public final fcsu c;
    public final eosc d;
    public final Context e;
    private final eosc f;
    private final eosc g;

    public cooh(fcsu fcsuVar, fcsu fcsuVar2, Context context, eosc eoscVar, eosc eoscVar2, eosc eoscVar3) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.e = context;
        this.f = eoscVar;
        this.d = eoscVar2;
        this.g = eoscVar3;
    }

    public static int d(FileInformation fileInformation, evqs evqsVar) {
        return Objects.hash(fileInformation, evqsVar);
    }

    @Override // defpackage.conr
    public final eiju a(final MessageIdType messageIdType, final FileInformation fileInformation, final evqs evqsVar) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.a, messageIdType.b());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "downloadFile", 84, "RcsFileDownloader.java")).q("Initiating download.");
        return eijx.g(new Callable() { // from class: conw
            @Override // java.util.concurrent.Callable
            public final Object call() throws cond {
                cooh coohVar = this.a;
                FileInformation fileInformation2 = fileInformation;
                evqs evqsVar2 = evqsVar;
                try {
                    FileTransferService fileTransferService = (FileTransferService) coohVar.b.b();
                    PendingIntent pendingIntentE = ebsn.e(coohVar.e, cooh.d(fileInformation2, evqsVar2), coohVar.e(evqsVar2), 1107296256, 3);
                    pendingIntentE.getClass();
                    dhcf dhcfVar = new dhcf();
                    dhcfVar.b(fileInformation2);
                    dhcfVar.c(pendingIntentE);
                    return (conb) new comm().fM(fileTransferService.downloadFile(dhcfVar.a()));
                } catch (efao e) {
                    throw new cond(false, "Exception occurred during file download IPC to RCS Engine.", (Throwable) e);
                }
            }
        }, this.f).h(new ejvr() { // from class: conx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                FileInformation fileInformation2 = fileInformation;
                conb conbVar = (conb) obj;
                Optional optionalG = fileInformation2.g();
                if (optionalG.isPresent() && efis.FILE.equals(optionalG.get())) {
                    evqs evqsVar2 = evqsVar;
                    ejwl.m(((cokd) this.a.c.b()).n(messageIdType, conbVar.a(), comc.DOWNLOAD, (aucj) new atam().fH().fM(fileInformation2), evqsVar2.I()), "Failed to insert OR update file transfer entry in database.");
                }
                return conbVar;
            }
        }, this.d);
    }

    @Override // defpackage.conr
    public final eiju b(final String str) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(coie.a, str);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "pauseDownload", 124, "RcsFileDownloader.java")).q("Pausing download.");
        return eijx.h(new eooy() { // from class: coog
            @Override // defpackage.eooy
            public final ListenableFuture a() throws efao {
                cooh coohVar = this.a;
                cokd cokdVar = (cokd) coohVar.c.b();
                String str2 = str;
                List listH = cokdVar.h(str2, comc.DOWNLOAD);
                if (listH.isEmpty()) {
                    ((eksl) ((eksl) cooh.a.j()).h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "confirmSingleFileTransferTableEntry", 318, "RcsFileDownloader.java")).q("Could not find the file download entry in database.");
                } else {
                    if (listH.size() <= 1) {
                        FileTransferService fileTransferService = (FileTransferService) coohVar.b.b();
                        dhcl dhclVar = new dhcl();
                        dhclVar.b(str2);
                        PauseDownloadResult pauseDownloadResultPauseDownload = fileTransferService.pauseDownload(dhclVar.a());
                        if (FileTransferResult.a.equals(pauseDownloadResultPauseDownload.a())) {
                            eksl ekslVar2 = (eksl) cooh.a.h();
                            ekslVar2.X(coie.a, str2);
                            ekslVar2.X(coie.h, pauseDownloadResultPauseDownload.a());
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "pauseDownload", 153, "RcsFileDownloader.java")).q("Paused file download request succeeded.");
                            return eijx.e(true);
                        }
                        eksl ekslVar3 = (eksl) cooh.a.h();
                        ekslVar3.X(coie.a, str2);
                        ekslVar3.X(coie.h, pauseDownloadResultPauseDownload.a());
                        ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "pauseDownload", 144, "RcsFileDownloader.java")).q("Paused file download request failed.");
                        return cond.b("Pause file download request failed");
                    }
                    ((eksl) ((eksl) cooh.a.j()).h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "confirmSingleFileTransferTableEntry", 323, "RcsFileDownloader.java")).q("Found more than one file download entry in database.");
                }
                return cond.a("Failed to pause the download because file transfer entry does not exist in the file transfer table.");
            }
        }, this.f).f(efao.class, new eooz() { // from class: conv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = cooh.a;
                return cond.c("Exception occurred during pause download IPC to RCS Engine.", (efao) obj);
            }
        }, eoqg.a);
    }

    @Override // defpackage.conr
    public final eiju c(final String str) {
        eksp ekspVar = a;
        eksl ekslVar = (eksl) ekspVar.h();
        ekrz ekrzVar = coie.a;
        ekslVar.X(ekrzVar, str);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "resumeDownload", 167, "RcsFileDownloader.java")).q("Resuming download.");
        eksl ekslVar2 = (eksl) ekspVar.h();
        ekslVar2.X(ekrzVar, str);
        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "getFileInformationForResume", 262, "RcsFileDownloader.java")).q("Canceling download.");
        Callable callable = new Callable() { // from class: cooa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar2 = cooh.a;
                colw colwVarB = comb.b();
                colwVarB.A("getFileInformationForResume");
                colf colfVar = comb.c;
                colwVarB.c(colfVar.a, colfVar.e);
                coma comaVar = new coma();
                comaVar.c(str);
                comaVar.d(comc.DOWNLOAD);
                colwVarB.k(new colz(comaVar));
                return (cokk) colwVarB.b().l();
            }
        };
        eosc eoscVar = this.d;
        final eiju eijuVarG = eijx.g(callable, eoscVar);
        return eijuVarG.i(new eooz() { // from class: coob
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cokk cokkVar = (cokk) obj;
                if (cokkVar == null) {
                    return cond.a("Failed to resume the download. No file transfer bind data found.");
                }
                if (cokkVar.k() == null) {
                    return cond.a("Failed to resume the download. No file information found.");
                }
                return eijx.g(new Callable() { // from class: coof
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksp ekspVar2 = cooh.a;
                        return (String) MessagesTable.h(cokkVar.o(), new Function() { // from class: cony
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                eksp ekspVar3 = cooh.a;
                                return ((MessagesTable.BindData) obj2).I().b;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Supplier() { // from class: conz
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                eksp ekspVar3 = cooh.a;
                                return null;
                            }
                        });
                    }
                }, this.a.d);
            }
        }, this.g).i(new eooz() { // from class: cooc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str2 = (String) obj;
                if (str2 == null) {
                    return cond.a("Failed to resume the download. No message data found.");
                }
                String str3 = str;
                eiju eijuVar = eijuVarG;
                cooh coohVar = this.a;
                atam atamVar = new atam();
                cokk cokkVar = (cokk) eork.q(eijuVar);
                cokkVar.getClass();
                FileInformation fileInformation = (FileInformation) atamVar.fM(cokkVar.k());
                coqf coqfVar = (coqf) coqg.a.createBuilder();
                coqfVar.copyOnWrite();
                ((coqg) coqfVar.instance).b = str2;
                evqs byteString = ((coqg) coqfVar.build()).toByteString();
                fileInformation.getClass();
                PendingIntent pendingIntentE = ebsn.e(coohVar.e, cooh.d(fileInformation, byteString), coohVar.e(byteString), 1107296256, 3);
                pendingIntentE.getClass();
                dhcp dhcpVar = new dhcp();
                dhcpVar.d(pendingIntentE);
                dhcpVar.c(fileInformation);
                dhcpVar.b(str3);
                return eijx.e(dhcpVar.a());
            }
        }, eoscVar).i(new eooz() { // from class: cood
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws efao {
                ResumeDownloadResult resumeDownloadResultResumeDownload = ((FileTransferService) this.a.b.b()).resumeDownload((ResumeDownloadRequest) obj);
                boolean zEquals = FileTransferResult.a.equals(resumeDownloadResultResumeDownload.a());
                String str2 = str;
                if (!zEquals) {
                    eksl ekslVar3 = (eksl) cooh.a.h();
                    ekslVar3.X(coie.h, resumeDownloadResultResumeDownload.a());
                    ekslVar3.X(coie.a, str2);
                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "resumeDownload", 242, "RcsFileDownloader.java")).q("Resume download request failed.");
                    return cond.b("Resume download request failed.");
                }
                eksl ekslVar4 = (eksl) cooh.a.h();
                ekslVar4.X(coie.h, resumeDownloadResultResumeDownload.a());
                ekslVar4.X(coie.a, str2);
                ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/transfer/downloads/RcsFileDownloader", "resumeDownload", 233, "RcsFileDownloader.java")).q("Resume download request succeeded.");
                como comoVar = new como();
                comoVar.b(str2);
                return eijx.e(comoVar.a());
            }
        }, this.f).f(efao.class, new eooz() { // from class: cooe
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar2 = cooh.a;
                return cond.c("Exception occurred during resume download IPC to RCS Engine.", (efao) obj);
            }
        }, eoqg.a);
    }

    public final Intent e(evqs evqsVar) {
        Intent intentPutExtra = new Intent().putExtra("file_transfer_service_download_response_extra", evqsVar.I());
        intentPutExtra.setClass(this.e, IncomingRcsEventReceiver.class);
        return intentPutExtra;
    }
}
