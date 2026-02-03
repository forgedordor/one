package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqp extends CameraDevice.StateCallback {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ aqq a;

    public aqp(aqq aqqVar) {
        this.a = aqqVar;
    }

    private final void a() {
        List listC;
        aqq aqqVar = this.a;
        synchronized (aqqVar.b) {
            listC = aqqVar.c();
            aqqVar.e.clear();
            aqqVar.c.clear();
            aqqVar.d.clear();
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ((asn) it.next()).p();
        }
    }

    private final void b() {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        aqq aqqVar = this.a;
        synchronized (aqqVar.b) {
            linkedHashSet.addAll(aqqVar.e);
            linkedHashSet.addAll(aqqVar.c);
        }
        aqq aqqVar2 = this.a;
        aqqVar2.a.execute(new Runnable() { // from class: aqn
            @Override // java.lang.Runnable
            public final void run() {
                int i = aqp.b;
                for (asn asnVar : linkedHashSet) {
                    asnVar.k().h(asnVar);
                }
            }
        });
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        b();
        a();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        b();
        a();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, final int i) {
        b();
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        aqq aqqVar = this.a;
        synchronized (aqqVar.b) {
            linkedHashSet.addAll(aqqVar.e);
            linkedHashSet.addAll(aqqVar.c);
        }
        aqq aqqVar2 = this.a;
        aqqVar2.a.execute(new Runnable() { // from class: aqo
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = aqp.b;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((asn) it.next()).q(i);
                }
            }
        });
        a();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
    }
}
