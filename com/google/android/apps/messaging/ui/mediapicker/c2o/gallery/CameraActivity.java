package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import defpackage.a;
import defpackage.ahhk;
import defpackage.ahkn;
import defpackage.cg;
import defpackage.cogw;
import defpackage.cqaz;
import defpackage.cqdq;
import defpackage.craf;
import defpackage.crma;
import defpackage.cuhe;
import defpackage.cyza;
import defpackage.cyzb;
import defpackage.czao;
import defpackage.czez;
import defpackage.czgc;
import defpackage.czgf;
import defpackage.czie;
import defpackage.ehld;
import defpackage.ehlf;
import defpackage.ehlg;
import defpackage.ehnq;
import defpackage.ehnr;
import defpackage.ehoe;
import defpackage.eibp;
import defpackage.eidc;
import defpackage.eieu;
import defpackage.eifp;
import defpackage.eiid;
import defpackage.eiiy;
import defpackage.einp;
import defpackage.eksp;
import defpackage.emsl;
import defpackage.emsp;
import defpackage.eyhb;
import defpackage.eyhj;
import defpackage.lvc;
import defpackage.lvn;
import defpackage.srw;
import defpackage.tlt;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CameraActivity extends czao implements ehlg, ehld, ehnq {
    private cyzb K;
    private boolean M;
    private Context N;
    private lvn P;
    private boolean Q;
    private final eibp L = new eibp(this, this);
    private final long O = SystemClock.elapsedRealtime();

    private final cyzb ag() {
        ah();
        return this.K;
    }

    private final void ah() {
        if (this.K != null) {
            return;
        }
        if (!this.M) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.Q && !isFinishing()) {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        eieu eieuVarK = eiiy.k("CreateComponent");
        try {
            bb();
            eieuVarK.close();
            eieuVarK = eiiy.k("CreatePeer");
            try {
                try {
                    Object objBb = bb();
                    Activity activity = (Activity) ((ahhk) objBb).d.b();
                    if (!(activity instanceof CameraActivity)) {
                        throw new IllegalStateException(a.L(activity, cyzb.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    CameraActivity cameraActivity = (CameraActivity) activity;
                    cameraActivity.getClass();
                    ahkn ahknVar = ((ahhk) objBb).b;
                    this.K = new cyzb(cameraActivity, (cogw) ahknVar.cD.b(), ((ahhk) objBb).h, (crma) ahknVar.da.b(), Optional.of(new Object() { // from class: czie
                    }), (tlt) ((ahhk) objBb).n.b(), (srw) ahknVar.a.aaX.b());
                    eieuVarK.close();
                    this.K.i = this;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            } finally {
            }
        } finally {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    @Override // defpackage.ehld
    public final long D() {
        return this.O;
    }

    @Override // defpackage.cukp
    public final /* synthetic */ eyhb E() {
        return new ehoe(this);
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cyzb.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        cyzb cyzbVar = this.K;
        if (cyzbVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.Q) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cyzbVar;
    }

    @Override // defpackage.cukc
    protected final boolean I() {
        return false;
    }

    @Override // defpackage.cyvb
    protected final emsp M() {
        ag();
        return emsp.CAMERA;
    }

    @Override // defpackage.cyvb
    protected final Class N() {
        ag();
        return GalleryContentItem.class;
    }

    @Override // defpackage.hl, defpackage.lvj
    public final lvc P() {
        if (this.P == null) {
            this.P = new ehnr(this);
        }
        return this.P;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.N;
        }
        einp.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.iy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.N = context;
        einp.a(context);
        super.attachBaseContext(context);
        this.N = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056 A[RETURN] */
    @Override // defpackage.ecdl, defpackage.iy, defpackage.hl, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            cyzb r0 = r5.ag()
            czez r1 = r0.f
            r1.H()
            czez r1 = r0.f
            czgf r1 = r1.H()
            int r2 = r6.getAction()
            r3 = 1
            if (r2 == 0) goto L17
            goto L4e
        L17:
            int r2 = r6.getKeyCode()
            r4 = 24
            if (r2 == r4) goto L23
            r4 = 25
            if (r2 != r4) goto L4e
        L23:
            czgd r2 = r1.j
            int r2 = r2.ordinal()
            if (r2 == 0) goto L46
            if (r2 == r3) goto L2e
            goto L4e
        L2e:
            boolean r2 = r1.i()
            if (r2 != 0) goto L3c
            boolean r2 = r1.p
            if (r2 != 0) goto L3c
            r1.b()
            return r3
        L3c:
            boolean r2 = r1.i()
            if (r2 == 0) goto L4e
            r1.c()
            return r3
        L46:
            boolean r2 = r1.p
            if (r2 != 0) goto L4e
            r1.d()
            goto L58
        L4e:
            com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraActivity r0 = r0.i
            boolean r6 = super.dispatchKeyEvent(r6)
            if (r6 != 0) goto L58
            r6 = 0
            return r6
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.cukf, defpackage.cukc
    public final cuhe fa() {
        ag();
        return cuhe.d;
    }

    @Override // defpackage.ecdl, android.app.Activity
    public final void finish() {
        eifp eifpVarA = this.L.a();
        try {
            super.finish();
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.iy
    public final boolean hb() {
        eifp eifpVarK = this.L.k();
        try {
            boolean zHb = super.hb();
            eifpVarK.close();
            return zHb;
        } catch (Throwable th) {
            try {
                eifpVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.iy, android.app.Activity
    public final void invalidateOptionsMenu() {
        eifp eifpVarK = eidc.k();
        try {
            super.invalidateOptionsMenu();
            eifpVarK.close();
        } catch (Throwable th) {
            try {
                eifpVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdl, defpackage.eg, defpackage.abi, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        eifp eifpVarR = this.L.r();
        try {
            super.onActivityResult(i, i2, intent);
            eifpVarR.close();
        } catch (Throwable th) {
            try {
                eifpVarR.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdl, android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        eifp eifpVarB = this.L.b();
        try {
            super.onAttachedToWindow();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdl, defpackage.abi, android.app.Activity
    public final void onBackPressed() {
        eifp eifpVarC = this.L.c();
        try {
            super.onBackPressed();
            eifpVarC.close();
        } catch (Throwable th) {
            try {
                eifpVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdl, defpackage.iy, defpackage.abi, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        eifp eifpVarS = this.L.s();
        try {
            super.onConfigurationChanged(configuration);
            eifpVarS.close();
        } catch (Throwable th) {
            try {
                eifpVarS.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ehoa, java.lang.Object] */
    @Override // defpackage.cyvb, defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        eibp eibpVar = this.L;
        eifp eifpVarT = eibpVar.t();
        try {
            this.M = true;
            ah();
            ((ehnr) P()).h(eibpVar);
            bb().at().a();
            super.onCreate(bundle);
            final cyzb cyzbVarAg = ag();
            if (cyzbVarAg.b.d()) {
                tlt tltVar = cyzbVarAg.e;
                CameraActivity cameraActivity = cyzbVarAg.a;
                tltVar.a = cameraActivity.getIntent().getBooleanExtra("is_bubble_activity", false);
                cameraActivity.setContentView(R.layout.activity_camera);
                Runnable runnable = new Runnable() { // from class: cyyx
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zBooleanValue = ((Boolean) cyzf.b.e()).booleanValue();
                        cyzb cyzbVar = cyzbVarAg;
                        if (!zBooleanValue) {
                            cyzbVar.b();
                        }
                        cyzbVar.a();
                    }
                };
                czie czieVar = cyzbVarAg.h;
                eksp ekspVar = czgf.a;
                czez czezVar = new czez();
                eyhj.e(czezVar);
                czezVar.a.c(new czgc(czezVar, cyzbVarAg, runnable));
                cyzbVarAg.f = czezVar;
                cg cgVar = new cg(cameraActivity.a());
                cgVar.s(R.id.activity_camera_view_container, cyzbVarAg.f);
                cgVar.c();
                cqaz.i(cameraActivity.k());
                Window window = cameraActivity.getWindow();
                if (window != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.rotationAnimation = 1;
                    window.setAttributes(attributes);
                }
                cyzbVarAg.g = new cyza(cyzbVarAg);
                cameraActivity.c().b(cameraActivity, cyzbVarAg.g);
                cameraActivity.af(emsl.LOADED);
            } else {
                cyzbVarAg.a();
            }
            this.M = false;
            eibpVar.m();
            eifpVarT.close();
        } catch (Throwable th) {
            try {
                eifpVarT.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.abi, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        eifp eifpVarU = this.L.u();
        try {
            super.onCreatePanelMenu(i, menu);
            eifpVarU.close();
            return true;
        } catch (Throwable th) {
            try {
                eifpVarU.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cukp, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        eifp eifpVarD = this.L.d();
        try {
            super.onDestroy();
            this.Q = true;
            eifpVarD.close();
        } catch (Throwable th) {
            try {
                eifpVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdl, defpackage.abi, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        eifp eifpVarE = this.L.e(intent);
        try {
            super.onNewIntent(intent);
            eifpVarE.close();
        } catch (Throwable th) {
            try {
                eifpVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cyvb, defpackage.cukf, defpackage.ecdl, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        eifp eifpVarW = this.L.w();
        try {
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            eifpVarW.close();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            try {
                eifpVarW.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.ecdl, defpackage.eg, android.app.Activity
    protected final void onPause() {
        eifp eifpVarF = this.L.f();
        try {
            super.onPause();
            eifpVarF.close();
        } catch (Throwable th) {
            try {
                eifpVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.abi, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        eifp eifpVarX = this.L.x();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            eifpVarX.close();
        } catch (Throwable th) {
            try {
                eifpVarX.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdl, defpackage.iy, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        eifp eifpVarY = this.L.y();
        try {
            super.onPostCreate(bundle);
            eifpVarY.close();
        } catch (Throwable th) {
            try {
                eifpVarY.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onPostResume() {
        eifp eifpVarG = this.L.g();
        try {
            super.onPostResume();
            eifpVarG.close();
        } catch (Throwable th) {
            try {
                eifpVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cukf, defpackage.ecdl, android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        eifp eifpVarK = eidc.k();
        try {
            boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            eifpVarK.close();
            return zOnPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                eifpVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.eg, defpackage.abi, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        eifp eifpVarZ = this.L.z();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            eifpVarZ.close();
        } catch (Throwable th) {
            try {
                eifpVarZ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.ecdl, defpackage.eg, android.app.Activity
    protected final void onResume() {
        eifp eifpVarH = this.L.h();
        try {
            super.onResume();
            final cyzb cyzbVarAg = ag();
            if (craf.e(cyzbVarAg.a, cyzbVarAg.e.a)) {
                cqdq.c(new Runnable() { // from class: cyyw
                    @Override // java.lang.Runnable
                    public final void run() {
                        cyzb cyzbVar = cyzbVarAg;
                        Toast.makeText(cyzbVar.a, R.string.camera_fullscreen_does_not_work_in_split_screen, 1).show();
                        cyzbVar.a();
                    }
                }, 100L);
            }
            eifpVarH.close();
        } catch (Throwable th) {
            try {
                eifpVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        eifp eifpVarA = this.L.A();
        try {
            super.onSaveInstanceState(bundle);
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStart() {
        eifp eifpVarI = this.L.i();
        try {
            super.onStart();
            eifpVarI.close();
        } catch (Throwable th) {
            try {
                eifpVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStop() {
        eifp eifpVarJ = this.L.j();
        try {
            super.onStop();
            eifpVarJ.close();
        } catch (Throwable th) {
            try {
                eifpVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdl, android.app.Activity
    public final void onUserInteraction() {
        eifp eifpVarL = this.L.l();
        try {
            super.onUserInteraction();
            eifpVarL.close();
        } catch (Throwable th) {
            try {
                eifpVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdl, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (ehlf.a(intent, getApplicationContext())) {
            eiid.n(intent);
        }
        super.startActivity(intent);
    }

    @Override // defpackage.ecdl, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (ehlf.a(intent, getApplicationContext())) {
            eiid.n(intent);
        }
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.iy
    protected final void r() {
    }

    @Override // defpackage.iy
    protected final void s() {
    }
}
