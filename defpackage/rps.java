package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rps implements rpv {
    @Override // defpackage.rpv
    public final /* bridge */ /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // defpackage.rpv
    public final /* bridge */ /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
