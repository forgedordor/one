package com.google.android.apps.messaging.main;

import android.R;
import android.app.Activity;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.a;
import defpackage.abww;
import defpackage.abxb;
import defpackage.acgx;
import defpackage.acom;
import defpackage.acrt;
import defpackage.afhw;
import defpackage.afic;
import defpackage.afjd;
import defpackage.afjl;
import defpackage.afjm;
import defpackage.afjn;
import defpackage.agbg;
import defpackage.ahhk;
import defpackage.ahho;
import defpackage.ahkn;
import defpackage.ahng;
import defpackage.ahnh;
import defpackage.apwj;
import defpackage.aqki;
import defpackage.crnp;
import defpackage.cuhe;
import defpackage.dssz;
import defpackage.dzfh;
import defpackage.dztc;
import defpackage.ea;
import defpackage.ehld;
import defpackage.ehlf;
import defpackage.ehlg;
import defpackage.ehnq;
import defpackage.ehnr;
import defpackage.ehoe;
import defpackage.eibp;
import defpackage.eidc;
import defpackage.eieh;
import defpackage.eieu;
import defpackage.eifp;
import defpackage.eigp;
import defpackage.eiid;
import defpackage.eiiy;
import defpackage.einc;
import defpackage.einf;
import defpackage.einp;
import defpackage.eyhb;
import defpackage.eyie;
import defpackage.eyik;
import defpackage.fczl;
import defpackage.fdap;
import defpackage.fdjx;
import defpackage.im;
import defpackage.lvc;
import defpackage.lvn;
import defpackage.sqw;
import defpackage.srp;
import defpackage.tlt;
import defpackage.ufg;
import defpackage.umn;
import defpackage.uok;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MainActivity extends afhw implements ehlg, ehld, ehnq {
    private boolean M;
    private Context N;
    private lvn P;
    private boolean Q;
    private afjl n;
    private final eibp L = new eibp(this, this);
    private final long O = SystemClock.elapsedRealtime();

    private final afjl ae() {
        af();
        return this.n;
    }

    private final void af() {
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
                    if (!(activity instanceof MainActivity)) {
                        throw new IllegalStateException(a.L(activity, afjl.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    MainActivity mainActivity = (MainActivity) activity;
                    mainActivity.getClass();
                    ahkn ahknVar = ((ahhk) objBb).b;
                    eyik eyikVar = ahknVar.cD;
                    eyik eyikVar2 = ((ahhk) objBb).ar;
                    ahnh ahnhVar = ahknVar.a;
                    eyik eyikVar3 = ahnhVar.Jm;
                    eyik eyikVar4 = ahnhVar.c;
                    eyik eyikVar5 = ((ahhk) objBb).at;
                    eyik eyikVar6 = ahknVar.hu;
                    ahng ahngVar = ahknVar.b;
                    eyik eyikVar7 = ahngVar.kI;
                    eyik eyikVar8 = ahnhVar.vh;
                    ahho ahhoVar = ((ahhk) objBb).c;
                    eyik eyikVar9 = ahhoVar.e;
                    eyik eyikVar10 = ahnhVar.Uk;
                    eyik eyikVar11 = ahnhVar.yw;
                    eyik eyikVar12 = ((ahhk) objBb).f;
                    eigp eigpVar = (eigp) ahknVar.aI.b();
                    eyik eyikVar13 = ((ahhk) objBb).ax;
                    tlt tltVar = (tlt) ((ahhk) objBb).n.b();
                    umn umnVar = (umn) ((ahhk) objBb).ay.b();
                    eyik eyikVar14 = ((ahhk) objBb).y;
                    eyik eyikVar15 = ((ahhk) objBb).aA;
                    Optional optionalOf = Optional.of(ahngVar.nB);
                    eyik eyikVar16 = ahngVar.c;
                    eyik eyikVar17 = ((ahhk) objBb).x;
                    sqw sqwVar = (sqw) ahngVar.mZ.b();
                    eyik eyikVar18 = ((ahhk) objBb).aC;
                    eyik eyikVar19 = ((ahhk) objBb).aD;
                    eyik eyikVar20 = ((ahhk) objBb).ao;
                    eyik eyikVar21 = ahknVar.cI;
                    eyik eyikVar22 = ahknVar.dz;
                    eyik eyikVar23 = ((ahhk) objBb).aJ;
                    eyik eyikVar24 = ((ahhk) objBb).ap;
                    eyik eyikVar25 = ((ahhk) objBb).E;
                    eyik eyikVar26 = ahngVar.aa;
                    eyik eyikVar27 = ((ahhk) objBb).ad;
                    eyik eyikVar28 = ((ahhk) objBb).aK;
                    eyik eyikVar29 = ahnhVar.HO;
                    Optional optionalEmpty = Optional.empty();
                    eyik eyikVar30 = ((ahhk) objBb).aL;
                    eyik eyikVar31 = ((ahhk) objBb).aN;
                    eyie.a(((ahhk) objBb).aO);
                    this.n = new afjl(mainActivity, eyikVar, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyikVar7, eyikVar8, eyikVar9, eyikVar10, eyikVar11, eyikVar12, eigpVar, eyikVar13, tltVar, umnVar, eyikVar14, optionalOf, eyikVar16, eyikVar17, sqwVar, eyikVar18, eyikVar19, eyikVar20, eyikVar21, eyikVar22, eyikVar23, eyikVar24, eyikVar25, eyikVar26, eyikVar27, eyikVar28, eyikVar29, optionalEmpty, eyikVar30, eyikVar31, Optional.empty(), ((ahhk) objBb).aP, ((ahhk) objBb).af, ahngVar.jd, (fdjx) ahnhVar.oS.b(), ahhoVar.aF, ahnhVar.aaV, ahngVar.nD, ahngVar.ko, ahngVar.mv, ahngVar.nE, ahngVar.nF, ahnhVar.qa, ahnhVar.Xm, ahnhVar.adE, ahngVar.jy, (apwj) ahngVar.nG.b(), ahnhVar.vR, ahnhVar.MX, ahngVar.jo);
                    eieuVarK.close();
                    this.n.O = this;
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
        return afjl.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        afjl afjlVar = this.n;
        if (afjlVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.Q) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return afjlVar;
    }

    @Override // defpackage.cukc
    protected final boolean I() {
        return ae().u.isEmpty();
    }

    @Override // defpackage.cukf
    public final boolean K() {
        ae().u.isPresent();
        return true;
    }

    @Override // defpackage.cukc
    protected final void L() {
        afjl afjlVarAe = ae();
        afjlVarAe.u.isPresent();
        if (afjlVarAe.n().e()) {
            dztc.a.d(new dzfh("HomeScreen"));
        } else if (afjlVarAe.n().d()) {
            dztc.a.d(new dzfh("ConversationScreen"));
        } else {
            super.L();
        }
    }

    public final void M(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void N() {
        super.recreate();
    }

    @Override // defpackage.cukf
    public final boolean O() {
        return ae().B();
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

    @Override // defpackage.cukn, defpackage.cukf, defpackage.cukc
    public final cuhe fa() {
        ae();
        return cuhe.e;
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

    @Override // defpackage.cukf
    protected final void fw(im imVar) {
        super.fw(imVar);
        afjl afjlVarAe = ae();
        afjlVarAe.u.isPresent();
        afjlVarAe.C();
        if (afjlVarAe.n().d()) {
            imVar.hide();
            return;
        }
        afjlVarAe.E();
        if (afjlVarAe.m() != null) {
            afjlVarAe.n().c();
        }
        if (afjlVarAe.n().e()) {
            imVar.hide();
        } else {
            imVar.show();
        }
    }

    @Override // defpackage.ecdl, defpackage.eg
    public final void h(ea eaVar) {
        super.h(eaVar);
        afjl afjlVarAe = ae();
        afjlVarAe.u.isPresent();
        if (eaVar instanceof acom) {
            afjlVarAe.A = ((acom) eaVar).H();
        }
        acrt acrtVar = afjlVarAe.A;
        if (acrtVar != null) {
            acrtVar.aO = afjlVarAe;
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

    @Override // defpackage.cukn, defpackage.iy
    public final void n(Toolbar toolbar) {
        afjl afjlVarAe = ae();
        afjlVarAe.u.isPresent();
        if (!afjlVarAe.n().e()) {
            afjlVarAe.C();
        }
        if (toolbar != null) {
            toolbar.setVisibility(8);
        } else {
            toolbar = null;
        }
        afjlVarAe.B = toolbar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    @Override // defpackage.ecdl, defpackage.eg, defpackage.abi, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            eibp r0 = r5.L
            eifp r0 = r0.r()
            super.onActivityResult(r6, r7, r8)     // Catch: java.lang.Throwable -> Lb5
            afjl r8 = r5.ae()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "MainActivityPeer.kt"
            j$.util.Optional r2 = r8.u     // Catch: java.lang.Throwable -> Lb5
            r2.isPresent()     // Catch: java.lang.Throwable -> Lb5
            cczi r2 = defpackage.cpyl.q     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r3 = r2.e()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto L5f
            acrt r3 = r8.q()     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto L5f
            boolean r4 = defpackage.abxb.a()     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto L5f
            boolean r4 = defpackage.cpyl.a()     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto L5f
            java.lang.Object r2 = r2.e()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lb5
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto L5f
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.bs     // Catch: java.lang.Throwable -> Lb5
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto L5f
            fcsu r2 = r3.av     // Catch: java.lang.Throwable -> Lb5
            eyig r2 = (defpackage.eyig) r2     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r2 = r2.a     // Catch: java.lang.Throwable -> Lb5
            j$.util.Optional r2 = (j$.util.Optional) r2     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = r2.isPresent()     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto L5f
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Lb5
            tsi r2 = (defpackage.tsi) r2     // Catch: java.lang.Throwable -> Lb5
            r2.a()     // Catch: java.lang.Throwable -> Lb5
        L5f:
            r2 = 2
            r3 = -1
            if (r6 != r2) goto L87
            if (r7 != r3) goto La9
            r8.E()     // Catch: java.lang.Throwable -> Lb5
            ekrg r6 = defpackage.afjl.a     // Catch: java.lang.Throwable -> Lb5
            ekrw r6 = r6.i()     // Catch: java.lang.Throwable -> Lb5
            ekrz r7 = defpackage.eksq.a     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r8 = "Bugle"
            r6.X(r7, r8)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = "com/google/android/apps/messaging/main/MainActivityPeer"
            java.lang.String r8 = "onActivityResult"
            r2 = 2023(0x7e7, float:2.835E-42)
            ekrw r6 = r6.h(r7, r8, r2, r1)     // Catch: java.lang.Throwable -> Lb5
            ekrd r6 = (defpackage.ekrd) r6     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = "ConversationFragment is missing after launching AttachmentChooserActivity!"
            r6.q(r7)     // Catch: java.lang.Throwable -> Lb5
            goto Lb1
        L87:
            r1 = 1038(0x40e, float:1.455E-42)
            if (r6 != r1) goto La9
            if (r7 != r3) goto L97
            com.google.android.apps.messaging.main.MainActivity r6 = r8.b     // Catch: java.lang.Throwable -> Lb5
            r7 = 2132085373(0x7f150a7d, float:1.9810943E38)
            java.lang.String r6 = r6.getString(r7)     // Catch: java.lang.Throwable -> Lb5
            goto La0
        L97:
            com.google.android.apps.messaging.main.MainActivity r6 = r8.b     // Catch: java.lang.Throwable -> Lb5
            r7 = 2132085374(0x7f150a7e, float:1.9810945E38)
            java.lang.String r6 = r6.getString(r7)     // Catch: java.lang.Throwable -> Lb5
        La0:
            r6.getClass()     // Catch: java.lang.Throwable -> Lb5
            com.google.android.apps.messaging.main.MainActivity r7 = r8.b     // Catch: java.lang.Throwable -> Lb5
            defpackage.adci.b(r7, r6)     // Catch: java.lang.Throwable -> Lb5
            goto Lb1
        La9:
            r6 = 1
            if (r7 != r6) goto Lb1
            com.google.android.apps.messaging.main.MainActivity r6 = r8.b     // Catch: java.lang.Throwable -> Lb5
            r6.finish()     // Catch: java.lang.Throwable -> Lb5
        Lb1:
            r0.close()
            return
        Lb5:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lba
            goto Lbe
        Lba:
            r7 = move-exception
            r6.addSuppressed(r7)
        Lbe:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.main.MainActivity.onActivityResult(int, int, android.content.Intent):void");
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
        ViewTreeObserver viewTreeObserver;
        eifp eifpVarS = this.L.s();
        try {
            super.onConfigurationChanged(configuration);
            afjl afjlVarAe = ae();
            afjlVarAe.u.isPresent();
            afjlVarAe.E();
            MainActivity mainActivity = afjlVarAe.b;
            if (afic.a(mainActivity, afjlVarAe.h.a) != afjlVarAe.H) {
                View viewFindViewById = mainActivity.findViewById(R.id.content);
                if (viewFindViewById != null && (viewTreeObserver = viewFindViewById.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnPreDrawListener(new afjd(afjlVarAe, viewFindViewById));
                }
                afjlVarAe.y();
            }
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

    /* JADX WARN: Type inference failed for: r2v3, types: [ehoa, java.lang.Object] */
    @Override // defpackage.cukn, defpackage.cukf, defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        eibp eibpVar = this.L;
        eifp eifpVarT = eibpVar.t();
        try {
            this.M = true;
            af();
            ((ehnr) P()).h(eibpVar);
            bb().at().a();
            ae().u(bundle);
            einc.a(this).b = findViewById(R.id.content);
            afjl afjlVar = this.n;
            einf.a(this, agbg.class, new afjm(afjlVar));
            einf.a(this, abww.class, new afjn(afjlVar));
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
            afjl afjlVarAe = ae();
            afjlVarAe.u.isPresent();
            afjlVarAe.E();
            afjlVarAe.M = null;
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

    @Override // defpackage.ecdl, android.app.Activity
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        afjl afjlVarAe = ae();
        cancellationSignal.getClass();
        consumer.getClass();
        srp srpVar = afjlVarAe.K;
        super.onGetDirectActions(cancellationSignal, consumer);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x008b A[Catch: all -> 0x00bb, TryCatch #1 {all -> 0x00bb, blocks: (B:3:0x000a, B:6:0x004f, B:8:0x005e, B:9:0x008b, B:12:0x0097, B:14:0x009d, B:15:0x00ae), top: B:27:0x000a }] */
    @Override // defpackage.ecdl, defpackage.abi, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onNewIntent(android.content.Intent r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            eibp r2 = r1.L
            eifp r2 = r2.e(r0)
            super.onNewIntent(r18)     // Catch: java.lang.Throwable -> Lbb
            afjl r3 = r1.ae()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = "MainActivityPeer.kt"
            r0.getClass()     // Catch: java.lang.Throwable -> Lbb
            j$.util.Optional r5 = r3.u     // Catch: java.lang.Throwable -> Lbb
            r5.isPresent()     // Catch: java.lang.Throwable -> Lbb
            ekrg r6 = defpackage.afjl.a     // Catch: java.lang.Throwable -> Lbb
            ekrw r6 = r6.h()     // Catch: java.lang.Throwable -> Lbb
            ekrz r7 = defpackage.eksq.a     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r8 = "Bugle"
            r6.X(r7, r8)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = "com/google/android/apps/messaging/main/MainActivityPeer"
            java.lang.String r8 = "onNewIntent"
            r9 = 772(0x304, float:1.082E-42)
            ekrw r4 = r6.h(r7, r8, r9, r4)     // Catch: java.lang.Throwable -> Lbb
            ekrd r4 = (defpackage.ekrd) r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r6 = "onNewIntent: conversationId: %s, timestamp: %d"
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r7 = r3.r(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r8 = "intent_timestamp"
            r9 = 0
            long r8 = r0.getLongExtra(r8, r9)     // Catch: java.lang.Throwable -> Lbb
            r4.C(r6, r7, r8)     // Catch: java.lang.Throwable -> Lbb
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r12 = r3.r(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = "open_keyboard"
            r6 = 1
            r7 = 0
            if (r12 == 0) goto L8b
            r5.isPresent()     // Catch: java.lang.Throwable -> Lbb
            com.google.android.apps.messaging.conversation.screen.ConversationActivityUiState r5 = r3.n()     // Catch: java.lang.Throwable -> Lbb
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r5.b     // Catch: java.lang.Throwable -> Lbb
            boolean r5 = defpackage.fdbq.f(r12, r5)     // Catch: java.lang.Throwable -> Lbb
            if (r5 != 0) goto L8b
            android.os.Bundle r16 = r0.getExtras()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = "conversation_state"
            int r5 = r0.getIntExtra(r5, r6)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lbb
            fcsu r5 = r3.c     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Lbb
            r10 = r5
            avmp r10 = (defpackage.avmp) r10     // Catch: java.lang.Throwable -> Lbb
            com.google.android.apps.messaging.main.MainActivity r11 = r3.b     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = "draft_data"
            android.os.Parcelable r3 = r0.getParcelableExtra(r3)     // Catch: java.lang.Throwable -> Lbb
            r14 = r3
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r14 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r14     // Catch: java.lang.Throwable -> Lbb
            boolean r15 = r0.getBooleanExtra(r4, r7)     // Catch: java.lang.Throwable -> Lbb
            r10.x(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lbb
            r11.finish()     // Catch: java.lang.Throwable -> Lbb
            goto Lb7
        L8b:
            r3.L = r6     // Catch: java.lang.Throwable -> Lbb
            com.google.android.apps.messaging.main.MainActivity r5 = r3.b     // Catch: java.lang.Throwable -> Lbb
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6 = r3.s(r0)     // Catch: java.lang.Throwable -> Lbb
            if (r12 != 0) goto Lae
            if (r6 != 0) goto L9d
            boolean r4 = r0.getBooleanExtra(r4, r7)     // Catch: java.lang.Throwable -> Lbb
            if (r4 == 0) goto Lae
        L9d:
            fcsu r4 = r3.w     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lbb
            ajso r4 = (defpackage.ajso) r4     // Catch: java.lang.Throwable -> Lbb
            com.google.android.apps.messaging.conversation.screen.ConversationActivityUiState r4 = r3.n()     // Catch: java.lang.Throwable -> Lbb
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r4.b     // Catch: java.lang.Throwable -> Lbb
            defpackage.ajso.d(r4, r0, r7)     // Catch: java.lang.Throwable -> Lbb
        Lae:
            r5.setIntent(r0)     // Catch: java.lang.Throwable -> Lbb
            r3.E()     // Catch: java.lang.Throwable -> Lbb
            r3.s(r0)     // Catch: java.lang.Throwable -> Lbb
        Lb7:
            r2.close()
            return
        Lbb:
            r0 = move-exception
            r3 = r0
            r2.close()     // Catch: java.lang.Throwable -> Lc1
            goto Lc5
        Lc1:
            r0 = move-exception
            r3.addSuppressed(r0)
        Lc5:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.main.MainActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // defpackage.cukf, defpackage.ecdl, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        eifp eifpVarW = this.L.w();
        try {
            afjl afjlVarAe = ae();
            menuItem.getClass();
            afjlVarAe.u.isPresent();
            boolean z = true;
            if (!super.onOptionsItemSelected(menuItem)) {
                if (menuItem.getItemId() == 16908332) {
                    afjlVarAe.v();
                } else {
                    z = false;
                }
            }
            eifpVarW.close();
            return z;
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
            afjl afjlVarAe = ae();
            afjlVarAe.u.isPresent();
            afjlVarAe.F = true;
            ((dssz) afjlVarAe.d.b()).b();
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

    @Override // defpackage.ecdl, android.app.Activity
    public final void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        afjl afjlVarAe = ae();
        str.getClass();
        bundle.getClass();
        cancellationSignal.getClass();
        consumer.getClass();
        srp srpVar = afjlVarAe.K;
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

    @Override // defpackage.ecdl, android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        uok uokVarP;
        super.onProvideAssistContent(assistContent);
        afjl afjlVarAe = ae();
        assistContent.getClass();
        afjlVarAe.u.isPresent();
        afjlVarAe.E();
        if (!((aqki) afjlVarAe.x.b()).a() || (uokVarP = afjlVarAe.p()) == null) {
            return;
        }
        uokVarP.d(assistContent);
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

    @Override // defpackage.cukf, defpackage.cukc, android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        afjl afjlVarAe = ae();
        afjlVarAe.u.isPresent();
        if (abxb.b() || abxb.a()) {
            Optional optional = (Optional) afjlVarAe.q.b();
            final fdap fdapVar = new fdap() { // from class: afip
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    abxa abxaVar = (abxa) obj;
                    abxaVar.getClass();
                    abxaVar.e = true;
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: afiq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.cukf, defpackage.cukc, defpackage.ecdl, defpackage.eg, android.app.Activity
    protected final void onResume() {
        eifp eifpVarH = this.L.h();
        try {
            super.onResume();
            final afjl afjlVarAe = ae();
            eieu eieuVarH = eiiy.h("MainActivity#onResume");
            try {
                afjlVarAe.u.isPresent();
                afjlVarAe.E = false;
                afjlVarAe.F = false;
                dssz dsszVar = (dssz) afjlVarAe.d.b();
                acgx acgxVar = (acgx) afjlVarAe.g.b();
                MainActivity mainActivity = afjlVarAe.b;
                dsszVar.a(acgxVar.a(mainActivity, null));
                afjlVarAe.A();
                if (afjlVarAe.L) {
                    Intent intent = mainActivity.getIntent();
                    intent.getClass();
                    afjlVarAe.x(intent, null, true);
                    afjlVarAe.w(intent, intent.getBooleanExtra("via_notification", false));
                    afjlVarAe.L = false;
                }
                if (!((crnp) afjlVarAe.n.b()).d() && afjlVarAe.n().c() && afjlVarAe.c() != null) {
                    afjlVarAe.z();
                }
                if (abxb.b() || abxb.a()) {
                    Optional optional = (Optional) afjlVarAe.q.b();
                    final fdap fdapVar = new fdap() { // from class: afiv
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            abxa abxaVar = (abxa) obj;
                            abxaVar.getClass();
                            efxf efxfVar = (efxf) afjlVarAe.k.b();
                            fcsu fcsuVar = abxaVar.c;
                            efwo efwoVar = abxaVar.b.a;
                            if (((aram) fcsuVar.b()).a()) {
                                ekrw ekrwVarH = abxa.a.h();
                                ekrwVarH.X(eksq.a, "BugleAccountSignOut");
                                ekrd ekrdVar = (ekrd) ekrwVarH;
                                ekrdVar.X(new ekrz("is_restarted_from_backstack", Boolean.class, false, false), Boolean.valueOf(abxaVar.e));
                                ekrdVar.X(new ekrz("activity_account_id", efwo.class, false, false), abxaVar.d);
                                ekrdVar.X(new ekrz("last_selected_id", efwo.class, false, false), efwoVar);
                                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/gaia/BackstackAccountSwitcherImpl", "onActivityResume", 65, "BackstackAccountSwitcherImpl.java")).q("BackstackSwitcher: onActivityResume, checking if we should switch accounts");
                            }
                            if (abxaVar.e && efwoVar != null && !Objects.equals(abxaVar.d, efwoVar)) {
                                efxfVar.b(efwoVar);
                            }
                            abxaVar.e = false;
                            return fctx.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: afiw
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            fdapVar.invoke(obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                fczl.a(eieuVarH, null);
                eifpVarH.close();
            } finally {
            }
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
            afjl afjlVarAe = ae();
            bundle.getClass();
            afjlVarAe.u.isPresent();
            bundle.putParcelable("uistate", afjlVarAe.n().clone());
            bundle.putParcelable("usstate", afjlVarAe.o());
            bundle.putBoolean("rcscapabilityupdate", afjlVarAe.I);
            bundle.putBoolean("shouldclearactivitystack", afjlVarAe.J);
            afjlVarAe.E = true;
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
            afjl afjlVarAe = ae();
            eieu eieuVarH = eiiy.h("MainActivity#onStart");
            try {
                afjlVarAe.u.isPresent();
                afjlVarAe.G = false;
                fczl.a(eieuVarH, null);
                eifpVarI.close();
            } finally {
            }
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
            afjl afjlVarAe = ae();
            afjlVarAe.u.isPresent();
            afjlVarAe.G = true;
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

    @Override // defpackage.ecdl, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) throws IOException {
        super.onWindowFocusChanged(z);
        afjl afjlVarAe = ae();
        afjlVarAe.u.isPresent();
        eieh eiehVarA = afjlVarAe.f.a("ConversationActivityPeer onWindowFocusChanged");
        try {
            if (((Boolean) ufg.a.e()).booleanValue()) {
                afjlVarAe.E();
                fczl.a(eiehVarA, null);
            } else {
                if (z) {
                    afjlVarAe.E();
                }
                fczl.a(eiehVarA, null);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eiehVarA, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Activity
    public final void recreate() {
        ae().y();
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
