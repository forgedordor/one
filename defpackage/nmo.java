package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmo extends GLSurfaceView {
    public final CopyOnWriteArrayList a;
    public final Handler b;
    public final nmk c;
    public SurfaceTexture d;
    public Surface e;
    private final SensorManager f;
    private final Sensor g;
    private final nmc h;
    private final nmq i;
    private final boolean j;
    private boolean k;
    private boolean l;

    public nmo(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.b = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        mee.f(systemService);
        SensorManager sensorManager = (SensorManager) systemService;
        this.f = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.g = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        nmk nmkVar = new nmk();
        this.c = nmkVar;
        nmn nmnVar = new nmn(this, nmkVar);
        nmq nmqVar = new nmq(context, nmnVar);
        this.i = nmqVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        mee.f(windowManager);
        this.h = new nmc(windowManager.getDefaultDisplay(), nmqVar, nmnVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(nmnVar);
        setOnTouchListener(nmqVar);
    }

    public static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private final void b() {
        boolean z = this.j && this.k;
        Sensor sensor = this.g;
        if (sensor == null || z == this.l) {
            return;
        }
        if (z) {
            this.f.registerListener(this.h, sensor, 0);
        } else {
            this.f.unregisterListener(this.h);
        }
        this.l = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.post(new Runnable() { // from class: nml
            @Override // java.lang.Runnable
            public final void run() throws CloneNotSupportedException {
                nmo nmoVar = this.a;
                Surface surface = nmoVar.e;
                if (surface != null) {
                    Iterator it = nmoVar.a.iterator();
                    while (it.hasNext()) {
                        ((mrk) it.next()).b();
                    }
                }
                nmo.a(nmoVar.d, surface);
                nmoVar.d = null;
                nmoVar.e = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.k = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.k = true;
        b();
    }
}
