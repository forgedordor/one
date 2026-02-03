package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsxj {
    public final List c;
    public final SparseIntArray d;
    private final int g;
    public final eohz a = dstw.a();
    public final List b = new ArrayList();
    public final List e = new ArrayList();
    public final SparseIntArray f = new SparseIntArray();

    public dsxj(int i, int i2) {
        this.g = i;
        this.c = new ArrayList(i2);
        this.d = new SparseIntArray(i2);
    }

    final dsvq a(dsvd dsvdVar, int i) {
        dsvdVar.g = this.g;
        if (i == -1) {
            i = -1;
        }
        List list = this.c;
        dsvp dsvpVar = dsvdVar.c;
        int size = list.size();
        int iH = dsvdVar.h();
        dsvpVar.copyOnWrite();
        dsvq dsvqVar = (dsvq) dsvpVar.instance;
        dsvq dsvqVar2 = dsvq.a;
        int i2 = iH - 1;
        if (iH == 0) {
            throw null;
        }
        dsvqVar.e = i2;
        dsvqVar.b |= 2;
        eohz eohzVar = this.a;
        eohx eohxVar = ((dsvq) dsvpVar.instance).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        eohw eohwVar = (eohw) eohxVar.toBuilder();
        eohwVar.copyOnWrite();
        eohx eohxVar2 = (eohx) eohwVar.instance;
        eohzVar.getClass();
        eohxVar2.e = eohzVar;
        eohxVar2.b |= 2048;
        eohwVar.copyOnWrite();
        eohx eohxVar3 = (eohx) eohwVar.instance;
        eohxVar3.b |= 1;
        eohxVar3.c = size;
        eohx eohxVar4 = (eohx) eohwVar.build();
        dsvpVar.copyOnWrite();
        dsvq dsvqVar3 = (dsvq) dsvpVar.instance;
        eohxVar4.getClass();
        dsvqVar3.d = eohxVar4;
        dsvqVar3.b |= 1;
        Set set = dsvdVar.e.a;
        if (!set.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "ImpressionSet: ".concat(dsvdVar.toString()));
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((dswy) it.next()).d();
            }
        }
        dsvq dsvqVarA = dsvdVar.a();
        list.add(dsvqVarA);
        this.d.append(size, i);
        return dsvqVarA;
    }

    final void b(dsxx dsxxVar) {
        if (dsxxVar.b == 1) {
            ejwl.a(this.d.valueAt(dsxxVar.c()) == -1);
        }
        this.b.add(dsxxVar);
    }
}
