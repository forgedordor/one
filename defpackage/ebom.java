package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebom {
    public final ebma a;
    public final String b;
    private final String c = "SIP/2.0";

    public ebom(String str, ebma ebmaVar) {
        this.b = str;
        this.a = ebmaVar;
    }

    public final void a(StringBuffer stringBuffer) {
        String str = this.b;
        if (str != null) {
            stringBuffer.append(str);
            stringBuffer.append(" ");
        }
        stringBuffer.append(this.a.c());
        stringBuffer.append(" ");
        stringBuffer.append(this.c.concat(VCardBuilder.VCARD_END_OF_LINE));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebom)) {
            return false;
        }
        ebom ebomVar = (ebom) obj;
        return TextUtils.equals(this.c, ebomVar.c) && TextUtils.equals(this.b, ebomVar.b) && this.a.equals(ebomVar.a);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = !TextUtils.isEmpty(str) ? str.hashCode() : 0;
        String str2 = this.c;
        if (!TextUtils.isEmpty(str2)) {
            iHashCode = (iHashCode * 37) + str2.hashCode();
        }
        return (iHashCode * 37) + this.a.hashCode();
    }
}
