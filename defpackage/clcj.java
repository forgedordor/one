package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clcj {
    final clcf c;
    public final List b = new ArrayList();
    public final Executor a = new eoss(eoqg.a);

    public clcj(clcf clcfVar) {
        this.c = clcfVar;
    }

    public final void a(cldb cldbVar) {
        List list = this.b;
        if (list.remove(cldbVar) && list.isEmpty()) {
            final clcf clcfVar = this.c;
            auvh.h(eijx.f(new Runnable() { // from class: clcd
                @Override // java.lang.Runnable
                public final void run() {
                    clcf clcfVar2 = clcfVar;
                    clcfVar2.c = false;
                    if (clcfVar2.d) {
                        return;
                    }
                    ((clds) clcfVar2.a.b()).a();
                }
            }, clcfVar.b));
        }
    }
}
