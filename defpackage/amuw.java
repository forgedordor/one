package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amuw implements amuz {
    public final int a;
    private final amuy b;

    public amuw(amuy amuyVar, int i) {
        this.b = amuyVar;
        this.a = i;
    }

    @Override // defpackage.amuz
    public final amuy a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amuw)) {
            return false;
        }
        amuw amuwVar = (amuw) obj;
        return fdbq.f(this.b, amuwVar.b) && this.a == amuwVar.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BugleVerticalRichCardAttachment(cardAttachmentContent=");
        sb.append(this.b);
        sb.append(", size=");
        int i = this.a;
        sb.append((Object) (i != 1 ? i != 2 ? "TALL" : "MEDIUM" : "SHORT"));
        sb.append(")");
        return sb.toString();
    }
}
