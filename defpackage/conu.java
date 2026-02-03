package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class conu implements conr {
    private final eksp a = eksp.c("BugleFileTransfer");
    private final fcsu b;
    private final eosc c;
    private final aten d;

    public conu(eosc eoscVar, fcsu fcsuVar, aten atenVar) {
        this.c = eoscVar;
        this.b = fcsuVar;
        this.d = atenVar;
    }

    @Override // defpackage.conr
    public final eiju a(MessageIdType messageIdType, FileInformation fileInformation, evqs evqsVar) {
        eksl ekslVar = (eksl) this.a.h();
        ekslVar.X(cqnc.b, messageIdType);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloaderImpl", "downloadFile", 42, "FileDownloaderImpl.java")).q("Starting the file download.");
        return ((conq) this.b.b()).b(messageIdType, UUID.randomUUID().toString(), fileInformation, evqsVar).h(new ejvr() { // from class: cont
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                como comoVar = new como();
                comoVar.b((String) obj);
                return comoVar.a();
            }
        }, this.c);
    }

    @Override // defpackage.conr
    public final eiju b(String str) {
        eksl ekslVar = (eksl) this.a.h();
        ekslVar.X(coie.a, str);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloaderImpl", "pauseDownload", 60, "FileDownloaderImpl.java")).q("Starting to pause the file download.");
        return this.d.c(str);
    }

    @Override // defpackage.conr
    public final eiju c(final String str) {
        final conq conqVar = (conq) this.b.b();
        return eijx.h(new eooy() { // from class: cono
            @Override // defpackage.eooy
            public final ListenableFuture a() throws cond {
                conq conqVar2 = conqVar;
                cokd cokdVar = (cokd) conqVar2.c.b();
                Optional optionalOf = Optional.of(comc.DOWNLOAD);
                final String str2 = str;
                cokk cokkVar = (cokk) cokdVar.f(str2, optionalOf).orElseThrow(new Supplier() { // from class: conk
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        eksp ekspVar = conq.a;
                        return new cond(false, coid.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, String.format("No file transfer bind data found for resuming download %s", str2));
                    }
                });
                FileInformation fileInformation = (FileInformation) new atam().fM(cokkVar.k());
                if (fileInformation == null) {
                    throw new cond(false, coid.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, String.format("No FileInformation found for resuming download %s", str2));
                }
                byte[] bArrT = cokkVar.t();
                if (bArrT == null) {
                    throw new cond(false, coid.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, String.format("No opaque data found for resuming download %s", str2));
                }
                if (cokkVar.q() == null) {
                    eksl ekslVar = (eksl) conq.a.j();
                    ekslVar.X(cqnc.b, cokkVar.o());
                    ekslVar.X(coie.a, str2);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "resume", 146, "FileDownloadWorker.java")).q("No transfer handle found during resume. Attempting full file download instead.");
                    return conqVar2.b(cokkVar.o(), str2, fileInformation, evqs.x(bArrT));
                }
                byte[] bArrT2 = cokkVar.t();
                bArrT2.getClass();
                evqs evqsVarX = evqs.x(bArrT2);
                String strQ = cokkVar.q();
                strQ.getClass();
                return conqVar2.c(conq.a(fileInformation, evqsVarX, str2, Optional.of(strQ)));
            }
        }, conqVar.b).h(new ejvr() { // from class: cons
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                como comoVar = new como();
                comoVar.b((String) obj);
                return comoVar.a();
            }
        }, this.c);
    }
}
