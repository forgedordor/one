package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqb extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler");
    public static final eksp b = eksp.c("BugleNotifications");
    public static final cczi c = cdag.e(cdag.b, "file_download_completed_handler_max_retry", 3);
    public static final cczi d = cdag.e(cdag.b, "file_download_completed_handler_retry_delay", 2000);
    public final fcsu A;
    private final cosz B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu F;
    public final Context e;
    public final eosc f;
    public final eosc g;
    public final eosc h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final cmok q;
    public final ayqn r;
    public final fcsu s;
    public final fcsu t;
    public final fcsu u;
    public final fcsu v;
    public final fcsu w;
    public final coor x;
    public final ateg y;
    public final aypv z;

    public coqb(Context context, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, cosz coszVar, cmok cmokVar, ayqn ayqnVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, coor coorVar, ateg ategVar, aypv aypvVar, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17) {
        this.e = context;
        this.f = eoscVar;
        this.g = eoscVar2;
        this.h = eoscVar3;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
        this.l = fcsuVar4;
        this.m = fcsuVar5;
        this.p = fcsuVar6;
        this.n = fcsuVar7;
        this.o = fcsuVar8;
        this.B = coszVar;
        this.q = cmokVar;
        this.r = ayqnVar;
        this.s = fcsuVar9;
        this.t = fcsuVar10;
        this.u = fcsuVar11;
        this.v = fcsuVar12;
        this.w = fcsuVar13;
        this.x = coorVar;
        this.y = ategVar;
        this.z = aypvVar;
        this.C = fcsuVar14;
        this.D = fcsuVar15;
        this.F = fcsuVar16;
        this.A = fcsuVar17;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) c.e()).intValue());
        caxzVarL.g(((Integer) d.e()).intValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("FileDownloadCompletedHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return coqd.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final coqd coqdVar = (coqd) evuhVar;
        final basd basdVarA = basd.a(coqdVar.c);
        final Uri uri = Uri.parse(coqdVar.d);
        eiju eijuVarA = this.B.a(basdVarA);
        eooz eoozVar = new eooz() { // from class: copt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    basd basdVar = basdVarA;
                    ekrw ekrwVarH = coqb.a.h();
                    ekrwVarH.X(eksq.a, "BugleFileTransfer");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(cqnc.f, basdVar);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processPendingWorkItemAsync", 272, "FileDownloadCompletedHandler.java")).q("MessageCoreData not found for completing file transfer.");
                    return eijx.e(cbcw.k());
                }
                final MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                if (messageCoreData.cy()) {
                    ekrw ekrwVarH2 = coqb.a.h();
                    ekrwVarH2.X(eksq.a, "BugleFileTransfer");
                    ekrd ekrdVar2 = (ekrd) ekrwVarH2;
                    ekrdVar2.X(cqnc.s, messageCoreData.A());
                    ekrdVar2.X(cqnc.b, messageCoreData.C());
                    ekrdVar2.X(cqnc.f, messageCoreData.F());
                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processPendingWorkItemAsync", 282, "FileDownloadCompletedHandler.java")).q("Message has already finished downloading. Skipping completing the incoming file transfer.");
                    return eijx.e(cbcw.i());
                }
                final coqd coqdVar2 = coqdVar;
                final Uri uri2 = uri;
                final coqb coqbVar = this.a;
                final String strA = ejwk.a(coqdVar2.e);
                Callable callable = new Callable() { // from class: copf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ekrw ekrwVarH3 = coqb.a.h();
                        ekrwVarH3.X(eksq.a, "BugleFileTransfer");
                        ekrd ekrdVar3 = (ekrd) ekrwVarH3;
                        ekrdVar3.X(cqnc.f, basd.a(coqdVar2.c));
                        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 335, "FileDownloadCompletedHandler.java")).q("Converting file to unencrypted");
                        return coqbVar.q.a(messageCoreData.F(), uri2, 2);
                    }
                };
                eosc eoscVar = coqbVar.g;
                eiju eijuVarI = eijx.g(callable, eoscVar).i(new eooz() { // from class: copg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        MessageCoreData messageCoreData2 = messageCoreData;
                        coqd coqdVar3 = coqdVar2;
                        final Uri uri3 = (Uri) obj2;
                        String str = strA;
                        final coqb coqbVar2 = coqbVar;
                        if (!coqbVar2.k()) {
                            fcsu fcsuVar = coqbVar2.l;
                            if (!((chvp) fcsuVar.b()).q()) {
                                ekrw ekrwVarH3 = coqb.a.h();
                                ekrwVarH3.X(eksq.a, "BugleFileTransfer");
                                ekrd ekrdVar3 = (ekrd) ekrwVarH3;
                                ekrdVar3.X(cqnc.f, basd.a(coqdVar3.c));
                                ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 375, "FileDownloadCompletedHandler.java")).q("Persisting file to Telephony DB");
                                return ((chvp) fcsuVar.b()).m(messageCoreData2, uri3, str).h(new ejvr() { // from class: cope
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        ekrg ekrgVar = coqb.a;
                                        return new copb(uri3, (Uri) obj3);
                                    }
                                }, coqbVar2.f);
                            }
                        }
                        final Uri uri4 = uri2;
                        ekrw ekrwVarH4 = coqb.a.h();
                        ekrwVarH4.X(eksq.a, "BugleFileTransfer");
                        ekrd ekrdVar4 = (ekrd) ekrwVarH4;
                        ekrdVar4.X(cqnc.f, basd.a(coqdVar3.c));
                        ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 352, "FileDownloadCompletedHandler.java")).q("Persisting file in local storage");
                        return ((chvp) coqbVar2.l.b()).k(messageCoreData2, uri3, str).h(new ejvr() { // from class: cops
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                Uri uri5 = (Uri) obj3;
                                coqb coqbVar3 = coqbVar2;
                                boolean zA = ((aqby) coqbVar3.A.b()).a();
                                Uri uri6 = uri3;
                                if (!zA && !((chvp) coqbVar3.l.b()).q()) {
                                    uri6 = uri4;
                                }
                                return new copb(uri6, uri5);
                            }
                        }, coqbVar2.f);
                    }
                }, eoscVar);
                eooz eoozVar2 = new eooz() { // from class: coph
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final copy copyVar = (copy) obj2;
                        Uri uriA = copyVar.a();
                        final MessageCoreData messageCoreData2 = messageCoreData;
                        if (uriA == null) {
                            ekrw ekrwVarI = coqb.a.i();
                            ekrwVarI.X(eksq.a, "BugleFileTransfer");
                            ekrd ekrdVar3 = (ekrd) ekrwVarI;
                            ekrdVar3.X(cqnc.f, messageCoreData2.F());
                            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 388, "FileDownloadCompletedHandler.java")).q("Failed to complete file transfer. Temporary file was not successfully persisted");
                            return eijx.e(new copd(cbcw.m(), copyVar));
                        }
                        coqd coqdVar3 = coqdVar2;
                        final coqb coqbVar2 = coqbVar;
                        ekrw ekrwVarH3 = coqb.a.h();
                        ekrwVarH3.X(eksq.a, "BugleFileTransfer");
                        ekrd ekrdVar4 = (ekrd) ekrwVarH3;
                        ekrdVar4.X(cqnc.f, basd.a(coqdVar3.c));
                        ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 401, "FileDownloadCompletedHandler.java")).q("Completing incoming file transfer for successfully persisted file");
                        final Uri uriA2 = copyVar.a();
                        uriA2.getClass();
                        final Uri uriB = copyVar.b();
                        final MessagePartCoreData messagePartCoreDataH = messageCoreData2.H();
                        messagePartCoreDataH.getClass();
                        eiju eijuVarG = eijx.g(new Callable() { // from class: copw
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                String path;
                                String[] strArr = PartsTable.a;
                                bsjh bsjhVar = new bsjh();
                                bsjhVar.ap("createMessagePartUpdateBuilder");
                                Uri uri3 = uriA2;
                                bsjhVar.z(uri3);
                                coqb coqbVar3 = coqbVar2;
                                MessagePartCoreData messagePartCoreData = messagePartCoreDataH;
                                if (messagePartCoreData.bj()) {
                                    Rect rectG = ((cqsu) coqbVar3.m.b()).g(uri3, messagePartCoreData.R());
                                    bsjhVar.B(rectG.width());
                                    bsjhVar.p(rectG.height());
                                } else if (messagePartCoreData.bx()) {
                                    copz copzVar = (copz) new cqwn(coqbVar3.e).b(uri3, new ejvr() { // from class: copr
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            cqwn cqwnVar = (cqwn) obj3;
                                            ekrg ekrgVar = coqb.a;
                                            return new copc(cqwv.b(cqwnVar), cqwv.c(cqwnVar));
                                        }
                                    }, new copc(new Point(-1, -1), Duration.ZERO));
                                    bsjhVar.B(copzVar.a().x);
                                    bsjhVar.p(copzVar.a().y);
                                    bsjhVar.l(copzVar.b().toMillis());
                                } else if (messagePartCoreData.aY()) {
                                    bsjhVar.l(cqmz.b(coqbVar3.e, uri3));
                                }
                                if (((chvp) coqbVar3.l.b()).q() && Objects.equals(uri3.getScheme(), "file") && (path = uri3.getPath()) != null) {
                                    bsjhVar.r(new File(path).getAbsolutePath());
                                }
                                return bsjhVar;
                            }
                        }, coqbVar2.h);
                        eooz eoozVar3 = new eooz() { // from class: copx
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                final bsjh bsjhVar = (bsjh) obj3;
                                final coqb coqbVar3 = coqbVar2;
                                dqsn dqsnVar = (dqsn) coqbVar3.n.b();
                                final MessageCoreData messageCoreData3 = messageCoreData2;
                                final MessagePartCoreData messagePartCoreData = messagePartCoreDataH;
                                final Uri uri3 = uriA2;
                                if (!((Boolean) dqsnVar.a("IncomingRcsFileTransferUtils#completeFileTransfer", new dqsl() { // from class: copq
                                    @Override // defpackage.dqsl
                                    public final Object a(byeu byeuVar) {
                                        coqb coqbVar4;
                                        boolean z;
                                        ekrg ekrgVar = coqb.a;
                                        ekrw ekrwVarH4 = ekrgVar.h();
                                        ekrz ekrzVar = eksq.a;
                                        ekrwVarH4.X(ekrzVar, "BugleFileTransfer");
                                        ekrd ekrdVar5 = (ekrd) ekrwVarH4;
                                        MessageCoreData messageCoreData4 = messageCoreData3;
                                        ekrz ekrzVar2 = cqnc.b;
                                        ekrdVar5.X(ekrzVar2, messageCoreData4.C());
                                        ekrz ekrzVar3 = cqnc.f;
                                        ekrdVar5.X(ekrzVar3, messageCoreData4.F());
                                        ekrz ekrzVar4 = cqnc.s;
                                        ekrdVar5.X(ekrzVar4, messageCoreData4.A());
                                        ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "executeUpdateMessagePartInTransaction", 710, "FileDownloadCompletedHandler.java")).q("Updating completed file transfer in Bugle db.");
                                        ekrw ekrwVarH5 = ekrgVar.h();
                                        ekrwVarH5.X(ekrzVar, "BugleFileTransfer");
                                        ekrd ekrdVar6 = (ekrd) ekrwVarH5;
                                        ekrdVar6.X(ekrzVar2, messageCoreData4.C());
                                        Uri uri4 = uri3;
                                        ekrdVar6.X(cqnc.D, uri4.toString());
                                        ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "updateMessagePartData", 884, "FileDownloadCompletedHandler.java")).q("Updating incoming file transfer metadata in Bugle DB");
                                        coqb coqbVar5 = coqbVar3;
                                        bbae bbaeVar = (bbae) coqbVar5.t.b();
                                        MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                                        if (!bbaeVar.f(messageCoreData4.A(), messageCoreData4.C(), messagePartCoreData2.W(), bsjhVar)) {
                                            ekrw ekrwVarH6 = ekrgVar.h();
                                            ekrwVarH6.X(ekrzVar, "BugleFileTransfer");
                                            ekrd ekrdVar7 = (ekrd) ekrwVarH6;
                                            ekrdVar7.X(ekrzVar2, messageCoreData4.C());
                                            ekrdVar7.X(ekrzVar3, messageCoreData4.F());
                                            ekrdVar7.X(ekrzVar4, messageCoreData4.A());
                                            ((ekrd) ekrdVar7.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "executeUpdateMessagePartInTransaction", 722, "FileDownloadCompletedHandler.java")).q("Failed to update message part data in Bugle db.");
                                            byeuVar.a(false);
                                        }
                                        messagePartCoreData2.ar(uri4);
                                        fcsu fcsuVar = coqbVar5.i;
                                        boolean zF = ((bwwe) fcsuVar.b()).f(messageCoreData4.A());
                                        boolean zG = ((bwwe) fcsuVar.b()).g(messageCoreData4.A());
                                        String[] strArr = MessagesTable.a;
                                        brdu brduVar = new brdu();
                                        brduVar.ap("markMessageComplete");
                                        brduVar.U(100);
                                        brduVar.F(zF);
                                        if (zF) {
                                            brduVar.v(true);
                                            ekrw ekrwVarH7 = ekrgVar.h();
                                            ekrwVarH7.X(ekrzVar, "BugleFileTransfer");
                                            coqbVar4 = coqbVar5;
                                            ((ekrd) ((ekrd) ekrwVarH7).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "markMessageComplete", 956, "FileDownloadCompletedHandler.java")).H("New file transfer message is in focus: %b. In observable: %b", zF, zG);
                                        } else if (zG) {
                                            zG = true;
                                            brduVar.v(true);
                                            ekrw ekrwVarH72 = ekrgVar.h();
                                            ekrwVarH72.X(ekrzVar, "BugleFileTransfer");
                                            coqbVar4 = coqbVar5;
                                            ((ekrd) ((ekrd) ekrwVarH72).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "markMessageComplete", 956, "FileDownloadCompletedHandler.java")).H("New file transfer message is in focus: %b. In observable: %b", zF, zG);
                                        } else {
                                            coqbVar4 = coqbVar5;
                                        }
                                        ekrw ekrwVarH8 = ekrgVar.h();
                                        ekrwVarH8.X(ekrzVar, "BugleFileTransfer");
                                        ekrd ekrdVar8 = (ekrd) ekrwVarH8;
                                        ekrdVar8.X(ekrzVar2, messageCoreData4.C());
                                        ekrdVar8.X(cqnc.C, messageCoreData4.ax());
                                        ((ekrd) ekrdVar8.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "markMessageComplete", 964, "FileDownloadCompletedHandler.java")).q("Updated incoming file transfer message in Bugle DB");
                                        if (!brduVar.e(messageCoreData4.C())) {
                                            ekrw ekrwVarH9 = ekrgVar.h();
                                            ekrwVarH9.X(ekrzVar, "BugleFileTransfer");
                                            ekrd ekrdVar9 = (ekrd) ekrwVarH9;
                                            ekrdVar9.X(ekrzVar2, messageCoreData4.C());
                                            ekrdVar9.X(ekrzVar3, messageCoreData4.F());
                                            ekrdVar9.X(ekrzVar4, messageCoreData4.A());
                                            ((ekrd) ekrdVar9.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "executeUpdateMessagePartInTransaction", 736, "FileDownloadCompletedHandler.java")).q("Failed to mark message complete in Bugle db.");
                                            byeuVar.a(false);
                                        }
                                        coqb coqbVar6 = coqbVar4;
                                        MessageCoreData messageCoreDataO = ((baxe) coqbVar6.j.b()).o(messageCoreData4.A());
                                        if (messageCoreDataO == null || messageCoreDataO.C().equals(messageCoreData4.C())) {
                                            ekrw ekrwVarH10 = ekrgVar.h();
                                            ekrwVarH10.X(ekrzVar, "BugleFileTransfer");
                                            ((ekrd) ((ekrd) ekrwVarH10).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "updateLastMessageInConversationIfApplicable", 858, "FileDownloadCompletedHandler.java")).q("Updating last message in the conversation");
                                            ((baqi) coqbVar6.k.b()).f(messageCoreData4.A(), messageCoreData4.C(), Long.valueOf(messageCoreData4.o()), bvdk.UNARCHIVED, -1L, null);
                                            z = true;
                                            ((bxlc) coqbVar6.o.b()).e(messageCoreData4.A(), true);
                                        } else {
                                            z = true;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                })).booleanValue()) {
                                    ekrw ekrwVarI2 = coqb.a.i();
                                    ekrwVarI2.X(eksq.a, "BugleFileTransfer");
                                    ekrd ekrdVar5 = (ekrd) ekrwVarI2;
                                    ekrdVar5.X(cqnc.b, messageCoreData3.C());
                                    ekrdVar5.X(cqnc.f, messageCoreData3.F());
                                    ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "saveIncomingFileTransferInBugleDbWithFuture", 672, "FileDownloadCompletedHandler.java")).q("Failed to update message part in Bugle db.");
                                    return eijx.e(false);
                                }
                                ((cmxn) coqbVar3.v.b()).k(messageCoreData3.F().f(), new dzfh("ToFileDownloadedAndCommitted"), cmxm.TACHYGRAM_MESSAGE_ARRIVED);
                                ekrw ekrwVarH4 = coqb.a.h();
                                ekrwVarH4.X(eksq.a, "BugleFileTransfer");
                                ekrd ekrdVar6 = (ekrd) ekrwVarH4;
                                ekrdVar6.X(cqnc.b, messageCoreData3.C());
                                ekrdVar6.X(cqnc.f, messageCoreData3.F());
                                ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "saveIncomingFileTransferInBugleDbWithFuture", 680, "FileDownloadCompletedHandler.java")).q("Notifying bugle database message updated");
                                ((bxlc) coqbVar3.o.b()).l(messageCoreData3.A(), messageCoreData3.C(), new String[0]);
                                coor coorVar = coqbVar3.x;
                                coorVar.b(messageCoreData3, "Bugle.Download.Success.Attachment.Size.Bucket.Rcs");
                                coorVar.f(messageCoreData3, 4, new Consumer() { // from class: cooq
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj4) {
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                return eijx.e(true);
                            }
                        };
                        eosc eoscVar2 = coqbVar2.g;
                        eiju eijuVarH = eijuVarG.i(eoozVar3, eoscVar2).h(new ejvr() { // from class: copl
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                Boolean bool = (Boolean) obj3;
                                if (bool.booleanValue()) {
                                    Iterator it = ((Set) coqbVar2.u.b()).iterator();
                                    while (it.hasNext()) {
                                        ((baya) it.next()).c(messageCoreData2);
                                    }
                                }
                                return bool;
                            }
                        }, eoscVar2);
                        eooz eoozVar4 = new eooz() { // from class: copm
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                eiju eijuVarE;
                                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                final MessageCoreData messageCoreData3 = messageCoreData2;
                                if (!zBooleanValue) {
                                    ekrw ekrwVarI2 = coqb.a.i();
                                    ekrwVarI2.X(eksq.a, "BugleFileTransfer");
                                    ekrd ekrdVar5 = (ekrd) ekrwVarI2;
                                    ekrdVar5.X(cqnc.b, messageCoreData3.C());
                                    ekrdVar5.X(cqnc.f, messageCoreData3.F());
                                    ekrdVar5.X(cqnc.s, messageCoreData3.A());
                                    ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForSuccessfullyPersistedFile", 577, "FileDownloadCompletedHandler.java")).q("Failed to complete file transfer. Bugle db was not successfully updated.");
                                    return eijx.e(cbcw.m());
                                }
                                final coqb coqbVar3 = coqbVar2;
                                MessagePartCoreData messagePartCoreDataH2 = messageCoreData3.H();
                                if (messagePartCoreDataH2 == null) {
                                    ekrw ekrwVarJ = coqb.a.j();
                                    ekrwVarJ.X(eksq.a, "BugleFileTransfer");
                                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 767, "FileDownloadCompletedHandler.java")).q("Not refreshing notification. Message part not found");
                                    eijuVarE = eijx.e(null);
                                } else {
                                    boolean z = messageCoreData3.cF() && messagePartCoreDataH2.bc();
                                    boolean z2 = messagePartCoreDataH2.x() != null;
                                    if (crbf.c()) {
                                        z2 = z2 && !z;
                                    }
                                    ekrw ekrwVarH4 = coqb.a.h();
                                    ekrwVarH4.X(eksq.a, "BugleFileTransfer");
                                    ekrd ekrdVar6 = (ekrd) ekrwVarH4;
                                    ekrdVar6.X(cqnc.b, messageCoreData3.C());
                                    ekrdVar6.X(cqnc.f, messageCoreData3.F());
                                    ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 781, "FileDownloadCompletedHandler.java")).t("Notifying file transfer completed. shouldNotifySilently: %b", Boolean.valueOf(z2));
                                    eksp ekspVar = coqb.b;
                                    ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 782, "FileDownloadCompletedHandler.java")).q("Creating notification from FileDownloadCompletedHandler");
                                    if (z) {
                                        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "refreshStatefulNotifications", 789, "FileDownloadCompletedHandler.java")).q("Creating notification for emotify reaction");
                                        ((cgpi) coqbVar3.s.b()).b(messageCoreData3.A(), Duration.ofMillis(messageCoreData3.o()), false);
                                    } else {
                                        ((cgpi) coqbVar3.s.b()).c();
                                    }
                                    eijuVarE = eijx.e(null);
                                }
                                final Uri uri3 = uriB;
                                final Uri uri4 = uriA2;
                                Callable callable2 = new Callable() { // from class: copn
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        Uri uri5 = uri3;
                                        Uri uri6 = uri4;
                                        if (uri5.equals(uri6)) {
                                            ekrw ekrwVarH5 = coqb.a.h();
                                            ekrwVarH5.X(eksq.a, "BugleFileTransfer");
                                            ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "deleteTemporaryFile", 829, "FileDownloadCompletedHandler.java")).q("Skipping deleting temporary file. Temporary file and persisted file are the same");
                                        } else if (coqbVar3.e.getContentResolver().delete(uri5, null, null) != 1) {
                                            MessageCoreData messageCoreData4 = messageCoreData3;
                                            ekrw ekrwVarJ2 = coqb.a.j();
                                            ekrwVarJ2.X(eksq.a, "BugleFileTransfer");
                                            ekrd ekrdVar7 = (ekrd) ekrwVarJ2;
                                            ekrdVar7.X(cqnc.b, messageCoreData4.C());
                                            ekrdVar7.X(cqnc.f, messageCoreData4.F());
                                            ekrdVar7.X(cqnc.D, uri6.toString());
                                            ((ekrd) ekrdVar7.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "deleteTemporaryFile", 842, "FileDownloadCompletedHandler.java")).q("Failed to delete temporary file");
                                        }
                                        return null;
                                    }
                                };
                                eosc eoscVar3 = coqbVar3.g;
                                return eijx.m(eijuVarE, eijx.g(callable2, eoscVar3), coqbVar3.r.d(messageCoreData3.C(), elny.FILE_DOWNLOAD_COMPLETED_HANDLER).p(), coqbVar3.z.b(16).p()).a(new Callable() { // from class: copo
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ekrw ekrwVarH5 = coqb.a.h();
                                        ekrwVarH5.X(eksq.a, "BugleFileTransfer");
                                        ekrd ekrdVar7 = (ekrd) ekrwVarH5;
                                        ekrdVar7.X(cqnc.f, messageCoreData3.F());
                                        ((ekrd) ekrdVar7.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForSuccessfulBugleDbUpdate", 628, "FileDownloadCompletedHandler.java")).q("Successfully completed file transfer");
                                        return cbcw.i();
                                    }
                                }, eoscVar3);
                            }
                        };
                        eosc eoscVar3 = coqbVar2.f;
                        return eijuVarH.i(eoozVar4, eoscVar3).h(new ejvr() { // from class: copp
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                ekrg ekrgVar = coqb.a;
                                return new copd((cbcw) obj3, copyVar);
                            }
                        }, eoscVar3);
                    }
                };
                eosc eoscVar2 = coqbVar.f;
                return eijuVarI.i(eoozVar2, eoscVar2).h(new ejvr() { // from class: copi
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        coqa coqaVar = (coqa) obj2;
                        if (coqaVar.a().e()) {
                            MessageCoreData messageCoreData2 = messageCoreData;
                            coqb coqbVar2 = coqbVar;
                            if (((chvp) coqbVar2.l.b()).q()) {
                                cavx cavxVar = (cavx) cavz.a.createBuilder();
                                String str = messageCoreData2.F().b;
                                str.getClass();
                                cavxVar.copyOnWrite();
                                ((cavz) cavxVar.instance).c = str;
                                cavxVar.copyOnWrite();
                                ((cavz) cavxVar.instance).d = cavy.a(4);
                                Uri uriA = coqaVar.b().a();
                                if (uriA != null) {
                                    String string = uriA.toString();
                                    cavxVar.copyOnWrite();
                                    cavz cavzVar = (cavz) cavxVar.instance;
                                    string.getClass();
                                    cavzVar.b |= 16;
                                    cavzVar.i = string;
                                }
                                String str2 = strA;
                                if (str2 != null) {
                                    cavxVar.copyOnWrite();
                                    cavz cavzVar2 = (cavz) cavxVar.instance;
                                    cavzVar2.b |= 32;
                                    cavzVar2.j = str2;
                                }
                                cavz cavzVar3 = (cavz) cavxVar.build();
                                caxr caxrVar = new caxr();
                                caxrVar.d = messageCoreData2.F().f();
                                caxrVar.b = messageCoreData2.F().f();
                                return cbcw.j(ekgb.r(cbcu.g("rcs_to_telephony_sync", cavzVar3, caxrVar.a())));
                            }
                            if (coqbVar2.k()) {
                                coou coouVar = (coou) coow.a.createBuilder();
                                String strF = messageCoreData2.F().f();
                                coouVar.copyOnWrite();
                                ((coow) coouVar.instance).b = strF;
                                Uri uriA2 = coqaVar.b().a();
                                uriA2.getClass();
                                String string2 = uriA2.toString();
                                coouVar.copyOnWrite();
                                coow coowVar = (coow) coouVar.instance;
                                string2.getClass();
                                coowVar.c = string2;
                                coouVar.copyOnWrite();
                                ((coow) coouVar.instance).e = coov.a(3);
                                coow coowVar2 = (coow) coouVar.build();
                                caxr caxrVar2 = new caxr();
                                caxrVar2.d = messageCoreData2.F().f();
                                caxrVar2.b = messageCoreData2.F().f();
                                return cbcw.j(ekgb.r(coox.a(coowVar2, caxrVar2.a())));
                            }
                        }
                        return coqaVar.a();
                    }
                }, eoscVar2).f(FileNotFoundException.class, new eooz() { // from class: copj
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) throws NumberFormatException {
                        atbp atbpVarG = atbq.g();
                        atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_FILE_NOT_FOUND_WHILE_TRYING_TO_DECRYPT);
                        atbpVarG.e(BasePaymentResult.ERROR_REQUEST_FAILED);
                        atbq atbqVarA = atbpVarG.a();
                        coqb coqbVar2 = coqbVar;
                        final emwy emwyVarI = atbq.g().a().i(coqbVar2.y.a(atbqVarA));
                        elof elofVar = (elof) elpg.b.createBuilder();
                        enyw enywVarA = ((asrf) coqbVar2.w.b()).a();
                        elofVar.copyOnWrite();
                        elpg elpgVar = (elpg) elofVar.instance;
                        elpgVar.Y = enywVarA.h;
                        elpgVar.d |= 2097152;
                        elofVar.copyOnWrite();
                        elpg elpgVar2 = (elpg) elofVar.instance;
                        emwyVarI.getClass();
                        elpgVar2.ak = emwyVarI;
                        elpgVar2.e |= 4;
                        elpg elpgVar3 = (elpg) elofVar.build();
                        coqo coqoVar = (coqo) coqp.a.createBuilder();
                        coqd coqdVar3 = coqdVar2;
                        String str = coqdVar3.c;
                        coqoVar.copyOnWrite();
                        coqp coqpVar = (coqp) coqoVar.instance;
                        str.getClass();
                        coqpVar.b |= 1;
                        coqpVar.c = str;
                        coqoVar.copyOnWrite();
                        coqp coqpVar2 = (coqp) coqoVar.instance;
                        elpgVar3.getClass();
                        coqpVar2.e = elpgVar3;
                        coqpVar2.b |= 4;
                        String str2 = coqdVar3.d;
                        coqoVar.copyOnWrite();
                        coqp coqpVar3 = (coqp) coqoVar.instance;
                        str2.getClass();
                        coqpVar3.b |= 8;
                        coqpVar3.f = str2;
                        final coqp coqpVar4 = (coqp) coqoVar.build();
                        return ((coqq) coqbVar2.p.b()).a(coqpVar4).h(new ejvr() { // from class: copv
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                ekrw ekrwVarH3 = coqb.a.h();
                                ekrwVarH3.X(eksq.a, "BugleFileTransfer");
                                ekrd ekrdVar3 = (ekrd) ekrwVarH3;
                                ekrdVar3.X(cqnc.e, coqpVar4.c);
                                ekrd ekrdVar4 = (ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processFileDownloadForFileNotFound", 533, "FileDownloadCompletedHandler.java");
                                emwy emwyVar = emwyVarI;
                                int iB = emww.b(emwyVar.e);
                                if (iB == 0) {
                                    iB = 1;
                                }
                                emxa emxaVar = emwyVar.f;
                                if (emxaVar == null) {
                                    emxaVar = emxa.a;
                                }
                                ekrdVar4.C("File download failed with reason: %s and http response code: %s, queued work item to process failure.", emww.a(iB), emxaVar.c);
                                return cbcw.j(ekgb.r(cggg.c()));
                            }
                        }, coqbVar2.g);
                    }
                }, eoscVar2).e(IOException.class, new ejvr() { // from class: copk
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekrw ekrwVarJ = coqb.a.j();
                        ekrwVarJ.X(eksq.a, "BugleFileTransfer");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((IOException) obj2)).h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "completeIncomingFileTransferForValidMessage", 443, "FileDownloadCompletedHandler.java")).q("Unable to complete the incoming file transfer.");
                        return cbcw.k();
                    }
                }, eoscVar2);
            }
        };
        eosc eoscVar = this.f;
        eiju eijuVarI = eijuVarA.i(eoozVar, eoscVar);
        return ((Boolean) ((cczi) ateo.a.get()).e()).booleanValue() ? eijuVarI : eijuVarI.f(cond.class, new eooz() { // from class: copu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cond condVar = (cond) obj;
                ekrw ekrwVarJ = coqb.a.j();
                ekrwVarJ.X(eksq.a, "BugleFileTransfer");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(condVar);
                ekrdVar.X(cqnc.f, basdVarA);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processPendingWorkItemAsync", 302, "FileDownloadCompletedHandler.java")).q("Failed to complete file transfer.");
                return condVar.d().booleanValue() ? eijx.e(cbcw.m()) : eijx.e(cbcw.k());
            }
        }, eoscVar);
    }

    public final boolean k() {
        boolean z = ((aqzb) this.C.b()).a() && !((ctce) this.F.b()).b();
        return z;
    }
}
