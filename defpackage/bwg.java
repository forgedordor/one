package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwg {
    public static final bwg a = new bwg(new bwb());
    public final bwb b;

    private bwg(bwb bwbVar) {
        this.b = bwbVar;
    }

    public final void a() {
        this.b.c();
    }

    public final boolean b(azg azgVar) {
        boolean z;
        plm.a("CX:hasCamera");
        try {
            azp azpVar = this.b.e;
            azpVar.getClass();
            azgVar.a(azpVar.c.a());
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return z;
    }
}
