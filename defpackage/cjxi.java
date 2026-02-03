package defpackage;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxi {
    public static final cqce a = cqce.g("Bugle", "RcsApplicationDataService");
    public static final egyj b = new egyb("phone_number_input_ui_events_data_source_key");
    public static final egyj c = new egyb("google_tos_ui_events_data_source_key");
    public final cmfo d;
    public final fcsu e;
    public final egzg f;
    public final egzg g;
    public final fcsu h;
    public final fcsu i;
    private final egzg j;
    private final eosc k;

    public cjxi(cmfo cmfoVar, fcsu fcsuVar, egzg egzgVar, egzg egzgVar2, egzg egzgVar3, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar) {
        this.d = cmfoVar;
        this.e = fcsuVar;
        this.j = egzgVar;
        this.f = egzgVar2;
        this.g = egzgVar3;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.k = eoscVar;
    }

    public static cjui a(cjuh cjuhVar, cjsb cjsbVar) {
        Predicate predicate = new Predicate() { // from class: cjvv
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int iB;
                cjsb cjsbVar2 = (cjsb) obj;
                int iB2 = cjrz.b(cjsbVar2.c);
                return iB2 != 0 && iB2 == 3 && (iB = cjrx.b(cjsbVar2.d)) != 0 && iB == 3;
            }
        };
        cjsb cjsbVar2 = (cjsb) Collection.EL.stream(DesugarCollections.unmodifiableList(((cjui) cjuhVar.instance).b)).max(Comparator.CC.comparing(new Function() { // from class: cjvw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                evvp evvpVar = ((cjsb) obj).e;
                return evvpVar == null ? evvp.a : evvpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new cjvi())).orElse(cjsb.a);
        if (!predicate.test(cjsbVar) || !predicate.test(cjsbVar2)) {
            cjuhVar.a(cjsbVar);
            return (cjui) cjuhVar.build();
        }
        a.m("Back to back requests from ProvisioningEngine, updating most recent PhoneNumberInputUIEvent");
        int iIndexOf = DesugarCollections.unmodifiableList(((cjui) cjuhVar.instance).b).indexOf(cjsbVar2);
        cjuhVar.copyOnWrite();
        cjui cjuiVar = (cjui) cjuhVar.instance;
        cjuiVar.a();
        cjuiVar.b.remove(iIndexOf);
        cjrw builder = cjsbVar2.toBuilder();
        evvp evvpVar = cjsbVar.e;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        builder.copyOnWrite();
        cjsb cjsbVar3 = (cjsb) builder.instance;
        evvpVar.getClass();
        cjsbVar3.e = evvpVar;
        cjsbVar3.b |= 4;
        cjuhVar.a(builder.build());
        return (cjui) cjuhVar.build();
    }

    public static ekgb h(List list, cjqu cjquVar) {
        ArrayList arrayList = new ArrayList(list);
        Predicate predicate = new Predicate() { // from class: cjvg
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int iA;
                cjqu cjquVar2 = (cjqu) obj;
                int iA2 = cjqs.a(cjquVar2.c);
                return iA2 != 0 && iA2 == 3 && (iA = cjqr.a(cjquVar2.e)) != 0 && iA == 3;
            }
        };
        cjqu cjquVar2 = (cjqu) Collection.EL.stream(arrayList).max(Comparator.CC.comparing(new Function() { // from class: cjvh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                evvp evvpVar = ((cjqu) obj).f;
                return evvpVar == null ? evvp.a : evvpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new cjvi())).orElse(cjqu.a);
        if (!predicate.test(cjquVar) || !predicate.test(cjquVar2)) {
            arrayList.add(cjquVar);
            return ekgb.n(arrayList);
        }
        a.m("Back to back requests from ProvisioningEngine, updating most recent GoogleTosUiEvent");
        arrayList.remove(cjquVar2);
        cjqq cjqqVar = (cjqq) cjquVar2.toBuilder();
        evvp evvpVar = cjquVar.f;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        cjqqVar.copyOnWrite();
        cjqu cjquVar3 = (cjqu) cjqqVar.instance;
        evvpVar.getClass();
        cjquVar3.f = evvpVar;
        cjquVar3.b |= 8;
        arrayList.add((cjqu) cjqqVar.build());
        return ekgb.n(arrayList);
    }

    public final eiju b(final String str, final cjsb cjsbVar) {
        eiju eijuVarJ = this.d.j(new ejvr() { // from class: cjxe
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjuu cjuuVar = (cjuu) obj;
                cjub cjubVar = (cjub) cjuuVar.toBuilder();
                String str2 = str;
                cjui cjuiVar = cjui.a;
                str2.getClass();
                evub evubVar = cjuuVar.g;
                if (evubVar.containsKey(str2)) {
                    cjuiVar = (cjui) evubVar.get(str2);
                }
                cjui cjuiVarA = cjxi.a((cjuh) cjuiVar.toBuilder(), cjsbVar);
                str2.getClass();
                cjuiVarA.getClass();
                cjubVar.copyOnWrite();
                cjuu cjuuVar2 = (cjuu) cjubVar.instance;
                evub evubVar2 = cjuuVar2.g;
                if (!evubVar2.b) {
                    cjuuVar2.g = evubVar2.a();
                }
                cjuuVar2.g.put(str2, cjuiVarA);
                return (cjuu) cjubVar.build();
            }
        });
        egxy egxyVar = new egxy();
        egxyVar.b(eijuVarJ);
        egxyVar.a = new ejvr() { // from class: cjxf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cjxi.a((cjuh) cjui.a.createBuilder((cjui) obj), cjsbVar);
            }
        };
        egxyVar.c(b);
        return eiju.g(this.j.a(egxyVar.a())).h(new ejvr() { // from class: cjxg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final eiju c() {
        return d().h(new ejvr() { // from class: cjwe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ekgb.n(((cjuu) obj).p);
            }
        }, this.k);
    }

    public final eiju d() {
        return this.d.h().e(cjuv.class, new ejvr() { // from class: cjvt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjxi.a.s("Failed to read RcsApplicationData", (cjuv) obj);
                ((ains) this.a.e.b()).c("Bugle.Rcs.Application.Data.Retrieval.Failure.Count");
                return cjuu.a;
            }
        }, this.k);
    }

    public final eiju e(final String str, final cjtu cjtuVar) {
        eiju eijuVarJ = this.d.j(new ejvr() { // from class: cjwi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjub cjubVar = (cjub) ((cjuu) obj).toBuilder();
                cjtu cjtuVar2 = cjtuVar;
                cjtuVar2.getClass();
                cjubVar.copyOnWrite();
                cjuu cjuuVar = (cjuu) cjubVar.instance;
                evub evubVar = cjuuVar.h;
                if (!evubVar.b) {
                    cjuuVar.h = evubVar.a();
                }
                cjuuVar.h.put(dhhe.g("phone_number_record_for_sim_", str), cjtuVar2);
                return (cjuu) cjubVar.build();
            }
        });
        egxy egxyVar = new egxy();
        egxyVar.b(eijuVarJ);
        egxyVar.c("phone_number_record_data_source_key");
        return eiju.g(this.f.a(egxyVar.a())).h(new ejvr() { // from class: cjwj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final eiju f(final String str, final cjty cjtyVar) {
        return this.d.j(new ejvr() { // from class: cjve
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjub cjubVar = (cjub) ((cjuu) obj).toBuilder();
                String str2 = str;
                str2.getClass();
                cjty cjtyVar2 = cjtyVar;
                cjtyVar2.getClass();
                cjubVar.copyOnWrite();
                cjuu cjuuVar = (cjuu) cjubVar.instance;
                evub evubVar = cjuuVar.l;
                if (!evubVar.b) {
                    cjuuVar.l = evubVar.a();
                }
                cjuuVar.l.put(str2, cjtyVar2);
                return (cjuu) cjubVar.build();
            }
        }).h(new ejvr() { // from class: cjvf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final eiju g(final String str, final int i) {
        return this.d.j(new ejvr() { // from class: cjwv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjub cjubVar = (cjub) ((cjuu) obj).toBuilder();
                String str2 = str;
                str2.getClass();
                cjubVar.copyOnWrite();
                cjuu cjuuVar = (cjuu) cjubVar.instance;
                evub evubVar = cjuuVar.j;
                if (!evubVar.b) {
                    cjuuVar.j = evubVar.a();
                }
                cjuuVar.j.put(str2, Integer.valueOf(i));
                return (cjuu) cjubVar.build();
            }
        }).h(new ejvr() { // from class: cjww
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final void i(final String str, final cjxp cjxpVar) {
        this.d.m(new ejvr() { // from class: cjvo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjub cjubVar = (cjub) ((cjuu) obj).toBuilder();
                String str2 = str;
                str2.getClass();
                cjxp cjxpVar2 = cjxpVar;
                cjxpVar2.getClass();
                cjubVar.copyOnWrite();
                cjuu cjuuVar = (cjuu) cjubVar.instance;
                evub evubVar = cjuuVar.s;
                if (!evubVar.b) {
                    cjuuVar.s = evubVar.a();
                }
                new evtf(cjuuVar.s, cjuu.u).put(str2, cjxpVar2);
                return (cjuu) cjubVar.build();
            }
        });
    }

    public final void j(final String str, final String str2) {
        this.d.m(new ejvr() { // from class: cjux
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjub cjubVar = (cjub) ((cjuu) obj).toBuilder();
                String str3 = str2;
                str3.getClass();
                cjubVar.copyOnWrite();
                cjuu cjuuVar = (cjuu) cjubVar.instance;
                evub evubVar = cjuuVar.r;
                if (!evubVar.b) {
                    cjuuVar.r = evubVar.a();
                }
                cjuuVar.r.put(str, str3);
                return (cjuu) cjubVar.build();
            }
        });
    }

    public final eiju k(final String str, final int i) {
        return this.d.j(new ejvr() { // from class: cjwp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjub cjubVar = (cjub) ((cjuu) obj).toBuilder();
                cjxk cjxkVar = (cjxk) cjxl.a.createBuilder();
                cjxkVar.copyOnWrite();
                ((cjxl) cjxkVar.instance).b = i - 2;
                cjxl cjxlVar = (cjxl) cjxkVar.build();
                String str2 = str;
                str2.getClass();
                cjxlVar.getClass();
                cjubVar.copyOnWrite();
                cjuu cjuuVar = (cjuu) cjubVar.instance;
                evub evubVar = cjuuVar.n;
                if (!evubVar.b) {
                    cjuuVar.n = evubVar.a();
                }
                cjuuVar.n.put(str2, cjxlVar);
                return (cjuu) cjubVar.build();
            }
        }).h(new ejvr() { // from class: cjwq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }
}
