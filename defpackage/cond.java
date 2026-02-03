package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cond extends Exception {
    private final coid a;
    private final boolean b;

    public cond(boolean z, String str, byte[] bArr) {
        this(z, coid.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED, str, (byte[]) null);
    }

    public static eiju a(String str) {
        return eijx.d(new cond(false, str));
    }

    static eiju b(String str) {
        return eijx.d(new cond(true, str));
    }

    static eiju c(String str, Throwable th) {
        return eijx.d(new cond(true, str, th));
    }

    public final Boolean d() {
        return Boolean.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cond)) {
            return false;
        }
        cond condVar = (cond) obj;
        return d().equals(condVar.d()) && this.a.equals(condVar.a) && ejwk.b(getMessage()).equals(condVar.getMessage());
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), this.a, Integer.valueOf(super.hashCode()));
    }

    private cond(boolean z, coid coidVar, String str, byte[] bArr) {
        super(str);
        this.a = coidVar;
        this.b = z;
    }

    public cond(boolean z, coid coidVar, String str) {
        this(z, coidVar, str, (byte[]) null);
    }

    public cond(boolean z, String str) {
        this(z, coid.FILE_TRANSFER_FAILURE_REASON_UNKNOWN, str);
    }

    public cond(boolean z, String str, coid coidVar, Throwable th) {
        super(str, th);
        this.a = coidVar;
        this.b = z;
    }

    public cond(boolean z, String str, Throwable th) {
        this(z, str, coid.FILE_TRANSFER_FAILURE_REASON_UNKNOWN, th);
    }
}
