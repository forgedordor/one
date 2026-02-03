package com.google.android.apps.messaging.ui.mediaviewer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.a;
import defpackage.abl;
import defpackage.ahhk;
import defpackage.ahkn;
import defpackage.asgn;
import defpackage.cg;
import defpackage.cuhe;
import defpackage.czlk;
import defpackage.czmc;
import defpackage.czmd;
import defpackage.czme;
import defpackage.czmf;
import defpackage.czmj;
import defpackage.czne;
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
import defpackage.ekgb;
import defpackage.emyz;
import defpackage.eyhb;
import defpackage.lvc;
import defpackage.lvn;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MediaViewerActivity extends czlk implements ehlg, ehld, ehnq {
    private czmd n;
    private boolean p;
    private Context q;
    private lvn y;
    private boolean z;
    private final eibp o = new eibp(this, this);
    private final long r = SystemClock.elapsedRealtime();

    private final czmd J() {
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
                        Activity activity = (Activity) ((ahhk) objBb).d.b();
                        if (!(activity instanceof MediaViewerActivity)) {
                            throw new IllegalStateException(a.L(activity, czmd.class, "Attempt to inject a Activity wrapper of type "));
                        }
                        MediaViewerActivity mediaViewerActivity = (MediaViewerActivity) activity;
                        mediaViewerActivity.getClass();
                        ahkn ahknVar = ((ahhk) objBb).b;
                        this.n = new czmd(mediaViewerActivity, ahknVar.b.nG, ahknVar.a.adE);
                        eieuVarK.close();
                        this.n.h = this;
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
        return czmd.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        czmd czmdVar = this.n;
        if (czmdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.z) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czmdVar;
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
        return cuhe.j;
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
        eibp eibpVar = this.o;
        eifp eifpVarT = eibpVar.t();
        try {
            this.p = true;
            K();
            ((ehnr) P()).h(eibpVar);
            bb().at().a();
            super.onCreate(bundle);
            czmd czmdVarJ = J();
            if (((asgn) czmdVarJ.c.b()).a()) {
                abl.a(czmdVarJ.a);
            }
            MediaViewerActivity mediaViewerActivity = czmdVarJ.a;
            mediaViewerActivity.setContentView(R.layout.media_viewer_activity);
            czne czneVar = new czne();
            czmj czmjVarE = MediaViewerButton.e();
            czmjVarE.b(R.string.media_viewer_save_media_description);
            czmjVarE.d(R.drawable.quantum_ic_save_alt_white_24);
            czmjVarE.c(new MediaViewerSaveButtonEvent());
            MediaViewerButton mediaViewerButtonA = czmjVarE.a();
            czmj czmjVarE2 = MediaViewerButton.e();
            czmjVarE2.b(R.string.media_viewer_share_media_description);
            czmjVarE2.d(R.drawable.quantum_gm_ic_share_white_24);
            czmjVarE2.c(new MediaViewerShareButtonEvent());
            czneVar.i = new ArrayList(ekgb.s(mediaViewerButtonA, czmjVarE2.a()));
            czmj czmjVarE3 = MediaViewerButton.e();
            czmjVarE3.c(new MediaViewerCloseButtonEvent());
            czneVar.j = czmjVarE3.a();
            czneVar.b(emyz.a(mediaViewerActivity.getIntent().getIntExtra("opening_source", 0)));
            czneVar.l = 1;
            Uri uri = (Uri) mediaViewerActivity.getIntent().getParcelableExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            if (uri != null) {
                czneVar.e = uri;
            }
            MediaViewerButton mediaViewerButton = (MediaViewerButton) mediaViewerActivity.getIntent().getParcelableExtra("primary_button");
            if (mediaViewerButton != null) {
                czneVar.h = mediaViewerButton;
            }
            czneVar.m = mediaViewerActivity.getIntent().getBooleanExtra("open_in_editor", false);
            czneVar.l = mediaViewerActivity.getIntent().getIntExtra("media_editor_type", 1);
            ArrayList parcelableArrayListExtra = mediaViewerActivity.getIntent().getParcelableArrayListExtra("secondary_button_list");
            if (parcelableArrayListExtra != null) {
                czneVar.i = parcelableArrayListExtra;
            }
            Uri uri2 = (Uri) mediaViewerActivity.getIntent().getParcelableExtra("photos");
            if (uri2 != null) {
                czneVar.f = uri2;
            }
            String stringExtra = mediaViewerActivity.getIntent().getStringExtra("content_type");
            if (stringExtra != null) {
                czneVar.g = stringExtra;
            }
            boolean booleanExtra = mediaViewerActivity.getIntent().getBooleanExtra("show_direct_send_viewer", false);
            czmdVarJ.f = booleanExtra;
            if (booleanExtra) {
                mediaViewerActivity.getWindow().setSoftInputMode(16);
                mediaViewerActivity.setRequestedOrientation(1);
                boolean booleanExtra2 = mediaViewerActivity.getIntent().getBooleanExtra("show_direct_send_button", false);
                czmdVarJ.g = booleanExtra2;
                czneVar.o = czmdVarJ.f;
                czneVar.p = booleanExtra2;
                String stringExtra2 = mediaViewerActivity.getIntent().getStringExtra("text_caption");
                boolean booleanExtra3 = mediaViewerActivity.getIntent().getBooleanExtra("use_encrypted_icon", false);
                if (stringExtra2 != null) {
                    czneVar.q = stringExtra2;
                }
                czneVar.t = booleanExtra3;
            }
            czneVar.n = mediaViewerActivity.getIntent().getParcelableArrayListExtra("media_viewer_items");
            czneVar.d = mediaViewerActivity.getIntent().getIntExtra("media_viewer_position", 0);
            czneVar.r = mediaViewerActivity.getIntent().getLongExtra("video_start_ts", 0L);
            czneVar.s = mediaViewerActivity.getIntent().getBooleanExtra("start_playing_video", false);
            czmdVarJ.d = czneVar.a();
            cg cgVar = new cg(mediaViewerActivity.a());
            cgVar.s(R.id.activity_media_viewer_container, czmdVarJ.d);
            cgVar.c();
            czmdVarJ.e = new czmc(czmdVarJ);
            mediaViewerActivity.c().b(mediaViewerActivity, czmdVarJ.e);
            einc.a(this).b = findViewById(android.R.id.content);
            czmd czmdVar = this.n;
            einf.a(this, MediaViewerPrimaryButtonEvent.class, new czme(czmdVar));
            einf.a(this, MediaViewerAddMoreButtonEvent.class, new czmf(czmdVar));
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
        eifp eifpVarW = this.o.w();
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
