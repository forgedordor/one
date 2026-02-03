package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.AnnotationSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxux {
    public abstract bxux a(MessageIdType messageIdType);

    public abstract bxuy b();

    public abstract void c(ConversationIdType conversationIdType);

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public abstract void f(ezds ezdsVar);

    public abstract void g(String str);

    public abstract void h(String str);

    public abstract void i(Long l);

    public abstract void j(String str);

    public abstract void k(String str);

    public abstract void l(String str);

    public abstract void m(String str);

    public abstract void n(Optional optional);

    public abstract void o(String str);

    public abstract void p(int i);

    public abstract void q(long j);

    public final bxux r(AnnotationSearchResult annotationSearchResult, alrj alrjVar) {
        if (annotationSearchResult == null) {
            return this;
        }
        MessageIdType messageIdTypeF = annotationSearchResult.f();
        messageIdTypeF.getClass();
        bxux bxuxVarA = a(messageIdTypeF);
        annotationSearchResult.aA(4, "conversation_id");
        ConversationIdType conversationIdType = annotationSearchResult.b;
        conversationIdType.getClass();
        bxtw bxtwVar = (bxtw) bxuxVarA;
        bxtwVar.a = conversationIdType;
        bxtwVar.b = annotationSearchResult.h();
        annotationSearchResult.aA(12, "has_ea2p_bot_recipient");
        bxuxVarA.d(annotationSearchResult.g);
        annotationSearchResult.aA(5, "received_timestamp");
        bxuxVarA.q(annotationSearchResult.c);
        annotationSearchResult.aA(8, "full_name");
        bxtwVar.c = annotationSearchResult.e;
        Optional optionalOfNullable = Optional.ofNullable(annotationSearchResult.h());
        alrjVar.getClass();
        bxuxVarA.n(optionalOfNullable.map(new bxuw(alrjVar)));
        annotationSearchResult.aA(6, "sub_id");
        bxuxVarA.p(annotationSearchResult.d);
        bxtwVar.d = annotationSearchResult.g();
        annotationSearchResult.aA(0, "_id");
        bxtwVar.e = annotationSearchResult.a;
        annotationSearchResult.aA(9, "_id");
        bxuxVarA.e(annotationSearchResult.f > 0);
        return bxuxVarA;
    }

    public final void s(UrlSearchResult urlSearchResult, alrj alrjVar) {
        if (urlSearchResult == null) {
            return;
        }
        MessageIdType messageIdTypeK = urlSearchResult.k();
        messageIdTypeK.getClass();
        a(messageIdTypeK);
        ConversationIdType conversationIdTypeJ = urlSearchResult.j();
        conversationIdTypeJ.getClass();
        c(conversationIdTypeJ);
        o(urlSearchResult.r());
        d(urlSearchResult.t());
        q(urlSearchResult.i());
        m(urlSearchResult.m());
        Optional optionalOfNullable = Optional.ofNullable(urlSearchResult.r());
        alrjVar.getClass();
        n(optionalOfNullable.map(new bxuw(alrjVar)));
        p(urlSearchResult.f());
        f(urlSearchResult.l());
        g(urlSearchResult.n());
        k(urlSearchResult.q());
        l(urlSearchResult.s());
        h(urlSearchResult.o());
        i(Long.valueOf(urlSearchResult.g()));
        j(urlSearchResult.p());
        e(urlSearchResult.h() > 0);
    }
}
