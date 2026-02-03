package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebkm extends ebkh {
    public static final ebkm a = new ebkm(0);
    public final int b;

    public ebkm(int i) {
        this.b = i;
    }

    @Override // defpackage.ebkh
    public final void b(StringBuilder sb) {
        sb.append("v=");
        sb.append(this.b);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof ebkm) && this.b == ((ebkm) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }
}
