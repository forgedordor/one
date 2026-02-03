package defpackage;

import android.animation.TimeAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.SwitchImageView;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.microedition.khronos.egl.EGLContext;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czgf {
    public static final eksp a = eksp.c("BugleCamera");
    public SwitchImageView A;
    public SwitchImageView B;
    public FrameLayout C;
    public View D;
    public ImageView E;
    public TextView F;
    public View G;
    public czkc H;
    public TimeAnimator I;
    public aw J;
    public aw K;
    public aw L;
    public int N;
    public int O;
    public int P;
    public Transition Q;
    public Transition R;
    public czip S;
    public final czez T;
    public final tlt U;
    public final eosc V;
    public final dakl W;
    public final fcsu X;
    public czmk Y;
    public Consumer Z;
    public Runnable aa;
    public Runnable ab;
    public Runnable ac;
    private final aiqk ae;
    private final fcsu af;
    public final eosc c;
    public final aiqd d;
    public final aiqh e;
    public final ajfo f;
    public final czib g;
    public OrientationEventListener k;
    public czjf l;
    public Runnable m;
    public czjv n;
    public cziu o;
    public boolean p;
    public ColorStateList q;
    public ColorStateList r;
    public czir s;
    public boolean u;
    public View v;
    public ConstraintLayout w;
    public CameraTextureView x;
    public View y;
    public CarouselRecyclerView z;
    public final long b = TimeUnit.SECONDS.toMillis(((Integer) ujw.m.e()).intValue());
    public final czge h = new czge(this);
    final czfz ad = new czfz(this);
    final cvjh i = new czga(this);
    public czgd j = czgd.PHOTO;
    public Boolean t = true;
    public final List M = new ArrayList();

    public czgf(czez czezVar, eosc eoscVar, aiqd aiqdVar, aiqh aiqhVar, aiqk aiqkVar, ajfo ajfoVar, czib czibVar, fcsu fcsuVar, tlt tltVar, eosc eoscVar2, dakl daklVar, fcsu fcsuVar2) {
        this.T = czezVar;
        this.c = eoscVar;
        this.d = aiqdVar;
        this.e = aiqhVar;
        this.ae = aiqkVar;
        this.f = ajfoVar;
        this.g = czibVar;
        this.af = fcsuVar;
        this.U = tltVar;
        this.V = eoscVar2;
        this.W = daklVar;
        this.X = fcsuVar2;
    }

    public static int j(int i) {
        return i % 180 == 0 ? 2 : 3;
    }

    private final void l(aw awVar, Transition transition, boolean z) {
        awVar.l(R.id.back_close_button, this.A.getVisibility());
        awVar.l(R.id.camera_flash_button, this.B.getVisibility());
        TransitionManager.beginDelayedTransition(this.w, transition);
        awVar.b(this.w);
        int i = true != z ? 0 : 4;
        this.A.d(R.drawable.back_arrow_shadow, i);
        this.B.d(R.drawable.back_arrow_shadow, i);
    }

    private static int m(czgd czgdVar) {
        int iOrdinal = czgdVar.ordinal();
        if (iOrdinal == 0) {
            return 2;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        throw new IllegalStateException("Unsupported mode ".concat(String.valueOf(String.valueOf(czgdVar))));
    }

    public final void a(boolean z) {
        if (this.j.ordinal() == 1) {
            l(z ? this.L : this.K, new Fade(), z);
            return;
        }
        eksl ekslVar = (eksl) a.j();
        ekslVar.X(czld.h, this.j.toString());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragmentPeer", "animateRecordingStateLayout", 833, "CameraFragmentPeer.java")).q("Attempting to animate layout to recording state in unsupported mode");
    }

    public final void b() {
        ((crmg) this.af.b()).i(new crmf() { // from class: czfq
            @Override // defpackage.crmf
            public final void b() {
                eiju eijuVarI;
                final czgf czgfVar = this.a;
                if (czgfVar.p) {
                    return;
                }
                czgfVar.O = czgfVar.N;
                int width = czgfVar.x.getWidth();
                int height = czgfVar.x.getHeight();
                czgfVar.p = true;
                czgfVar.D.performHapticFeedback(1);
                czgfVar.T.G().getWindow().addFlags(128);
                czgfVar.z.setEnabled(false);
                czgfVar.z.aP(true);
                final czib czibVar = czgfVar.g;
                if (czibVar.t.get()) {
                    eijuVarI = eijx.d(new IllegalStateException("Camera must finish opening before recording video."));
                } else {
                    if (czibVar.B == null) {
                        czid czidVar = czibVar.D;
                        czkd czkdVar = new czkd((EGLContext) czibVar.v.orElse(null));
                        czic czicVar = czibVar.E;
                        czibVar.C = new czjg();
                        czibVar.C.a.a(czkdVar.a);
                        czibVar.B = czkdVar;
                    }
                    if (czibVar.r) {
                        czibVar.m("torch");
                    }
                    final int iB = czib.b(width);
                    final int iB2 = czib.b(height);
                    eijuVarI = (czibVar.x() ? czibVar.c(2) : eijx.e(null)).i(new eooz() { // from class: czhd
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            final czib czibVar2 = czibVar;
                            final int i = iB;
                            final int i2 = iB2;
                            return czibVar2.y.submit(eiid.l(new Callable() { // from class: czhq
                                @Override // java.util.concurrent.Callable
                                public final Object call() throws UnsupportedOperationException, IllegalStateException {
                                    String[] strArr = le.a;
                                    czib czibVar3 = czibVar2;
                                    Context context = czibVar3.z;
                                    Uri uriD = bxlf.d("mp4", context);
                                    String absolutePath = bxlf.h(uriD, context).getAbsolutePath();
                                    int i3 = 360 - czibVar3.n;
                                    ekrw ekrwVarN = czib.a.n();
                                    ekrwVarN.X(czld.e, absolutePath);
                                    ekrz ekrzVar = czld.b;
                                    int i4 = i;
                                    ekrwVarN.X(ekrzVar, Integer.valueOf(i4));
                                    ekrz ekrzVar2 = czld.c;
                                    int i5 = i2;
                                    ekrwVarN.X(ekrzVar2, Integer.valueOf(i5));
                                    int i6 = i3 % 360;
                                    ekrwVarN.X(czld.f, Integer.valueOf(i6));
                                    ((eksl) ekrwVarN.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "startVideoRecorder", 851, "CameraManager.java")).q("startRecording");
                                    czkd czkdVar2 = czibVar3.B;
                                    czkdVar2.getClass();
                                    euwp euwpVar = czkdVar2.a;
                                    euwpVar.a.o = i6;
                                    czjg czjgVar = czibVar3.C;
                                    czjgVar.getClass();
                                    boolean zBooleanValue = ((Boolean) czib.b.e()).booleanValue();
                                    euwi euwiVar = czjgVar.a;
                                    euwpVar.c(absolutePath, i4, i5, euwiVar.c, zBooleanValue);
                                    euwiVar.b();
                                    czig czigVar = czibVar3.g;
                                    if (czigVar == null) {
                                        throw new IllegalStateException("Camera preview must be registered before recording");
                                    }
                                    czigVar.b(euwpVar);
                                    czex czexVar = new czex();
                                    czexVar.d(uriD);
                                    czexVar.b = "video/mp4";
                                    czexVar.e(i4);
                                    czexVar.c(i5);
                                    czibVar3.f = czexVar;
                                    return null;
                                }
                            }));
                        }
                    }, eoqg.a);
                }
                eork.r(eijuVarI, auwc.a(new cqob(new Consumer() { // from class: czfd
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        czgf czgfVar2 = czgfVar;
                        czgfVar2.I.start();
                        TextView textView = czgfVar2.F;
                        czez czezVar = czgfVar2.T;
                        textView.setText(cqbj.a(czezVar.z(), 0L));
                        czgfVar2.D.setContentDescription(czezVar.z().getString(R.string.camera_stop_recording));
                        czgfVar2.a(true);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: czfe
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        czgf czgfVar2 = czgfVar;
                        czgfVar2.p = false;
                        czgfVar2.T.G().getWindow().clearFlags(128);
                        czgfVar2.z.setEnabled(true);
                        czgfVar2.z.aP(false);
                        ((eksl) ((eksl) ((eksl) czgf.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragmentPeer", "doStartVideoRecording", 943, "CameraFragmentPeer.java")).q("startVideoRecorder failed");
                        ((ains) czgfVar2.X.b()).c("Bugle.Camera.FullscreenCameraVideoCaptureFailed.Count");
                        czgfVar2.W.i(R.string.camera_video_capture_failure);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                })), czgfVar.V);
            }

            @Override // defpackage.crmf
            public final /* synthetic */ boolean c() {
                return true;
            }

            @Override // defpackage.crmf
            public final /* synthetic */ void a() {
            }
        });
    }

    public final void c() {
        eiju eijuVarD;
        if (this.I.isRunning()) {
            this.I.end();
        }
        if (i()) {
            this.x.b(null);
            this.T.G().getWindow().clearFlags(128);
            final czib czibVar = this.g;
            if (czibVar.w()) {
                czig czigVar = czibVar.g;
                if (czigVar != null) {
                    czigVar.b(null);
                }
                if (czibVar.r) {
                    czibVar.m("off");
                }
                eiju eijuVarG = eijx.g(new Callable() { // from class: czhp
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws IllegalStateException, InterruptedException {
                        czib czibVar2 = czibVar;
                        czibVar2.o();
                        czibVar2.i("VideoStop.ogg");
                        czjd czjdVar = czibVar2.f;
                        if (czjdVar == null) {
                            throw new IllegalStateException("Tried to stop video recording after video tear-down.");
                        }
                        Context context = czibVar2.z;
                        Uri uri = ((czex) czjdVar).a;
                        if (uri == null) {
                            throw new IllegalStateException("Property \"uri\" has not been set");
                        }
                        czjdVar.b(cqmz.b(context, uri));
                        czje czjeVarA = czjdVar.a();
                        czibVar2.f = null;
                        return czjeVarA;
                    }
                }, czibVar.y);
                czibVar.m = eijuVarG;
                eijuVarD = eijuVarG;
            } else {
                eijuVarD = eijx.d(new IllegalStateException("StopVideoRecorder called when not recording."));
            }
            eork.r(eijuVarD, auwc.a(new cqob(new czfa(this), new Consumer() { // from class: czff
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((eksl) ((eksl) ((eksl) czgf.a.i()).g((Throwable) obj)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragmentPeer", "doStopVideoRecording", 969, "CameraFragmentPeer.java")).q("stopVideoRecorder failed");
                    czgf czgfVar = this.a;
                    ((ains) czgfVar.X.b()).c("Bugle.Camera.FullscreenCameraVideoCaptureFailed.Count");
                    czgfVar.f(R.string.camera_video_capture_failure);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            })), this.V);
        }
        a(false);
        this.z.setEnabled(true);
        this.z.aP(false);
        this.D.setContentDescription(this.T.z().getString(R.string.camera_start_recording));
    }

    public final void d() {
        eiju eijuVarD;
        if (this.p) {
            return;
        }
        this.p = true;
        this.O = this.N;
        final czib czibVar = this.g;
        final boolean z = !czibVar.u() && this.o.a;
        if (z) {
            eijuVarD = czibVar.d(1.0f);
        } else if (czibVar.t.get()) {
            eijuVarD = eijx.d(new IllegalStateException("Camera must finish opening before taking a picture."));
        } else {
            czibVar.l.cancel(false);
            ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
            listenableFutureArr[0] = eiju.g(czibVar.s);
            listenableFutureArr[1] = czibVar.x() ? czibVar.c(0) : eijx.e(null);
            czibVar.l = eijx.k(listenableFutureArr).b(new eooy() { // from class: czgo
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final czib czibVar2 = czibVar;
                    return czibVar2.y.submit(eiid.l(new Callable() { // from class: czgt
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws IOException {
                            czib czibVar3 = czibVar2;
                            Context context = czibVar3.z;
                            Uri uriD = bxlf.d("jpg", context);
                            FileOutputStream fileOutputStream = new FileOutputStream(bxlf.h(uriD, context));
                            try {
                                czig czigVar = czibVar3.g;
                                if (czigVar == null) {
                                    throw new IllegalStateException("Camera preview must be registered before taking picture");
                                }
                                Bitmap bitmap = czigVar.getBitmap();
                                if (!czibVar3.x()) {
                                    czibVar3.i("camera_click.ogg");
                                }
                                if (czibVar3.n != 0) {
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate(-czibVar3.n);
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                                    bitmap.recycle();
                                    bitmap = bitmapCreateBitmap;
                                }
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                                czex czexVar = new czex();
                                czexVar.b = "image/jpeg";
                                czexVar.b(0L);
                                czexVar.e(bitmap.getWidth());
                                czexVar.c(bitmap.getHeight());
                                czexVar.d(uriD);
                                czje czjeVarA = czexVar.a();
                                fileOutputStream.close();
                                return czjeVarA;
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    }));
                }
            }, eoqg.a);
            eijuVarD = czibVar.l;
        }
        eork.r(eijuVarD, auwc.a(new cqob(new czfa(this), new Consumer() { // from class: czfl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((eksl) ((eksl) ((eksl) czgf.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragmentPeer", "doTakePicture", 876, "CameraFragmentPeer.java")).q("doTakePicture failed");
                czgf czgfVar = this.a;
                ((ains) czgfVar.X.b()).c("Bugle.Camera.FullscreenCameraPhotoCaptureFailed.Count");
                czgfVar.f(R.string.camera_photo_capture_failure);
                if (z) {
                    czgfVar.g.k();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.V);
    }

    public final void e() {
        this.m.run();
    }

    public final void f(int i) {
        this.W.i(i);
        this.p = false;
    }

    public final void g(int i) {
        czez czezVar = this.T;
        if (czezVar.G() == null || !czezVar.aF()) {
            return;
        }
        czezVar.G().setRequestedOrientation(i);
    }

    public final void h(int i) {
        int iRound;
        czez czezVar = this.T;
        if (czezVar.G() == null || this.h.a || craf.e(czezVar.G(), this.U.a) || (iRound = ((int) (Math.round(i / 90.0f) * 90.0f)) % 360) == this.N) {
            return;
        }
        int i2 = (360 - iRound) % 360;
        if (Math.abs(i2 - this.P) > 180) {
            i2 += NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY;
        }
        this.P = i2;
        this.N = iRound;
        final czir czirVar = this.s;
        czirVar.b = Integer.valueOf(iRound);
        cqdq.d(new Runnable() { // from class: cziq
            @Override // java.lang.Runnable
            public final void run() {
                czir czirVar2 = czirVar;
                Object obj = czirVar2.b;
                obj.getClass();
                czirVar2.a.z(obj);
            }
        }, 500L);
    }

    public final boolean i() {
        return this.g.w();
    }

    public final void k(czgd czgdVar, final int i) {
        if (this.j != czgdVar) {
            if (i != 0) {
                Context contextZ = this.T.z();
                czgd czgdVar2 = czgd.PHOTO;
                cpga.e(contextZ.getString(czgdVar.d), this.z);
                aiqk aiqkVar = this.ae;
                final int iM = m(this.j);
                final int iM2 = m(czgdVar);
                final int i2 = true != this.g.u() ? 3 : 2;
                final int iJ = j(this.N);
                aiqkVar.k(new Supplier() { // from class: aiqi
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        emrz emrzVar = (emrz) emsb.a.createBuilder();
                        emrzVar.copyOnWrite();
                        emsb emsbVar = (emsb) emrzVar.instance;
                        emsbVar.c = iM - 1;
                        emsbVar.b |= 1;
                        emrzVar.copyOnWrite();
                        emsb emsbVar2 = (emsb) emrzVar.instance;
                        emsbVar2.d = iM2 - 1;
                        emsbVar2.b |= 2;
                        emrzVar.copyOnWrite();
                        emsb emsbVar3 = (emsb) emrzVar.instance;
                        emsbVar3.e = i - 1;
                        emsbVar3.b |= 4;
                        emrzVar.copyOnWrite();
                        emsb emsbVar4 = (emsb) emrzVar.instance;
                        emsbVar4.f = i2 - 1;
                        emsbVar4.b |= 8;
                        emrzVar.copyOnWrite();
                        emsb emsbVar5 = (emsb) emrzVar.instance;
                        emsbVar5.g = iJ - 1;
                        emsbVar5.b |= 16;
                        return (emsb) emrzVar.build();
                    }
                });
            }
            this.j = czgdVar;
            this.z.at(czgdVar.ordinal());
            int iOrdinal = this.j.ordinal();
            if (iOrdinal == 0) {
                l(this.J, this.R, false);
                this.E.setImageTintList(this.q);
            } else if (iOrdinal == 1) {
                l(this.K, this.R, false);
                this.E.setImageTintList(this.r);
            }
            this.D.setContentDescription(this.T.z().getString(czgdVar.e));
        }
    }
}
