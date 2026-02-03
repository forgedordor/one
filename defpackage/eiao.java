package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiao {
    public final eiai a;
    public final fcsu b;
    private final fcsu c;

    public eiao(eiai eiaiVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = eiaiVar;
        this.c = fcsuVar;
        this.b = fcsuVar2;
    }

    public final ListenableFuture a(final ListenableFuture listenableFuture, eooz eoozVar) {
        Set set = (Set) this.c.b();
        ekhv ekhvVarI = ekhx.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ekhvVarI.c(new eiam(eoozVar, (eiaq) it.next()));
        }
        return this.a.a(new eooy() { // from class: eiak
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return listenableFuture;
            }
        }, ekhvVarI.g());
    }
}
