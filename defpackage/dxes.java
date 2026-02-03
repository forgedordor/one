package defpackage;

import java.io.File;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxes {
    public final String a;
    public final File b;
    public final String c;
    public final dxfd d;
    final boolean f;
    final boolean g;
    public final dtzq k;
    public final ecgr l;
    private dxer n;
    public final ekjo e = new ekby();
    int h = 0;
    private boolean m = false;
    public dxeq i = null;
    public int j = -1;

    public dxes(dxfd dxfdVar, String str, File file, String str2, dtzq dtzqVar, ecgr ecgrVar) {
        this.n = dxer.WIFI_ONLY;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.k = dtzqVar;
        this.d = dxfdVar;
        this.l = ecgrVar;
        boolean zB = dxen.b(str);
        this.f = zB;
        boolean zF = f(str);
        this.g = zF;
        if (zF || zB) {
            this.n = dxer.NONE;
        }
    }

    public static boolean f(String str) {
        return str.startsWith("file:");
    }

    public final synchronized dxer a() {
        return this.n;
    }

    final synchronized void b() {
    }

    final synchronized void c() {
    }

    final synchronized void d() {
        this.m = true;
    }

    public final synchronized boolean e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dxes)) {
            return false;
        }
        dxes dxesVar = (dxes) obj;
        return ejwh.a(this.a, dxesVar.a) && ejwh.a(this.b, dxesVar.b) && ejwh.a(this.c, dxesVar.c) && ejwh.a(this.n, dxesVar.n) && this.m == dxesVar.m;
    }

    public final void g(dxer dxerVar) {
        if (this.g || this.f) {
            return;
        }
        this.n = dxerVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.n, Boolean.valueOf(this.m)});
    }

    public final String toString() {
        ejwf ejwfVarA = ejwg.a(dxes.class);
        ejwfVarA.b("", this.a);
        ejwfVarA.b("targetDirectory", this.b);
        ejwfVarA.b("fileName", this.c);
        ejwfVarA.b("requiredConnectivity", this.n);
        ejwfVarA.h("canceled", this.m);
        return ejwfVarA.toString();
    }
}
