package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggy implements afzv {
    public final boolean a;
    public final fdap b;

    public aggy() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aggy)) {
            return false;
        }
        aggy aggyVar = (aggy) obj;
        return this.a == aggyVar.a && fdbq.f(this.b, aggyVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UpdateStoredLocation(requestPermission=" + this.a + ", onPermissionGranted=" + this.b + ")";
    }

    public /* synthetic */ aggy(fdap fdapVar, int i) {
        fdapVar = (i & 2) != 0 ? new aggx(null) : fdapVar;
        boolean z = 1 == (i & 1);
        fdapVar.getClass();
        this.a = z;
        this.b = fdapVar;
    }
}
