package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqrx {
    public final cqrq a;
    public final eosc b;
    public final Set c;
    public final cqrg d;
    public final fcsu e;
    private final egpe f;

    public cqrx(cqrq cqrqVar, eosc eoscVar, Set set, cqsh cqshVar, fcsu fcsuVar) {
        this.a = cqrqVar;
        this.b = eoscVar;
        this.c = set;
        this.d = cqshVar;
        this.e = fcsuVar;
        this.f = new egpe(new eooy() { // from class: cqrv
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final cqrx cqrxVar = this.a;
                return eiju.g(cqrxVar.a.i.c()).i(new eooz() { // from class: cqrw
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ekho ekhoVarA;
                        final cqrx cqrxVar2 = cqrxVar;
                        Integer num = (Integer) obj;
                        boolean zA = ((eoth) ((arem) ((cqsd) cqrxVar2.e.b()).a).a.b()).a("bugle.survey_map_bugfix");
                        Set set2 = cqrxVar2.c;
                        cqrg cqrgVar = cqrxVar2.d;
                        Integer numValueOf = Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
                        int i = 0;
                        double d = 0.0d;
                        if (zA) {
                            Stream streamSorted = Collection.EL.stream(set2).filter(new Predicate() { // from class: cqrz
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo538negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj2) {
                                    return !((cqrf) obj2).d().isEmpty();
                                }
                            }).sorted(new Comparator() { // from class: cqsa
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    return ((cqrf) obj2).d().compareTo(((cqrf) obj3).d());
                                }
                            });
                            int i2 = ekgb.d;
                            ekgb ekgbVar = (ekgb) streamSorted.collect(ekcv.a);
                            ekho ekhoVar = ekho.a;
                            ArrayList arrayList = new ArrayList();
                            int size = ekgbVar.size();
                            while (i < size) {
                                cqrf cqrfVar = (cqrf) ekgbVar.get(i);
                                double dA = cqrfVar.a() + d;
                                eknz eknzVarD = eknz.d(Integer.valueOf(cqsd.a(d)), Integer.valueOf(cqsd.a(dA)));
                                if (!eknzVarD.k()) {
                                    ekhm.b(eknzVarD, cqrfVar, arrayList);
                                    d = dA;
                                }
                                i++;
                            }
                            ekhm.b(eknz.c(Integer.valueOf(cqsd.a(d)), numValueOf), cqrgVar, arrayList);
                            ekhoVarA = ekhm.a(arrayList);
                        } else {
                            Stream streamSorted2 = Collection.EL.stream(set2).filter(new Predicate() { // from class: cqsb
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo538negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj2) {
                                    return !((cqrf) obj2).d().isEmpty();
                                }
                            }).sorted(new Comparator() { // from class: cqsc
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    return ((cqrf) obj2).d().compareTo(((cqrf) obj3).d());
                                }
                            });
                            int i3 = ekgb.d;
                            ekgb ekgbVar2 = (ekgb) streamSorted2.collect(ekcv.a);
                            ekho ekhoVar2 = ekho.a;
                            ArrayList arrayList2 = new ArrayList();
                            int size2 = ekgbVar2.size();
                            double d2 = 0.0d;
                            while (i < size2) {
                                cqrf cqrfVar2 = (cqrf) ekgbVar2.get(i);
                                double dA2 = cqrfVar2.a();
                                if (dA2 != 0.0d) {
                                    double d3 = dA2 + d2;
                                    ekhm.b(eknz.d(Integer.valueOf(cqsd.a(d2)), Integer.valueOf(cqsd.a(d3))), cqrfVar2, arrayList2);
                                    d2 = d3;
                                }
                                i++;
                            }
                            ekhm.b(eknz.c(Integer.valueOf(cqsd.a(d2)), numValueOf), cqrgVar, arrayList2);
                            ekhoVarA = ekhm.a(arrayList2);
                        }
                        ejvr ejvrVar = new ejvr() { // from class: ekhl
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return ((eknz) obj2).b;
                            }
                        };
                        ekdw ekdwVar = new ekdw(num);
                        ekgb ekgbVar3 = ekhoVarA.b;
                        int iA = ekpl.a(ekgbVar3, ejvrVar, ekdwVar, 1, 1);
                        Object obj2 = null;
                        if (iA != -1 && ((eknz) ekgbVar3.get(iA)).a(num)) {
                            obj2 = ekhoVarA.c.get(iA);
                        }
                        final cqrg cqrgVar2 = (cqrg) obj2;
                        return cqrgVar2 instanceof cqrf ? ((cqrf) cqrgVar2).b().h(new ejvr() { // from class: cqru
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return ((Boolean) obj3).booleanValue() ? cqrgVar2 : cqrxVar2.d;
                            }
                        }, cqrxVar2.b) : eijx.e(cqrgVar);
                    }
                }, cqrxVar.b);
            }
        }, eoscVar);
    }

    public final eiju a() {
        if (((Boolean) cqry.s.e()).booleanValue()) {
            return eijx.e((cqrg) this.c.iterator().next());
        }
        egpe egpeVar = this.f;
        egpeVar.getClass();
        return eiju.g(egpeVar.c());
    }
}
