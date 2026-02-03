package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebkq extends ebkh {
    public static final ebkq a = new ebkq(0, 0);
    private final long b;
    private final long c;

    public ebkq(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.ebkh
    public final void b(StringBuilder sb) {
        sb.append("t=");
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.c);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebkq)) {
            return false;
        }
        ebkq ebkqVar = (ebkq) obj;
        return this.b == ebkqVar.b && this.c == ebkqVar.c;
    }

    public final int hashCode() {
        return (((int) this.b) * 37) + ((int) this.c);
    }
}
