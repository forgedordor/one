package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjx {
    private Object a;
    private volatile boolean b;

    public final Object a(ejxr ejxrVar) {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.a = ejxrVar.get();
                    this.b = true;
                }
            }
        }
        return this.a;
    }
}
