package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxn extends cazk {
    public final String a;
    private final String b;

    public caxn(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null workQueue");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null handler");
        }
        this.b = str2;
    }

    @Override // defpackage.cazk
    public final String a() {
        return this.b;
    }

    @Override // defpackage.cazk
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cazk) {
            cazk cazkVar = (cazk) obj;
            if (this.a.equals(cazkVar.b()) && this.b.equals(cazkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "WorkQueueAndHandlerPair{workQueue=" + this.a + ", handler=" + this.b + "}";
    }
}
