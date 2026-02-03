package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coyj extends coyk {
    public final atbq a;

    public coyj(atbq atbqVar) {
        this.a = atbqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof coyj) && fdbq.f(this.a, ((coyj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UploadFailure(fileTransferFailure=" + this.a + ")";
    }
}
