package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgjf {
    public StringBuilder c;
    public String d;
    public char e;
    public StringBuilder f;
    public int h = 1;
    public final List a = new ArrayList();
    private final List i = new ArrayList();
    public final List b = new ArrayList();
    public boolean g = false;

    final List a() {
        c();
        return this.i;
    }

    final fglz b() {
        fglz fglzVar = new fglz();
        fglzVar.a.addAll(this.a);
        return fglzVar;
    }

    public final void c() {
        if (this.g) {
            String strB = fgkf.b(this.d);
            StringBuilder sb = this.f;
            fglb fglbVar = new fglb(this.c.toString(), strB, sb != null ? fgkf.b(sb.toString()) : null);
            List list = this.b;
            fglbVar.j(list);
            list.clear();
            this.i.add(fglbVar);
            this.c = null;
            this.g = false;
            this.d = null;
            this.f = null;
        }
    }
}
