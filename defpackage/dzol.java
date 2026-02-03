package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzol {
    static final eiew a = new eiew();
    public final AtomicReference b = new AtomicReference();
    final AtomicBoolean c = new AtomicBoolean(false);

    dzol() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dzol a(ekgb ekgbVar) {
        dzol dzolVar;
        int i = 0;
        do {
            if (i >= ((ekoe) ekgbVar).c) {
                break;
            }
            eiev eievVarJ = eiez.j(a, (eiez) ekgbVar.get(i));
            dzolVar = eievVarJ.b() ? (dzol) eievVarJ.a() : null;
            i++;
        } while (dzolVar == null);
        return dzolVar;
    }
}
