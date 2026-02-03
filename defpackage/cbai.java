package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbai {
    public static final cqce a = cqce.g("BugleWorkQueue", "WorkQueueCancellationController");
    public final egsh b;
    public final cbaz c;
    public final fdjx d;
    public final eizx e;
    private final dqsn f;
    private final cbfv g;
    private final cbmx h;
    private final cbls i;

    public cbai(dqsn dqsnVar, cbkt cbktVar, cbfv cbfvVar, cbmx cbmxVar, egsh egshVar, cbls cblsVar, cbaz cbazVar, fdjx fdjxVar, fdjx fdjxVar2) {
        dqsnVar.getClass();
        cbktVar.getClass();
        cbfvVar.getClass();
        cbmxVar.getClass();
        egshVar.getClass();
        cblsVar.getClass();
        cbazVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.f = dqsnVar;
        this.g = cbfvVar;
        this.h = cbmxVar;
        this.b = egshVar;
        this.i = cblsVar;
        this.c = cbazVar;
        this.d = fdjxVar2;
        this.e = new eizx();
    }

    public final int a(final String str, final String str2) {
        return ((List) this.f.c("cancelPendingByHandlerKeyAndTag", new ejxr() { // from class: cbab
            @Override // defpackage.ejxr
            public final Object get() {
                final String str3 = str;
                final String str4 = str2;
                fdap fdapVar = new fdap() { // from class: cbae
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        cbfh cbfhVar = (cbfh) obj;
                        cbfhVar.getClass();
                        cbfhVar.i(str3);
                        int iIntValue = cbfi.c().intValue();
                        if (iIntValue < 48020) {
                            dqru.x("cancellation_tag", iIntValue);
                        }
                        cbfhVar.ap(new dqpj("work_queue.cancellation_tag", 1, str4));
                        return fctx.a;
                    }
                };
                cbai cbaiVar = this.a;
                List listC = cbaiVar.c(fdapVar);
                cqbd cqbdVarC = cbai.a.c();
                cqbdVarC.I("Cancelled rows with handler and tag");
                cqbdVarC.A("handlerKey", str3);
                cqbdVarC.A("cancellationTag", str4);
                cqbdVarC.y("itemCount", listC.size());
                cqbdVarC.r();
                ArrayList arrayList = new ArrayList(fcva.p(listC, 10));
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    arrayList.add(((cbdg) it.next()).q());
                }
                cbaiVar.e(fcva.av(arrayList));
                cbaiVar.d(listC);
                return listC;
            }
        })).size();
    }

    public final ekgb b(final String str, boolean z) {
        List list = (List) this.f.c("cancelAllPendingByHandlerKey", new ejxr() { // from class: cazy
            @Override // defpackage.ejxr
            public final Object get() {
                final String str2 = str;
                fdap fdapVar = new fdap() { // from class: cbad
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        cbfh cbfhVar = (cbfh) obj;
                        cbfhVar.getClass();
                        cbfhVar.i(str2);
                        return fctx.a;
                    }
                };
                cbai cbaiVar = this.a;
                List listC = cbaiVar.c(fdapVar);
                cqbd cqbdVarC = cbai.a.c();
                cqbdVarC.I("Cancelled rows with handler");
                cqbdVarC.A("handlerKey", str2);
                cqbdVarC.y("itemCount", listC.size());
                cqbdVarC.r();
                ArrayList arrayList = new ArrayList(fcva.p(listC, 10));
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    arrayList.add(((cbdg) it.next()).q());
                }
                cbaiVar.e(fcva.av(arrayList));
                return listC;
            }
        });
        list.getClass();
        d(list);
        if (z) {
            return ekfv.a(list);
        }
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        return ekgbVar;
    }

    public final List c(final fdap fdapVar) {
        Collection collectionValues = ((Map) this.h.d.c()).values();
        ArrayList arrayList = new ArrayList(fcva.p(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((cbmm) it.next()).a().b);
        }
        Iterable iterableAh = fcvo.a;
        if (!arrayList.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                iterableAh = fcva.ah((List) listIterator.previous(), iterableAh);
            }
        }
        String[] strArr = cbfi.a;
        cbew cbewVar = new cbew();
        cbewVar.f("cancelPending");
        cbewVar.c(new Function() { // from class: cbac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbfh cbfhVar = (cbfh) obj;
                cbfhVar.getClass();
                fdapVar.invoke(cbfhVar);
                return cbfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final cbfg cbfgVar = (cbfg) cbewVar.b().b;
        ekgb ekgbVar = (ekgb) cbfi.b().p("work_queue-deleteAndReturnDeletedRows-txn", new ejxr() { // from class: cbdf
            @Override // defpackage.ejxr
            public final Object get() {
                cbfd cbfdVarA = cbfi.a();
                cbfg cbfgVar2 = cbfgVar;
                cbfdVarA.k(cbfgVar2);
                cbfdVarA.A("work_queue-deleteAndReturnDeletedRows-query");
                ekgb ekgbVarZ = cbfdVarA.b().z();
                cbew cbewVar2 = new cbew();
                cbewVar2.b = cbfgVar2;
                cbewVar2.f("work_queue-deleteAndReturnDeletedRows-delete");
                cbewVar2.b().b();
                return ekgbVarZ;
            }
        });
        ekgbVar.getClass();
        return ekgbVar;
    }

    public final void d(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            final cbdg cbdgVar = (cbdg) it.next();
            this.g.a(cbdgVar.m());
            final cayi cayiVar = this.i.n;
            cayiVar.c(new Runnable() { // from class: cbaf
                @Override // java.lang.Runnable
                public final void run() {
                    cayi cayiVar2 = cayiVar;
                    cbdg cbdgVar2 = cbdgVar;
                    caye cayeVarA = cayiVar2.a(cbdgVar2);
                    cayiVar2.f(cbdgVar2, cbcw.k());
                    cayiVar2.e(cbdgVar2.m());
                    cayeVarA.b();
                    cayeVarA.a();
                }
            });
        }
    }

    public final void e(final Iterable iterable) {
        if (!this.f.i()) {
            throw new IllegalStateException("Check failed.");
        }
        cbfd cbfdVarA = cbfi.a();
        cbfdVarA.A("cancelScheduledWorkForEmptyQueues remaining items");
        cbfdVarA.e(new Function() { // from class: cazz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbfh cbfhVar = (cbfh) obj;
                cbfhVar.h(iterable);
                return cbfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cbeh cbehVar = cbfi.c.f;
        cbfdVarA.w(cbehVar);
        cbfdVarA.c(cbehVar);
        ekgb ekgbVarZ = cbfdVarA.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((cbdg) it.next()).q());
        }
        final Set setE = fcwm.e(fcva.av(iterable), fcva.av(arrayList));
        if (setE.isEmpty()) {
            return;
        }
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Cancelling WorkManager associations");
        cqbdVarC.A("queues", setE);
        cqbdVarC.r();
        String[] strArr = cbjq.a;
        cbjf cbjfVar = new cbjf();
        cbjfVar.f("cancelScheduledWorkForEmptyQueues");
        cbjfVar.c(new Function() { // from class: cbaa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbjp cbjpVar = (cbjp) obj;
                cbjpVar.c(setE);
                return cbjpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final cbjo cbjoVar = (cbjo) cbjfVar.b().b;
        ekgb ekgbVar = (ekgb) cbjq.a().p("work_queue_work_manager_ids-deleteAndReturnDeletedRows-txn", new ejxr() { // from class: cbhq
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr2 = cbjq.a;
                cbjl cbjlVar = new cbjl(cbjq.a);
                cbjo cbjoVar2 = cbjoVar;
                cbjlVar.k(cbjoVar2);
                cbjlVar.A("work_queue_work_manager_ids-deleteAndReturnDeletedRows-query");
                ekgb ekgbVarZ2 = cbjlVar.b().z();
                cbjf cbjfVar2 = new cbjf();
                cbjfVar2.b = cbjoVar2;
                cbjfVar2.f("work_queue_work_manager_ids-deleteAndReturnDeletedRows-delete");
                cbjfVar2.b().b();
                return ekgbVarZ2;
            }
        });
        ekgbVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it2 = ekgbVar.iterator();
        while (it2.hasNext()) {
            Optional optionalK = ((cbht) it2.next()).k();
            optionalK.getClass();
            UUID uuid = (UUID) fdct.b(optionalK);
            if (uuid != null) {
                arrayList2.add(uuid);
            }
        }
        auvw.k(this.d, null, null, new cbah(arrayList2, this, null), 3);
    }
}
