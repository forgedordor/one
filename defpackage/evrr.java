package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class evrr {
    public static final evrr a = new evrr(null);
    private static volatile boolean b = false;
    private static volatile evrr c;
    private final Map d;

    public evrr() {
        this.d = new HashMap();
    }

    public static evrr a() {
        evrr evrrVar = c;
        if (evrrVar != null) {
            return evrrVar;
        }
        synchronized (evrr.class) {
            evrr evrrVar2 = c;
            if (evrrVar2 != null) {
                return evrrVar2;
            }
            evuq evuqVar = evuq.a;
            evrr evrrVarB = evsd.b(evrr.class);
            c = evrrVarB;
            return evrrVarB;
        }
    }

    public evsl b(evuh evuhVar, int i) {
        return (evsl) this.d.get(new evrq(evuhVar, i));
    }

    public final void c(evsl evslVar) {
        this.d.put(new evrq(evslVar.a, evslVar.a()), evslVar);
    }

    public evrr(byte[] bArr) {
        this.d = Collections.EMPTY_MAP;
    }
}
