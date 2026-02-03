package defpackage;

import defpackage.cdag;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class cdag {
    public static final dzzf a = new dzzf().c().a();
    public static final dzzf b = new dzzf().c().a().d("bugle_phenotype__");
    public static final ejxr c = ejxx.a(new ejxr() { // from class: cdab
        @Override // defpackage.ejxr
        public final Object get() {
            dzzf dzzfVar = cdag.a;
            return ((cdag.a) cqtf.a(cdag.a.class)).it();
        }
    });
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    /* compiled from: PG */
    public interface a {
        cczc it();
    }

    public static void A(String str, double d2) {
        c(b, str, d2);
    }

    public static cczi a(String str, long j) {
        return f(b, str, j);
    }

    public static cczi b(String str, boolean z) {
        return h(b, str, z);
    }

    public static cczi c(dzzf dzzfVar, String str, double d2) {
        cczg cczgVar;
        synchronized (d) {
            cczgVar = new cczg(dzzfVar.e(str, d2), Double.valueOf(d2));
            e.add(cczgVar);
        }
        return cczgVar;
    }

    public static cczi d(dzzf dzzfVar, String str, float f) {
        cczg cczgVar;
        synchronized (d) {
            cczgVar = new cczg(dzzfVar.q(str, f), Float.valueOf(f));
            e.add(cczgVar);
        }
        return cczgVar;
    }

    public static cczi e(dzzf dzzfVar, String str, int i) {
        cczg cczgVar;
        synchronized (d) {
            cczgVar = new cczg(dzzfVar.f(str, i), Integer.valueOf(i));
            e.add(cczgVar);
        }
        return cczgVar;
    }

    public static cczi f(dzzf dzzfVar, String str, long j) {
        cczg cczgVar;
        synchronized (d) {
            cczgVar = new cczg(dzzfVar.g(str, j), Long.valueOf(j));
            e.add(cczgVar);
        }
        return cczgVar;
    }

    public static cczi g(dzzf dzzfVar, String str, String str2) {
        cczg cczgVar;
        synchronized (d) {
            cczgVar = new cczg(dzzfVar.h(str, str2), str2);
            e.add(cczgVar);
        }
        return cczgVar;
    }

    public static cczi h(dzzf dzzfVar, String str, boolean z) {
        cczg cczgVar;
        synchronized (d) {
            cczgVar = new cczg(dzzfVar.i(str, z), Boolean.valueOf(z));
            e.add(cczgVar);
        }
        return cczgVar;
    }

    public static cczi i(dzzf dzzfVar, String str, float f) {
        cczt ccztVar;
        synchronized (d) {
            ccztVar = new cczt(dzzfVar.q(str, f), Float.valueOf(f));
            e.add(ccztVar);
        }
        return ccztVar;
    }

    public static cczi j(dzzf dzzfVar, String str, int i) {
        cczt ccztVar;
        synchronized (d) {
            ccztVar = new cczt(dzzfVar.f(str, i), Integer.valueOf(i));
            e.add(ccztVar);
        }
        return ccztVar;
    }

    public static cczi k(dzzf dzzfVar, String str, long j) {
        cczt ccztVar;
        synchronized (d) {
            ccztVar = new cczt(dzzfVar.g(str, j), Long.valueOf(j));
            e.add(ccztVar);
        }
        return ccztVar;
    }

    public static cczi l(dzzf dzzfVar, String str, String str2) {
        cczt ccztVar;
        synchronized (d) {
            ccztVar = new cczt(dzzfVar.h(str, str2), str2);
            e.add(ccztVar);
        }
        return ccztVar;
    }

    public static cczi m(dzzf dzzfVar, String str, boolean z) {
        cczt ccztVar;
        synchronized (d) {
            ccztVar = new cczt(dzzfVar.i(str, z), Boolean.valueOf(z));
            e.add(ccztVar);
        }
        return ccztVar;
    }

    @Deprecated
    public static cczi n(int i) {
        return m(b, defpackage.a.g(i, "bug_"), true);
    }

    @Deprecated
    public static cczi o(int i, String str) {
        return m(b, "bug_" + i + "_" + str, true);
    }

    @Deprecated
    public static cczi p(int i) {
        return h(b, defpackage.a.g(i, "bug_"), true);
    }

    @Deprecated
    public static cczi q(int i, String str) {
        return h(b, "bug_" + i + "_" + str, true);
    }

    public static cczu r(final dzzf dzzfVar, final String str, final ejxr ejxrVar) {
        cczu cczuVar;
        synchronized (d) {
            cczuVar = new cczu(new Supplier() { // from class: cczy
                @Override // java.util.function.Supplier
                public final Object get() {
                    dzzf dzzfVar2 = cdag.a;
                    return dzzfVar.j(str, (byte[]) ejxrVar.get());
                }
            });
            e.add(cczuVar);
        }
        return cczuVar;
    }

    public static cczv s(dzzf dzzfVar, String str, byte[] bArr) {
        cczt ccztVar;
        synchronized (d) {
            ccztVar = new cczt(dzzfVar.j(str, bArr), bArr);
            e.add(ccztVar);
        }
        return ccztVar;
    }

    public static cczv t(dzzf dzzfVar, String str, Object obj, dzze dzzeVar) {
        cczt ccztVar;
        synchronized (d) {
            ccztVar = new cczt(dzzfVar.k(str, obj, dzzeVar), obj);
            e.add(ccztVar);
        }
        return ccztVar;
    }

    public static ejxr u(final int i) {
        return ejxx.a(new ejxr() { // from class: cczx
            @Override // defpackage.ejxr
            public final Object get() {
                return cczc.a("bug_" + i);
            }
        });
    }

    public static ejxr v(final String str) {
        return ejxx.a(new ejxr() { // from class: cdac
            @Override // defpackage.ejxr
            public final Object get() {
                return cczc.a(str);
            }
        });
    }

    public static ejxr w(final int i, final String str) {
        return ejxx.a(new ejxr() { // from class: cdad
            @Override // defpackage.ejxr
            public final Object get() {
                return cczc.a("bug_" + i + "_" + str);
            }
        });
    }

    public static ejxr x(final String str) {
        return ejxx.a(new ejxr() { // from class: cdae
            @Override // defpackage.ejxr
            public final Object get() {
                return cczc.b(str);
            }
        });
    }

    public static ejxr y(final int i, final String str) {
        return ejxx.a(new ejxr() { // from class: cdaa
            @Override // defpackage.ejxr
            public final Object get() {
                return cczc.b("bug_" + i + "_" + str);
            }
        });
    }

    static void z(StringBuilder sb, boolean z, String str, Object obj) {
        sb.append(String.format(Locale.US, "%s: %s\n", str, obj));
        if (z) {
            sb.append("\n");
        }
    }
}
