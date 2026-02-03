package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class conq {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final eosc b;
    public final fcsu c;
    private final eosc d;
    private final fcsu e;

    public conq(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = eoscVar;
        this.d = eoscVar2;
        this.e = fcsuVar;
        this.c = fcsuVar2;
    }

    public static conh a(FileInformation fileInformation, evqs evqsVar, String str, Optional optional) {
        comn comnVar = new comn();
        final cone coneVar = (cone) conh.a.createBuilder();
        String strI = fileInformation.i();
        coneVar.copyOnWrite();
        conh conhVar = (conh) coneVar.instance;
        conhVar.b |= 2;
        conhVar.d = strI;
        coneVar.copyOnWrite();
        conh conhVar2 = (conh) coneVar.instance;
        str.getClass();
        conhVar2.b |= 8;
        conhVar2.f = str;
        int iA = fileInformation.a();
        coneVar.copyOnWrite();
        conh conhVar3 = (conh) coneVar.instance;
        conhVar3.b |= 32;
        conhVar3.h = iA;
        coneVar.copyOnWrite();
        conh conhVar4 = (conh) coneVar.instance;
        conhVar4.b |= 16;
        conhVar4.g = evqsVar;
        fileInformation.h().ifPresent(new Consumer() { // from class: conl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cone coneVar2 = coneVar;
                String str2 = (String) obj;
                coneVar2.copyOnWrite();
                conh conhVar5 = (conh) coneVar2.instance;
                conh conhVar6 = conh.a;
                str2.getClass();
                conhVar5.b |= 4;
                conhVar5.e = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional.ifPresent(new Consumer() { // from class: conm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cone coneVar2 = coneVar;
                String str2 = (String) obj;
                coneVar2.copyOnWrite();
                conh conhVar5 = (conh) coneVar2.instance;
                conh conhVar6 = conh.a;
                str2.getClass();
                conhVar5.b |= 64;
                conhVar5.i = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cong congVar = (cong) comnVar.fM((efis) fileInformation.g().orElse(efis.FILE));
        coneVar.copyOnWrite();
        conh conhVar5 = (conh) coneVar.instance;
        conhVar5.c = congVar.c;
        conhVar5.b |= 1;
        return (conh) coneVar.build();
    }

    public final eiju b(final MessageIdType messageIdType, final String str, final FileInformation fileInformation, final evqs evqsVar) throws Throwable {
        final conh conhVarA = a(fileInformation, evqsVar, str, Optional.empty());
        eieu eieuVarK = eiiy.k("FileDownloadWorker::scheduleAsync");
        try {
            try {
                eiju eijuVarH = eijx.h(new eooy() { // from class: conp
                    @Override // defpackage.eooy
                    public final ListenableFuture a() throws cond {
                        FileInformation fileInformation2 = fileInformation;
                        Optional optionalG = fileInformation2.g();
                        final efis efisVar = efis.FILE;
                        efisVar.getClass();
                        boolean zIsPresent = optionalG.filter(new Predicate() { // from class: conn
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
                                return efisVar.equals((efis) obj);
                            }
                        }).isPresent();
                        conq conqVar = this.a;
                        if (zIsPresent) {
                            evqs evqsVar2 = evqsVar;
                            String str2 = str;
                            MessageIdType messageIdType2 = messageIdType;
                            if (!((cokd) conqVar.c.b()).n(messageIdType2, str2, comc.DOWNLOAD, (aucj) new atam().fH().fM(fileInformation2), evqsVar2.I())) {
                                eksl ekslVar = (eksl) conq.a.i();
                                ekslVar.X(cqnc.b, messageIdType2);
                                ekslVar.X(coie.a, str2);
                                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "insertFileTransferDatabaseEntry", 193, "FileDownloadWorker.java")).q("Failed to insert OR update file transfer entry in database.");
                                throw new cond(false, coid.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_INSERT_OR_UPDATE_FILE_TRANSFER_ENTRY_IN_DB, String.format("Failed to insert OR update file transfer entry in database for message %s with transfer id %s", messageIdType2, str2));
                            }
                        }
                        return conqVar.c(conhVarA);
                    }
                }, this.b);
                eieuVarK.b(eijuVarH);
                eieuVarK.close();
                return eijuVarH;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    eieuVarK.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final eiju c(final conh conhVar) {
        final String str = conhVar.f;
        caxr caxrVar = new caxr();
        caxrVar.d = str;
        caxrVar.b = str;
        return ((cazj) ((atei) this.e.b()).a.b()).b(cbcu.g("file_download", conhVar, caxrVar.a())).i(new eooz() { // from class: coni
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cazi) obj).b();
            }
        }, this.d).h(new ejvr() { // from class: conj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = conq.a;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str2 = str;
                conh conhVar2 = conhVar;
                if (zBooleanValue) {
                    eksl ekslVar = (eksl) conq.a.h();
                    ekslVar.X(coie.a, str2);
                    eksl ekslVar2 = (eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "queueFileDownloadAsync", 233, "FileDownloadWorker.java");
                    cong congVarB = cong.b(conhVar2.c);
                    if (congVarB == null) {
                        congVarB = cong.FILE;
                    }
                    ekslVar2.t("Download is queued for %s.", congVarB.name());
                    return str2;
                }
                eksl ekslVar3 = (eksl) conq.a.j();
                ekslVar3.X(coie.a, str2);
                eksl ekslVar4 = (eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/downloads/FileDownloadWorker", "queueFileDownloadAsync", 225, "FileDownloadWorker.java");
                cong congVarB2 = cong.b(conhVar2.c);
                if (congVarB2 == null) {
                    congVarB2 = cong.FILE;
                }
                ekslVar4.t("Download not queued for %s.", congVarB2.name());
                return str2;
            }
        }, this.b);
    }
}
