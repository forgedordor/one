package defpackage;

import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpn {
    public static final wpm a(vvs vvsVar, wnn wnnVar) {
        vvsVar.getClass();
        if (vvsVar instanceof vvr) {
            return c(((vvr) vvsVar).a, wnnVar, vvt.e(vvsVar));
        }
        if (vvsVar instanceof vvn) {
            return c(((vvn) vvsVar).b, wnnVar, vvt.e(vvsVar));
        }
        if (!(vvsVar instanceof vvo)) {
            if (vvsVar instanceof vvm) {
                return c(((vvm) vvsVar).b, wnnVar, vvt.e(vvsVar));
            }
            throw new fctg();
        }
        Long l = ((vvo) vvsVar).d;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (true == vvt.e(vvsVar)) {
            l = null;
        }
        return new wpm(jLongValue, l != null ? l.longValue() : 0L);
    }

    public static final wpm b(List list, wnn wnnVar) {
        list.getClass();
        ArrayList<wpm> arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((vvs) it.next(), wnnVar));
        }
        wpm wpmVar = new wpm(0L, 0L);
        for (wpm wpmVar2 : arrayList) {
            wpmVar2.getClass();
            long j = wpmVar.a;
            long j2 = wpmVar.b;
            wpmVar = new wpm(j + wpmVar2.a, j2 + wpmVar2.b);
        }
        return wpmVar;
    }

    private static final wpm c(dltd dltdVar, wnn wnnVar, boolean z) {
        Long l;
        if (dltdVar instanceof dohr) {
            dohq dohqVarE = doij.e((dohr) dltdVar, wnnVar.b, wnnVar.a, wnnVar.c);
            long jA = dohqVarE.a();
            Long lValueOf = Long.valueOf(dohqVarE.a());
            lValueOf.longValue();
            l = true != z ? lValueOf : null;
            return new wpm(jA, l != null ? l.longValue() : 0L);
        }
        if (!(dltdVar instanceof dltn)) {
            if (dltdVar instanceof RichLocation) {
                return new wpm(0L, 0L);
            }
            Objects.toString(dltdVar);
            throw new UnsupportedOperationException("Cannot get size metadata for ".concat(dltdVar.toString()));
        }
        dltn dltnVar = (dltn) dltdVar;
        long jA2 = dltnVar.a();
        Long lValueOf2 = Long.valueOf(dltnVar.a());
        lValueOf2.longValue();
        l = true != z ? lValueOf2 : null;
        return new wpm(jA2, l != null ? l.longValue() : 0L);
    }
}
