package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffx {
    private static final fffw a = new fffw(new byte[0], 0, 0, false);
    private static final int b;
    private static final AtomicReference[] c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final fffw a() {
        AtomicReference atomicReferenceC = c();
        fffw fffwVar = a;
        fffw fffwVar2 = (fffw) atomicReferenceC.getAndSet(fffwVar);
        if (fffwVar2 == fffwVar) {
            return new fffw();
        }
        if (fffwVar2 == null) {
            atomicReferenceC.set(null);
            return new fffw();
        }
        atomicReferenceC.set(fffwVar2.f);
        fffwVar2.f = null;
        fffwVar2.c = 0;
        return fffwVar2;
    }

    public static final void b(fffw fffwVar) {
        if (fffwVar.f != null || fffwVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fffwVar.d) {
            return;
        }
        AtomicReference atomicReferenceC = c();
        fffw fffwVar2 = a;
        fffw fffwVar3 = (fffw) atomicReferenceC.getAndSet(fffwVar2);
        if (fffwVar3 != fffwVar2) {
            int i = fffwVar3 != null ? fffwVar3.c : 0;
            if (i >= 65536) {
                atomicReferenceC.set(fffwVar3);
                return;
            }
            fffwVar.f = fffwVar3;
            fffwVar.b = 0;
            fffwVar.c = i + 8192;
            atomicReferenceC.set(fffwVar);
        }
    }

    private static final AtomicReference c() {
        return c[(int) (Thread.currentThread().getId() & (b - 1))];
    }
}
