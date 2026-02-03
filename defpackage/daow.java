package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.videotrimmer.FileInfoResult;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daow implements daot {
    public static final eksp a = eksp.c("BugleVideoTrimmer");
    public final bxfu b;
    public final cqmt c;
    private final egxv d;
    private final eosc e;

    public daow(egxv egxvVar, eosc eoscVar, bxfu bxfuVar, cqmt cqmtVar) {
        this.d = egxvVar;
        this.e = eoscVar;
        this.b = bxfuVar;
        this.c = cqmtVar;
    }

    @Override // defpackage.daot
    public final eiju a(final Context context, final Uri uri) {
        bxfu bxfuVar = this.b;
        if (bxfuVar.j(uri)) {
            ejwl.a(bxfuVar.j(uri));
            return eijx.g(new Callable() { // from class: daou
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    daow daowVar = this.a;
                    bxfu bxfuVar2 = daowVar.b;
                    Uri uri2 = uri;
                    File fileE = bxfuVar2.e(uri2);
                    if (fileE == null || !fileE.exists()) {
                        ((eksl) ((eksl) daow.a.j()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getInternalFileInfo", 182, "VideoTrimmerStorageImpl.java")).t("getInternalFileInfo - Could not retrieve file size. InputUri=%s", uri2);
                        return null;
                    }
                    Context context2 = context;
                    long length = fileE.length();
                    Uri uriB = bxli.b(context2, uri2, daowVar.c.b("video/*"), "video/*", length);
                    if (((Boolean) daor.f.e()).booleanValue()) {
                        ((eksl) ((eksl) daow.a.h()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getInternalFileInfo", BasePaymentResult.ERROR_REQUEST_FAILED, "VideoTrimmerStorageImpl.java")).A("getInternalFileInfo - FileSize=%d, ProxyProviderUri=%s", length, uriB);
                    }
                    return new FileInfoResult(uriB.toString(), length);
                }
            }, this.e);
        }
        daoi daoiVar = new daoi(uri, null, null);
        if (Objects.equals(uri.getAuthority(), "com.android.providers.media.documents")) {
            List listI = ejxk.b(':').i(DocumentsContract.getDocumentId(uri));
            String str = (String) listI.get(0);
            daoiVar = new daoi(Objects.equals(str, "image") ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : Objects.equals(str, "video") ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : Objects.equals(str, "audio") ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : uri, "_id=?", new String[]{(String) listI.get(1)});
        }
        return new eijs(this.d.b(daoiVar.a, new String[]{"_size", "_data"}, daoiVar.b, daoiVar.c, null)).f(new eopo() { // from class: daov
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) throws IOException, IllegalArgumentException {
                Cursor cursor = (Cursor) obj;
                eksp ekspVar = daow.a;
                cursor.getClass();
                Uri uri2 = uri;
                try {
                    int columnIndex = cursor.getColumnIndex("_size");
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                    cursor.moveToFirst();
                    if (((Boolean) daor.f.e()).booleanValue()) {
                        ((eksl) ((eksl) daow.a.h()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 110, "VideoTrimmerStorageImpl.java")).K("getFileInfo - (DATA: column_name=%s, index=%d), (SIZE: column_name=%s, index=%d), InputUri=%s", "_data", Integer.valueOf(columnIndexOrThrow), "_size", Integer.valueOf(columnIndex), uri2);
                    }
                    String string = cursor.getString(columnIndexOrThrow);
                    if (string == null) {
                        ((eksl) ((eksl) daow.a.j()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 127, "VideoTrimmerStorageImpl.java")).K("getFileInfo - Could not get the file path. (DATA: column_name=%s, index=%d), (SIZE: column_name=%s, index=%d), InputUri=%s", "_data", Integer.valueOf(columnIndexOrThrow), "_size", Integer.valueOf(columnIndex), uri2);
                        return null;
                    }
                    long j = cursor.getLong(columnIndex);
                    if (j <= 0) {
                        ((eksl) ((eksl) daow.a.j()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 139, "VideoTrimmerStorageImpl.java")).I("getFileInfo - Could not get file size. InputUri=%s, FileSize=%d, FilePath=%s", uri2, Long.valueOf(j), string);
                        return null;
                    }
                    Context context2 = context;
                    File file = new File(string);
                    String strConcat = String.valueOf(context2.getPackageName()).concat(".fileprovider");
                    try {
                        Uri uriA = FileProvider.a(context2, strConcat, file);
                        if (((Boolean) daor.f.e()).booleanValue()) {
                            ((eksl) ((eksl) daow.a.h()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 159, "VideoTrimmerStorageImpl.java")).A("getFileInfo - FileSize=%d, FileProviderUri=%s", j, uriA);
                        }
                        if (uriA != null) {
                            return new FileInfoResult(uriA.toString(), j);
                        }
                        ((eksl) ((eksl) daow.a.j()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 163, "VideoTrimmerStorageImpl.java")).I("getFileInfo - Could not get file provider uri. InputUri=%s, FileSize=%d, FilePath=%s", uri2, Long.valueOf(j), string);
                        return null;
                    } catch (IllegalArgumentException e) {
                        ((eksl) ((eksl) ((eksl) daow.a.j()).g(e)).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 152, "VideoTrimmerStorageImpl.java")).J("getFileInfo - Could not get file provider uri. InputUri=%s, FileSize=%d, FilePath=%s, Authority=%s", uri2, Long.valueOf(j), string, strConcat);
                        return null;
                    }
                } catch (RuntimeException e2) {
                    ((eksl) ((eksl) daow.a.h()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 121, "VideoTrimmerStorageImpl.java")).D("getFileInfo - Failed for InputUri=%s with exception: %s", uri2, e2.getMessage());
                }
            }
        }, this.e).h();
    }
}
