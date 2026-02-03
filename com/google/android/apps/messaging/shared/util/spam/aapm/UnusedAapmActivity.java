package com.google.android.apps.messaging.shared.util.spam.aapm;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.crxr;
import defpackage.crxs;
import defpackage.crxt;
import defpackage.ehld;
import defpackage.ehlf;
import defpackage.ehlg;
import defpackage.ehnq;
import defpackage.ehnr;
import defpackage.ehoe;
import defpackage.eibp;
import defpackage.eidc;
import defpackage.eifp;
import defpackage.eiid;
import defpackage.einp;
import defpackage.eyhb;
import defpackage.lvc;
import defpackage.lvn;
import defpackage.lwu;
import defpackage.lyp;
import defpackage.lys;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UnusedAapmActivity extends crxr implements ehlg, ehld, ehnq {
    public crxt o;
    public boolean p;
    public boolean q;
    private Context s;
    private lvn u;
    private final eibp r = new eibp(this, this);
    private final long t = SystemClock.elapsedRealtime();

    public UnusedAapmActivity() {
        x(new crxs(this));
    }

    @Override // defpackage.ehld
    public final long D() {
        return this.t;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return crxt.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        crxt crxtVar = this.o;
        if (crxtVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.q) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return crxtVar;
    }

    @Override // defpackage.hl, defpackage.lvj
    public final lvc P() {
        if (this.u == null) {
            this.u = new ehnr(this);
        }
        return this.u;
    }

    @Override // defpackage.abi, defpackage.luv
    public final lyp T() {
        lys lysVar = new lys(super.T());
        lysVar.b(lwu.c, new Bundle());
        return lysVar;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.s;
        }
        einp.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.s = context;
        einp.a(context);
        super.attachBaseContext(context);
        this.s = null;
    }

    @Override // android.app.Activity
    public final void finish() {
        eifp eifpVarA = this.r.a();
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

    @Override // android.app.Activity
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

    @Override // defpackage.crxr
    public final /* synthetic */ eyhb k() {
        return new ehoe(this);
    }

    @Override // defpackage.eg, defpackage.abi, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        eifp eifpVarR = this.r.r();
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        eifp eifpVarB = this.r.b();
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

    @Override // defpackage.abi, android.app.Activity
    public final void onBackPressed() {
        eifp eifpVarC = this.r.c();
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

    @Override // defpackage.abi, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        eifp eifpVarS = this.r.s();
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

    @Override // defpackage.crxr, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        eibp eibpVar = this.r;
        eifp eifpVarT = eibpVar.t();
        try {
            this.p = true;
            ((ehnr) P()).h(eibpVar);
            super.onCreate(bundle);
            this.p = false;
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
        eifp eifpVarU = this.r.u();
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

    @Override // defpackage.crxr, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        eifp eifpVarD = this.r.d();
        try {
            super.onDestroy();
            this.q = true;
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

    @Override // defpackage.eg, defpackage.abi, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        eifp eifpVarV = this.r.v();
        try {
            boolean zOnMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            eifpVarV.close();
            return zOnMenuItemSelected;
        } catch (Throwable th) {
            try {
                eifpVarV.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.abi, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        eifp eifpVarE = this.r.e(intent);
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

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        eifp eifpVarW = this.r.w();
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

    @Override // defpackage.eg, android.app.Activity
    protected final void onPause() {
        eifp eifpVarF = this.r.f();
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
        eifp eifpVarX = this.r.x();
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

    @Override // android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        eifp eifpVarY = this.r.y();
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

    @Override // defpackage.eg, android.app.Activity
    protected final void onPostResume() {
        eifp eifpVarG = this.r.g();
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

    @Override // android.app.Activity
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

    @Override // defpackage.eg, defpackage.abi, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        eifp eifpVarZ = this.r.z();
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

    @Override // defpackage.eg, android.app.Activity
    protected final void onResume() {
        eifp eifpVarH = this.r.h();
        try {
            super.onResume();
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

    @Override // defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        eifp eifpVarA = this.r.A();
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

    @Override // defpackage.eg, android.app.Activity
    protected final void onStart() {
        eifp eifpVarI = this.r.i();
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

    @Override // defpackage.eg, android.app.Activity
    protected final void onStop() {
        eifp eifpVarJ = this.r.j();
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

    @Override // android.app.Activity
    public final void onUserInteraction() {
        eifp eifpVarL = this.r.l();
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

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (ehlf.a(intent, getApplicationContext())) {
            eiid.n(intent);
        }
        super.startActivity(intent);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (ehlf.a(intent, getApplicationContext())) {
            eiid.n(intent);
        }
        super.startActivity(intent, bundle);
    }
}
