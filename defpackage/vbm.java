package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vbm implements fdap {
    public static final vbm a = new vbm();

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cwtl cwtlVar = (cwtl) obj;
        cwtlVar.getClass();
        cwtk cwtkVar = (cwtk) cwtlVar.toBuilder();
        int i = cwtlVar.d + 1;
        cwtkVar.copyOnWrite();
        cwtl cwtlVar2 = (cwtl) cwtkVar.instance;
        cwtlVar2.b |= 2;
        cwtlVar2.d = i;
        evsn evsnVarBuild = cwtkVar.build();
        evsnVarBuild.getClass();
        return (cwtl) evsnVarBuild;
    }
}
