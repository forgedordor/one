package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aika {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/analytics/AnalyticsIdHelper");
    public final fcsu a;
    private final fcsu c;

    public aika(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.c = fcsuVar2;
    }

    public static String h(String str) {
        try {
            byte[] bArrK = k(str, MessageDigest.getInstance("SHA-256"), 16);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrK) {
                try {
                    sb.append(String.format("%02x", Byte.valueOf(b2)));
                } catch (UnsupportedEncodingException e) {
                    e = e;
                    ekrw ekrwVarI = b.i();
                    ekrwVarI.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).g(e)).h("com/google/android/apps/messaging/shared/analytics/AnalyticsIdHelper", "getSha256String", 178, "AnalyticsIdHelper.java")).q("Exception while getting SHA string for message");
                    return "";
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            e = e2;
        }
    }

    public static final long i(String str, String str2, long j, String str3, basd basdVar) {
        return j(str + str2 + j + str3 + basd.e(basdVar));
    }

    private static long j(String str) {
        try {
            return ByteBuffer.wrap(k(str, MessageDigest.getInstance("SHA-1"), 8)).getLong();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).g(e)).h("com/google/android/apps/messaging/shared/analytics/AnalyticsIdHelper", "getSha1Value", 167, "AnalyticsIdHelper.java")).q("Exception while getting SHA value for message");
            return -1L;
        }
    }

    private static byte[] k(String str, MessageDigest messageDigest, int i) {
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        byte[] bArrDigest = messageDigest.digest();
        if (bArrDigest.length < i) {
            return bArrDigest;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(bArrDigest, 0, bArr, 0, i);
        return bArr;
    }

    public final long a(ConversationId conversationId) {
        return c(conversationId.b());
    }

    public final long b(ConversationIdType conversationIdType) {
        return c(conversationIdType.b() ? null : conversationIdType.a());
    }

    public final long c(String str) {
        if (str == null) {
            return -1L;
        }
        return j(str.concat(String.valueOf(((ailh) this.a.b()).a())));
    }

    public final long d(MessageCoreData messageCoreData) {
        return messageCoreData.cK() ? e(messageCoreData) : f();
    }

    public final long e(MessageCoreData messageCoreData) {
        Uri uriU = messageCoreData.u();
        return i(uriU != null ? uriU.toString() : null, messageCoreData.au(), messageCoreData.o(), messageCoreData.aj(), messageCoreData.F());
    }

    public final long f() {
        return ((cqbl) this.c.b()).a.nextLong();
    }

    public final String g() {
        return ((ailh) this.a.b()).a();
    }
}
