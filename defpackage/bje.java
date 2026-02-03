package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bje implements bdw {
    public final Object a;
    public final bdx b;
    public final Map c;
    public int d;
    private final StringBuilder e = new StringBuilder();
    private int f;

    public bje(bdx bdxVar) {
        Object obj = new Object();
        this.a = obj;
        this.c = new HashMap();
        this.f = 1;
        synchronized (obj) {
            this.b = bdxVar;
            this.d = this.f;
        }
    }

    public static void c(ayv ayvVar, bit bitVar) {
        if (plm.c()) {
            plm.b(a.h(ayvVar, "CX:State[", "]"), bitVar.ordinal());
        }
    }

    public static boolean d(bit bitVar) {
        return bitVar != null && bitVar.i;
    }

    @Override // defpackage.bdw
    public final void a() {
        synchronized (this.a) {
            this.f = 1;
        }
    }

    public final void b() {
        if (bbs.h("CameraStateRegistry")) {
            StringBuilder sb = this.e;
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.c.entrySet()) {
            if (bbs.h("CameraStateRegistry")) {
                this.e.append(String.format(Locale.US, "%-45s%-22s\n", ((ayv) entry.getKey()).toString(), ((bjd) entry.getValue()).a != null ? ((bjd) entry.getValue()).a.toString() : "UNKNOWN"));
            }
            if (d(((bjd) entry.getValue()).a)) {
                i++;
            }
        }
        if (bbs.h("CameraStateRegistry")) {
            StringBuilder sb2 = this.e;
            sb2.append("-------------------------------------------------------------------\n");
            sb2.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.f)));
            bbs.a("CameraStateRegistry", sb2.toString());
        }
        this.d = Math.max(this.f - i, 0);
    }

    public final boolean e(ayv ayvVar) {
        boolean z;
        synchronized (this.a) {
            bjd bjdVar = (bjd) this.c.get(ayvVar);
            lcg.j(bjdVar, "Camera must first be registered with registerCamera()");
            if (bbs.h("CameraStateRegistry")) {
                StringBuilder sb = this.e;
                sb.setLength(0);
                sb.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", ayvVar, Integer.valueOf(this.d), Boolean.valueOf(d(bjdVar.a)), bjdVar.a));
            }
            if (this.d > 0 || d(bjdVar.a)) {
                bit bitVar = bit.OPENING;
                bjdVar.a(bitVar);
                c(ayvVar, bitVar);
                z = true;
            } else {
                z = false;
            }
            if (bbs.h("CameraStateRegistry")) {
                StringBuilder sb2 = this.e;
                sb2.append(String.format(Locale.US, " --> %s", z ? "SUCCESS" : "FAIL"));
                bbs.a("CameraStateRegistry", sb2.toString());
            }
            if (z) {
                b();
            }
        }
        return z;
    }

    public final void f() {
        synchronized (this.a) {
        }
    }
}
