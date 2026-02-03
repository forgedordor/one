package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avgz implements fdap {
    final /* synthetic */ evvp a;

    public avgz(evvp evvpVar) {
        this.a = evvpVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        avde avdeVar = (avde) obj;
        avda avdaVar = (avda) avdeVar.toBuilder();
        avdd avddVar = avdeVar.d;
        if (avddVar == null) {
            avddVar = avdd.a;
        }
        avdb avdbVar = (avdb) avddVar.toBuilder();
        avdbVar.copyOnWrite();
        ((avdd) avdbVar.instance).c = avdc.a(3);
        evvp evvpVar = this.a;
        avdbVar.copyOnWrite();
        avdd avddVar2 = (avdd) avdbVar.instance;
        evvpVar.getClass();
        avddVar2.d = evvpVar;
        avddVar2.b |= 1;
        avdaVar.copyOnWrite();
        avde avdeVar2 = (avde) avdaVar.instance;
        avdd avddVar3 = (avdd) avdbVar.build();
        avddVar3.getClass();
        avdeVar2.d = avddVar3;
        avdeVar2.b |= 1;
        avdaVar.copyOnWrite();
        avde avdeVar3 = (avde) avdaVar.instance;
        evvpVar.getClass();
        avdeVar3.e = evvpVar;
        avdeVar3.b |= 2;
        avdaVar.copyOnWrite();
        avde avdeVar4 = (avde) avdaVar.instance;
        evvpVar.getClass();
        avdeVar4.f = evvpVar;
        avdeVar4.b |= 4;
        return (avde) avdaVar.build();
    }
}
