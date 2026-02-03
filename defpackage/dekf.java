package defpackage;

import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.barhopper.Barhopper;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekf implements Runnable {
    public dekk a;
    public long d;
    public ByteBuffer f;
    final /* synthetic */ dekh g;
    public final long b = SystemClock.elapsedRealtime();
    public final Object c = new Object();
    private boolean h = true;
    public int e = 0;

    public dekf(dekh dekhVar, dekk dekkVar) {
        this.g = dekhVar;
        this.a = dekkVar;
    }

    public final void a(boolean z) {
        Object obj = this.c;
        synchronized (obj) {
            this.h = z;
            obj.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        while (true) {
            Object obj = this.c;
            synchronized (obj) {
                while (this.h) {
                    ByteBuffer byteBuffer = this.f;
                    if (byteBuffer == null) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            Log.d("CameraSource", "Frame processing loop terminated.", e);
                            return;
                        }
                    } else {
                        dekl deklVar = new dekl();
                        dekh dekhVar = this.g;
                        dcjp dcjpVar = dekhVar.e;
                        int i = dcjpVar.a;
                        int i2 = dcjpVar.b;
                        if (byteBuffer.capacity() < i * i2) {
                            throw new IllegalArgumentException("Invalid image data size.");
                        }
                        deklVar.a = i;
                        deklVar.b = i2;
                        deklVar.f = 17;
                        deklVar.c = this.e;
                        deklVar.d = this.d;
                        deklVar.e = dekhVar.d;
                        ByteBuffer byteBuffer2 = this.f;
                        this.f = null;
                        try {
                            try {
                                dekk dekkVar = this.a;
                                dclh.m(dekkVar);
                                dekl deklVar2 = new dekl(deklVar);
                                if (deklVar2.e % 2 != 0) {
                                    int i3 = deklVar2.a;
                                    deklVar2.a = deklVar2.b;
                                    deklVar2.b = i3;
                                }
                                deklVar2.e = 0;
                                Barcode[] barcodeArrRecognize = Barhopper.recognize(deklVar.a, deklVar.b, byteBuffer.array(), ((cypb) dekkVar).a);
                                if (barcodeArrRecognize == null) {
                                    cqca.n("Bugle", "Invalid QR detector frame. Check logcat output for info.");
                                    sparseArray = ((cypb) dekkVar).b;
                                } else {
                                    int length = barcodeArrRecognize.length;
                                    if (length == 0) {
                                        sparseArray = ((cypb) dekkVar).b;
                                    } else {
                                        SparseArray sparseArray2 = new SparseArray(length);
                                        for (Barcode barcode : barcodeArrRecognize) {
                                            sparseArray2.append(barcode.rawValue.hashCode(), barcode);
                                        }
                                        sparseArray = sparseArray2;
                                    }
                                }
                                deki dekiVar = new deki(sparseArray);
                                synchronized (dekkVar.c) {
                                    dekj dekjVar = dekkVar.d;
                                    if (dekjVar == null) {
                                        throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
                                    }
                                    dekjVar.a(dekiVar);
                                }
                                Camera camera = dekhVar.c;
                                dclh.m(camera);
                                dclh.m(byteBuffer2);
                                camera.addCallbackBuffer(byteBuffer2.array());
                            } catch (Exception e2) {
                                Log.e("CameraSource", "Exception thrown from receiver.", e2);
                                Camera camera2 = this.g.c;
                                dclh.m(camera2);
                                dclh.m(byteBuffer2);
                                camera2.addCallbackBuffer(byteBuffer2.array());
                            }
                        } catch (Throwable th) {
                            Camera camera3 = this.g.c;
                            dclh.m(camera3);
                            dclh.m(byteBuffer2);
                            camera3.addCallbackBuffer(byteBuffer2.array());
                            throw th;
                        }
                    }
                }
                return;
            }
        }
    }
}
