package defpackage;

import defpackage.cupu;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuua implements eind {
    final /* synthetic */ cuty a;

    public cuua(cuty cutyVar) {
        this.a = cutyVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        cuty cutyVar = this.a;
        cuuq cuuqVarB = cutyVar.b();
        cmfo cmfoVar = cuuqVarB.b;
        final boolean z = ((cupu.a) einbVar).a;
        eiju eijuVarJ = cmfoVar.j(new ejvr() { // from class: cuul
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cuud cuudVar = (cuud) obj;
                int i = cuuq.d;
                cuudVar.getClass();
                cuuc builder = cuudVar.toBuilder();
                builder.copyOnWrite();
                cuud cuudVar2 = (cuud) builder.instance;
                cuudVar2.b |= 64;
                cuudVar2.i = z;
                return builder.build();
            }
        });
        cuuqVarB.j(eijuVarJ);
        cutyVar.V.h(egpq.b(eijuVarJ), new egpo(cutyVar.l), cutyVar.v);
        return eine.a;
    }
}
