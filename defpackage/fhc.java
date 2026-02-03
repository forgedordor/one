package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhc {
    public static final boolean a(juo juoVar) {
        int iA = juoVar.a();
        List list = juoVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jum jumVar = (jum) list.get(i);
                if ((jumVar.a instanceof juy) && jur.b(0, iA, jumVar.b, jumVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
