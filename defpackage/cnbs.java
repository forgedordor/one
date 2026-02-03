package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.net.URI;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbs implements cnfu {
    private final cnlh a;
    private final fcsu b;
    private final fcsu c;
    private final cnck d;
    private final eosc e;

    public cnbs(cnlh cnlhVar, fcsu fcsuVar, fcsu fcsuVar2, cnck cnckVar, eosc eoscVar) {
        this.a = cnlhVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = cnckVar;
        this.e = eoscVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq a(Object obj) {
        throw new IllegalStateException("Cannot get remote user for create group request");
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq b(Object obj) {
        auce auceVar = (auce) obj;
        ejwl.b((auceVar.b & 8) != 0, "Self identity is missing in CreateGroupChatRequest");
        aubq aubqVar = auceVar.f;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        final auce auceVar = (auce) obj;
        aubq aubqVar = auceVar.f;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        return this.a.b(aubqVar).i(new eooz() { // from class: cnbr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                int i;
                eqcz eqczVar;
                cnku cnkuVar = (cnku) obj2;
                eqeb eqebVarA = eqec.a();
                auce auceVar2 = auceVar;
                eqebVarA.d((auceVar2.b & 2) != 0 ? auceVar2.d : "");
                aueb auebVar = auceVar2.i;
                if (auebVar == null) {
                    auebVar = aueb.a;
                }
                auebVar.getClass();
                fcxe fcxeVar = new fcxe();
                if ((auebVar.b & 1) != 0) {
                    fcxeVar.put("is_upgrade_from_mms_group", true != auebVar.c ? "0" : "1");
                }
                eqebVarA.c(fcwa.b(fcxeVar));
                eqebVarA.b((auceVar2.b & 4) != 0 ? new eqdp(auceVar2.e) : eqdp.a);
                eqdc eqdcVar = new eqdc();
                ezok ezokVarA = cnln.a();
                felm felmVar = felm.GROUP_ID;
                ezokVarA.copyOnWrite();
                ezol ezolVar = (ezol) ezokVarA.instance;
                ezol ezolVar2 = ezol.a;
                ezolVar.b = felmVar.a();
                String str = auceVar2.c;
                ezokVarA.copyOnWrite();
                ezol ezolVar3 = (ezol) ezokVarA.instance;
                str.getClass();
                ezolVar3.c = str;
                eqdcVar.c((ezol) ezokVarA.build());
                eqdr eqdrVarA = eqdcVar.a();
                eqed eqedVarA = eqebVarA.a();
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                ekfwVar.j(auceVar2.g);
                aubq aubqVar2 = auceVar2.f;
                if (aubqVar2 == null) {
                    aubqVar2 = aubq.a;
                }
                ekfwVar.h(aubqVar2);
                ekgb ekgbVarG = ekfwVar.g();
                final cnbb cnbbVar = new cnbb();
                ekgb ekgbVar = (ekgb) Collection.EL.stream(ekgbVarG).map(new Function() { // from class: cnbq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return (ezol) cnbbVar.fM((aubq) obj3);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.a);
                ekgbVar.getClass();
                ekhv ekhvVar = new ekhv();
                ekhvVar.j(ekgbVar);
                if ((auceVar2.b & 64) != 0) {
                    auib auibVar = auceVar2.j;
                    if (auibVar == null) {
                        auibVar = auib.a;
                    }
                    eqczVar = new eqcz(auibVar.c);
                    i = 15;
                } else {
                    i = 7;
                    eqczVar = null;
                }
                ekhx ekhxVarG = ekhvVar.g();
                if (((~i) & 8) != 0) {
                    eqczVar = null;
                }
                return auvw.c(cnkuVar.b, fcyi.a, fdjz.a, new cnkq(cnkuVar, new eqdi(eqdrVarA, eqedVarA, ekhxVarG, eqczVar), null));
            }
        }, this.e);
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju d(Object obj, aubl aublVar) {
        asrc asrcVar = (asrc) this.b.b();
        aucg aucgVar = (aucg) auch.a.createBuilder();
        evqs evqsVar = ((auce) obj).h;
        aucgVar.copyOnWrite();
        auch auchVar = (auch) aucgVar.instance;
        evqsVar.getClass();
        auchVar.b |= 4;
        auchVar.e = evqsVar;
        aucgVar.copyOnWrite();
        auch auchVar2 = (auch) aucgVar.instance;
        aublVar.getClass();
        auchVar2.c = aublVar;
        auchVar2.b |= 1;
        return asrcVar.b((auch) aucgVar.build());
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju e(Object obj, Object obj2) {
        final auce auceVar = (auce) obj;
        final eqds eqdsVar = (eqds) obj2;
        eqdr eqdrVar = eqdsVar.a;
        ejwl.m(eqdrVar.b.isPresent(), "Expect conference URI in create group response.");
        ezol ezolVar = eqdrVar.a;
        evqs evqsVar = ezolVar.e;
        if (!evqs.b.equals(evqsVar)) {
            return this.d.c(ezolVar.c, evqsVar).i(new eooz() { // from class: cnbp
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj3) {
                    return this.a.f(auceVar, eqdsVar);
                }
            }, this.e);
        }
        eksl ekslVar = (eksl) cnbt.a.h();
        ekslVar.X(cqnc.N, ezolVar.c);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramCreateGroupWorkHandler$TachygramCreateGroupOperation", "onSuccess", 163, "TachygramCreateGroupWorkHandler.java")).q("Created a tachygram group with a missing routing info token.");
        return f(auceVar, eqdsVar);
    }

    public final eiju f(auce auceVar, eqds eqdsVar) {
        asrc asrcVar = (asrc) this.b.b();
        aucg aucgVar = (aucg) auch.a.createBuilder();
        evqs evqsVar = auceVar.h;
        aucgVar.copyOnWrite();
        auch auchVar = (auch) aucgVar.instance;
        evqsVar.getClass();
        auchVar.b |= 4;
        auchVar.e = evqsVar;
        aubq aubqVarE = ((asqx) this.c.b()).e(((URI) eqdsVar.a.b.get()).toString());
        aucgVar.copyOnWrite();
        auch auchVar2 = (auch) aucgVar.instance;
        aubqVarE.getClass();
        auchVar2.d = aubqVarE;
        auchVar2.b |= 2;
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.OK;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubl aublVar2 = (aubl) aubgVar.build();
        aucgVar.copyOnWrite();
        auch auchVar3 = (auch) aucgVar.instance;
        aublVar2.getClass();
        auchVar3.c = aublVar2;
        auchVar3.b |= 1;
        enyw enywVar = enyw.RCS_TACHYGRAM;
        aucgVar.copyOnWrite();
        auch auchVar4 = (auch) aucgVar.instance;
        auchVar4.f = enywVar.h;
        auchVar4.b |= 8;
        return asrcVar.b((auch) aucgVar.build());
    }

    @Override // defpackage.cnfu
    public final /* synthetic */ String g(Object obj) {
        return ((auce) obj).c;
    }

    @Override // defpackage.cnfu
    public final String h() {
        return "TachygramCreateGroupOperation";
    }

    @Override // defpackage.cnfu
    public final boolean i() {
        return false;
    }
}
