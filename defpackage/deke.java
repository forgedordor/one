package defpackage;

import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deke implements Camera.PreviewCallback {
    final /* synthetic */ dekh a;

    public deke(dekh dekhVar) {
        this.a = dekhVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        dekf dekfVar = this.a.i;
        Object obj = dekfVar.c;
        synchronized (obj) {
            ByteBuffer byteBuffer = dekfVar.f;
            if (byteBuffer != null) {
                camera.addCallbackBuffer(byteBuffer.array());
                dekfVar.f = null;
            }
            IdentityHashMap identityHashMap = dekfVar.g.j;
            if (!identityHashMap.containsKey(bArr)) {
                Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                return;
            }
            dekfVar.d = SystemClock.elapsedRealtime() - dekfVar.b;
            dekfVar.e++;
            dekfVar.f = (ByteBuffer) identityHashMap.get(bArr);
            obj.notifyAll();
        }
    }
}
