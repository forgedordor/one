package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agk {
    private List a = new ArrayList();
    private List b = new ArrayList();
    private ajr c;
    private boolean d;

    private final void e() {
        if (this.d) {
            this.a = new ArrayList(this.a);
            this.b = new ArrayList(this.b);
            this.d = false;
        }
    }

    public final agl a() {
        this.d = true;
        return new agl(this.a, this.b, this.c);
    }

    public final void b(agd agdVar) {
        agdVar.getClass();
        e();
        this.a.add(agdVar.a);
    }

    public final void c(Set set) {
        set.getClass();
        e();
        this.b.add(new aha(set));
    }

    public final void d(agd agdVar) {
        e();
        this.c = agdVar == null ? null : agdVar.a;
    }
}
