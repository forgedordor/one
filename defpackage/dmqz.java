package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmqz {
    public final fdap a;
    public final fdae b;

    public dmqz(fdap fdapVar, fdae fdaeVar) {
        this.a = fdapVar;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmqz)) {
            return false;
        }
        dmqz dmqzVar = (dmqz) obj;
        return fdbq.f(this.a, dmqzVar.a) && fdbq.f(this.b, dmqzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ShutterLongPressHandler(onShutterLongPress=" + this.a + ", onShutterLongPressReleased=" + this.b + ")";
    }

    public dmqz() {
        this(new fdap() { // from class: dmqx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((lvj) obj).getClass();
                return fctx.a;
            }
        }, new fdae() { // from class: dmqy
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
