package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffpp {
    public final int a;

    public ffpp(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ffpp) && ((ffpp) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
