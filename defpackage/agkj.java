package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkj {
    public static final int a(adtz adtzVar) {
        adtzVar.getClass();
        if (b(adtzVar, "scheduled_send_nudge")) {
            return 1;
        }
        if (czwc.b() && b(adtzVar, "reminder_nudge")) {
            return 4;
        }
        if (tet.a() && b(adtzVar, "conversation_classification_type")) {
            return 3;
        }
        return (crbf.g() && b(adtzVar, "nudge_classification")) ? 2 : 1;
    }

    private static final boolean b(adtz adtzVar, String str) {
        if (adtzVar.aF(str)) {
            dqpd[] dqpdVarArrAH = adtzVar.aH(str, new dqpd[0]);
            dqpdVarArrAH.getClass();
            if (dqpdVarArrAH.length != 0) {
                return true;
            }
        }
        return false;
    }
}
