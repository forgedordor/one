package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anxy implements anpj {
    public static final eksp a = eksp.c("BugleRecipients");
    public final awhr b;
    public final awhr c;
    public final cqtq d;
    public final ekgb e;
    public final ekhx f;
    private final eosc g;
    private final eosc h;
    private final int i;

    public anxy(eosc eoscVar, eosc eoscVar2, awlc awlcVar, awhr awhrVar, awhr awhrVar2, cqtp cqtpVar, ekgb ekgbVar, int i) {
        anxx anxxVar = new anxx(this);
        this.g = eoscVar;
        this.h = eoscVar2;
        this.b = awhrVar;
        this.c = awhrVar2;
        this.e = ekgbVar;
        this.f = ekhx.o((Collection) Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: anxt
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
            public final boolean test(Object obj) {
                eksp ekspVar = anxy.a;
                return ((alqm) obj).e().isPresent();
            }
        }).map(new Function() { // from class: anxk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = anxy.a;
                return (aubq) ((alqm) obj).e().get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a));
        this.i = i;
        this.d = cqtpVar.a(new anxu(awlcVar, anxxVar));
    }

    private static String d(List list) {
        Stream map = Collection.EL.stream(list).map(new Function() { // from class: anxr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = anxy.a;
                return cqcv.c((alqm) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return anxj.a((Iterable) map.collect(ekcv.a));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.d.a(new cqtk() { // from class: anxs
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                eksp ekspVar = anxy.a;
                return anpiVar.a();
            }
        }, "ProviderBatchRcsCapabilitiesSupplier::register", "ProviderBatchRcsCapabilitiesSupplier::callback", "ProviderBatchRcsCapabilitiesSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        eiju eijuVarH;
        if (this.i == 1) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderBatchRcsCapabilitiesSupplier", "getAsync", 89, "ProviderBatchRcsCapabilitiesSupplier.java")).t("Retrieving RCS Capabilities in batch from Network for identities: %s", d(this.e));
            eijuVarH = eijx.h(new eooy() { // from class: anxo
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    anxy anxyVar = this.a;
                    return anxyVar.c.b(anxyVar.e);
                }
            }, this.h);
        } else {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderBatchRcsCapabilitiesSupplier", "getAsync", 97, "ProviderBatchRcsCapabilitiesSupplier.java")).t("Retrieving RCS Capabilities in batch from Storage for identities: %s", d(this.e));
            eijuVarH = eijx.h(new eooy() { // from class: anxp
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    anxy anxyVar = this.a;
                    return anxyVar.b.b(anxyVar.e);
                }
            }, this.g);
        }
        return eijuVarH.h(new ejvr() { // from class: anxq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = anxy.a;
                return (ekgp) Collection.EL.stream(((Map) obj).entrySet()).collect(ekcv.a(new Function() { // from class: anxm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (alqm) ((Map.Entry) obj2).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: anxn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        eksp ekspVar2 = anxy.a;
                        return anzd.a((awhp) ((Map.Entry) obj2).getValue());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
            }
        }, this.g);
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
