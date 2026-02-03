package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myr {
    public final AudioTrack a;
    public final mxd b;
    public AudioRouting$OnRoutingChangedListener c = new AudioRouting$OnRoutingChangedListener() { // from class: myq
        public final void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            myr myrVar = this.a;
            if (myrVar.c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            myrVar.b.b(routedDevice);
        }
    };

    public myr(AudioTrack audioTrack, mxd mxdVar) {
        this.a = audioTrack;
        this.b = mxdVar;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }
}
