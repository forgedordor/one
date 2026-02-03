package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dktn implements fdau {
    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        icsVar.getClass();
        hmlVar.v(72045356);
        hmlVar.v(516111583);
        long j = glz.a(hmlVar).p;
        hmlVar.o();
        final dktc dktcVarC = dkto.c(j, hmlVar);
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            objF = new jfw();
            hmlVar.y(objF);
        }
        final jfw jfwVar = (jfw) objF;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            objF2 = new jfw();
            hmlVar.y(objF2);
        }
        final jfw jfwVar2 = (jfw) objF2;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF3 = hmlVar.f();
        if (objF3 == obj4) {
            objF3 = new jfw();
            hmlVar.y(objF3);
        }
        final jfw jfwVar3 = (jfw) objF3;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF4 = hmlVar.f();
        if (objF4 == obj4) {
            objF4 = new hpf(0.0f);
            hmlVar.y(objF4);
        }
        final hrg hrgVar = (hrg) objF4;
        hmlVar.o();
        hmlVar.v(516125473);
        hrgVar.h(((Number) dfq.a(dfq.b(hmlVar), 0.0f, 1.0f, ((dktp) dktcVarC).a, hmlVar).a()).floatValue());
        hmlVar.o();
        hmlVar.v(-1224400529);
        boolean zF = hmlVar.F(jfwVar3) | hmlVar.D(dktcVarC) | hmlVar.F(jfwVar2) | hmlVar.F(jfwVar);
        Object objF5 = hmlVar.f();
        if (zF || objF5 == obj4) {
            fdap fdapVar = new fdap() { // from class: dktm
                @Override // defpackage.fdap
                public final Object invoke(Object obj5) {
                    imw imwVar = (imw) obj5;
                    imwVar.getClass();
                    imwVar.p();
                    jfw jfwVar4 = jfwVar3;
                    hrg hrgVar2 = hrgVar;
                    ikp ikpVar = ikj.a;
                    long j2 = ije.g;
                    float fC = hrgVar2.c();
                    ijz ijzVar = (ijz) jfwVar4.a;
                    jfw jfwVar5 = jfwVar2;
                    kji kjiVar = (kji) jfwVar5.a;
                    jfw jfwVar6 = jfwVar;
                    jfwVar4.a = dkto.b(imwVar, ikpVar, j2, dktcVarC, fC, ijzVar, kjiVar, (ihz) jfwVar6.a);
                    jfwVar6.a = new ihz(imwVar.b());
                    jfwVar5.a = imwVar.q();
                    return fctx.a;
                }
            };
            hmlVar.y(fdapVar);
            objF5 = fdapVar;
        }
        hmlVar.o();
        ics icsVarC = ifb.c(icsVar, (fdap) objF5);
        hmlVar.o();
        return icsVarC;
    }
}
