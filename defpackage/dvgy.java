package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgy {
    /* JADX WARN: Multi-variable type inference failed */
    public static efwh a(eucu eucuVar) {
        if (eucuVar.b.isEmpty()) {
            return null;
        }
        return b((euda) eucuVar.b.get(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static efwh b(euda eudaVar) {
        efvz efvzVar = eudaVar.c;
        if (efvzVar == null) {
            efvzVar = efvz.a;
        }
        evtg<efwh> evtgVar = efvzVar.h;
        if (evtgVar.isEmpty()) {
            return null;
        }
        for (efwh efwhVar : evtgVar) {
            if ((efwhVar.b & 1) != 0) {
                efwb efwbVar = efwhVar.c;
                if (efwbVar == null) {
                    efwbVar = efwb.a;
                }
                if (efwbVar.b) {
                    return efwhVar;
                }
            }
        }
        return (efwh) evtgVar.get(0);
    }
}
