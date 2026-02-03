package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.media.AudioAttributes;
import android.media.MediaActionSound;
import android.os.Looper;
import android.view.WindowManager;
import com.google.android.apps.messaging.ui.mediapicker.camera.camerafocus.RenderOverlay;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czib implements czkf {
    private static final AudioAttributes G;
    private static final List H;
    public static final int[] c;
    public Looper A;
    public czkd B;
    public czjg C;
    public final czid D;
    public final czic E;
    private eiju J;
    private final cqvd K;
    private final fcsu L;
    public int d;
    public boolean e;
    public czjd f;
    czig g;
    czia h;
    Camera i;
    MediaActionSound j;
    public int k;
    public int n;
    public int o;
    public boolean p;
    public final czkh q;
    public boolean r;
    public final Executor u;
    public final Optional v;
    public final czjc w;
    public final eosc x;
    public final eosc y;
    public final Context z;
    public static final eksp a = eksp.c("BugleCamera");
    private static final ejxr F = cdag.w(227411292, "enable_media_action_sound_fix");
    public static final cczv b = cdag.h(cdag.b, "video_recorder_check_audio_format", false);
    private final Camera.CameraInfo I = new Camera.CameraInfo();
    public eiju l = eijx.c();
    public eiju m = eijx.c();
    public SettableFuture s = SettableFuture.create();
    public final AtomicBoolean t = new AtomicBoolean(true);
    private final HashSet M = new HashSet();

    static {
        cdag.e(cdag.b, "video_recording_quality", 5);
        G = new AudioAttributes.Builder().setContentType(4).setUsage(13).setLegacyStreamType(1).build();
        c = new int[]{0, 2, 3};
        H = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public czib(Optional optional, Optional optional2, czjc czjcVar, eosc eoscVar, eosc eoscVar2, Context context, cqvd cqvdVar, fcsu fcsuVar, Optional optional3, Optional optional4) {
        ?? r3 = optional.get();
        this.u = r3;
        this.v = optional2;
        this.w = czjcVar;
        this.x = eoscVar;
        this.y = eoscVar2;
        this.z = context;
        this.K = cqvdVar;
        this.L = fcsuVar;
        this.D = (czid) optional3.get();
        this.E = (czic) optional4.get();
        this.d = -1;
        final Looper looperMyLooper = Looper.myLooper();
        auwa.a(new Runnable() { // from class: czhk
            @Override // java.lang.Runnable
            public final void run() {
                if (Looper.myLooper() != looperMyLooper) {
                    this.a.A = Looper.myLooper();
                }
            }
        }, r3);
        this.q = new czkh(this, Looper.getMainLooper());
    }

    private final void A() {
        this.l.cancel(false);
        this.l = eijx.c();
        this.s.cancel(false);
        this.s = SettableFuture.create();
        eiju eijuVar = this.J;
        if (eijuVar != null) {
            eijuVar.cancel(false);
        }
        this.m.cancel(false);
        this.m = eijx.c();
    }

    private final boolean B() {
        return !this.l.isDone();
    }

    private final void C() throws IllegalStateException, InterruptedException {
        Camera camera;
        czjd czjdVar = this.f;
        if (czjdVar == null) {
            return;
        }
        czjdVar.b(0L);
        final czje czjeVarA = czjdVar.a();
        this.f = null;
        if (this.r && (camera = this.i) != null) {
            s(camera);
        }
        o();
        auwa.a(new Runnable() { // from class: czhm
            @Override // java.lang.Runnable
            public final void run() {
                bxlf.h(((czey) czjeVarA).a, this.a.z).delete();
            }
        }, this.y);
    }

    static int b(int i) {
        return i & (-16);
    }

    public static boolean v(Camera.Parameters parameters, String str) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        return supportedFlashModes != null && supportedFlashModes.contains(str);
    }

    private static int y(int i) {
        List list = H;
        synchronized (list) {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras > 0 && numberOfCameras != list.size()) {
                list.clear();
                for (int i2 = 0; i2 < numberOfCameras; i2++) {
                    list.add(new Camera.CameraInfo());
                    Camera.getCameraInfo(i2, (Camera.CameraInfo) list.get(i2));
                }
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (((Camera.CameraInfo) list.get(i3)).facing == i) {
                    return i3;
                }
            }
            if (list.isEmpty()) {
                ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "chooseCameraIndexForFacingCached", 441, "CameraManager.java")).q("getNumberOfCameras returned 0 and cache was empty!");
            }
            return 0;
        }
    }

    private final void z() {
        Looper looper = this.A;
        if (looper == null || looper == Looper.myLooper()) {
            return;
        }
        cqaz.c("Expected to be on the camera thread");
    }

    final int a() {
        czig czigVar = this.g;
        WindowManager windowManager = (WindowManager) (czigVar != null ? czigVar.getContext() : this.z).getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public final eiju c(final int i) {
        eiju eijuVar = this.J;
        return eijuVar != null ? eijuVar.h(new ejvr() { // from class: czhg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                MediaActionSound mediaActionSound = this.a.j;
                if (mediaActionSound == null) {
                    return null;
                }
                mediaActionSound.play(i);
                return null;
            }
        }, this.y) : eijx.e(null);
    }

    public final eiju d(final float f) {
        int i = this.I.facing;
        if (B()) {
            return eijx.d(new IllegalStateException("Previous picture is already in progress."));
        }
        final Camera camera = this.i;
        if (camera == null) {
            return eijx.d(new IllegalStateException("Camera has been released before taking picture."));
        }
        final boolean z = i == 1;
        return eijx.h(new eooy() { // from class: czgl
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final czib czibVar = this.a;
                eiju eijuVarG = eiju.g(czibVar.s);
                eooz eoozVar = new eooz() { // from class: czhs
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final SettableFuture settableFutureCreate = SettableFuture.create();
                        final czib czibVar2 = czibVar;
                        auwa.a(new Runnable() { // from class: czgn
                            @Override // java.lang.Runnable
                            public final void run() {
                                final SettableFuture settableFuture = settableFutureCreate;
                                final czib czibVar3 = czibVar2;
                                Camera camera2 = czibVar3.i;
                                if (camera2 == null) {
                                    settableFuture.setException(new czhy("Camera not open"));
                                    return;
                                }
                                if (czibVar3.w()) {
                                    settableFuture.setException(new czhy("Camera busy"));
                                    return;
                                }
                                Camera.PictureCallback pictureCallback = new Camera.PictureCallback() { // from class: czha
                                    @Override // android.hardware.Camera.PictureCallback
                                    public final void onPictureTaken(byte[] bArr, Camera camera3) {
                                        eksp ekspVar = czib.a;
                                        SettableFuture settableFuture2 = settableFuture;
                                        if (bArr == null) {
                                            settableFuture2.setException(new czhy("Camera returned no data"));
                                        } else {
                                            settableFuture2.set(bArr);
                                        }
                                    }
                                };
                                try {
                                    czibVar3.s(camera2);
                                    camera2.takePicture(new Camera.ShutterCallback() { // from class: czhb
                                        @Override // android.hardware.Camera.ShutterCallback
                                        public final void onShutter() {
                                            czib czibVar4 = czibVar3;
                                            if (czibVar4.x()) {
                                                return;
                                            }
                                            czibVar4.i("camera_click.ogg");
                                        }
                                    }, null, pictureCallback);
                                } catch (Throwable th) {
                                    settableFuture.setException(th);
                                }
                            }
                        }, czibVar2.u);
                        return eiju.g(settableFutureCreate);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                eiju eijuVarI = eijuVarG.i(eoozVar, eoqgVar);
                final Camera camera2 = camera;
                final float f2 = f;
                final boolean z2 = z;
                czibVar.l = eijuVarI.i(new eooz() { // from class: czht
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final int i2;
                        final int i3;
                        final byte[] bArr = (byte[]) obj;
                        Camera.Size pictureSize = camera2.getParameters().getPictureSize();
                        czib czibVar2 = czibVar;
                        int i4 = czibVar2.k;
                        if (i4 == 90 || i4 == 270) {
                            i2 = pictureSize.height;
                            i3 = pictureSize.width;
                        } else {
                            i2 = pictureSize.width;
                            i3 = pictureSize.height;
                        }
                        boolean z3 = z2;
                        float f3 = f2;
                        ekrw ekrwVarN = czib.a.n();
                        ekrwVarN.X(czld.d, Integer.valueOf(bArr.length));
                        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "setTakingPictureFuture", 672, "CameraManager.java")).q("taken picture (bytes)");
                        final czjc czjcVar = czibVar2.w;
                        final czex czexVar = new czex();
                        if (f3 == 1.0f) {
                            if (!z3) {
                                czexVar.d(czjcVar.a(new czjb() { // from class: cziz
                                    @Override // defpackage.czjb
                                    public final void a(OutputStream outputStream) throws IOException {
                                        outputStream.write(bArr);
                                    }
                                }));
                                czexVar.e(i2);
                                czexVar.c(i3);
                                czexVar.b(0L);
                                czexVar.b = "image/jpeg";
                                return eork.i(czexVar.a());
                            }
                            z3 = true;
                        }
                        if (f3 > 1.0f) {
                            i2 = (int) (i2 / f3);
                        } else {
                            i3 = (int) (i3 * f3);
                        }
                        return eooq.f(rdo.a(((rbr) ((rbr) czjcVar.b.b().Y(z3 ? new ret(new rnv(), new cpck()) : new rnv())).Q(i2, i3)).m(bArr)), new ejvr() { // from class: czja
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                czjc czjcVar2 = czjcVar;
                                czjd czjdVar = czexVar;
                                final Bitmap bitmap = (Bitmap) obj2;
                                try {
                                    czjdVar.d(czjcVar2.a(new czjb() { // from class: cziy
                                        @Override // defpackage.czjb
                                        public final void a(OutputStream outputStream) {
                                            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outputStream);
                                        }
                                    }));
                                    int i5 = i3;
                                    czjdVar.e(i2);
                                    czjdVar.c(i5);
                                    czjdVar.b(0L);
                                    ((czex) czjdVar).b = "image/jpeg";
                                    return czjdVar.a();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }, czjcVar.a);
                    }
                }, eoqgVar);
                return czibVar.l;
            }
        }, this.u);
    }

    public final void e() {
        if (this.e) {
            this.e = false;
            this.g = null;
            A();
            final MediaActionSound mediaActionSound = this.j;
            if (mediaActionSound != null) {
                this.y.execute(eiid.k(new Runnable() { // from class: czgu
                    @Override // java.lang.Runnable
                    public final void run() {
                        mediaActionSound.release();
                    }
                }));
                this.j = null;
            }
            auwa.a(new Runnable() { // from class: czgw
                @Override // java.lang.Runnable
                public final void run() throws IllegalStateException, InterruptedException {
                    this.a.g();
                }
            }, this.u);
        }
    }

    public final void f(final Consumer consumer) {
        auwa.a(new Runnable() { // from class: czhw
            @Override // java.lang.Runnable
            public final void run() {
                Camera camera = this.a.i;
                if (camera != null) {
                    consumer.z(camera);
                }
            }
        }, this.u);
    }

    public final void g() throws IllegalStateException, InterruptedException {
        z();
        if (this.i == null) {
            return;
        }
        cqaz.f(this.s.isDone());
        C();
        ekrw ekrwVarO = a.o();
        ekrwVarO.X(czld.a, Integer.valueOf(this.d));
        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "internalCloseCamera", 636, "CameraManager.java")).q("Releasing camera");
        Camera camera = this.i;
        if (camera != null) {
            camera.release();
        }
        this.i = null;
        final czkh czkhVar = this.q;
        czkhVar.getClass();
        auwa.a(new Runnable() { // from class: czgm
            @Override // java.lang.Runnable
            public final void run() {
                czkhVar.c();
            }
        }, this.x);
    }

    public final void h(int i) {
        z();
        if (this.i == null && i == this.d) {
            boolean z = true;
            this.t.set(true);
            try {
                eksp ekspVar = a;
                ekrw ekrwVarO = ekspVar.o();
                ekrz ekrzVar = czld.a;
                Integer numValueOf = Integer.valueOf(i);
                ekrwVarO.X(ekrzVar, numValueOf);
                ((eksl) ekrwVarO.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "internalOpenCamera", 567, "CameraManager.java")).q("Opening camera");
                C();
                Camera cameraOpen = Camera.open(i);
                this.i = cameraOpen;
                q(cameraOpen);
                ekrw ekrwVarO2 = ekspVar.o();
                ekrwVarO2.X(ekrzVar, numValueOf);
                eksl ekslVar = (eksl) ekrwVarO2.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "internalOpenCamera", 574, "CameraManager.java");
                if (this.i == null) {
                    z = false;
                }
                ekslVar.t("Opened camera %s", Boolean.valueOf(z));
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final void i(String str) {
        cquu cquuVar = new cquu();
        cquuVar.a = new cqur("file:///product/media/audio/ui/".concat(str));
        cquuVar.b = Optional.of(new cqur("file:///system/media/audio/ui/".concat(str)));
        cquuVar.b(G);
        cquuVar.d(0.5f);
        auvh.h(this.K.a(cquuVar.a()).e(cqve.class, new ejvr() { // from class: czhf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) czib.a.j()).g((cqve) obj)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "playSystemSound", 1384, "CameraManager.java")).q("Failed to play system sound");
                return cqup.c(2);
            }
        }, eoqg.a));
    }

    public final void j(czig czigVar, boolean z) {
        if (z) {
            this.M.add(czigVar);
            if (czigVar.c() && czigVar != this.g) {
                this.l.cancel(false);
                cqaz.k(czigVar.c());
                czigVar.setOnTouchListener(new czhx(this));
                this.g = czigVar;
                f(new czgk(this));
            }
        } else {
            this.M.remove(czigVar);
        }
        if (this.M.isEmpty()) {
            e();
            return;
        }
        if (this.e) {
            return;
        }
        this.t.set(true);
        this.e = true;
        if (this.d == -1) {
            int iY = y(0);
            this.d = iY;
            Camera.getCameraInfo(iY, this.I);
        }
        auwa.a(new Runnable() { // from class: czhu
            @Override // java.lang.Runnable
            public final void run() {
                czib czibVar = this.a;
                try {
                    czibVar.h(czibVar.d);
                } finally {
                    czibVar.t.set(false);
                }
            }
        }, this.u);
        if (!((Boolean) ((cczi) F.get()).e()).booleanValue()) {
            this.j = new MediaActionSound();
            this.J = eijx.g(new Callable() { // from class: czgp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    czib czibVar = this.a;
                    MediaActionSound mediaActionSound = czibVar.j;
                    mediaActionSound.getClass();
                    mediaActionSound.load(0);
                    czibVar.j.load(2);
                    czibVar.j.load(3);
                    return null;
                }
            }, this.y);
        } else {
            final MediaActionSound mediaActionSound = new MediaActionSound();
            this.j = mediaActionSound;
            this.J = eijx.g(new Callable() { // from class: czhc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int[] iArr = czib.c;
                    int length = iArr.length;
                    for (int i = 0; i < 3; i++) {
                        MediaActionSound mediaActionSound2 = mediaActionSound;
                        czib czibVar = this.a;
                        int i2 = iArr[i];
                        if (mediaActionSound2 == czibVar.j) {
                            mediaActionSound2.load(i2);
                        }
                    }
                    return null;
                }
            }, this.y);
        }
    }

    public final void k() {
        if (this.e) {
            f(new czgk(this));
        }
    }

    final void l(boolean z) {
        this.r = z;
        f(new Consumer() { // from class: czho
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.s((Camera) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void m(final String str) {
        f(new Consumer() { // from class: czhr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Camera camera = (Camera) obj;
                eksp ekspVar = czib.a;
                Camera.Parameters parameters = camera.getParameters();
                String str2 = str;
                if (czib.v(parameters, str2)) {
                    camera.stopPreview();
                    parameters.setFlashMode(str2);
                    camera.setParameters(parameters);
                    camera.startPreview();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void n(RenderOverlay renderOverlay) {
        czkq czkqVar = null;
        if (renderOverlay != null) {
            Iterator it = renderOverlay.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                czks czksVar = (czks) it.next();
                if (czksVar instanceof czkq) {
                    czkqVar = (czkq) czksVar;
                    break;
                }
            }
        }
        this.q.d = czkqVar;
    }

    final void o() throws IllegalStateException, InterruptedException {
        czjg czjgVar = this.C;
        if (czjgVar != null) {
            czjgVar.a.c();
        }
        czkd czkdVar = this.B;
        if (czkdVar != null) {
            euwp euwpVar = czkdVar.a;
            if (euwpVar.b) {
                euwpVar.b();
            }
        }
    }

    public final void p() {
        cqaz.k(this.d >= 0);
        Camera.CameraInfo cameraInfo = this.I;
        final int iY = y(cameraInfo.facing != 1 ? 1 : 0);
        if (w() || B() || this.d == iY) {
            return;
        }
        this.t.set(true);
        A();
        this.d = iY;
        Camera.getCameraInfo(iY, cameraInfo);
        auwa.a(new Runnable() { // from class: czgv
            @Override // java.lang.Runnable
            public final void run() {
                czib czibVar = this.a;
                int i = iY;
                try {
                    try {
                        if (czibVar.e) {
                            if (czibVar.i != null) {
                                czibVar.g();
                            }
                            czibVar.h(i);
                        }
                    } catch (RuntimeException e) {
                        eksl ekslVar = (eksl) czib.a.i();
                        ekslVar.X(czld.a, Integer.valueOf(i));
                        ((eksl) ((eksl) ekslVar.g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "selectCameraByIndex", 475, "CameraManager.java")).q("RuntimeException in CameraManager.selectCameraByIndex");
                    }
                } finally {
                    czibVar.t.set(false);
                }
            }
        }, this.u);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.hardware.Camera r12) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czib.q(android.hardware.Camera):void");
    }

    public final void r(czig czigVar) {
        HashSet hashSet = this.M;
        hashSet.remove(czigVar);
        if (hashSet.isEmpty()) {
            e();
        }
    }

    public final void s(Camera camera) {
        String str;
        z();
        try {
            Camera.Parameters parameters = camera.getParameters();
            boolean z = this.r;
            boolean zW = w();
            if (z) {
                str = "torch";
                if (true != zW) {
                    str = "on";
                }
            } else {
                str = "off";
            }
            if (v(parameters, str)) {
                parameters.setFlashMode(str);
            }
            camera.setParameters(parameters);
        } catch (RuntimeException e) {
            ((eksl) ((eksl) ((eksl) a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "updateCameraFlashMode", (char) 1085, "CameraManager.java")).q("RuntimeException in CameraManager.updateCameraOrientation");
        }
    }

    final void t(Camera camera, int i) {
        int i2;
        z();
        cqaz.a(0, i % 90);
        if (this.g == null || B() || w()) {
            return;
        }
        this.o = a();
        this.n = i;
        this.p = true;
        Camera.CameraInfo cameraInfo = this.I;
        if (cameraInfo.facing == 1) {
            this.k = (cameraInfo.orientation + this.n) % 360;
            i2 = (720 - (cameraInfo.orientation + this.o)) % 360;
        } else {
            i2 = ((cameraInfo.orientation - this.o) + 360) % 360;
            this.k = ((cameraInfo.orientation - this.n) + 360) % 360;
        }
        if (w()) {
            return;
        }
        try {
            camera.setDisplayOrientation(i2);
            Camera.Parameters parameters = camera.getParameters();
            if (parameters != null) {
                parameters.setRotation(this.k);
                camera.setParameters(parameters);
            }
        } catch (RuntimeException e) {
            ((eksl) ((eksl) ((eksl) a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "updateCameraOrientation", (char) 1055, "CameraManager.java")).q("RuntimeException in CameraManager.updateCameraOrientation");
        }
    }

    public final boolean u() {
        return this.I.facing == 1;
    }

    public final boolean w() {
        return (this.f == null || (!this.m.isDone() && !this.m.isCancelled())) ? false : true;
    }

    public final boolean x() {
        return !this.I.canDisableShutterSound;
    }
}
