package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cvnm implements egzv<Conversation> {
    final /* synthetic */ cvnc a;

    public cvnm(cvnc cvncVar) {
        this.a = cvncVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ((dakl) this.a.H().b.b()).i(R.string.conversation_creation_failure);
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cvnc cvncVar = this.a;
        cvnn cvnnVarH = cvncVar.H();
        ConversationId conversationIdD = ((Conversation) obj).d();
        Intent intent = cvncVar.fg().getIntent();
        Optional optionalA = ((cwoo) cvnnVarH.m.b()).a(intent);
        if (optionalA.isPresent()) {
            Object obj2 = optionalA.get();
            final ConversationIdType conversationIdTypeA = ajwb.a(conversationIdD);
            final aspz aspzVar = (aspz) cvnnVarH.c.b();
            final String str = (String) obj2;
            eijx.f(new Runnable() { // from class: aspy
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    ConversationIdType conversationIdType = conversationIdTypeA;
                    aspz aspzVar2 = aspzVar;
                    try {
                        String[] strArr = bmmf.a;
                        bmky bmkyVar = new bmky();
                        bmkyVar.c(conversationIdType);
                        bmkyVar.b(aslb.CREATED);
                        final bmkv bmkvVarA = bmkyVar.a();
                        final dqsy dqsyVarB = bmmf.b();
                        long jB = dqru.b(bmmf.b(), "business_conversations_metadata", bmkvVarA, new Function() { // from class: bmkq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return Long.valueOf(dqsyVarB.Q("business_conversations_metadata", (dqst) obj3, 4));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: bmkr
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj3) {
                                Long l = (Long) obj3;
                                if (l.longValue() >= 0) {
                                    bmkv bmkvVar = bmkvVarA;
                                    bmkvVar.a = l.longValue();
                                    bmkvVar.fN(0);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        Long.valueOf(jB).getClass();
                        if (jB != -1) {
                            aspzVar2.k(4, str2);
                        }
                    } catch (SQLiteException unused) {
                        cqbd cqbdVarE = aspz.a.e();
                        cqbdVarE.I("Conversation was deleted before business metadata could be created");
                        cqbdVarE.c(conversationIdType);
                        cqbdVarE.r();
                    }
                }
            }, aspzVar.c).k(auvh.b(), eoqg.a);
            if (!((asix) cvnnVarH.n.b()).a()) {
                Uri data = intent.getData();
                if (!conversationIdTypeA.b() && data != null) {
                    cavr cavrVar = (cavr) cvnnVarH.e.b();
                    cavp cavpVar = (cavp) cavq.a.createBuilder();
                    String strA = conversationIdTypeA.a();
                    cavpVar.copyOnWrite();
                    cavq cavqVar = (cavq) cavpVar.instance;
                    strA.getClass();
                    cavqVar.c = strA;
                    cavpVar.copyOnWrite();
                    ((cavq) cavpVar.instance).d = str;
                    String string = cwon.a(data).toString();
                    cavpVar.copyOnWrite();
                    cavq cavqVar2 = (cavq) cavpVar.instance;
                    string.getClass();
                    cavqVar2.b = string;
                    ((cazj) cavrVar.a.b()).g(cbcu.f("rbm_chatbot_directory_welcome_message", (cavq) cavpVar.build()));
                } else if (conversationIdTypeA.b()) {
                    ekrw ekrwVarJ = cvnn.a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "processWelcomeMessage", 419, "LaunchConversationFragmentPeer.java")).q("Conversation has not been created: id is null.");
                } else {
                    ekrw ekrwVarJ2 = cvnn.a.j();
                    ekrwVarJ2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/ui/conversation/LaunchConversationFragmentPeer", "processWelcomeMessage", 421, "LaunchConversationFragmentPeer.java")).q("Data URI is absent.");
                }
            }
            cavl cavlVar = (cavl) cvnnVarH.d.b();
            cavh cavhVar = (cavh) cavk.a.createBuilder();
            cavhVar.copyOnWrite();
            ((cavk) cavhVar.instance).b = str;
            cavhVar.copyOnWrite();
            ((cavk) cavhVar.instance).d = cavj.a(3);
            cavhVar.copyOnWrite();
            ((cavk) cavhVar.instance).c = cavi.a(3);
            cavk cavkVar = (cavk) cavhVar.build();
            caxr caxrVar = new caxr();
            caxrVar.a = str;
            caxrVar.b = str;
            cavlVar.b(cavkVar, caxrVar.a());
        }
        optionalA.isPresent();
        cvnnVarH.b(conversationIdD, null);
    }

    @Override // defpackage.egzv
    public final void hn() {
    }
}
