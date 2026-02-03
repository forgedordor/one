package com.google.android.apps.messaging.lighterconversation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.afdx;
import defpackage.afej;
import defpackage.afel;
import defpackage.ahhk;
import defpackage.cg;
import defpackage.dwje;
import defpackage.dxaw;
import defpackage.dxbt;
import defpackage.efwo;
import defpackage.ehld;
import defpackage.ehlf;
import defpackage.ehlg;
import defpackage.ehnq;
import defpackage.ehnr;
import defpackage.ehoe;
import defpackage.ehok;
import defpackage.eibp;
import defpackage.eidc;
import defpackage.eieu;
import defpackage.eifp;
import defpackage.eiid;
import defpackage.eiiy;
import defpackage.einp;
import defpackage.ejwi;
import defpackage.eyhb;
import defpackage.eyhj;
import defpackage.lvc;
import defpackage.lvn;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LighterConversationActivity extends afdx implements ehlg, ehld, ehnq {
    private afej o;
    private boolean q;
    private Context r;
    private lvn t;
    private boolean u;
    private final eibp p = new eibp(this, this);
    private final long s = SystemClock.elapsedRealtime();

    private final afej G() {
        I();
        return this.o;
    }

    private final void I() {
        if (this.o == null) {
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
                        if (!(activity instanceof LighterConversationActivity)) {
                            throw new IllegalStateException(a.L(activity, afej.class, "Attempt to inject a Activity wrapper of type "));
                        }
                        LighterConversationActivity lighterConversationActivity = (LighterConversationActivity) activity;
                        lighterConversationActivity.getClass();
                        this.o = new afej(lighterConversationActivity, ((ahhk) objBb).b.b.kq);
                        eieuVarK.close();
                        this.o.d = this;
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

    @Override // defpackage.afdx
    public final /* synthetic */ eyhb C() {
        return new ehoe(this);
    }

    @Override // defpackage.ehld
    public final long D() {
        return this.s;
    }

    @Override // defpackage.ehlg
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final afej H() {
        afej afejVar = this.o;
        if (afejVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return afejVar;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return afej.class;
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

    /* JADX WARN: Type inference failed for: r14v3, types: [ehoa, java.lang.Object] */
    @Override // defpackage.afdx, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        eifp eifpVar;
        afej afejVarG;
        LighterConversationActivity lighterConversationActivity;
        Intent intent;
        efwo efwoVar;
        eibp eibpVar = this.p;
        eifp eifpVarT = eibpVar.t();
        try {
            this.q = true;
            I();
            ((ehnr) P()).h(eibpVar);
            bb().at().a();
            super.onCreate(bundle);
            afejVarG = G();
            lighterConversationActivity = afejVarG.b;
            intent = lighterConversationActivity.getIntent();
            eifpVar = eifpVarT;
            try {
                efwoVar = (efwo) intent.getParcelableExtra("account_id");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            eifpVar = eifpVarT;
        }
        try {
            if (efwoVar == null) {
                afej.a.m("Account ID null!");
                lighterConversationActivity.finish();
            } else {
                lighterConversationActivity.setContentView(R.layout.lighter_conversation_activity);
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("account_context", (dwje) intent.getSerializableExtra("account_context"));
                bundle2.putParcelable("account_id", efwoVar);
                bundle2.putString("conversation_draft_message", intent.getStringExtra("conversation_draft_message"));
                bundle2.putSerializable("conversation_id", (Serializable) intent.getParcelableExtra("conversation_id"));
                bundle2.putInt("entry_point", intent.getIntExtra("entry_point", 0));
                bundle2.putLong("lighter_entry_point_id", intent.getLongExtra("lighter_entry_point_id", 0L));
                bundle2.putString("lighter_entry_point_tracking_event_id", intent.getStringExtra("lighter_entry_point_tracking_event_id"));
                bundle2.putLong("lighter_entry_point_tracking_id", intent.getLongExtra("lighter_entry_point_tracking_id", 0L));
                if (((Boolean) afejVarG.c.b()).booleanValue()) {
                    if (intent.hasExtra("smart_context_image_url")) {
                        bundle2.putString("smart_context_image_url", intent.getStringExtra("smart_context_image_url"));
                    }
                    if (intent.hasExtra("smart_context_sub_title")) {
                        bundle2.putString("smart_context_sub_title", intent.getStringExtra("smart_context_sub_title"));
                    }
                    if (intent.hasExtra("smart_context_title")) {
                        bundle2.putString("smart_context_title", intent.getStringExtra("smart_context_title"));
                    }
                }
                afel afelVar = new afel();
                eyhj.e(afelVar);
                ehok.b(afelVar, efwoVar);
                afelVar.at(bundle2);
                cg cgVar = new cg(lighterConversationActivity.a());
                cgVar.t(R.id.lighter_conversation_fragment_container, afelVar, "LIGHTER_FRAGMENT");
                cgVar.c();
            }
            this.q = false;
            eibpVar.m();
            eifpVar.close();
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            try {
                eifpVar.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
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

    @Override // defpackage.afdx, defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
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

    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, dwzn] */
    @Override // defpackage.ecdl, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        afej afejVarG = G();
        afel afelVar = (afel) afejVarG.b.a().h("LIGHTER_FRAGMENT");
        if (afelVar != null) {
            dxaw dxawVar = afelVar.H().t;
            if (keyEvent.getKeyCode() == 4) {
                ?? r2 = dxawVar.a;
                if (r2.f().getVisibility() == 0) {
                    dxbt dxbtVar = dxawVar.v;
                    View viewC = r2.c();
                    dxbtVar.a.c(ejwi.j(r2.g()), viewC);
                    return true;
                }
                boolean z = dxawVar.p;
                boolean z2 = dxawVar.q;
                boolean z3 = dxawVar.r;
                ejwi ejwiVar = dxawVar.o;
                dxawVar.B.c(dxawVar.b);
                if (dxawVar.i.a()) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.ecdl, defpackage.abi, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        eifp eifpVarE = this.p.e(intent);
        try {
            super.onNewIntent(intent);
            LighterConversationActivity lighterConversationActivity = G().b;
            lighterConversationActivity.finish();
            eiid.o(lighterConversationActivity, intent);
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
