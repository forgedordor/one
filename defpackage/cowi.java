package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cowi implements covy {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final fcsu b;
    public final dqsn c;
    public final Context d;
    public final fcsu e;
    private final eosc f;
    private final eosc g;

    public cowi(fcsu fcsuVar, dqsn dqsnVar, Context context, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2) {
        this.b = fcsuVar;
        this.c = dqsnVar;
        this.d = context;
        this.e = fcsuVar2;
        this.f = eoscVar;
        this.g = eoscVar2;
    }

    @Override // defpackage.covy
    public final eiju a(final String str) {
        return eijx.h(new eooy() { // from class: cowa
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                cowi cowiVar = this.a;
                String str2 = str;
                if (cowiVar.d(str2) && ((FileTransferService) cowiVar.b.b()).pauseFileTransfer(Long.parseLong(str2)).succeeded()) {
                    eksl ekslVar = (eksl) cowi.a.h();
                    ekslVar.X(coie.a, str2);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "pauseUpload", 173, "LegacyRcsFileUploader.java")).q("Paused file upload.");
                    return eijx.e(null);
                }
                eksl ekslVar2 = (eksl) cowi.a.h();
                ekslVar2.X(coie.a, str2);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "pauseUpload", 177, "LegacyRcsFileUploader.java")).q("Failed to pause the upload.");
                return eijx.e(null);
            }
        }, this.g);
    }

    @Override // defpackage.covy
    public final eiju b(final String str) {
        return eijx.g(new Callable() { // from class: cowb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cowi cowiVar = this.a;
                String str2 = str;
                try {
                    if (!cowiVar.d(str2)) {
                        return chvf.i;
                    }
                    FileTransferServiceResult fileTransferServiceResultResumeUploadToContentServer = ((FileTransferService) cowiVar.b.b()).resumeUploadToContentServer(Long.parseLong(str2));
                    if (fileTransferServiceResultResumeUploadToContentServer.succeeded()) {
                        eksl ekslVar = (eksl) cowi.a.h();
                        ekslVar.X(coie.a, str2);
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "resumeUpload", 195, "LegacyRcsFileUploader.java")).q("Resumed file upload.");
                        return chvf.i;
                    }
                    eksl ekslVar2 = (eksl) cowi.a.j();
                    ekslVar2.X(coie.a, str2);
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "resumeUpload", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "LegacyRcsFileUploader.java")).r("Failed to resume the upload: %s.", fileTransferServiceResultResumeUploadToContentServer.getCode());
                    return chvf.j(3, 0).a();
                } catch (efao unused) {
                    return chvf.j(3, 0).a();
                }
            }
        }, this.g);
    }

    @Override // defpackage.covy
    public final eiju c(final coxf coxfVar) {
        return eijx.g(new Callable() { // from class: cowf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                coue coueVar = (coue) coxfVar;
                coud coudVar = (coud) coueVar.b;
                cowi cowiVar = this.a;
                Context context = cowiVar.d;
                Uri uri = coudVar.c;
                context.grantUriPermission("com.google.android.ims", uri, 1);
                return ((FileTransferService) cowiVar.b.b()).uploadToContentServer(basd.e(coueVar.a.F()), new FileTransferInfo(dhdc.FILE_TRANSFER, uri, (String) coudVar.b.map(new Function() { // from class: cowc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ContentType) obj).toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null), (String) coudVar.d.orElse(null), coudVar.e.orElse(-1L), ((Long) coudVar.a.map(new Function() { // from class: cowd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(((Duration) obj).toMillis());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(0L)).longValue(), (byte[]) coudVar.g.map(new Function() { // from class: cowe
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((evqs) obj).I();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null), (String) coudVar.f.map(new Function() { // from class: cowc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ContentType) obj).toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null)));
            }
        }, this.g).h(new ejvr() { // from class: cowg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) obj;
                boolean zSucceeded = fileTransferServiceResult.succeeded();
                final coxf coxfVar2 = coxfVar;
                if (zSucceeded) {
                    final cowi cowiVar = this.a;
                    cowiVar.c.d("RcsFileUploader#uploadFile", new Runnable() { // from class: covz
                        @Override // java.lang.Runnable
                        public final void run() {
                            coue coueVar = (coue) coxfVar2;
                            MessageIdType messageIdTypeC = coueVar.a.C();
                            String strValueOf = String.valueOf(fileTransferServiceResult.a);
                            cokd cokdVar = (cokd) cowiVar.e.b();
                            if (cokdVar.i(messageIdTypeC, strValueOf)) {
                                eksl ekslVar = (eksl) cowi.a.j();
                                ekslVar.X(coie.a, strValueOf);
                                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "upsertFileTransferEntryIntoDatabase", 128, "LegacyRcsFileUploader.java")).q("Found duplicate upload transfer id. Deleting it to continue with upload.");
                            }
                            ejwl.m(cokdVar.m(messageIdTypeC, strValueOf, comc.UPLOAD, couw.a(coueVar.b)), "Failed to insert or update FileTransferTable entry for legacy upload.");
                            eksl ekslVar2 = (eksl) cowi.a.h();
                            ekslVar2.X(cqnc.b, messageIdTypeC);
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "upsertFileTransferEntryIntoDatabase", 139, "LegacyRcsFileUploader.java")).q("File transfer entry is updated.");
                        }
                    });
                    return chvf.i;
                }
                eksl ekslVar = (eksl) cowi.a.j();
                ekslVar.X(cqnc.b, ((coue) coxfVar2).a.C());
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "uploadFile", 97, "LegacyRcsFileUploader.java")).r("Failed to schedule the file upload: %s.", fileTransferServiceResult.getCode());
                return chvf.j(3, 0).a();
            }
        }, this.f).e(efao.class, new ejvr() { // from class: cowh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = cowi.a;
                return chvf.j(3, 0).a();
            }
        }, eoqg.a);
    }

    public final boolean d(String str) {
        List listH = ((cokd) this.e.b()).h(str, comc.UPLOAD);
        if (listH.isEmpty()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "confirmSingleFileTransferTableEntry", 224, "LegacyRcsFileUploader.java")).q("Could not find the file upload entry in database.");
            return false;
        }
        if (listH.size() <= 1) {
            return true;
        }
        ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "confirmSingleFileTransferTableEntry", 229, "LegacyRcsFileUploader.java")).q("Found more than one file upload entry in database.");
        return false;
    }
}
