package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dreu {
    public static boolean a(drev drevVar, ejwi ejwiVar, ewbx ewbxVar) {
        String strName;
        try {
            for (ewbw ewbwVar : ewbxVar.b) {
                int i = ewbwVar.b;
                if ((i & 8) != 0 && ((i & 1) != 0 || (i & 64) != 0)) {
                    if ((i & 2) != 0) {
                        ewuw ewuwVar = ewbwVar.g;
                        if (ewuwVar == null) {
                            ewuwVar = ewuw.a;
                        }
                        byte[] byteArray = ewuwVar.toByteArray();
                        if ((ewbwVar.b & 64) != 0) {
                            strName = ewbwVar.j;
                        } else {
                            ewut ewutVarB = ewut.b(ewbwVar.c);
                            if (ewutVarB == null) {
                                ewutVarB = ewut.UNKNOWN;
                            }
                            strName = ewutVarB.name();
                        }
                        drev drevVar2 = drevVar;
                        ejwi ejwiVar2 = ejwiVar;
                        if (!drevVar2.g(ejwiVar2, strName, (String[]) drfa.c(ewbwVar.d).toArray(new String[0]), ewbwVar.e, ewbwVar.f, byteArray)) {
                            return false;
                        }
                        drevVar = drevVar2;
                        ejwiVar = ejwiVar2;
                    }
                }
                return false;
            }
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public static byte[][] b(drev drevVar, ejwi ejwiVar, ewbk ewbkVar) {
        return drevVar.d(ejwiVar, ewbkVar);
    }
}
