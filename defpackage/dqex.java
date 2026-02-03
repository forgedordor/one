package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqex implements dqfz {
    public static final Duration a = eoob.e(2);
    public final dqee b;
    public final feav c;
    public final dqgm d;
    private final fdjx e;

    public dqex(dqee dqeeVar, final dqdk dqdkVar, fdjx fdjxVar, cqwi cqwiVar) {
        dqdkVar.getClass();
        this.b = dqeeVar;
        this.e = fdjxVar;
        this.c = new feaz();
        fdvc fdvcVar = dqeeVar.n;
        dqew dqewVar = new dqew(fdvcVar);
        fdus fdusVar = fdur.a;
        this.d = new dqgm(fdtg.b(dqewVar, fdjxVar, fdusVar, e((dqdp) fdvcVar.c())), new fdae() { // from class: dqef
            @Override // defpackage.fdae
            public final Object invoke() {
                fdvc fdvcVar2 = ((xks) dqdkVar.b).f;
                Duration duration = dqex.a;
                Duration duration2 = (Duration) fdvcVar2.c();
                return duration2 == null ? dqex.a : duration2;
            }
        }, this, fdtg.b(new dqeq(dqeeVar.n), fdjxVar, fdusVar, Duration.ZERO), dqeeVar.o, fdtg.b(new dqet(dqeeVar.n), fdjxVar, fdusVar, null), fdtg.b(new dqen(dqeeVar.n), fdjxVar, fdusVar, null), new dqga(null), cqwiVar, Optional.empty(), false, false);
    }

    public static final dqgo e(dqdp dqdpVar) {
        if ((dqdpVar instanceof dqdm) || (dqdpVar instanceof dqdl)) {
            return dqgo.a;
        }
        if (dqdpVar instanceof dqdn) {
            return dqgo.b;
        }
        if (dqdpVar instanceof dqdo) {
            return dqgo.c;
        }
        throw new fctg();
    }

    private final void f(fdat fdatVar) {
        fdil.d(this.e, null, null, new dqeg(this, fdatVar, null), 3);
    }

    @Override // defpackage.dqfz
    public final void a(boolean z, boolean z2, dqbw dqbwVar) {
        f(new dqeh(z, dqbwVar, null));
    }

    @Override // defpackage.dqfz
    public final void b() {
        f(new dqei(null));
    }

    @Override // defpackage.dqfz
    public final void c() {
        f(new dqej(null));
    }

    @Override // defpackage.dqfz
    public final void d(dqbw dqbwVar) {
        f(new dqek(dqbwVar, null));
    }
}
