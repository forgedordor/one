package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdna implements fdap {
    final /* synthetic */ cdnb a;
    final /* synthetic */ int b;

    public cdna(cdnb cdnbVar, int i) {
        this.a = cdnbVar;
        this.b = i;
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
        int i = this.b;
        cdmpVar.copyOnWrite();
        cdmq cdmqVar2 = (cdmq) cdmpVar.instance;
        cdmqVar2.b |= 1;
        cdmqVar2.c = i;
        cdmpVar.copyOnWrite();
        ((cdmq) cdmpVar.instance).d = false;
        cdmq cdmqVar3 = (cdmq) cdmpVar.build();
        cdndVar.copyOnWrite();
        cdne cdneVar2 = (cdne) cdndVar.instance;
        cdmqVar3.getClass();
        cdneVar2.c = cdmqVar3;
        cdneVar2.b |= 1;
        cdnbVar.d(cdndVar);
        evsn evsnVarBuild = cdndVar.build();
        evsnVarBuild.getClass();
        return (cdne) evsnVarBuild;
    }
}
