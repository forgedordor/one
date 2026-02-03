package com.google.android.apps.messaging.lighterconversation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.a;
import defpackage.afdv;
import defpackage.afdy;
import defpackage.afei;
import defpackage.ahhk;
import defpackage.ahkn;
import defpackage.ahng;
import defpackage.ahnh;
import defpackage.dztc;
import defpackage.efxf;
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
public final class LaunchLighterConversationActivity extends afdv implements ehlg, ehld, ehnq {
    private afei o;
    private boolean q;
    private Context r;
    private lvn t;
    private boolean u;
    private final eibp p = new eibp(this, this);
    private final long s = SystemClock.elapsedRealtime();

    public LaunchLighterConversationActivity() {
        x(new afdy(this));
    }

    private final afei m() {
        l();
        return this.o;
    }

    @Override // defpackage.ehld
    public final long D() {
        return this.s;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return afei.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        afei afeiVar = this.o;
        if (afeiVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return afeiVar;
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.r = context;
        einp.a(context);
        super.attachBaseContext(context);
        this.r = null;
    }

    @Override // android.app.Activity
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

    @Override // defpackage.afdv
    public final /* synthetic */ eyhb k() {
        return new ehoe(this);
    }

    public final void l() {
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
                    if (!(activity instanceof LaunchLighterConversationActivity)) {
                        throw new IllegalStateException(a.L(activity, afei.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    LaunchLighterConversationActivity launchLighterConversationActivity = (LaunchLighterConversationActivity) activity;
                    launchLighterConversationActivity.getClass();
                    efxf efxfVar = (efxf) ((ahhk) objBb).x.b();
                    ahkn ahknVar = ((ahhk) objBb).b;
                    ahnh ahnhVar = ahknVar.a;
                    eyik eyikVar = ahnhVar.tE;
                    ahng ahngVar = ahknVar.b;
                    this.o = new afei(launchLighterConversationActivity, efxfVar, eyikVar, ahngVar.nd, ahnhVar.ajK, ahnhVar.ajN, ahknVar.p, ahnhVar.vh, ahngVar.nA, ahngVar.kq);
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

    @Override // defpackage.eg, defpackage.abi, android.app.Activity
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

    @Override // android.app.Activity, android.view.Window.Callback
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

    @Override // defpackage.abi, android.app.Activity
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

    @Override // defpackage.abi, android.app.Activity, android.content.ComponentCallbacks
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:3:0x0007, B:5:0x0020, B:31:0x0087, B:6:0x002d, B:8:0x0035, B:9:0x0040, B:11:0x004c, B:12:0x0057, B:29:0x0081, B:30:0x0084), top: B:40:0x0007 }] */
    @Override // defpackage.afdv, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            eibp r0 = r8.p
            eifp r1 = r0.t()
            r2 = 1
            r8.q = r2     // Catch: java.lang.Throwable -> L90
            lvc r3 = r8.P()     // Catch: java.lang.Throwable -> L90
            ehnr r3 = (defpackage.ehnr) r3     // Catch: java.lang.Throwable -> L90
            r3.h(r0)     // Catch: java.lang.Throwable -> L90
            super.onCreate(r9)     // Catch: java.lang.Throwable -> L90
            afei r9 = r8.m()     // Catch: java.lang.Throwable -> L90
            boolean r3 = defpackage.cdpn.a()     // Catch: java.lang.Throwable -> L90
            r4 = 0
            if (r3 != 0) goto L2d
            cqce r2 = defpackage.afei.b     // Catch: java.lang.Throwable -> L90
            java.lang.String r3 = "lighter is not enabled."
            r2.r(r3)     // Catch: java.lang.Throwable -> L90
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r9 = r9.c     // Catch: java.lang.Throwable -> L90
            r9.finish()     // Catch: java.lang.Throwable -> L90
            goto L87
        L2d:
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r3 = r9.c     // Catch: java.lang.Throwable -> L90
            android.content.Intent r5 = r3.getIntent()     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto L40
            cqce r9 = defpackage.afei.b     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "intent is null."
            r9.r(r2)     // Catch: java.lang.Throwable -> L90
            r3.finish()     // Catch: java.lang.Throwable -> L90
            goto L87
        L40:
            java.lang.String r6 = "EXPRESS_SIGN_IN_FLOW_KEY"
            r7 = 3
            r5.putExtra(r6, r7)     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r5.getAction()     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto L57
            cqce r9 = defpackage.afei.b     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "intent action is null."
            r9.r(r2)     // Catch: java.lang.Throwable -> L90
            r3.finish()     // Catch: java.lang.Throwable -> L90
            goto L87
        L57:
            int r3 = r5.hashCode()     // Catch: java.lang.Throwable -> L90
            r6 = -1908079756(0xffffffff8e450374, float:-2.4283787E-30)
            if (r3 == r6) goto L70
            r6 = 2634405(0x2832a5, float:3.691588E-39)
            if (r3 == r6) goto L66
            goto L7a
        L66:
            java.lang.String r3 = "VIEW"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L7a
            r3 = r2
            goto L7b
        L70:
            java.lang.String r3 = "com.google.business.ACTION_INITIATE_BUSINESS_CHAT"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L7a
            r3 = r4
            goto L7b
        L7a:
            r3 = -1
        L7b:
            if (r3 == 0) goto L84
            if (r3 == r2) goto L80
            goto L87
        L80:
            r2 = 2
            r9.l = r2     // Catch: java.lang.Throwable -> L90
            goto L87
        L84:
            r2 = 4
            r9.l = r2     // Catch: java.lang.Throwable -> L90
        L87:
            r8.q = r4     // Catch: java.lang.Throwable -> L90
            r0.m()     // Catch: java.lang.Throwable -> L90
            r1.close()
            return
        L90:
            r9 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L95
            goto L99
        L95:
            r0 = move-exception
            r9.addSuppressed(r0)
        L99:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity.onCreate(android.os.Bundle):void");
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

    @Override // defpackage.afdv, defpackage.eg, android.app.Activity
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

    @Override // defpackage.eg, defpackage.abi, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        eifp eifpVarV = this.p.v();
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
        eifp eifpVarE = this.p.e(intent);
        try {
            super.onNewIntent(intent);
            afei afeiVarM = m();
            afei.b.m("launch express sign in with new intent.");
            afeiVarM.j = true;
            intent.putExtra("EXPRESS_SIGN_IN_FLOW_KEY", 3);
            afeiVarM.c.setIntent(intent);
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

    @Override // defpackage.eg, android.app.Activity
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

    @Override // android.app.Activity
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

    @Override // defpackage.eg, android.app.Activity
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

    @Override // defpackage.eg, android.app.Activity
    protected final void onResume() {
        eifp eifpVarH = this.p.h();
        try {
            super.onResume();
            afei afeiVarM = m();
            if (afeiVarM.j) {
                afeiVarM.j = false;
                afeiVarM.k = false;
                afeiVarM.f();
            } else if (afeiVarM.k) {
                if (((Boolean) afeiVarM.h.b()).booleanValue()) {
                    dztc.a.d(afei.a);
                }
                afeiVarM.c.finish();
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

    @Override // defpackage.abi, defpackage.hl, android.app.Activity
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

    @Override // defpackage.eg, android.app.Activity
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

    @Override // defpackage.eg, android.app.Activity
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

    @Override // android.app.Activity
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
