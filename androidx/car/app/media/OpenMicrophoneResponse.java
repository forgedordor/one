package androidx.car.app.media;

import android.os.ParcelFileDescriptor;
import defpackage.cmb;
import defpackage.cmx;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class OpenMicrophoneResponse {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;
    private final ParcelFileDescriptor mCarMicrophoneDescriptor;

    private OpenMicrophoneResponse() {
        this.mCarMicrophoneDescriptor = null;
        this.mCarAudioCallbackDelegate = null;
    }

    public CarAudioCallbackDelegate getCarAudioCallback() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        carAudioCallbackDelegate.getClass();
        return carAudioCallbackDelegate;
    }

    public InputStream getCarMicrophoneInputStream() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.mCarMicrophoneDescriptor;
        if (parcelFileDescriptor == null) {
            try {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = ParcelFileDescriptor.createReliablePipe();
                parcelFileDescriptorArrCreateReliablePipe[1].close();
                parcelFileDescriptor = parcelFileDescriptorArrCreateReliablePipe[0];
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    OpenMicrophoneResponse(cmx cmxVar) {
        CarAudioCallbackDelegate carAudioCallbackDelegate = cmxVar.a;
        this.mCarAudioCallbackDelegate = null;
        ParcelFileDescriptor parcelFileDescriptor = cmxVar.b;
        this.mCarMicrophoneDescriptor = null;
    }
}
