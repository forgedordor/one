package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoli {
    public static eoii a(Throwable th, boolean z) {
        eoii eoiiVar = (eoii) eoin.a.createBuilder();
        eoie eoieVar = (eoie) eoih.a.createBuilder();
        eoieVar.copyOnWrite();
        eoih eoihVar = (eoih) eoieVar.instance;
        eoihVar.b |= 1;
        eoihVar.c = "";
        eoiiVar.copyOnWrite();
        eoin eoinVar = (eoin) eoiiVar.instance;
        eoih eoihVar2 = (eoih) eoieVar.build();
        eoihVar2.getClass();
        eoinVar.e = eoihVar2;
        eoinVar.b |= 1;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(th);
        identityHashMap.put(th, 0);
        arrayList.add(b(th, z));
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.remove();
            Integer num = (Integer) identityHashMap.get(th2);
            num.getClass();
            int iIntValue = num.intValue();
            if (th2.getCause() != null) {
                Throwable cause = th2.getCause();
                if (!identityHashMap.containsKey(cause)) {
                    identityHashMap.put(cause, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(b(cause, z));
                    arrayDeque.add(cause);
                }
                eoil eoilVar = (eoil) arrayList.get(iIntValue);
                int iIntValue2 = ((Integer) identityHashMap.get(cause)).intValue();
                eoilVar.copyOnWrite();
                eoim eoimVar = (eoim) eoilVar.instance;
                eoim eoimVar2 = eoim.a;
                eoimVar.b |= 2;
                eoimVar.d = iIntValue2;
            }
            for (Throwable th3 : th2.getSuppressed()) {
                if (!identityHashMap.containsKey(th3)) {
                    identityHashMap.put(th3, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(b(th3, z));
                    arrayDeque.add(th3);
                }
                eoil eoilVar2 = (eoil) arrayList.get(iIntValue);
                int iIntValue3 = ((Integer) identityHashMap.get(th3)).intValue();
                eoilVar2.copyOnWrite();
                eoim eoimVar3 = (eoim) eoilVar2.instance;
                eoim eoimVar4 = eoim.a;
                evsx evsxVar = eoimVar3.e;
                if (!evsxVar.c()) {
                    eoimVar3.e = evsn.mutableCopy(evsxVar);
                }
                eoimVar3.e.h(iIntValue3);
            }
        }
        eoij eoijVar = (eoij) eoik.a.createBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eoil eoilVar3 = (eoil) arrayList.get(i);
            eoijVar.copyOnWrite();
            eoik eoikVar = (eoik) eoijVar.instance;
            eoim eoimVar5 = (eoim) eoilVar3.build();
            eoimVar5.getClass();
            eoikVar.a();
            eoikVar.b.add(eoimVar5);
        }
        eoiiVar.copyOnWrite();
        eoin eoinVar2 = (eoin) eoiiVar.instance;
        eoik eoikVar2 = (eoik) eoijVar.build();
        eoikVar2.getClass();
        eoinVar2.d = eoikVar2;
        eoinVar2.c = 4;
        return eoiiVar;
    }

    public static eoil b(Throwable th, boolean z) {
        eoil eoilVar = (eoil) eoim.a.createBuilder();
        eoie eoieVarD = d(th, z);
        eoilVar.copyOnWrite();
        eoim eoimVar = (eoim) eoilVar.instance;
        eoih eoihVar = (eoih) eoieVarD.build();
        eoihVar.getClass();
        eoimVar.c = eoihVar;
        eoimVar.b |= 1;
        return eoilVar;
    }

    public static eoii c(Throwable th) {
        eoii eoiiVar = (eoii) eoin.a.createBuilder();
        eoie eoieVarD = d(th, false);
        eoiiVar.copyOnWrite();
        eoin eoinVar = (eoin) eoiiVar.instance;
        eoih eoihVar = (eoih) eoieVarD.build();
        eoihVar.getClass();
        eoinVar.e = eoihVar;
        eoinVar.b |= 1;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return eoiiVar;
            }
            eoie eoieVarD2 = d(th, false);
            eoiiVar.copyOnWrite();
            eoin eoinVar2 = (eoin) eoiiVar.instance;
            eoih eoihVar2 = (eoih) eoieVarD2.build();
            eoihVar2.getClass();
            eoinVar2.a();
            eoinVar2.f.add(eoihVar2);
        }
    }

    private static eoie d(Throwable th, boolean z) {
        StackTraceElement[] stackTrace;
        eoie eoieVar = (eoie) eoih.a.createBuilder();
        String name = th.getClass().getName();
        eoieVar.copyOnWrite();
        eoih eoihVar = (eoih) eoieVar.instance;
        name.getClass();
        eoihVar.b |= 1;
        eoihVar.c = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            eoieVar.copyOnWrite();
            eoih eoihVar2 = (eoih) eoieVar.instance;
            message.getClass();
            eoihVar2.b |= 2;
            eoihVar2.d = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                eoif eoifVar = (eoif) eoig.a.createBuilder();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    eoifVar.copyOnWrite();
                    eoig eoigVar = (eoig) eoifVar.instance;
                    className.getClass();
                    eoigVar.b |= 1;
                    eoigVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    eoifVar.copyOnWrite();
                    eoig eoigVar2 = (eoig) eoifVar.instance;
                    methodName.getClass();
                    eoigVar2.b |= 2;
                    eoigVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    eoifVar.copyOnWrite();
                    eoig eoigVar3 = (eoig) eoifVar.instance;
                    eoigVar3.b |= 8;
                    eoigVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        eoifVar.copyOnWrite();
                        eoig eoigVar4 = (eoig) eoifVar.instance;
                        fileName.getClass();
                        eoigVar4.b |= 4;
                        eoigVar4.e = fileName;
                    }
                }
                eoieVar.copyOnWrite();
                eoih eoihVar3 = (eoih) eoieVar.instance;
                eoig eoigVar5 = (eoig) eoifVar.build();
                eoigVar5.getClass();
                evtg evtgVar = eoihVar3.f;
                if (!evtgVar.c()) {
                    eoihVar3.f = evsn.mutableCopy(evtgVar);
                }
                eoihVar3.f.add(eoigVar5);
            }
        }
        return eoieVar;
    }
}
