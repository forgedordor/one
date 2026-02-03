package defpackage;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqwn {
    public final MediaMetadataRetriever a = new MediaMetadataRetriever();
    private final Context b;

    public cqwn(Context context) {
        this.b = context;
    }

    public static Object c(Context context, Uri uri, ejvr ejvrVar, Object obj) {
        return new cqwn(context).b(uri, ejvrVar, obj);
    }

    public final int a(int i, int i2) {
        String strExtractMetadata = this.a.extractMetadata(i);
        return TextUtils.isEmpty(strExtractMetadata) ? i2 : Integer.parseInt(strExtractMetadata);
    }

    public final Object b(Uri uri, ejvr ejvrVar, Object obj) throws IOException {
        try {
            try {
                try {
                    this.a.setDataSource(this.b, uri);
                    obj = ejvrVar.apply(this);
                } catch (RuntimeException e) {
                    d();
                    throw new IOException(e);
                }
            } catch (IOException e2) {
                ((eksl) ((eksl) ((eksl) cqxo.a.i()).g(e2)).h("com/google/android/apps/messaging/shared/util/media/video/MediaMetadataRetrieverWrapper", "extractMetadata", 66, "MediaMetadataRetrieverWrapper.java")).q("Error extracting metadata");
            }
            d();
            return obj;
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    public final void d() throws IOException {
        try {
            this.a.release();
        } catch (Exception e) {
            ((eksl) ((eksl) ((eksl) cqxo.a.i()).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/MediaMetadataRetrieverWrapper", "release", ']', "MediaMetadataRetrieverWrapper.java")).q("MediaMetadataRetriever.release failed");
        }
    }
}
