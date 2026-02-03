package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddba {
    public static final long a = TimeUnit.HOURS.toMillis(1);

    public static ddak a(ejwi ejwiVar) {
        int i = 2;
        if (ejwiVar.g()) {
            ejwi ejwiVarB = b((etzn) ejwiVar.c());
            if (ejwiVarB.g()) {
                etzj etzjVarB = etzj.b(((etzm) ejwiVarB.c()).d);
                if (etzjVarB == null) {
                    etzjVarB = etzj.UNKNOWN;
                }
                int iOrdinal = etzjVarB.ordinal();
                i = iOrdinal != 1 ? iOrdinal != 2 ? 3 : 4 : 1;
            }
        }
        return new ddai(i);
    }

    public static ejwi b(etzn etznVar) {
        if ((etznVar.b & 1) != 0) {
            try {
                return ejwi.j((etzm) evsn.parseFrom(etzm.a, etznVar.c, evrr.a()));
            } catch (evtj unused) {
            }
        }
        return ejud.a;
    }
}
