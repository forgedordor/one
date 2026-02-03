package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class angq {
    public static anhj a(angr angrVar) {
        Object next;
        Iterator<E> it = angrVar.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ango) next).c) {
                break;
            }
        }
        ango angoVar = (ango) next;
        if (angoVar != null) {
            return angoVar.a;
        }
        return null;
    }

    public static anhj b(angr angrVar, aoer aoerVar) {
        Object next;
        Object next2;
        Iterator<E> it = angrVar.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Iterator<E> it2 = ((ango) next).d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                aoer aoerVar2 = ((angn) next2).c;
                if (aoerVar2 != null && aoerVar2.z(aoerVar)) {
                    break;
                }
            }
            if (next2 != null) {
                break;
            }
        }
        ango angoVar = (ango) next;
        if (angoVar != null) {
            return angoVar.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static anho c(angr angrVar, aoer aoerVar) {
        ango angoVar;
        angn angnVar;
        ekqh it = angrVar.d().iterator();
        it.getClass();
        do {
            Object obj = null;
            if (!it.hasNext()) {
                return null;
            }
            angoVar = (ango) it.next();
            Iterator<E> it2 = angoVar.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                aoer aoerVar2 = ((angn) next).c;
                if (aoerVar2 != null && aoerVar2.z(aoerVar)) {
                    obj = next;
                    break;
                }
            }
            angnVar = (angn) obj;
        } while (angnVar == null);
        return new anho(angoVar.a, angnVar);
    }
}
