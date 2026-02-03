package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekvb extends ekuw {
    public ekvb(eksx eksxVar, ekte ekteVar) {
        super(eksxVar, ekteVar);
        setThrown((Throwable) this.a.b(ekrl.a));
        getMessage();
    }

    public ekvb(RuntimeException runtimeException, eksx eksxVar, ekte ekteVar) {
        super(eksxVar, ekteVar);
        setLevel(eksxVar.m().intValue() < Level.WARNING.intValue() ? Level.WARNING : eksxVar.m());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        ekuw.a(eksxVar, sb);
        setMessage(sb.toString());
    }
}
