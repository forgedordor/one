package androidx.car.app.media;

import defpackage.cmb;
import defpackage.cmw;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class OpenMicrophoneRequest {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }

    public CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        carAudioCallbackDelegate.getClass();
        return carAudioCallbackDelegate;
    }

    OpenMicrophoneRequest(cmw cmwVar) {
        CarAudioCallbackDelegate carAudioCallbackDelegate = cmwVar.a;
        this.mCarAudioCallbackDelegate = null;
    }
}
