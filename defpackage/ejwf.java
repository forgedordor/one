package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwf {
    private final String a;
    private final ejwe b;
    private ejwe c;
    private boolean d;

    public ejwf(String str) {
        ejwe ejweVar = new ejwe();
        this.b = ejweVar;
        this.c = ejweVar;
        this.d = false;
        str.getClass();
        this.a = str;
    }

    private final ejwe i() {
        ejwe ejweVar = new ejwe();
        this.c.c = ejweVar;
        this.c = ejweVar;
        return ejweVar;
    }

    private final void j(String str, Object obj) {
        ejwd ejwdVar = new ejwd();
        this.c.c = ejwdVar;
        this.c = ejwdVar;
        ejwdVar.b = obj;
        ejwdVar.a = str;
    }

    public final void a(Object obj) {
        i().b = obj;
    }

    public final void b(String str, Object obj) {
        ejwe ejweVarI = i();
        ejweVarI.b = obj;
        str.getClass();
        ejweVarI.a = str;
    }

    public final void c() {
        this.d = true;
    }

    public final void d(String str, double d) {
        j(str, String.valueOf(d));
    }

    public final void e(String str, float f) {
        j(str, String.valueOf(f));
    }

    public final void f(String str, int i) {
        j(str, String.valueOf(i));
    }

    public final void g(String str, long j) {
        j(str, String.valueOf(j));
    }

    public final void h(String str, boolean z) {
        j(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        String str = "";
        for (ejwe ejweVar = this.b.c; ejweVar != null; ejweVar = ejweVar.c) {
            boolean z2 = ejweVar instanceof ejwd;
            Object obj = ejweVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = ejweVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
