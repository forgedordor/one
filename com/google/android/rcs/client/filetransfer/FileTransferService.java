package com.google.android.rcs.client.filetransfer;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.filetransfer.IFileTransfer;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.dhja;
import defpackage.dhka;
import defpackage.efaj;
import defpackage.efal;
import defpackage.efao;
import defpackage.efaq;
import defpackage.ewee;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FileTransferService extends efaj<IFileTransfer> {
    private static final cczv k = cdag.p(178973012);
    static final cczv h = cdag.q(183913756, "check_for_null_pause_download_result");
    static final cczv i = cdag.q(183913756, "check_for_null_resume_download_result");
    public static final dfny j = dfnv.b("file_transfer_service_connection_deprecated");

    public FileTransferService(Context context, efaq efaqVar, Optional<efal> optional) {
        super(IFileTransfer.class, context, efaqVar, 1, optional);
    }

    public FileTransferServiceResult acceptFileTransferRequest(long j2) throws efao {
        b();
        try {
            return ((IFileTransfer) a()).acceptFileTransferRequest(j2);
        } catch (Exception e) {
            dhja.i(e, "Error while accepting file transfer: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    public FileTransferServiceResult deleteFileTransfer(long j2) throws efao {
        b();
        try {
            return ((IFileTransfer) a()).deleteFileTransfer(j2);
        } catch (RemoteException | IllegalStateException e) {
            dhja.i(e, "Error while deleting file transfer: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    public FileDownloadResult downloadFile(FileDownloadRequest fileDownloadRequest) throws efao {
        b();
        try {
            FileDownloadResult fileDownloadResultDownloadFile = ((IFileTransfer) a()).downloadFile(fileDownloadRequest);
            if (((Boolean) k.e()).booleanValue() && fileDownloadResultDownloadFile == null) {
                throw new efao("Null DownloadResult returned from downloadFile() IPC.");
            }
            return fileDownloadResultDownloadFile;
        } catch (RemoteException | IllegalStateException e) {
            dhja.i(e, "Error while downloading new incoming file transfer: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    @Override // defpackage.efaj
    protected final boolean f() {
        return ((Boolean) j.a()).booleanValue();
    }

    @Override // defpackage.efaj
    public String getRcsServiceMetaDataKey() {
        return "FileTransferServiceVersions";
    }

    @Override // defpackage.efaj
    public ewee getServiceNameLoggingEnum() {
        return ewee.FILE_TRANSFER_SERVICE;
    }

    public PauseDownloadResult pauseDownload(PauseDownloadRequest pauseDownloadRequest) throws efao {
        b();
        try {
            PauseDownloadResult pauseDownloadResultPauseDownload = ((IFileTransfer) a()).pauseDownload(pauseDownloadRequest);
            if (((Boolean) h.e()).booleanValue() && pauseDownloadResultPauseDownload == null) {
                throw new efao("Null PauseDownloadResult returned from pauseDownload() IPC.");
            }
            return pauseDownloadResultPauseDownload;
        } catch (RemoteException | IllegalStateException e) {
            dhja.i(e, "Error while downloading new incoming file transfer: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    public FileTransferServiceResult pauseFileTransfer(long j2) throws efao {
        b();
        try {
            return ((IFileTransfer) a()).pauseFileTransfer(j2);
        } catch (RemoteException | IllegalStateException e) {
            dhja.i(e, "Error while pausing file transfer: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    public ResumeDownloadResult resumeDownload(ResumeDownloadRequest resumeDownloadRequest) throws efao {
        b();
        try {
            ResumeDownloadResult resumeDownloadResultResumeDownload = ((IFileTransfer) a()).resumeDownload(resumeDownloadRequest);
            if (((Boolean) i.e()).booleanValue() && resumeDownloadResultResumeDownload == null) {
                throw new efao("Null ResumeDownloadResult returned from resumeDownload() IPC.");
            }
            return resumeDownloadResultResumeDownload;
        } catch (RemoteException | IllegalStateException e) {
            dhja.i(e, "Error while downloading new incoming file transfer: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    public FileTransferServiceResult resumeFileTransfer(long j2) throws efao {
        b();
        try {
            return ((IFileTransfer) a()).resumeFileTransfer(j2);
        } catch (RemoteException | IllegalStateException e) {
            dhja.i(e, "Error resuming file transfer: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    public FileTransferServiceResult resumeUploadToContentServer(long j2) throws efao {
        b();
        try {
            return ((IFileTransfer) a()).resumeUploadToContentServer(j2);
        } catch (RemoteException | IllegalStateException e) {
            dhja.i(e, "Error resuming upload to content server: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    public FileTransferServiceResult sendFileTransferRequest(String str, String str2, FileTransferInfo fileTransferInfo) throws efao {
        b();
        if (str == null) {
            throw new IllegalArgumentException("userId MUST NOT be null");
        }
        try {
            return ((IFileTransfer) a()).sendFileTransferRequest(str, str2, fileTransferInfo);
        } catch (Exception e) {
            dhja.i(e, "Error while starting filetransfer: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    public FileTransferServiceResult[] sendGroupFileTransferRequest(long j2, String str, FileTransferInfo fileTransferInfo) throws efao {
        b();
        try {
            return ((IFileTransfer) a()).sendGroupFileTransferRequest(j2, str, fileTransferInfo);
        } catch (Exception e) {
            dhja.i(e, "Error while starting group filetransfer: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    public FileTransferServiceResult startNewIncomingFileTransfer(String str, String str2, String str3, long j2, boolean z, byte[] bArr) throws efao {
        b();
        Context context = this.e;
        if (dhka.k(context) && !dhka.g(context, getRcsServiceMetaDataKey(), 2)) {
            dhja.g("CSApk version does not support incoming file transfer.", new Object[0]);
            return new FileTransferServiceResult(j2, str, 12, "CSApk version does not support incoming file transfer.");
        }
        try {
            return ((IFileTransfer) a()).startNewIncomingFileTransfer(str, str2, str3, j2, z, bArr);
        } catch (RemoteException | IllegalStateException e) {
            dhja.i(e, "Error while starting new incoming file transfer: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }

    public FileTransferServiceResult uploadToContentServer(String str, FileTransferInfo fileTransferInfo) throws efao {
        b();
        try {
            return ((IFileTransfer) a()).uploadToContentServer("unused-user-id", str, fileTransferInfo);
        } catch (Exception e) {
            dhja.i(e, "Error while starting upload to content server: ", new Object[0]);
            throw new efao(e.getMessage());
        }
    }
}
