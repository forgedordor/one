package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cggi extends cghg {
    private final Optional a;
    private final cgkt b;
    private final cgkm c;
    private final Optional d;
    private final Optional e;
    private final boolean f;

    public cggi(Optional optional, cgkt cgktVar, cgkm cgkmVar, Optional optional2, Optional optional3, boolean z) {
        this.a = optional;
        this.b = cgktVar;
        this.c = cgkmVar;
        this.d = optional2;
        this.e = optional3;
        this.f = z;
    }

    @Override // defpackage.cghg
    public final cgkm a() {
        return this.c;
    }

    @Override // defpackage.cghg
    public final cgkt b() {
        return this.b;
    }

    @Override // defpackage.cghg
    public final Optional c() {
        return this.e;
    }

    @Override // defpackage.cghg
    public final Optional d() {
        return this.a;
    }

    @Override // defpackage.cghg
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cghg) {
            cghg cghgVar = (cghg) obj;
            if (this.a.equals(cghgVar.d()) && this.b.equals(cghgVar.b()) && this.c.equals(cghgVar.a()) && this.d.equals(cghgVar.e()) && this.e.equals(cghgVar.c()) && this.f == cghgVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cghg
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        cgkm cgkmVar = this.c;
        cgkt cgktVar = this.b;
        return "BasicNotificationBuilderInfo{notificationExtras=" + String.valueOf(this.a) + ", notificationStyleInfo=" + cgktVar.toString() + ", clickInteractionInfo=" + cgkmVar.toString() + ", swipeInteractionInfo=" + String.valueOf(optional2) + ", notificationActions=" + String.valueOf(optional) + ", shouldAlert=" + this.f + "}";
    }
}
