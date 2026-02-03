package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eopf implements eooy {
    final /* synthetic */ eopk a;
    final /* synthetic */ eopm b;

    public eopf(eopk eopkVar, eopm eopmVar) {
        this.a = eopkVar;
        this.b = eopmVar;
    }

    @Override // defpackage.eooy
    public final ListenableFuture a() {
        eopm eopmVar = new eopm();
        try {
            eopy eopyVarA = this.a.a(eopmVar.a);
            eopyVarA.i(this.b);
            return eopyVarA.c;
        } finally {
            this.b.b(eopmVar, eoqg.a);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
