package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cghc extends cglu {
    public final Optional a;
    private final Optional b;

    public cghc(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.cglu
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.cglu
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cglu) {
            cglu cgluVar = (cglu) obj;
            if (this.a.equals(cgluVar.b()) && this.b.equals(cgluVar.a())) {
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
        return "WearableSpecificNotificationInfo{wearableActions=" + this.a.toString() + ", bridgeTag=" + optional.toString() + "}";
    }
}
