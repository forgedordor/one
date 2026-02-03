package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drba {
    public static final ekrg a = ekrg.c("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter");
    public static final ekhx b = new ekph(ewut.HOME_AUTOMATION_DISCOVERY);
    public final drah c;
    public final Map d;
    public final Geller e;
    public final String f;
    public final ExecutorService g;
    public final ExecutorService h;

    public drba(String str, Geller geller, drah drahVar, ExecutorService executorService, ExecutorService executorService2) {
        this.c = drahVar;
        this.e = geller;
        this.f = str;
        this.g = executorService;
        this.h = executorService2;
        if (geller.e.k) {
            this.d = new ConcurrentHashMap();
        } else {
            this.d = new HashMap();
        }
    }

    public static ewbc b(int i, List list) {
        evzo evzoVar;
        ewaz ewazVar = (ewaz) ewbc.a.createBuilder();
        if (i == 1) {
            ewazVar.copyOnWrite();
            ewbc ewbcVar = (ewbc) ewazVar.instance;
            ewbcVar.c = 1;
            ewbcVar.b |= 1;
        } else if (i == 3) {
            ewazVar.copyOnWrite();
            ewbc ewbcVar2 = (ewbc) ewazVar.instance;
            ewbcVar2.c = 2;
            ewbcVar2.b |= 1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            drdx drdxVar = (drdx) it.next();
            evzn evznVar = (evzn) evzo.a.createBuilder();
            String strB = drdxVar.b();
            evznVar.copyOnWrite();
            evzo evzoVar2 = (evzo) evznVar.instance;
            evzoVar2.b |= 2;
            evzoVar2.d = strB;
            if (drdxVar.a().g()) {
                long jLongValue = ((Long) drdxVar.a().c()).longValue();
                evznVar.copyOnWrite();
                evzo evzoVar3 = (evzo) evznVar.instance;
                evzoVar3.b |= 1;
                evzoVar3.c = jLongValue;
                evzoVar = (evzo) evznVar.build();
            } else {
                evzoVar = (evzo) evznVar.build();
            }
            ewazVar.copyOnWrite();
            ewbc ewbcVar3 = (ewbc) ewazVar.instance;
            evzoVar.getClass();
            evtg evtgVar = ewbcVar3.d;
            if (!evtgVar.c()) {
                ewbcVar3.d = evsn.mutableCopy(evtgVar);
            }
            ewbcVar3.d.add(evzoVar);
        }
        return (ewbc) ewazVar.build();
    }

    public final drdl a(ewut ewutVar) {
        if (this.e.e.k) {
            return (drdl) Map.EL.computeIfAbsent(this.d, ewutVar, new Function() { // from class: drap
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ekrg ekrgVar = drba.a;
                    return new draf();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        java.util.Map map = this.d;
        if (!map.containsKey(ewutVar)) {
            map.put(ewutVar, new draf());
        }
        return (drdl) map.get(ewutVar);
    }
}
