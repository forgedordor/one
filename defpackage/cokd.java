package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cokd {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public static final cczi b = cdag.f(cdag.b, "min_file_upload_validity", 86400000);
    public final fcsu c;
    public final dqsn d;
    public final cogw e;
    private final eosc f;

    public cokd(eosc eoscVar, dqsn dqsnVar, fcsu fcsuVar, cogw cogwVar) {
        this.f = eoscVar;
        this.d = dqsnVar;
        this.c = fcsuVar;
        this.e = cogwVar;
    }

    public static ekgb d(final Instant instant, final int i, int i2, final Duration duration) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("updateMessagesForAutoResume");
        brduVar.X(new Function() { // from class: cojq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                eksp ekspVar = cokd.a;
                brecVar.ae(i);
                brecVar.ap(new dqty("messages.raw_status", 1, 10007));
                brecVar.R(instant.minus(duration).toEpochMilli());
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brduVar.U(i2);
        brduVar.O(instant.toEpochMilli());
        brduVar.B(0);
        Stream map = Collection.EL.stream(brduVar.b().b()).map(new Function() { // from class: cojr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessagesTable.BindData) obj).E();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i3 = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    public static Optional e(final MessageIdType messageIdType) {
        return (Optional) comb.e(messageIdType, new Function() { // from class: coka
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Optional.of((cokk) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: cokb
            @Override // java.util.function.Supplier
            public final Object get() {
                eksl ekslVar = (eksl) cokd.a.h();
                ekslVar.X(cqnc.b, messageIdType);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferBindData", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "FileTransferDatabaseOperations.java")).q("No file transfer bind data found.");
                return Optional.empty();
            }
        });
    }

    public final cokf a(MessageIdType messageIdType) {
        cojj cojjVar = new cojj();
        MessageCoreData messageCoreDataA = ((baxe) this.c.b()).A(messageIdType);
        if (messageCoreDataA != null) {
            cojjVar.c(messageCoreDataA);
            Optional optionalE = e(messageIdType);
            if (!optionalE.isEmpty()) {
                cojjVar.b((cokk) optionalE.get());
                return cojjVar.a();
            }
        }
        return cojjVar.a();
    }

    public final cokf b(String str, Optional optional) {
        cojj cojjVar = new cojj();
        Optional optionalF = f(str, optional);
        if (optionalF.isEmpty()) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(coie.a, str);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferMessageCoreData", 173, "FileTransferDatabaseOperations.java")).t("No FileTransferData entry found. %s", optional);
            return cojjVar.a();
        }
        cojjVar.b((cokk) optionalF.get());
        cokk cokkVar = (cokk) optionalF.get();
        MessageCoreData messageCoreDataW = ((baxe) this.c.b()).w(cokkVar.o());
        if (messageCoreDataW == null) {
            eksl ekslVar2 = (eksl) a.h();
            ekslVar2.X(cqnc.a, cokkVar.o().b());
            ekslVar2.X(coie.a, cokkVar.r());
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getMessageCoreData", 217, "FileTransferDatabaseOperations.java")).q("No MessageCoreData entry found.");
            messageCoreDataW = null;
        } else {
            eksl ekslVar3 = (eksl) a.h();
            ekslVar3.X(cqnc.a, messageCoreDataW.C().b());
            ekslVar3.X(coie.a, cokkVar.r());
            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getMessageCoreData", 225, "FileTransferDatabaseOperations.java")).q("MessageCoreData entry found.");
        }
        if (messageCoreDataW != null) {
            cojjVar.c(messageCoreDataW);
            return cojjVar.a();
        }
        eksl ekslVar4 = (eksl) a.h();
        ekslVar4.X(coie.a, str);
        ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferMessageCoreData", 183, "FileTransferDatabaseOperations.java")).q("MessageCoreData null.");
        return cojjVar.a();
    }

    public final eiju c(final String str, final Optional optional) {
        return eijx.g(new Callable() { // from class: cojp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b(str, optional);
            }
        }, this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional f(String str, Optional optional) {
        String[] strArr = comb.a;
        final coma comaVar = new coma();
        comaVar.c(str);
        optional.ifPresent(new Consumer() { // from class: coju
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                comaVar.d((comc) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        colw colwVarB = comb.b();
        colwVarB.A("+getFileTransferBindData-file_transfer1");
        colwVarB.d(comaVar);
        ekgb ekgbVarZ = colwVarB.b().z();
        if (ekgbVarZ.size() == 1) {
            return Optional.of((cokk) ekgbVarZ.get(0));
        }
        if (ekgbVarZ.isEmpty()) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(coie.a, str);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferBindData", 132, "FileTransferDatabaseOperations.java")).q("No FileTransferData entry found.");
        } else {
            cols colsVar = new cols();
            colsVar.f("getFileTransferBindData");
            colsVar.a(comaVar);
            boolean z = colsVar.d() > 0;
            eksl ekslVar2 = (eksl) a.j();
            ekslVar2.X(coie.a, str);
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferBindData", 147, "FileTransferDatabaseOperations.java")).t("Duplicate transfer id found. FileTransferData entries deleted: %b", Boolean.valueOf(z));
        }
        return Optional.empty();
    }

    public final Optional g(MessageIdType messageIdType) {
        return e(messageIdType).map(new Function() { // from class: cojv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cokk) obj).n();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final List h(String str, comc comcVar) {
        eieu eieuVarK = eiiy.k("FileTransferDatabaseOperations#getFileTransferEntries");
        try {
            colw colwVarB = comb.b();
            colwVarB.A("getFileTransferEntries");
            coma comaVar = new coma();
            comaVar.c(str);
            comaVar.d(comcVar);
            colwVarB.k(new colz(comaVar));
            ekgb ekgbVarZ = colwVarB.b().z();
            eieuVarK.close();
            return ekgbVarZ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean i(MessageIdType messageIdType, String str) {
        String[] strArr = comb.a;
        coma comaVar = new coma();
        comaVar.c(str);
        comaVar.d(comc.UPLOAD);
        comaVar.ap(new dqpj("file_transfer.message_id", 2, Long.valueOf(bary.a(messageIdType))));
        cols colsVar = new cols();
        colsVar.f("deleteFileUploadDuplicateTransferId");
        colsVar.a(comaVar);
        return colsVar.d() > 0;
    }

    public final boolean j(MessageIdType messageIdType) {
        String[] strArr = comb.a;
        coma comaVar = new coma();
        comaVar.b(messageIdType);
        cols colsVar = new cols();
        colsVar.f("deleteFileUploadResponse");
        colsVar.a(comaVar);
        return colsVar.d() > 0;
    }

    public final boolean k(MessageIdType messageIdType) {
        return g(messageIdType).filter(new Predicate() { // from class: cojs
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                aucl auclVar = (aucl) obj;
                if (auclVar == null || aucl.a.equals(auclVar)) {
                    ((eksl) ((eksl) cokd.a.j()).h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "isFileUploadResponseValid", 280, "FileTransferDatabaseOperations.java")).q("FileUploadResponse is not valid because it is null");
                    return false;
                }
                cogw cogwVar = this.a.e;
                Instant instantF = cogwVar.f();
                aucj aucjVar = auclVar.c;
                if (aucjVar == null) {
                    aucjVar = aucj.a;
                }
                evvp evvpVar = aucjVar.g;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                boolean z = Duration.ofMillis(((Long) cokd.b.e()).longValue()).compareTo(Duration.between(instantF, evwz.d(evvpVar))) <= 0;
                if (!z) {
                    eksl ekslVar = (eksl) ((eksl) cokd.a.j()).h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "isFileUploadResponseValid", 291, "FileTransferDatabaseOperations.java");
                    Instant instantF2 = cogwVar.f();
                    aucj aucjVar2 = auclVar.c;
                    if (aucjVar2 == null) {
                        aucjVar2 = aucj.a;
                    }
                    evvp evvpVar2 = aucjVar2.g;
                    if (evvpVar2 == null) {
                        evvpVar2 = evvp.a;
                    }
                    ekslVar.D("FileUploadResponse timestamp is not valid. Current time: %s. File was valid until %s.", instantF2, evwz.d(evvpVar2));
                }
                return z;
            }
        }).isPresent();
    }

    public final boolean l(final String str, final comc comcVar, String str2) {
        eieu eieuVarK = eiiy.k("FileTransferDatabaseOperations#updateFileTransferEntryWithTransferHandle");
        try {
            String[] strArr = comb.a;
            coly colyVar = new coly();
            colyVar.ap("updateFileTransferEntryWithTransferHandle");
            colyVar.f(new Function() { // from class: cojt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    coma comaVar = (coma) obj;
                    eksp ekspVar = cokd.a;
                    comaVar.c(str);
                    comaVar.d(comcVar);
                    return comaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            colyVar.e(str2);
            boolean z = colyVar.b().e() == 1;
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean m(MessageIdType messageIdType, String str, comc comcVar, aucj aucjVar) {
        eieu eieuVarK = eiiy.k("FileTransferDatabaseOperations#upsertFileTransferEntry");
        try {
            String[] strArr = comb.a;
            cokn coknVar = new cokn();
            coknVar.c(messageIdType);
            coknVar.e(str);
            coknVar.f(comcVar);
            coknVar.b(aucjVar);
            cokk cokkVarA = coknVar.a();
            coma comaVar = new coma();
            comaVar.b(messageIdType);
            boolean zS = cokkVarA.s(new colz(comaVar));
            eieuVarK.close();
            return zS;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean n(MessageIdType messageIdType, String str, comc comcVar, aucj aucjVar, byte[] bArr) {
        eieu eieuVarK = eiiy.k("FileTransferDatabaseOperations#upsertFileTransferEntryWithOpaqueData");
        try {
            String[] strArr = comb.a;
            cokn coknVar = new cokn();
            coknVar.c(messageIdType);
            coknVar.e(str);
            coknVar.f(comcVar);
            coknVar.b(aucjVar);
            coknVar.d(bArr);
            cokk cokkVarA = coknVar.a();
            coma comaVar = new coma();
            comaVar.b(messageIdType);
            boolean zS = cokkVarA.s(new colz(comaVar));
            eieuVarK.close();
            return zS;
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
