package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mxa extends AudioDeviceCallback {
    final /* synthetic */ mxd a;

    public mxa(mxd mxdVar) {
        this.a = mxdVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        mxd mxdVar = this.a;
        mxdVar.a(mwz.b(mxdVar.a, mxdVar.h, mxdVar.g));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        mxd mxdVar = this.a;
        mxe mxeVar = mxdVar.g;
        String str = mgb.a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], mxeVar)) {
                mxdVar.g = null;
                break;
            }
            i++;
        }
        mxdVar.a(mwz.b(mxdVar.a, mxdVar.h, mxdVar.g));
    }
}
