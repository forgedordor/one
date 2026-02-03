package defpackage;

import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eezb extends eeze {
    private final PendingIntent a;
    private final boolean b;

    public eezb(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.a = pendingIntent;
        this.b = z;
    }

    @Override // defpackage.eeze
    public final PendingIntent a() {
        return this.a;
    }

    @Override // defpackage.eeze
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eeze) {
            eeze eezeVar = (eeze) obj;
            if (this.a.equals(eezeVar.a()) && this.b == eezeVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.a.toString() + ", isNoOp=" + this.b + "}";
    }
}
