package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dexr implements eora {
    final /* synthetic */ Function a;

    public dexr(Function function) {
        this.a = function;
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.apply(th);
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
    }
}
