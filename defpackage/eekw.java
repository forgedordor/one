package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eekw {
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    public boolean c;
    public boolean d;
    public eegy e;

    public final void a() {
        if (this.e != null) {
            new HashSet(this.b);
        }
    }

    public final boolean b(eelm eelmVar) {
        Integer numValueOf = Integer.valueOf(eelmVar.getId());
        Set set = this.b;
        if (set.contains(numValueOf)) {
            return false;
        }
        Map map = this.a;
        int iIntValue = -1;
        if (this.c && !set.isEmpty()) {
            iIntValue = ((Integer) set.iterator().next()).intValue();
        }
        eelm eelmVar2 = (eelm) map.get(Integer.valueOf(iIntValue));
        if (eelmVar2 != null) {
            c(eelmVar2, false);
        }
        boolean zAdd = set.add(numValueOf);
        if (!eelmVar.isChecked()) {
            eelmVar.setChecked(true);
        }
        return zAdd;
    }

    public final boolean c(eelm eelmVar, boolean z) {
        Integer numValueOf = Integer.valueOf(eelmVar.getId());
        Set set = this.b;
        if (!set.contains(numValueOf)) {
            return false;
        }
        if (z && set.size() == 1 && set.contains(numValueOf)) {
            eelmVar.setChecked(true);
            return false;
        }
        boolean zRemove = set.remove(numValueOf);
        if (eelmVar.isChecked()) {
            eelmVar.setChecked(false);
        }
        return zRemove;
    }
}
