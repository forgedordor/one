package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehkd implements eooz {
    final /* synthetic */ ehkf a;
    final /* synthetic */ evqs b;
    final /* synthetic */ dzzs c;

    public ehkd(ehkf ehkfVar, evqs evqsVar, dzzs dzzsVar) {
        this.a = ehkfVar;
        this.b = evqsVar;
        this.c = dzzsVar;
    }

    @Override // defpackage.eooz
    public final /* bridge */ /* synthetic */ ListenableFuture a(Object obj) {
        ehkf ehkfVar = this.a;
        return ehkfVar.c(this.b, (efwo) obj, ehkfVar.a, this.c);
    }
}
