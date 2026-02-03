package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnhq implements cnfu {
    public final cnlh a;
    public final fcsu b;
    public final eosc c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public cnhq(cnlh cnlhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.a = cnlhVar;
        this.b = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.c = eoscVar;
        this.h = fcsuVar4;
        this.d = fcsuVar5;
        this.e = fcsuVar6;
    }

    public static auis f(evqs evqsVar, aubl aublVar) {
        auir auirVar = (auir) auis.a.createBuilder();
        auirVar.copyOnWrite();
        auis auisVar = (auis) auirVar.instance;
        evqsVar.getClass();
        auisVar.b |= 2;
        auisVar.d = evqsVar;
        auirVar.copyOnWrite();
        auis auisVar2 = (auis) auirVar.instance;
        aublVar.getClass();
        auisVar2.c = aublVar;
        auisVar2.b |= 1;
        return (auis) auirVar.build();
    }

    public static eqee j(auip auipVar) {
        eqcz eqczVar;
        int i = 0;
        if (!eotp.a("bugle.enable_eagerly_group_renaming", "bugle")) {
            int i2 = auipVar.b;
            ejwl.l(((i2 & 2) == 0 && (i2 & 32) == 0) ? false : true);
        }
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        Optional optionalEmpty3 = Optional.empty();
        if ((auipVar.b & 2) != 0) {
            optionalEmpty = Optional.of(auipVar.d);
            i = 1;
        }
        Optional optional = optionalEmpty;
        if ((auipVar.b & 32) != 0) {
            optionalEmpty2 = Optional.of(new eqdp(auipVar.h));
            i |= 2;
        }
        Optional optional2 = optionalEmpty2;
        if ((auipVar.b & 16) != 0) {
            auib auibVar = auipVar.g;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            eqczVar = new eqcz(auibVar.c);
            i |= 8;
        } else {
            eqczVar = null;
        }
        return new eqee(optional, optional2, optionalEmpty3, eqczVar, (~i) & 15);
    }

    public static final aubq k(auip auipVar) {
        ejwl.b((auipVar.b & 8) != 0, "Self identity is missing in UpdateGroupChatRequest");
        aubq aubqVar = auipVar.f;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    public static final String l(auip auipVar) {
        audu auduVar = auipVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return auduVar.c;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq a(Object obj) {
        audu auduVar = ((auip) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq b(Object obj) {
        return k((auip) obj);
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        final eqee eqeeVarJ;
        final auip auipVar = (auip) obj;
        if (((ardf) this.d.b()).a()) {
            eqeeVarJ = j(auipVar);
            int i = auipVar.b;
            if ((i & 2) == 0 && (i & 32) == 0) {
                return eijx.e(eqeeVarJ);
            }
            if (!((ardk) this.h.b()).a() && (auipVar.b & 2) == 0) {
                return eijx.e(eqeeVarJ);
            }
        } else {
            int i2 = auipVar.b;
            if ((i2 & 2) == 0 && (i2 & 32) == 0) {
                return eijx.e(null);
            }
            if (!((ardk) this.h.b()).a() && (auipVar.b & 2) == 0) {
                return eijx.e(null);
            }
            eqeeVarJ = null;
        }
        cnao cnaoVar = (cnao) this.f.b();
        audu auduVar = auipVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return cnaoVar.a(auduVar).i(new eooz() { // from class: cnhn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                final cnhq cnhqVar = this.a;
                cnlh cnlhVar = cnhqVar.a;
                final eqdr eqdrVar = (eqdr) obj2;
                final auip auipVar2 = auipVar;
                eiju eijuVarB = cnlhVar.b(cnhq.k(auipVar2));
                final eqee eqeeVar = eqeeVarJ;
                return eijuVarB.i(new eooz() { // from class: cnho
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj3) {
                        cnhq cnhqVar2 = cnhqVar;
                        cnku cnkuVar = (cnku) obj3;
                        boolean zA = ((ardf) cnhqVar2.d.b()).a();
                        eqdr eqdrVar2 = eqdrVar;
                        return zA ? cnkuVar.c(eqdrVar2, eqeeVar) : cnkuVar.c(eqdrVar2, cnhq.j(auipVar2)).i(new eooz() { // from class: cnhp
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj4) {
                                return eijx.e(null);
                            }
                        }, cnhqVar2.c);
                    }
                }, cnhqVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju d(Object obj, aubl aublVar) {
        return ((asrc) this.b.b()).k(f(((auip) obj).e, aublVar));
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju e(Object obj, Object obj2) {
        final auip auipVar = (auip) obj;
        final eqee eqeeVar = (eqee) obj2;
        if (((ardf) this.d.b()).a()) {
            eiju eijuVarH = ((ardl) this.e.b()).a() ? ((awng) this.g.b()).c(l(auipVar)).h(new ejvr() { // from class: cnhk
                @Override // defpackage.ejvr
                public final Object apply(Object obj3) {
                    return Optional.of((awpx) obj3);
                }
            }, this.c) : eijx.e(Optional.empty());
            eooz eoozVar = new eooz() { // from class: cnhl
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj3) {
                    auip auipVar2 = auipVar;
                    aubq aubqVarK = cnhq.k(auipVar2);
                    String strL = cnhq.l(auipVar2);
                    final audb audbVar = (audb) audc.c.createBuilder();
                    audbVar.copyOnWrite();
                    audc audcVar = (audc) audbVar.instance;
                    strL.getClass();
                    audcVar.d |= 1;
                    audcVar.e = strL;
                    audbVar.copyOnWrite();
                    audc audcVar2 = (audc) audbVar.instance;
                    aubqVarK.getClass();
                    audcVar2.t = aubqVarK;
                    audcVar2.d |= 4096;
                    aufa aufaVar = (aufa) aufb.a.createBuilder();
                    aufaVar.copyOnWrite();
                    aufb aufbVar = (aufb) aufaVar.instance;
                    aubqVarK.getClass();
                    aufbVar.c = aubqVarK;
                    aufbVar.b |= 1;
                    aufb aufbVar2 = (aufb) aufaVar.build();
                    audbVar.copyOnWrite();
                    audc audcVar3 = (audc) audbVar.instance;
                    aufbVar2.getClass();
                    audcVar3.r = aufbVar2;
                    audcVar3.d |= 1024;
                    Consumer consumer = new Consumer() { // from class: cnhh
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj4) {
                            audb audbVar2 = audbVar;
                            String str = (String) obj4;
                            audbVar2.copyOnWrite();
                            audc audcVar4 = (audc) audbVar2.instance;
                            evsy evsyVar = audc.a;
                            str.getClass();
                            audcVar4.d |= 16;
                            audcVar4.l = str;
                            boolean zIsEmpty = str.isEmpty();
                            audbVar2.copyOnWrite();
                            audc audcVar5 = (audc) audbVar2.instance;
                            audcVar5.d |= 8;
                            audcVar5.k = zIsEmpty;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    };
                    eqee eqeeVar2 = eqeeVar;
                    eqeeVar2.a.ifPresent(consumer);
                    eqeeVar2.b.ifPresent(new Consumer() { // from class: cnhi
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj4) {
                            String str = ((eqdp) obj4).b;
                            audb audbVar2 = audbVar;
                            audbVar2.copyOnWrite();
                            audc audcVar4 = (audc) audbVar2.instance;
                            evsy evsyVar = audc.a;
                            audcVar4.d |= 64;
                            audcVar4.n = str;
                            boolean zIsEmpty = str.isEmpty();
                            audbVar2.copyOnWrite();
                            audc audcVar5 = (audc) audbVar2.instance;
                            audcVar5.d |= 32;
                            audcVar5.m = zIsEmpty;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    });
                    ((Optional) obj3).ifPresent(new Consumer() { // from class: cnhj
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj4) {
                            awso awsoVarB = awou.b((awpx) obj4);
                            audb audbVar2 = audbVar;
                            audbVar2.copyOnWrite();
                            audc audcVar4 = (audc) audbVar2.instance;
                            evsy evsyVar = audc.a;
                            audcVar4.f = awsoVarB;
                            audcVar4.d |= 4;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    });
                    audc audcVar4 = (audc) audbVar.build();
                    cnhq cnhqVar = this.a;
                    if (!((ardl) cnhqVar.e.b()).a()) {
                        return ((asrc) cnhqVar.b.b()).c(audcVar4);
                    }
                    asrc asrcVar = (asrc) cnhqVar.b.b();
                    aued auedVar = (aued) auee.a.createBuilder();
                    auedVar.b(audcVar4);
                    return asrcVar.e((auee) auedVar.build());
                }
            };
            eosc eoscVar = this.c;
            return eijuVarH.i(eoozVar, eoscVar).i(new eooz() { // from class: cnhm
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj3) {
                    return ((asrc) this.a.b.b()).k(cnhq.f(auipVar.e, (aubl) obj3));
                }
            }, eoscVar);
        }
        asrc asrcVar = (asrc) this.b.b();
        evqs evqsVar = auipVar.e;
        aubk aubkVar = aubk.OK;
        auir auirVar = (auir) auis.a.createBuilder();
        auirVar.copyOnWrite();
        auis auisVar = (auis) auirVar.instance;
        evqsVar.getClass();
        auisVar.b |= 2;
        auisVar.d = evqsVar;
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubl aublVar2 = (aubl) aubgVar.build();
        auirVar.copyOnWrite();
        auis auisVar2 = (auis) auirVar.instance;
        aublVar2.getClass();
        auisVar2.c = aublVar2;
        auisVar2.b |= 1;
        return asrcVar.k((auis) auirVar.build());
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        return l((auip) obj);
    }

    @Override // defpackage.cnfu
    public final String h() {
        return "TachygramUpdateGroupOperation";
    }

    @Override // defpackage.cnfu
    public final boolean i() {
        return false;
    }
}
