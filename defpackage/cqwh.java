package defpackage;

import android.media.MediaPlayer;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqwh {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/media/common/MediaPlayerManager");
    private static final Set b = DesugarCollections.synchronizedSet(new HashSet());

    public static MediaPlayer a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        b.add(mediaPlayer);
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/media/common/MediaPlayerManager", "create", 38, "MediaPlayerManager.java")).r("MediaPlayerManager: created 0x%x", mediaPlayer.hashCode());
        return mediaPlayer;
    }

    public static void b(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.release();
        ejwl.l(b.remove(mediaPlayer));
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/media/common/MediaPlayerManager", "release", 48, "MediaPlayerManager.java")).r("MediaPlayerManager: released 0x%x", mediaPlayer.hashCode());
    }
}
