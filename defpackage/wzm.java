package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzm extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ xac d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzm(xac xacVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = xacVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        wzm wzmVar = new wzm(this.d, (fcxy) obj4);
        wzmVar.a = (vzz) obj;
        wzmVar.b = zBooleanValue;
        wzmVar.c = (ahes) obj3;
        return wzmVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String string;
        Integer num;
        fctl.b(obj);
        Object obj2 = this.a;
        final boolean z = this.b;
        Object obj3 = this.c;
        if (obj2 == null) {
            return this.d.p;
        }
        final xac xacVar = this.d;
        fdae fdaeVar = new fdae() { // from class: wzj
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                final xac xacVar2 = xacVar;
                if (z) {
                    eieh eiehVarA = xacVar2.g.a("ComposeRowSendButton.onSend");
                    try {
                        if (xacVar2.o.g(false, true)) {
                            ekrw ekrwVarH = xac.a.h();
                            ekrwVarH.X(eksq.a, "BugleComposeRow2");
                            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl", "onSend", 152, "SendButtonUiAdapterImpl.kt")).q("Beginning SendButtonUiAdapterImpl.onSend");
                            Optional optional = (Optional) xacVar2.l.b();
                            final fdap fdapVar = new fdap() { // from class: wzg
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj4) {
                                    chsd chsdVar = (chsd) obj4;
                                    chsdVar.getClass();
                                    AtomicReference atomicReference = chsdVar.b;
                                    ConversationId conversationId = xacVar2.i;
                                    if (!fdbq.f(atomicReference.getAndSet(conversationId), conversationId)) {
                                        ekrw ekrwVarH2 = chsd.a.h();
                                        ekrwVarH2.X(eksq.a, "BugleProfiles");
                                        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/profile/transport/ProfileInteractionTrackerImpl", "setLastConversationInteraction", 26, "ProfileInteractionTrackerImpl.kt")).t("Setting conversation interaction: %s", conversationId.b());
                                    }
                                    return fctx.a;
                                }
                            };
                            optional.ifPresent(new Consumer() { // from class: wzh
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj4) {
                                    ekrg ekrgVar = xac.a;
                                    fdapVar.invoke(obj4);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            auvw.k(xacVar2.f, xacVar2.d, null, new wzs(xacVar2, (vvw) xacVar2.q.a.c(), xacVar2.m.a(), null), 2);
                        } else {
                            ekrw ekrwVarH2 = xac.a.h();
                            ekrwVarH2.X(eksq.a, "BugleComposeRow2");
                            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl", "onSend", 149, "SendButtonUiAdapterImpl.kt")).q("Skipping SendButtonUiAdapterImpl.onSend");
                        }
                        fczl.a(eiehVarA, null);
                    } finally {
                    }
                } else {
                    xacVar2.c();
                }
                return fctx.a;
            }
        };
        fdae wzkVar = z ? new wzk(xacVar) : new wzl(xacVar);
        Context context = xacVar.c;
        fdae fdaeVar2 = wzkVar;
        String str = obj3 != null ? ((ahes) obj3).a : null;
        if (str == null || (num = ((vzz) obj2).e) == null) {
            string = context.getString(((vzz) obj2).b);
            string.getClass();
        } else {
            string = context.getString(num.intValue(), str);
            string.getClass();
        }
        vzz vzzVar = (vzz) obj2;
        Integer num2 = vzzVar.c;
        return djew.a(xacVar.p, vzzVar.a, fdaeVar, fdaeVar2, string, num2 != null ? context.getString(num2.intValue()) : null, z, null, 64);
    }
}
