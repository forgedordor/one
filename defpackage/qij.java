package defpackage;

import android.database.Cursor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qij implements qih {
    private final pex a;
    private final pdn b;

    public qij(pex pexVar) {
        this.a = pexVar;
        this.b = new qii(pexVar);
    }

    @Override // defpackage.qih
    public final Long a(String str) throws IOException {
        pff pffVarA = pff.a("SELECT long_value FROM Preference where `key`=?", 1);
        pffVarA.g(1, str);
        pex pexVar = this.a;
        pexVar.m();
        Cursor cursorA = phn.a(pexVar, pffVarA, false);
        try {
            Long lValueOf = null;
            if (cursorA.moveToFirst() && !cursorA.isNull(0)) {
                lValueOf = Long.valueOf(cursorA.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorA.close();
            pffVarA.j();
        }
    }

    @Override // defpackage.qih
    public final void b(qig qigVar) {
        pex pexVar = this.a;
        pexVar.m();
        pexVar.n();
        try {
            this.b.a(qigVar);
            pexVar.q();
        } finally {
            this.a.o();
        }
    }
}
