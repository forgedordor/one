package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvt extends rvu {
    public volatile boolean a;

    @Override // defpackage.rvu
    public final void a() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}
