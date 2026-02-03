package com.google.android.apps.messaging.ui.conversationlist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.a;
import defpackage.abdk;
import defpackage.ahhk;
import defpackage.ahho;
import defpackage.ahkn;
import defpackage.ahng;
import defpackage.ahnh;
import defpackage.aijh;
import defpackage.ajso;
import defpackage.aqha;
import defpackage.avmp;
import defpackage.barn;
import defpackage.cg;
import defpackage.cqca;
import defpackage.cqdn;
import defpackage.cqnc;
import defpackage.crnp;
import defpackage.cuhe;
import defpackage.cwvm;
import defpackage.cwvx;
import defpackage.cwwm;
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
import defpackage.ekrd;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.eygg;
import defpackage.eyhb;
import defpackage.eyhj;
import defpackage.eyie;
import defpackage.eyik;
import defpackage.fcsu;
import defpackage.lvc;
import defpackage.lvn;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShareIntentActivity extends cwvm implements ehlg, ehld, ehnq {
    private cwvx n;
    private boolean p;
    private Context q;
    private lvn y;
    private boolean z;
    private final eibp o = new eibp(this, this);
    private final long r = SystemClock.elapsedRealtime();

    private final cwvx J() {
        K();
        return this.n;
    }

    private final void K() {
        if (this.n != null) {
            return;
        }
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
                    if (!(activity instanceof ShareIntentActivity)) {
                        throw new IllegalStateException(a.L(activity, cwvx.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    ShareIntentActivity shareIntentActivity = (ShareIntentActivity) activity;
                    shareIntentActivity.getClass();
                    ahho ahhoVar = ((ahhk) objBb).c;
                    eyik eyikVar = ahhoVar.aF;
                    eyik eyikVar2 = ahhoVar.e;
                    ahkn ahknVar = ((ahhk) objBb).b;
                    ahnh ahnhVar = ahknVar.a;
                    eyik eyikVar3 = ahnhVar.Jm;
                    ahng ahngVar = ahknVar.b;
                    this.n = new cwvx(shareIntentActivity, eyikVar, eyikVar2, eyikVar3, ahngVar.fg, ahnhVar.BK, ahnhVar.aaW, eyie.a(((ahhk) objBb).aJ), ahknVar.cI, ahnhVar.Uk, ahknVar.ij, ahngVar.hV);
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
        return cwvx.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        cwvx cwvxVar = this.n;
        if (cwvxVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.z) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cwvxVar;
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
        return cuhe.h;
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

    /* JADX WARN: Type inference failed for: r5v2, types: [ehoa, java.lang.Object] */
    @Override // defpackage.cukc, defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        boolean z;
        eibp eibpVar;
        eibp eibpVar2 = this.o;
        eifp eifpVarT = eibpVar2.t();
        boolean z2 = true;
        try {
            this.p = true;
            K();
            ((ehnr) P()).h(eibpVar2);
            bb().at().a();
            super.onCreate(bundle);
            cwvx cwvxVarJ = J();
            eygg eyggVar = cwvxVarJ.f;
            if (!((Optional) eyggVar.b()).isPresent() || !((abdk) ((Optional) eyggVar.b()).get()).m() || ((crnp) cwvxVarJ.g.b()).e()) {
                ConversationIdType conversationIdTypeB = barn.a;
                ConversationId bugleConversationId = InvalidConversationId.a;
                ShareIntentActivity shareIntentActivity = cwvxVarJ.b;
                if (!shareIntentActivity.isFinishing()) {
                    Intent intent = shareIntentActivity.getIntent();
                    String stringExtra = intent.getStringExtra("android.intent.extra.shortcut.ID");
                    if (stringExtra != null) {
                        fcsu fcsuVar = cwvxVarJ.d;
                        ConversationIdType conversationIdTypeB2 = barn.b(((cqdn) fcsuVar.b()).d(stringExtra));
                        ConversationId conversationIdA = ((cqdn) fcsuVar.b()).a(stringExtra);
                        z = conversationIdA != bugleConversationId;
                        bugleConversationId = conversationIdA;
                        conversationIdTypeB = conversationIdTypeB2;
                    } else {
                        z = false;
                    }
                    if (intent.hasExtra("via_deep_link")) {
                        conversationIdTypeB = barn.b(intent.getStringExtra("conversation_id"));
                        if (!conversationIdTypeB.b()) {
                            bugleConversationId = new BugleConversationId(conversationIdTypeB);
                            ConversationId conversationIdA2 = ((ajso) cwvxVarJ.c.b()).a(intent);
                            if (conversationIdA2 != null) {
                                bugleConversationId = conversationIdA2;
                            }
                        }
                    } else {
                        z2 = z;
                    }
                    fcsu fcsuVar2 = cwvxVarJ.i;
                    if (((aqha) fcsuVar2.b()).a()) {
                        ekrw ekrwVarH = cwvx.a.h();
                        ekrwVarH.X(eksq.a, "BugleShareIntent");
                        ekrd ekrdVar = (ekrd) ekrwVarH;
                        ekrdVar.X(cqnc.s, conversationIdTypeB);
                        ekrdVar.X(cqnc.t, bugleConversationId);
                        ekrdVar.X(cqnc.aa, intent);
                        ekrdVar.X(cqnc.ab, (Uri) intent.getParcelableExtra("android.intent.extra.STREAM"));
                        eibpVar = eibpVar2;
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/ui/conversationlist/ShareIntentActivityPeer", "onCreate", 166, "ShareIntentActivityPeer.java")).M("Share intent received. isDeepLink %s, type %s, action %s, data %s, categories %s, component %s, clipData %s", Boolean.valueOf(z2), intent.getType(), intent.getAction(), intent.getData(), intent.getCategories(), intent.getComponent(), intent.getClipData());
                    } else {
                        eibpVar = eibpVar2;
                    }
                    if (z2) {
                        if (!((aqha) fcsuVar2.b()).a() && cqca.q("BugleShareIntent", 3)) {
                            cqca.c("BugleShareIntent", "DeepLink : Share Intent received");
                            cqca.c("BugleShareIntent", "  intent type: ".concat(String.valueOf(intent.getType())));
                            cqca.c("BugleShareIntent", "  intent action: ".concat(String.valueOf(intent.getAction())));
                            cqca.c("BugleShareIntent", "  intent data:  ".concat(String.valueOf(String.valueOf(intent.getData()))));
                            cqca.c("BugleShareIntent", "  intent categories: ".concat(String.valueOf(String.valueOf(intent.getCategories()))));
                            cqca.c("BugleShareIntent", "  intent component: ".concat(String.valueOf(String.valueOf(intent.getComponent()))));
                            cqca.c("BugleShareIntent", "  intent extras: ".concat(cqca.a(intent)));
                            cqca.c("BugleShareIntent", "  intent clipData: ".concat(String.valueOf(String.valueOf(intent.getClipData()))));
                            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                            if (uri != null) {
                                cqca.c("BugleShareIntent", "intent contentUri: ".concat(uri.toString()));
                            }
                        }
                        cwvxVarJ.d(intent);
                        if (!shareIntentActivity.isFinishing()) {
                            cwvxVarJ.e(0, bugleConversationId, null, null);
                            shareIntentActivity.finish();
                        }
                    } else if (!((crnp) cwvxVarJ.g.b()).d()) {
                        ((aijh) cwvxVarJ.h.b()).a(shareIntentActivity);
                        shareIntentActivity.finish();
                    } else if (!"android.intent.action.SEND".equals(intent.getAction()) || (TextUtils.isEmpty(intent.getStringExtra("address")) && TextUtils.isEmpty(intent.getStringExtra("android.intent.extra.EMAIL")))) {
                        cwvxVarJ.d(intent);
                        if (shareIntentActivity.a().h("ShareIntentTabletModeCheckFragment") == null) {
                            cg cgVar = new cg(shareIntentActivity.a());
                            cwwm cwwmVar = new cwwm();
                            eyhj.e(cwwmVar);
                            cgVar.u(cwwmVar, "ShareIntentTabletModeCheckFragment");
                            cgVar.c();
                        }
                    } else {
                        Intent intentF = ((avmp) cwvxVarJ.e.b()).f(shareIntentActivity);
                        intentF.putExtras(intent);
                        intentF.setAction("android.intent.action.SENDTO");
                        intentF.setDataAndType(intent.getData(), intent.getType());
                        shareIntentActivity.startActivity(intentF);
                        shareIntentActivity.finish();
                    }
                }
                this.p = false;
                eibpVar.m();
                eifpVarT.close();
            }
            abdk abdkVar = (abdk) ((Optional) eyggVar.b()).get();
            ShareIntentActivity shareIntentActivity2 = cwvxVarJ.b;
            abdkVar.d(shareIntentActivity2.getIntent());
            shareIntentActivity2.finish();
            eibpVar = eibpVar2;
            this.p = false;
            eibpVar.m();
            eifpVarT.close();
        } finally {
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
