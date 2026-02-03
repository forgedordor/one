package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class cqbd extends cqds {
    public static final ThreadLocal a = new ThreadLocal();
    private static final ejxr e = ejxx.a(new ejxr() { // from class: cqbb
        @Override // defpackage.ejxr
        public final Object get() {
            ThreadLocal threadLocal = cqbd.a;
            return Pattern.compile("[^\\p{Punct}\\d+]+");
        }
    });
    private static final ejxr f = ejxx.a(new ejxr() { // from class: cqbc
        @Override // defpackage.ejxr
        public final Object get() {
            ThreadLocal threadLocal = cqbd.a;
            return Pattern.compile("\\d+");
        }
    });

    @Deprecated
    public static String a(String str) {
        return ((Pattern) f.get()).matcher(((Pattern) e.get()).matcher(str).replaceAll("x")).replaceAll("d");
    }

    @Deprecated
    public final void b(long j) {
        F("conversation", "id", Long.valueOf(j));
    }

    @Deprecated
    public final void c(ConversationIdType conversationIdType) {
        F("conversation", "id", conversationIdType);
    }

    @Deprecated
    public final void d(MessageIdType messageIdType) {
        F("message", "id", messageIdType);
    }

    @Deprecated
    public final void e(String str) {
        F("part", "id", str);
    }

    @Deprecated
    public final void f(String str) {
        F("participant", "id", str);
    }

    @Deprecated
    public final void g(String str) {
        F("rcsConversation", "id", str);
    }

    @Deprecated
    public final void h(basd basdVar) {
        if (basd.j(basdVar)) {
            return;
        }
        F("rcsMessage", "id", basd.d(basdVar));
    }

    @Deprecated
    public final void i(long j) {
        F("rcsSessionId", "id", Long.valueOf(j));
    }

    @Deprecated
    public final void j(CharSequence charSequence) {
        D("DisplayName", charSequence);
    }

    @Deprecated
    public final void k(String str) {
        if (this.d) {
            I("MSISDN{");
            if (Log.isLoggable(this.c, 3)) {
                v(str);
            } else if (str == null) {
                v(null);
            } else {
                v(a(str));
            }
            u('}');
        }
    }

    @Deprecated
    public final void l(Uri uri) {
        if (this.d) {
            I("URI{");
            if (Log.isLoggable(this.c, 3)) {
                v(uri);
            } else {
                v(uri.getScheme());
                v("://");
                v(uri.getAuthority());
                v("/...Redacted...");
            }
            u('}');
        }
    }

    @Deprecated
    public final void m(int i) {
        E("subscription", "id", i);
    }

    @Deprecated
    public final void n(cnqj cnqjVar) {
        F("telephonyThreadId", "id", cnqjVar);
    }

    @Deprecated
    public final void o(MessageIdType messageIdType, ConversationIdType conversationIdType) {
        d(messageIdType);
        I("in");
        c(conversationIdType);
    }

    @Deprecated
    public final void p(alqm alqmVar) {
        k(alqmVar != null ? alqmVar.toString() : null);
    }
}
