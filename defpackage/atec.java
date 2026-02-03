package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atec implements aten {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final fcsu b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final atce d;
    public final atde e;
    private final fcsu f;
    private final eosc g;
    private final eosc h;
    private final Context i;
    private final fcsu j;
    private final aprs k;
    private final aofc l;
    private final cqbm m;
    private final aqts n;
    private final aqtr o;

    public atec(Context context, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, atce atceVar, fcsu fcsuVar3, atde atdeVar, aprs aprsVar, aofc aofcVar, cqbm cqbmVar, aqts aqtsVar, aqtr aqtrVar) {
        this.b = fcsuVar2;
        this.f = fcsuVar;
        this.d = atceVar;
        this.g = eoscVar;
        this.h = eoscVar2;
        this.i = context;
        this.e = atdeVar;
        this.j = fcsuVar3;
        this.k = aprsVar;
        this.l = aofcVar;
        this.m = cqbmVar;
        this.n = aqtsVar;
        this.o = aqtrVar;
    }

    private final Uri d(String str) {
        return bxlf.d("file_".concat(String.valueOf(str)), this.i);
    }

    private final void e(String str, String str2) {
        if (((cokd) this.f.b()).l(str, comc.DOWNLOAD, str2)) {
            return;
        }
        ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "updateDatabaseWithTransferHandle", 357, "CronetFileDownloader.java")).t("Failed to update transfer handle in database during download. Transfer ID: %s", str);
    }

    @Override // defpackage.aten
    public final eiju a(final String str, final int i, final String str2, final Optional optional, Optional optional2) {
        final Uri uri;
        final File file;
        if ((!this.o.a() && !this.n.a() && !((cqhz) this.j.b()).a()) || ((cqey) this.m.a()).u()) {
            return eijx.e(atef.e());
        }
        final boolean zIsPresent = optional2.isPresent();
        Uri uriD = zIsPresent ? Uri.parse((String) optional2.get()) : d(str2);
        Context context = this.i;
        File fileH = bxlf.h(uriD, context);
        if (zIsPresent && i != 0 && fileH.length() == i) {
            return eijx.e(atds.a(uriD));
        }
        if (!zIsPresent) {
            e(str2, uriD.toString());
        }
        if (((eoth) ((aoxb) this.k).a.b()).a("bugle.enable_check_to_verify_file_writability_for_cronet_downloads_on_resume") && zIsPresent && !fileH.canWrite()) {
            Uri uriD2 = d(str2);
            e(str2, uriD2.toString());
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(coie.a, str2);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "createNewDestinationFile", 309, "CronetFileDownloader.java")).q("Destination file wasn't seen as writable, creating a new destination file.");
            atdt atdtVar = new atdt(bxlf.h(uriD2, context), uriD2);
            file = atdtVar.a;
            uri = atdtVar.b;
        } else {
            uri = uriD;
            file = fileH;
        }
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(file, zIsPresent);
            return (!this.o.a() && this.n.a() && ((cqey) this.m.a()).t()) ? this.l.a().b().i(new eooz() { // from class: atdw
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    boolean zAnyMatch = Collection.EL.stream((ekgb) obj).anyMatch(new Predicate() { // from class: atdx
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
                        public final boolean test(Object obj2) {
                            eksp ekspVar = atec.a;
                            return ((aoer) obj2).v();
                        }
                    });
                    String str3 = str2;
                    if (!zAnyMatch) {
                        eksl ekslVar2 = (eksl) atec.a.h();
                        ekslVar2.X(coie.a, str3);
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "download", 214, "CronetFileDownloader.java")).q("No satellite self identity supporting media.");
                        return eijx.e(atef.e());
                    }
                    FileOutputStream fileOutputStream2 = fileOutputStream;
                    File file2 = file;
                    boolean z = zIsPresent;
                    Uri uri2 = uri;
                    Optional optional3 = optional;
                    int i2 = i;
                    String str4 = str;
                    atec atecVar = this.a;
                    eksl ekslVar3 = (eksl) atec.a.h();
                    ekslVar3.X(coie.a, str3);
                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "download", BasePaymentResult.ERROR_REQUEST_FAILED, "CronetFileDownloader.java")).q("Found a satellite self identity supporting media.");
                    return atecVar.b(str4, i2, str3, optional3, uri2, z, file2, fileOutputStream2);
                }
            }, this.h) : b(str, i, str2, optional, uri, zIsPresent, file, fileOutputStream);
        } catch (FileNotFoundException e) {
            atbp atbpVarG = atbq.g();
            atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED);
            atbpVarG.c(e);
            return eijx.e(new atdo(atbpVarG.a()));
        }
    }

    public final eiju b(final String str, final int i, final String str2, final Optional optional, final Uri uri, final boolean z, final File file, final FileOutputStream fileOutputStream) {
        eiju eijuVarG = eiju.g(kol.a(new koi() { // from class: atdu
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                atdz atdzVar = new atdz(kogVar, uri);
                File file2 = file;
                String str3 = str2;
                int i2 = i;
                Optional optional2 = optional;
                String str4 = str;
                atec atecVar = this.a;
                boolean z2 = z;
                FileOutputStream fileOutputStream2 = fileOutputStream;
                atdd atddVarA = atecVar.e.a();
                atea ateaVar = new atea(atecVar, z2, file2, str3, i2, fileOutputStream2, optional2, str4);
                eosc eoscVar = (eosc) atecVar.d.a.b();
                eoscVar.getClass();
                str3.getClass();
                atddVarA.getClass();
                atcd atcdVar = new atcd(eoscVar, str3, atdzVar, atddVarA, ateaVar);
                eksl ekslVar = (eksl) atec.a.h();
                ekrz ekrzVar = coie.a;
                ekslVar.X(ekrzVar, str3);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "getDownloadResultOrErrorPropagatedFluentFuture", 264, "CronetFileDownloader.java")).q("File download is started.");
                atecVar.c.put(str3, atcdVar);
                eksl ekslVar2 = (eksl) atcd.a.h();
                String str5 = atcdVar.c;
                ekslVar2.X(ekrzVar, str5);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/InProgressFileTransfer", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 64, "InProgressFileTransfer.java")).t("Starting InProgressFileTransfer HTTP execution flow. %s", atcdVar.d.getClass().getName());
                if (atcdVar.i != atcdVar.e) {
                    throw new IllegalStateException(String.format("Transfer id %s already started.", str5));
                }
                atcdVar.a(atcdVar.f, atba.a);
                return "CronetFileDownloader#download";
            }
        }));
        if (!optional.isEmpty()) {
            eieu eieuVarK = eiiy.k("CronetFileDownloader::download");
            try {
                eieuVarK.b(eijuVarG);
                eieuVarK.close();
            } finally {
            }
        }
        return eijuVarG.h(new ejvr() { // from class: atdv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws IOException {
                atef atefVar = (atef) obj;
                FileOutputStream fileOutputStream2 = fileOutputStream;
                String str3 = str2;
                atec atecVar = this.a;
                try {
                    fileOutputStream2.close();
                    atecVar.c.remove(str3);
                    eksl ekslVar = (eksl) atec.a.h();
                    ekslVar.X(coie.a, str3);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "cleanup", 433, "CronetFileDownloader.java")).q("HTTP request cleaned up");
                    return atefVar;
                } catch (IOException e) {
                    atbp atbpVarG = atbq.g();
                    atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_CLOSING_THE_FILE_FAILED);
                    atbpVarG.c(e);
                    return new atdo(atbpVarG.a());
                }
            }
        }, this.g);
    }

    @Override // defpackage.aten
    public final eiju c(final String str) {
        return eijx.g(new Callable() { // from class: atdy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ConcurrentHashMap concurrentHashMap = this.a.c;
                String str2 = str;
                atcd atcdVar = (atcd) concurrentHashMap.remove(str2);
                if (atcdVar == null) {
                    eksl ekslVar = (eksl) atec.a.j();
                    ekslVar.X(coie.a, str2);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "pause", 325, "CronetFileDownloader.java")).q("Could not find ongoing file download to pause.");
                    return false;
                }
                atbp atbpVarG = atbq.g();
                atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_MANUAL_CANCELLATION);
                atcdVar.a(atcdVar.h, new atay(atbpVarG.a()));
                eksl ekslVar2 = (eksl) atec.a.h();
                ekslVar2.X(coie.a, str2);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/CronetFileDownloader", "pause", 329, "CronetFileDownloader.java")).q("Paused ongoing file download.");
                return true;
            }
        }, this.h);
    }
}
