package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjz implements Callable {
    final /* synthetic */ pff a;
    final /* synthetic */ qkk b;

    public qjz(qkk qkkVar, pff pffVar) {
        this.b = qkkVar;
        this.a = pffVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List call() {
        qkk qkkVar = this.b;
        pex pexVar = qkkVar.a;
        pexVar.n();
        try {
            Cursor cursorA = phn.a(pexVar, this.a, true);
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                while (cursorA.moveToNext()) {
                    String string = cursorA.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorA.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList());
                    }
                }
                cursorA.moveToPosition(-1);
                qkkVar.o(map);
                qkkVar.n(map2);
                ArrayList arrayList = new ArrayList(cursorA.getCount());
                while (cursorA.moveToNext()) {
                    String string3 = cursorA.getString(0);
                    qbo qboVarF = qkr.f(cursorA.getInt(1));
                    pzs pzsVarC = pzs.c(cursorA.getBlob(2));
                    int i = cursorA.getInt(3);
                    int i2 = cursorA.getInt(4);
                    arrayList.add(new qjm(string3, qboVarF, pzsVarC, cursorA.getLong(14), cursorA.getLong(15), cursorA.getLong(16), new pzj(qkr.g(cursorA.getBlob(6)), qkr.l(cursorA.getInt(5)), cursorA.getInt(7) != 0, cursorA.getInt(8) != 0, cursorA.getInt(9) != 0, cursorA.getInt(10) != 0, cursorA.getLong(11), cursorA.getLong(12), qkr.h(cursorA.getBlob(13))), i, qkr.d(cursorA.getInt(17)), cursorA.getLong(18), cursorA.getLong(19), cursorA.getInt(20), i2, cursorA.getLong(21), cursorA.getInt(22), (ArrayList) map.get(cursorA.getString(0)), (ArrayList) map2.get(cursorA.getString(0))));
                }
                pexVar.q();
                pexVar.o();
                return arrayList;
            } finally {
                cursorA.close();
            }
        } catch (Throwable th) {
            this.b.a.o();
            throw th;
        }
    }

    protected final void finalize() {
        this.a.j();
    }
}
