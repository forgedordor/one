package defpackage;

import android.database.Cursor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qip {
    public static qio a(qiq qiqVar, qiw qiwVar) throws IOException {
        pff pffVarA = pff.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        pffVarA.g(1, qiwVar.a);
        pffVarA.e(2, qiwVar.b);
        pex pexVar = ((qiu) qiqVar).a;
        pexVar.m();
        Cursor cursorA = phn.a(pexVar, pffVarA, false);
        try {
            return cursorA.moveToFirst() ? new qio(cursorA.getString(phm.b(cursorA, "work_spec_id")), cursorA.getInt(phm.b(cursorA, "generation")), cursorA.getInt(phm.b(cursorA, "system_id"))) : null;
        } finally {
            cursorA.close();
            pffVarA.j();
        }
    }
}
