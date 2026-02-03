package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evuv {
    public static final void a(evqs evqsVar, ArrayDeque arrayDeque) {
        if (!evqsVar.h()) {
            if (!(evqsVar instanceof evuy)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(evqsVar.getClass()))));
            }
            evuy evuyVar = (evuy) evqsVar;
            int i = evuy.h;
            a(evuyVar.e, arrayDeque);
            a(evuyVar.f, arrayDeque);
            return;
        }
        int iB = b(evqsVar.d());
        int iC = evuy.c(iB + 1);
        if (arrayDeque.isEmpty() || ((evqs) arrayDeque.peek()).d() >= iC) {
            arrayDeque.push(evqsVar);
            return;
        }
        int iC2 = evuy.c(iB);
        evqs evuyVar2 = (evqs) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((evqs) arrayDeque.peek()).d() < iC2) {
            evuyVar2 = new evuy((evqs) arrayDeque.pop(), evuyVar2);
        }
        evuy evuyVar3 = new evuy(evuyVar2, evqsVar);
        while (!arrayDeque.isEmpty()) {
            if (((evqs) arrayDeque.peek()).d() >= evuy.c(b(evuyVar3.d) + 1)) {
                break;
            } else {
                evuyVar3 = new evuy((evqs) arrayDeque.pop(), evuyVar3);
            }
        }
        arrayDeque.push(evuyVar3);
    }

    private static final int b(int i) {
        int iBinarySearch = Arrays.binarySearch(evuy.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
