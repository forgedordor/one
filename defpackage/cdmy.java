package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdmy implements fdap {
    final /* synthetic */ cdnb a;

    public cdmy(cdnb cdnbVar) {
        this.a = cdnbVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cdne cdneVar = (cdne) obj;
        cdneVar.getClass();
        cdnd cdndVar = (cdnd) cdneVar.toBuilder();
        cdmq cdmqVar = cdneVar.c;
        if (cdmqVar == null) {
            cdmqVar = cdmq.a;
        }
        cdnb cdnbVar = this.a;
        cdmp cdmpVar = (cdmp) cdmqVar.toBuilder();
        cdmpVar.copyOnWrite();
        ((cdmq) cdmpVar.instance).d = true;
        cdmq cdmqVar2 = (cdmq) cdmpVar.build();
        cdndVar.copyOnWrite();
        cdne cdneVar2 = (cdne) cdndVar.instance;
        cdmqVar2.getClass();
        cdneVar2.c = cdmqVar2;
        cdneVar2.b |= 1;
        cdnbVar.d(cdndVar);
        evsn evsnVarBuild = cdndVar.build();
        evsnVarBuild.getClass();
        return (cdne) evsnVarBuild;
    }
}
