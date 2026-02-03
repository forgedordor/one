package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzow implements bzop {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsDownloadContentFromBlobstoreWorkerImpl");
    public final Context b;
    public final eosc c;
    public final cenv d;
    private final fcsu e;
    private final ehtk f;

    public bzow(cenv cenvVar, fcsu fcsuVar, ehtk ehtkVar, eosc eoscVar, Context context) {
        this.d = cenvVar;
        this.e = fcsuVar;
        this.c = eoscVar;
        this.f = ehtkVar;
        this.b = context;
    }

    @Override // defpackage.bzop
    public final eiju a(String str, byte[] bArr, efwo efwoVar) {
        return b(str, bArr, efwoVar, false);
    }

    public final eiju b(final String str, final byte[] bArr, final efwo efwoVar, final boolean z) {
        final baja bajaVar = new baja(bArr);
        eooz eoozVar = bajaVar.b() ? new eooz() { // from class: bzos
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final bzow bzowVar = this.a;
                final Uri uri = (Uri) obj;
                Context context = bzowVar.b;
                final Uri uriD = bxlf.d(null, context);
                final File fileH = bxlf.h(uriD, context);
                final File fileH2 = bxlf.h(uri, context);
                final baja bajaVar2 = bajaVar;
                return bzowVar.c.submit(eiid.l(new Callable() { // from class: bzoq
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws IOException {
                        bzow bzowVar2 = bzowVar;
                        File file = fileH2;
                        File file2 = fileH;
                        baja bajaVar3 = bajaVar2;
                        Uri uri2 = uri;
                        Uri uri3 = uriD;
                        bzowVar2.c(file, file2, bajaVar3, uri2, uri3);
                        return uri3;
                    }
                }));
            }
        } : new eooz() { // from class: bzot
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eijx.e((Uri) obj);
            }
        };
        eiju eijuVarH = z ? eiju.g(this.f.a(efwoVar)).h(new ejvr() { // from class: bzor
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((ehtj) obj).a;
            }
        }, eoqg.a) : eiju.g(this.f.b(efwoVar)).h(new ejvr() { // from class: bzor
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((ehtj) obj).a;
            }
        }, eoqg.a);
        eooz eoozVar2 = new eooz() { // from class: bzou
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cenv cenvVar = this.a.d;
                Context context = cenvVar.a;
                Uri uriD = bxlf.d(null, context);
                SettableFuture settableFutureCreate = SettableFuture.create();
                cenvVar.b.newUrlRequestBuilder(new Uri.Builder().scheme("https").authority(cenu.a()).appendPath("download").appendPath("v1").appendPath("files").appendPath(str).appendQueryParameter("header.box_profile.application_id", "ANDROID_MESSAGES").appendQueryParameter("alt", "media").build().toString(), new aghf(uriD, settableFutureCreate, context, cenvVar.d), cenvVar.c).setTrafficStatsTag(8196).setPriority(2).addHeader("Authorization", "Bearer ".concat(String.valueOf((String) obj))).build().start();
                return settableFutureCreate;
            }
        };
        eosc eoscVar = this.c;
        return eijuVarH.i(eoozVar2, eoscVar).i(eoozVar, eoqg.a).f(fbtf.class, new eooz() { // from class: bzov
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                if (z || !fbtfVar.a.equals(Status.j)) {
                    throw fbtfVar;
                }
                efwo efwoVar2 = efwoVar;
                byte[] bArr2 = bArr;
                String str2 = str;
                bzow bzowVar = this.a;
                ekrw ekrwVarI = bzow.a.i();
                ekrwVarI.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(fbtfVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsDownloadContentFromBlobstoreWorkerImpl", "downloadContentFromBlobstoreInternal", 122, "CmsDownloadContentFromBlobstoreWorkerImpl.java")).t("%s Unauthorized error when downloading file, retrying with a refreshed authentication token", "CmsDownloadContentFromBlobstoreWorkerImpl:");
                return bzowVar.b(str2, bArr2, efwoVar2, true);
            }
        }, eoscVar);
    }

    public final /* synthetic */ void c(File file, File file2, baja bajaVar, Uri uri, Uri uri2) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    ((cehg) this.e.b()).C(fileInputStream, fileOutputStream, bajaVar);
                    bxlf.i(this.b, uri);
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException | GeneralSecurityException e) {
            Context context = this.b;
            bxlf.i(context, uri);
            bxlf.i(context, uri2);
            throw new RuntimeException("Decryption failed for downloaded file at ".concat(String.valueOf(String.valueOf(uri))), e);
        }
    }
}
