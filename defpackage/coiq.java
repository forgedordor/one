package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coiq implements coir {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final dqsn b;
    public final coml c;
    private final eosc d;
    private final eosc e;
    private final ConcurrentMap f;

    public coiq(dqsn dqsnVar, coml comlVar, eosc eoscVar, eosc eoscVar2, ConcurrentMap concurrentMap) {
        this.b = dqsnVar;
        this.c = comlVar;
        this.d = eoscVar;
        this.e = eoscVar2;
        this.f = concurrentMap;
    }

    @Override // defpackage.coir
    public final eiju a(atir atirVar, coik coikVar) {
        String str = atirVar.a;
        if (str != null) {
            return b(str, coikVar);
        }
        athh athhVar = atirVar.b;
        athhVar.getClass();
        athf athfVar = (athf) this.f.get(athhVar);
        if (athfVar == null) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.X(coie.j, athhVar);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "FileTransferProgressCallbackHandler.java")).q("Upload progress update is called but the file transfer entry is not present in the inProgressFileTransferMap.");
            return eijx.e(null);
        }
        MessageCoreData messageCoreDataA = athfVar.b.a();
        if (messageCoreDataA == null) {
            eksl ekslVar2 = (eksl) a.j();
            ekslVar2.X(coie.j, athhVar);
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", 111, "FileTransferProgressCallbackHandler.java")).q("Upload progress update is called but the pipeline context has no MessageCoreData.");
            return eijx.e(null);
        }
        MessageIdType messageIdTypeC = messageCoreDataA.C();
        ekrw ekrwVarO = a.o();
        ekrwVarO.X(coie.j, athhVar);
        ekrwVarO.X(cqnc.b, messageIdTypeC);
        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", 121, "FileTransferProgressCallbackHandler.java")).q("Transfer progress is being updated.");
        return this.c.a(messageIdTypeC, coikVar);
    }

    @Override // defpackage.coir
    public final eiju b(final String str, final coik coikVar) {
        return eijx.g(new Callable() { // from class: coip
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final String str2 = str;
                return (MessageIdType) this.a.b.c("FileTransferProgressCallbackHandler#readMessageIdForFileTransferFromBugleDatabase", new ejxr() { // from class: coim
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejxr
                    public final Object get() {
                        eksp ekspVar = coiq.a;
                        colw colwVarB = comb.b();
                        colwVarB.A("readMessageIdForFileTransferFromBugleDatabase");
                        final String str3 = str2;
                        colwVarB.e(new Function() { // from class: coin
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                coma comaVar = (coma) obj;
                                eksp ekspVar2 = coiq.a;
                                comaVar.c(str3);
                                return comaVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        colh colhVar = (colh) colwVarB.b().q(comb.c.a);
                        try {
                            ekgb ekgbVarC = colhVar.c();
                            colhVar.close();
                            if (ekgbVarC.isEmpty()) {
                                eksl ekslVar = (eksl) coiq.a.j();
                                ekslVar.X(coie.a, str3);
                                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "readMessageIdForFileTransferFromBugleDatabase", 145, "FileTransferProgressCallbackHandler.java")).q("Transfer progress update is called but the file transfer entry is not present in database.");
                                return bary.a;
                            }
                            MessageIdType messageIdType = (MessageIdType) ekgbVarC.get(0);
                            if (((ekoe) ekgbVarC).c <= 1) {
                                return messageIdType;
                            }
                            eksl ekslVar2 = (eksl) coiq.a.j();
                            ekslVar2.X(coie.a, str3);
                            ekslVar2.X(cqnc.b, messageIdType);
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "readMessageIdForFileTransferFromBugleDatabase", 157, "FileTransferProgressCallbackHandler.java")).q("There are multiple entries for a single file transferId of a message.");
                            return messageIdType;
                        } catch (Throwable th) {
                            try {
                                colhVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                });
            }
        }, this.e).i(new eooz() { // from class: coio
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                MessageIdType messageIdType = (MessageIdType) obj;
                if (messageIdType.c()) {
                    return eijx.e(null);
                }
                coik coikVar2 = coikVar;
                String str2 = str;
                coiq coiqVar = this.a;
                ekrw ekrwVarO = coiq.a.o();
                ekrwVarO.X(coie.a, str2);
                ekrwVarO.X(cqnc.b, messageIdType);
                ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", 78, "FileTransferProgressCallbackHandler.java")).q("Transfer progress is being updated.");
                return coiqVar.c.a(messageIdType, coikVar2);
            }
        }, this.d);
    }
}
