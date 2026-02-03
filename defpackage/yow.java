package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import j$.time.Duration;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yow implements aalp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider");
    public final HashMap b;
    private final yqb c;

    public yow(Context context, yqb yqbVar) {
        context.getClass();
        this.c = yqbVar;
        this.b = new HashMap();
    }

    public final yov a(Uri uri, Duration duration, int i) {
        HashMap map = this.b;
        yov yovVar = (yov) map.get(uri);
        if (yovVar != null) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider", "getOrCreateAudioPlayer", 80, "AudioPlayerProvider.kt")).t("createAudioPlayer found cached AudioPlayer with uri: %s", uri);
            return yovVar;
        }
        ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider", "getOrCreateAudioPlayer", 84, "AudioPlayerProvider.kt")).t("createAudioPlayer creating new AudioPlayer with uri: %s", uri);
        yqb yqbVar = this.c;
        AudioManager audioManager = (AudioManager) yqbVar.a.b();
        audioManager.getClass();
        Context context = (Context) yqbVar.b.b();
        context.getClass();
        fdjx fdjxVar = (fdjx) yqbVar.c.b();
        fdjxVar.getClass();
        fdjx fdjxVar2 = (fdjx) yqbVar.d.b();
        fdjxVar2.getClass();
        aiqb aiqbVar = (aiqb) yqbVar.e.b();
        aiqbVar.getClass();
        eigp eigpVar = (eigp) yqbVar.f.b();
        eigpVar.getClass();
        yqa yqaVar = new yqa(audioManager, context, fdjxVar, fdjxVar2, aiqbVar, eigpVar, uri, duration, i);
        map.put(uri, yqaVar);
        return yqaVar;
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        HashMap map = this.b;
        for (Object obj : map.values()) {
            obj.getClass();
            ((yov) obj).i();
        }
        map.clear();
    }
}
