package com.google.android.apps.messaging.gaia.expresssignin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.a;
import defpackage.acax;
import defpackage.acbp;
import defpackage.ahhk;
import defpackage.ahkn;
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
import defpackage.eyhb;
import defpackage.eyik;
import defpackage.lvc;
import defpackage.lvn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BugleExpressSignInActivity extends acbp implements ehlg, ehld, ehnq {
    private acax o;
    private boolean q;
    private Context r;
    private lvn t;
    private boolean u;
    private final eibp p = new eibp(this, this);
    private final long s = SystemClock.elapsedRealtime();

    private final void E() {
        if (this.o != null) {
            return;
        }
        if (!this.q) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.u && !isFinishing()) {
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
                    if (!(activity instanceof BugleExpressSignInActivity)) {
                        throw new IllegalStateException(a.L(activity, acax.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    BugleExpressSignInActivity bugleExpressSignInActivity = (BugleExpressSignInActivity) activity;
                    bugleExpressSignInActivity.getClass();
                    eyik eyikVar = ((ahhk) objBb).P;
                    eyik eyikVar2 = ((ahhk) objBb).Q;
                    eyik eyikVar3 = ((ahhk) objBb).R;
                    eyik eyikVar4 = ((ahhk) objBb).S;
                    eyik eyikVar5 = ((ahhk) objBb).V;
                    eyik eyikVar6 = ((ahhk) objBb).W;
                    eyik eyikVar7 = ((ahhk) objBb).X;
                    eyik eyikVar8 = ((ahhk) objBb).Y;
                    eyik eyikVar9 = ((ahhk) objBb).Z;
                    eyik eyikVar10 = ((ahhk) objBb).aa;
                    eyik eyikVar11 = ((ahhk) objBb).ab;
                    ahkn ahknVar = ((ahhk) objBb).b;
                    this.o = new acax(bugleExpressSignInActivity, eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, eyikVar8, eyikVar9, eyikVar10, ahknVar.b.jU, ahknVar.a.Jm, ((ahhk) objBb).i);
                    eieuVarK.close();
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

    @Override // defpackage.acbp
    public final /* synthetic */ eyhb B() {
        return new ehoe(this);
    }

    @Override // defpackage.ehld
    public final long D() {
        return this.s;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return acax.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        acax acaxVar = this.o;
        if (acaxVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return acaxVar;
    }

    @Override // defpackage.hl, defpackage.lvj
    public final lvc P() {
        if (this.t == null) {
            this.t = new ehnr(this);
        }
        return this.t;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.r;
        }
        einp.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.iy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.r = context;
        einp.a(context);
        super.attachBaseContext(context);
        this.r = null;
    }

    @Override // defpackage.ecdl, android.app.Activity
    public final void finish() {
        eifp eifpVarA = this.p.a();
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
        eifp eifpVarK = this.p.k();
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
        eifp eifpVarR = this.p.r();
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
        eifp eifpVarB = this.p.b();
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
        eifp eifpVarC = this.p.c();
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
        eifp eifpVarS = this.p.s();
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

    /* JADX WARN: Removed duplicated region for block: B:60:0x01f0 A[Catch: all -> 0x0248, TryCatch #0 {all -> 0x0248, blocks: (B:3:0x000d, B:5:0x0059, B:25:0x010a, B:27:0x011c, B:29:0x0135, B:31:0x015a, B:38:0x016f, B:40:0x0177, B:43:0x0186, B:45:0x0193, B:47:0x0197, B:49:0x01a2, B:51:0x01b7, B:61:0x01fd, B:50:0x01ac, B:52:0x01bf, B:53:0x01c6, B:44:0x018f, B:54:0x01c7, B:56:0x01cf, B:57:0x01de, B:59:0x01e6, B:60:0x01f0, B:63:0x0206, B:64:0x0212, B:68:0x0223, B:71:0x0232, B:72:0x023e, B:8:0x006f, B:10:0x0083, B:12:0x0097, B:14:0x00aa, B:16:0x00bd, B:18:0x00d0, B:21:0x00e4, B:23:0x00f7, B:24:0x0108), top: B:82:0x000d }] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ehoa, java.lang.Object] */
    @Override // defpackage.acbp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.gaia.expresssignin.BugleExpressSignInActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.abi, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        eifp eifpVarU = this.p.u();
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

    @Override // defpackage.acbp, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        eifp eifpVarD = this.p.d();
        try {
            super.onDestroy();
            this.u = true;
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
        eifp eifpVarE = this.p.e(intent);
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

    @Override // defpackage.ecdl, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        eifp eifpVarW = this.p.w();
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

    @Override // defpackage.ecdl, defpackage.eg, android.app.Activity
    protected final void onPause() {
        eifp eifpVarF = this.p.f();
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
        eifp eifpVarX = this.p.x();
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
        eifp eifpVarY = this.p.y();
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
        eifp eifpVarG = this.p.g();
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

    @Override // defpackage.ecdl, android.app.Activity
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

    @Override // defpackage.ecdl, defpackage.eg, defpackage.abi, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        eifp eifpVarZ = this.p.z();
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

    @Override // defpackage.ecdl, defpackage.eg, android.app.Activity
    protected final void onResume() {
        eifp eifpVarH = this.p.h();
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

    @Override // defpackage.ecdl, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        eifp eifpVarA = this.p.A();
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

    @Override // defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStart() {
        eifp eifpVarI = this.p.i();
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

    @Override // defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStop() {
        eifp eifpVarJ = this.p.j();
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
        eifp eifpVarL = this.p.l();
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
