package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzuf {
    public static final cqce a = cqce.g("BugleCms", "CmsUploadContentToBlobstoreWorker");
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsUploadContentToBlobstoreWorker");
    public final cenw b;
    public final Context c;
    public final cqsu d;
    public final appr e;
    private final eosc g;
    private final cqmz h;
    private final ehtk i;
    private final cehg j;
    private final appf k;

    public bzuf(cenw cenwVar, cehg cehgVar, cqsu cqsuVar, ehtk ehtkVar, Context context, eosc eoscVar, cqmz cqmzVar, appr apprVar, appf appfVar) {
        this.b = cenwVar;
        this.j = cehgVar;
        this.d = cqsuVar;
        this.c = context;
        this.g = eoscVar;
        this.i = ehtkVar;
        this.h = cqmzVar;
        this.e = apprVar;
        this.k = appfVar;
    }

    public static eiju c(eycy eycyVar, baja bajaVar, String str) {
        if (eycyVar != null && eycyVar.b()) {
            return eijx.d(eycyVar.a);
        }
        if (eycyVar == null || !eycyVar.a()) {
            return eijx.d(new bzuc(bzud.UNKNOWN_FAILURE));
        }
        eycf eycfVar = eycyVar.b;
        int i = eycfVar.a;
        if (i != 200) {
            a.n(a.g(i, "Error response code for uploading: "));
            return eijx.d(new bzuc(bzud.HTTP_RESPONSE_ERROR, i));
        }
        if (eycfVar.c == null) {
            return eijx.d(new bzuc(bzud.HTTP_EMPTY_RESPONSE));
        }
        byte[] bArrD = bajaVar.d();
        evqs evqsVarX = null;
        if (bajaVar.b() && bArrD != null) {
            evqsVarX = evqs.x(bArrD);
        }
        return eijx.e(new bzoo(str, evqsVarX));
    }

    public static boolean f(eycy eycyVar) {
        return eycyVar != null && eycyVar.a() && eycyVar.b.a == 401;
    }

    public static final Uri h(int i, Uri uri) {
        return i + (-1) != 1 ? uri : Uri.parse(uri.toString().concat("/compressed"));
    }

    public final eiju a(efwo efwoVar) {
        return eiju.g(this.i.b(efwoVar)).h(new bztz(), eoqg.a);
    }

    public final eiju b(efwo efwoVar) {
        return eiju.g(this.i.a(efwoVar)).h(new bztz(), eoqg.a);
    }

    public final eiju d(final Uri uri, final efwo efwoVar, final String str, final boolean z) {
        final baja bajaVarA = baja.a();
        final Uri uriD = axiz.d(null, this.c);
        eiju eijuVarI = g(bajaVarA, uri, uriD).i(new eooz() { // from class: bzua
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                bzuf bzufVar = this.a;
                efwo efwoVar2 = efwoVar;
                return (bzufVar.e.a() && z) ? bzufVar.b(efwoVar2) : bzufVar.a(efwoVar2);
            }
        }, eoqg.a);
        eooz eoozVar = new eooz() { // from class: bzub
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.k((String) obj, false, str, uri, uriD);
            }
        };
        eosc eoscVar = this.g;
        return eijuVarI.i(eoozVar, eoscVar).i(new eooz() { // from class: bztq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                bzuf bzufVar = this.a;
                eycy eycyVar = (eycy) obj;
                axiz.i(bzufVar.c, uriD);
                String str2 = str;
                if (!bzufVar.e.a() || z || !bzuf.f(eycyVar)) {
                    return bzuf.c(eycyVar, bajaVarA, str2);
                }
                efwo efwoVar2 = efwoVar;
                Uri uri2 = uri;
                bzuf.a.n("Unauthorized error when uploading content, retrying with a refreshed authentication token");
                return bzufVar.d(uri2, efwoVar2, str2, true);
            }
        }, eoscVar).f(Exception.class, new eooz() { // from class: bztr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                axiz.i(this.a.c, uriD);
                return eijx.d((Exception) obj);
            }
        }, eoscVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [cehg] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.FileOutputStream, java.io.OutputStream] */
    public final /* synthetic */ ListenableFuture e(baja bajaVar, Uri uri, Uri uri2) throws IOException {
        if (bajaVar.d() == null) {
            return eijx.d(new bzuc(bzud.ENCRYPTION_ERROR));
        }
        File fileH = axiz.h(uri, this.c);
        ?? A = ((eoth) ((aosv) this.k).a.b()).a("bugle.log_detailed_media_upload_failure");
        if (A != 0) {
            try {
                try {
                    A = new FileOutputStream(fileH);
                    try {
                        InputStream inputStreamF = this.h.f(uri2);
                        try {
                            this.j.D(inputStreamF, A, bajaVar);
                            eiju eijuVarE = eijx.e(null);
                            inputStreamF.close();
                            A.close();
                            return eijuVarE;
                        } finally {
                        }
                    } catch (FileNotFoundException e) {
                        ekrw ekrwVarJ = f.j();
                        ekrwVarJ.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsUploadContentToBlobstoreWorker", "encryptContent", 412, "CmsUploadContentToBlobstoreWorker.java")).q("FileNotFoundException for original content");
                        axiz.i(this.c, uri);
                        eiju eijuVarD = eijx.d(new bzuc(bzud.FILE_NOT_FOUND_ORIGINAL));
                        A.close();
                        return eijuVarD;
                    }
                } finally {
                }
            } catch (FileNotFoundException e2) {
                ekrw ekrwVarJ2 = f.j();
                ekrwVarJ2.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsUploadContentToBlobstoreWorker", "encryptContent", (char) 420, "CmsUploadContentToBlobstoreWorker.java")).q("FileNotFoundException for encryption output in media scratch space");
                axiz.i(this.c, uri);
                return eijx.d(new bzuc(bzud.FILE_NOT_FOUND_WRITE_SCRATCH_SPACE));
            } catch (GeneralSecurityException e3) {
                ekrw ekrwVarJ3 = f.j();
                ekrwVarJ3.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ3).g(e3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsUploadContentToBlobstoreWorker", "encryptContent", (char) 427, "CmsUploadContentToBlobstoreWorker.java")).q("Encrypt media failed");
                axiz.i(this.c, uri);
                return eijx.d(new bzuc(bzud.ENCRYPTION_ERROR));
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileH);
                try {
                    InputStream inputStreamF2 = this.h.f(uri2);
                    try {
                        this.j.D(inputStreamF2, fileOutputStream, bajaVar);
                        eiju eijuVarE2 = eijx.e(null);
                        inputStreamF2.close();
                        fileOutputStream.close();
                        return eijuVarE2;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException | GeneralSecurityException e4) {
                axiz.i(this.c, uri);
                a.o("Saving encrypted content to scratch space failed", e4);
                return eijx.d(new bzuc(bzud.ENCRYPTION_ERROR));
            }
        }
    }

    public final eiju g(final baja bajaVar, final Uri uri, final Uri uri2) {
        return eijx.h(new eooy() { // from class: bzts
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.e(bajaVar, uri2, uri);
            }
        }, this.g);
    }

    public final void i() {
        this.b.a();
    }

    public final eiju j(final String str, final Uri uri, final Uri uri2, final int i, final int i2, final efwo efwoVar, final String str2, final boolean z) {
        final baja bajaVarA = baja.a();
        Context context = this.c;
        final Uri uriD = axiz.d(null, context);
        final Uri uriD2 = axiz.d(null, context);
        Callable callable = new Callable() { // from class: bztx
            @Override // java.util.concurrent.Callable
            public final Object call() throws bzuc, IOException {
                bzuf bzufVar = this.a;
                cqsu cqsuVar = bzufVar.d;
                String str3 = str;
                Uri uri3 = uri2;
                Uri uri4 = uri;
                Uri uri5 = uriD2;
                int i3 = i;
                Context context2 = bzufVar.c;
                byte[] bArrP = cqsuVar.p(str3, uri3, uri4, i3, i2);
                File fileH = axiz.h(uri5, context2);
                if (bArrP == null) {
                    throw new bzuc(bzud.COMPRESS_IMAGE_ERROR);
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileH);
                    try {
                        fileOutputStream.write(bArrP);
                        fileOutputStream.close();
                        return null;
                    } finally {
                    }
                } catch (IOException e) {
                    axiz.i(bzufVar.c, uri5);
                    bzuf.a.o("Saving compressed image to scratch space failed for content:".concat(String.valueOf(String.valueOf(uri5))), e);
                    return null;
                }
            }
        };
        eosc eoscVar = this.g;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: bztp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.g(bajaVarA, uriD2, uriD);
            }
        }, eoscVar).i(new eooz() { // from class: bztt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                bzuf bzufVar = this.a;
                efwo efwoVar2 = efwoVar;
                return (bzufVar.e.a() && z) ? bzufVar.b(efwoVar2) : bzufVar.a(efwoVar2);
            }
        }, eoscVar).i(new eooz() { // from class: bztu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.k((String) obj, true, str2, uri2, uriD);
            }
        }, eoscVar).i(new eooz() { // from class: bztv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                bzuf bzufVar = this.a;
                Context context2 = bzufVar.c;
                eycy eycyVar = (eycy) obj;
                axiz.i(context2, uriD2);
                axiz.i(context2, uriD);
                String str3 = str2;
                if (!bzufVar.e.a() || z || !bzuf.f(eycyVar)) {
                    return bzuf.c(eycyVar, bajaVarA, str3);
                }
                efwo efwoVar2 = efwoVar;
                int i3 = i2;
                int i4 = i;
                Uri uri3 = uri2;
                Uri uri4 = uri;
                String str4 = str;
                bzuf.a.n("Unauthorized error when uploading compressed image, retrying with a refreshed authentication token");
                return bzufVar.j(str4, uri4, uri3, i4, i3, efwoVar2, str3, true);
            }
        }, eoscVar).f(Exception.class, new eooz() { // from class: bztw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Context context2 = this.a.c;
                axiz.i(context2, uriD2);
                axiz.i(context2, uriD);
                return eijx.d((Exception) obj);
            }
        }, eoscVar);
    }

    public final eiju k(final String str, boolean z, final String str2, Uri uri, final Uri uri2) {
        final Uri uriH = h(true == z ? 2 : 1, uri);
        return eijx.h(new eooy() { // from class: bzty
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.b.b(str, str2, uri2);
            }
        }, this.g);
    }
}
