package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coxw implements covy {
    public final eksp a = eksp.c("BugleFileTransfer");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final eosc e;
    private final eosc f;
    private final fcsu g;

    public coxw(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.e = eoscVar;
        this.f = eoscVar2;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.g = fcsuVar4;
    }

    @Override // defpackage.covy
    public final eiju a(final String str) {
        eksl ekslVar = (eksl) this.a.h();
        ekslVar.X(coie.a, str);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "pauseUpload", 115, "TachygramFileUploader.java")).q("Pausing the file upload.");
        eiju eijuVarB = ((coii) this.g.b()).b(str);
        eooz eoozVar = new eooz() { // from class: coxu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.d(str);
            }
        };
        eosc eoscVar = this.e;
        return eijuVarB.i(eoozVar, eoscVar).i(new eooz() { // from class: coxv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((couz) this.a.c.b()).a(new atir(str, null, null, 6));
            }
        }, eoscVar);
    }

    @Override // defpackage.covy
    public final eiju b(final String str) {
        eksl ekslVar = (eksl) this.a.h();
        ekslVar.X(coie.a, str);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "resumeUpload", 130, "TachygramFileUploader.java")).q("Resuming the file upload.");
        final covx covxVar = (covx) this.b.b();
        return eijx.h(new eooy() { // from class: covt
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                covx covxVar2 = covxVar;
                cokd cokdVar = (cokd) covxVar2.d.b();
                Optional optionalOf = Optional.of(comc.UPLOAD);
                String str2 = str;
                cokf cokfVarB = cokdVar.b(str2, optionalOf);
                if (!cokfVarB.c()) {
                    return eijx.e(chvf.j(3, 0).a());
                }
                cojk cojkVar = (cojk) cokfVarB;
                Optional optional = cojkVar.b;
                Optional optional2 = cojkVar.a;
                Object obj = optional.get();
                ?? r1 = optional2.get();
                cokk cokkVar = (cokk) obj;
                aucj aucjVarK = cokkVar.k();
                aucjVarK.getClass();
                atal atalVar = new atal();
                eksp ekspVar = cous.h;
                couc coucVar = new couc();
                coucVar.e(Uri.parse(aucjVarK.f));
                coucVar.f(aucjVarK.c);
                coucVar.g(aucjVarK.d);
                if ((aucjVarK.b & 1) != 0) {
                    aubx aubxVar = aucjVarK.e;
                    if (aubxVar == null) {
                        aubxVar = aubx.a;
                    }
                    coucVar.d((ContentType) atalVar.fM(aubxVar));
                }
                cous cousVarJ = coucVar.j();
                String strQ = cokkVar.q();
                if (strQ == null) {
                    ((eksl) ((eksl) covx.a.h()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "resume", 111, "FileUploadWorkScheduler.java")).q("Transfer handle is not populated, i.e. file transfer is not ready to be resumed, falling back to full upload.");
                    return covxVar2.c(str2, r1, cousVarJ);
                }
                coux couxVarA = covx.a(r1.F(), r1.w(), cousVarJ, str2);
                couxVarA.copyOnWrite();
                couy couyVar = (couy) couxVarA.instance;
                couy couyVar2 = couy.a;
                couyVar.b |= 32;
                couyVar.h = strQ;
                return covxVar2.b(str2, (couy) couxVarA.build());
            }
        }, covxVar.c);
    }

    @Override // defpackage.covy
    public final eiju c(final coxf coxfVar) {
        final MessageIdType messageIdTypeC = ((coue) coxfVar).a.C();
        return eijx.f(new Runnable() { // from class: coxs
            @Override // java.lang.Runnable
            public final void run() {
                coxw coxwVar = this.a;
                fcsu fcsuVar = coxwVar.d;
                MessageIdType messageIdType = messageIdTypeC;
                String strB = messageIdType.b();
                cokd cokdVar = (cokd) fcsuVar.b();
                if (cokdVar.i(messageIdType, strB)) {
                    eksl ekslVar = (eksl) coxwVar.a.h();
                    ekslVar.X(coie.a, strB);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "updateFileTransferTable", 90, "TachygramFileUploader.java")).q("Found duplicate upload transfer id. Deleting it to continue with upload.");
                }
                ejwl.m(cokdVar.m(messageIdType, strB, comc.UPLOAD, couw.a(((coue) coxfVar).b)), "Failed to insert or update FileTransferTable entry for upload.");
            }
        }, this.f).i(new eooz() { // from class: coxt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                coxw coxwVar = this.a;
                eksl ekslVar = (eksl) coxwVar.a.h();
                ekrz ekrzVar = cqnc.b;
                MessageIdType messageIdType = messageIdTypeC;
                ekslVar.X(ekrzVar, messageIdType);
                coue coueVar = (coue) coxfVar;
                MessageCoreData messageCoreData = coueVar.a;
                ekslVar.X(cqnc.s, messageCoreData.A());
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "uploadFile", 70, "TachygramFileUploader.java")).q("Starting the file upload to content server.");
                return ((covx) coxwVar.b.b()).c(messageIdType.b(), messageCoreData, coueVar.b);
            }
        }, this.e);
    }

    public final eiju d(final String str) {
        eksl ekslVar = (eksl) this.a.h();
        ekslVar.X(coie.a, str);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "cancelUpload", 104, "TachygramFileUploader.java")).q("Canceling the file upload.");
        try {
            final covx covxVar = (covx) this.b.b();
            return eijx.f(new Runnable() { // from class: covs
                @Override // java.lang.Runnable
                public final void run() {
                    cazj cazjVar = (cazj) ((cowj) covxVar.b.b()).a.b();
                    String str2 = str;
                    cazjVar.e("messaging_file_upload", str2);
                    eksl ekslVar2 = (eksl) covx.a.h();
                    ekslVar2.X(coie.a, str2);
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "cancel", 133, "FileUploadWorkScheduler.java")).q("File upload cancelled.");
                }
            }, covxVar.c);
        } catch (IndexOutOfBoundsException unused) {
            ((eksl) ((eksl) this.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "cancelUpload", 108, "TachygramFileUploader.java")).q("Attempted to cancel work, but no work was found.");
            return eijx.e(null);
        }
    }
}
