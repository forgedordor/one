package defpackage;

import android.telephony.ims.SipMessage;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgai {
    public static SipMessage a(ebpc ebpcVar) {
        String str;
        if (ebpcVar.s()) {
            ebpd ebpdVar = (ebpd) ebpcVar;
            str = ebpdVar.i() + " " + ebpdVar.w() + " SIP/2.0\r\n";
        } else {
            ebpe ebpeVar = (ebpe) ebpcVar;
            str = "SIP/2.0 " + ebpeVar.w() + " " + ebpeVar.x() + VCardBuilder.VCARD_END_OF_LINE;
        }
        StringBuilder sb = new StringBuilder();
        for (ebob ebobVar : ebpcVar.d) {
            if (!(ebobVar instanceof ebnu)) {
                sb.append(ebobVar);
            }
        }
        byte[] bArr = ebpcVar.k;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append("Content-Length: ");
        sb.append(bArr.length);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        return new SipMessage(str, sb.toString(), bArr);
    }
}
