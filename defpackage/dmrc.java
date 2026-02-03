package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import j$.util.Objects;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrc implements dmra {
    private final chx a;
    private jfw b;
    private bzh c;

    public dmrc(chx chxVar) {
        chxVar.getClass();
        this.a = chxVar;
    }

    @Override // defpackage.dmra
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.dmra
    public final Bitmap b() {
        PreviewView previewView;
        Bitmap bitmapA;
        jfw jfwVar = this.b;
        if (jfwVar == null || (previewView = (PreviewView) jfwVar.a) == null) {
            return null;
        }
        box.b();
        cir cirVar = previewView.a;
        if (cirVar == null || (bitmapA = cirVar.a()) == null) {
            return null;
        }
        cig cigVar = cirVar.c;
        FrameLayout frameLayout = cirVar.b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!cigVar.f()) {
            return bitmapA;
        }
        Matrix matrixD = cigVar.d();
        RectF rectFE = cigVar.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapA.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / cigVar.a.getWidth(), rectFE.height() / cigVar.a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapA, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    @Override // defpackage.dmra
    public final azg c() {
        box.b();
        return this.a.a;
    }

    @Override // defpackage.dmra
    public final lvv d() {
        return this.a.f();
    }

    @Override // defpackage.dmra
    public final void e(lvj lvjVar) {
        lvjVar.getClass();
        box.b();
        chx chxVar = this.a;
        chxVar.C = lvjVar;
        chxVar.l();
    }

    @Override // defpackage.dmra
    public final void f() {
        box.b();
        chx chxVar = this.a;
        cit citVar = chxVar.n;
        if (citVar != null) {
            citVar.d();
        }
        chxVar.x.clear();
        chxVar.l();
    }

    @Override // defpackage.dmra
    public final void g(azg azgVar) {
        box.b();
        final chx chxVar = this.a;
        if (chxVar.a == azgVar) {
            return;
        }
        Integer numB = azgVar.b();
        if (chxVar.d.b() == 3 && numB != null && numB.intValue() != 0) {
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
        final azg azgVar2 = chxVar.a;
        chxVar.a = azgVar;
        cit citVar = chxVar.n;
        if (citVar == null) {
            return;
        }
        citVar.c(chxVar.c, chxVar.d, chxVar.g, chxVar.h);
        chxVar.m(new Runnable() { // from class: chp
            @Override // java.lang.Runnable
            public final void run() {
                chxVar.a = azgVar2;
            }
        });
    }

    @Override // defpackage.dmra
    public final void h(Set set) {
        box.b();
        chx chxVar = this.a;
        Set set2 = chxVar.x;
        if (Objects.equals(set2, set)) {
            return;
        }
        cit citVar = chxVar.n;
        if (citVar != null) {
            citVar.d();
        }
        set2.clear();
        set2.addAll(set);
        chxVar.l();
    }

    @Override // defpackage.dmra
    public final void i(final int i) {
        box.b();
        final chx chxVar = this.a;
        final int i2 = chxVar.b;
        if (i == i2) {
            return;
        }
        chxVar.b = i;
        if (!chxVar.w() && chxVar.u()) {
            box.b();
            bzh bzhVar = chxVar.i;
            if (bzhVar != null) {
                bzhVar.close();
                chxVar.i(chxVar.i);
            }
        }
        chxVar.m(new Runnable() { // from class: cho
            @Override // java.lang.Runnable
            public final void run() {
                chu chuVar = chxVar;
                int i3 = i2;
                chuVar.b = i3;
                bbs.f("CameraController", "setEnabledUseCases: failed to enable use cases properly for enabledUseCases = " + Integer.toBinaryString(i) + ", restoring back previous values " + Integer.toBinaryString(i3));
            }
        });
    }

    @Override // defpackage.dmra
    public final void j(int i) {
        this.a.k(i);
    }

    @Override // defpackage.dmra
    public final void k(Executor executor) {
        box.b();
        chx chxVar = this.a;
        if (chxVar.f == executor) {
            return;
        }
        chxVar.f = executor;
        chxVar.o(Integer.valueOf(chxVar.b()));
        chxVar.l();
    }

    @Override // defpackage.dmra
    public final void l(bvc bvcVar) {
        box.b();
        chx chxVar = this.a;
        if (chxVar.e == bvcVar) {
            return;
        }
        chxVar.e = bvcVar;
        chxVar.o(Integer.valueOf(chxVar.b()));
        chxVar.l();
    }

    @Override // defpackage.dmra
    public final void m(jfw jfwVar) {
        jfwVar.getClass();
        Object obj = jfwVar.a;
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        chx chxVar = this.a;
        PreviewView previewView = (PreviewView) obj;
        box.b();
        chu chuVar = previewView.g;
        if (chuVar != null && chuVar != chxVar) {
            chuVar.h();
            previewView.g();
        }
        previewView.g = chxVar;
        previewView.b(false);
        bbd bbdVar = previewView.b.a;
        previewView.g();
        this.b = jfwVar;
    }

    @Override // defpackage.dmra
    public final void n(bxs bxsVar) {
        bxsVar.getClass();
        box.b();
        chx chxVar = this.a;
        chxVar.k = bxsVar;
        chxVar.p();
        chxVar.l();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dmra
    public final void o(bxf bxfVar, cka ckaVar, Executor executor, final fdap fdapVar) {
        long j;
        char c;
        byz byzVarG;
        byz byzVar;
        byz byzVar2;
        bzh bzhVar;
        ckaVar.getClass();
        lbz lbzVar = new lbz() { // from class: dmrb
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                Object dmrdVar;
                cav cavVar = (cav) obj;
                cavVar.getClass();
                if (cavVar instanceof cat) {
                    dmrdVar = dmrg.a;
                } else if (cavVar instanceof car) {
                    dmrdVar = dmre.a;
                } else if (cavVar instanceof cas) {
                    dmrdVar = dmrf.a;
                } else if (cavVar instanceof cau) {
                    dmrdVar = dmrh.a;
                } else {
                    if (cavVar instanceof caq) {
                        caq caqVar = (caq) cavVar;
                        Integer numValueOf = Integer.valueOf(caqVar.a);
                        numValueOf.intValue();
                        dmrdVar = new dmrd(true == caqVar.a() ? numValueOf : null, caqVar.b);
                    } else {
                        dmrdVar = null;
                    }
                }
                if (dmrdVar != null) {
                    fdapVar.invoke(dmrdVar);
                }
            }
        };
        box.b();
        chx chxVar = this.a;
        lcg.d(chxVar.s(), "Camera not initialized.");
        lcg.d(chxVar.w(), "VideoCapture disabled.");
        lcg.d(!chxVar.u(), "Recording video. Only one recording can be active at a time.");
        Context context = chxVar.y;
        chs chsVar = new chs(chxVar, kxj.e(context), lbzVar);
        bxm bxmVar = new bxm(context, (bzf) chxVar.h.a(), bxfVar);
        if (kya.b(context, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
        }
        Context context2 = bxmVar.c;
        if (kya.b(context2, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        final bzf bzfVar = bxmVar.a;
        lcg.d(bzfVar.z(), "The Recorder this recording is associated to doesn't support audio.");
        bxmVar.f = true;
        bxmVar.e = executor;
        bxmVar.d = chsVar;
        synchronized (bzfVar.i) {
            j = bzfVar.p + 1;
            bzfVar.p = j;
            switch (bzfVar.l) {
                case CONFIGURING:
                case IDLING:
                case STOPPING:
                case RESETTING:
                case ERROR:
                    bze bzeVar = bzfVar.l;
                    bze bzeVar2 = bze.IDLING;
                    if (bzeVar == bzeVar2) {
                        lcg.d(bzfVar.n == null && bzfVar.o == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                    }
                    try {
                        byzVarG = byz.g(bxmVar, j);
                    } catch (IOException e) {
                        e = e;
                        c = 5;
                    }
                    if (!byzVarG.e.getAndSet(true)) {
                        bxk bxkVar = ((bwv) byzVarG).a;
                        boolean z = bxkVar instanceof bxf;
                        final ParcelFileDescriptor parcelFileDescriptorDup = z ? ((bwp) ((bxf) bxkVar).a).b.dup() : null;
                        byzVarG.d.c("finalizeRecording");
                        byzVarG.f.set(new bys(bxkVar, parcelFileDescriptorDup));
                        if (((bwv) byzVarG).b) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                byzVarG.g.set(new byw(byzVarG, context2));
                            } else {
                                byzVarG.g.set(new byx(byzVarG));
                            }
                        }
                        lbz lbzVar2 = z ? new lbz() { // from class: byt
                            @Override // defpackage.lbz
                            public final void accept(Object obj) throws IOException {
                                try {
                                    parcelFileDescriptorDup.close();
                                } catch (IOException e2) {
                                    bbs.d("Recorder", "Failed to close dup'd ParcelFileDescriptor", e2);
                                }
                            }
                        } : null;
                        if (lbzVar2 != null) {
                            byzVarG.h.set(lbzVar2);
                        }
                        bzfVar.o = byzVarG;
                        bze bzeVar3 = bzfVar.l;
                        if (bzeVar3 == bzeVar2) {
                            bzfVar.p(bze.PENDING_RECORDING);
                            bzfVar.h.execute(new Runnable() { // from class: byb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z2;
                                    byz byzVarD;
                                    int i;
                                    byz byzVar3;
                                    Throwable th;
                                    bzf bzfVar2 = bzfVar;
                                    synchronized (bzfVar2.i) {
                                        bbs.a("Recorder", "tryServicePendingRecording on state: " + bzfVar2.l);
                                        int iOrdinal = bzfVar2.l.ordinal();
                                        boolean z3 = true;
                                        z2 = false;
                                        byzVarD = null;
                                        if (iOrdinal != 1) {
                                            if (iOrdinal != 2) {
                                                i = 0;
                                                byzVar3 = null;
                                            }
                                            th = byzVar3;
                                        } else {
                                            z3 = false;
                                        }
                                        if (bzfVar2.ad == 3) {
                                            byz byzVar4 = bzfVar2.o;
                                            bzfVar2.o = null;
                                            bzfVar2.m();
                                            byzVar3 = byzVar4;
                                            i = 4;
                                            z2 = z3;
                                            th = bzf.c;
                                        } else {
                                            if (bzfVar2.n != null || bzfVar2.U) {
                                                bbs.f("Recorder", "PendingRecording is not handled, active recording = " + bzfVar2.n + ", need reset flag = " + bzfVar2.U);
                                            } else {
                                                if (bzfVar2.D != null) {
                                                    byzVar3 = null;
                                                    byzVarD = bzfVar2.d(bzfVar2.l);
                                                    i = 0;
                                                }
                                                z2 = z3;
                                                th = byzVar3;
                                            }
                                            i = 0;
                                            byzVar3 = null;
                                            z2 = z3;
                                            th = byzVar3;
                                        }
                                    }
                                    if (byzVarD != null) {
                                        bzfVar2.s(byzVarD, z2);
                                    } else if (byzVar3 != null) {
                                        bzfVar2.j(byzVar3, i, th);
                                    }
                                }
                            });
                        } else if (bzeVar3 == bze.ERROR) {
                            bzfVar.p(bze.PENDING_RECORDING);
                            bzfVar.h.execute(new Runnable() { // from class: byc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bzf bzfVar2 = bzfVar;
                                    bdp bdpVar = bzfVar2.x;
                                    if (bdpVar == null) {
                                        throw new AssertionError("surface request is required to retry initialization.");
                                    }
                                    bzfVar2.B(bdpVar, bzfVar2.ab, false);
                                }
                            });
                        } else {
                            bzfVar.p(bze.PENDING_RECORDING);
                        }
                        e = null;
                        c = 0;
                        byzVar2 = null;
                        break;
                    } else {
                        throw new AssertionError(a.h(byzVarG, "Recording ", " has already been initialized"));
                    }
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    byzVar = bzfVar.o;
                    lcg.i(byzVar);
                    byzVar2 = byzVar;
                    e = null;
                    c = 0;
                    break;
                case RECORDING:
                case PAUSED:
                    byzVar = bzfVar.n;
                    byzVar2 = byzVar;
                    e = null;
                    c = 0;
                    break;
                default:
                    e = null;
                    c = 0;
                    byzVar2 = null;
                    break;
            }
        }
        if (byzVar2 != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (c != 0) {
            java.util.Objects.toString(e);
            bbs.c("Recorder", "Recording was started when the Recorder had encountered error ".concat(String.valueOf(e)));
            bzfVar.j(byz.g(bxmVar, j), 5, e);
            bzhVar = new bzh(bxmVar.a, j, bxmVar.b, true);
        } else {
            bzhVar = new bzh(bxmVar.a, j, bxmVar.b, false);
        }
        chxVar.j.put(chsVar, bzhVar);
        chxVar.i = bzhVar;
        this.c = bzhVar;
    }

    @Override // defpackage.dmra
    public final void p() {
        bzh bzhVar = this.c;
        if (bzhVar != null) {
            bzhVar.close();
        }
        this.c = null;
    }

    @Override // defpackage.dmra
    public final void q(bbb bbbVar, Executor executor, bba bbaVar) {
        box.b();
        chx chxVar = this.a;
        lcg.d(chxVar.s(), "Camera not initialized.");
        lcg.d(chxVar.t(), "ImageCapture disabled.");
        if (chxVar.a() == 3) {
            if (chxVar.e() != null) {
                bbd bbdVar = chxVar.e().b;
            }
            throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
        }
        if (chxVar.a.b() != null) {
            baz bazVar = bbbVar.b;
            if (!bazVar.b) {
                bazVar.a(chxVar.a.b().intValue() == 0);
            }
        }
        chxVar.d.s(bbbVar, executor, bbaVar);
    }

    @Override // defpackage.dmra
    public final void r() {
        box.b();
        chx chxVar = this.a;
        chxVar.C = null;
        chxVar.m = null;
        cit citVar = chxVar.n;
        if (citVar != null) {
            citVar.d();
        }
    }

    @Override // defpackage.dmra
    public final boolean s(azg azgVar) {
        box.b();
        cit citVar = this.a.n;
        if (citVar == null) {
            throw new IllegalStateException("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
        }
        try {
            return citVar.e(azgVar);
        } catch (aze e) {
            bbs.g("CameraController", "Failed to check camera availability", e);
            return false;
        }
    }

    @Override // defpackage.dmra
    public final boolean t() {
        return this.a.u();
    }

    @Override // defpackage.dmra
    public final void u() {
        box.b();
        chx chxVar = this.a;
        if (chxVar.d.a == 1) {
            return;
        }
        chxVar.o(1);
        chxVar.l();
    }

    @Override // defpackage.dmra
    public final void v() {
        box.b();
        this.a.r = true;
    }

    @Override // defpackage.dmra
    public final void w() {
        box.b();
        chx chxVar = this.a;
        chxVar.l = 2;
        chxVar.p();
        chxVar.l();
    }

    @Override // defpackage.dmra
    public final void x(float f) {
        this.a.g(f).getClass();
    }
}
