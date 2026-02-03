package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlog {
    private final boolean a;
    private final boolean b;

    public dlog() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlog)) {
            return false;
        }
        dlog dlogVar = (dlog) obj;
        boolean z = dlogVar.a;
        boolean z2 = dlogVar.b;
        return true;
    }

    public final int hashCode() {
        return 39584;
    }

    public final String toString() {
        return "Flags(addViewIdToDropdownMenu=false, showIconsForOverflowActions=false)";
    }

    public /* synthetic */ dlog(byte[] bArr) {
        this.a = false;
        this.b = false;
    }
}
