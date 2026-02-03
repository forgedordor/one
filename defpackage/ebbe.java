package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebbe {
    public final int a;
    public final long b;
    private final List c;
    private final ExecutorService d;
    private final eazn e;

    /* JADX WARN: Multi-variable type inference failed */
    public ebbe(ejqu ejquVar, ExecutorService executorService, eazn eaznVar) {
        ejqw ejqwVar = (ejqw) ejquVar.b.get(0);
        this.a = ejqwVar.b;
        ejrz ejrzVar = (ejrz) ejqwVar.c.get(0);
        this.b = ejrzVar.b;
        this.c = !ejrzVar.d.isEmpty() ? ejrzVar.d : ejqwVar.d;
        this.d = executorService;
        this.e = eaznVar;
    }

    public final eiju a() {
        List list = this.c;
        if (list.isEmpty()) {
            return eijx.e(ekoo.c);
        }
        int i = this.a;
        long j = this.b;
        if (eazg.b(i, j)) {
            eazh eazhVarA = eazg.a(i, j);
            return eazhVarA.a() == 2 ? eijx.d(new ebbd("Cached error attempting to extract the Experiment IDs from Phenotype")) : eijx.e(eazhVarA.b());
        }
        eazn eaznVar = this.e;
        Stream stream = Collection.EL.stream(new HashSet(list));
        final eaaa eaaaVar = eaznVar.b;
        eaaaVar.getClass();
        Stream map = stream.map(new Function() { // from class: eazl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return eaaaVar.d((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        return eiju.g(eijx.j(ekgbVar).a(new Callable() { // from class: eazm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekii ekiiVar = new ekii(ekno.a);
                ekgb ekgbVar2 = ekgbVar;
                int size = ekgbVar2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    try {
                        try {
                            ekiiVar.o(((ekhx) Collection.EL.stream(((dzzw) eork.q((ListenableFuture) ekgbVar2.get(i3))).d).map(new Function() { // from class: eazi
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    try {
                                        eryo eryoVar = (eryo) evsn.parseFrom(eryo.a, (evqs) obj);
                                        int i4 = eryoVar.b;
                                        int iA = eryn.a(i4);
                                        if (iA == 0) {
                                            iA = 1;
                                        }
                                        if (iA - 1 != 3) {
                                            int iA2 = eryn.a(i4);
                                            throw new IllegalArgumentException("Unsupported token format version: ".concat((iA2 == 0 || iA2 == 1) ? "UNKNOWN" : iA2 != 2 ? iA2 != 3 ? "VERSION_3" : "VERSION_2" : "VERSION_1"));
                                        }
                                        byte[] bArrI = eryoVar.c.I();
                                        for (int i5 = 0; i5 < bArrI.length; i5++) {
                                            bArrI[i5] = (byte) (bArrI[i5] ^ 7);
                                        }
                                        try {
                                            eryk erykVar = (eryk) evsn.parseFrom(eryk.a, bArrI);
                                            erya eryaVar = (erya) eryb.a.createBuilder();
                                            List listA = erxz.a(erykVar.b);
                                            eryaVar.copyOnWrite();
                                            eryb erybVar = (eryb) eryaVar.instance;
                                            evsx evsxVar = erybVar.b;
                                            if (!evsxVar.c()) {
                                                erybVar.b = evsn.mutableCopy(evsxVar);
                                            }
                                            evpz.addAll(listA, erybVar.b);
                                            List listA2 = erxz.a(erykVar.c);
                                            eryaVar.copyOnWrite();
                                            eryb erybVar2 = (eryb) eryaVar.instance;
                                            evsx evsxVar2 = erybVar2.c;
                                            if (!evsxVar2.c()) {
                                                erybVar2.c = evsn.mutableCopy(evsxVar2);
                                            }
                                            evpz.addAll(listA2, erybVar2.c);
                                            List listA3 = erxz.a(erykVar.d);
                                            eryaVar.copyOnWrite();
                                            eryb erybVar3 = (eryb) eryaVar.instance;
                                            evsx evsxVar3 = erybVar3.d;
                                            if (!evsxVar3.c()) {
                                                erybVar3.d = evsn.mutableCopy(evsxVar3);
                                            }
                                            evpz.addAll(listA3, erybVar3.d);
                                            List listA4 = erxz.a(erykVar.e);
                                            eryaVar.copyOnWrite();
                                            eryb erybVar4 = (eryb) eryaVar.instance;
                                            evsx evsxVar4 = erybVar4.e;
                                            if (!evsxVar4.c()) {
                                                erybVar4.e = evsn.mutableCopy(evsxVar4);
                                            }
                                            evpz.addAll(listA4, erybVar4.e);
                                            return (eryb) eryaVar.build();
                                        } catch (evtj e) {
                                            throw new IllegalArgumentException("Unable to decode the v2 device experiment token", e);
                                        }
                                    } catch (evtj e2) {
                                        throw new IllegalArgumentException("Unable to parse the given token.", e2);
                                    }
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).flatMap(new Function() { // from class: eazj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    eryb erybVar = (eryb) obj;
                                    return Stream.CC.of((Object[]) new Stream[]{Collection.EL.stream(erybVar.d), Collection.EL.stream(erybVar.b), Collection.EL.stream(erybVar.e), Collection.EL.stream(erybVar.c)});
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).flatMap(Function$CC.identity()).map(new Function() { // from class: eazk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(((Integer) obj).intValue());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(ekcv.b)).g());
                        } catch (Throwable th) {
                            ((ekrd) ((ekrd) ((ekrd) eazn.a.i()).g(th)).h("com/google/android/libraries/privatetelemetry/mobalt/experiments/PhenotypeExperimentIdsExtractor", "getExperimentIds", 'D', "PhenotypeExperimentIdsExtractor.java")).q("Couldn't decode ExperimentToken");
                            return eazb.a;
                        }
                    } catch (Throwable th2) {
                        ((ekrd) ((ekrd) ((ekrd) eazn.a.i()).g(th2)).h("com/google/android/libraries/privatetelemetry/mobalt/experiments/PhenotypeExperimentIdsExtractor", "getExperimentIds", '<', "PhenotypeExperimentIdsExtractor.java")).q("Couldn't extract ExperimentTokens");
                    }
                }
                ekik ekikVarG = ekiiVar.g();
                ekikVarG.getClass();
                return new eazc(ekikVarG);
            }
        }, eaznVar.c)).h(new ejvr() { // from class: ebbc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ebbe ebbeVar = this.a;
                eazh eazhVar = (eazh) obj;
                eazg.a.put(new eaze(ebbeVar.a, ebbeVar.b), eazhVar);
                if (eazhVar.a() != 2) {
                    return eazhVar.b();
                }
                throw new ebbd("Error attempting to extract the Experiment IDs from Phenotype");
            }
        }, this.d);
    }

    public final ekik b() {
        if (this.c.isEmpty()) {
            return ekoo.c;
        }
        int i = this.a;
        long j = this.b;
        if (!eazg.b(i, j)) {
            return ekoo.c;
        }
        eazh eazhVarA = eazg.a(i, j);
        ejwl.m(eazhVarA.a() == 1, "Expected to find experiment IDs in the cache, instead found an error");
        return eazhVarA.b();
    }
}
