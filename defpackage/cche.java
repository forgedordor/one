package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cche {
    public static final aubx a;
    public static final aubx b;
    public static final aubx c;
    public static final aubx d;
    public static final aubx e;

    static {
        aubv aubvVar = (aubv) aubx.a.createBuilder();
        aubvVar.getClass();
        aubz.c("message", aubvVar);
        aubz.b("mls", aubvVar);
        a = aubz.a(aubvVar);
        aubv aubvVar2 = (aubv) aubx.a.createBuilder();
        aubvVar2.getClass();
        aubz.c("message", aubvVar2);
        aubz.b("mls-ft", aubvVar2);
        b = aubz.a(aubvVar2);
        aubv aubvVar3 = (aubv) aubx.a.createBuilder();
        aubvVar3.getClass();
        aubz.c("message", aubvVar3);
        aubz.b("mls-rcs-file-info", aubvVar3);
        c = aubz.a(aubvVar3);
        aubv aubvVar4 = (aubv) aubx.a.createBuilder();
        aubvVar4.getClass();
        aubz.c("message", aubvVar4);
        aubz.b("mls-rcs-server", aubvVar4);
        d = aubz.a(aubvVar4);
        aubv aubvVar5 = (aubv) aubx.a.createBuilder();
        aubvVar5.getClass();
        aubz.c("message", aubvVar5);
        aubz.b("imdn+xml", aubvVar5);
        e = aubz.a(aubvVar5);
        aubv aubvVar6 = (aubv) aubx.a.createBuilder();
        aubvVar6.getClass();
        aubz.c(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, aubvVar6);
        aubz.b("plain", aubvVar6);
        aubz.a(aubvVar6);
        aubv aubvVar7 = (aubv) aubx.a.createBuilder();
        aubvVar7.getClass();
        aubz.c(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, aubvVar7);
        aubz.b("plain", aubvVar7);
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((aubx) aubvVar7.instance).e)).getClass();
        aubvVar7.copyOnWrite();
        ((aubx) aubvVar7.instance).a().put("charset", "utf-8");
        aubz.a(aubvVar7);
    }
}
