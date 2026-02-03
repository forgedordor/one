package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chmq implements fdap {
    final /* synthetic */ evvp a;

    public chmq(evvp evvpVar) {
        this.a = evvpVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        chma chmaVar = (chma) ((chmc) obj).toBuilder();
        chmaVar.copyOnWrite();
        chmc chmcVar = (chmc) chmaVar.instance;
        evvp evvpVar = this.a;
        evvpVar.getClass();
        chmcVar.d = evvpVar;
        chmcVar.b |= 2;
        return (chmc) chmaVar.build();
    }
}
