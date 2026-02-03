package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atkz implements atjz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl");
    private final fdjx b;
    private final fcyh c;
    private final cokd d;
    private final atna e;
    private final aqzv f;
    private final aqza g;
    private final aqzj h;

    public atkz(fdjx fdjxVar, fcyh fcyhVar, fdjx fdjxVar2, cokd cokdVar, atna atnaVar, aqzv aqzvVar, aqza aqzaVar, aqzj aqzjVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fdjxVar2.getClass();
        cokdVar.getClass();
        aqzvVar.getClass();
        this.b = fdjxVar;
        this.c = fcyhVar;
        this.d = cokdVar;
        this.e = atnaVar;
        this.f = aqzvVar;
        this.g = aqzaVar;
        this.h = aqzjVar;
    }

    private final boolean y() {
        return this.f.a() || this.g.a();
    }

    @Override // defpackage.atjz
    public final atjx a(atir atirVar) {
        atirVar.getClass();
        String str = atirVar.a;
        if (str != null) {
            Optional optionalF = this.d.f(str, Optional.of(comc.UPLOAD));
            if (!optionalF.isPresent()) {
                atbp atbpVarG = atbq.g();
                atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB);
                return new atju(atbpVarG.a());
            }
            aucj aucjVarM = ((cokk) optionalF.get()).m();
            if (aucjVarM != null && !aucjVarM.equals(aucj.a)) {
                return new atjt(aucjVarM);
            }
            atbp atbpVarG2 = atbq.g();
            atbpVarG2.f(coid.FILE_TRANSFER_FAILURE_REASON_MISSING_THUMBNAIL);
            return new atju(atbpVarG2.a());
        }
        athh athhVar = atirVar.b;
        if (athhVar == null) {
            throw new IllegalStateException("Processing id and upload id are null in getThumbnailInformation.");
        }
        atlg atlgVarB = atkj.b(atkj.a(athhVar), atmy.b);
        if (atlgVarB == null) {
            coid coidVar = ((eoth) ((aqww) this.h).a.b()).a("bugle.dont_fail_upload_resume_if_thumbnail_db_entry_is_missing") ? coid.FILE_TRANSFER_FAILURE_REASON_MISSING_THUMBNAIL : coid.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB;
            atbp atbpVarG3 = atbq.g();
            atbpVarG3.f(coidVar);
            return new atju(atbpVarG3.a());
        }
        if (atlgVarB.l() == null) {
            atbp atbpVarG4 = atbq.g();
            atbpVarG4.f(coid.FILE_TRANSFER_FAILURE_REASON_MISSING_THUMBNAIL);
            return new atju(atbpVarG4.a());
        }
        aucj aucjVarL = atlgVarB.l();
        aucjVarL.getClass();
        return new atjt(aucjVarL);
    }

    @Override // defpackage.atjz
    public final aucl b(athh athhVar) {
        List listA = atkj.a(athhVar);
        if (listA.isEmpty()) {
            return null;
        }
        atlg atlgVarB = atkj.b(listA, atmy.a);
        aucj aucjVarL = atlgVarB != null ? atlgVarB.l() : null;
        if (aucjVarL == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleFileTransfer");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(coie.j, athhVar);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "getHttpRequestResult", 114, "FileProcessingDatabaseOperationsImpl.kt")).q("No file information found in database.");
            return null;
        }
        auck auckVar = (auck) aucl.a.createBuilder();
        auckVar.getClass();
        auckVar.copyOnWrite();
        aucl auclVar = (aucl) auckVar.instance;
        auclVar.c = aucjVarL;
        auclVar.b |= 1;
        evsn evsnVarBuild = auckVar.build();
        evsnVarBuild.getClass();
        aucl auclVar2 = (aucl) evsnVarBuild;
        atlg atlgVarB2 = atkj.b(listA, atmy.b);
        aucj aucjVarL2 = atlgVarB2 != null ? atlgVarB2.l() : null;
        if (aucjVarL2 != null) {
            auck auckVar2 = (auck) auclVar2.toBuilder();
            auckVar2.copyOnWrite();
            aucl auclVar3 = (aucl) auckVar2.instance;
            auclVar3.d = aucjVarL2;
            auclVar3.b |= 2;
            evsn evsnVarBuild2 = auckVar2.build();
            evsnVarBuild2.getClass();
            auclVar2 = (aucl) evsnVarBuild2;
        }
        if (this.e.a(auclVar2)) {
            return auclVar2;
        }
        ekrw ekrwVarJ2 = a.j();
        ekrwVarJ2.X(eksq.a, "BugleFileTransfer");
        ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
        ekrdVar2.X(coie.j, athhVar);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "getHttpRequestResult", 131, "FileProcessingDatabaseOperationsImpl.kt")).q("File upload response in database is invalid.");
        return null;
    }

    @Override // defpackage.atjz
    public final aucl c(MessageIdType messageIdType) {
        messageIdType.getClass();
        Optional optionalG = this.d.g(messageIdType);
        optionalG.getClass();
        return (aucl) fdct.b(optionalG);
    }

    @Override // defpackage.atjz
    public final cbtf d(athh athhVar) {
        return atkj.c(athhVar, atmy.a);
    }

    @Override // defpackage.atjz
    public final cbtf e(athh athhVar) {
        return atkj.c(athhVar, atmy.b);
    }

    @Override // defpackage.atjz
    public final eyfn f(athh athhVar) {
        return atkj.d(athhVar, atmy.a);
    }

    @Override // defpackage.atjz
    public final eyfn g(athh athhVar) {
        return atkj.d(athhVar, atmy.b);
    }

    @Override // defpackage.atjz
    public final Object h(athh athhVar, boolean z, fcxy fcxyVar) {
        Object objA = fdin.a(this.c, new atkm(athhVar, z, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.atjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.athh r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.atko
            if (r0 == 0) goto L13
            r0 = r8
            atko r0 = (defpackage.atko) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            atko r0 = new atko
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            athh r7 = r0.d
            defpackage.fctl.b(r8)
            goto L4e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
            fdjx r8 = r6.b
            fcyh r8 = r8.hE()
            fcyh r8 = defpackage.eicg.a(r8)
            atkn r2 = new atkn
            r4 = 0
            r2.<init>(r4, r7)
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 == r1) goto La6
        L4e:
            ekgb r8 = (defpackage.ekgb) r8
            int r0 = r8.size()
            java.lang.String r1 = "deleteProcessingPipelineArtifacts"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl"
            java.lang.String r3 = "BugleFileTransfer"
            java.lang.String r4 = "FileProcessingDatabaseOperationsImpl.kt"
            if (r0 != 0) goto L80
            ekrg r8 = defpackage.atkz.a
            ekrw r8 = r8.e()
            ekrz r0 = defpackage.eksq.a
            r8.X(r0, r3)
            ekrd r8 = (defpackage.ekrd) r8
            ekrz r0 = defpackage.coie.j
            r8.X(r0, r7)
            r7 = 420(0x1a4, float:5.89E-43)
            ekrw r7 = r8.h(r2, r1, r7, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "No file processing table entries to delete or failure encoutered."
            r7.q(r8)
            fctx r7 = defpackage.fctx.a
            return r7
        L80:
            ekrg r0 = defpackage.atkz.a
            ekrw r0 = r0.e()
            ekrz r5 = defpackage.eksq.a
            r0.X(r5, r3)
            ekrd r0 = (defpackage.ekrd) r0
            ekrz r3 = defpackage.coie.j
            r0.X(r3, r7)
            r7 = 426(0x1aa, float:5.97E-43)
            ekrw r7 = r0.h(r2, r1, r7, r4)
            ekrd r7 = (defpackage.ekrd) r7
            int r8 = r8.size()
            java.lang.String r0 = "Deleted %d file processing table entries."
            r7.r(r0, r8)
            fctx r7 = defpackage.fctx.a
            return r7
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atkz.i(athh, fcxy):java.lang.Object");
    }

    @Override // defpackage.atjz
    public final Object j(athh athhVar, fcxy fcxyVar) {
        String strO;
        atlg atlgVarB = atkj.b(atkj.a(athhVar), atmy.a);
        if (atlgVarB == null || (strO = atlgVarB.o()) == null) {
            return null;
        }
        return new atjy(new atis(strO), atlgVarB.d(), atlgVarB.k());
    }

    @Override // defpackage.atjz
    public final Object k(athh athhVar, Uri uri, aubx aubxVar, fcxy fcxyVar) {
        Object objA = fdin.a(this.c, new atkr(uri, aubxVar, athhVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object l(athh athhVar, cbtf cbtfVar, fcxy fcxyVar) {
        Object objA = fdin.a(this.c, new atkt(this, athhVar, cbtfVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object m(athh athhVar, eyfn eyfnVar, fcxy fcxyVar) {
        Object objA = fdin.a(this.c, new atks(this, athhVar, eyfnVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object n(athh athhVar, aucl auclVar, fcxy fcxyVar) {
        Object objA = fdin.a(this.c, new atku(auclVar, this, athhVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object o(athh athhVar, Uri uri, aubx aubxVar, fcxy fcxyVar) {
        Object objA = fdin.a(this.c, new atkw(uri, aubxVar, athhVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object p(athh athhVar, cbtf cbtfVar, fcxy fcxyVar) {
        Object objA = fdin.a(this.c, new atky(this, athhVar, cbtfVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object q(athh athhVar, eyfn eyfnVar, fcxy fcxyVar) {
        Object objA = fdin.a(this.c, new atkx(this, athhVar, eyfnVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.atjz
    public final boolean r(MessageIdType messageIdType) {
        messageIdType.getClass();
        return this.d.k(messageIdType);
    }

    @Override // defpackage.atjz
    public final boolean s(athh athhVar) {
        atlg atlgVarB = atkj.b(atkj.a(athhVar), atmy.a);
        return atlgVarB != null && atlgVarB.l() == null;
    }

    @Override // defpackage.atjz
    public final boolean t(atir atirVar, aucj aucjVar) throws IOException {
        atirVar.getClass();
        aucjVar.getClass();
        final String str = atirVar.a;
        if (str == null) {
            eieu eieuVarH = eiiy.h("FileProcessingDatabaseOperations#updateFileTransferEntryWithThumbnailInformation");
            try {
                athh athhVar = atirVar.b;
                if (athhVar == null) {
                    throw new IllegalStateException("Processing id and upload id are null in updateFileTransferEntryWithThumbnailInformation.");
                }
                boolean zX = x(athhVar, aucjVar, atmy.b);
                fczl.a(eieuVarH, null);
                return zX;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(eieuVarH, th);
                    throw th2;
                }
            }
        }
        eieu eieuVarK = eiiy.k("FileTransferDatabaseOperations#updateFileTransferEntryWithThumbnailInformation");
        try {
            String[] strArr = comb.a;
            coly colyVar = new coly();
            colyVar.ap("updateFileTransferEntryWithThumbnailInformation");
            colyVar.f(new Function() { // from class: cojl
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
                    return comaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            colyVar.d(aucjVar);
            boolean z = colyVar.b().e() == 1;
            eieuVarK.close();
            return z;
        } catch (Throwable th3) {
            try {
                eieuVarK.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r1.a().p(new defpackage.atkb(r9)) != false) goto L15;
     */
    @Override // defpackage.atjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(final defpackage.atir r9, defpackage.atis r10) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = r9.a
            if (r0 == 0) goto L11
            cokd r9 = r8.d
            java.lang.Object r10 = r10.b
            comc r1 = defpackage.comc.UPLOAD
            java.lang.String r10 = (java.lang.String) r10
            boolean r9 = r9.l(r0, r1, r10)
            return r9
        L11:
            java.lang.String r0 = "FileProcessingDatabaseOperations#updateFileTransferEntryWithTransferHandle"
            eieu r0 = defpackage.eiiy.h(r0)
            boolean r1 = r8.y()     // Catch: java.lang.Throwable -> Lab
            r2 = 0
            java.lang.String r3 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl"
            java.lang.String r4 = "BugleFileTransfer"
            java.lang.String r5 = "updateFileTransferEntryWithTransferHandle"
            java.lang.String r6 = "FileProcessingDatabaseOperationsImpl.kt"
            if (r1 == 0) goto L4a
            java.lang.String[] r1 = defpackage.atmx.a     // Catch: java.lang.Throwable -> Lab
            atmu r1 = new atmu     // Catch: java.lang.Throwable -> Lab
            r1.<init>()     // Catch: java.lang.Throwable -> Lab
            r1.ap(r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> Lab
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lab
            r1.g(r10)     // Catch: java.lang.Throwable -> Lab
            atka r10 = new atka     // Catch: java.lang.Throwable -> Lab
            r10.<init>()     // Catch: java.lang.Throwable -> Lab
            r1.i(r10)     // Catch: java.lang.Throwable -> Lab
            atmt r9 = r1.b()     // Catch: java.lang.Throwable -> Lab
            int r9 = r9.e()     // Catch: java.lang.Throwable -> Lab
            if (r9 <= 0) goto L8e
            goto L71
        L4a:
            java.lang.String[] r1 = defpackage.atmx.a     // Catch: java.lang.Throwable -> Lab
            atlj r1 = new atlj     // Catch: java.lang.Throwable -> Lab
            r1.<init>()     // Catch: java.lang.Throwable -> Lab
            athh r7 = r9.b     // Catch: java.lang.Throwable -> Lab
            r1.e(r7)     // Catch: java.lang.Throwable -> Lab
            atmy r7 = defpackage.atmy.a     // Catch: java.lang.Throwable -> Lab
            r1.c(r7)     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> Lab
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lab
            r1.f(r10)     // Catch: java.lang.Throwable -> Lab
            atlg r10 = r1.a()     // Catch: java.lang.Throwable -> Lab
            atkb r1 = new atkb     // Catch: java.lang.Throwable -> Lab
            r1.<init>()     // Catch: java.lang.Throwable -> Lab
            boolean r9 = r10.p(r1)     // Catch: java.lang.Throwable -> Lab
            if (r9 == 0) goto L8e
        L71:
            ekrg r9 = defpackage.atkz.a     // Catch: java.lang.Throwable -> Lab
            ekrw r9 = r9.h()     // Catch: java.lang.Throwable -> Lab
            ekrz r10 = defpackage.eksq.a     // Catch: java.lang.Throwable -> Lab
            r9.X(r10, r4)     // Catch: java.lang.Throwable -> Lab
            r10 = 308(0x134, float:4.32E-43)
            ekrw r9 = r9.h(r3, r5, r10, r6)     // Catch: java.lang.Throwable -> Lab
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> Lab
            java.lang.String r10 = "Updated file processing table entry with transfer handle."
            r9.q(r10)     // Catch: java.lang.Throwable -> Lab
            defpackage.fczl.a(r0, r2)
            r9 = 1
            return r9
        L8e:
            ekrg r9 = defpackage.atkz.a     // Catch: java.lang.Throwable -> Lab
            ekrw r9 = r9.j()     // Catch: java.lang.Throwable -> Lab
            ekrz r10 = defpackage.eksq.a     // Catch: java.lang.Throwable -> Lab
            r9.X(r10, r4)     // Catch: java.lang.Throwable -> Lab
            r10 = 311(0x137, float:4.36E-43)
            ekrw r9 = r9.h(r3, r5, r10, r6)     // Catch: java.lang.Throwable -> Lab
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> Lab
            java.lang.String r10 = "Failed to update file processing table entry with transfer handle."
            r9.q(r10)     // Catch: java.lang.Throwable -> Lab
            defpackage.fczl.a(r0, r2)
            r9 = 0
            return r9
        Lab:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> Lad
        Lad:
            r10 = move-exception
            defpackage.fczl.a(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atkz.u(atir, atis):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r0.a().e() > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r0.a().p(new defpackage.atkh(r7, r9)) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        r8 = defpackage.atkz.a.e();
        r8.X(defpackage.eksq.a, "BugleFileTransfer");
        r8 = (defpackage.ekrd) r8;
        r8.X(defpackage.coie.j, r7);
        ((defpackage.ekrd) r8.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithEncryptionMetadataForFileType", 541, "FileProcessingDatabaseOperationsImpl.kt")).t("Updated file processing table entry with encryption metadata for file type %s.", r9.name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        r8 = defpackage.atkz.a.e();
        r8.X(defpackage.eksq.a, "BugleFileTransfer");
        r8 = (defpackage.ekrd) r8;
        r8.X(defpackage.coie.j, r7);
        ((defpackage.ekrd) r8.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithEncryptionMetadataForFileType", 550, "FileProcessingDatabaseOperationsImpl.kt")).t("Failed to update file processing table entry with encryption metadata for file type %s.", r9.name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(final defpackage.athh r7, defpackage.cbtf r8, final defpackage.atmy r9) {
        /*
            r6 = this;
            boolean r0 = r6.y()
            java.lang.String r1 = "updateFileTransferEntryWithEncryptionMetadataForFileType"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl"
            java.lang.String r3 = "BugleFileTransfer"
            java.lang.String r4 = "FileProcessingDatabaseOperationsImpl.kt"
            if (r0 == 0) goto L4a
            java.lang.String[] r0 = defpackage.atmx.a
            atmu r0 = new atmu
            r0.<init>()
            java.lang.String r5 = "updateFileTransferEntryWithEncryptionMetadata"
            r0.ap(r5)
            boolean r5 = r8 instanceof defpackage.cbte
            if (r5 == 0) goto L26
            cbte r8 = (defpackage.cbte) r8
            eyfn r8 = r8.a
            r0.d(r8)
            goto L31
        L26:
            boolean r5 = r8 instanceof defpackage.cbtd
            if (r5 == 0) goto L44
            cbtd r8 = (defpackage.cbtd) r8
            epwc r8 = r8.a
            r0.f(r8)
        L31:
            atkg r8 = new atkg
            r8.<init>()
            r0.i(r8)
            atmt r8 = r0.b()
            int r8 = r8.e()
            if (r8 <= 0) goto La1
            goto L7d
        L44:
            fctg r7 = new fctg
            r7.<init>()
            throw r7
        L4a:
            java.lang.String[] r0 = defpackage.atmx.a
            atlj r0 = new atlj
            r0.<init>()
            r0.e(r7)
            r0.c(r9)
            boolean r5 = r8 instanceof defpackage.cbte
            if (r5 == 0) goto L63
            cbte r8 = (defpackage.cbte) r8
            eyfn r8 = r8.a
            r0.b(r8)
            goto L6e
        L63:
            boolean r5 = r8 instanceof defpackage.cbtd
            if (r5 == 0) goto Lc5
            cbtd r8 = (defpackage.cbtd) r8
            epwc r8 = r8.a
            r0.d(r8)
        L6e:
            atlg r8 = r0.a()
            atkh r0 = new atkh
            r0.<init>()
            boolean r8 = r8.p(r0)
            if (r8 == 0) goto La1
        L7d:
            ekrg r8 = defpackage.atkz.a
            ekrw r8 = r8.e()
            ekrz r0 = defpackage.eksq.a
            r8.X(r0, r3)
            ekrd r8 = (defpackage.ekrd) r8
            ekrz r0 = defpackage.coie.j
            r8.X(r0, r7)
            r7 = 541(0x21d, float:7.58E-43)
            ekrw r7 = r8.h(r2, r1, r7, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "Updated file processing table entry with encryption metadata for file type %s."
            r7.t(r9, r8)
            return
        La1:
            ekrg r8 = defpackage.atkz.a
            ekrw r8 = r8.e()
            ekrz r0 = defpackage.eksq.a
            r8.X(r0, r3)
            ekrd r8 = (defpackage.ekrd) r8
            ekrz r0 = defpackage.coie.j
            r8.X(r0, r7)
            r7 = 550(0x226, float:7.71E-43)
            ekrw r7 = r8.h(r2, r1, r7, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "Failed to update file processing table entry with encryption metadata for file type %s."
            r7.t(r9, r8)
            return
        Lc5:
            fctg r7 = new fctg
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atkz.v(athh, cbtf, atmy):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        r8 = defpackage.atkz.a.e();
        r8.X(defpackage.eksq.a, "BugleFileTransfer");
        r8 = (defpackage.ekrd) r8;
        r8.X(defpackage.coie.j, r7);
        ((defpackage.ekrd) r8.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithEncryptionMetadataForFileTypeOld", 505, "FileProcessingDatabaseOperationsImpl.kt")).t("Failed to update file processing table entry with encryption metadata for file type %s.", r9.name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0096, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r0.a().e() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r0.a().p(new defpackage.atkf(r7, r9)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        r8 = defpackage.atkz.a.e();
        r8.X(defpackage.eksq.a, "BugleFileTransfer");
        r8 = (defpackage.ekrd) r8;
        r8.X(defpackage.coie.j, r7);
        ((defpackage.ekrd) r8.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithEncryptionMetadataForFileTypeOld", 496, "FileProcessingDatabaseOperationsImpl.kt")).t("Updated file processing table entry with encryption metadata for file type %s.", r9.name());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(final defpackage.athh r7, defpackage.eyfn r8, final defpackage.atmy r9) {
        /*
            r6 = this;
            boolean r0 = r6.y()
            java.lang.String r1 = "updateFileTransferEntryWithEncryptionMetadataForFileTypeOld"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl"
            java.lang.String r3 = "BugleFileTransfer"
            java.lang.String r4 = "FileProcessingDatabaseOperationsImpl.kt"
            if (r0 == 0) goto L30
            java.lang.String[] r0 = defpackage.atmx.a
            atmu r0 = new atmu
            r0.<init>()
            java.lang.String r5 = "updateFileTransferEntryWithEncryptionMetadata"
            r0.ap(r5)
            r0.d(r8)
            atke r8 = new atke
            r8.<init>()
            r0.i(r8)
            atmt r8 = r0.b()
            int r8 = r8.e()
            if (r8 <= 0) goto L73
            goto L4f
        L30:
            java.lang.String[] r0 = defpackage.atmx.a
            atlj r0 = new atlj
            r0.<init>()
            r0.e(r7)
            r0.c(r9)
            r0.b(r8)
            atlg r8 = r0.a()
            atkf r0 = new atkf
            r0.<init>()
            boolean r8 = r8.p(r0)
            if (r8 == 0) goto L73
        L4f:
            ekrg r8 = defpackage.atkz.a
            ekrw r8 = r8.e()
            ekrz r0 = defpackage.eksq.a
            r8.X(r0, r3)
            ekrd r8 = (defpackage.ekrd) r8
            ekrz r0 = defpackage.coie.j
            r8.X(r0, r7)
            r7 = 496(0x1f0, float:6.95E-43)
            ekrw r7 = r8.h(r2, r1, r7, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "Updated file processing table entry with encryption metadata for file type %s."
            r7.t(r9, r8)
            return
        L73:
            ekrg r8 = defpackage.atkz.a
            ekrw r8 = r8.e()
            ekrz r0 = defpackage.eksq.a
            r8.X(r0, r3)
            ekrd r8 = (defpackage.ekrd) r8
            ekrz r0 = defpackage.coie.j
            r8.X(r0, r7)
            r7 = 505(0x1f9, float:7.08E-43)
            ekrw r7 = r8.h(r2, r1, r7, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "Failed to update file processing table entry with encryption metadata for file type %s."
            r7.t(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atkz.w(athh, eyfn, atmy):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0074, code lost:
    
        r8 = defpackage.atkz.a.j();
        r8.X(defpackage.eksq.a, "BugleFileTransfer");
        r8 = (defpackage.ekrd) r8;
        r8.X(defpackage.coie.j, r7);
        ((defpackage.ekrd) r8.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithHttpRequestResultForFileType", 466, "FileProcessingDatabaseOperationsImpl.kt")).t("Failed to update file transfer entry with HTTP request result for %s.", r9.name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0098, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r0.a().e() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r0.a().p(new defpackage.atkd(r7, r9)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        r8 = defpackage.atkz.a.h();
        r8.X(defpackage.eksq.a, "BugleFileTransfer");
        r8 = (defpackage.ekrd) r8;
        r8.X(defpackage.coie.j, r7);
        ((defpackage.ekrd) r8.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithHttpRequestResultForFileType", 460, "FileProcessingDatabaseOperationsImpl.kt")).t("Updated file transfer entry with HTTP request result for %s.", r9.name());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(final defpackage.athh r7, defpackage.aucj r8, final defpackage.atmy r9) {
        /*
            r6 = this;
            boolean r0 = r6.y()
            java.lang.String r1 = "updateFileTransferEntryWithHttpRequestResultForFileType"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl"
            java.lang.String r3 = "BugleFileTransfer"
            java.lang.String r4 = "FileProcessingDatabaseOperationsImpl.kt"
            if (r0 == 0) goto L30
            java.lang.String[] r0 = defpackage.atmx.a
            atmu r0 = new atmu
            r0.<init>()
            java.lang.String r5 = "updateFileTransferEntryWithHttpRequestResult"
            r0.ap(r5)
            r0.h(r8)
            atkc r8 = new atkc
            r8.<init>()
            r0.i(r8)
            atmt r8 = r0.b()
            int r8 = r8.e()
            if (r8 <= 0) goto L74
            goto L4f
        L30:
            java.lang.String[] r0 = defpackage.atmx.a
            atlj r0 = new atlj
            r0.<init>()
            r0.e(r7)
            r0.c(r9)
            r0.g(r8)
            atlg r8 = r0.a()
            atkd r0 = new atkd
            r0.<init>()
            boolean r8 = r8.p(r0)
            if (r8 == 0) goto L74
        L4f:
            ekrg r8 = defpackage.atkz.a
            ekrw r8 = r8.h()
            ekrz r0 = defpackage.eksq.a
            r8.X(r0, r3)
            ekrd r8 = (defpackage.ekrd) r8
            ekrz r0 = defpackage.coie.j
            r8.X(r0, r7)
            r7 = 460(0x1cc, float:6.45E-43)
            ekrw r7 = r8.h(r2, r1, r7, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "Updated file transfer entry with HTTP request result for %s."
            r7.t(r9, r8)
            r7 = 1
            return r7
        L74:
            ekrg r8 = defpackage.atkz.a
            ekrw r8 = r8.j()
            ekrz r0 = defpackage.eksq.a
            r8.X(r0, r3)
            ekrd r8 = (defpackage.ekrd) r8
            ekrz r0 = defpackage.coie.j
            r8.X(r0, r7)
            r7 = 466(0x1d2, float:6.53E-43)
            ekrw r7 = r8.h(r2, r1, r7, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "Failed to update file transfer entry with HTTP request result for %s."
            r7.t(r9, r8)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atkz.x(athh, aucj, atmy):boolean");
    }
}
