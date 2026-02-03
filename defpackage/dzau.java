package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzau extends dzbg {
    private final dcfx a;
    private final Status b;

    public dzau(dcfx dcfxVar, Status status) {
        if (dcfxVar == null) {
            throw new NullPointerException("Null result");
        }
        this.a = dcfxVar;
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.b = status;
    }

    @Override // defpackage.dzbg
    public final dcfx a() {
        return this.a;
    }

    @Override // defpackage.dzbg
    public final Status b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzbg) {
            dzbg dzbgVar = (dzbg) obj;
            if (this.a.equals(dzbgVar.a()) && this.b.equals(dzbgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
