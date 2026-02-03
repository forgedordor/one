package com.google.android.apps.messaging.cloudstore.accounts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.accounts.FiAccountActivity;
import defpackage.a;
import defpackage.ahhk;
import defpackage.ahkn;
import defpackage.ahnh;
import defpackage.aoot;
import defpackage.appb;
import defpackage.aukz;
import defpackage.czqf;
import defpackage.czqg;
import defpackage.dydw;
import defpackage.efxf;
import defpackage.eg;
import defpackage.egld;
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
import defpackage.einc;
import defpackage.einf;
import defpackage.einp;
import defpackage.ejwl;
import defpackage.emce;
import defpackage.emck;
import defpackage.emeh;
import defpackage.emej;
import defpackage.emek;
import defpackage.eyhb;
import defpackage.fcsu;
import defpackage.iy;
import defpackage.lvc;
import defpackage.lvn;
import defpackage.tmd;
import defpackage.tme;
import defpackage.tmf;
import defpackage.tmg;
import defpackage.tmn;
import defpackage.tru;
import defpackage.tsc;
import defpackage.tsd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FiAccountActivity extends tmn implements ehlg, ehld, ehnq {
    private tmd L;
    private boolean N;
    private Context O;
    private lvn Q;
    private boolean R;
    private final eibp M = new eibp(this, this);
    private final long P = SystemClock.elapsedRealtime();

    private final tmd M() {
        N();
        return this.L;
    }

    private final void N() {
        if (this.L != null) {
            return;
        }
        if (!this.N) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.R && !isFinishing()) {
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
                    if (!(activity instanceof FiAccountActivity)) {
                        throw new IllegalStateException(a.L(activity, tmd.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    FiAccountActivity fiAccountActivity = (FiAccountActivity) activity;
                    fiAccountActivity.getClass();
                    final eg egVar = (eg) ((ahhk) objBb).g.b();
                    ejwl.l(egVar instanceof iy);
                    egld egldVar = new egld(new fcsu() { // from class: egle
                        @Override // defpackage.fcsu
                        public final Object b() {
                            eg egVar2 = egVar;
                            dydh dydhVarA = egks.a(egVar2.a());
                            iy iyVar = (iy) egVar2;
                            String str = dydw.a;
                            fr frVarA = iyVar.a();
                            iyVar.getClass();
                            return new dydx(frVarA, dydhVarA, iyVar, dyej.a(iyVar, dyei.class)).a();
                        }
                    });
                    efxf efxfVar = (efxf) ((ahhk) objBb).x.b();
                    czqg czqgVar = new czqg();
                    ahkn ahknVar = ((ahhk) objBb).b;
                    appb appbVarR = ahknVar.b.R();
                    ahnh ahnhVar = ahknVar.a;
                    this.L = new tmd(fiAccountActivity, egldVar, efxfVar, czqgVar, appbVarR, (aukz) ahnhVar.Iz.b(), (aoot) ahnhVar.HL.b());
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

    @Override // defpackage.aiic
    protected final int C() {
        return R.layout.base_toolbar_settings_activity_gm3;
    }

    @Override // defpackage.ehld
    public final long D() {
        return this.P;
    }

    @Override // defpackage.cukp
    public final /* synthetic */ eyhb E() {
        return new ehoe(this);
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return tmd.class;
    }

    @Override // defpackage.aiic
    protected final Integer G() {
        M();
        return null;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        tmd tmdVar = this.L;
        if (tmdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.R) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return tmdVar;
    }

    @Override // defpackage.cukc
    protected final boolean I() {
        return false;
    }

    @Override // defpackage.hl, defpackage.lvj
    public final lvc P() {
        if (this.Q == null) {
            this.Q = new ehnr(this);
        }
        return this.Q;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.O;
        }
        einp.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.iy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.O = context;
        einp.a(context);
        super.attachBaseContext(context);
        this.O = null;
    }

    @Override // defpackage.ecdl, android.app.Activity
    public final void finish() {
        eifp eifpVarA = this.M.a();
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
        eifp eifpVarK = this.M.k();
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
        eifp eifpVarR = this.M.r();
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
        eifp eifpVarB = this.M.b();
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
        eifp eifpVarC = this.M.c();
        try {
            super.onBackPressed();
            M().a.c().d();
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
        eifp eifpVarS = this.M.s();
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

    /* JADX WARN: Type inference failed for: r4v2, types: [ehoa, java.lang.Object] */
    @Override // defpackage.aiic, defpackage.cukn, defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        eibp eibpVar = this.M;
        eifp eifpVarT = eibpVar.t();
        try {
            this.N = true;
            N();
            ((ehnr) P()).h(eibpVar);
            bb().at().a();
            super.onCreate(bundle);
            final tmd tmdVarM = M();
            egld egldVar = tmdVarM.b;
            if (egldVar.b == null) {
                egldVar.b = (dydw) egldVar.a.b();
            }
            FiAccountActivity fiAccountActivity = tmdVarM.a;
            Intent intent = fiAccountActivity.getIntent();
            if (intent.hasExtra("entry_point")) {
                tmdVarM.h = emck.a(intent.getIntExtra("entry_point", 1));
            } else {
                tmdVarM.h = true != intent.getBooleanExtra("started_from_growthkit_flow", false) ? 2 : 3;
            }
            if (bundle != null) {
                tmdVarM.g = bundle.getBoolean("loggedImpressionKey", false);
            }
            czqg czqgVar = tmdVarM.e;
            new czqf(fiAccountActivity, new Runnable() { // from class: tmc
                @Override // java.lang.Runnable
                public final void run() {
                    tmd tmdVar = tmdVarM;
                    if (tmdVar.h == 3) {
                        FiAccountActivity fiAccountActivity2 = tmdVar.a;
                        Toast.makeText(fiAccountActivity2, fiAccountActivity2.getString(R.string.fi_growthkit_flow_cancelled_message), 1).show();
                    }
                }
            });
            einc.a(this).b = findViewById(android.R.id.content);
            tmd tmdVar = this.L;
            einf.a(this, tsd.class, new tme(tmdVar));
            einf.a(this, tru.class, new tmf(tmdVar));
            einf.a(this, tsc.class, new tmg(tmdVar));
            this.N = false;
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
        eifp eifpVarU = this.M.u();
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
        eifp eifpVarD = this.M.d();
        try {
            super.onDestroy();
            this.R = true;
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
        eifp eifpVarE = this.M.e(intent);
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

    @Override // defpackage.cukf, defpackage.ecdl, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        eifp eifpVarW = this.M.w();
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
        eifp eifpVarF = this.M.f();
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
        eifp eifpVarX = this.M.x();
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
        eifp eifpVarY = this.M.y();
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
        eifp eifpVarG = this.M.g();
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
        eifp eifpVarZ = this.M.z();
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

    @Override // defpackage.ecdl, android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        M().c.a();
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.ecdl, defpackage.eg, android.app.Activity
    protected final void onResume() {
        eifp eifpVarH = this.M.h();
        try {
            super.onResume();
            tmd tmdVarM = M();
            if (!tmdVarM.g) {
                tmdVarM.g = true;
                aukz aukzVar = tmdVarM.d;
                int i = tmdVarM.h;
                emeh emehVar = (emeh) emej.a.createBuilder();
                emehVar.copyOnWrite();
                emej emejVar = (emej) emehVar.instance;
                emejVar.c = 1;
                emejVar.b = 1 | emejVar.b;
                emehVar.copyOnWrite();
                emej emejVar2 = (emej) emehVar.instance;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                emejVar2.d = i2;
                emejVar2.b |= 2;
                emej emejVar3 = (emej) emehVar.build();
                emce emceVar = (emce) emek.a.createBuilder();
                emceVar.copyOnWrite();
                emek emekVar = (emek) emceVar.instance;
                emejVar3.getClass();
                emekVar.g = emejVar3;
                emekVar.b |= 16;
                aukzVar.q((emek) emceVar.build());
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
        eifp eifpVarA = this.M.A();
        try {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("loggedImpressionKey", M().g);
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
        eifp eifpVarI = this.M.i();
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
        eifp eifpVarJ = this.M.j();
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
        eifp eifpVarL = this.M.l();
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
