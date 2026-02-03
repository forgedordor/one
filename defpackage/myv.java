package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myv extends AudioTrack$StreamEventCallback {
    final /* synthetic */ myw a;

    public myv(myw mywVar) {
        this.a = mywVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        audioTrack.equals(this.a.c.p);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        myx myxVar = this.a.c;
        if (audioTrack.equals(myxVar.p)) {
            myxVar.I = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.a.c.p);
    }
}
