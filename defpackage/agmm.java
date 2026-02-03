package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agmm extends dqpi {
    private final Consumer a;

    public agmm(Consumer consumer) {
        this.a = consumer;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        bpyn bpynVar;
        if (((Boolean) agnl.a.e()).booleanValue() && (bpynVar = (bpyn) dqsdVar.b()) != null && bpynVar.k() == 1 && !bpynVar.n().c()) {
            this.a.z(bpynVar.n());
        }
    }
}
