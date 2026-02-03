package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsve {
    final dsvi a;

    public dsve(int i) {
        dsvi dsviVar = (dsvi) dsvj.a.createBuilder();
        this.a = dsviVar;
        dsviVar.copyOnWrite();
        dsvj dsvjVar = (dsvj) dsviVar.instance;
        dsvjVar.c = i - 1;
        dsvjVar.b |= 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dsvg a() {
        return new dsvg((dsvj) this.a.build());
    }

    public final void b(dsvf dsvfVar) {
        dsvi dsviVar = this.a;
        evrp evrpVar = dsvfVar.a;
        ejwl.l(!dsviVar.c(evrpVar));
        int iA = evrpVar.a();
        dsviVar.copyOnWrite();
        dsvj dsvjVar = (dsvj) dsviVar.instance;
        dsvj dsvjVar2 = dsvj.a;
        evsx evsxVar = dsvjVar.d;
        if (!evsxVar.c()) {
            dsvjVar.d = evsn.mutableCopy(evsxVar);
        }
        dsvjVar.d.h(iA);
        dsviVar.e(evrpVar, dsvfVar.b);
    }
}
