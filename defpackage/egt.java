package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egt {
    public static final void a(ics icsVar, hml hmlVar) {
        egv egvVar = egv.a;
        long jB = hmg.b(hmlVar);
        long j = jB ^ (jB >>> 32);
        ics icsVarB = icj.b(hmlVar, icsVar);
        hxi hxiVarN = hmlVar.N();
        fdae fdaeVar = jbb.a;
        hmlVar.M();
        hmlVar.x();
        if (hmlVar.H()) {
            hmlVar.j(fdaeVar);
        } else {
            hmlVar.z();
        }
        int i = (int) j;
        hsk.b(hmlVar, egvVar, jbb.e);
        hsk.b(hmlVar, hxiVarN, jbb.d);
        hsk.b(hmlVar, icsVarB, jbb.c);
        fdat fdatVar = jbb.f;
        if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
            Integer numValueOf = Integer.valueOf(i);
            hmlVar.y(numValueOf);
            hmlVar.h(numValueOf, fdatVar);
        }
        hmlVar.n();
    }
}
