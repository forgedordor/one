package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class babw extends babx {
    private static final AtomicLong a = new AtomicLong(System.currentTimeMillis() * 1000);
    private String b;
    private babu c;
    private boolean d;

    public final babu a() {
        babu babuVar;
        if (!g() || (babuVar = this.c) == null) {
            throw new IllegalStateException(String.format("isBound=%s data==null=%s when getData()", Boolean.valueOf(g()), Boolean.valueOf(this.c == null)));
        }
        return babuVar;
    }

    @Override // defpackage.babx
    public final String b() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("not bound when getBindingId");
    }

    public void c(babu babuVar) {
        if (this.c != null || babuVar.i()) {
            throw new IllegalStateException("already bound when binding to ".concat(babuVar.toString()));
        }
        String hexString = Long.toHexString(a.getAndIncrement());
        this.b = hexString;
        this.c = babuVar;
        babuVar.fY(hexString);
        this.d = true;
    }

    public final void d() {
        if (g()) {
            return;
        }
        throw new IllegalStateException("not bound; wasBound = " + this.d);
    }

    public final void e(babu babuVar) {
        if (!g()) {
            throw new IllegalStateException("not bound; wasBound = " + this.d);
        }
        if (babuVar == this.c) {
            return;
        }
        throw new IllegalStateException("not bound to correct data " + babuVar.toString() + " vs " + String.valueOf(this.c));
    }

    public final void f() {
        String str;
        babu babuVar = this.c;
        if (babuVar == null || (str = this.b) == null || !babuVar.j(str)) {
            throw new IllegalStateException("not bound when unbind");
        }
        this.c.g(this.b);
        this.c = null;
        this.b = null;
    }

    public final boolean g() {
        String str;
        babu babuVar = this.c;
        return (babuVar == null || (str = this.b) == null || !babuVar.j(str)) ? false : true;
    }
}
