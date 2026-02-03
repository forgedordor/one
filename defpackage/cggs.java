package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cggs extends cgkd {
    public final cglf a;
    public final Optional b;
    private final Bundle c;
    private final boolean d;

    public cggs(cglf cglfVar, Optional optional, Bundle bundle, boolean z) {
        if (cglfVar == null) {
            throw new NullPointerException("Null notificationType");
        }
        this.a = cglfVar;
        this.b = optional;
        if (bundle == null) {
            throw new NullPointerException("Null notificationBundle");
        }
        this.c = bundle;
        this.d = z;
    }

    @Override // defpackage.cgkd
    public final Bundle a() {
        return this.c;
    }

    @Override // defpackage.cgkd
    public final cglf b() {
        return this.a;
    }

    @Override // defpackage.cgkd
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.cgkd
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgkd) {
            cgkd cgkdVar = (cgkd) obj;
            if (this.a.equals(cgkdVar.b()) && this.b.equals(cgkdVar.c()) && this.c.equals(cgkdVar.a()) && this.d == cgkdVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        Bundle bundle = this.c;
        Optional optional = this.b;
        return "NotificationData{notificationType=" + this.a.toString() + ", notificationTag=" + optional.toString() + ", notificationBundle=" + bundle.toString() + ", isSummaryNotification=" + this.d + "}";
    }
}
