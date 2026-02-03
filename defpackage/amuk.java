package defpackage;

import com.google.android.ims.message.rbm.RbmSpecificMessage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amuk implements amva {
    public final ekgb a;
    public final int b;

    public amuk(ekgb ekgbVar, int i) {
        ekgbVar.getClass();
        this.a = ekgbVar;
        this.b = i;
    }

    @Override // defpackage.amvr
    public final String b() {
        return RbmSpecificMessage.CONTENT_TYPE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amuk)) {
            return false;
        }
        amuk amukVar = (amuk) obj;
        return fdbq.f(this.a, amukVar.a) && this.b == amukVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BugleRichCardCarouselContent(cards=");
        sb.append(this.a);
        sb.append(", cardWidth=");
        sb.append((Object) (this.b != 1 ? "MEDIUM" : "SMALL"));
        sb.append(")");
        return sb.toString();
    }
}
