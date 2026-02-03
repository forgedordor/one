package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cngd implements cnfu {
    public final cnlh a;
    public final fcsu b;
    public final fcsu c;
    public final eosc d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public cngd(cnlh cnlhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar, fcsu fcsuVar5) {
        this.a = cnlhVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.d = eoscVar;
        this.g = fcsuVar5;
    }

    public static ekgb f(augi augiVar) {
        final cnbb cnbbVar = new cnbb();
        Stream map = Collection.EL.stream(augiVar.d).map(new Function() { // from class: cngb
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
        audu auduVar = ((augi) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq b(Object obj) {
        augi augiVar = (augi) obj;
        ejwl.b((augiVar.b & 4) != 0, "Self identity is missing in RemoveUserFromGroupChatRequest");
        aubq aubqVar = augiVar.f;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        final augi augiVar = (augi) obj;
        ejwl.l(augiVar.d.size() != 0);
        ejwl.l((augiVar.b & 4) != 0);
        final eqcz eqczVar = null;
        if ((augiVar.b & 8) != 0 && ((ardx) this.g.b()).a()) {
            auib auibVar = augiVar.g;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            eqczVar = new eqcz(auibVar.c);
        }
        cnao cnaoVar = (cnao) this.f.b();
        audu auduVar = augiVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return cnaoVar.a(auduVar).i(new eooz() { // from class: cngc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                final eqdr eqdrVar = (eqdr) obj2;
                cngd cngdVar = this.a;
                boolean zA = ((arob) cngdVar.c.b()).a();
                final augi augiVar2 = augiVar;
                final eqcz eqczVar2 = eqczVar;
                if (zA) {
                    fcsu fcsuVar = cngdVar.b;
                    if (((Optional) fcsuVar.b()).isPresent()) {
                        cnlh cnlhVar = cngdVar.a;
                        aubq aubqVar = augiVar2.f;
                        if (aubqVar == null) {
                            aubqVar = aubq.a;
                        }
                        return cnlhVar.c(aubqVar, (eqfh) ((Optional) fcsuVar.b()).get()).i(new eooz() { // from class: cnfz
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return ((cnku) obj3).b(eqdrVar, cngd.f(augiVar2), eqczVar2);
                            }
                        }, cngdVar.d);
                    }
                }
                cnlh cnlhVar2 = cngdVar.a;
                aubq aubqVar2 = augiVar2.f;
                if (aubqVar2 == null) {
                    aubqVar2 = aubq.a;
                }
                return cnlhVar2.b(aubqVar2).i(new eooz() { // from class: cnga
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj3) {
                        return ((cnku) obj3).b(eqdrVar, cngd.f(augiVar2), eqczVar2);
                    }
                }, cngdVar.d);
            }
        }, this.d);
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju d(Object obj, aubl aublVar) {
        asrc asrcVar = (asrc) this.e.b();
        evqs evqsVar = ((augi) obj).e;
        augj augjVar = (augj) augk.a.createBuilder();
        augjVar.copyOnWrite();
        augk augkVar = (augk) augjVar.instance;
        evqsVar.getClass();
        augkVar.b |= 2;
        augkVar.d = evqsVar;
        augjVar.copyOnWrite();
        augk augkVar2 = (augk) augjVar.instance;
        aublVar.getClass();
        augkVar2.c = aublVar;
        augkVar2.b |= 1;
        return asrcVar.g((augk) augjVar.build());
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju e(Object obj, Object obj2) {
        asrc asrcVar = (asrc) this.e.b();
        evqs evqsVar = ((augi) obj).e;
        aubk aubkVar = aubk.OK;
        augj augjVar = (augj) augk.a.createBuilder();
        augjVar.copyOnWrite();
        augk augkVar = (augk) augjVar.instance;
        evqsVar.getClass();
        augkVar.b |= 2;
        augkVar.d = evqsVar;
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubl aublVar2 = (aubl) aubgVar.build();
        augjVar.copyOnWrite();
        augk augkVar2 = (augk) augjVar.instance;
        aublVar2.getClass();
        augkVar2.c = aublVar2;
        augkVar2.b |= 1;
        return asrcVar.g((augk) augjVar.build());
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        audu auduVar = ((augi) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return auduVar.c;
    }

    @Override // defpackage.cnfu
    public final String h() {
        return "TachygramRemoveUserFromGroupOperation";
    }

    @Override // defpackage.cnfu
    public final boolean i() {
        return false;
    }
}
