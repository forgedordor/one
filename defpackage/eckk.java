package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eckk extends eclo {
    public static final eclo a = new eckk();

    private eckk() {
    }

    @Override // defpackage.eclo
    public final /* synthetic */ ecln a(ecjj ecjjVar, String str, Executor executor, ecev ecevVar) {
        evrr evrrVarA;
        ecia eciaVar = (ecia) ecjjVar;
        eclb eclbVar = eciaVar.e;
        ejwl.a(eclbVar instanceof ecjx);
        if (eciaVar.f) {
            evrrVarA = evrr.a();
        } else {
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            evrrVarA = evrr.a;
        }
        return new eckm(str, eork.i(eciaVar.a), new eclw(eciaVar.b, evrrVarA), executor, ecevVar, ((ecjx) eclbVar).a(), eciaVar.c, new eidn());
    }

    @Override // defpackage.eclo
    public final String b() {
        return "signal";
    }
}
