package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edgp {
    private final fcsu a;

    public edgp(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final edgq a() {
        return new edgq((ejxm) this.a.b());
    }

    public final edgr b(int i) {
        ejxm ejxmVar = new edgq((ejxm) this.a.b()).a;
        eurd eurdVar = (eurd) eure.a.createBuilder();
        eurx eurxVar = (eurx) eury.a.createBuilder();
        eurxVar.copyOnWrite();
        eury euryVar = (eury) eurxVar.instance;
        euryVar.c = 6;
        euryVar.b |= 1;
        eurxVar.copyOnWrite();
        eury euryVar2 = (eury) eurxVar.instance;
        euryVar2.d = i - 1;
        euryVar2.b |= 2;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eury euryVar3 = (eury) eurxVar.build();
        euryVar3.getClass();
        eureVar.d = euryVar3;
        eureVar.c = 1;
        return new edgr(ejxmVar, eurdVar);
    }
}
