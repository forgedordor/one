package com.google.android.apps.messaging.datadonation.ui;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.aasc;
import defpackage.aasf;
import defpackage.aatg;
import defpackage.aath;
import defpackage.aati;
import defpackage.aatj;
import defpackage.aatk;
import defpackage.aatn;
import defpackage.aaum;
import defpackage.aauo;
import defpackage.aauy;
import defpackage.aava;
import defpackage.acgu;
import defpackage.ahhk;
import defpackage.ahkn;
import defpackage.cg;
import defpackage.cuhe;
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
import defpackage.elwr;
import defpackage.elws;
import defpackage.elwu;
import defpackage.elxc;
import defpackage.elxe;
import defpackage.elxf;
import defpackage.elxh;
import defpackage.eyhb;
import defpackage.eyhj;
import defpackage.eyik;
import defpackage.fcsu;
import defpackage.lvc;
import defpackage.lvj;
import defpackage.lvn;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DataDonationActivity extends aauo implements ehlg, ehld, ehnq {
    private aath n;
    private boolean p;
    private Context q;
    private lvn y;
    private boolean z;
    private final eibp o = new eibp(this, this);
    private final long r = SystemClock.elapsedRealtime();

    private final aath J() {
        K();
        return this.n;
    }

    private final void K() {
        if (this.n == null) {
            if (!this.p) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.z && !isFinishing()) {
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
                        eyik eyikVar = ((ahhk) objBb).G;
                        eyik eyikVar2 = ((ahhk) objBb).H;
                        ahkn ahknVar = ((ahhk) objBb).b;
                        this.n = new aath(eyikVar, eyikVar2, ahknVar.b.jL, ahknVar.a.ws);
                        eieuVarK.close();
                        this.n.f = this;
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } finally {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
    }

    @Override // defpackage.ehld
    public final long D() {
        return this.r;
    }

    @Override // defpackage.cukp
    public final /* synthetic */ eyhb E() {
        return new ehoe(this);
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return aath.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        aath aathVar = this.n;
        if (aathVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.z) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return aathVar;
    }

    @Override // defpackage.cukc
    protected final boolean I() {
        return false;
    }

    @Override // defpackage.hl, defpackage.lvj
    public final lvc P() {
        if (this.y == null) {
            this.y = new ehnr(this);
        }
        return this.y;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.q;
        }
        einp.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.iy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.q = context;
        einp.a(context);
        super.attachBaseContext(context);
        this.q = null;
    }

    @Override // defpackage.cukc
    protected final cuhe fa() {
        J();
        return cuhe.c;
    }

    @Override // defpackage.ecdl, android.app.Activity
    public final void finish() {
        eifp eifpVarA = this.o.a();
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
        eifp eifpVarK = this.o.k();
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
        eifp eifpVarR = this.o.r();
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
        eifp eifpVarB = this.o.b();
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
        eifp eifpVarC = this.o.c();
        try {
            super.onBackPressed();
            ((DataDonationActivity) J().a.b()).c().d();
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
        eifp eifpVarS = this.o.s();
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
    @Override // defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int iA;
        eibp eibpVar = this.o;
        eifp eifpVarT = eibpVar.t();
        try {
            this.p = true;
            K();
            ((ehnr) P()).h(eibpVar);
            bb().at().a();
            super.onCreate(bundle);
            aath aathVarJ = J();
            fcsu fcsuVar = aathVarJ.b;
            if (((aasc) ((Optional) fcsuVar.b()).get()).b()) {
                ((aasc) ((Optional) fcsuVar.b()).get()).a();
            }
            if (bundle == null) {
                aathVarJ.a(0, 0);
                cg cgVar = new cg(((DataDonationActivity) aathVarJ.a.b()).a());
                aatn aatnVar = new aatn();
                eyhj.e(aatnVar);
                cgVar.x(R.id.content, aatnVar, "dd_fragment_tag");
                cgVar.c();
            }
            fcsu fcsuVar2 = aathVarJ.a;
            Intent intent = ((DataDonationActivity) fcsuVar2.b()).getIntent();
            if (intent != null && (iA = elxe.a(intent.getIntExtra("DATA_DONATION_OPEN_SOURCE", 0))) != 1) {
                aasf aasfVar = (aasf) aathVarJ.c.b();
                elwr elwrVar = (elwr) elxh.a.createBuilder();
                elxc elxcVar = (elxc) elxf.a.createBuilder();
                elxcVar.copyOnWrite();
                elxf elxfVar = (elxf) elxcVar.instance;
                int i = iA - 1;
                if (iA == 0) {
                    throw null;
                }
                elxfVar.c = i;
                elxfVar.b |= 1;
                elwrVar.copyOnWrite();
                elxh elxhVar = (elxh) elwrVar.instance;
                elxf elxfVar2 = (elxf) elxcVar.build();
                elxfVar2.getClass();
                elxhVar.c = elxfVar2;
                elxhVar.b = 1;
                aasfVar.a(elwrVar);
            }
            ((acgu) aathVarJ.d.b()).a(19);
            ((DataDonationActivity) fcsuVar2.b()).c().b((lvj) fcsuVar2.b(), new aatg(aathVarJ));
            einc.a(this).b = findViewById(R.id.content);
            aath aathVar = this.n;
            einf.a(this, aauy.class, new aati(aathVar));
            einf.a(this, aava.class, new aatj(aathVar));
            einf.a(this, aaum.class, new aatk(aathVar));
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
        eifp eifpVarU = this.o.u();
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
        eifp eifpVarD = this.o.d();
        try {
            super.onDestroy();
            aath aathVarJ = J();
            aasf aasfVar = (aasf) aathVarJ.c.b();
            int i = aathVarJ.e;
            elwr elwrVar = (elwr) elxh.a.createBuilder();
            elws elwsVar = (elws) elwu.a.createBuilder();
            elwsVar.copyOnWrite();
            elwu elwuVar = (elwu) elwsVar.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            elwuVar.c = i2;
            elwuVar.b |= 1;
            elwrVar.copyOnWrite();
            elxh elxhVar = (elxh) elwrVar.instance;
            elwu elwuVar2 = (elwu) elwsVar.build();
            elwuVar2.getClass();
            elxhVar.c = elwuVar2;
            elxhVar.b = 4;
            aasfVar.a(elwrVar);
            this.z = true;
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
        eifp eifpVarE = this.o.e(intent);
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
        boolean zOnOptionsItemSelected;
        eifp eifpVarW = this.o.w();
        try {
            aath aathVarJ = J();
            if (menuItem.getItemId() == 16908332) {
                ((DataDonationActivity) aathVarJ.a.b()).c().d();
                zOnOptionsItemSelected = true;
            } else {
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

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.eg, android.app.Activity
    protected final void onPause() {
        eifp eifpVarF = this.o.f();
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
        eifp eifpVarX = this.o.x();
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
        eifp eifpVarY = this.o.y();
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
        eifp eifpVarG = this.o.g();
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

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.eg, defpackage.abi, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        eifp eifpVarZ = this.o.z();
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

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.eg, android.app.Activity
    protected final void onResume() {
        eifp eifpVarH = this.o.h();
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

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        eifp eifpVarA = this.o.A();
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

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStart() {
        eifp eifpVarI = this.o.i();
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

    @Override // defpackage.cukc, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStop() {
        eifp eifpVarJ = this.o.j();
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
        eifp eifpVarL = this.o.l();
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
