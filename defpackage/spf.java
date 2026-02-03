package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spf extends spk {
    private final ekgb a;
    private final smy b;

    public spf(ekgb ekgbVar, smy smyVar) {
        this.a = ekgbVar;
        this.b = smyVar;
    }

    @Override // defpackage.spk
    public final smy a() {
        return this.b;
    }

    @Override // defpackage.spk
    public final ekgb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spk) {
            spk spkVar = (spk) obj;
            if (ekjz.h(this.a, spkVar.b()) && this.b.equals(spkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1001110;
    }

    public final String toString() {
        return "SmartReplyRequest{messages=" + this.a.toString() + ", userProperties=UserProperties{isMinorUser=false}}";
    }
}
