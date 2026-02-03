package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebor {
    public final int a;
    public final String b;

    public ebor(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        b(stringBuffer);
        return stringBuffer.toString();
    }

    public final void b(StringBuffer stringBuffer) {
        stringBuffer.append("SIP/2.0");
        stringBuffer.append(" ");
        stringBuffer.append(this.a);
        String str = this.b;
        if (str != null) {
            stringBuffer.append(" ");
            stringBuffer.append(str);
        }
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof ebor) && this.a == ((ebor) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a();
    }
}
