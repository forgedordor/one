package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkq implements qkn {
    public final pex a;
    public final pfn b;
    private final pdn c;

    public qkq(pex pexVar) {
        this.a = pexVar;
        this.c = new qko(pexVar);
        this.b = new qkp(pexVar);
    }

    @Override // defpackage.qkn
    public final List a(String str) throws IOException {
        pff pffVarA = pff.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    @Override // defpackage.qkn
    public final /* synthetic */ void b(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            qkm qkmVar = new qkm((String) it.next(), str);
            pex pexVar = this.a;
            pexVar.m();
            pexVar.n();
            try {
                this.c.a(qkmVar);
                pexVar.q();
                pexVar.o();
            } catch (Throwable th) {
                this.a.o();
                throw th;
            }
        }
    }
}
