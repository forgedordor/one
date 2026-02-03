package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oem {
    public final List a = new ArrayList();
    public final SparseArray b;
    public final SparseArray c;
    private final SparseArray d;

    public oem(oay oayVar) {
        for (int i = 0; i < oayVar.a.size(); i++) {
            this.a.add(new oel());
        }
        this.d = new SparseArray();
        this.b = new SparseArray();
        this.c = new SparseArray();
    }

    public final mau a(int i, int i2) {
        SparseArray sparseArray = ((oel) this.a.get(i)).a;
        mee.c(mgb.U(sparseArray, i2));
        return (mau) sparseArray.get(i2);
    }

    public final odm b(int i) {
        return (odm) this.d.get(i);
    }

    public final void c(int i, odm odmVar) {
        SparseArray sparseArray = this.d;
        mee.d(!mgb.U(sparseArray, i), "Exactly one SampleExporter can be added for each track type.");
        sparseArray.put(i, odmVar);
    }

    public final boolean d() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    oel oelVar = (oel) list.get(i2);
                    if (oelVar.b != oelVar.a.size()) {
                        return false;
                    }
                }
                return true;
            }
            if (((oel) list.get(i)).b == -1) {
                return false;
            }
            i++;
        }
    }
}
