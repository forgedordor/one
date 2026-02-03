package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class baq extends bab {
    final WeakReference b;

    public baq(bbm bbmVar, bar barVar) {
        super(bbmVar);
        this.b = new WeakReference(barVar);
        g(new baa() { // from class: bao
            @Override // defpackage.baa
            public final void k(bbm bbmVar2) {
                final bar barVar2 = (bar) this.a.b.get();
                if (barVar2 != null) {
                    barVar2.n.execute(new Runnable() { // from class: bap
                        @Override // java.lang.Runnable
                        public final void run() {
                            bar barVar3 = barVar2;
                            synchronized (barVar3.o) {
                                barVar3.q = null;
                                bbm bbmVar3 = barVar3.p;
                                if (bbmVar3 != null) {
                                    barVar3.p = null;
                                    barVar3.e(bbmVar3);
                                }
                            }
                        }
                    });
                }
            }
        });
    }
}
