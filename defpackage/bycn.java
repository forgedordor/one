package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bycn extends cayl {
    public static final eksp a = eksp.c("BugleSearch");
    public final fcsu b;
    private final eygg c;
    private final fcsu d;
    private final eosc e;

    public bycn(eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.c = eyggVar;
        this.b = fcsuVar;
        this.d = fcsuVar2;
        this.e = eoscVar;
    }

    @Override // defpackage.cayl, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.d(10);
        ((caxk) caxzVarL).d = Duration.ofMillis(50L);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("IcingIndexUpdateHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bycq.a.getParserForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cayl
    public final eiju j(cayy cayyVar, ekgb ekgbVar) {
        eiju eijuVarH;
        eieu eieuVarK = eiiy.k("IcingIndexUpdateHandler::processPendingWorkItemAsync");
        try {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(bxze.g, "IcingIndexUpdateHandler");
            ekrwVarO.X(bxze.l, Integer.valueOf(((ekoe) ekgbVar).c));
            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexUpdateHandler", "processPendingWorkItemAsync", 95, "IcingIndexUpdateHandler.java")).q("Processing icing index update work item.");
            if (ekgbVar.isEmpty()) {
                eijuVarH = eijx.e(cbcw.i());
            } else if (((aqdi) this.d.b()).a()) {
                final ekgb ekgbVar2 = (ekgb) Collection.EL.stream(ekgbVar).map(new Function() { // from class: bycj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bycq bycqVar = (bycq) obj;
                        return ((bxrh) this.a.b.b()).b(bycqVar.b, bycqVar.c);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.a);
                eijw eijwVarL = eijx.l(ekgbVar2);
                Callable callable = new Callable() { // from class: byck
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksp ekspVar = bycn.a;
                        return Boolean.valueOf(Collection.EL.stream(ekgbVar2).allMatch(new Predicate() { // from class: bycm
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
                                eiju eijuVar = (eiju) obj;
                                eksp ekspVar2 = bycn.a;
                                try {
                                    return ((Boolean) eork.q(eijuVar)).booleanValue();
                                } catch (ExecutionException e) {
                                    ((eksl) ((eksl) ((eksl) bycn.a.i()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingIndexUpdateHandler", "processByAppSearch", (char) 187, "IcingIndexUpdateHandler.java")).q("Failed to get future result while indexing message");
                                    return false;
                                }
                            }
                        }));
                    }
                };
                eosc eoscVar = this.e;
                eiju eijuVarA = eijwVarL.a(callable, eoscVar);
                eieuVarK.b(eijuVarA);
                eijuVarH = eijuVarA.h(new ejvr() { // from class: bych
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eksp ekspVar = bycn.a;
                        return ((Boolean) obj).booleanValue() ? cbcw.i() : cbcw.m();
                    }
                }, eoscVar);
            } else {
                ekqh it = ekgbVar.iterator();
                bycq bycqVar = (bycq) it.next();
                eijuVarH = k(it, bycqVar.c.iterator(), bycqVar.b).h(new ejvr() { // from class: byci
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eksp ekspVar = bycn.a;
                        return ((Boolean) obj).booleanValue() ? cbcw.i() : cbcw.m();
                    }
                }, this.e);
                eieuVarK.b(eijuVarH);
            }
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju k(final Iterator it, final Iterator it2, final int i) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if ((!it.hasNext() && !it2.hasNext()) || arrayList.size() >= ((Integer) ccze.E.e()).intValue()) {
                break;
            }
            if (it2.hasNext()) {
                bxzv bxzvVar = (bxzv) bxzw.a.createBuilder();
                bxzvVar.copyOnWrite();
                ((bxzw) bxzvVar.instance).b = i;
                String str = (String) it2.next();
                bxzvVar.copyOnWrite();
                bxzw bxzwVar = (bxzw) bxzvVar.instance;
                str.getClass();
                bxzwVar.c = str;
                arrayList.add((bxzw) bxzvVar.build());
            } else if (it.hasNext()) {
                bycq bycqVar = (bycq) it.next();
                i = bycqVar.b;
                it2 = bycqVar.c.iterator();
            }
        }
        if (arrayList.isEmpty()) {
            return eijx.e(true);
        }
        return ((bxzf) this.c.b()).a(ekgb.n(arrayList)).i(new eooz() { // from class: bycl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(false);
                }
                int i2 = i;
                Iterator it3 = it2;
                return this.a.k(it, it3, i2);
            }
        }, this.e);
    }
}
