package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czlz extends gd {
    public ekgb h;
    private final SparseArray i;
    private final Optional j;

    public czlz(fr frVar, Optional optional) {
        super(frVar);
        this.i = new SparseArray();
        this.j = optional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gd
    public final ea b(int i) {
        int i2;
        ea eaVarH;
        SparseArray sparseArray = this.i;
        if (sparseArray.get(i) != null) {
            return (ea) sparseArray.get(i);
        }
        String strH = ((MediaViewerItem) this.h.get(i)).h();
        if (le.z(strH)) {
            this.j.get();
            i2 = i;
            eaVarH = czqd.k(((MediaViewerItem) this.h.get(i)).b(), 0, this.h.size(), i2, 0L, false);
        } else {
            i2 = i;
            eaVarH = czly.h(((MediaViewerItem) this.h.get(i2)).b(), strH, 1);
        }
        sparseArray.put(i2, eaVarH);
        return eaVarH;
    }

    @Override // defpackage.pou
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        ArrayList arrayList;
        this.i.remove(i);
        ea eaVar = (ea) obj;
        if (this.b == null) {
            this.b = new cg(this.a);
        }
        while (true) {
            arrayList = this.c;
            if (arrayList.size() > i) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i, eaVar.aF() ? this.a.d(eaVar) : null);
        this.d.set(i, null);
        this.b.o(eaVar);
        if (eaVar.equals(this.e)) {
            this.e = null;
        }
    }

    @Override // defpackage.pou
    public final int j() {
        ekgb ekgbVar = this.h;
        if (ekgbVar != null) {
            return ekgbVar.size();
        }
        return 0;
    }
}
