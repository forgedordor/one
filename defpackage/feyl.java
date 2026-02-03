package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyl {
    public final List a = new ArrayList(20);

    public final String a(String str) {
        List list = this.a;
        int size = list.size() - 2;
        int iA = fczg.a(size, 0, -2);
        if (iA > size) {
            return null;
        }
        while (!fdgn.j(str, (String) list.get(size), true)) {
            if (size == iA) {
                return null;
            }
            size -= 2;
        }
        return (String) list.get(size + 1);
    }

    public final feyn b() {
        return new feyn((String[]) this.a.toArray(new String[0]));
    }

    public final void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        List list = this.a;
        list.add(str);
        list.add(fdgn.x(str2).toString());
    }

    public final void d(String str, String str2) {
        str2.getClass();
        feym.a(str);
        feym.b(str2, str);
        f(str);
        c(str, str2);
    }

    public final void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        feym.a(str);
        feym.b(str2, str);
        c(str, str2);
    }

    public final void f(String str) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            if (fdgn.j(str, (String) list.get(i), true)) {
                list.remove(i);
                list.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}
