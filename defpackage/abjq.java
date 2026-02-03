package defpackage;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebFragment;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjq {
    public static final cqce a = cqce.g("Bugle", "DittoWebFragment");
    public static final eksp b = eksp.c("Bugle");
    public static final AtomicReference c = new AtomicReference(Optional.empty());
    static final AtomicReference d = new AtomicReference(new Consumer() { // from class: abjn
        @Override // java.util.function.Consumer
        /* renamed from: accept */
        public final void z(Object obj) {
            cqce cqceVar = abjq.a;
        }

        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
    });
    public cquc B;
    final egzv C;
    public Uri D;
    public String E;
    final adi H;
    public abto I;
    final absx J;
    public final adj K;
    final WebStorage L;
    private final fcsu M;
    private final fcsu N;
    private final fcsu O;
    private final fcsu P;
    private final fcsu Q;
    private final egzv R;
    public final DittoWebFragment e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    public final eygg s;
    public final fcsu t;
    public final fcsu u;
    public final Optional v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    public AlertDialog z;
    public boolean A = true;
    public final egps F = new egps<Void, evwl<eppl>>() { // from class: abjq.1
        private final void d() {
            cqce cqceVar = abjq.a;
            cqceVar.p("Exit app since Ditto doesn't handle the NavigateBack.");
            abjq abjqVar = abjq.this;
            if (abjqVar.e == null) {
                cqceVar.r("DittoWebFragment is null.");
            } else {
                abjqVar.a().finish();
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            evwl evwlVar = (evwl) obj2;
            if (evwlVar == null) {
                d();
                return;
            }
            eppl epplVar = (eppl) evwlVar.a(eppl.a, evrr.a());
            if ((epplVar.b == 208 ? (epox) epplVar.c : epox.a).b) {
                d();
            } else {
                abjq.a.p("NavigateBack is handled by Ditto.");
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            if ((th instanceof IllegalArgumentException) || (th instanceof abob)) {
                d();
                return;
            }
            cqbd cqbdVarB = abjq.a.b();
            cqbdVarB.I("Error reading NavigationDidNotOccur from NavigateBackResponsePayload");
            cqbdVarB.s(th);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final adi G = new abjr(this);

    public abjq(DittoWebFragment dittoWebFragment, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, eygg eyggVar, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, eygg eyggVar2, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23) {
        abjs abjsVar = new abjs(this);
        this.H = abjsVar;
        this.e = dittoWebFragment;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.M = fcsuVar3;
        this.N = fcsuVar4;
        this.O = fcsuVar5;
        this.h = fcsuVar6;
        this.s = eyggVar;
        this.t = fcsuVar7;
        this.i = fcsuVar8;
        this.j = fcsuVar9;
        this.k = fcsuVar10;
        this.l = fcsuVar11;
        this.m = fcsuVar12;
        this.n = fcsuVar13;
        this.o = fcsuVar14;
        this.p = fcsuVar16;
        this.q = fcsuVar17;
        this.r = fcsuVar18;
        this.u = fcsuVar15;
        absx absxVar = new absx(dittoWebFragment.fg().h);
        this.J = absxVar;
        this.w = fcsuVar19;
        this.P = fcsuVar20;
        this.Q = fcsuVar21;
        this.x = fcsuVar22;
        this.y = fcsuVar23;
        dittoWebFragment.a.c(absxVar);
        this.K = dittoWebFragment.O(new srt(), abjsVar);
        this.C = new abju(this);
        this.R = new abjv();
        this.L = WebStorage.getInstance();
        fcsu fcsuVar24 = new fcsu() { // from class: abje
            @Override // defpackage.fcsu
            public final Object b() {
                abjq abjqVar = this.a;
                abto abtoVar = abjqVar.I;
                abtoVar.getClass();
                return new abjx(abtoVar, ejwk.b(abjqVar.a().getIntent().getStringExtra("conversation_id_for_launch")));
            }
        };
        abkx abkxVar = (abkx) eyggVar2.b();
        abmr abmrVar = (abmr) abkxVar.a.b();
        abdy abdyVar = (abdy) abkxVar.b.b();
        abdyVar.getClass();
        abfv abfvVar = (abfv) abkxVar.c.b();
        abfvVar.getClass();
        eosc eoscVar = (eosc) abkxVar.d.b();
        eoscVar.getClass();
        this.v = Optional.of(new abkw(abmrVar, abdyVar, abfvVar, eoscVar, fcsuVar24));
    }

    public static final void f() {
        ((Optional) c.getAndSet(Optional.empty())).ifPresent(new Consumer() { // from class: abjm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                abjq.a.p("Cleaning up persisted WebView");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final eg a() {
        DittoWebFragment dittoWebFragment = this.e;
        dittoWebFragment.getClass();
        eg egVarG = dittoWebFragment.G();
        egVarG.getClass();
        return egVarG;
    }

    public final void b(abto abtoVar) {
        fcsu fcsuVar = this.O;
        if (!pqx.a("FORCE_DARK") || !pqx.a("FORCE_DARK_STRATEGY")) {
            a.p("WebView does not support dark mode");
            return;
        }
        int i = this.e.B().getConfiguration().uiMode & 48;
        if (i == 0 || i == 16) {
            a.p("Enabling WebView Light mode");
            abtv.a(abtoVar, 0);
        } else {
            if (i != 32) {
                throw new IllegalStateException("Invalid UiMode state");
            }
            a.p("Enabling WebView Dark mode");
            abtv.a(abtoVar, 2);
        }
        WebSettings settings = ((WebView) abtoVar.b().orElseThrow(new abtu())).getSettings();
        if (!pqx.g.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        ppn.a(settings).b();
    }

    public final void c(final Intent intent) {
        a.p("Handle forwarded draft intent.");
        ((ehac) this.k.b()).a(new egys((egyt) this.P.b(), new eopk() { // from class: abjd
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                abno abnoVar = (abno) this.a.w.b();
                return new eopy(auvw.c(abnoVar.e, fcyi.a, fdjz.a, new abnn(abnoVar, intent, null)));
            }
        }, "draft_message_js_bridge_request_key"), this.R);
    }

    public final void d() {
        if (this.A) {
            final abkw abkwVar = (abkw) this.v.get();
            if (abkwVar.e.compareAndSet(true, false)) {
                eiju eijuVarD = abkwVar.b.d();
                ejvr ejvrVar = new ejvr() { // from class: abkm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        abkw.a.s("Could not connect to foreground JsBridge. Pausing.", (Exception) obj);
                        abkwVar.b();
                        return false;
                    }
                };
                eosc eoscVar = abkwVar.d;
                eijuVarD.e(Exception.class, ejvrVar, eoscVar).k(auvh.b(), eoscVar);
                abkwVar.a(new eooy() { // from class: abkn
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final abkw abkwVar2 = abkwVar;
                        eiju eijuVarA = abkwVar2.c.a();
                        ejvr ejvrVar2 = new ejvr() { // from class: abko
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                return null;
                            }
                        };
                        eosc eoscVar2 = abkwVar2.d;
                        return eijuVarA.h(ejvrVar2, eoscVar2).f(Exception.class, new eooz() { // from class: abkp
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                abkw.a.s("Could not pause background handler. Attempting to tear it down.", (Exception) obj);
                                return abkwVar2.c.c();
                            }
                        }, eoscVar2).e(Exception.class, new ejvr() { // from class: abkq
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                abkw.a.o("Could not tear down background handler.", (Exception) obj);
                                return null;
                            }
                        }, eoscVar2);
                    }
                }).k(auvh.b(), eoscVar);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.ViewGroup r13, java.lang.String r14) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abjq.e(android.view.ViewGroup, java.lang.String):void");
    }
}
