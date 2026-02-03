package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dffi extends dfgr {
    private final int a;
    private final Optional b;
    private final ekgp c;

    public dffi(int i, Optional optional, ekgp ekgpVar) {
        this.a = i;
        this.b = optional;
        if (ekgpVar == null) {
            throw new NullPointerException("Null responseHeaders");
        }
        this.c = ekgpVar;
    }

    @Override // defpackage.dfgr
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dfgr
    public final ekgp b() {
        return this.c;
    }

    @Override // defpackage.dfgr
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfgr) {
            dfgr dfgrVar = (dfgr) obj;
            if (this.a == dfgrVar.a() && this.b.equals(dfgrVar.c()) && this.c.equals(dfgrVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ekgp ekgpVar = this.c;
        return "HttpDownloadResponse{responseCode=" + this.a + ", inputStream=" + this.b.toString() + ", responseHeaders=" + ekgpVar.toString() + "}";
    }
}
