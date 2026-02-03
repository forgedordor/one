package defpackage;

import com.google.android.ims.network.common.RcsEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgtx extends dgvb {
    public final RcsEngine a;
    public final ewwr b;

    public dgtx(RcsEngine rcsEngine, ewwr ewwrVar) {
        if (rcsEngine == null) {
            throw new NullPointerException("Null rcsEngine");
        }
        this.a = rcsEngine;
        if (ewwrVar == null) {
            throw new NullPointerException("Null parameters");
        }
        this.b = ewwrVar;
    }

    @Override // defpackage.dgvb
    public final RcsEngine a() {
        return this.a;
    }

    @Override // defpackage.dgvb
    public final ewwr b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgvb) {
            dgvb dgvbVar = (dgvb) obj;
            if (this.a.equals(dgvbVar.a()) && this.b.equals(dgvbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ewwr ewwrVar = this.b;
        return "RcsEngineState{rcsEngine=" + this.a.toString() + ", parameters=" + ewwrVar.toString() + "}";
    }
}
