package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unk extends unm {
    private final cknq a;
    private final Optional b;

    public unk(cknq cknqVar, Optional optional) {
        this.a = cknqVar;
        this.b = optional;
    }

    @Override // defpackage.unm
    public final cknq a() {
        return this.a;
    }

    @Override // defpackage.unm
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof unm) {
            unm unmVar = (unm) obj;
            if (this.a.equals(unmVar.a()) && this.b.equals(unmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "ReactionSelectionData{reactedMessageData=" + this.a.toString() + ", selectedReaction=" + optional.toString() + "}";
    }
}
