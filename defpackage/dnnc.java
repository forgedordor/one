package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnnc {
    public final eosd a;
    public final eosd b;
    public final eosd c;
    public final eosd d;
    private final dnnd e;
    private final dngc f;

    public dnnc(eosd eosdVar, eosd eosdVar2, eosd eosdVar3, eosd eosdVar4, dnnd dnndVar, dngc dngcVar) {
        eosdVar.getClass();
        eosdVar2.getClass();
        eosdVar3.getClass();
        eosdVar4.getClass();
        dnndVar.getClass();
        dngcVar.getClass();
        this.a = eosdVar;
        this.b = eosdVar2;
        this.c = eosdVar3;
        this.d = eosdVar4;
        this.e = dnndVar;
        this.f = dngcVar;
    }

    public final void a() {
        if (this.e.a.compareAndSet(false, true)) {
            this.f.d("GboardDataInitializer#init", new fdae() { // from class: dnnb
                @Override // defpackage.fdae
                public final Object invoke() {
                    drle drleVar;
                    dnnc dnncVar = this.a;
                    eosd eosdVar = dnncVar.a;
                    eosd eosdVar2 = dnncVar.b;
                    eosd eosdVar3 = dnncVar.c;
                    eosd eosdVar4 = dnncVar.d;
                    drle drleVar2 = drle.b;
                    if (drleVar2 != null) {
                        return drleVar2;
                    }
                    synchronized (drle.class) {
                        drleVar = drle.b;
                        if (drleVar == null) {
                            drleVar = new drle(eosdVar, eosdVar2, eosdVar3, eosdVar4);
                            drle.b = drleVar;
                        }
                    }
                    return drleVar;
                }
            });
        }
    }
}
