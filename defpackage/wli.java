package defpackage;

import j$.time.Duration;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wli {
    private final doht a;
    private final wpn b;

    public wli(doht dohtVar, wpn wpnVar) {
        this.a = dohtVar;
        this.b = wpnVar;
    }

    public final wlh a(wlk wlkVar, List list) {
        Duration duration;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!wlkVar.c) {
            return wlh.a;
        }
        if (list.size() > wlkVar.e) {
            return wlh.b;
        }
        doht dohtVar = this.a;
        long j = wlkVar.b;
        Long lValueOf = Long.valueOf(j);
        doin doinVar = doin.c;
        wnn wnnVar = new wnn(doinVar, dohtVar, lValueOf);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vvs vvsVar = (vvs) it.next();
            if ((vvt.b(vvsVar) instanceof doie) && wpn.a(vvsVar, wnnVar).a > j) {
                Duration duration2 = wlkVar.f;
                if (!(vvt.b(vvsVar) instanceof doie)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (vvsVar instanceof vvn) {
                    duration = ((doju) ((vvn) vvsVar).b).g;
                } else if ((vvsVar instanceof vvo) || (vvsVar instanceof vvm)) {
                    duration = null;
                } else {
                    if (!(vvsVar instanceof vvr)) {
                        throw new fctg();
                    }
                    duration = ((doju) ((vvr) vvsVar).a).g;
                }
                if (duration != null && duration.compareTo(duration2) > 0) {
                    return wlh.c;
                }
            }
        }
        return wpn.b(list, new wnn(doinVar, dohtVar, Long.valueOf(j))).b > j ? list.size() > 1 ? wlh.e : wlh.d : wlh.f;
    }
}
