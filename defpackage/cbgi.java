package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbgi extends cmwg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerJanitorTask");
    public final cbcz b;
    public final eijt c = new eijt();
    public final eosc d;
    public final byeq e;
    private final cbbl f;

    public cbgi(cbcz cbczVar, eosc eoscVar, cbbl cbblVar, byeq byeqVar) {
        this.b = cbczVar;
        this.d = eoscVar;
        new eoss(eoscVar);
        this.f = cbblVar;
        this.e = byeqVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("WorkQueueWorkManagerCleanupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        eieu eieuVarK = eiiy.k("WorkQueueWorkManagerJanitorTask#run");
        try {
            eiju eijuVarD = d(0);
            eieuVarK.b(eijuVarD);
            eieuVarK.close();
            return eijuVarD;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }

    public final eiju d(final Integer num) {
        eiju eijuVarC = this.f.c(cbbk.b);
        eooz eoozVar = new eooz() { // from class: cbfz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Collection collection = (Collection) obj;
                cbfd cbfdVarA = cbfi.a();
                cbfdVarA.A("getUnscheduledItemsBatch");
                cbfdVarA.e(new Function() { // from class: cbgc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cbfh cbfhVar = (cbfh) obj2;
                        int iIntValue = cbfi.c().intValue();
                        if (iIntValue < 45030) {
                            dqru.x("scheduled_in_workmanager", iIntValue);
                        }
                        Collection collection2 = collection;
                        cbfhVar.ap(new dqty("work_queue.scheduled_in_workmanager", 1, 0));
                        cbfhVar.ap(new dqpm("work_queue.type", 4, cbfh.as(collection2), false));
                        return cbfhVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                cbeg cbegVar = cbfi.c;
                cbfdVarA.c((cbeh[]) DesugarArrays.stream(cbegVar.l).filter(new Predicate() { // from class: cbfx
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
                        return !Objects.equals(((cbeh) obj2).d(), "rawdata");
                    }
                }).toArray(new IntFunction() { // from class: cbfy
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        return new cbeh[i];
                    }
                }));
                cbfdVarA.d(new cbfa(cbegVar.a));
                cbfdVarA.y(100);
                final cbfb cbfbVarB = cbfdVarA.b();
                return eiju.g(cbfbVarB.C(new Supplier() { // from class: dqvr
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return cbfbVarB.E();
                    }
                }));
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarC.i(eoozVar, eoqgVar).i(new eooz() { // from class: cbfw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ArrayList arrayList = new ArrayList();
                final cbgi cbgiVar = this.a;
                ((Stream) obj).forEach(new Consumer() { // from class: cbge
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        final cbdg cbdgVar = (cbdg) obj2;
                        final cbgi cbgiVar2 = cbgiVar;
                        arrayList.add(eiju.g(cbgiVar2.c.a(new eooy() { // from class: cbgg
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                final cbgi cbgiVar3 = cbgiVar2;
                                final cbdg cbdgVar2 = cbdgVar;
                                return eijx.h(new eooy() { // from class: cbga
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        eieu eieuVarK = eiiy.k("enqueueScheduleOrDeleteRow#launchToWorkManager");
                                        try {
                                            eiju eijuVarB = cbgiVar3.b.b(cbdgVar2);
                                            eieuVarK.b(eijuVarB);
                                            eieuVarK.close();
                                            return eijuVarB;
                                        } catch (Throwable th) {
                                            try {
                                                eieuVarK.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                }, cbgiVar3.d).f(cayx.class, new eooz() { // from class: cbgb
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        ekrw ekrwVarJ = cbgi.a.j();
                                        ekrwVarJ.X(eksq.a, "BugleWorkQueue");
                                        ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((cayx) obj3)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerJanitorTask", "executionSequencerControlledScheduleOrDeleteRow", 141, "WorkQueueWorkManagerJanitorTask.java");
                                        final cbdg cbdgVar3 = cbdgVar2;
                                        ekrdVar.t("dropping work: %s", cbdgVar3);
                                        return cbgiVar3.e.a("sequencedScheduleOrDeleteRow#catching", new ejxr() { // from class: cbgd
                                            @Override // defpackage.ejxr
                                            public final Object get() {
                                                String[] strArr = cbfi.a;
                                                cbew cbewVar = new cbew();
                                                cbewVar.f("sequencedScheduleOrDeleteRow delete");
                                                final cbdg cbdgVar4 = cbdgVar3;
                                                cbewVar.c(new Function() { // from class: cbgh
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj4) {
                                                        cbfh cbfhVar = (cbfh) obj4;
                                                        cbfhVar.c(cbdgVar4.m());
                                                        return cbfhVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                ejwl.l(cbewVar.d() <= 1);
                                                return qba.a;
                                            }
                                        });
                                    }
                                }, eoqg.a);
                            }
                        }, eoqg.a)));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                eijw eijwVarL = eijx.l(arrayList);
                final Integer num2 = num;
                return eijwVarL.b(new eooy() { // from class: cbgf
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        Integer num3 = num2;
                        return arrayList.isEmpty() ? eijx.e(num3) : cbgiVar.d(Integer.valueOf(num3.intValue() + 1));
                    }
                }, eoqg.a);
            }
        }, eoqgVar);
    }
}
