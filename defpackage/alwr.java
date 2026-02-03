package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwr {
    public static final boolean a(ajlt ajltVar) {
        ajlq ajlqVarA;
        int iOrdinal;
        ajmc ajmcVarD = ajltVar.d();
        if ((ajmcVarD instanceof ajmq) && ((ajlqVarA = ((ajmq) ajmcVarD).a()) == null || (iOrdinal = ajlqVarA.ordinal()) == 0 || iOrdinal == 4 || iOrdinal == 5)) {
            return false;
        }
        amvr amvrVarG = ajltVar.g();
        if (amvrVarG instanceof amvw) {
            amvw amvwVar = (amvw) amvrVarG;
            if (amvwVar.a().isEmpty()) {
                return false;
            }
            ekgb ekgbVarA = amvwVar.a();
            if (ekgbVarA.isEmpty()) {
                return true;
            }
            ekqh it = ekgbVarA.iterator();
            while (it.hasNext()) {
                if (!b((amsv) it.next())) {
                    return false;
                }
            }
            return true;
        }
        if (!(amvrVarG instanceof amwi)) {
            if (amvrVarG instanceof amwf) {
                String strC = ((amwf) amvrVarG).c();
                return (strC == null || strC.length() == 0) ? false : true;
            }
            if (amvrVarG instanceof amsv) {
                return b((amsv) amvrVarG);
            }
            return false;
        }
        amwi amwiVar = (amwi) amvrVarG;
        String strD = amwiVar.d();
        if (strD != null && strD.length() != 0) {
            return true;
        }
        String strC2 = amwiVar.c();
        return (strC2 == null || strC2.length() == 0) ? false : true;
    }

    private static final boolean b(amsv amsvVar) {
        if (amsvVar.e() == null) {
            return false;
        }
        amyb amybVarFm = amsvVar.fm();
        return amybVarFm == null || !amybVarFm.f();
    }
}
