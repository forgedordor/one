package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eifj {
    public static void a(eifn eifnVar) {
        Trace.beginSection(eidc.n(eifnVar.d()));
    }

    static void b(eifn eifnVar) {
        if (d(eifnVar) || eifnVar.a() == null) {
            Trace.beginSection(eifnVar.e());
            a(eifnVar);
        } else {
            b(eifnVar.a());
            a(eifnVar);
        }
    }

    static void c(eifn eifnVar) {
        if (d(eifnVar) || eifnVar.a() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            c(eifnVar.a());
        }
    }

    public static boolean d(eifn eifnVar) {
        return eifnVar.f() != Thread.currentThread();
    }
}
