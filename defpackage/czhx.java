package defpackage;

import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czhx implements View.OnTouchListener {
    final /* synthetic */ czib a;

    public czhx(czib czibVar) {
        this.a = czibVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if ((motionEvent.getActionMasked() & 1) == 1) {
            czib czibVar = this.a;
            int width = view.getWidth();
            int height = view.getHeight();
            czkh czkhVar = czibVar.q;
            if (czkhVar.e != width || czkhVar.f != height) {
                czkhVar.e = width;
                czkhVar.f = height;
                czkhVar.d();
            }
            int x = ((int) motionEvent.getX()) + view.getLeft();
            int y = ((int) motionEvent.getY()) + view.getTop();
            czkq czkqVar = czkhVar.d;
            if (czkqVar != null && (i = czkhVar.a) != 2) {
                if (czkhVar.h != null && (i == 1 || i == 3 || i == 4)) {
                    czkhVar.b();
                }
                int iJ = czkqVar.j();
                int iJ2 = czkqVar.j();
                if (iJ != 0 && czkqVar.d - czkqVar.b != 0 && czkqVar.e - czkqVar.c != 0) {
                    int i2 = czkhVar.e;
                    int i3 = czkhVar.f;
                    if (czkhVar.b) {
                        if (czkhVar.h == null) {
                            czkhVar.h = new ArrayList();
                            czkhVar.h.add(new Camera.Area(new Rect(), 1));
                        }
                        czkhVar.a(iJ, iJ2, 1.0f, x, y, i2, i3, ((Camera.Area) czkhVar.h.get(0)).rect);
                    }
                    if (czkhVar.c) {
                        if (czkhVar.i == null) {
                            czkhVar.i = new ArrayList();
                            czkhVar.i.add(new Camera.Area(new Rect(), 1));
                        }
                        czkhVar.a(iJ, iJ2, 1.5f, x, y, i2, i3, ((Camera.Area) czkhVar.i.get(0)).rect);
                    }
                    czkqVar.i = x;
                    czkqVar.j = y;
                    czkqVar.k(x, y);
                    final czib czibVar2 = (czib) czkhVar.m;
                    czibVar2.f(new Consumer() { // from class: czgx
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            String str;
                            czib czibVar3 = czibVar2;
                            Camera camera = (Camera) obj;
                            try {
                                Camera.Parameters parameters = camera.getParameters();
                                czkh czkhVar2 = czibVar3.q;
                                Camera.Parameters parameters2 = czkhVar2.k;
                                if (parameters2 == null) {
                                    str = czkhVar2.j;
                                } else {
                                    List<String> supportedFocusModes = parameters2.getSupportedFocusModes();
                                    if (!czkhVar2.b || czkhVar2.h == null) {
                                        czkhVar2.j = "continuous-picture";
                                    } else {
                                        czkhVar2.j = "auto";
                                    }
                                    if (!czkh.f(czkhVar2.j, supportedFocusModes)) {
                                        if (czkh.f("auto", supportedFocusModes)) {
                                            czkhVar2.j = "auto";
                                        } else {
                                            czkhVar2.j = parameters2.getFocusMode();
                                        }
                                    }
                                    str = czkhVar2.j;
                                }
                                parameters.setFocusMode(str);
                                if (parameters.getMaxNumFocusAreas() > 0) {
                                    parameters.setFocusAreas(czkhVar2.h);
                                }
                                parameters.setMeteringAreas(czkhVar2.i);
                                camera.setParameters(parameters);
                            } catch (RuntimeException e) {
                                ((eksl) ((eksl) ((eksl) czib.a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "setFocusParameters", (char) 1313, "CameraManager.java")).q("RuntimeException in CameraManager setFocusParameters");
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    if (czkhVar.b) {
                        cqca.l("Bugle", "Start autofocus.");
                        czibVar2.f(new Consumer() { // from class: czhj
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                final czib czibVar3 = czibVar2;
                                try {
                                    ((Camera) obj).autoFocus(new Camera.AutoFocusCallback() { // from class: czhh
                                        @Override // android.hardware.Camera.AutoFocusCallback
                                        public final void onAutoFocus(final boolean z, Camera camera) {
                                            final czib czibVar4 = czibVar3;
                                            auwa.a(new Runnable() { // from class: czgy
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    czibVar4.q.g(z);
                                                }
                                            }, czibVar4.x);
                                        }
                                    });
                                } catch (RuntimeException e) {
                                    ((eksl) ((eksl) ((eksl) czib.a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "autoFocus", (char) 1265, "CameraManager.java")).q("RuntimeException in CameraManager.autoFocus");
                                    auwa.a(new Runnable() { // from class: czhi
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            czibVar3.q.g(false);
                                        }
                                    }, czibVar3.x);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        czkhVar.a = 1;
                        czkhVar.e();
                        czkhVar.l.removeMessages(0);
                    } else {
                        czkhVar.e();
                        Handler handler = czkhVar.l;
                        handler.removeMessages(0);
                        handler.sendEmptyMessageDelayed(0, 3000L);
                    }
                }
            }
        }
        return true;
    }
}
