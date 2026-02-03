package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byqa {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsIncrementalMessageRestoreUpsertRunner");
    public static final cczi b = cdag.h(cdag.b, "cms_check_spam_status_from_fi", false);
    public final bysy c;
    public final fcsu d;
    public final bxlc e;
    public final fcsu f;
    public final fcsu g;
    public final dqsn h;
    public final bbhh i;
    public final fcsu j;
    public final fcsu k;
    public final bveg l;
    private final eosc m;
    private final eosc n;

    public byqa(bysy bysyVar, fcsu fcsuVar, bxlc bxlcVar, fcsu fcsuVar2, fcsu fcsuVar3, dqsn dqsnVar, bbhh bbhhVar, fcsu fcsuVar4, fcsu fcsuVar5, bveg bvegVar, eosc eoscVar, eosc eoscVar2) {
        this.c = bysyVar;
        this.d = fcsuVar;
        this.e = bxlcVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = dqsnVar;
        this.i = bbhhVar;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        this.l = bvegVar;
        this.m = eoscVar;
        this.n = eoscVar2;
    }

    public final eiju a(final eqnd eqndVar) {
        eiju eijuVarH = eijx.h(new eooy() { // from class: bypx
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eqnd eqndVar2 = eqndVar;
                byqa byqaVar = this.a;
                return cpyl.a() ? byqaVar.c.f(eqndVar2, true, false) : byqaVar.c.e(eqndVar2, false);
            }
        }, this.n);
        ejvr ejvrVar = new ejvr() { // from class: bypy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws IOException {
                eqnd eqndVar2 = eqndVar;
                Optional optionalOfNullable = Optional.ofNullable(MessagesTable.a(eqndVar2.c));
                boolean zIsPresent = optionalOfNullable.isPresent();
                final byqa byqaVar = this.a;
                if (zIsPresent && !((MessagesTable.BindData) optionalOfNullable.get()).E().c()) {
                    byqaVar.i.a(((MessagesTable.BindData) optionalOfNullable.get()).E());
                }
                if (((Boolean) byqa.b.e()).booleanValue() && optionalOfNullable.isPresent()) {
                    MessageCoreData messageCoreDataA = byqaVar.l.a();
                    messageCoreDataA.bY((MessagesTable.BindData) optionalOfNullable.get());
                    ((cscx) byqaVar.k.b()).a(messageCoreDataA, null, messageCoreDataA.ac());
                }
                final String str = eqndVar2.c;
                Consumer consumer = new Consumer() { // from class: bypu
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        MessagesTable.BindData bindData = (MessagesTable.BindData) obj2;
                        final ConversationIdType conversationIdTypeD = bindData.D();
                        bindData.E();
                        conversationIdTypeD.getClass();
                        final byqa byqaVar2 = byqaVar;
                        byqaVar2.h.d("CmsIncrementalRestoreRunner#refreshConversationDataForMessageAndUnarchive", new Runnable() { // from class: bypw
                            @Override // java.lang.Runnable
                            public final void run() {
                                byqa byqaVar3 = byqaVar2;
                                bakt baktVar = (bakt) byqaVar3.f.b();
                                ConversationIdType conversationIdType = conversationIdTypeD;
                                bvdk bvdkVarS = baktVar.s(conversationIdType);
                                if (bvdkVarS != null && bvdkVarS.equals(bvdk.ARCHIVED)) {
                                    bvdkVarS = bvdk.UNARCHIVED;
                                }
                                baqi baqiVar = (baqi) byqaVar3.g.b();
                                if (bvdkVarS == null) {
                                    bvdkVarS = bvdk.UNARCHIVED;
                                }
                                baqiVar.b(conversationIdType, false, bvdkVarS);
                            }
                        });
                        byqaVar2.e.d(conversationIdTypeD);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                Runnable runnable = new Runnable() { // from class: bypv
                    @Override // java.lang.Runnable
                    public final void run() {
                        ekrw ekrwVarJ = byqa.a.j();
                        ekrwVarJ.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsIncrementalMessageRestoreUpsertRunner", "refreshConversationDataForMessageAndUnarchive", BasePaymentResult.ERROR_REQUEST_FAILED, "CmsIncrementalMessageRestoreUpsertRunner.java")).D("The message is not restored correctly. %s: %s.", bzmz.e.a, str);
                    }
                };
                MessagesTable.BindData bindDataA = MessagesTable.a(str);
                if (bindDataA != null) {
                    consumer.accept(bindDataA);
                } else {
                    runnable.run();
                }
                ((cpqk) byqaVar.d.b()).f(optionalOfNullable.isPresent() ? ((MessagesTable.BindData) optionalOfNullable.get()).E().b() : "", eqndVar2.c, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "success");
                return optionalOfNullable;
            }
        };
        eosc eoscVar = this.m;
        return eijuVarH.h(ejvrVar, eoscVar).i(new eooz() { // from class: bypz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (!optional.isPresent() || ((MessagesTable.BindData) optional.get()).D().b() || !MessageData.cJ(((MessagesTable.BindData) optional.get()).s())) {
                    return eijx.e(null);
                }
                cgbn cgbnVar = (cgbn) this.a.j.b();
                ((MessagesTable.BindData) optional.get()).ai();
                ((MessagesTable.BindData) optional.get()).D();
                return cgbnVar.M();
            }
        }, eoscVar);
    }
}
