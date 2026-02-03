package defpackage;

import j$.time.Instant;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehap implements egzn {
    final /* synthetic */ ehaq a;

    public ehap(ehaq ehaqVar) {
        this.a = ehaqVar;
    }

    @Override // defpackage.egzn
    public final void a(egzm egzmVar) {
        boolean zA;
        int iOrdinal = egzmVar.c.ordinal();
        if (iOrdinal == 0) {
            zA = ehan.a(this.a.f, null, egzk.LOCAL_STATE_CHANGE);
        } else {
            if (iOrdinal != 1) {
                throw new IllegalStateException("Unrecognized CallReason: ".concat(egzmVar.toString()));
            }
            AtomicReference atomicReference = this.a.f;
            egzk egzkVar = egzk.LOCAL_STATE_CHANGE;
            egzk egzkVar2 = egzk.REMOTE_STATE_CHANGE;
            if (ehan.a(atomicReference, egzkVar, egzkVar2)) {
                return;
            } else {
                zA = ehan.a(atomicReference, null, egzkVar2);
            }
        }
        if (zA) {
            ehaq ehaqVar = this.a;
            ehaqVar.c.execute(new Runnable() { // from class: ehao
                @Override // java.lang.Runnable
                public final void run() {
                    ehaq ehaqVar2 = this.a.a;
                    egzk egzkVar3 = (egzk) ehaqVar2.f.getAndSet(null);
                    egyc egycVar = (egyc) ehaqVar2.h;
                    long j = egycVar.d;
                    Instant instantF = ehaqVar2.a.f();
                    ejwl.m(j != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
                    egyi egyiVar = egycVar.a;
                    ehaqVar2.h = new egyc(egyiVar, egycVar.b, egycVar.c, j, egycVar.f, egycVar.e.g(egyiVar, instantF));
                    if (egzk.LOCAL_STATE_CHANGE.equals(egzkVar3)) {
                        ehaqVar2.e(((egyc) ehaqVar2.h).e);
                    } else {
                        if (!egzk.REMOTE_STATE_CHANGE.equals(egzkVar3)) {
                            throw new IllegalStateException("Invalidation was ".concat(String.valueOf(String.valueOf(egzkVar3))));
                        }
                        ehaqVar2.d(((egyc) ehaqVar2.h).e);
                    }
                }
            });
        }
    }
}
