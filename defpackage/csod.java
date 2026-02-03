package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csod {
    public static final csod a = new csod();

    private csod() {
    }

    public static final String b(alqm alqmVar) {
        String strM = alqmVar.m(true);
        if (strM == null || strM.length() == 0) {
            return null;
        }
        return strM;
    }

    public final String a(alqm alqmVar) {
        Optional optionalG;
        if (alqmVar == null || (optionalG = alqmVar.g()) == null) {
            return null;
        }
        return (String) fdct.b(optionalG);
    }
}
