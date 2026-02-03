package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cccw {
    public final eyxi a;

    public cccw(eyxi eyxiVar) {
        this.a = eyxiVar;
    }

    public final String a() {
        String str = this.a.c;
        str.getClass();
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cccw) && fdbq.f(this.a, ((cccw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MlsControlMessage(controlMessage=" + this.a + ")";
    }
}
