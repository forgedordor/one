package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oil {
    public final okq a;
    public final boolean b;
    public final boolean c;
    private final Object d;

    public oil(okq okqVar, boolean z, Object obj, boolean z2) {
        if (!okqVar.q && z) {
            throw new IllegalArgumentException(okqVar.e().concat(" does not allow nullable values"));
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + okqVar.e() + " has null value but is not nullable.");
        }
        this.a = okqVar;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final void a(String str, Bundle bundle) {
        Object obj;
        str.getClass();
        if (!this.c || (obj = this.d) == null) {
            return;
        }
        this.a.f(bundle, str, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oil oilVar = (oil) obj;
        if (this.b != oilVar.b || this.c != oilVar.c || !fdbq.f(this.a, oilVar.a)) {
            return false;
        }
        Object obj2 = this.d;
        return obj2 != null ? fdbq.f(obj2, oilVar.d) : oilVar.d == null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.d;
        return ((((iHashCode + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = fdcj.a;
        sb.append(new fdbi(getClass()).c());
        okq okqVar = this.a;
        Objects.toString(okqVar);
        sb.append(" Type: ".concat(okqVar.toString()));
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            Object obj = this.d;
            Objects.toString(obj);
            sb.append(" DefaultValue: ".concat(String.valueOf(obj)));
        }
        return sb.toString();
    }
}
