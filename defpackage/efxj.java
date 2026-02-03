package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efxj extends efxf {
    public static final eiew a = new eiew();
    public static final ekrg b = ekrg.c("com/google/apps/tiktok/account/api/controller/AccountControllerImpl");
    public static final efxs c;
    public final efxn d;
    public final ejwi e;
    public final egac f;
    public final egpr g;
    public final egaz h;
    public final egaa i;
    public final efyt j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final egps n = new egps<evwl<efxs>, efxe>() { // from class: efxj.1
        /* JADX WARN: Multi-variable type inference failed */
        private final void d(efxs efxsVar, efyg efygVar) {
            efxj efxjVar = efxj.this;
            if (!efxjVar.m) {
                if (efxsVar.i) {
                    efxjVar.h.h(efygVar);
                    return;
                } else {
                    efxjVar.f.l(efygVar);
                    return;
                }
            }
            eiew eiewVar = efxj.a;
            eiev eievVarC = eiiy.c(eiewVar);
            int iIntValue = (eievVarC.b() ? ((Integer) eievVarC.a()).intValue() : 0) + 1;
            if (iIntValue > 10) {
                ejwi ejwiVar = efxjVar.e;
                ((ekrd) ((ekrd) efxj.b.i()).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "fallbackOrSetErrorDetectingInfiniteLoop", 377, "AccountControllerImpl.java")).t("A highly probable infinite loop detected in host: %s", new esvh(esvg.NO_USER_DATA, ejwiVar.g() ? ((Activity) ejwiVar.c()).getClass().getName() : efxjVar.t.getClass().getName()));
                throw new IllegalStateException("Account error triggered too many times in the same call chain, the app is likely trapped in an infinite loop. This is likely an app bug where the onNoAccountAvailable method is triggering the account error again. Please check the preceding log in logcat to see which host is causing the problem.", eiip.c());
            }
            eiex eiexVarB = eiez.b();
            eiexVarB.a(eiewVar, Integer.valueOf(iIntValue));
            eieu eieuVarJ = eiiy.j("AccountController account error", ((eiez) eiexVarB).f());
            try {
                if (efxsVar.i) {
                    efxjVar.h.h(efygVar);
                    eieuVarJ.close();
                } else {
                    efxjVar.f.l(efygVar);
                    eieuVarJ.close();
                }
            } catch (Throwable th) {
                try {
                    eieuVarJ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // defpackage.egps
        public final /* synthetic */ void c(Object obj, Object obj2) {
            efwo efwoVarB;
            efxe efxeVar = (efxe) obj2;
            efxs efxsVar = (efxs) ((evwl) obj).a(efxs.a, evrr.a());
            efxj.t(efxsVar);
            efxj efxjVar = efxj.this;
            if (efxsVar.equals(efxjVar.p)) {
                if ((efxsVar.b & 2) != 0) {
                    ejwl.l(efxeVar.a.a() == efxsVar.d);
                    efwoVarB = efwo.b(efxsVar.d);
                } else {
                    Intent intent = efxeVar.d;
                    if (intent != null) {
                        egac egacVar = efxjVar.f;
                        if (!egacVar.i()) {
                            egacVar.m();
                        }
                        if (egacVar.i()) {
                            efyp.c(intent, efwo.b(egacVar.g()));
                        }
                        efxjVar.d.c().c(intent);
                        efxjVar.h.g();
                        return;
                    }
                    if (efxeVar.c == null) {
                        d(efxsVar, new efym());
                        efxjVar.n();
                        efxjVar.p();
                        return;
                    }
                    efwoVarB = efxeVar.a;
                }
                egbd egbdVar = efxeVar.c;
                egbdVar.getClass();
                efxb efxbVar = efxeVar.e;
                if (egbdVar.c()) {
                    efxjVar.f.n(efxeVar.a, efxeVar.b, efxbVar);
                    efxjVar.n();
                } else {
                    efxn efxnVar = efxjVar.d;
                    if (!efxnVar.e()) {
                        efxjVar.n();
                        egbdVar.a();
                        efyk efykVar = new efyk();
                        d(efxsVar, efykVar);
                        ((ekrd) ((ekrd) ((ekrd) efxj.b.h()).g(efykVar)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onSuccess", 198, "AccountControllerImpl.java")).t("Account with id %s does not fulfill all the requirements.", efwoVarB);
                        efxjVar.p();
                        return;
                    }
                    if (egbdVar.b()) {
                        efxjVar.f.m();
                    }
                    Intent intentA = egbdVar.a();
                    efyp.c(intentA, efwoVarB);
                    efyp.b(intentA);
                    egbb.b(intentA, ((egan) efxjVar.o).a);
                    intentA.addFlags(65536);
                    efxnVar.b().c(intentA);
                }
                efxjVar.p();
            }
        }

        @Override // defpackage.egps
        public final /* synthetic */ void f(Object obj, Throwable th) {
            eieu eieuVarK;
            efxs efxsVar = (efxs) ((evwl) obj).a(efxs.a, evrr.a());
            efxj.t(efxsVar);
            efxj efxjVar = efxj.this;
            if (efxsVar.equals(efxjVar.p)) {
                efxjVar.n();
                if (th instanceof egqh) {
                    int i = efxsVar.h;
                    if (i < 4) {
                        esvg esvgVar = esvg.NO_USER_DATA;
                        int iA = efxr.a(efxsVar.e);
                        if (iA == 0) {
                            iA = 1;
                        }
                        ((ekrd) ((ekrd) ((ekrd) efxj.b.j()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 246, "AccountControllerImpl.java")).I("Android killed the app process before the account operation completes.retrying the failed operation. AccountControllerOperation type enum number: %s, time(s) attempted: %s, exit reason code: %s", new esvh(esvgVar, Integer.valueOf(iA - 1)), new esvh(esvgVar, Integer.valueOf(i)), new esvh(esvgVar, ((egqh) th).a.f()));
                        int iA2 = efxr.a(efxsVar.e);
                        if (iA2 == 0) {
                            iA2 = 1;
                        }
                        int i2 = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        if (iA2 == 2 || iA2 == 3 || iA2 == 6) {
                            Iterator<E> it = efxsVar.f.iterator();
                            while (it.hasNext()) {
                                try {
                                    ekfwVar.h(Class.forName((String) it.next()).asSubclass(efzj.class));
                                } catch (ClassNotFoundException e) {
                                    throw new IllegalStateException(e);
                                }
                            }
                        }
                        ejwi ejwiVarJ = ejud.a;
                        if (iA2 == 6) {
                            ejwl.l((efxsVar.b & 64) != 0);
                            ejwiVarJ = ejwi.j(Integer.valueOf(efxsVar.j));
                        }
                        int i3 = efxsVar.h;
                        int i4 = iA2 - 1;
                        if (i4 == 1) {
                            efxj.this.s(ekfwVar.g(), i3);
                            return;
                        }
                        if (i4 == 2) {
                            ekgb ekgbVarG = ekfwVar.g();
                            efxjVar.m();
                            efxjVar.l();
                            eieuVarK = eiiy.k("Retry Switch Account Interactive with Specified Selectors");
                            try {
                                efxjVar.q(ekgbVarG, i3);
                                eieuVarK.close();
                                return;
                            } finally {
                            }
                        } else {
                            if (i4 == 3) {
                                int i5 = efxsVar.d;
                                ejwl.l(i5 >= 0);
                                efxjVar.r(efwo.b(i5), efxsVar.g, i3);
                                return;
                            }
                            if (i4 == 4) {
                                efxjVar.r = true;
                                efxjVar.k(i3);
                                return;
                            }
                            if (i4 != 5) {
                                throw new IllegalStateException("AccountControllerOperation type is UNKNOWN. Shouldn't reach here because we already checked this field at the beginning of the method.");
                            }
                            efxj efxjVar2 = efxj.this;
                            ekgb ekgbVarG2 = ekfwVar.g();
                            int iIntValue = ((Integer) ejwiVarJ.c()).intValue();
                            egaz egazVar = efxjVar2.h;
                            abyu abyuVarK = egazVar.k(iIntValue);
                            efxjVar2.m();
                            ekgbVarG2.getClass();
                            ejwl.l(!ekgbVarG2.isEmpty());
                            efxjVar2.r = efxjVar2.q;
                            egazVar.m(abyuVarK);
                            eieuVarK = eiiy.k("Switch Account With Custom Selectors Keep State");
                            try {
                                ListenableFuture listenableFutureI = efxjVar2.i(ekgbVarG2, new efxb(), true);
                                if (listenableFutureI.isDone()) {
                                    ProtoParsers.InternalDontUse internalDontUse = new ProtoParsers.InternalDontUse(null, efxjVar2.u(6, null, ejwi.j(ekgbVarG2), ejud.a, true, ejwi.j(abyuVarK), i3));
                                    try {
                                        efxjVar2.n.c(internalDontUse, (efxe) eork.q(listenableFutureI));
                                    } catch (ExecutionException e2) {
                                        efxjVar2.n.f(internalDontUse, e2.getCause());
                                    }
                                } else {
                                    egazVar.i();
                                    efxjVar2.v(6, null, ejwi.j(ekgbVarG2), ejud.a, true, ejwi.j(abyuVarK), listenableFutureI, i3);
                                }
                                eieuVarK.close();
                                return;
                            } finally {
                            }
                        }
                    } else {
                        d(efxsVar, new efyi(th));
                    }
                } else {
                    d(efxsVar, efyo.a(th));
                }
                if ((efxsVar.b & 2) != 0) {
                    efwo efwoVarB = efwo.b(efxsVar.d);
                    if (th instanceof efyg) {
                        ((ekrd) ((ekrd) ((ekrd) efxj.b.h()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 268, "AccountControllerImpl.java")).t("Failed to use %s.", efwoVarB);
                    } else {
                        ((ekrd) ((ekrd) ((ekrd) efxj.b.i()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$1", "onFailure", 271, "AccountControllerImpl.java")).t("Failed to use %s.", efwoVarB);
                    }
                }
                efxj.this.p();
            }
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public egaq o;
    public efxs p;
    public boolean q;
    public boolean r;
    public ListenableFuture s;
    public final ehnu t;
    private final efzn u;
    private final boolean v;

    static {
        efxp efxpVar = (efxp) efxs.a.createBuilder();
        efxpVar.copyOnWrite();
        efxs efxsVar = (efxs) efxpVar.instance;
        efxsVar.b |= 1;
        efxsVar.c = -1;
        c = efxpVar.build();
    }

    public efxj(ehnu ehnuVar, final efxn efxnVar, ejwi ejwiVar, egac egacVar, egpr egprVar, efzn efznVar, egaz egazVar, egaa egaaVar, efyt efytVar, ejwi ejwiVar2, ejwi ejwiVar3) {
        this.t = ehnuVar;
        this.d = efxnVar;
        this.e = ejwiVar;
        this.f = egacVar;
        this.g = egprVar;
        this.u = efznVar;
        this.h = egazVar;
        this.i = egaaVar;
        this.j = efytVar;
        Boolean bool = false;
        this.k = ((Boolean) ejwiVar2.e(bool)).booleanValue();
        this.l = ((Boolean) ejwiVar3.e(bool)).booleanValue();
        bool.getClass();
        this.m = true;
        bool.getClass();
        this.v = true;
        bool.getClass();
        egacVar.k(this);
        ehnuVar.P().c(new eijk(new efxm(this)));
        ehnuVar.U().b("tiktok_account_controller_saved_instance_state", new piw() { // from class: efxg
            @Override // defpackage.piw
            public final Bundle a() {
                Bundle bundle = new Bundle();
                efxj efxjVar = this.a;
                bundle.putBoolean("state_pending_op", efxjVar.q);
                ProtoParsers.j(bundle, "state_latest_operation", efxjVar.p);
                boolean z = true;
                if (!efxjVar.r && efxnVar.f()) {
                    z = false;
                }
                bundle.putBoolean("state_do_not_revalidate", z);
                bundle.putBoolean("tiktok_accounts_disabled", efxjVar.k);
                return bundle;
            }
        });
        efxnVar.d(new adi() { // from class: efxh
            @Override // defpackage.adi
            public final void a(Object obj) {
                adh adhVar = (adh) obj;
                int i = adhVar.a;
                Intent intent = adhVar.b;
                efxj efxjVar = this.a;
                if (i == -1) {
                    efxjVar.w(efwo.b(intent.getIntExtra("new_account_id", -1)), false);
                } else {
                    egac egacVar2 = efxjVar.f;
                    if (!egacVar2.i()) {
                        efyg efynVar = intent != null ? (efyg) intent.getSerializableExtra("account_error") : null;
                        if (efynVar == null) {
                            efynVar = new efyn();
                        }
                        egacVar2.l(efynVar);
                    }
                    efxjVar.n();
                }
                efxjVar.p();
            }
        }, new adi() { // from class: efxi
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.adi
            public final void a(Object obj) {
                adh adhVar = (adh) obj;
                int i = adhVar.a;
                Intent intent = adhVar.b;
                efxj efxjVar = this.a;
                if (i == -1) {
                    efxjVar.w(efwo.b(intent.getIntExtra("new_account_id", -1)), false);
                } else {
                    Class cls = null;
                    if (intent == null || !intent.getBooleanExtra("restart_account_selector", false)) {
                        efyg efynVar = intent != null ? (efyg) intent.getSerializableExtra("account_error") : null;
                        egac egacVar2 = efxjVar.f;
                        if (efynVar == null) {
                            efynVar = new efyn();
                        }
                        egacVar2.l(efynVar);
                    } else {
                        efxjVar.m();
                        efxjVar.l();
                        eieu eieuVarK = eiiy.k("Switch Account Interactive");
                        try {
                            ekgb ekgbVar = ((egan) efxjVar.o).b;
                            int i2 = ((ekoe) ekgbVar).c - 1;
                            while (true) {
                                if (i2 < 0) {
                                    break;
                                }
                                if (efzh.class.isAssignableFrom((Class) ekgbVar.get(i2))) {
                                    cls = (Class) ekgbVar.get(i2);
                                    break;
                                }
                                i2--;
                            }
                            ejwl.m(cls != null, "No interactive selector found.");
                            efxjVar.q(ekgb.r(cls), 0);
                            eieuVarK.close();
                        } catch (Throwable th) {
                            try {
                                eieuVarK.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    efxjVar.n();
                }
                efxjVar.p();
            }
        });
    }

    public static final void t(efxs efxsVar) {
        ejwl.l((efxsVar.b & 32) != 0);
        ejwl.l(efxsVar.h > 0);
        int iA = efxr.a(efxsVar.e);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        if (i == 1 || i == 2) {
            ejwl.l(!((efxsVar.b & 2) != 0));
            ejwl.l(efxsVar.f.size() > 0);
            ejwl.l(!((efxsVar.b & 8) != 0));
            ejwl.l(!efxsVar.i);
            ejwl.l(!((efxsVar.b & 64) != 0));
            return;
        }
        if (i == 3) {
            ejwl.l((efxsVar.b & 2) != 0);
            ejwl.l(efxsVar.f.size() == 0);
            ejwl.l((efxsVar.b & 8) != 0);
            ejwl.l(!efxsVar.i);
            ejwl.l(!((efxsVar.b & 64) != 0));
            return;
        }
        if (i == 4) {
            ejwl.l((efxsVar.b & 2) != 0);
            ejwl.l(efxsVar.f.size() == 0);
            ejwl.l(!((efxsVar.b & 8) != 0));
            ejwl.l(!efxsVar.i);
            ejwl.l(!((efxsVar.b & 64) != 0));
            return;
        }
        if (i != 5) {
            throw new IllegalArgumentException("AccountControllerOperation.type is of value UNKNOWN - the proto might be skewed during the parcel/unparcel process.");
        }
        ejwl.l(!((efxsVar.b & 2) != 0));
        ejwl.l(efxsVar.f.size() > 0);
        ejwl.l(!((efxsVar.b & 8) != 0));
        ejwl.l(efxsVar.i);
        ejwl.l((efxsVar.b & 64) != 0);
    }

    private final ListenableFuture x(ekgb ekgbVar, efxb efxbVar) {
        return i(ekgbVar, efxbVar, false);
    }

    @Override // defpackage.efxf
    public final void a() {
        m();
        l();
        o(((egan) this.o).b, h(), 0);
    }

    @Override // defpackage.efxf
    public final void b(efwo efwoVar) {
        m();
        l();
        w(efwoVar, true);
    }

    @Override // defpackage.efxf
    public final void c(ekgb ekgbVar) {
        m();
        l();
        eieu eieuVarK = eiiy.k("Switch Account Interactive with Specified Selectors");
        try {
            q(ekgbVar, 0);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efxf
    public final void d(ekgb ekgbVar) {
        s(ekgbVar, 0);
    }

    @Override // defpackage.efxf
    public final void e(efzm efzmVar) {
        m();
        this.u.a(efzmVar);
    }

    @Override // defpackage.efxf
    public final void f(abyu abyuVar) {
        m();
        this.h.l(abyuVar);
    }

    @Override // defpackage.efxf
    public final void g(egaq egaqVar) {
        m();
        ejwl.m(this.o == null, "Config can be set once, in the constructor only.");
        this.o = egaqVar;
    }

    public final ListenableFuture h() {
        return x(((egan) this.o).b, new efxb());
    }

    public final ListenableFuture i(ekgb ekgbVar, efxb efxbVar, boolean z) {
        efxn efxnVar = this.d;
        egal egalVar = new egal(efxnVar.a());
        if (!z) {
            this.r = false;
        }
        egaa egaaVar = this.i;
        return egaaVar.c(egaaVar.d(egalVar, ekgbVar, efxbVar), ((egan) this.o).c, efxnVar.a());
    }

    public final ListenableFuture j() {
        return k(0);
    }

    public final ListenableFuture k(int i) {
        ListenableFuture listenableFutureI;
        if (!this.r) {
            return eork.i(null);
        }
        this.r = false;
        eieu eieuVarK = eiiy.k("Revalidate Account");
        try {
            int iG = this.f.g();
            if (iG == -1) {
                listenableFutureI = eork.i(null);
            } else {
                efwo efwoVarB = efwo.b(iG);
                ListenableFuture listenableFutureE = this.i.e(efwoVarB, ((egan) this.o).c, this.d.a(), new efxb());
                ejud ejudVar = ejud.a;
                eieuVarK.b(listenableFutureE);
                v(5, efwoVarB, ejudVar, ejudVar, false, ejudVar, listenableFutureE, i);
                listenableFutureI = listenableFutureE;
            }
            eieuVarK.close();
            return listenableFutureI;
        } finally {
        }
    }

    public final void l() {
        ejwl.m(((egan) this.o).a, "Activity not configured for account selection.");
    }

    public final void m() {
        ejwl.m(!this.k, "Attempted to use the account controller when accounts are disabled");
    }

    public final void n() {
        this.q = false;
        if (this.f.i()) {
            return;
        }
        this.r = false;
    }

    public final void o(ekgb ekgbVar, ListenableFuture listenableFuture, int i) {
        if (!listenableFuture.isDone()) {
            this.f.m();
            ejwi ejwiVarJ = ejwi.j(ekgbVar);
            ejud ejudVar = ejud.a;
            v(2, null, ejwiVarJ, ejudVar, false, ejudVar, listenableFuture, i);
            return;
        }
        this.f.j();
        ejwi ejwiVarJ2 = ejwi.j(ekgbVar);
        ejud ejudVar2 = ejud.a;
        efxs efxsVarU = u(2, null, ejwiVarJ2, ejudVar2, false, ejudVar2, i);
        try {
            this.n.c(new ProtoParsers.InternalDontUse(null, efxsVarU), (efxe) eork.q(listenableFuture));
        } catch (ExecutionException e) {
            this.n.f(new ProtoParsers.InternalDontUse(null, efxsVarU), e.getCause());
        }
    }

    public final void p() {
        if (this.q) {
            return;
        }
        this.h.g();
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(ekgb ekgbVar, int i) {
        ekgbVar.getClass();
        ejwl.l(!ekgbVar.isEmpty());
        for (int i2 = 0; i2 < ((ekoe) ekgbVar).c; i2++) {
            Class cls = (Class) ekgbVar.get(i2);
            ejwl.f(efzh.class.isAssignableFrom(cls), "selector %s is not an interactive selector", cls);
        }
        ListenableFuture listenableFutureD = this.i.d(new egal(this.d.a()), ekgbVar, new efxb());
        ejwi ejwiVarJ = ejwi.j(ekgbVar);
        ejud ejudVar = ejud.a;
        v(3, null, ejwiVarJ, ejudVar, false, ejudVar, listenableFutureD, i);
    }

    public final void r(efwo efwoVar, boolean z, int i) {
        eieu eieuVarK = eiiy.k("Switch Account");
        try {
            this.r = false;
            ListenableFuture listenableFutureB = z ? this.i.b(efwoVar, ((egan) this.o).c, this.d.a(), new efxb()) : this.i.e(efwoVar, ((egan) this.o).c, this.d.a(), new efxb());
            if (!listenableFutureB.isDone()) {
                int iA = efwoVar.a();
                egac egacVar = this.f;
                if (iA != egacVar.g()) {
                    egacVar.m();
                }
            }
            ejud ejudVar = ejud.a;
            ejwi ejwiVarJ = ejwi.j(Boolean.valueOf(z));
            eieuVarK.b(listenableFutureB);
            v(4, efwoVar, ejudVar, ejwiVarJ, false, ejudVar, listenableFutureB, i);
            eieuVarK.close();
        } finally {
        }
    }

    public final void s(ekgb ekgbVar, int i) {
        ekgbVar.getClass();
        ejwl.l(!ekgbVar.isEmpty());
        eieu eieuVarK = eiiy.k("Switch Account With Custom Selectors");
        try {
            o(ekgbVar, x(ekgbVar, new efxb()), i);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, java.util.List] */
    public final efxs u(int i, efwo efwoVar, ejwi ejwiVar, ejwi ejwiVar2, boolean z, ejwi ejwiVar3, int i2) {
        if (this.v) {
            ecem.c();
        }
        int i3 = this.p.c;
        int i4 = i3 == Integer.MAX_VALUE ? 0 : i3 + 1;
        efxp efxpVar = (efxp) efxs.a.createBuilder();
        efxpVar.copyOnWrite();
        efxs efxsVar = (efxs) efxpVar.instance;
        efxsVar.b |= 1;
        efxsVar.c = i4;
        if (efwoVar != null) {
            int iA = efwoVar.a();
            efxpVar.copyOnWrite();
            efxs efxsVar2 = (efxs) efxpVar.instance;
            efxsVar2.b |= 2;
            efxsVar2.d = iA;
        }
        efxpVar.copyOnWrite();
        efxs efxsVar3 = (efxs) efxpVar.instance;
        efxsVar3.e = i - 1;
        efxsVar3.b |= 4;
        if (ejwiVar.g()) {
            ?? C = ejwiVar.c();
            ejwl.l(!((ekgb) C).isEmpty());
            int i5 = ((ekoe) C).c;
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(((Class) C.get(i6)).getName());
            }
            efxpVar.a(arrayList);
        }
        if (ejwiVar2.g()) {
            boolean zBooleanValue = ((Boolean) ejwiVar2.c()).booleanValue();
            efxpVar.copyOnWrite();
            efxs efxsVar4 = (efxs) efxpVar.instance;
            efxsVar4.b |= 8;
            efxsVar4.g = zBooleanValue;
        }
        efxpVar.copyOnWrite();
        efxs efxsVar5 = (efxs) efxpVar.instance;
        efxsVar5.b |= 32;
        efxsVar5.i = z;
        if (ejwiVar3.g()) {
            int iJ = this.h.j((abyu) ejwiVar3.c());
            efxpVar.copyOnWrite();
            efxs efxsVar6 = (efxs) efxpVar.instance;
            efxsVar6.b |= 64;
            efxsVar6.j = iJ;
        }
        efxpVar.copyOnWrite();
        efxs efxsVar7 = (efxs) efxpVar.instance;
        efxsVar7.b |= 16;
        efxsVar7.h = i2 + 1;
        efxs efxsVar8 = (efxs) efxpVar.build();
        this.p = efxsVar8;
        t(efxsVar8);
        return this.p;
    }

    public final void v(int i, efwo efwoVar, ejwi ejwiVar, ejwi ejwiVar2, boolean z, ejwi ejwiVar3, ListenableFuture listenableFuture, int i2) {
        efxs efxsVarU = u(i, efwoVar, ejwiVar, ejwiVar2, z, ejwiVar3, i2);
        this.q = true;
        try {
            this.g.k(new egpq(listenableFuture), egpo.a(efxsVarU), this.n);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Cannot switch account before Activity resumes.", e);
        }
    }

    public final void w(efwo efwoVar, boolean z) {
        r(efwoVar, z, 0);
    }
}
