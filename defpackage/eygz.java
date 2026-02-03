package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eygz implements lxk {
    public static final lyo a = new eygw();
    private final Map b;
    private final lxk c;
    private final lxk d;

    /* compiled from: PG */
    public interface a {
        Map c();

        Map d();
    }

    public eygz(Map map, lxk lxkVar, ahoj ahojVar) {
        this.b = map;
        this.c = lxkVar;
        this.d = new eygy(ahojVar);
    }

    @Override // defpackage.lxk
    public final lxd a(Class cls) {
        return this.b.containsKey(cls) ? lxj.b() : this.c.a(cls);
    }

    @Override // defpackage.lxk
    public final lxd b(Class cls, lyp lypVar) {
        return this.b.containsKey(cls) ? this.d.b(cls, lypVar) : this.c.b(cls, lypVar);
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd c(fddy fddyVar, lyp lypVar) {
        return lxj.a(this, fddyVar, lypVar);
    }
}
