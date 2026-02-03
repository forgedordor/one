package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.CancellationException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coum implements coun {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final dqsn b;
    public final fcsu c;
    public final ayrm d;
    public final coyz e;
    public final axzc f;
    public final cogw g;
    private final eosc h;
    private final aypt i;

    public coum(dqsn dqsnVar, eosc eoscVar, fcsu fcsuVar, ayrm ayrmVar, aypt ayptVar, coyz coyzVar, axzc axzcVar, cogw cogwVar) {
        this.h = eoscVar;
        this.b = dqsnVar;
        this.c = fcsuVar;
        this.d = ayrmVar;
        this.i = ayptVar;
        this.e = coyzVar;
        this.f = axzcVar;
        this.g = cogwVar;
    }

    @Override // defpackage.coun
    public final eiju a(final coxh coxhVar, Optional optional) {
        final Optional map = optional.map(new Function() { // from class: coui
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = coum.a;
                emxb emxbVar = (emxb) emxe.a.createBuilder();
                emxbVar.copyOnWrite();
                emxe emxeVar = (emxe) emxbVar.instance;
                emxeVar.c = 1;
                emxeVar.b |= 1;
                return ((atbq) obj).j(1, (emxe) emxbVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.e, ((coug) coxhVar).a.toString());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadSucceeded", 97, "FileUploadCallbackHandler.java")).q("Upload succeeded callback is called.");
        return eijx.h(new eooy() { // from class: couj
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final coum coumVar = this.a;
                final coxh coxhVar2 = coxhVar;
                Optional optional2 = (Optional) coumVar.b.c("FileUploadCallbackHandler#onUploadSucceeded", new ejxr() { // from class: couk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        fcsu fcsuVar = coumVar.c;
                        baxe baxeVar = (baxe) fcsuVar.b();
                        coug cougVar = (coug) coxhVar2;
                        basd basdVar = cougVar.a;
                        final Optional optionalOfNullable = Optional.ofNullable(baxeVar.x(basdVar));
                        if (optionalOfNullable.isEmpty()) {
                            eksl ekslVar2 = (eksl) coum.a.j();
                            ekslVar2.X(cqnc.f, basdVar);
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "verifyMessageWithAttachment", 230, "FileUploadCallbackHandler.java")).q("Upload callback is called, however message was already deleted from the DB. Ignoring.");
                        } else {
                            comb.a(((MessageCoreData) optionalOfNullable.get()).C()).getClass();
                        }
                        if (optionalOfNullable.isEmpty()) {
                            return Optional.empty();
                        }
                        String[] strArr = comb.a;
                        coly colyVar = new coly();
                        colyVar.ap("updateFileTransferTable");
                        colyVar.f(new Function() { // from class: coul
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                coma comaVar = (coma) obj;
                                eksp ekspVar = coum.a;
                                comaVar.b(((MessageCoreData) optionalOfNullable.get()).C());
                                return comaVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        colyVar.c(cougVar.d);
                        colyVar.b().e();
                        if (((MessageCoreData) optionalOfNullable.get()).k() == 12) {
                            return optionalOfNullable;
                        }
                        ((MessageCoreData) optionalOfNullable.get()).bU(4);
                        ((baxe) fcsuVar.b()).U((MessageCoreData) optionalOfNullable.get());
                        return optionalOfNullable;
                    }
                });
                if (optional2.isEmpty()) {
                    ((eksl) ((eksl) coum.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadSucceeded", 106, "FileUploadCallbackHandler.java")).q("Message not found, not starting sendMessageAction.");
                    return eijx.e(null);
                }
                MessageCoreData messageCoreData = (MessageCoreData) optional2.get();
                coug cougVar = (coug) coxhVar2;
                aucl auclVar = cougVar.d;
                aucj aucjVar = auclVar.c;
                if (aucjVar == null) {
                    aucjVar = aucj.a;
                }
                String str = aucjVar.c;
                efil efilVarD = ContentType.d();
                aubx aubxVar = aucjVar.e;
                if (aubxVar == null) {
                    aubxVar = aubx.a;
                }
                efilVarD.f(aubxVar.c);
                aubx aubxVar2 = aucjVar.e;
                if (aubxVar2 == null) {
                    aubxVar2 = aubx.a;
                }
                efilVarD.e(aubxVar2.d);
                String string = efilVarD.g().toString();
                if (!messageCoreData.cB() && !bvug.a(str, string)) {
                    String str2 = (String) cougVar.b.orElse(null);
                    Optional optional3 = cougVar.c;
                    MessageCoreData messageCoreDataA = coumVar.f.a(cougVar.a, str2, optional3.isPresent() ? ((Instant) optional3.get()).toEpochMilli() : coumVar.g.f().toEpochMilli() + ((Long) clep.b.e()).longValue());
                    if (messageCoreDataA != null) {
                        messageCoreData = messageCoreDataA;
                    }
                }
                coyz coyzVar = coumVar.e;
                MessageCoreData messageCoreData2 = (MessageCoreData) optional2.get();
                aucj aucjVar2 = auclVar.c;
                if (aucjVar2 == null) {
                    aucjVar2 = aucj.a;
                }
                coyzVar.d(messageCoreData2, map, aucjVar2);
                if (messageCoreData.k() == 12) {
                    return eijx.e(null);
                }
                Action actionE = coumVar.d.e(messageCoreData, 2);
                if (actionE == null) {
                    eksl ekslVar2 = (eksl) coum.a.j();
                    ekslVar2.X(cqnc.b, messageCoreData.C());
                    ekslVar2.X(cqnc.e, messageCoreData.F().toString());
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "startSendMessageAction", 258, "FileUploadCallbackHandler.java")).q("Failed to create action.");
                    return eijx.e(null);
                }
                eksl ekslVar3 = (eksl) coum.a.h();
                ekslVar3.X(cqnc.b, messageCoreData.C());
                ekslVar3.X(cqnc.e, messageCoreData.F().toString());
                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "startSendMessageAction", 266, "FileUploadCallbackHandler.java")).q("Invoking SendMessageAction to send file transfer message.");
                return actionE.p();
            }
        }, this.h);
    }

    @Override // defpackage.coun
    public final eiju b(String str, atbq atbqVar, int i) {
        atbd atbdVar = (atbd) atbqVar;
        Optional optional = atbdVar.e;
        int i2 = 11;
        if (optional.isPresent() && (optional.get() instanceof CancellationException)) {
            i2 = 5;
        }
        eksp ekspVar = a;
        eksl ekslVar = (eksl) ekspVar.h();
        ekrz ekrzVar = cqnc.e;
        ekslVar.X(ekrzVar, str);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadFailed", 161, "FileUploadCallbackHandler.java")).q("Upload failed callback is called.");
        FileTransferEvent fileTransferEvent = new FileTransferEvent(20013, 0L, i2, str);
        ProcessFileTransferAction processFileTransferActionB = ((axwy) this.i).b(fileTransferEvent);
        aymo aymoVar = processFileTransferActionB.v;
        emxb emxbVar = (emxb) emxe.a.createBuilder();
        emxbVar.copyOnWrite();
        emxe emxeVar = (emxe) emxbVar.instance;
        emxeVar.c = 1;
        emxeVar.b = 1 | emxeVar.b;
        aymoVar.t("key_failed_file_transfer_diagnostics", new ProtoParsers.InternalDontUse(null, atbqVar.j(i, (emxe) emxbVar.build())));
        emwq emwqVar = (emwq) emws.a.createBuilder();
        String str2 = atbdVar.d;
        emwqVar.copyOnWrite();
        emws emwsVar = (emws) emwqVar.instance;
        str2.getClass();
        emwsVar.b |= 8;
        emwsVar.f = str2;
        aymoVar.t("key_failed_file_transfer_details", new ProtoParsers.InternalDontUse(null, (emws) emwqVar.build()));
        eksl ekslVar2 = (eksl) ekspVar.h();
        ekslVar2.X(ekrzVar, str);
        ekslVar2.X(coie.g, fileTransferEvent);
        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadFailed", 192, "FileUploadCallbackHandler.java")).q("Invoking ProcessFileTransferAction.");
        return processFileTransferActionB.p();
    }
}
