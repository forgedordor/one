package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import defpackage.cmb;
import defpackage.cmt;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    /* compiled from: PG */
    @cmb
    private static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final cmt mCarAudioCallback;

        CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            cmt cmtVar = this.mCarAudioCallback;
            cmtVar.getClass();
            cmtVar.a();
        }

        public CarAudioCallbackStub(cmt cmtVar) {
            this.mCarAudioCallback = cmtVar;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }

    static CarAudioCallbackDelegate create(cmt cmtVar) {
        return new CarAudioCallbackDelegate(cmtVar);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            iCarAudioCallback.getClass();
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private CarAudioCallbackDelegate(cmt cmtVar) {
        this.mCallback = new CarAudioCallbackStub(cmtVar);
    }
}
