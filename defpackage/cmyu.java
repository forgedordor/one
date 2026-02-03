package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmyu {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/tachygram/bindings/TachygramFlogger");

    public static final void a(eqek eqekVar) {
        eqeh eqehVar = (eqeh) eqekVar;
        int i = eqehVar.e - 1;
        ekrd ekrdVarA = a.a(i != 0 ? i != 1 ? i != 2 ? Level.FINEST : Level.INFO : Level.WARNING : Level.SEVERE);
        ekrdVarA.X(eksq.a, "tachygram");
        ekrd ekrdVar = (ekrd) ekrdVarA.g((Throwable) eqehVar.c.orElse(null));
        ekrdVar.X(cqnc.e, (String) eqehVar.b.orElse(null));
        ekrdVar.X(cqnc.B, (String) eqehVar.d.orElse(null));
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/tachygram/bindings/TachygramFlogger", "log", 34, "TachygramFlogger.java")).t("TachygramLogger: %s", eqehVar.a);
    }
}
