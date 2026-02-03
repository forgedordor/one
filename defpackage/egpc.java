package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egpc extends eooi {
    private egpe a;
    private final int b;

    public egpc(egpe egpeVar, int i) {
        this.a = egpeVar;
        this.b = i;
    }

    @Override // defpackage.eooi
    protected final String gu() {
        eooy eooyVar;
        egpe egpeVar = this.a;
        if (egpeVar == null || (eooyVar = egpeVar.a.a) == null) {
            return null;
        }
        String strB = a.b(eooyVar, "callable=[", "]");
        egpd egpdVar = (egpd) this.a.c.get();
        if (egpdVar == null) {
            return strB;
        }
        return strB + ", trial=[" + egpdVar.toString() + "]";
    }

    @Override // defpackage.eooi
    protected final void gv() {
        AtomicLong atomicLong;
        long j;
        int i;
        int iA;
        boolean z;
        egpe egpeVar = this.a;
        this.a = null;
        if (egpeVar == null) {
            return;
        }
        do {
            atomicLong = egpeVar.b;
            j = atomicLong.get();
            i = (int) j;
            iA = egpe.a(j);
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError(a.u(j, "Refcount is: "));
            }
            z = i == -2147483647;
            if (z) {
                iA++;
            }
        } while (!atomicLong.compareAndSet(j, egpe.b(iA, i - 1)));
        if (z) {
            while (true) {
                AtomicReference atomicReference = egpeVar.c;
                egpd egpdVar = (egpd) atomicReference.get();
                if (egpdVar != null) {
                    if (egpdVar.a <= this.b) {
                        egpdVar.cancel(true);
                        while (!atomicReference.compareAndSet(egpdVar, null)) {
                            if (atomicReference.get() != egpdVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
