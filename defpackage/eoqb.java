package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eoqb extends eoot {
    private List b;

    public eoqb(ekfn ekfnVar, boolean z) {
        super(ekfnVar, z, true);
        List listD = ekfnVar.isEmpty() ? Collections.EMPTY_LIST : ekjz.d(ekfnVar.size());
        for (int i = 0; i < ekfnVar.size(); i++) {
            listD.add(null);
        }
        this.b = listD;
    }

    @Override // defpackage.eoot
    public final void e(int i, Object obj) {
        List list = this.b;
        if (list != null) {
            list.set(i, new eoqa(obj));
        }
    }

    @Override // defpackage.eoot
    public final void g() {
        List list = this.b;
        if (list != null) {
            set(w(list));
        }
    }

    @Override // defpackage.eoot
    public final void v(int i) {
        super.v(i);
        this.b = null;
    }

    public abstract Object w(List list);
}
