package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afb {
    private final String b;
    private ArrayList c = new ArrayList();
    public LinkedHashSet a = new LinkedHashSet();
    private final Set d = new css();
    private boolean e = false;

    public afb(String str) {
        lcg.i(str);
        this.b = str;
    }

    public final afo a() {
        this.e = true;
        return new afo(this.b, this.c, new ArrayList(this.a));
    }

    public final void b() {
        if (this.e) {
            this.c = new ArrayList(this.c);
            this.a = new LinkedHashSet(this.a);
            this.e = false;
        }
    }

    public final void c(afl aflVar) {
        lcg.i(aflVar);
        b();
        Set set = this.d;
        String strG = aflVar.g();
        if (!set.add(strG)) {
            throw new ahz("Property defined more than once: ".concat(strG));
        }
        this.c.add(aflVar.a);
    }
}
