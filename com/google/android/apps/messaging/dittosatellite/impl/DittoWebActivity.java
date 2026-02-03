package com.google.android.apps.messaging.dittosatellite.impl;

import android.app.Activity;
import android.app.DirectAction;
import android.app.VoiceInteractor;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.abdu;
import defpackage.abdw;
import defpackage.abgl;
import defpackage.abiw;
import defpackage.abiz;
import defpackage.abja;
import defpackage.abjq;
import defpackage.abjz;
import defpackage.abkk;
import defpackage.abru;
import defpackage.abto;
import defpackage.adj;
import defpackage.ahhk;
import defpackage.ahkn;
import defpackage.ains;
import defpackage.auvh;
import defpackage.cqbd;
import defpackage.crmg;
import defpackage.dcwi;
import defpackage.dcwj;
import defpackage.didn;
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
import defpackage.eiju;
import defpackage.einp;
import defpackage.eiow;
import defpackage.eipd;
import defpackage.eipe;
import defpackage.eipf;
import defpackage.eipg;
import defpackage.eipi;
import defpackage.eipl;
import defpackage.eipn;
import defpackage.eipr;
import defpackage.eiym;
import defpackage.eiyp;
import defpackage.eizn;
import defpackage.eizo;
import defpackage.eosd;
import defpackage.evpz;
import defpackage.evsn;
import defpackage.evtg;
import defpackage.eygg;
import defpackage.eyhb;
import defpackage.eyie;
import defpackage.le;
import defpackage.lvc;
import defpackage.lvn;
import defpackage.srv;
import defpackage.srw;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DittoWebActivity extends abkk implements ehlg, ehld, ehnq {
    private abja p;
    private boolean r;
    private Context s;
    private lvn u;
    private boolean v;
    private final eibp q = new eibp(this, this);
    private final long t = SystemClock.elapsedRealtime();

    private final abja l() {
        m();
        return this.p;
    }

    private final void m() {
        if (this.p != null) {
            return;
        }
        if (!this.r) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.v && !isFinishing()) {
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
                    if (!(activity instanceof DittoWebActivity)) {
                        throw new IllegalStateException(a.L(activity, abja.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    DittoWebActivity dittoWebActivity = (DittoWebActivity) activity;
                    dittoWebActivity.getClass();
                    eygg eyggVarA = eyie.a(((ahhk) objBb).x);
                    ahkn ahknVar = ((ahhk) objBb).b;
                    this.p = new abja(dittoWebActivity, eyggVarA, ahknVar.a.c, eyie.a(((ahhk) objBb).I), eyie.a(ahknVar.b.nq), ahknVar.dz, ((ahhk) objBb).K, ((ahhk) objBb).M, ((ahhk) objBb).h);
                    eieuVarK.close();
                    this.p.j = this;
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
        return this.t;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return abja.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        abja abjaVar = this.p;
        if (abjaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.v) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return abjaVar;
    }

    @Override // defpackage.hl, defpackage.lvj
    public final lvc P() {
        if (this.u == null) {
            this.u = new ehnr(this);
        }
        return this.u;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.s;
        }
        einp.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.s = context;
        einp.a(context);
        super.attachBaseContext(context);
        this.s = null;
    }

    @Override // defpackage.ecdp, android.app.Activity
    public final void finish() {
        eifp eifpVarA = this.q.a();
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

    @Override // defpackage.abkk
    public final /* synthetic */ eyhb j() {
        return new ehoe(this);
    }

    @Override // defpackage.ecdp, defpackage.eg, defpackage.abi, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        eifp eifpVarR = this.q.r();
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

    @Override // defpackage.ecdp, android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        eifp eifpVarB = this.q.b();
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

    @Override // defpackage.ecdp, defpackage.abi, android.app.Activity
    public final void onBackPressed() {
        eifp eifpVarC = this.q.c();
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

    @Override // defpackage.ecdp, defpackage.abi, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        WebView webView;
        eifp eifpVarS = this.q.s();
        try {
            super.onConfigurationChanged(configuration);
            abja abjaVarL = l();
            DittoWebActivity dittoWebActivity = abjaVarL.c;
            DittoWebFragment dittoWebFragment = (DittoWebFragment) dittoWebActivity.a().g(R.id.ditto_web_fragment_ref);
            if (dittoWebFragment != null) {
                AtomicBoolean atomicBoolean = abjaVarL.f;
                boolean zA = abja.a(dittoWebActivity);
                if (zA != atomicBoolean.getAndSet(zA)) {
                    abjq abjqVarA = dittoWebFragment.H();
                    abto abtoVar = abjqVarA.I;
                    if (abtoVar != null) {
                        abjqVarA.b(abtoVar);
                    }
                    abjq abjqVarA2 = dittoWebFragment.H();
                    View view = abjqVarA2.e.Q;
                    if (view != null && (webView = (WebView) view.findViewById(R.id.ditto_web_view)) != null) {
                        abjq.a.p("Persisting and removing the WebView");
                        abjq.c.set(Optional.of(new abiw(webView, abjqVarA2.I)));
                        ((CoordinatorLayout) webView.getParent()).removeView(webView);
                        eiju.g(((eosd) abjqVarA2.q.b()).schedule(new Runnable() { // from class: abjj
                            @Override // java.lang.Runnable
                            public final void run() {
                                abjq.f();
                            }
                        }, 10000L, TimeUnit.MILLISECONDS)).k(auvh.b(), (Executor) abjqVarA2.p.b());
                    }
                    dittoWebActivity.recreate();
                }
            } else {
                abja.b.r("Cannot find DittoWebFragment");
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
    @Override // defpackage.abkk, defpackage.ecdp, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        eibp eibpVar = this.q;
        eifp eifpVarT = eibpVar.t();
        try {
            this.r = true;
            m();
            ((ehnr) P()).h(eibpVar);
            bb().at().a();
            super.onCreate(bundle);
            abja abjaVarL = l();
            if (!((Boolean) abja.a.e()).booleanValue() || ((abjz) abjaVarL.e.b()).a()) {
                DittoWebActivity dittoWebActivity = abjaVarL.c;
                dittoWebActivity.setContentView(R.layout.ditto_web_activity);
                abjaVarL.f.set(abja.a(dittoWebActivity));
                dittoWebActivity.c().b(dittoWebActivity, new abiz(abjaVarL));
            } else {
                ((ains) abjaVarL.d.b()).c("Bugle.Satellite.Feature.Off.Launch.Counts");
            }
            this.r = false;
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
        eifp eifpVarU = this.q.u();
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

    @Override // defpackage.abkk, defpackage.ecdp, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        eifp eifpVarD = this.q.d();
        try {
            super.onDestroy();
            DittoWebFragment dittoWebFragment = (DittoWebFragment) l().c.a().g(R.id.ditto_web_fragment_ref);
            if (dittoWebFragment != null) {
                dittoWebFragment.H();
                abjq.f();
            }
            this.v = true;
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

    @Override // defpackage.ecdp, android.app.Activity
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        VoiceInteractor voiceInteractor;
        abdu abduVarA = ((abdw) l().g.b()).a();
        cancellationSignal.getClass();
        consumer.getClass();
        final eipe eipeVar = abduVarA.e;
        final ArrayList arrayList = new ArrayList();
        Consumer consumer2 = new Consumer() { // from class: eipb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                arrayList.addAll((List) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer3) {
                return Consumer$CC.$default$andThen(this, consumer3);
            }
        };
        final eipd eipdVar = eipeVar.d;
        Runnable runnable = new Runnable() { // from class: eioy
            @Override // java.lang.Runnable
            public final void run() {
                VoiceInteractor voiceInteractor2;
                Activity activity = eipdVar.a;
                if (activity.isDestroyed() || (voiceInteractor2 = activity.getVoiceInteractor()) == null || voiceInteractor2.isDestroyed()) {
                    return;
                }
                voiceInteractor2.notifyDirectActionsChanged();
            }
        };
        AtomicBoolean atomicBoolean = eipeVar.c;
        eipl eiplVar = eipeVar.e;
        eiym eiymVar = (eiym) eiyp.a.createBuilder();
        final eiow eiowVar = (eiow) eiplVar;
        Iterable iterable = (Iterable) Collection.EL.stream(((didn) eiplVar).a).filter(new Predicate() { // from class: eior
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return eiowVar.a(((eipk) obj).a());
            }
        }).map(new Function() { // from class: eios
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eipk eipkVar = (eipk) obj;
                int i = eiow.d;
                eiyk eiykVar = (eiyk) eipkVar.a().d().toBuilder();
                String strB = eipkVar.b();
                eiykVar.copyOnWrite();
                eiyl eiylVar = (eiyl) eiykVar.instance;
                strB.getClass();
                eiylVar.c = strB;
                return (eiyl) eiykVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        eiymVar.copyOnWrite();
        eiyp eiypVar = (eiyp) eiymVar.instance;
        evtg evtgVar = eiypVar.d;
        if (!evtgVar.c()) {
            eiypVar.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, eiypVar.d);
        eizn eiznVar = (eizn) eizo.a.createBuilder();
        eiznVar.copyOnWrite();
        eizo eizoVar = (eizo) eiznVar.instance;
        eizoVar.b |= 1;
        eizoVar.c = 0L;
        eiznVar.copyOnWrite();
        eizo eizoVar2 = (eizo) eiznVar.instance;
        eizoVar2.b |= 2;
        eizoVar2.d = 0L;
        eiznVar.copyOnWrite();
        eizo eizoVar3 = (eizo) eiznVar.instance;
        eizoVar3.b |= 4;
        eizoVar3.e = 1L;
        eizo eizoVar4 = (eizo) eiznVar.build();
        eiymVar.copyOnWrite();
        eiyp eiypVar2 = (eiyp) eiymVar.instance;
        eizoVar4.getClass();
        eiypVar2.c = eizoVar4;
        eiypVar2.b |= 1;
        List listSingletonList = Collections.singletonList(new eipf((eiyp) eiymVar.build()));
        int i = eipi.b;
        eipg eipgVar = new eipg(DesugarCollections.unmodifiableList(new ArrayList(listSingletonList)));
        atomicBoolean.set(false);
        if (!((Optional) eipeVar.b.getAndSet(Optional.of(runnable))).isPresent()) {
            eiplVar.e.add(eipeVar);
            Runnable runnable2 = new Runnable() { // from class: eioz
                @Override // java.lang.Runnable
                public final void run() {
                    eipa eipaVar = eipeVar;
                    if (((Optional) eipaVar.b.getAndSet(eipa.a)).isPresent()) {
                        eipaVar.e.e.remove(eipaVar);
                    }
                }
            };
            Activity activity = eipdVar.a;
            if (!activity.isDestroyed() && (voiceInteractor = activity.getVoiceInteractor()) != null && !voiceInteractor.isDestroyed()) {
                final Handler handler = eipdVar.b;
                voiceInteractor.registerOnDestroyedCallback(new Executor() { // from class: eipc
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable3) {
                        handler.post(runnable3);
                    }
                }, runnable2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (eipf eipfVar : eipgVar.a) {
            DirectAction.Builder builder = new DirectAction.Builder("app_action");
            Bundle bundle = new Bundle();
            bundle.putBundle("metadata", eipn.a("app_action_metadata", eipfVar.a));
            DirectAction directActionBuild = builder.setExtras(bundle).setLocusId(new LocusId("unused")).build();
            AtomicReference atomicReference = eipr.a;
            directActionBuild.getExtras().getClass();
            directActionBuild.getExtras().putString("com.google.assistant.appactions.HANDOVER_TOKEN", (String) ((Optional) eipr.a.get()).orElse(null));
            arrayList2.add(directActionBuild);
        }
        consumer2.z(DesugarCollections.unmodifiableList(arrayList2));
        eipd eipdVar2 = eipeVar.d;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("component_name", eipdVar2.a.getComponentName());
        arrayList.add(new DirectAction.Builder("foreground_app").setExtras(bundle2).setLocusId(new LocusId("unused")).build());
        consumer.z(DesugarCollections.unmodifiableList(arrayList));
    }

    @Override // defpackage.eg, defpackage.abi, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        eifp eifpVarV = this.q.v();
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

    @Override // defpackage.ecdp, defpackage.abi, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        eifp eifpVarE = this.q.e(intent);
        try {
            super.onNewIntent(intent);
            DittoWebActivity dittoWebActivity = l().c;
            DittoWebFragment dittoWebFragment = (DittoWebFragment) dittoWebActivity.a().g(R.id.ditto_web_fragment_ref);
            if (dittoWebFragment == null) {
                abja.b.r("Cannot find DittoWebFragment");
            } else if (intent == null || !"ForwardDraftIntentToDittoAction".equals(intent.getAction())) {
                abgl abglVar = new abgl(intent.getStringExtra("conversation_id_for_launch"));
                Uri data = intent.getData();
                String type = intent.getType();
                String stringExtra = intent.getStringExtra("SatelliteDittoLog");
                String stringExtra2 = intent.getStringExtra("SatelliteDittoServerVersion");
                String stringExtra3 = intent.getStringExtra("SatellitePairedBugleVersion");
                if (!abglVar.b()) {
                    cqbd cqbdVarA = abja.b.a();
                    cqbdVarA.A("conversationId", abglVar);
                    cqbdVarA.r();
                    abjq abjqVarA = dittoWebFragment.H();
                    ((abru) abjqVarA.x.b()).c(abglVar.toString());
                    abjqVarA.e(null, abglVar.toString());
                } else if (data != null && type != null) {
                    abjq abjqVarA2 = dittoWebFragment.H();
                    if (le.t(type)) {
                        srv srvVarA = ((srw) abjqVarA2.t.b()).a("Bugle.Satellite.Attachment.Save.Duration");
                        srvVarA.b(data, type, null, null);
                        srvVarA.e(new Void[0]);
                    } else {
                        adj adjVar = abjqVarA2.K;
                        if (adjVar != null) {
                            abjqVarA2.D = data;
                            abjqVarA2.E = type;
                            Bundle bundle = new Bundle();
                            bundle.putString("messaging.attachment.documentName", le.y(type) ? abjqVarA2.e.z().getString(R.string.default_vcard_file_name) : abjqVarA2.e.z().getString(R.string.default_attachment_name));
                            bundle.putString("messaging.attachment.documentType", type);
                            adjVar.c(bundle);
                        } else {
                            abjq.a.r("downloadFileLauncher is null, cannot download file");
                        }
                    }
                } else if (stringExtra == null || stringExtra2 == null || stringExtra3 == null) {
                    abja.b.r("Intent doesn't have actionable data");
                } else {
                    abjq abjqVarA3 = dittoWebFragment.H();
                    Bitmap bitmapA = dcwi.a(abjqVarA3.a());
                    dcwj dcwjVar = new dcwj(abjqVarA3.e.z());
                    dcwjVar.c("SatelliteDittoLog", stringExtra);
                    dcwjVar.c("SatelliteDittoServerVersion", stringExtra2);
                    dcwjVar.c("SatellitePairedBugleVersion", stringExtra3);
                    if (bitmapA != null) {
                        dcwjVar.a = bitmapA;
                    }
                    ((dcwi) abjqVarA3.u.b()).c(dcwjVar.a());
                }
            } else {
                DittoWebFragment dittoWebFragment2 = (DittoWebFragment) dittoWebActivity.a().g(R.id.ditto_web_fragment_ref);
                if (dittoWebFragment2 != null) {
                    dittoWebFragment2.H().c(intent);
                } else {
                    abja.b.r("Cannot find DittoWebFragment");
                }
            }
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

    @Override // defpackage.ecdp, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        eifp eifpVarW = this.q.w();
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

    @Override // defpackage.ecdp, defpackage.eg, android.app.Activity
    protected final void onPause() {
        eifp eifpVarF = this.q.f();
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x011b A[Catch: eipo -> 0x014b, TryCatch #1 {eipo -> 0x014b, blocks: (B:5:0x002c, B:7:0x0032, B:9:0x003c, B:10:0x0040, B:11:0x0069, B:13:0x006f, B:15:0x0083, B:17:0x008c, B:18:0x009f, B:20:0x00a5, B:22:0x00b3, B:23:0x00d2, B:24:0x00da, B:28:0x00ea, B:50:0x011b, B:51:0x011f, B:32:0x00f3, B:35:0x00fa, B:49:0x0111, B:52:0x0133, B:54:0x0137, B:55:0x014a), top: B:64:0x002c, inners: #0 }] */
    @Override // defpackage.ecdp, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPerformDirectAction(java.lang.String r10, android.os.Bundle r11, android.os.CancellationSignal r12, java.util.function.Consumer r13) throws defpackage.eipo {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity.onPerformDirectAction(java.lang.String, android.os.Bundle, android.os.CancellationSignal, java.util.function.Consumer):void");
    }

    @Override // defpackage.abi, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        eifp eifpVarX = this.q.x();
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

    @Override // defpackage.ecdp, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        eifp eifpVarY = this.q.y();
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

    @Override // defpackage.ecdp, defpackage.eg, android.app.Activity
    protected final void onPostResume() {
        eifp eifpVarG = this.q.g();
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

    @Override // defpackage.ecdp, android.app.Activity
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

    @Override // defpackage.ecdp, defpackage.eg, defpackage.abi, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        eifp eifpVarZ = this.q.z();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            ((crmg) l().i.b()).k(i);
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

    @Override // defpackage.ecdp, defpackage.eg, android.app.Activity
    protected final void onResume() {
        eifp eifpVarH = this.q.h();
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

    @Override // defpackage.ecdp, defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        eifp eifpVarA = this.q.A();
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

    @Override // defpackage.ecdp, defpackage.eg, android.app.Activity
    protected final void onStart() {
        eifp eifpVarI = this.q.i();
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

    @Override // defpackage.ecdp, defpackage.eg, android.app.Activity
    protected final void onStop() {
        eifp eifpVarJ = this.q.j();
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

    @Override // defpackage.ecdp, android.app.Activity
    public final void onUserInteraction() {
        eifp eifpVarL = this.q.l();
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

    @Override // defpackage.ecdp, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (ehlf.a(intent, getApplicationContext())) {
            eiid.n(intent);
        }
        super.startActivity(intent);
    }

    @Override // defpackage.ecdp, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (ehlf.a(intent, getApplicationContext())) {
            eiid.n(intent);
        }
        super.startActivity(intent, bundle);
    }
}
