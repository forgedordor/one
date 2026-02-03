package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijx extends ijz {
    public final ihu a;

    public ijx(ihu ihuVar) {
        this.a = ihuVar;
    }

    @Override // defpackage.ijz
    public final ihu a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijx) && fdbq.f(this.a, ((ijx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
