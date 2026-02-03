package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckbe implements fdap {
    final /* synthetic */ dggn a;
    final /* synthetic */ ckcc b;

    public ckbe(dggn dggnVar, ckcc ckccVar) {
        this.a = dggnVar;
        this.b = ckccVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ckce ckceVar = (ckce) obj;
        ckceVar.getClass();
        ckbx ckbxVar = (ckbx) ckceVar.toBuilder();
        ckbxVar.a(dggo.a(this.a).a, this.b);
        evsn evsnVarBuild = ckbxVar.build();
        evsnVarBuild.getClass();
        return (ckce) evsnVarBuild;
    }
}
