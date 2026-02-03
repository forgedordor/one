package com.google.android.apps.messaging.ui.mediapicker.c2o.gif;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import defpackage.a;
import defpackage.ahhk;
import defpackage.ahkn;
import defpackage.ahng;
import defpackage.ahnh;
import defpackage.ajhd;
import defpackage.ccze;
import defpackage.cpdu;
import defpackage.cqbm;
import defpackage.czch;
import defpackage.czcj;
import defpackage.czck;
import defpackage.czcl;
import defpackage.czcp;
import defpackage.czdb;
import defpackage.daoe;
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
import defpackage.ejbv;
import defpackage.ejby;
import defpackage.ejca;
import defpackage.emsp;
import defpackage.eosc;
import defpackage.eyhb;
import defpackage.eyik;
import defpackage.eylq;
import defpackage.eylr;
import defpackage.im;
import defpackage.lvc;
import defpackage.lvn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GifBrowserActivity extends czdb implements ehlg, ehld, ehnq {
    private czch K;
    private boolean M;
    private Context N;
    private lvn P;
    private boolean Q;
    private final eibp L = new eibp(this, this);
    private final long O = SystemClock.elapsedRealtime();

    private final czch ag() {
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
                    if (!(activity instanceof GifBrowserActivity)) {
                        throw new IllegalStateException(a.L(activity, czch.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    GifBrowserActivity gifBrowserActivity = (GifBrowserActivity) activity;
                    gifBrowserActivity.getClass();
                    ahkn ahknVar = ((ahhk) objBb).b;
                    eosc eoscVar = (eosc) ahknVar.eI.b();
                    eosc eoscVar2 = (eosc) ahknVar.pP.b();
                    ahnh ahnhVar = ahknVar.a;
                    eyik eyikVar = ahnhVar.yw;
                    ahng ahngVar = ahknVar.b;
                    this.K = new czch(gifBrowserActivity, eoscVar, eoscVar2, eyikVar, (ejca) ahngVar.iB.b(), new ejby((ejca) ahngVar.iB.b()), ahnhVar.Dr, (cqbm) ahnhVar.sX.b(), (daoe) ahngVar.hX.b(), new czcl(((ahhk) objBb).bl));
                    eieuVarK.close();
                    this.K.v = this;
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
        return czch.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        czch czchVar = this.K;
        if (czchVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.Q) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czchVar;
    }

    @Override // defpackage.cukc
    protected final boolean I() {
        return false;
    }

    @Override // defpackage.cyvb
    protected final emsp M() {
        ag();
        return emsp.GIF;
    }

    @Override // defpackage.cyvb
    protected final Class N() {
        ag();
        return GifContentItem.class;
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
            czch czchVarAg = ag();
            czchVarAg.l.aj(czchVarAg.j.d);
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) czchVarAg.k.o;
            if (staggeredGridLayoutManager != null) {
                staggeredGridLayoutManager.J(czch.c(configuration));
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
            czch czchVarAg = ag();
            GifBrowserActivity gifBrowserActivity = czchVarAg.a;
            gifBrowserActivity.setContentView(R.layout.activity_gif_browser);
            czcp czcpVar = (czcp) czchVarAg.h.a.b();
            czcpVar.getClass();
            czchVarAg.j = new czck(czcpVar, gifBrowserActivity, czchVarAg);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
            czchVarAg.m = (ProgressBar) gifBrowserActivity.findViewById(R.id.gif_browser_loading_spinner);
            czchVarAg.l = (RecyclerView) gifBrowserActivity.findViewById(R.id.gif_browser_category_recycler_view);
            czchVarAg.l.al(czchVarAg.j);
            czchVarAg.l.ao(linearLayoutManager);
            czchVarAg.l.aK();
            czcj czcjVar = new czcj(gifBrowserActivity, czchVarAg);
            czcjVar.B(true);
            czchVarAg.i = czcjVar;
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(czch.c(gifBrowserActivity.getResources().getConfiguration()));
            staggeredGridLayoutManager.N();
            czchVarAg.k = (RecyclerView) gifBrowserActivity.findViewById(R.id.gif_recycler_view);
            czchVarAg.k.al(czchVarAg.i);
            czchVarAg.k.ao(staggeredGridLayoutManager);
            czchVarAg.k.aK();
            eylr eylrVar = eylr.a;
            eylq eylqVar = (eylq) eylrVar.createBuilder();
            eylqVar.copyOnWrite();
            ((eylr) eylqVar.instance).b = 180;
            eylr eylrVar2 = (eylr) eylqVar.build();
            Intent intent = gifBrowserActivity.getIntent();
            ejby ejbyVar = czchVarAg.e;
            ejbyVar.d = czchVarAg;
            eylq eylqVar2 = (eylq) eylrVar.createBuilder();
            int intExtra = intent.getIntExtra("max_attachment_width", 0);
            eylqVar2.copyOnWrite();
            ((eylr) eylqVar2.instance).b = intExtra;
            int intExtra2 = intent.getIntExtra("max_attachment_height", 0);
            eylqVar2.copyOnWrite();
            ((eylr) eylqVar2.instance).c = intExtra2;
            eylr eylrVar3 = (eylr) eylqVar2.build();
            ejbv ejbvVar = ejbyVar.c;
            ejbvVar.b = eylrVar3;
            ejbvVar.c = intent.getIntExtra("max_attachment_size", 0);
            ejbvVar.d = eylrVar2;
            ejbvVar.e = ((Integer) ccze.e.e()).intValue();
            String stringExtra = intent.getStringExtra("search_text");
            czchVarAg.g(true);
            if (((Boolean) ccze.d.e()).booleanValue() && TextUtils.isEmpty(stringExtra)) {
                czchVarAg.s = true;
                czchVarAg.f();
                czchVarAg.k(stringExtra);
            } else {
                czchVarAg.s = false;
                czchVarAg.t = stringExtra;
                ejbyVar.b(stringExtra);
                if (czchVarAg.k(stringExtra)) {
                    czchVarAg.u = 3;
                } else {
                    czchVarAg.r = stringExtra;
                    czchVarAg.u = 4;
                }
            }
            View viewFindViewById = gifBrowserActivity.findViewById(R.id.gif_browser_activity);
            viewFindViewById.setSystemUiVisibility(1792);
            viewFindViewById.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: czcb
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
            czchVarAg.k.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: czcc
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                    return windowInsets;
                }
            });
            ((ajhd) czchVarAg.c.b()).ag(2, czchVarAg.u, czchVarAg.n());
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
        final czch czchVarAg = ag();
        GifBrowserActivity gifBrowserActivity = czchVarAg.a;
        gifBrowserActivity.getMenuInflater().inflate(R.menu.gif_browser_menu, menu);
        czchVarAg.q = (BugleSearchView) menu.findItem(R.id.action_search_gifs).getActionView();
        czchVarAg.q.setZeroEffectivePadding();
        czchVarAg.q.setMaxWidth(Alert.DURATION_SHOW_INDEFINITELY);
        czchVarAg.q.setQueryHint(gifBrowserActivity.getString(R.string.c2o_gif_hint));
        czchVarAg.q.setOnQueryTextListener(czchVarAg);
        BugleSearchView bugleSearchView = czchVarAg.q;
        bugleSearchView.setImeOptions(bugleSearchView.getImeOptions() | VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        czchVarAg.q.getSearchTextView().setTypeface(cpdu.a(gifBrowserActivity));
        czchVarAg.o = (ImageView) czchVarAg.q.findViewById(R.id.search_close_btn);
        czchVarAg.o.setImageResource(R.drawable.tinted_quantum_ic_close_24);
        czchVarAg.p = (ImageView) czchVarAg.q.findViewById(R.id.search_button);
        czchVarAg.p.setOnClickListener(new View.OnClickListener() { // from class: czcd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czch czchVar = czchVarAg;
                czchVar.h(false);
                czchVar.o.setVisibility(8);
            }
        });
        if (!TextUtils.isEmpty(czchVarAg.r)) {
            czchVarAg.h(false);
            czchVarAg.q.setQuery(czchVarAg.r, false);
            czchVarAg.q.clearFocus();
        } else if (gifBrowserActivity.getIntent().hasExtra("search_text")) {
            czchVarAg.h(true);
        } else {
            czchVarAg.h(false);
            czchVarAg.o.setVisibility(8);
        }
        czchVarAg.j();
        im imVarK = gifBrowserActivity.k();
        if (imVarK != null) {
            imVarK.setHomeAsUpIndicator((Drawable) null);
            imVarK.setHomeActionContentDescription(R.string.action_back);
            imVarK.setElevation(0.0f);
            View customView = imVarK.getCustomView();
            if (customView == null || customView.getId() != R.id.gif_browser_title_container) {
                imVarK.setDisplayShowTitleEnabled(false);
                imVarK.setDisplayShowCustomEnabled(true);
                imVarK.setCustomView(R.layout.action_bar_gif_browser_title_m2);
                TextView textView = (TextView) imVarK.getCustomView().findViewById(R.id.gif_browser_title);
                textView.setText(gifBrowserActivity.getString(R.string.action_search_gifs));
                textView.setOnClickListener(new View.OnClickListener() { // from class: czce
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        czch czchVar = czchVarAg;
                        czchVar.h(false);
                        czchVar.o.setVisibility(8);
                    }
                });
            }
        }
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
            czch czchVarAg = ag();
            ejby ejbyVar = czchVarAg.e;
            ejbyVar.b.removeCallbacks(ejbyVar.a);
            ejbyVar.d = null;
            ((ajhd) czchVarAg.c.b()).ag(5, czchVarAg.u, czchVarAg.n());
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
