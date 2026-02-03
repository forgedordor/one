package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpw implements rpv {
    @Override // defpackage.rpv
    public final /* bridge */ /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.rpv
    public final /* bridge */ /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
