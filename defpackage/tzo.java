package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzo implements ual {
    public static final cqce a = cqce.g("BugleCms", "ConversationEventHandler");
    public final avnh b;
    public final eosc c;
    private final uad d;
    private final uak e;
    private final eosc f;

    public tzo(avnh avnhVar, uad uadVar, uak uakVar, eosc eoscVar, eosc eoscVar2) {
        this.b = avnhVar;
        this.d = uadVar;
        this.e = uakVar;
        this.f = eoscVar;
        this.c = eoscVar2;
    }

    public static void b(eqjy eqjyVar, boolean z) {
        cqbd cqbdVarC = a.c();
        String str = bzmz.t.a;
        int iB = eqjx.b(eqjyVar.b);
        if (iB == 0) {
            iB = 1;
        }
        String str2 = true != z ? "CmsId not found in DB" : "Conversation is already soft deleted";
        cqbdVarC.A(str, eqjx.a(iB));
        cqbdVarC.A(bzmz.v.a, "Ignore");
        cqbdVarC.A(bzmz.w.a, eqjyVar.c);
        cqbdVarC.A(bzmz.x.a, str2);
        cqbdVarC.I("ConversationEvent received");
        cqbdVarC.r();
    }

    @Override // defpackage.ual
    public final /* bridge */ /* synthetic */ ListenableFuture a(eqmo eqmoVar) {
        if (eqmoVar.b != 2) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.A(bzmz.u.a, eqmn.a(eqmoVar.b));
            cqbdVarE.I("Cannot handle event");
            cqbdVarE.r();
            return eijx.e(null);
        }
        final eqjy eqjyVar = (eqjy) eqmoVar.c;
        int i = eqjyVar.b;
        int iB = eqjx.b(i);
        if (iB == 0) {
            iB = 1;
        }
        int i2 = iB - 2;
        if (i2 == 3) {
            uad uadVar = this.d;
            String str = eqjyVar.c;
            int iB2 = eqjx.b(i);
            return uadVar.a(str, eqjx.a(iB2 != 0 ? iB2 : 1));
        }
        if (i2 == 4) {
            Callable callable = new Callable() { // from class: tzk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Optional.ofNullable(botm.a(eqjyVar.c));
                }
            };
            eosc eoscVar = this.f;
            return eijx.g(callable, eoscVar).i(new eooz() { // from class: tzl
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    boolean zIsEmpty = optional.isEmpty();
                    final eqjy eqjyVar2 = eqjyVar;
                    if (zIsEmpty) {
                        tzo.b(eqjyVar2, false);
                        return eijx.e(null);
                    }
                    if (((bojh) optional.get()).u() > 0) {
                        tzo.b(eqjyVar2, true);
                        return eijx.e(null);
                    }
                    tzo tzoVar = this.a;
                    final ConversationIdType conversationIdTypeC = ((bojh) optional.get()).C();
                    avnk avnkVarF = avnl.f();
                    avnkVarF.b(conversationIdTypeC);
                    avnkVarF.f(elka.CONVERSATION_FROM_CMS_ACTION);
                    eiju eijuVarG = eiju.g(tzoVar.b.a(avnkVarF.a()));
                    ejvr ejvrVar = new ejvr() { // from class: tzm
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cqbd cqbdVarC = tzo.a.c();
                            String str2 = bzmz.t.a;
                            eqjy eqjyVar3 = eqjyVar2;
                            int iB3 = eqjx.b(eqjyVar3.b);
                            if (iB3 == 0) {
                                iB3 = 1;
                            }
                            ConversationIdType conversationIdType = conversationIdTypeC;
                            cqbdVarC.A(str2, eqjx.a(iB3));
                            cqbdVarC.A(bzmz.v.a, "Conversation deleted from DB");
                            cqbdVarC.A(bzmz.w.a, eqjyVar3.c);
                            cqbdVarC.A(bzmz.c.a, conversationIdType);
                            cqbdVarC.I("ConversationEvent received");
                            cqbdVarC.r();
                            return null;
                        }
                    };
                    eosc eoscVar2 = tzoVar.c;
                    return eijuVarG.h(ejvrVar, eoscVar2).f(Throwable.class, new eooz() { // from class: tzn
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            cqbd cqbdVarE2 = tzo.a.e();
                            String str2 = bzmz.t.a;
                            eqjy eqjyVar3 = eqjyVar2;
                            int iB3 = eqjx.b(eqjyVar3.b);
                            if (iB3 == 0) {
                                iB3 = 1;
                            }
                            ConversationIdType conversationIdType = conversationIdTypeC;
                            cqbdVarE2.A(str2, eqjx.a(iB3));
                            cqbdVarE2.A(bzmz.v.a, "Failed to delete conversation from DB");
                            cqbdVarE2.A(bzmz.w.a, eqjyVar3.c);
                            cqbdVarE2.A(bzmz.c.a, conversationIdType);
                            cqbdVarE2.I("ConversationEvent received");
                            cqbdVarE2.s(th);
                            return eijx.d(th);
                        }
                    }, eoscVar2);
                }
            }, eoscVar);
        }
        if (i2 != 5) {
            cqbd cqbdVarA = a.a();
            String str2 = bzmz.t.a;
            int iB3 = eqjx.b(eqjyVar.b);
            cqbdVarA.A(str2, eqjx.a(iB3 != 0 ? iB3 : 1));
            cqbdVarA.A(bzmz.v.a, "Ignore");
            cqbdVarA.A(bzmz.w.a, eqjyVar.c);
            cqbdVarA.A(bzmz.x.a, "Not implemented");
            cqbdVarA.I("ConversationEvent received");
            cqbdVarA.r();
            return eijx.e(null);
        }
        final uak uakVar = this.e;
        int iB4 = eqjx.b(i);
        ejwl.b(iB4 != 0 && iB4 == 7, "Event type should be CONVERSATION_UPDATED");
        if (((Boolean) uak.c.e()).booleanValue() && (eqjyVar.d.contains("most_recent_read_message_time_web") || eqjyVar.d.contains("conversation_status"))) {
            return uakVar.e.m(eqjyVar.c).i(new eooz() { // from class: uai
                /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
                @Override // defpackage.eooz
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r8) {
                    /*
                        Method dump skipped, instructions count: 414
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.uai.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }, uakVar.g).f(fbtf.class, new eooz() { // from class: uaj
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    fbtf fbtfVar = (fbtf) obj;
                    Status status = fbtfVar.a;
                    cqce cqceVar = uak.a;
                    if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                        return eijx.d(fbtfVar);
                    }
                    eqjy eqjyVar2 = eqjyVar;
                    cqbd cqbdVarE2 = uak.a.e();
                    String str3 = bzmz.t.a;
                    int iB5 = eqjx.b(eqjyVar2.b);
                    if (iB5 == 0) {
                        iB5 = 1;
                    }
                    cqbdVarE2.A(str3, eqjx.a(iB5));
                    cqbdVarE2.A(bzmz.v.a, "Ignore");
                    cqbdVarE2.A(bzmz.w.a, eqjyVar2.c);
                    cqbdVarE2.A(bzmz.x.a, "Conversation does not exist in CMS.");
                    cqbdVarE2.I("ConversationEvent received");
                    cqbdVarE2.r();
                    return eijx.e(null);
                }
            }, uakVar.h);
        }
        if (eqjyVar.d.contains("most_recent_read_message_time_web")) {
            return uakVar.e.m(eqjyVar.c).i(new eooz() { // from class: uag
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final uak uakVar2 = uakVar;
                    eqjv eqjvVar = (eqjv) obj;
                    final eqjy eqjyVar2 = eqjyVar;
                    try {
                        final Optional optionalA = uakVar2.a(eqjvVar, eqjyVar2);
                        if (!optionalA.isEmpty()) {
                            return uakVar2.i.b("ConversationUpdateEventHandler#handleUpdatedMostRecentReadMessageTime", new Runnable() { // from class: uae
                                @Override // java.lang.Runnable
                                public final void run() {
                                    eqjy eqjyVar3 = eqjyVar2;
                                    bojh bojhVarA = botm.a(eqjyVar3.c);
                                    if (bojhVarA == null) {
                                        cqbd cqbdVarE2 = uak.a.e();
                                        String str3 = bzmz.t.a;
                                        int iB5 = eqjx.b(eqjyVar3.b);
                                        cqbdVarE2.A(str3, eqjx.a(iB5 != 0 ? iB5 : 1));
                                        cqbdVarE2.A(bzmz.v.a, "Ignore");
                                        cqbdVarE2.A(bzmz.w.a, eqjyVar3.c);
                                        cqbdVarE2.A(bzmz.x.a, "Conversation does not exist in bugle database.");
                                        cqbdVarE2.I("ConversationEvent received");
                                        cqbdVarE2.r();
                                        return;
                                    }
                                    Optional optional = optionalA;
                                    uak uakVar3 = uakVar2;
                                    ConversationIdType conversationIdTypeC = bojhVarA.C();
                                    if (uakVar3.d(conversationIdTypeC, (epkb) optional.get(), bojhVarA, eqjyVar3)) {
                                        uakVar3.c(conversationIdTypeC, true);
                                        return;
                                    }
                                    cqbd cqbdVarA2 = uak.a.a();
                                    String str4 = bzmz.t.a;
                                    int iB6 = eqjx.b(eqjyVar3.b);
                                    cqbdVarA2.A(str4, eqjx.a(iB6 != 0 ? iB6 : 1));
                                    cqbdVarA2.A(bzmz.w.a, eqjyVar3.c);
                                    cqbdVarA2.I("Conversation read status not updated");
                                    cqbdVarA2.r();
                                }
                            });
                        }
                        uak.b(eqjyVar2, "Unable to get a ReadStatus object.");
                        return eijx.e(null);
                    } catch (Throwable th) {
                        cqbd cqbdVarE2 = uak.a.e();
                        String str3 = bzmz.t.a;
                        int iB5 = eqjx.b(eqjyVar2.b);
                        if (iB5 == 0) {
                            iB5 = 1;
                        }
                        cqbdVarE2.A(str3, eqjx.a(iB5));
                        cqbdVarE2.A(bzmz.v.a, "Failed to process event");
                        cqbdVarE2.A(bzmz.w.a, eqjyVar2.c);
                        cqbdVarE2.s(th);
                        return eijx.d(th);
                    }
                }
            }, uakVar.g).f(fbtf.class, new eooz() { // from class: uah
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    fbtf fbtfVar = (fbtf) obj;
                    Status status = fbtfVar.a;
                    cqce cqceVar = uak.a;
                    if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                        return eijx.d(fbtfVar);
                    }
                    eqjy eqjyVar2 = eqjyVar;
                    cqbd cqbdVarE2 = uak.a.e();
                    String str3 = bzmz.t.a;
                    int iB5 = eqjx.b(eqjyVar2.b);
                    if (iB5 == 0) {
                        iB5 = 1;
                    }
                    cqbdVarE2.A(str3, eqjx.a(iB5));
                    cqbdVarE2.A(bzmz.v.a, "Ignore");
                    cqbdVarE2.A(bzmz.w.a, eqjyVar2.c);
                    cqbdVarE2.A(bzmz.x.a, "Conversation does not exist in CMS.");
                    cqbdVarE2.I("ConversationEvent received");
                    cqbdVarE2.r();
                    return eijx.e(null);
                }
            }, uakVar.h);
        }
        uak.b(eqjyVar, "No most_recent_read_message_time_web");
        return eijx.e(null);
    }
}
