package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cudx {
    public final List a;
    public final ChipData b;
    public final ChipData c;
    public final cueh d;
    public final List e;
    private final Set f;

    public cudx(List list, Set set, ChipData chipData, ChipData chipData2, cueh cuehVar) {
        cuehVar.getClass();
        this.a = list;
        this.f = set;
        this.b = chipData;
        this.c = chipData2;
        this.d = cuehVar;
        if (!list.isEmpty() && ((ChipData) list.get(0)).e) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((ChipData) obj).e) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        this.e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(ajou ajouVar) {
        ekqh it = ajouVar.b().iterator();
        it.getClass();
        while (it.hasNext()) {
            if (b(((ajpk) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(alqm alqmVar) {
        alqmVar.getClass();
        Set set = this.f;
        if (set.isEmpty()) {
            return false;
        }
        return set.contains(alqmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cudx)) {
            return false;
        }
        cudx cudxVar = (cudx) obj;
        return fdbq.f(this.a, cudxVar.a) && fdbq.f(this.f, cudxVar.f) && fdbq.f(this.b, cudxVar.b) && fdbq.f(this.c, cudxVar.c) && this.d == cudxVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.f.hashCode();
        ChipData chipData = this.b;
        int iHashCode2 = ((iHashCode * 31) + (chipData == null ? 0 : chipData.hashCode())) * 31;
        ChipData chipData2 = this.c;
        return ((iHashCode2 + (chipData2 != null ? chipData2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ContactSelectionStateImpl(allChipList=" + this.a + ", allIdentities=" + this.f + ", lastAddedChip=" + this.b + ", lastRemovedChip=" + this.c + ", mode=" + this.d + ")";
    }
}
