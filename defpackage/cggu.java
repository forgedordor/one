package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cggu extends cgkn {
    public final Optional a;
    public final Bundle b;

    public cggu(Optional optional, Bundle bundle) {
        this.a = optional;
        if (bundle == null) {
            throw new NullPointerException("Null callbackBundle");
        }
        this.b = bundle;
    }

    @Override // defpackage.cgkn
    public final Bundle a() {
        return this.b;
    }

    @Override // defpackage.cgkn
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgkn) {
            cgkn cgknVar = (cgkn) obj;
            if (this.a.equals(cgknVar.b()) && this.b.equals(cgknVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Bundle bundle = this.b;
        return "NotificationInteractionInfo{intentToRun=" + this.a.toString() + ", callbackBundle=" + bundle.toString() + "}";
    }
}
