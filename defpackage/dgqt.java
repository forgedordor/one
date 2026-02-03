package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgqt {
    static String a(dgij dgijVar, String str) throws dgqu {
        if (dgijVar == null) {
            throw new dgqu("Characteristic cannot be null.", 1);
        }
        String strE = dgijVar.e(str);
        if (strE != null) {
            return strE;
        }
        throw new dgqu(str.concat(" parameter cannot be null."), 3);
    }

    static void b(dgij dgijVar, String[] strArr) throws dgqu {
        if (dgijVar == null) {
            throw new dgqu("Characteristic cannot be null.", 1);
        }
        for (String str : strArr) {
            if (dgijVar.e(str) == null) {
                throw new dgqu(String.valueOf(str).concat(" parameter cannot be null."), 3);
            }
        }
    }
}
