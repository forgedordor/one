package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpi {
    public static final cczi a = cdag.f(cdag.b, "fi_phone_number_fresh_period_ms", 86400000);
    public static final ejxr b = cdag.v("get_fi_user_standing_single_call");
    public final ceqp c;
    public final egyt d;
    public final aurx e;
    public final cogw f;
    public final eosc g;
    public final eosc h;
    public final crmx i;
    public final alrj j;
    public final fcsu k;
    public egpe l;

    public tpi(ceqp ceqpVar, egyt egytVar, aurx aurxVar, cogw cogwVar, eosc eoscVar, eosc eoscVar2, crmx crmxVar, alrj alrjVar, fcsu fcsuVar) {
        this.c = ceqpVar;
        this.d = egytVar;
        this.e = aurxVar;
        this.f = cogwVar;
        this.g = eoscVar;
        this.h = eoscVar2;
        this.i = crmxVar;
        this.j = alrjVar;
        this.k = fcsuVar;
    }

    private final eiju d() {
        eiju eijuVarA = this.c.a();
        eooz eoozVar = new eooz() { // from class: tph
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String strX = ((eymf) obj).c;
                boolean zBooleanValue = ((Boolean) ((cczi) cpyl.U.get()).e()).booleanValue();
                tpi tpiVar = this.a;
                if (zBooleanValue) {
                    strX = tpiVar.i.x(strX);
                }
                aurx aurxVar = tpiVar.e;
                auly aulyVar = (auly) aulz.a.createBuilder();
                aulyVar.copyOnWrite();
                aulz aulzVar = (aulz) aulyVar.instance;
                strX.getClass();
                aulzVar.b |= 1;
                aulzVar.c = strX;
                long epochMilli = aurxVar.d.f().toEpochMilli();
                aulyVar.copyOnWrite();
                aulz aulzVar2 = (aulz) aulyVar.instance;
                aulzVar2.b |= 2;
                aulzVar2.d = epochMilli;
                final aulz aulzVar3 = (aulz) aulyVar.build();
                return aurxVar.z(new Function() { // from class: aunh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        aumg aumgVar = (aumg) obj2;
                        cqce cqceVar = aurx.a;
                        aumgVar.copyOnWrite();
                        aumq aumqVar = (aumq) aumgVar.instance;
                        aumq aumqVar2 = aumq.a;
                        aulz aulzVar4 = aulzVar3;
                        aulzVar4.getClass();
                        aumqVar.u = aulzVar4;
                        aumqVar.b |= 131072;
                        return aumgVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        };
        eosc eoscVar = this.h;
        return eijuVarA.i(eoozVar, eoscVar).i(new eooz() { // from class: tox
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.e.g();
            }
        }, eoscVar).h(new ejvr() { // from class: toy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((aulz) obj).c;
            }
        }, this.g);
    }

    private final synchronized eiju e() {
        egpe egpeVar = this.l;
        if (egpeVar != null) {
            return eiju.g(egpeVar.c());
        }
        eiju eijuVarD = d();
        ejvr ejvrVar = new ejvr() { // from class: tpe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                tpi tpiVar = this.a;
                String str = (String) obj;
                synchronized (tpiVar) {
                    tpiVar.l = null;
                }
                return str;
            }
        };
        eosc eoscVar = this.g;
        final eiju eijuVarH = eijuVarD.h(ejvrVar, eoscVar);
        this.l = new egpe(new eooy() { // from class: tpf
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                cczi ccziVar = tpi.a;
                return eijuVarH;
            }
        }, eoscVar);
        return eijuVarH;
    }

    public final alqm a(eymf eymfVar) {
        alrj alrjVar = this.j;
        alqm alqmVarN = alrjVar.n(eymfVar.c);
        return ((Boolean) ((cczi) cpyl.U.get()).e()).booleanValue() ? alrjVar.k(alqmVarN) : alqmVarN;
    }

    public final eiju b() {
        return ((Boolean) ((cczi) b.get()).e()).booleanValue() ? e() : d();
    }

    public final eiju c() {
        final eiju eijuVarH = b().h(new ejvr() { // from class: tpc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((dggw) this.a.k.b()).v((String) obj));
            }
        }, this.g);
        eiju eijuVarA = this.c.a();
        ejvr ejvrVar = new ejvr() { // from class: tow
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eymf eymfVar = (eymf) obj;
                cczv cczvVar = alvx.a;
                boolean zBooleanValue = ((Boolean) new alvg().get()).booleanValue();
                tpi tpiVar = this.a;
                boolean zContains = zBooleanValue ? tpiVar.i.d().contains(tpiVar.a(eymfVar)) : tpiVar.i.C().contains(eymfVar.c);
                boolean z = false;
                if (zContains && eymfVar.b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        eosc eoscVar = this.h;
        final eiju eijuVarH2 = eijuVarA.h(ejvrVar, eoscVar);
        return eijx.k(eijuVarH2, eijuVarH).a(new Callable() { // from class: tpd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cczi ccziVar = tpi.a;
                trr trrVar = (trr) trs.a.createBuilder();
                boolean zBooleanValue = ((Boolean) eork.q(eijuVarH2)).booleanValue();
                trrVar.copyOnWrite();
                trs trsVar = (trs) trrVar.instance;
                trsVar.b |= 1;
                trsVar.c = zBooleanValue;
                boolean zBooleanValue2 = ((Boolean) eork.q(eijuVarH)).booleanValue();
                trrVar.copyOnWrite();
                trs trsVar2 = (trs) trrVar.instance;
                trsVar2.b |= 2;
                trsVar2.d = zBooleanValue2;
                return trrVar.build();
            }
        }, eoscVar);
    }
}
