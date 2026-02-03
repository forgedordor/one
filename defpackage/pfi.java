package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfi extends pdu {
    final /* synthetic */ pfl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfi(String[] strArr, pfl pflVar) {
        super(strArr);
        this.b = pflVar;
    }

    @Override // defpackage.pdu
    public final void a(Set set) {
        akj akjVarA = akj.a();
        final pfl pflVar = this.b;
        Runnable runnable = new Runnable() { // from class: pfh
            @Override // java.lang.Runnable
            public final void run() {
                pfl pflVar2 = pflVar;
                AtomicBoolean atomicBoolean = pflVar2.h;
                boolean zN = pflVar2.n();
                if (atomicBoolean.compareAndSet(false, true) && zN) {
                    pex pexVar = pflVar2.a;
                    fdil.d(pexVar.k(), pflVar2.i, null, new pfg(pflVar2, null), 2);
                }
            }
        };
        if (akjVarA.c()) {
            runnable.run();
        } else {
            akjVarA.b(runnable);
        }
    }
}
