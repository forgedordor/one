package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rnl implements rhy {
    protected final Object a;

    public rnl(Object obj) {
        rvi.f(obj);
        this.a = obj;
    }

    @Override // defpackage.rhy
    public final int a() {
        return 1;
    }

    @Override // defpackage.rhy
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.rhy
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.rhy
    public final void e() {
    }
}
