package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgha extends cgls {
    private final kvq a;
    private final cglf b;
    private final boolean c;
    private final Optional d;

    public cgha(kvq kvqVar, cglf cglfVar, boolean z, Optional optional) {
        if (kvqVar == null) {
            throw new NullPointerException("Null notificationBuilder");
        }
        this.a = kvqVar;
        if (cglfVar == null) {
            throw new NullPointerException("Null notificationType");
        }
        this.b = cglfVar;
        this.c = z;
        if (optional == null) {
            throw new NullPointerException("Null notificationTag");
        }
        this.d = optional;
    }

    @Override // defpackage.cgls
    public final kvq a() {
        return this.a;
    }

    @Override // defpackage.cgls
    public final cglf b() {
        return this.b;
    }

    @Override // defpackage.cgls
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.cgls
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgls) {
            cgls cglsVar = (cgls) obj;
            if (this.a.equals(cglsVar.a()) && this.b.equals(cglsVar.b()) && this.c == cglsVar.d() && this.d.equals(cglsVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        cglf cglfVar = this.b;
        return "NotifyInfo{notificationBuilder=" + this.a.toString() + ", notificationType=" + cglfVar.toString() + ", isSummary=" + this.c + ", notificationTag=" + optional.toString() + "}";
    }
}
