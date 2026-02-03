package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekub {
    public final ekwn a;
    public final String b;

    public ekub(ekwn ekwnVar, String str) {
        ekwnVar.getClass();
        this.a = ekwnVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekub) {
            ekub ekubVar = (ekub) obj;
            if (this.a.equals(ekubVar.a) && this.b.equals(ekubVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return str.hashCode() ^ this.a.hashCode();
    }
}
