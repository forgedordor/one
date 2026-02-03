package defpackage;

import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esbf {
    public final esbr a;
    public final defr b = new defr();
    final /* synthetic */ esbg c;

    public esbf(esbg esbgVar, esbr esbrVar) {
        this.c = esbgVar;
        this.a = esbrVar;
    }

    public final void a() {
        esbg esbgVar = this.c;
        synchronized (esbgVar.b) {
            dclh.h(esbgVar.c == 0);
            esbgVar.c = 1;
        }
        esbg esbgVar2 = this.c;
        esbgVar2.a.m(new esbe(this)).p(esbgVar2, new defe() { // from class: esbc
            @Override // defpackage.defe
            public final void d(Exception exc) {
                esbf esbfVar;
                esbf esbfVar2 = this.a;
                esbg esbgVar3 = esbfVar2.c;
                Queue queue = esbgVar3.b;
                synchronized (queue) {
                    if (queue.peek() == esbfVar2) {
                        queue.remove();
                        esbgVar3.c = 0;
                        esbfVar = (esbf) queue.peek();
                    } else {
                        esbfVar = null;
                    }
                }
                esbfVar2.b.c(exc);
                if (esbfVar != null) {
                    esbfVar.a();
                }
            }
        });
    }
}
