package defpackage;

import android.media.MediaMetadataRetriever;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class domt {
    private static final ekrg a = ekrg.c("com/google/android/libraries/compose/media/metadata/MediaMetadataRetrieverResolver");
    private final fdjx b;

    public domt(fdjx fdjxVar) {
        this.b = fdjxVar;
    }

    protected static final Instant c(MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(5);
        if (strExtractMetadata != null) {
            try {
                return Instant.parse(strExtractMetadata);
            } catch (Exception e) {
                ((ekrd) ((ekrd) a.j()).g(e).h("com/google/android/libraries/compose/media/metadata/MediaMetadataRetrieverResolver", "extractDateModifiedFromMetadata", 35, "MediaMetadataRetrieverResolver.kt")).t("Unable to parse non-standard video date %s", strExtractMetadata);
            }
        }
        return null;
    }

    protected static final Duration d(MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (strExtractMetadata == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Duration durationOfMillis = Duration.ofMillis(Long.parseLong(strExtractMetadata));
        durationOfMillis.getClass();
        return durationOfMillis;
    }

    protected abstract domh a(MediaMetadataRetriever mediaMetadataRetriever);

    public final Object b(fdap fdapVar, fcxy fcxyVar) {
        return fdin.a(this.b.hE(), new doms(fdapVar, this, null), fcxyVar);
    }
}
