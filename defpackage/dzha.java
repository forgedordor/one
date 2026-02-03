package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzha implements dzhb {
    public dzgh a;
    public final diep b;
    public final fcsu c;
    public final dzgv d;
    private final Executor e;
    private final Executor f;
    private final Set g;

    public dzha(Executor executor, Set set, dzgv dzgvVar, diep diepVar, fcsu fcsuVar) {
        this.e = executor;
        this.d = dzgvVar;
        this.f = new eoss(executor);
        this.g = set;
        this.b = diepVar;
        this.c = fcsuVar;
    }

    @Override // defpackage.dzgx
    public final ListenableFuture a(final dzgw dzgwVar) {
        return eork.l(new Runnable() { // from class: dzgz
            /* JADX WARN: Removed duplicated region for block: B:54:0x017a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 452
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dzgz.run():void");
            }
        }, this.f);
    }

    @Override // defpackage.dzhb
    public final void b() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            eooq.g(((dzhg) it.next()).a(), new eooz() { // from class: dzgy
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.a((dzgw) obj);
                }
            }, this.e);
        }
    }
}
