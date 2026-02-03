package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cucd implements cubt {
    public final cucf a;
    public final cudy b;
    public final ctuu c;
    public final fcsu d;
    public final fcsu e;
    public final asgz f;
    public final fcsu g;
    public final ardr h;
    public final ctvb i;
    public final fcsu j;
    private final ctyf k;
    private final fdjx l;
    private final fdvc m;
    private final fdpl n;

    public cucd(Context context, cucf cucfVar, cudy cudyVar, ctyf ctyfVar, ctuu ctuuVar, fcsu fcsuVar, fcsu fcsuVar2, asgz asgzVar, fcsu fcsuVar3, ardr ardrVar, ctvb ctvbVar, fdjx fdjxVar, fcsu fcsuVar4) {
        context.getClass();
        cucfVar.getClass();
        cudyVar.getClass();
        ctyfVar.getClass();
        ctuuVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        ardrVar.getClass();
        ctvbVar.getClass();
        fdjxVar.getClass();
        fcsuVar4.getClass();
        this.a = cucfVar;
        this.b = cudyVar;
        this.k = ctyfVar;
        this.c = ctuuVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = asgzVar;
        this.g = fcsuVar3;
        this.h = ardrVar;
        this.i = ctvbVar;
        this.l = fdjxVar;
        this.j = fcsuVar4;
        fdvc fdvcVarB = ardrVar.a() ? fdtg.b(new cucc(cudyVar.a(), this), fdjxVar, fdur.a(0L, 3), fcvq.a) : new auxs(new fdae() { // from class: cubw
            @Override // defpackage.fdae
            public final Object invoke() {
                return fcvq.a;
            }
        });
        this.m = fdvcVarB;
        this.n = fdud.a(cudyVar.a(), ctyfVar.a(), fdvcVarB, new cubz(this, null));
    }

    @Override // defpackage.cubt
    public final fdpl a() {
        return this.n;
    }
}
