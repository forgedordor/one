package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdf {
    public final int a = 1;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final mac d;
    public final boolean e;
    private final Object f;

    public mdf(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, mac macVar, boolean z) {
        this.c = handler;
        this.d = macVar;
        this.e = z;
        this.b = onAudioFocusChangeListener;
        this.f = new AudioFocusRequest.Builder(1).setAudioAttributes(macVar.a().a).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final AudioFocusRequest a() {
        Object obj = this.f;
        mee.f(obj);
        return nh$$ExternalSyntheticApiModelOutline0.m(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdf)) {
            return false;
        }
        mdf mdfVar = (mdf) obj;
        int i = mdfVar.a;
        return this.e == mdfVar.e && Objects.equals(this.b, mdfVar.b) && Objects.equals(this.c, mdfVar.c) && Objects.equals(this.d, mdfVar.d);
    }

    public final int hashCode() {
        return Objects.hash(1, this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
