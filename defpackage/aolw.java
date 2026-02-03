package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aolw {
    public final AudioManager a;
    public AudioFocusRequest b;

    public aolw(Context context) {
        this.a = (AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        AudioFocusRequest audioFocusRequest = this.b;
        if (audioFocusRequest != null) {
            this.a.abandonAudioFocusRequest(audioFocusRequest);
            this.b = null;
        }
    }
}
