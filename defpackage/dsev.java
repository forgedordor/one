package defpackage;

import android.util.SparseArray;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsev implements dsea {
    private static final SparseArray a;
    private final diep b;
    private final dsbr c;

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(1, eybe.SUNDAY);
        sparseArray.put(2, eybe.MONDAY);
        sparseArray.put(3, eybe.TUESDAY);
        sparseArray.put(4, eybe.WEDNESDAY);
        sparseArray.put(5, eybe.THURSDAY);
        sparseArray.put(6, eybe.FRIDAY);
        sparseArray.put(7, eybe.SATURDAY);
    }

    public dsev(diep diepVar, dsbr dsbrVar) {
        this.b = diepVar;
        this.c = dsbrVar;
    }

    private static int c(eybm eybmVar) {
        return d(eybmVar.b, eybmVar.c);
    }

    private static int d(int i, int i2) {
        return (i * 60) + i2;
    }

    @Override // defpackage.dsea
    public final dsdz a() {
        return dsdz.TIME_CONSTRAINT;
    }

    @Override // defpackage.ejug
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        dsec dsecVar = (dsec) obj2;
        evtg<etoc> evtgVar = ((etom) obj).h;
        if (!evtgVar.isEmpty()) {
            diep diepVar = this.b;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(diepVar.f().toEpochMilli());
            eybe eybeVar = (eybe) a.get(calendar.get(7));
            int iD = d(calendar.get(11), calendar.get(12));
            for (etoc etocVar : evtgVar) {
                eybm eybmVar = etocVar.d;
                if (eybmVar == null) {
                    eybmVar = eybm.a;
                }
                int iC = c(eybmVar);
                eybm eybmVar2 = etocVar.e;
                if (eybmVar2 == null) {
                    eybmVar2 = eybm.a;
                }
                int iC2 = c(eybmVar2);
                if (!new evsz(etocVar.f, etoc.a).contains(eybeVar) || iD < iC || iD > iC2) {
                }
            }
            this.c.c(dsecVar.a(), "No condition matched. Condition list: %s", evtgVar);
            return false;
        }
        return true;
    }
}
