package defpackage;

import android.telephony.PhoneNumberUtils;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfwf {
    public static MessagingResult a(int i) {
        return i == 200 ? MessagingResult.d : i != 403 ? i != 404 ? i != 488 ? (i < 400 || i > 499) ? (i < 500 || i > 599) ? MessagingResult.f : MessagingResult.g : MessagingResult.h : MessagingResult.k : MessagingResult.i : MessagingResult.j;
    }

    public static MessagingResult b(dfvw dfvwVar) {
        dfvwVar.b().isPresent();
        return dfvwVar.c().isPresent() ? new dfuw().apply((dgza) dfvwVar.c().get()) : a(dfvwVar.a());
    }

    public static Conversation c(dgyx dgyxVar) {
        if (dgyxVar.o) {
            throw new IllegalArgumentException("Group message was not sent/received with a session!");
        }
        String string = UUID.randomUUID().toString();
        efhi efhiVar = new efhi();
        efhiVar.d(1);
        efhiVar.c(string);
        efhiVar.b(e(dgyxVar.c));
        return efhiVar.a();
    }

    public static Conversation d(dgzn dgznVar) {
        String str = dgznVar.ai() ? dgznVar.z : dgznVar.y;
        if (str == null) {
            throw new IllegalArgumentException(true != dgznVar.ai() ? "contributionId is null in SIMPLE-IM session" : "conversationId is null in CPM session");
        }
        efhi efhiVar = new efhi();
        efhiVar.c(str);
        efhiVar.d(true == dgznVar.E ? 2 : 1);
        efhiVar.b(dgznVar.E ? g(dgznVar.I) : e(dgznVar.y()));
        return efhiVar.a();
    }

    public static RcsDestinationId e(String str) {
        String strA = null;
        try {
            ebma ebmaVarE = new ebqi(str).e();
            if (ebmaVarE.l()) {
                eblx eblxVar = (eblx) ebmaVarE;
                String strE = eblxVar.e();
                if (strE == null) {
                    throw new IllegalArgumentException("User is null");
                }
                if ("phone".equals(eblxVar.m()) || PhoneNumberUtils.isGlobalPhoneNumber(strE)) {
                    strA = strE;
                }
            } else if (ebmaVarE instanceof ebly) {
                ebly eblyVar = (ebly) ebmaVarE;
                if (eblyVar.e()) {
                    strA = "+" + eblyVar.a();
                } else {
                    strA = eblyVar.a();
                }
            }
        } catch (ebml unused) {
        }
        if (strA == null) {
            return g(str);
        }
        efid efidVar = new efid();
        efidVar.b(strA);
        efidVar.c(1);
        return efidVar.a();
    }

    public static String f(RcsDestinationId rcsDestinationId) {
        int iB = rcsDestinationId.b() - 1;
        String strA = rcsDestinationId.a();
        return iB != 0 ? strA : "tel:".concat(strA);
    }

    private static RcsDestinationId g(String str) {
        if (!str.startsWith("sip:")) {
            throw new IllegalArgumentException("URI format not supported");
        }
        efid efidVar = new efid();
        efidVar.b(str);
        efidVar.c(2);
        return efidVar.a();
    }
}
