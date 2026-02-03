package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cutz implements cvcr {
    final /* synthetic */ cuty a;

    public cutz(cuty cutyVar) {
        this.a = cutyVar;
    }

    @Override // defpackage.cvcr
    public final void a(Optional optional) {
        cuty cutyVar = this.a;
        if (optional.equals(cutyVar.t)) {
            return;
        }
        alqm alqmVarU = ((alrj) cutyVar.ag.b()).u(cutyVar.s.h, cutyVar.n);
        if ((cutyVar.s.b & 32) == 0 || !optional.equals(Optional.of(alqmVarU))) {
            cutyVar.V.h(egpq.b(cutyVar.b().b(optional)), new egpo(cutyVar.m), cutyVar.v);
        }
    }
}
