package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyod implements baib {
    public static final cqce a = cqce.g("Bugle", "DittoWelcomeFragmentPeerDelegate");
    public cyor c;
    public final acgu d;
    public final fcsu e;
    public final fcsu f;
    private final Optional g;
    private final Optional h;
    private final ea i;
    private final acgx j;
    private final cedm k;
    private final baid l;
    private final ehbb m;
    private final ehac n;
    private final aurx o;
    private final bvll p;
    private final cyos q;
    private final egyt r;
    private final fcsu s;
    private final dssz w;
    public final babw b = new babw();
    private final egzv t = new egzv<aumq>() { // from class: cyod.1
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cyod.a.r("Error loading fi settings data, defaulting to ditto welcome banner");
            cyod.this.c.F(false);
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            cyod.this.c.F(((aumq) obj).e);
        }

        @Override // defpackage.egzv
        public final void hn() {
        }
    };
    private final ehay u = new cyoe(this);
    private final egzv v = new egzv<Boolean>() { // from class: cyod.2
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            cyod.a.r("Error getting showDittoBatteryPromo");
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                cyod.this.d.a(15);
            } else {
                cyod.a.m("No need to show Ditto Battery Promo");
            }
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    };

    public cyod(Optional optional, Optional optional2, ea eaVar, acgu acguVar, dssz dsszVar, acgx acgxVar, cedm cedmVar, baid baidVar, ehbb ehbbVar, ehac ehacVar, aurx aurxVar, bvll bvllVar, fcsu fcsuVar, fcsu fcsuVar2, egyt egytVar, cyos cyosVar, fcsu fcsuVar3) {
        this.g = optional;
        this.h = optional2;
        this.i = eaVar;
        this.d = acguVar;
        this.w = dsszVar;
        this.j = acgxVar;
        this.k = cedmVar;
        this.l = baidVar;
        this.m = ehbbVar;
        this.n = ehacVar;
        this.o = aurxVar;
        this.p = bvllVar;
        this.e = fcsuVar;
        this.q = cyosVar;
        this.f = fcsuVar2;
        this.r = egytVar;
        this.s = fcsuVar3;
    }

    public final void a() {
        this.b.f();
    }

    public final void b() {
        this.w.b();
    }

    public final void c() {
        this.w.a(this.j.a(this.i.G(), null));
    }

    public final void d() {
        fcsu fcsuVar = this.l.a;
        ea eaVar = this.i;
        eg egVarG = eaVar.G();
        axgc axgcVar = (axgc) fcsuVar.b();
        axgcVar.getClass();
        egVarG.getClass();
        baic baicVar = new baic(axgcVar, egVarG, this);
        babw babwVar = this.b;
        babwVar.c(baicVar);
        baic baicVar2 = (baic) babwVar.a();
        lzg lzgVarA = lzg.a(eaVar);
        Bundle bundle = new Bundle();
        bundle.putString("bindingId", babwVar.b());
        baicVar2.a = lzgVarA;
        baicVar2.a.c(1, bundle, baicVar2);
        cyos cyosVar = this.q;
        fcsu fcsuVar2 = cyosVar.a;
        eg egVarG2 = eaVar.G();
        cqjk cqjkVar = (cqjk) fcsuVar2.b();
        cqjkVar.getClass();
        cqtj cqtjVar = (cqtj) cyosVar.b.b();
        cqtjVar.getClass();
        ains ainsVar = (ains) cyosVar.c.b();
        ainsVar.getClass();
        ains ainsVar2 = (ains) cyosVar.d.b();
        ainsVar2.getClass();
        cema cemaVar = (cema) cyosVar.e.b();
        cemaVar.getClass();
        ((bvfe) cyosVar.f.b()).getClass();
        cfga cfgaVar = (cfga) cyosVar.g.b();
        cfgaVar.getClass();
        einm einmVar = (einm) cyosVar.i.b();
        einmVar.getClass();
        eigp eigpVar = (eigp) cyosVar.j.b();
        eigpVar.getClass();
        ((apov) cyosVar.m.b()).getClass();
        egVarG2.getClass();
        Optional optional = this.g;
        optional.getClass();
        this.c = new cyor(cqjkVar, cqtjVar, ainsVar, ainsVar2, cemaVar, cfgaVar, cyosVar.h, einmVar, eigpVar, cyosVar.k, cyosVar.l, cyosVar.n, egVarG2, optional);
        this.k.w();
        if (optional.isPresent()) {
            Optional optional2 = this.h;
            if (optional2.isPresent()) {
                ((cyqs) optional2.get()).c();
                if (((aqpb) this.s.b()).a()) {
                    ehbb ehbbVar = this.m;
                    bvll bvllVar = this.p;
                    ehbbVar.g(R.id.can_register_with_gaia_pairing_data_source_id, bvllVar.a(), this.u);
                }
            }
        }
    }

    public final View e() {
        ea eaVar = this.i;
        RecyclerView recyclerView = new RecyclerView(eaVar.G());
        recyclerView.aK();
        recyclerView.setVerticalScrollBarEnabled(true);
        eaVar.G();
        recyclerView.ao(new LinearLayoutManager());
        recyclerView.al(this.c);
        recyclerView.y(new cyof());
        ehac ehacVar = this.n;
        ehacVar.a(this.o.e(), this.t);
        ehacVar.b(new egys(this.r, new eopk() { // from class: cyob
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                final cehg cehgVar = (cehg) this.a.f.b();
                ceox ceoxVar = cehgVar.s;
                final Context context = cehgVar.h;
                return new eopy(eijx.g(new Callable() { // from class: ceow
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Integer.valueOf(ceox.b(context));
                    }
                }, ceoxVar.a).i(new eooz() { // from class: cegg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Integer num = (Integer) obj;
                        if (num == null || num.intValue() != 1) {
                            cehg.a.m("Battery is not optimized");
                            return eijx.e(false);
                        }
                        final cehg cehgVar2 = cehgVar;
                        return ((ceus) cehgVar2.n.b()).a().i(new eooz() { // from class: cefz
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                Long l = (Long) obj2;
                                if (l == null || l.longValue() <= 0) {
                                    cehg.a.m("Fcm has never been downgraded");
                                    return eijx.e(false);
                                }
                                boolean z = l.longValue() + TimeUnit.DAYS.toMicros((long) ((Integer) cehg.f.e()).intValue()) > TimeUnit.MILLISECONDS.toMicros(cehgVar2.m.f().toEpochMilli());
                                cqbd cqbdVarA = cehg.a.a();
                                cqbdVarA.B("Fcm has been recently downgraded", z);
                                cqbdVarA.r();
                                return eijx.e(Boolean.valueOf(z));
                            }
                        }, cehgVar2.i);
                    }
                }, cehgVar.i));
            }
        }, "SHOW_DITTO_BATTERY_PROMO"), egzr.FEW_HOURS, this.v);
        View viewFindViewById = eaVar.fg().findViewById(android.R.id.content);
        if (viewFindViewById != null) {
            ldn ldnVar = new ldn() { // from class: cyoc
                @Override // defpackage.ldn
                public final lgt ez(View view, lgt lgtVar) {
                    kzc kzcVarF = lgtVar.f(519);
                    view.setPadding(kzcVarF.b, 0, kzcVarF.d, 0);
                    return lgtVar;
                }
            };
            int[] iArr = ley.a;
            len.k(viewFindViewById, ldnVar);
        }
        return recyclerView;
    }
}
