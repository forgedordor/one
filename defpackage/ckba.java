package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckba implements fdap {
    final /* synthetic */ ckbk a;
    final /* synthetic */ dggn b;
    final /* synthetic */ int c;

    public ckba(ckbk ckbkVar, dggn dggnVar, int i) {
        this.a = ckbkVar;
        this.b = dggnVar;
        this.c = i;
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
        ckbk ckbkVar = this.a;
        dggn dggnVar = this.b;
        int i = this.c;
        String strB = ckbkVar.B(dggnVar);
        ckbsVar.copyOnWrite();
        ckbv ckbvVar2 = (ckbv) ckbsVar.instance;
        evub evubVar = ckbvVar2.c;
        if (!evubVar.b) {
            ckbvVar2.c = evubVar.a();
        }
        ckbvVar2.c.put(strB, Integer.valueOf(i));
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
