package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chmf implements fdap {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public chmf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        chma chmaVar = (chma) ((chmc) obj).toBuilder();
        chne chneVar = (chne) chnf.a.createBuilder();
        chneVar.getClass();
        chneVar.copyOnWrite();
        chnf chnfVar = (chnf) chneVar.instance;
        chnfVar.b |= 1;
        chnfVar.c = this.b;
        evsn evsnVarBuild = chneVar.build();
        evsnVarBuild.getClass();
        String str = this.a;
        str.getClass();
        chmaVar.copyOnWrite();
        ((chmc) chmaVar.instance).a().put(str, (chnf) evsnVarBuild);
        return (chmc) chmaVar.build();
    }
}
