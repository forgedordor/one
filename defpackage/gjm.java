package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjm {
    public static final gjk a(gda gdaVar, long j) {
        gjk gjkVar = gdaVar.U;
        if (gjkVar != null) {
            return gjkVar;
        }
        long j2 = ije.g;
        gjk gjkVar2 = new gjk(j2, j, j2, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.38f, ije.f(j)));
        gdaVar.U = gjkVar2;
        return gjkVar2;
    }

    public static final gjk b(gda gdaVar) {
        gjk gjkVar = gdaVar.W;
        if (gjkVar != null) {
            return gjkVar;
        }
        long jF = gdd.f(gdaVar, 26);
        long jF2 = gdd.f(gdaVar, 10);
        long jF3 = gdd.f(gdaVar, 18);
        long jF4 = ijg.f(ije.d(jF3), ije.c(jF3), ije.b(jF3), 0.1f, ije.f(jF3));
        long jF5 = gdd.f(gdaVar, 18);
        gjk gjkVar2 = new gjk(jF, jF2, jF4, ijg.f(ije.d(jF5), ije.c(jF5), ije.b(jF5), 0.38f, ije.f(jF5)));
        gdaVar.W = gjkVar2;
        return gjkVar2;
    }

    public static final gjk d(long j, long j2, long j3, long j4, hml hmlVar, int i) {
        if ((i & 1) != 0) {
            j = ije.h;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = ((ije) hmlVar.e(gea.a)).i;
        }
        return a(glz.a(hmlVar), ((ije) hmlVar.e(gea.a)).i).c(j5, j2, (i & 4) != 0 ? ije.h : j3, j4);
    }
}
