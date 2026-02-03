package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckbc implements fdap {
    final /* synthetic */ dggn a;
    final /* synthetic */ evvp b;

    public ckbc(dggn dggnVar, evvp evvpVar) {
        this.a = dggnVar;
        this.b = evvpVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ckce ckceVar = (ckce) obj;
        ckceVar.getClass();
        ckbx ckbxVar = (ckbx) ckceVar.toBuilder();
        ckbv ckbvVar = ckceVar.d;
        if (ckbvVar == null) {
            ckbvVar = ckbv.a;
        }
        ckbs ckbsVar = (ckbs) ckbvVar.toBuilder();
        String str = dggo.a(this.a).a;
        evvp evvpVar = this.b;
        ckbsVar.copyOnWrite();
        ckbv ckbvVar2 = (ckbv) ckbsVar.instance;
        evub evubVar = ckbvVar2.b;
        if (!evubVar.b) {
            ckbvVar2.b = evubVar.a();
        }
        ckbvVar2.b.put(str, evvpVar);
        ckbxVar.copyOnWrite();
        ckce ckceVar2 = (ckce) ckbxVar.instance;
        ckbv ckbvVar3 = (ckbv) ckbsVar.build();
        ckbvVar3.getClass();
        ckceVar2.d = ckbvVar3;
        ckceVar2.b |= 1;
        evsn evsnVarBuild = ckbxVar.build();
        evsnVarBuild.getClass();
        return (ckce) evsnVarBuild;
    }
}
