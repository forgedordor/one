package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckbh implements fdap {
    final /* synthetic */ ckbz a;

    public ckbh(ckbz ckbzVar) {
        this.a = ckbzVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ckce ckceVar = (ckce) obj;
        ckceVar.getClass();
        ckbx ckbxVar = (ckbx) ckceVar.toBuilder();
        ckbxVar.copyOnWrite();
        ckce ckceVar2 = (ckce) ckbxVar.instance;
        ckceVar2.e = this.a.e;
        ckceVar2.b |= 2;
        evsn evsnVarBuild = ckbxVar.build();
        evsnVarBuild.getClass();
        return (ckce) evsnVarBuild;
    }
}
