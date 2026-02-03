package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafr implements ejxr {
    boolean a;
    Object b;
    final /* synthetic */ ejxr c;

    public eafr(ejxr ejxrVar) {
        this.c = ejxrVar;
    }

    @Override // defpackage.ejxr
    public final Object get() {
        if (this.a) {
            return this.b;
        }
        Object obj = this.c.get();
        this.b = obj;
        this.a = true;
        return obj;
    }
}
