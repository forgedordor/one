package defpackage;

import android.content.Context;
import android.os.Trace;
import android.view.View;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.view.PreviewView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmtr extends dmiz {
    private static final azg D;
    static final /* synthetic */ fdeh[] u;
    public static final ekrg v;
    public azg A;
    public final PreviewView B;
    public final vun C;
    private final Context E;
    private final ea F;
    private final dngc G;
    private bwg H;
    private bdr I;
    private fdkf J;
    private final fctc K;
    private final View L;
    private final View M;
    private final View N;
    private final View O;
    private final View P;
    private final fdcz Q;
    public final fdjx w;
    public final dnhb x;
    public final dmiv y;
    public final fdap z;

    static {
        fdbv fdbvVar = new fdbv(dmtr.class, "miniCameraMode", "getMiniCameraMode()Lcom/google/android/libraries/compose/cameragallery/ui/camera/CameraConfiguration$MiniCameraMode;", 0);
        int i = fdcj.a;
        u = new fdeh[]{fdbvVar};
        azg azgVar = azg.b;
        azgVar.getClass();
        D = azgVar;
        v = ekrg.c("com/google/android/libraries/compose/cameragallery/ui/camera/mini/MiniCameraViewHolder");
    }

    public dmtr(Context context, ea eaVar, final dmpx dmpxVar, dngc dngcVar, fdjx fdjxVar, Optional optional, dnhb dnhbVar, View view, dmiv dmivVar, fdap fdapVar) {
        super(view);
        this.E = context;
        this.F = eaVar;
        this.G = dngcVar;
        this.w = fdjxVar;
        this.x = dnhbVar;
        this.y = dmivVar;
        this.z = fdapVar;
        this.C = (vun) fdct.b(optional);
        this.K = fctd.a(new fdae() { // from class: dmtj
            @Override // defpackage.fdae
            public final Object invoke() {
                dmpx dmpxVar2 = dmpxVar;
                Context context2 = (Context) dmpxVar2.a.b();
                context2.getClass();
                Executor executor = (Executor) dmpxVar2.b.b();
                executor.getClass();
                ((eony) dmpxVar2.c.b()).getClass();
                Executor executor2 = (Executor) dmpxVar2.d.b();
                executor2.getClass();
                fdjx fdjxVar2 = (fdjx) dmpxVar2.e.b();
                fdjxVar2.getClass();
                Optional optional2 = (Optional) dmpxVar2.f.b();
                dndk dndkVar = (dndk) dmpxVar2.g.b();
                dndkVar.getClass();
                dolm dolmVar = (dolm) dmpxVar2.h.b();
                dolmVar.getClass();
                dmiv dmivVar2 = this.y;
                dmivVar2.getClass();
                return new dmpw(context2, executor, executor2, fdjxVar2, optional2, dndkVar, dolmVar, dmivVar2);
            }
        });
        this.A = D;
        View viewFindViewById = view.findViewById(R.id.open_fullscreen_camera_button);
        viewFindViewById.getClass();
        this.L = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.mini_camera_indicator);
        viewFindViewById2.getClass();
        this.M = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.mini_camera_indicator_overlay);
        viewFindViewById3.getClass();
        this.N = viewFindViewById3;
        PreviewView previewView = (PreviewView) view.findViewById(R.id.mini_camera_preview_view);
        previewView.d(2);
        this.B = previewView;
        View viewFindViewById4 = view.findViewById(R.id.flip_camera_button);
        viewFindViewById4.getClass();
        this.O = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.shutter_button);
        viewFindViewById5.getClass();
        this.P = viewFindViewById5;
        this.Q = new dmtp(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dmiz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmtr.C(fcxy):java.lang.Object");
    }

    @Override // defpackage.dmiz
    public final void D(dmiu dmiuVar) {
        this.Q.d(u[0], dmiuVar);
    }

    @Override // defpackage.dmiz
    public final Object E() {
        fdkf fdkfVar = this.J;
        if (fdkfVar != null) {
            fdkfVar.t(null);
        }
        this.J = null;
        bwg bwgVar = this.H;
        if (bwgVar != null) {
            bwgVar.a();
        }
        return fctx.a;
    }

    public final dmiu F() {
        return (dmiu) this.Q.c(u[0]);
    }

    public final dmpw G() {
        return (dmpw) this.K.a();
    }

    public final void H(boolean z) {
        bdr bdrVar = null;
        if (!z) {
            bwg bwgVar = this.H;
            if (bwgVar == null) {
                fdbq.c("cameraProvider");
                bwgVar = null;
            }
            bdr bdrVar2 = this.I;
            if (bdrVar2 == null) {
                fdbq.c("cameraPreviewUseCase");
                bdrVar2 = null;
            }
            bdrVar2.getClass();
            for (Object obj : bwgVar.b.d.b()) {
                obj.getClass();
                if (((LifecycleCamera) obj).f(bdrVar2)) {
                    return;
                }
            }
        }
        bwg bwgVar2 = this.H;
        if (bwgVar2 == null) {
            fdbq.c("cameraProvider");
            bwgVar2 = null;
        }
        bwgVar2.a();
        bwg bwgVar3 = this.H;
        if (bwgVar3 == null) {
            fdbq.c("cameraProvider");
            bwgVar3 = null;
        }
        ea eaVar = this.F;
        azg azgVar = this.A;
        bdr[] bdrVarArr = new bdr[2];
        bdr bdrVar3 = this.I;
        if (bdrVar3 == null) {
            fdbq.c("cameraPreviewUseCase");
        } else {
            bdrVar = bdrVar3;
        }
        bdrVarArr[0] = bdrVar;
        bdrVarArr[1] = G().e;
        eaVar.getClass();
        azgVar.getClass();
        bwb bwbVar = bwgVar3.b;
        bdr[] bdrVarArr2 = (bdr[]) Arrays.copyOf(bdrVarArr, 2);
        bdrVarArr2.getClass();
        plm.a("CX:bindToLifecycle");
        try {
            bwbVar.e();
            bwbVar.b(1);
            bwb.d(bwbVar, eaVar, azgVar, new bbr(fcur.K(bdrVarArr2)));
        } finally {
            Trace.endSection();
        }
    }

    public final void I(int i) {
        eg egVarG = this.F.G();
        if (egVarG != null) {
            dphh.b(egVarG, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 8
            if (r6 == 0) goto L2b
            bwg r2 = r5.H
            if (r2 == 0) goto L2b
            azg r3 = defpackage.azg.a
            r3.getClass()
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto L2b
            bwg r2 = r5.H
            if (r2 != 0) goto L1e
            java.lang.String r2 = "cameraProvider"
            defpackage.fdbq.c(r2)
            r2 = 0
        L1e:
            azg r3 = defpackage.azg.b
            r3.getClass()
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto L2b
            r2 = r0
            goto L2c
        L2b:
            r2 = r1
        L2c:
            android.view.View r3 = r5.O
            r3.setVisibility(r2)
            android.view.View r2 = r5.P
            r3 = 1
            if (r3 == r6) goto L38
            r4 = r1
            goto L39
        L38:
            r4 = r0
        L39:
            r2.setVisibility(r4)
            android.view.View r2 = r5.L
            r2.setVisibility(r4)
            android.view.View r2 = r5.M
            if (r3 == r6) goto L46
            goto L47
        L46:
            r0 = r1
        L47:
            r2.setVisibility(r0)
            android.view.View r6 = r5.N
            r6.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmtr.J(boolean):void");
    }
}
