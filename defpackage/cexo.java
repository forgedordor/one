package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cexo extends ceze {
    private final Optional a;
    private final eiju b;

    public cexo(Optional optional, eiju eijuVar) {
        if (optional == null) {
            throw new NullPointerException("Null getSelf");
        }
        this.a = optional;
        if (eijuVar == null) {
            throw new NullPointerException("Null isSelfE2eeProvisioned");
        }
        this.b = eijuVar;
    }

    @Override // defpackage.ceze
    public final eiju a() {
        return this.b;
    }

    @Override // defpackage.ceze
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ceze) {
            ceze cezeVar = (ceze) obj;
            if (this.a.equals(cezeVar.b()) && this.b.equals(cezeVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eiju eijuVar = this.b;
        return "ConversationSelfResult{getSelf=" + this.a.toString() + ", isSelfE2eeProvisioned=" + eijuVar.toString() + "}";
    }
}
