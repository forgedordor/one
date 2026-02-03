package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wza implements wzb {
    public final int a;
    private final Throwable b;

    public wza(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wza)) {
            return false;
        }
        wza wzaVar = (wza) obj;
        return this.a == wzaVar.a && fdbq.f(this.b, wzaVar.b);
    }

    public final int hashCode() {
        Throwable th = this.b;
        return (this.a * 31) + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PreparationFailure(reason=");
        switch (this.a) {
            case 1:
                str = "COMPOSE_DISABLED";
                break;
            case 2:
                str = "SELF_IDENTITY_UNAVAILABLE";
                break;
            case 3:
                str = "TRANSPORT_UNAVAILABLE";
                break;
            case 4:
                str = "CONTENT_UNSUPPORTED";
                break;
            case 5:
                str = "CONTENT_SIZE_EXCEEDED";
                break;
            case 6:
                str = "CONTAINS_PENDING_ATTACHMENT";
                break;
            default:
                str = "DOWNLOAD_FAILED";
                break;
        }
        sb.append((Object) str);
        sb.append(", cause=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ wza(int i) {
        this(i, null);
    }
}
