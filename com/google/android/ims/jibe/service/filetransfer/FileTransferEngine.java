package com.google.android.ims.jibe.service.filetransfer;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferState;
import com.google.android.ims.rcsservice.filetransfer.IFileTransfer;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import defpackage.cqmf;
import defpackage.deyw;
import defpackage.dfhq;
import defpackage.dfid;
import defpackage.dfie;
import defpackage.dhbz;
import defpackage.dhff;
import defpackage.dhgz;
import defpackage.dhja;
import defpackage.elgz;
import defpackage.ewdx;
import defpackage.ewdy;
import defpackage.ewdz;
import defpackage.eweb;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FileTransferEngine extends IFileTransfer.Stub {
    private static final long[] a = new long[0];
    private final Context b;
    private final dhgz c;
    private final dhbz d;
    private final deyw e;
    private dfid f;

    public FileTransferEngine(Context context, dhgz dhgzVar, dhbz dhbzVar, deyw deywVar) {
        this.b = context;
        this.c = dhgzVar;
        this.d = dhbzVar;
        this.e = deywVar;
    }

    private final long a() {
        return this.d.a();
    }

    private final void b(Optional optional, String str, FileTransferInfo fileTransferInfo) {
        ewdx ewdxVar = (ewdx) ewdy.a.createBuilder();
        int iA = cqmf.a(fileTransferInfo.f);
        ewdxVar.copyOnWrite();
        ewdy ewdyVar = (ewdy) ewdxVar.instance;
        ewdyVar.c = elgz.a(iA);
        ewdyVar.b |= 1;
        ewdy ewdyVar2 = (ewdy) ewdxVar.build();
        ewdz ewdzVar = (ewdz) eweb.a.createBuilder();
        ewdzVar.copyOnWrite();
        eweb ewebVar = (eweb) ewdzVar.instance;
        ewebVar.e = 2;
        ewebVar.b |= 1;
        ewdzVar.copyOnWrite();
        eweb ewebVar2 = (eweb) ewdzVar.instance;
        str.getClass();
        ewebVar2.b |= 4;
        ewebVar2.g = str;
        ewdzVar.copyOnWrite();
        eweb ewebVar3 = (eweb) ewdzVar.instance;
        ewdyVar2.getClass();
        ewebVar3.d = ewdyVar2;
        ewebVar3.c = 102;
        if (optional.isPresent()) {
            String string = optional.get().toString();
            ewdzVar.copyOnWrite();
            eweb ewebVar4 = (eweb) ewdzVar.instance;
            ewebVar4.b |= 2;
            ewebVar4.f = string;
        }
        this.e.e(this.b, (eweb) ewdzVar.build());
    }

    private static boolean c(dfid dfidVar) {
        if (!Objects.isNull(dfidVar)) {
            return false;
        }
        dhja.q("FileTransferEngine#fileTransferProvider is null", new Object[0]);
        return true;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult acceptFileTransferRequest(long j) throws RemoteException {
        dhff.d(this.b, Binder.getCallingUid());
        dhja.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "REQUEST ACCEPTED");
        dfid dfidVar = this.f;
        return c(dfidVar) ? new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null") : dfidVar.d(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferServiceResult cancelFileTransfer(long j) {
        return new FileTransferServiceResult(-1L, null, 12, null);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult deleteFileTransfer(long j) throws RemoteException {
        dhff.d(this.b, Binder.getCallingUid());
        dhja.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "DELETED");
        dfid dfidVar = this.f;
        return c(dfidVar) ? new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null") : dfidVar.e(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileDownloadResult downloadFile(FileDownloadRequest fileDownloadRequest) throws dfie {
        if (c(this.f)) {
            throw new dfie("File transfer provider is not initialized.");
        }
        if (this.f.q(fileDownloadRequest.b().a())) {
            throw new dfie("Not enough space available.");
        }
        return this.f.c(fileDownloadRequest);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public long[] getActiveFileTransferSessions() throws RemoteException {
        dhff.d(this.b, Binder.getCallingUid());
        return getActiveSessions();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public long[] getActiveImageSharingSessions() {
        return a;
    }

    public long[] getActiveSessions() {
        dfid dfidVar = this.f;
        return c(dfidVar) ? a : dfidVar.t();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public String getFileTransferOption() {
        return "";
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferState getFileTransferState(long j) {
        return null;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public long[] getResumeableSessions() {
        return a;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public boolean isResumeable(long j) {
        return false;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public PauseDownloadResult pauseDownload(PauseDownloadRequest pauseDownloadRequest) throws dfie {
        if (c(this.f)) {
            throw new dfie("File transfer provider is not initialized.");
        }
        return this.f.m(pauseDownloadRequest);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult pauseFileTransfer(long j) throws RemoteException {
        dhff.d(this.b, Binder.getCallingUid());
        dhja.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "PAUSED");
        dfid dfidVar = this.f;
        return c(dfidVar) ? new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null") : dfidVar.f(j);
    }

    public void registerProvider(dfid dfidVar) {
        if (dfidVar == null) {
            dhja.q("FileTransferEngineProvider initialized with null value", new Object[0]);
        }
        this.f = dfidVar;
    }

    public long registerSession(dfid dfidVar) {
        return a();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferServiceResult rejectFileTransferRequest(long j) {
        return new FileTransferServiceResult(-1L, null, 12, null);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public ResumeDownloadResult resumeDownload(ResumeDownloadRequest resumeDownloadRequest) throws dfie {
        if (c(this.f)) {
            throw new dfie("File transfer provider is not initialized.");
        }
        if (this.f.q(resumeDownloadRequest.b().a())) {
            throw new dfie("Not enough space available.");
        }
        return this.f.n(resumeDownloadRequest);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult resumeFileTransfer(long j) throws RemoteException {
        dhff.d(this.b, Binder.getCallingUid());
        dhja.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "RESUMED");
        dfid dfidVar = this.f;
        return c(dfidVar) ? new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null") : dfidVar.i(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult resumeUploadToContentServer(long j) throws RemoteException {
        dhff.d(this.b, Binder.getCallingUid());
        dhja.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "UPLOAD RESUMED");
        dfid dfidVar = this.f;
        return c(dfidVar) ? new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null") : dfidVar.j(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult sendFileTransferRequest(String str, String str2, FileTransferInfo fileTransferInfo) throws RemoteException {
        b(Optional.empty(), str2, fileTransferInfo);
        dhff.d(this.b, Binder.getCallingUid());
        dfid dfidVar = this.f;
        if (c(dfidVar) || this.c.s()) {
            return new FileTransferServiceResult(0L, str, 2, "fileTransferProvider is null");
        }
        if (!dfidVar.r(fileTransferInfo.a)) {
            return new FileTransferServiceResult(-1L, str, 12, "Upload to content server not supported");
        }
        long jA = a();
        Long lValueOf = Long.valueOf(jA);
        dhja.k("File Transfer [%d] state change [%s]", lValueOf, "CREATED");
        FileTransferServiceResult fileTransferServiceResultK = dfidVar.k(str, str2, jA, fileTransferInfo);
        if (fileTransferServiceResultK.succeeded()) {
            dhja.k("File Transfer [%d] state change [%s]", lValueOf, "SENT");
        }
        return fileTransferServiceResultK;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult[] sendGroupFileTransferRequest(long j, String str, FileTransferInfo fileTransferInfo) throws RemoteException {
        b(Optional.of(Long.valueOf(j)), str, fileTransferInfo);
        dhff.d(this.b, Binder.getCallingUid());
        dfid dfidVar = this.f;
        if (c(dfidVar)) {
            return dfhq.i(2, "fileTransferProvider is null");
        }
        if (!dfidVar.r(fileTransferInfo.a)) {
            return new FileTransferServiceResult[]{new FileTransferServiceResult(-1L, " ", 12, "Upload to content server not supported")};
        }
        FileTransferServiceResult[] fileTransferServiceResultArrV = dfidVar.v(j, str, fileTransferInfo);
        for (int i = 0; i <= 0; i++) {
            FileTransferServiceResult fileTransferServiceResult = fileTransferServiceResultArrV[i];
            if (fileTransferServiceResult.succeeded()) {
                dhja.k("File Transfer [%d] state change [%s]", Long.valueOf(fileTransferServiceResult.a), "GROUP REQUEST SENT");
            }
        }
        return fileTransferServiceResultArrV;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferServiceResult sendImageSharingRequest(String str, FileTransferInfo fileTransferInfo) {
        return new FileTransferServiceResult(-1L, null, 12, null);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult startNewIncomingFileTransfer(String str, String str2, String str3, long j, boolean z, byte[] bArr) {
        dfid dfidVar = this.f;
        return c(dfidVar) ? new FileTransferServiceResult(0L, str, 2, "fileTransferProvider is null") : dfidVar.g(str3, str, str2, j, z, bArr);
    }

    public void unregisterProvider(dfid dfidVar) {
        dhja.c("FileTransferEngineProvider reset to null in unregisterProvider", new Object[0]);
        this.f = null;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult uploadToContentServer(String str, String str2, FileTransferInfo fileTransferInfo) throws RemoteException {
        b(Optional.empty(), str2, fileTransferInfo);
        dhff.d(this.b, Binder.getCallingUid());
        dfid dfidVar = this.f;
        if (c(dfidVar)) {
            return new FileTransferServiceResult(-1L, null, 2, "fileTransferProvider is null");
        }
        if (!dfidVar.r(fileTransferInfo.a)) {
            return new FileTransferServiceResult(-1L, null, 12, "Upload to content server not supported");
        }
        long jA = a();
        Long lValueOf = Long.valueOf(jA);
        dhja.k("File Transfer [%d] state change [%s]", lValueOf, "CREATED FOR UPLOAD");
        FileTransferServiceResult fileTransferServiceResultL = dfidVar.l(str, str2, jA, fileTransferInfo);
        if (fileTransferServiceResultL.succeeded()) {
            dhja.k("File Transfer [%d] state change [%s]", lValueOf, "SENT FOR UPLOAD");
        }
        return fileTransferServiceResultL;
    }

    public void unregisterSession(long j) {
    }
}
