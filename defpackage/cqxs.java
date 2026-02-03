package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqxs implements fdap {
    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws cqxm {
        MediaExtractor mediaExtractor = (MediaExtractor) obj;
        mediaExtractor.getClass();
        MediaFormat mediaFormatC = cqxw.c(mediaExtractor);
        if (mediaFormatC == null) {
            throw new cqxm("Could not determine video duration");
        }
        long j = mediaFormatC.containsKey("durationUs") ? mediaFormatC.getLong("durationUs") : 0L;
        if (j > 0) {
            return Duration.ofMillis(j / TimeUnit.MILLISECONDS.toMicros(1L));
        }
        mediaExtractor.seekTo(0L, 0);
        long j2 = 0;
        while (mediaExtractor.advance()) {
            long sampleTime = mediaExtractor.getSampleTime();
            if (sampleTime > 0) {
                j2 = sampleTime;
            }
        }
        mediaExtractor.seekTo(0L, 0);
        if (j2 > 0) {
            return Duration.ofMillis(j2 / TimeUnit.MILLISECONDS.toMicros(1L));
        }
        throw new cqxm(a.u(j2, "Could not determine video duration lastSampleTimeUs: "));
    }
}
