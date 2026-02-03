package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknn implements dknr {
    public final fdae a;

    public dknn(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dknn) && fdbq.f(this.a, ((dknn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoConnection(onCancelButtonClicked=" + this.a + ")";
    }

    public dknn() {
        this(new fdae() { // from class: dknm
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
