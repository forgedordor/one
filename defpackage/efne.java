package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efne {
    public static final ContentType a;
    public static final ContentType b;
    public static final ContentType c;
    public static final ContentType d;
    public static final ContentType e;
    public static final ContentType f;
    public static final ContentType g;
    public static final ContentType h;
    public static final ContentType i;
    public static final ContentType j;

    static {
        efil efilVarD = ContentType.d();
        efilVarD.f("application");
        efilVarD.e("im-iscomposing+xml");
        a = efilVarD.g();
        efil efilVarD2 = ContentType.d();
        efilVarD2.f("application");
        efilVarD2.e("vnd.gsma.rcs-ft-http+xml");
        b = efilVarD2.g();
        efil efilVarD3 = ContentType.d();
        efilVarD3.f("application");
        efilVarD3.e("vnd.gsma.rcspushlocation+xml");
        c = efilVarD3.g();
        efil efilVarD4 = ContentType.d();
        efilVarD4.f("message");
        efilVarD4.e("imdn+xml");
        d = efilVarD4.g();
        efil efilVarD5 = ContentType.d();
        efilVarD5.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        efilVarD5.e("plain");
        e = efilVarD5.g();
        efil efilVarD6 = ContentType.d();
        efilVarD6.f("application");
        efilVarD6.e("vnd.gsma.botmessage.v1.0+json");
        f = efilVarD6.g();
        efil efilVarD7 = ContentType.d();
        efilVarD7.f("application");
        efilVarD7.e("vnd.gsma.botsuggestion.v1.0+json");
        g = efilVarD7.g();
        efil efilVarD8 = ContentType.d();
        efilVarD8.f("image");
        efilVarD8.e("jpeg");
        h = efilVarD8.g();
        efil efilVarD9 = ContentType.d();
        efilVarD9.f("application");
        efilVarD9.e("octet-stream");
        i = efilVarD9.g();
        efil efilVarD10 = ContentType.d();
        efilVarD10.f("application");
        efilVarD10.e("txt");
        j = efilVarD10.g();
    }
}
