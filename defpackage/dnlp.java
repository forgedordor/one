package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnlp implements fdap {
    final /* synthetic */ fdap a;

    public dnlp(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dnne dnneVar;
        dnnj dnnjVar = (dnnj) obj;
        if (dnnjVar == null || (dnneVar = (dnne) dnnjVar.toBuilder()) == null) {
            return null;
        }
        this.a.invoke(dnneVar);
        return (dnnj) dnneVar.build();
    }
}
