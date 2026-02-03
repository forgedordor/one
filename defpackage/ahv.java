package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahv {
    public String A;
    public String B;
    public final String s;
    public final String t;
    public int u;
    public long w;
    public String x;
    public String z;
    public List y = new ArrayList();
    public List C = new ArrayList();
    public boolean D = false;
    public long v = -1;

    public ahv(String str, String str2) {
        this.s = str;
        this.t = str2;
    }

    private final void j() {
        if (this.D) {
            this.y = new ArrayList(this.y);
            this.C = new ArrayList(this.C);
            this.D = false;
        }
    }

    public final void a(List list) {
        j();
        j();
        this.y.clear();
        if (list != null) {
            this.y.addAll(list);
        }
    }

    public final void b(long j) {
        j();
        this.v = j;
    }

    public final void c(String str) {
        j();
        this.z = str;
    }

    public final void d(int i) {
        j();
        this.u = i;
    }

    public final void e(long j) {
        j();
        this.w = j;
    }

    public final void f(String str) {
        j();
        this.A = str;
    }

    public final void g(String str) {
        j();
        this.x = str;
    }

    public final void h(List list) {
        j();
        j();
        this.C.clear();
        if (list != null) {
            this.C.addAll(list);
        }
    }

    public final void i(String str) {
        j();
        this.B = str;
    }
}
