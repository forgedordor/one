package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qif implements qid {
    public final pex a;
    public final pdn b;

    public qif(pex pexVar) {
        this.a = pexVar;
        this.b = new qie(pexVar);
    }

    @Override // defpackage.qid
    public final List a(String str) throws IOException {
        pff pffVarA = pff.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        pffVarA.g(1, str);
        pex pexVar = this.a;
        pexVar.m();
        Cursor cursorA = phn.a(pexVar, pffVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorA.getCount());
            while (cursorA.moveToNext()) {
                arrayList.add(cursorA.getString(0));
            }
            return arrayList;
        } finally {
            cursorA.close();
            pffVarA.j();
        }
    }
}
