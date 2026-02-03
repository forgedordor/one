package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwry extends bwsc {
    private final String a;
    private final ekgp b;
    private final int c;
    private final int d;

    public bwry(int i, String str, ekgp ekgpVar, int i2) {
        this.d = i;
        if (str == null) {
            throw new NullPointerException("Null requestId");
        }
        this.a = str;
        this.b = ekgpVar;
        this.c = i2;
    }

    @Override // defpackage.bwsc
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bwsc
    public final ekgp b() {
        return this.b;
    }

    @Override // defpackage.bwsc
    public final String c() {
        return this.a;
    }

    @Override // defpackage.bwsc
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwsc) {
            bwsc bwscVar = (bwsc) obj;
            if (this.d == bwscVar.d() && this.a.equals(bwscVar.c()) && this.b.equals(bwscVar.b()) && this.c == bwscVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? "STATUS_RUNTIME_EXCEPTION" : "EMPTY_PHONE_NUMBER" : "SUCCESS";
        String str2 = this.a;
        ekgp ekgpVar = this.b;
        int i2 = this.c;
        return "TachyonRegistrationRpcResult{kind=" + str + ", requestId=" + str2 + ", remoteRegistrationMap=" + ekgpVar.toString() + ", rpcErrorCode=" + i2 + "}";
    }
}
