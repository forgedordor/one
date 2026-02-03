package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpu implements rpv {
    @Override // defpackage.rpv
    public final /* bridge */ /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new rpt((ByteBuffer) obj));
    }

    @Override // defpackage.rpv
    public final /* bridge */ /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new rpt((ByteBuffer) obj));
    }
}
