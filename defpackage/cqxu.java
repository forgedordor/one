package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqxu implements fdap {
    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MediaExtractor mediaExtractor = (MediaExtractor) obj;
        mediaExtractor.getClass();
        MediaFormat mediaFormatC = cqxw.c(mediaExtractor);
        if (mediaFormatC != null) {
            return (mediaFormatC.containsKey("rotation-degrees") ? mediaFormatC.getInteger("rotation-degrees") : 0) % 180 == 0 ? new Size(mediaFormatC.getInteger("width"), mediaFormatC.getInteger("height")) : new Size(mediaFormatC.getInteger("height"), mediaFormatC.getInteger("width"));
        }
        return null;
    }
}
