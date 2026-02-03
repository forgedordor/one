package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiip extends RuntimeException {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("[^A-Za-z0-9 $\\-_\\.\\(\\)<>\\u00a0\\u00a1-\\u1fff\\u2000-\\u200a\\u2010-\\u2027\\u202f\\u2030-\\ud7ff\\ue000-\\uffef\\u10000-\\u10ffff]+");

    public eiip(Throwable th, StackTraceElement[] stackTraceElementArr) {
        super("", th);
        setStackTrace(stackTraceElementArr);
    }

    public static ListenableFuture a(final ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final eifn eifnVarC = eidc.c();
        final ListenableFuture listenableFutureJ = eork.j(listenableFuture);
        final ListenableFuture listenableFutureP = eork.p(listenableFutureJ, j, timeUnit, scheduledExecutorService);
        return eooh.g(listenableFutureP, TimeoutException.class, new eooz() { // from class: eiin
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                TimeoutException timeoutException = (TimeoutException) obj;
                int i = eiip.a;
                ListenableFuture listenableFuture2 = listenableFuture;
                if (!listenableFuture2.isDone()) {
                    eifn eifnVar = eifnVarC;
                    if (eifnVar != null) {
                        timeoutException.setStackTrace(eiip.l(eifnVar, null));
                        eiip.i(eifnVar, timeoutException);
                        eiip.g(eifnVar, timeoutException);
                    }
                    eork.t(listenableFutureJ, listenableFuture2);
                }
                return listenableFutureP;
            }
        }, eoqg.a);
    }

    public static RuntimeException b(Throwable th) {
        eifn eifnVarC = eidc.c();
        eiip eiipVar = new eiip(th, l(eifnVarC, null));
        i(eifnVarC, eiipVar);
        g(eifnVarC, eiipVar);
        return eiipVar;
    }

    public static RuntimeException c() {
        return new eiip(null, l(eidc.c(), null));
    }

    public static String d(String str) {
        return b.matcher(str).replaceAll("");
    }

    public static void e(Collection collection, StackTraceElement[] stackTraceElementArr) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).addSuppressed(new eiio(stackTraceElementArr));
        }
    }

    public static void f(ekgp ekgpVar) {
        ejwi ejwiVarI;
        boolean z = eidc.a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = eidc.c;
        synchronized (weakHashMap) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                eifn eifnVar = ((eifi) entry.getValue()).c;
                if (eifnVar != null) {
                    map.put((Thread) entry.getKey(), eifnVar);
                }
            }
        }
        ekhv ekhvVar = new ekhv();
        Iterator<E> it = ekgpVar.keySet().iterator();
        while (it.hasNext()) {
            ekhvVar.c(((eifn) it.next()).g());
        }
        ekhx ekhxVarG = ekhvVar.g();
        int iC = Alert.DURATION_SHOW_INDEFINITELY;
        for (eifn eifnVar2 : ekgpVar.keySet()) {
            if (eifnVar2 instanceof eijf) {
                eijf eijfVar = (eijf) eifnVar2;
                if (eijfVar.c() < iC) {
                    iC = eijfVar.c();
                }
            }
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            Thread thread = (Thread) entry2.getKey();
            eifn eifnVar3 = (eifn) entry2.getValue();
            if (thread != Thread.currentThread()) {
                if (ekhxVarG.contains(eifnVar3.g())) {
                    eifn eifnVarA = eifnVar3;
                    while (eifnVarA != null && (!(eifnVarA instanceof eijf) || ((eijf) eifnVarA).c() >= iC)) {
                        if (map2.containsKey(eifnVarA)) {
                            eifnVarA = (eifn) map2.get(eifnVarA);
                            break;
                        } else if (ekgpVar.containsKey(eifnVarA)) {
                            break;
                        } else {
                            eifnVarA = eifnVarA.a();
                        }
                    }
                    eifnVarA = null;
                    for (eifn eifnVarA2 = eifnVar3; eifnVarA2 != eifnVarA && !map2.containsKey(eifnVarA2); eifnVarA2 = eifnVarA2.a()) {
                        map2.put(eifnVarA2, eifnVarA);
                    }
                    ejwiVarI = ejwi.i(eifnVarA);
                } else {
                    ejwiVarI = ejud.a;
                }
                if (ejwiVarI.g()) {
                    Throwable th = (Throwable) ekgpVar.get(ejwiVarI.c());
                    dqkv dqkvVar = new dqkv(thread);
                    dqkvVar.addSuppressed(new eiip(null, l(eifnVar3, ((eifn) ejwiVarI.c()).a())));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement("tk_trace", d(dqkvVar.getMessage()), null, 0));
                    Collections.addAll(arrayList, dqkvVar.getStackTrace());
                    arrayList.toArray(new StackTraceElement[0]);
                    th.addSuppressed(dqkvVar);
                }
            }
        }
    }

    public static void g(eifn eifnVar, Throwable th) {
        if (eiiy.f(eifnVar)) {
            f(ekgp.l(eifnVar, th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(ekgp ekgpVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            eifn eifnVar = (eifn) entry.getKey();
            if (eifnVar instanceof eijf) {
                eiii eiiiVar = (eiii) map.get(((eifn) entry.getKey()).g());
                if (eiiiVar == null) {
                    eiiiVar = ((eibs) ((eijf) eifnVar).h()).c;
                    map.put(eifnVar.g(), eiiiVar);
                }
                Map map3 = (Map) map2.get(eiiiVar);
                if (map3 == null) {
                    map3 = new HashMap();
                    map2.put(eiiiVar, map3);
                }
                map3.put(Integer.valueOf(((eijf) eifnVar).c()), (Throwable) entry.getValue());
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            eiii eiiiVar2 = (eiii) entry2.getKey();
            int iIntValue = ((Integer) Collections.min(((Map) entry2.getValue()).keySet())).intValue();
            HashMap map4 = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = eiiiVar2.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ((((eies) it.next()).b & 32) == 0) {
                        break;
                    }
                } else {
                    arrayList.add(new StackTraceElement("tk_trace", "No unfinished spans when the app crashed:", null, 0));
                    break;
                }
            }
            eice eiceVar = eiiiVar2.i;
            if (eiceVar == null) {
                eiceVar = eice.a;
            }
            if ((eiceVar.b & 1) != 0) {
                Locale locale = Locale.US;
                String str = ((eies) eiiiVar2.e.get(0)).c;
                eice eiceVar2 = eiiiVar2.i;
                if (eiceVar2 == null) {
                    eiceVar2 = eice.a;
                }
                eicd eicdVar = eiceVar2.c;
                if (eicdVar == null) {
                    eicdVar = eicd.a;
                }
                arrayList.add(new StackTraceElement("tk_trace", d(String.format(locale, "Trace %s tried to log too many spans. %s spans dropped", str, Integer.valueOf(eicdVar.c))), null, 0));
            }
            if (arrayList.isEmpty()) {
                j(eiiiVar2, (Map) entry2.getValue(), iIntValue, map4);
            } else {
                e(((Map) entry2.getValue()).values(), (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
    }

    public static void i(eifn eifnVar, Throwable th) {
        if (eiiy.f(eifnVar)) {
            h(ekgp.l(eifnVar, th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(eiii eiiiVar, Map map, int i, Map map2) {
        int i2;
        int i3 = 0;
        for (eies eiesVar : ekjz.f(eiiiVar.e)) {
            Integer numValueOf = null;
            if (i3 >= 10) {
                e(map.values(), new StackTraceElement[]{new StackTraceElement("tk_trace", "Suppressed exceptions exceeds the limit 10, additional unfinished spans will not be reported", null, 0)});
                return;
            }
            if ((eiesVar.b & 32) == 0 && !map2.containsKey(eiesVar)) {
                evtg evtgVar = eiiiVar.e;
                Set setKeySet = map.keySet();
                boolean z = false;
                eies eiesVar2 = eiesVar;
                while (!z) {
                    if (map2.containsKey(eiesVar2)) {
                        numValueOf = (Integer) map2.get(eiesVar2);
                    } else if (setKeySet.contains(Integer.valueOf(eiesVar2.d))) {
                        numValueOf = Integer.valueOf(eiesVar2.d);
                    } else {
                        int i4 = eiesVar2.e;
                        if (i4 >= i) {
                            eiesVar2 = (eies) evtgVar.get(i4);
                        }
                    }
                    z = true;
                }
                boolean z2 = false;
                eies eiesVar3 = eiesVar;
                while (!z2) {
                    if (!map2.containsKey(eiesVar3)) {
                        map2.put(eiesVar3, numValueOf);
                        if ((numValueOf == null || eiesVar3.e != numValueOf.intValue()) && (i2 = eiesVar3.e) >= 0) {
                            eiesVar3 = (eies) evtgVar.get(i2);
                        }
                    }
                    z2 = true;
                }
                ejwi ejwiVarI = ejwi.i(numValueOf);
                if (ejwiVarI.g()) {
                    i3++;
                    Throwable th = (Throwable) map.get(ejwiVarI.c());
                    evtg evtgVar2 = eiiiVar.e;
                    int iIntValue = ((Integer) ejwiVarI.c()).intValue();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(m(eiesVar));
                    while (eiesVar.d != iIntValue) {
                        eiesVar = (eies) evtgVar2.get(eiesVar.e);
                        arrayList.add(m(eiesVar));
                    }
                    th.addSuppressed(new eiio((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
                }
            }
        }
    }

    public static void k(Throwable th) {
        eict.b(th);
        throw new eiip(th, l(eidc.c(), null));
    }

    public static StackTraceElement[] l(eifn eifnVar, eifn eifnVar2) {
        ArrayList arrayList = new ArrayList();
        for (eifn eifnVarA = eifnVar; eifnVarA != eifnVar2; eifnVarA = eifnVarA.a()) {
            arrayList.add(new StackTraceElement("tk_trace", d(eifnVarA.d()), null, 0));
        }
        if (eifnVar instanceof eicp) {
            arrayList.add(new StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    private static StackTraceElement m(eies eiesVar) {
        String str;
        if ((eiesVar.b & 32) != 0) {
            str = " " + eiesVar.h + " ms";
        } else {
            str = "(unfinished)";
        }
        return new StackTraceElement("tk_trace", d(String.valueOf(eiesVar.c).concat(str)), null, 0);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
