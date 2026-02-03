package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asst implements asvl {
    final Set a;
    public final awlc b;
    private final eosc c;

    public asst(Set set, awlc awlcVar, eosc eoscVar) {
        this.a = set;
        this.b = awlcVar;
        this.c = eoscVar;
    }

    @Override // defpackage.asvl
    public final eiju a(final Map map) {
        Set set = this.a;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((assu) it.next()).c(map));
        }
        return eijx.j(arrayList).a(new Callable() { // from class: assn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final Map map2 = map;
                this.a.b.d(new Consumer() { // from class: assp
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((awhf) obj).a(awhi.RCS, (Map) Collection.EL.stream(map2.entrySet()).collect(ekcv.a(new Function() { // from class: assq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return (aubq) ((Map.Entry) obj2).getKey();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: assr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return awhq.b(((asts) ((Map.Entry) obj2).getValue()).a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        })));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, this.c);
    }

    @Override // defpackage.asvl
    public final eiju b(final aubq aubqVar, final asts astsVar) {
        Set set = this.a;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((assu) it.next()).d(aubqVar, astsVar));
        }
        return eijx.j(arrayList).a(new Callable() { // from class: asss
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final aubq aubqVar2 = aubqVar;
                final asts astsVar2 = astsVar;
                this.a.b.d(new Consumer() { // from class: asso
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        asts astsVar3 = astsVar2;
                        awhi awhiVar = awhi.RCS;
                        awhq.b(astsVar3.a());
                        ((awhf) obj).b(awhiVar, aubqVar2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, this.c);
    }
}
