package com.google.android.libraries.compose.cameragallery.ui.camera.inapp;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import defpackage.dmjl;
import defpackage.dmjm;
import defpackage.dmjn;
import defpackage.dmjo;
import defpackage.dmjq;
import defpackage.dmjs;
import defpackage.dmju;
import defpackage.dmpe;
import defpackage.dmpn;
import defpackage.dngy;
import defpackage.dnhb;
import defpackage.dpxm;
import defpackage.eg;
import defpackage.fctc;
import defpackage.fctd;
import defpackage.fcva;
import defpackage.fdae;
import defpackage.fdbi;
import defpackage.fdbq;
import defpackage.fdcj;
import defpackage.fdil;
import defpackage.fdjx;
import defpackage.hxd;
import defpackage.lxf;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CameraActivity extends dmpn {
    public static final List n = fcva.g(dngy.a, dngy.g);
    public eg o;
    public dnhb p;
    public fdjx q;
    public Optional r;
    public ComposeView s;
    public View t;
    private final fctc v = fctd.a(new fdae() { // from class: dmjh
        @Override // defpackage.fdae
        public final Object invoke() {
            View rootView = this.a.getWindow().getDecorView().getRootView();
            rootView.getClass();
            return new dpxm(rootView);
        }
    });

    public CameraActivity() {
        fctd.a(new fdae() { // from class: dmji
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional = this.a.r;
                if (optional == null) {
                    fdbq.c("providedFullScreenCameraContentConfiguration");
                    optional = null;
                }
                optional.isPresent();
                return optional.get();
            }
        });
    }

    public static final dmpe k(fctc fctcVar) {
        return (dmpe) fctcVar.a();
    }

    public final eg j() {
        eg egVar = this.o;
        if (egVar != null) {
            return egVar;
        }
        fdbq.c("activity");
        return null;
    }

    public final dnhb l() {
        dnhb dnhbVar = this.p;
        if (dnhbVar != null) {
            return dnhbVar;
        }
        fdbq.c("permissionsManager");
        return null;
    }

    public final dpxm m() {
        return (dpxm) this.v.a();
    }

    public final fdjx n() {
        fdjx fdjxVar = this.q;
        if (fdjxVar != null) {
            return fdjxVar;
        }
        fdbq.c("uiScope");
        return null;
    }

    public final void o() {
        ComposeView composeView = this.s;
        ComposeView composeView2 = null;
        if (composeView == null) {
            fdbq.c("cameraComposeView");
            composeView = null;
        }
        composeView.setVisibility(0);
        eg egVarJ = j();
        dmjm dmjmVar = new dmjm(egVarJ);
        int i = fdcj.a;
        lxf lxfVar = new lxf(new fdbi(dmpe.class), new dmjn(egVarJ), dmjmVar, new dmjo(egVarJ));
        fdil.d(n(), null, null, new dmjq(lxfVar, this, null), 3);
        fdil.d(n(), null, null, new dmjs(lxfVar, this, null), 3);
        ComposeView composeView3 = this.s;
        if (composeView3 == null) {
            fdbq.c("cameraComposeView");
        } else {
            composeView2 = composeView3;
        }
        composeView2.a(new hxd(-1228945405, true, new dmju(lxfVar)));
    }

    @Override // defpackage.dmpn, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTheme().applyStyle(R.style.Theme_GoogleMaterial3_Dark, true);
        if (Build.VERSION.SDK_INT >= 31) {
            getTheme().applyStyle(R.style.ThemeOverlay_GoogleMaterial3_DynamicColors_Dark, true);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController windowInsetsController = getWindow().getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.hide(WindowInsets.Type.statusBars());
            }
        } else {
            getWindow().getDecorView().setSystemUiVisibility(4);
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        setContentView(R.layout.camera_activity);
        this.s = (ComposeView) findViewById(R.id.camera_compose_view);
        this.t = findViewById(R.id.error_prompt);
        getWindow().addFlags(128);
    }

    @Override // defpackage.eg, android.app.Activity
    protected final void onResume() {
        super.onResume();
        fdil.d(n(), null, null, new dmjl(this, null), 3);
    }
}
