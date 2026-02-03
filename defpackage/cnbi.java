package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbi implements cnfu {
    public final cnlh a;
    public final fcsu b;
    public final fcsu c;
    public final eosc d;
    private final fcsu e;
    private final fcsu f;

    public cnbi(cnlh cnlhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar) {
        this.a = cnlhVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.d = eoscVar;
    }

    public static ekgb f(aubd aubdVar) {
        final cnbb cnbbVar = new cnbb();
        Stream map = Collection.EL.stream(aubdVar.d).map(new Function() { // from class: cnbe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ezol) cnbbVar.fM((aubq) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq a(Object obj) {
        audu auduVar = ((aubd) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq b(Object obj) {
        aubd aubdVar = (aubd) obj;
        ejwl.b((aubdVar.b & 4) != 0, "Self identity is missing in AddUserToGroupChatRequest");
        aubq aubqVar = aubdVar.f;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        final eqcz eqczVar;
        final aubd aubdVar = (aubd) obj;
        ejwl.l(aubdVar.d.size() != 0);
        ejwl.l((aubdVar.b & 4) != 0);
        if ((aubdVar.b & 8) != 0) {
            auib auibVar = aubdVar.g;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            eqczVar = new eqcz(auibVar.c);
        } else {
            eqczVar = null;
        }
        cnao cnaoVar = (cnao) this.f.b();
        audu auduVar = aubdVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return cnaoVar.a(auduVar).i(new eooz() { // from class: cnbf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                final eqdr eqdrVar = (eqdr) obj2;
                cnbi cnbiVar = this.a;
                boolean zA = ((arob) cnbiVar.c.b()).a();
                final aubd aubdVar2 = aubdVar;
                final eqcz eqczVar2 = eqczVar;
                if (zA) {
                    fcsu fcsuVar = cnbiVar.b;
                    if (((Optional) fcsuVar.b()).isPresent()) {
                        cnlh cnlhVar = cnbiVar.a;
                        aubq aubqVar = aubdVar2.f;
                        if (aubqVar == null) {
                            aubqVar = aubq.a;
                        }
                        return cnlhVar.c(aubqVar, (eqfh) ((Optional) fcsuVar.b()).get()).i(new eooz() { // from class: cnbg
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return ((cnku) obj3).a(eqdrVar, cnbi.f(aubdVar2), eqczVar2);
                            }
                        }, cnbiVar.d);
                    }
                }
                cnlh cnlhVar2 = cnbiVar.a;
                aubq aubqVar2 = aubdVar2.f;
                if (aubqVar2 == null) {
                    aubqVar2 = aubq.a;
                }
                return cnlhVar2.b(aubqVar2).i(new eooz() { // from class: cnbh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj3) {
                        return ((cnku) obj3).a(eqdrVar, cnbi.f(aubdVar2), eqczVar2);
                    }
                }, cnbiVar.d);
            }
        }, this.d);
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju d(Object obj, aubl aublVar) {
        asrc asrcVar = (asrc) this.e.b();
        evqs evqsVar = ((aubd) obj).e;
        aube aubeVar = (aube) aubf.a.createBuilder();
        aubeVar.copyOnWrite();
        aubf aubfVar = (aubf) aubeVar.instance;
        evqsVar.getClass();
        aubfVar.b |= 2;
        aubfVar.d = evqsVar;
        aubeVar.copyOnWrite();
        aubf aubfVar2 = (aubf) aubeVar.instance;
        aublVar.getClass();
        aubfVar2.c = aublVar;
        aubfVar2.b |= 1;
        return asrcVar.a((aubf) aubeVar.build());
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju e(Object obj, Object obj2) {
        asrc asrcVar = (asrc) this.e.b();
        evqs evqsVar = ((aubd) obj).e;
        aubk aubkVar = aubk.OK;
        aube aubeVar = (aube) aubf.a.createBuilder();
        aubeVar.copyOnWrite();
        aubf aubfVar = (aubf) aubeVar.instance;
        evqsVar.getClass();
        aubfVar.b |= 2;
        aubfVar.d = evqsVar;
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubl aublVar2 = (aubl) aubgVar.build();
        aubeVar.copyOnWrite();
        aubf aubfVar2 = (aubf) aubeVar.instance;
        aublVar2.getClass();
        aubfVar2.c = aublVar2;
        aubfVar2.b |= 1;
        return asrcVar.a((aubf) aubeVar.build());
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        audu auduVar = ((aubd) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return auduVar.c;
    }

    @Override // defpackage.cnfu
    public final String h() {
        return "TachygramAddUserToGroupOperation";
    }

    @Override // defpackage.cnfu
    public final boolean i() {
        return false;
    }
}
