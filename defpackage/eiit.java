package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiit {
    eifn a;
    public final boolean b;
    int c = 4;

    public eiit(eifq eifqVar, boolean z) {
        this.a = z ? eifqVar.a() : null;
        this.b = z;
    }

    public static void a(eifn eifnVar) {
        Trace.beginSection(eidc.n(eifnVar.d()));
    }

    final void b(eifn eifnVar) {
        if (d(eifnVar) || eifnVar.a() == null) {
            Trace.beginSection(eifnVar.e());
            a(eifnVar);
        } else {
            b(eifnVar.a());
            a(eifnVar);
        }
    }

    final void c(eifn eifnVar) {
        if (d(eifnVar) || eifnVar.a() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            c(eifnVar.a());
        }
    }

    public final boolean d(eifn eifnVar) {
        return eifnVar.b() != this;
    }

    public final boolean e() {
        return this.c != 4;
    }
}
