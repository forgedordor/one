package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvjt {
    public static dwik a(dwqw dwqwVar) {
        dwid dwidVar = new dwid();
        char c = 65535;
        int iA = dwqwVar.h().a() - 1;
        if (iA == 1) {
            dwidVar.c(2);
        } else if (iA == 2) {
            String str = ((dwnt) dwqwVar.h().b()).a;
            int iHashCode = str.hashCode();
            if (iHashCode != -989034367) {
                if (iHashCode == -843123565 && str.equals("rich_card")) {
                    c = 1;
                }
            } else if (str.equals("photos")) {
                c = 0;
            }
            if (c == 0) {
                dwidVar.c(3);
            } else if (c != 1) {
                dwidVar.c(0);
            } else {
                dwidVar.c(9);
            }
        } else if (iA == 3) {
            dwidVar.c(7);
        } else if (iA != 4) {
            dwidVar.c(0);
        } else {
            dwidVar.c(8);
        }
        dwidVar.d(dwqwVar.c());
        dwidVar.b(dwqwVar.j().a().f);
        return dwidVar.a();
    }
}
