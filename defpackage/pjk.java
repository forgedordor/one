package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pjk {
    public static final void a(pgz pgzVar, String str) {
        phi phiVarA = pgzVar.a(str);
        try {
            phiVarA.j();
            fdaa.a(phiVarA, null);
        } finally {
        }
    }

    public static final void b(int i, String str) {
        throw new SQLException(a.g(i, "Error code: ").concat(", message: ".concat(str)));
    }
}
