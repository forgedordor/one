package com.google.android.apps.messaging.ui.ditto;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.abl;
import defpackage.abxb;
import defpackage.acif;
import defpackage.acik;
import defpackage.ackx;
import defpackage.ahhk;
import defpackage.ahho;
import defpackage.ahkn;
import defpackage.ahnh;
import defpackage.ains;
import defpackage.asgn;
import defpackage.ccze;
import defpackage.cqzr;
import defpackage.crqv;
import defpackage.cswm;
import defpackage.cukg;
import defpackage.cxcb;
import defpackage.cynq;
import defpackage.cyns;
import defpackage.cynt;
import defpackage.cynu;
import defpackage.cyot;
import defpackage.cyov;
import defpackage.cyqi;
import defpackage.efwo;
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
import defpackage.elie;
import defpackage.eyhb;
import defpackage.eyie;
import defpackage.eyik;
import defpackage.im;
import defpackage.lvc;
import defpackage.lvn;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DittoActivity extends cyov implements ehlg, ehld, ehnq {
    private boolean M;
    private Context N;
    private lvn P;
    private boolean Q;
    private cyns n;
    private final eibp L = new eibp(this, this);
    private final long O = SystemClock.elapsedRealtime();

    private final cyns M() {
        N();
        return this.n;
    }

    private final void N() {
        if (this.n != null) {
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
                    if (!(activity instanceof DittoActivity)) {
                        throw new IllegalStateException(a.L(activity, cyns.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    DittoActivity dittoActivity = (DittoActivity) activity;
                    dittoActivity.getClass();
                    ahkn ahknVar = ((ahhk) objBb).b;
                    ahnh ahnhVar = ahknVar.a;
                    eyik eyikVar = ahnhVar.apa;
                    ahho ahhoVar = ((ahhk) objBb).c;
                    this.n = new cyns(dittoActivity, eyikVar, eyie.a(ahhoVar.bV), ahnhVar.c, ahknVar.aT, ahnhVar.pd, ahhoVar.bA, ahnhVar.rO, ahknVar.oj, ((ahhk) objBb).x, ahnhVar.aow, ((ahhk) objBb).y, ahnhVar.adE);
                    eieuVarK.close();
                    this.n.p = this;
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
        return cyns.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        cyns cynsVar = this.n;
        if (cynsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.Q) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cynsVar;
    }

    @Override // defpackage.cukc
    protected final boolean I() {
        return false;
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
            cyns cynsVarM = M();
            if (i == 301) {
                if (i2 == -1) {
                    cyns.a.m("Ditto Battery de-optimization accepted.");
                    ((ains) cynsVarM.h.b()).c("Bugle.Ditto.Battery.Deoptimization.Accepted.Counts");
                } else {
                    cyns.a.m("Ditto Battery de-optimization rejected.");
                    ((ains) cynsVarM.h.b()).c("Bugle.Ditto.Battery.Deoptimization.Rejected.Counts");
                }
            }
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
    @Override // defpackage.cukn, defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        eibp eibpVar = this.L;
        eifp eifpVarT = eibpVar.t();
        try {
            this.M = true;
            N();
            ((ehnr) P()).h(eibpVar);
            bb().at().a();
            super.onCreate(bundle);
            cyns cynsVarM = M();
            if (!((Boolean) ccze.i.e()).booleanValue()) {
                cynsVarM.e.finish();
            }
            DittoActivity dittoActivity = cynsVarM.e;
            if (dittoActivity.getIntent().getBooleanExtra("started_from_notification", false)) {
                ((ains) cynsVarM.h.b()).c("Bugle.Ditto.Notification.Connected.Click");
            }
            if (bundle == null) {
                ((ains) cynsVarM.h.b()).c("Bugle.Ditto.Pairing.Seen");
            }
            boolean zA = ((asgn) cynsVarM.n.b()).a();
            if (zA) {
                abl.a(dittoActivity);
            }
            dittoActivity.setContentView(R.layout.ditto_activity_gm3);
            ViewGroup viewGroup = (ViewGroup) dittoActivity.findViewById(android.R.id.content);
            if (!zA) {
                viewGroup.setSystemUiVisibility(1280);
                dittoActivity.getWindow().setStatusBarColor(0);
            }
            ((crqv) cynsVarM.i.b()).h("ditto_has_seen_pairing_screen", true);
            im imVarK = dittoActivity.k();
            if (imVarK != null) {
                cukg.c(dittoActivity.getApplicationContext(), imVarK, R.string.qr_action_bar_device_pairing_title);
                imVarK.setDisplayHomeAsUpEnabled(true);
            }
            cynsVarM.c = dittoActivity.findViewById(R.id.appBarLayout);
            if (bundle != null) {
                cynsVarM.b = bundle.getInt("uistate");
                if (abxb.b()) {
                    cynsVarM.o = Optional.of((efwo) bundle.getParcelable("accountId"));
                }
            }
            cynsVarM.d = new cynq(cynsVarM);
            dittoActivity.c().b(dittoActivity, cynsVarM.d);
            if (!abxb.b()) {
                cynsVarM.b(Optional.empty());
            }
            einc.a(this).b = findViewById(android.R.id.content);
            cyns cynsVar = this.n;
            einf.a(this, cyqi.class, new cynt(cynsVar));
            einf.a(this, cyot.class, new cynu(cynsVar));
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

    @Override // defpackage.cukf, defpackage.ecdl, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        cyns cynsVarM = M();
        cynsVarM.e.getMenuInflater().inflate(R.menu.ditto_welcome_menu, menu);
        if (((Boolean) ackx.a.e()).booleanValue()) {
            menu.findItem(R.id.action_help_and_feedback).setVisible(false);
            menu.findItem(R.id.action_help).setVisible(true);
            menu.findItem(R.id.action_advanced_feedback).setVisible(true);
        }
        if (cynsVarM.k) {
            ((cxcb) cynsVarM.g.b()).c(menu.addSubMenu(0, 0, 1000, "Debug"));
        }
        cswm.a(menu);
        return true;
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

    @Override // defpackage.cukf, defpackage.ecdl, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        eifp eifpVarW = this.L.w();
        try {
            cyns cynsVarM = M();
            int itemId = menuItem.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId == R.id.action_help_and_feedback || itemId == R.id.action_help) {
                cynsVarM.a();
            } else if (itemId == R.id.action_advanced_feedback) {
                acif acifVar = (acif) cynsVarM.l.b();
                DittoActivity dittoActivity = cynsVarM.e;
                acik acikVar = new acik();
                acikVar.b(elie.BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU);
                acifVar.b(dittoActivity, acikVar.a());
            } else if (itemId == R.id.notification_settings) {
                DittoActivity dittoActivity2 = cynsVarM.e;
                cqzr cqzrVar = (cqzr) cynsVarM.j.b();
                cqzrVar.a();
                ((NotificationManager) cqzrVar.a.b()).getNotificationChannel("bugle_connected_to_web_channel_v1").getClass();
                Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.CHANNEL_ID", "bugle_connected_to_web_channel_v1");
                intent.putExtra("android.provider.extra.APP_PACKAGE", cqzrVar.b.getPackageName());
                eiid.o(dittoActivity2, intent);
            } else if (itemId == 16908332) {
                cynsVarM.e.c().d();
            } else {
                if (cynsVarM.k) {
                    ((cxcb) cynsVarM.g.b()).b(itemId, cynsVarM.e, cxcb.a);
                }
                zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            }
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.cukc, defpackage.ecdl, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        eifp eifpVarA = this.L.A();
        try {
            super.onSaveInstanceState(bundle);
            cyns cynsVarM = M();
            bundle.putInt("uistate", cynsVarM.b);
            if (abxb.b() && cynsVarM.o.isPresent()) {
                bundle.putParcelable("accountId", cynsVarM.o.get());
            }
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
