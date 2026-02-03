package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.eyhq;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnba extends dpxo implements eyhy {
    private ContextWrapper a;
    private boolean b;
    private volatile eyhj c;
    private final Object d;
    private boolean e;

    dnba() {
        this.d = new Object();
        this.e = false;
    }

    private final void a() {
        if (this.a == null) {
            this.a = new eyhq.a(super.z(), this);
            this.b = eygr.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.luv
    public final lxk R() {
        return eygu.b(this, super.R());
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && eyhj.d(contextWrapper) != activity) {
            z = false;
        }
        eyhz.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        bm();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: bl, reason: merged with bridge method [inline-methods] */
    public final eyhj ba() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new eyhj(this);
                }
            }
        }
        return this.c;
    }

    protected final void bm() {
        if (this.e) {
            return;
        }
        this.e = true;
        dnau dnauVar = (dnau) this;
        ahib ahibVar = (ahib) bb();
        ahkn ahknVar = ahibVar.a;
        dnauVar.aM = (eony) ahknVar.lp.b();
        dnauVar.aN = ahknVar.lo;
        dnauVar.aO = (fdjx) ahibVar.g.b();
        dnauVar.aP = Optional.of(ahibVar.P);
        dnauVar.aQ = (Optional) ahibVar.n.b();
        dnauVar.am = (dnho) ahibVar.bI.b();
        ahnh ahnhVar = ahknVar.a;
        eyik eyikVar = ahnhVar.oQ;
        eyik eyikVar2 = ahibVar.N;
        ahng ahngVar = ahknVar.b;
        eyik eyikVar3 = ahibVar.L;
        eyik eyikVar4 = ahknVar.lo;
        eyik eyikVar5 = ahngVar.kd;
        eyik eyikVar6 = ahngVar.oa;
        dnauVar.an = new dmbd(eyikVar, eyikVar2, eyikVar6, eyikVar3, eyikVar4, eyikVar5);
        ahhk ahhkVar = ahibVar.c;
        eyik eyikVar7 = ahhkVar.bi;
        dnauVar.ao = (dnhb) eyikVar7.b();
        dnauVar.ap = new dnbl(ahibVar.bL);
        final fdjx fdjxVar = (fdjx) ahibVar.g.b();
        final ea eaVar = (ea) ((eyig) ahibVar.d).a;
        Optional optionalOf = Optional.of(new dmjb(new dmjc(new dmjg(ahknVar.lo)), Optional.of(new dmtc(new dmts(ahhkVar.d, ahibVar.d, ahibVar.bM, ahknVar.lo, ahibVar.g, eyikVar2, eyikVar7))), new dmtt(new dmtx(ahknVar.lo))));
        fdjxVar.getClass();
        final fdap fdapVar = new fdap() { // from class: dnbg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dmix dmixVar = (dmix) obj;
                dmixVar.getClass();
                return new dnbf(fdjxVar, eaVar, dmixVar);
            }
        };
        Optional map = optionalOf.map(new Function() { // from class: dnbh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        dnauVar.aq = map;
        dnauVar.ar = new dnbs(eyikVar7);
        dnauVar.as = new dpyj(ahibVar.d);
        dnauVar.at = new dncb();
        dnauVar.au = (Activity) ahhkVar.d.b();
        dnauVar.av = Optional.empty();
        dnauVar.aw = Optional.empty();
        dnauVar.ax = (dolm) eyikVar6.b();
        dnauVar.ay = (dlvl) eyikVar3.b();
        dnauVar.az = (fdjx) ahnhVar.oQ.b();
        dnauVar.aA = Optional.of((ujf) ahhkVar.C.b());
        dnauVar.aB = new dmyt(ahhkVar.d, ahibVar.bO);
        dnauVar.aC = Optional.of(Boolean.valueOf(ahngVar.dg()));
        aqkn aqknVar = (aqkn) ahngVar.nY.b();
        aqknVar.getClass();
        dnauVar.aD = Optional.of(Boolean.valueOf(aqknVar.a()));
        dnauVar.aE = ahngVar.kd;
    }

    @Override // defpackage.dpil, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        a();
        bm();
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        LayoutInflater layoutInflaterAO = aO();
        return layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }

    public dnba(Integer num, dpxp dpxpVar) {
        super(num, dpxpVar);
        this.d = new Object();
        this.e = false;
    }
}
