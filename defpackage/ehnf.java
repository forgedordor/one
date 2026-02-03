package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehnf implements lxk {
    public final ea a;
    private final lxk b;
    private final Set c;
    private final lxk d;

    /* compiled from: PG */
    interface a {
        Map bj();
    }

    public ehnf(ea eaVar, lxk lxkVar, Set set, ahns ahnsVar) {
        this.a = eaVar;
        this.b = lxkVar;
        this.c = set;
        this.d = new ehne(this, ahnsVar);
    }

    @Override // defpackage.lxk
    public final lxd a(Class cls) {
        return this.c.contains(cls.getName()) ? lxj.b() : this.b.a(cls);
    }

    @Override // defpackage.lxk
    public final lxd b(Class cls, lyp lypVar) {
        return this.c.contains(cls.getName()) ? this.d.b(cls, lypVar) : this.b.b(cls, lypVar);
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd c(fddy fddyVar, lyp lypVar) {
        return lxj.a(this, fddyVar, lypVar);
    }
}
