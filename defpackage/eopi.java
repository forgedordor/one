package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eopi implements eooz {
    final /* synthetic */ eopl a;
    final /* synthetic */ eopy b;

    public eopi(eopy eopyVar, eopl eoplVar) {
        this.a = eoplVar;
        this.b = eopyVar;
    }

    @Override // defpackage.eooz
    public final ListenableFuture a(Object obj) {
        eopm eopmVar = new eopm();
        eopm eopmVar2 = this.b.b;
        try {
            eopy eopyVarA = this.a.a(eopmVar.a, obj);
            eopyVarA.i(eopmVar);
            return eopyVarA.c;
        } finally {
            eopmVar2.b(eopmVar, eoqg.a);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
