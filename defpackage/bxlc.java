package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxlc {
    public final Context b;
    public final dqsn c;
    public final egzh d;
    public final fcsu e;
    private final Optional g;
    private final fcsu h;
    private final eosc i;
    private final eosc j;
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/shared/datamodel/provider/DataChangeNotifier");
    public static final ejxr a = cdag.v("use_blocking_for_ui_observers");

    public bxlc(Context context, dqsn dqsnVar, egzh egzhVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2) {
        this.b = context;
        this.c = dqsnVar;
        this.d = egzhVar;
        this.g = optional;
        this.e = fcsuVar;
        this.h = fcsuVar2;
        this.i = eoscVar;
        this.j = eoscVar2;
    }

    public final void a() {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyAllMessagesChanged");
        try {
            this.c.e(bace.g(this.b));
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyAllParticipantsChanged");
        try {
            this.c.e(bace.h(this.b));
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyConversationListChanged");
        try {
            dqsn dqsnVar = this.c;
            dqsnVar.e(bace.i(this.b));
            dqsnVar.g(new dqsm() { // from class: bxkz
                @Override // defpackage.dqsm
                public final eieu a() {
                    ejxr ejxrVar = bxlc.a;
                    return eiiy.k("DCN::notifyConversationListChanged::runAfterCommit");
                }
            }, "UpdateUnreadCounterFromConversationList", eiid.k(new Runnable() { // from class: bxla
                @Override // java.lang.Runnable
                public final void run() {
                    caxb caxbVar = (caxb) this.a.e.b();
                    caxa caxaVar = caxa.a;
                    caxr caxrVar = new caxr();
                    caxrVar.b = "update_unread_counter_dedupe";
                    ((cazj) caxbVar.a.b()).a(cbcu.g("update_unread_counter", caxaVar, caxrVar.a()));
                }
            }));
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyConversationMetadataChanged");
        try {
            e(conversationIdType, false);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(ConversationIdType conversationIdType, boolean z) {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyConversationMetadataChanged");
        try {
            Uri uriE = bace.e(this.b, conversationIdType);
            if (z) {
                Uri.Builder builderBuildUpon = uriE.buildUpon();
                builderBuildUpon.appendQueryParameter("sendPush", "true");
                uriE = builderBuildUpon.build();
            }
            this.c.e(uriE);
            c();
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(ezol ezolVar) {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyDesktopDeleted");
        try {
            Uri.Builder builderBuildUpon = bace.j(this.b).buildUpon();
            builderBuildUpon.appendPath(ezolVar.c);
            this.c.e(builderBuildUpon.build());
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g() {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyDesktopsChanged");
        try {
            dqsn dqsnVar = this.c;
            dqsnVar.e(bace.k(this.b));
            if (((cdio) this.h.b()).a()) {
                dqsnVar.g(new dqsm() { // from class: bxkx
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        ejxr ejxrVar = bxlc.a;
                        return eiiy.k("DCN::notifyDesktopsChanged::runAfterCommit");
                    }
                }, "UpdateGaiaDesktopsList", new Runnable() { // from class: bxky
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d.a(eijx.e(null), bvpf.a);
                    }
                });
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h(String str) {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyEverythingChanged");
        try {
            this.c.f(Uri.parse(bace.m(this.b)), str);
            this.g.ifPresent(new Consumer() { // from class: bxlb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ejxr ejxrVar = bxlc.a;
                    ((cqdn) ((fcsu) obj).b()).g();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i(ConversationIdType conversationIdType) {
        Uri uriF = Uri.parse(bace.m(this.b).concat("latest_message_annotations"));
        if (!conversationIdType.b()) {
            uriF = bace.f(uriF.buildUpon(), conversationIdType);
        }
        this.c.e(uriF);
    }

    public final void j(final ConversationIdType conversationIdType, final MessageIdType messageIdType) {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyMessagesChangedImmediatelyInBackground");
        try {
            eiju eijuVarF = eijx.f(new Runnable() { // from class: bxkw
                @Override // java.lang.Runnable
                public final void run() {
                    Context context = this.a.b;
                    context.getContentResolver().notifyChange(bace.c(context, conversationIdType, messageIdType, new String[0]), null);
                }
            }, ((Boolean) ((cczi) a.get()).e()).booleanValue() ? this.i : this.j);
            eieuVarK.b(eijuVarF);
            auvh.h(eijuVarF);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyMessagesChanged");
        try {
            l(conversationIdType, bary.a, new String[0]);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void l(ConversationIdType conversationIdType, MessageIdType messageIdType, String... strArr) {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyMessagesChanged");
        try {
            this.c.e(bace.c(this.b, conversationIdType, messageIdType, strArr));
            c();
            i(conversationIdType);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void m(ConversationIdType conversationIdType, Iterable iterable, String... strArr) {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyMessagesChanged2");
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.c.e(bace.c(this.b, conversationIdType, (MessageIdType) it.next(), strArr));
            }
            eieuVarK.close();
            c();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void n(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifyParticipantsChanged");
        try {
            Uri.Builder builderBuildUpon = bace.h(this.b).buildUpon();
            builderBuildUpon.appendPath(conversationIdType.a());
            this.c.e(builderBuildUpon.build());
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void o(ConversationIdType conversationIdType) {
        eieu eieuVarK = eiiy.k("DataChangeNotifier#notifySuggestionsChanged");
        try {
            this.c.e(bace.f(Uri.parse(bace.m(this.b).concat("suggestions")).buildUpon(), conversationIdType));
            ekrw ekrwVarG = f.g();
            ekrwVarG.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/datamodel/provider/DataChangeNotifier", "notifySuggestionsChanged", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "DataChangeNotifier.java")).t("DataChangeNotifier.notifySuggestionsChanged conversationId=%s", conversationIdType);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
