package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cott extends cayv {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public static final cczi b = cdag.e(cdag.b, "thumbnail_download_completed_handler_max_retry", 1);
    public static final cczi c = cdag.e(cdag.b, "thumbnail_download_completed_handler_retry_delay", 1000);
    public final eosc d;
    public final eosc e;
    public final ayqd f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final dqsn k;
    public final chvp l;
    public final cmok m;
    public final coor n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    private final cosz s;

    public cott(eosc eoscVar, eosc eoscVar2, cosz coszVar, ayqd ayqdVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, chvp chvpVar, dqsn dqsnVar, cmok cmokVar, coor coorVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        this.d = eoscVar;
        this.e = eoscVar2;
        this.s = coszVar;
        this.f = ayqdVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.j = fcsuVar4;
        this.k = dqsnVar;
        this.l = chvpVar;
        this.m = cmokVar;
        this.n = coorVar;
        this.o = fcsuVar5;
        this.p = fcsuVar6;
        this.q = fcsuVar7;
        this.r = fcsuVar8;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        if (((Boolean) ((cczi) ateo.a.get()).e()).booleanValue()) {
            return caya.l().a();
        }
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) b.e()).intValue());
        caxzVarL.g(((Integer) c.e()).intValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("ThumbnailDownloadCompletedHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cotv.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cotv cotvVar = (cotv) evuhVar;
        final basd basdVarA = basd.a(cotvVar.b);
        final Uri uri = Uri.parse(cotvVar.c);
        final String strA = ejwk.a(cotvVar.d);
        if (Uri.EMPTY.equals(uri)) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.X(cqnc.e, basdVarA.b);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/ThumbnailDownloadCompletedHandler", "processPendingWorkItemAsync", 179, "ThumbnailDownloadCompletedHandler.java")).q("Thumbnail Uri is not provided. Cannot update thumbnail for incoming file transfer.");
            return eijx.e(cbcw.k());
        }
        eiju eijuVarA = this.s.a(basdVarA);
        eooz eoozVar = new eooz() { // from class: cotp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return eijx.e(cbcw.k());
                }
                final MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                if (messageCoreData.cy()) {
                    eksl ekslVar2 = (eksl) cott.a.h();
                    ekslVar2.X(cqnc.r, messageCoreData.A().toString());
                    ekslVar2.X(cqnc.a, messageCoreData.C().b());
                    ekslVar2.X(cqnc.e, messageCoreData.F().b);
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/ThumbnailDownloadCompletedHandler", "processPendingWorkItemAsync", 206, "ThumbnailDownloadCompletedHandler.java")).q("Message has already finished downloading. Skipping updating thumbnail.");
                    return eijx.e(cbcw.i());
                }
                final String str = strA;
                final Uri uri2 = uri;
                final cott cottVar = this.a;
                eiju eijuVarG = eijx.g(new Callable() { // from class: cotl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cottVar.m.a(messageCoreData.F(), uri2, 1);
                    }
                }, cottVar.e);
                eooz eoozVar2 = new eooz() { // from class: cotm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final MessageCoreData messageCoreData2 = messageCoreData;
                        final Uri uri3 = (Uri) obj2;
                        final ConversationIdType conversationIdTypeA = messageCoreData2.A();
                        final MessageIdType messageIdTypeC = messageCoreData2.C();
                        final MessagePartCoreData messagePartCoreDataH = messageCoreData2.H();
                        messagePartCoreDataH.getClass();
                        final cott cottVar2 = cottVar;
                        final bvdq bvdqVar = ((csme) cottVar2.o.b()).b() ? bvdq.PENDING_VERDICT : bvdq.DEFAULT_NO_VERDICT;
                        String str2 = str;
                        eiju eijuVarF = eijx.f(new Runnable() { // from class: cotj
                            @Override // java.lang.Runnable
                            public final void run() {
                                final cott cottVar3 = cottVar2;
                                final ConversationIdType conversationIdType = conversationIdTypeA;
                                final MessageIdType messageIdType = messageIdTypeC;
                                final MessagePartCoreData messagePartCoreData = messagePartCoreDataH;
                                final Uri uri4 = uri3;
                                final bvdq bvdqVar2 = bvdqVar;
                                final MessageCoreData messageCoreData3 = messageCoreData2;
                                cottVar3.k.d("ThumbnailDownloadCompletedHandler.updateThumbnailInBugleDb", new Runnable() { // from class: coto
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        cott cottVar4 = cottVar3;
                                        bbae bbaeVar = (bbae) cottVar4.h.b();
                                        String strW = messagePartCoreData.W();
                                        String[] strArr = PartsTable.a;
                                        bsjh bsjhVar = new bsjh();
                                        bsjhVar.ap("updateThumbnailInBugleDb");
                                        bsjhVar.u(uri4);
                                        bsjhVar.q(bvdqVar2);
                                        ConversationIdType conversationIdType2 = conversationIdType;
                                        MessageIdType messageIdType2 = messageIdType;
                                        bbaeVar.f(conversationIdType2, messageIdType2, strW, bsjhVar);
                                        MessageCoreData messageCoreDataO = ((baxe) cottVar4.g.b()).o(conversationIdType2);
                                        if (messageCoreDataO == null || messageCoreDataO.C().equals(messageIdType2)) {
                                            ((baqi) cottVar4.i.b()).f(conversationIdType2, messageIdType2, Long.valueOf(messageCoreData3.o()), bvdk.UNARCHIVED, -1L, null);
                                        }
                                    }
                                });
                                ((cmxn) cottVar3.j.b()).k(messageCoreData3.F().f(), new dzfh("ToThumbnailDownloaded"), cmxm.TACHYGRAM_MESSAGE_ARRIVED);
                                Consumer consumer = new Consumer() { // from class: cook
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj3) {
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                        return Consumer$CC.$default$andThen(this, consumer2);
                                    }
                                };
                                coor coorVar = cottVar3.n;
                                ((aimb) coorVar.b.b()).a().j(coorVar.d(messageCoreData3, 34, consumer), aioj.LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS);
                            }
                        }, cottVar2.e);
                        eooz eoozVar3 = new eooz() { // from class: cotk
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                cottVar2.f.e(false, messageCoreData2.A());
                                return eijx.e(null);
                            }
                        };
                        eosc eoscVar = cottVar2.d;
                        eiju eijuVarI = eijuVarF.i(eoozVar3, eoscVar);
                        chvp chvpVar = cottVar2.l;
                        if (chvpVar.q()) {
                            return eijx.k(eijuVarI, chvpVar.k(messageCoreData2, uri3, str2)).a(new Callable() { // from class: cotr
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return cbcw.i();
                                }
                            }, eoscVar);
                        }
                        boolean z = ((aqzb) cottVar2.p.b()).a() && !((ctce) cottVar2.r.b()).b();
                        return !z ? eijx.k(eijuVarI, chvpVar.n(messageCoreData2, uri3, str2)).a(new Callable() { // from class: cotr
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return cbcw.i();
                            }
                        }, eoscVar) : eijx.k(eijuVarI, chvpVar.k(messageCoreData2, uri3, str2)).a(new Callable() { // from class: cots
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                coou coouVar = (coou) coow.a.createBuilder();
                                MessageCoreData messageCoreData3 = messageCoreData2;
                                String strF = messageCoreData3.F().f();
                                coouVar.copyOnWrite();
                                ((coow) coouVar.instance).b = strF;
                                String string = uri3.toString();
                                coouVar.copyOnWrite();
                                coow coowVar = (coow) coouVar.instance;
                                string.getClass();
                                coowVar.c = string;
                                coouVar.copyOnWrite();
                                ((coow) coouVar.instance).e = coov.a(4);
                                coow coowVar2 = (coow) coouVar.build();
                                caxr caxrVar = new caxr();
                                caxrVar.d = messageCoreData3.F().f();
                                caxrVar.b = "thumbnail/".concat(messageCoreData3.F().f());
                                return cbcw.j(ekgb.r(coox.a(coowVar2, caxrVar.a())));
                            }
                        }, eoscVar);
                    }
                };
                eosc eoscVar = cottVar.d;
                return eijuVarG.i(eoozVar2, eoscVar).e(IOException.class, new ejvr() { // from class: cotn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cott.E.s("Unable to complete the incoming thumbnail transfer.", (IOException) obj2);
                        return cbcw.k();
                    }
                }, eoscVar);
            }
        };
        eosc eoscVar = this.d;
        eiju eijuVarI = eijuVarA.i(eoozVar, eoscVar);
        return ((Boolean) ((cczi) ateo.a.get()).e()).booleanValue() ? eijuVarI : eijuVarI.f(cond.class, new eooz() { // from class: cotq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cond condVar = (cond) obj;
                eksl ekslVar2 = (eksl) ((eksl) cott.a.j()).g(condVar);
                ekslVar2.X(cqnc.e, basdVarA.b);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/ThumbnailDownloadCompletedHandler", "processPendingWorkItemAsync", 226, "ThumbnailDownloadCompletedHandler.java")).q("Failed to update thumbnail for incoming file transfer.");
                return condVar.d().booleanValue() ? eijx.e(cbcw.m()) : eijx.e(cbcw.k());
            }
        }, eoscVar);
    }
}
