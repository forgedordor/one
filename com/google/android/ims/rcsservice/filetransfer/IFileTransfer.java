package com.google.android.ims.rcsservice.filetransfer;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IFileTransfer extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFileTransfer {
        static final int TRANSACTION_acceptFileTransferRequest = 5;
        static final int TRANSACTION_cancelFileTransfer = 4;
        static final int TRANSACTION_deleteFileTransfer = 14;
        static final int TRANSACTION_downloadFile = 19;
        static final int TRANSACTION_getActiveFileTransferSessions = 1;
        static final int TRANSACTION_getActiveImageSharingSessions = 2;
        static final int TRANSACTION_getFileTransferOption = 7;
        static final int TRANSACTION_getFileTransferState = 3;
        static final int TRANSACTION_getResumeableSessions = 16;
        static final int TRANSACTION_isResumeable = 17;
        static final int TRANSACTION_pauseDownload = 20;
        static final int TRANSACTION_pauseFileTransfer = 11;
        static final int TRANSACTION_rejectFileTransferRequest = 6;
        static final int TRANSACTION_resumeDownload = 21;
        static final int TRANSACTION_resumeFileTransfer = 12;
        static final int TRANSACTION_resumeUploadToContentServer = 13;
        static final int TRANSACTION_sendFileTransferRequest = 8;
        static final int TRANSACTION_sendGroupFileTransferRequest = 15;
        static final int TRANSACTION_sendImageSharingRequest = 10;
        static final int TRANSACTION_startNewIncomingFileTransfer = 18;
        static final int TRANSACTION_uploadToContentServer = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFileTransfer {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.filetransfer.IFileTransfer");
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult acceptFileTransferRequest(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult cancelFileTransfer(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult deleteFileTransfer(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(14, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileDownloadResult downloadFile(FileDownloadRequest fileDownloadRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, fileDownloadRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(19, parcelObtainAndWriteInterfaceToken);
                FileDownloadResult fileDownloadResult = (FileDownloadResult) sgh.a(parcelTransactAndReadException, FileDownloadResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileDownloadResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public long[] getActiveFileTransferSessions() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                long[] jArrCreateLongArray = parcelTransactAndReadException.createLongArray();
                parcelTransactAndReadException.recycle();
                return jArrCreateLongArray;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public long[] getActiveImageSharingSessions() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                long[] jArrCreateLongArray = parcelTransactAndReadException.createLongArray();
                parcelTransactAndReadException.recycle();
                return jArrCreateLongArray;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public String getFileTransferOption() {
                Parcel parcelTransactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferState getFileTransferState(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                FileTransferState fileTransferState = (FileTransferState) sgh.a(parcelTransactAndReadException, FileTransferState.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferState;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public long[] getResumeableSessions() {
                Parcel parcelTransactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                long[] jArrCreateLongArray = parcelTransactAndReadException.createLongArray();
                parcelTransactAndReadException.recycle();
                return jArrCreateLongArray;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public boolean isResumeable(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(17, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public PauseDownloadResult pauseDownload(PauseDownloadRequest pauseDownloadRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pauseDownloadRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(20, parcelObtainAndWriteInterfaceToken);
                PauseDownloadResult pauseDownloadResult = (PauseDownloadResult) sgh.a(parcelTransactAndReadException, PauseDownloadResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return pauseDownloadResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult pauseFileTransfer(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult rejectFileTransferRequest(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public ResumeDownloadResult resumeDownload(ResumeDownloadRequest resumeDownloadRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, resumeDownloadRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(21, parcelObtainAndWriteInterfaceToken);
                ResumeDownloadResult resumeDownloadResult = (ResumeDownloadResult) sgh.a(parcelTransactAndReadException, ResumeDownloadResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return resumeDownloadResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult resumeFileTransfer(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(12, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult resumeUploadToContentServer(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(13, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult sendFileTransferRequest(String str, String str2, FileTransferInfo fileTransferInfo) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, fileTransferInfo);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult[] sendGroupFileTransferRequest(long j, String str, FileTransferInfo fileTransferInfo) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, fileTransferInfo);
                Parcel parcelTransactAndReadException = transactAndReadException(15, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult[] fileTransferServiceResultArr = (FileTransferServiceResult[]) parcelTransactAndReadException.createTypedArray(FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResultArr;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult sendImageSharingRequest(String str, FileTransferInfo fileTransferInfo) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, fileTransferInfo);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult startNewIncomingFileTransfer(String str, String str2, String str3, long j, boolean z, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                Parcel parcelTransactAndReadException = transactAndReadException(18, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
            public FileTransferServiceResult uploadToContentServer(String str, String str2, FileTransferInfo fileTransferInfo) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, fileTransferInfo);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                FileTransferServiceResult fileTransferServiceResult = (FileTransferServiceResult) sgh.a(parcelTransactAndReadException, FileTransferServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return fileTransferServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.filetransfer.IFileTransfer");
        }

        public static IFileTransfer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.filetransfer.IFileTransfer");
            return iInterfaceQueryLocalInterface instanceof IFileTransfer ? (IFileTransfer) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    long[] activeFileTransferSessions = getActiveFileTransferSessions();
                    parcel2.writeNoException();
                    parcel2.writeLongArray(activeFileTransferSessions);
                    return true;
                case 2:
                    long[] activeImageSharingSessions = getActiveImageSharingSessions();
                    parcel2.writeNoException();
                    parcel2.writeLongArray(activeImageSharingSessions);
                    return true;
                case 3:
                    long j = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferState fileTransferState = getFileTransferState(j);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferState);
                    return true;
                case 4:
                    long j2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultCancelFileTransfer = cancelFileTransfer(j2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultCancelFileTransfer);
                    return true;
                case 5:
                    long j3 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultAcceptFileTransferRequest = acceptFileTransferRequest(j3);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultAcceptFileTransferRequest);
                    return true;
                case 6:
                    long j4 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultRejectFileTransferRequest = rejectFileTransferRequest(j4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultRejectFileTransferRequest);
                    return true;
                case 7:
                    String fileTransferOption = getFileTransferOption();
                    parcel2.writeNoException();
                    parcel2.writeString(fileTransferOption);
                    return true;
                case 8:
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    FileTransferInfo fileTransferInfo = (FileTransferInfo) sgh.a(parcel, FileTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultSendFileTransferRequest = sendFileTransferRequest(string, string2, fileTransferInfo);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultSendFileTransferRequest);
                    return true;
                case 9:
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    FileTransferInfo fileTransferInfo2 = (FileTransferInfo) sgh.a(parcel, FileTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultUploadToContentServer = uploadToContentServer(string3, string4, fileTransferInfo2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultUploadToContentServer);
                    return true;
                case 10:
                    String string5 = parcel.readString();
                    FileTransferInfo fileTransferInfo3 = (FileTransferInfo) sgh.a(parcel, FileTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultSendImageSharingRequest = sendImageSharingRequest(string5, fileTransferInfo3);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultSendImageSharingRequest);
                    return true;
                case 11:
                    long j5 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultPauseFileTransfer = pauseFileTransfer(j5);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultPauseFileTransfer);
                    return true;
                case 12:
                    long j6 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultResumeFileTransfer = resumeFileTransfer(j6);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultResumeFileTransfer);
                    return true;
                case 13:
                    long j7 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultResumeUploadToContentServer = resumeUploadToContentServer(j7);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultResumeUploadToContentServer);
                    return true;
                case 14:
                    long j8 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultDeleteFileTransfer = deleteFileTransfer(j8);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultDeleteFileTransfer);
                    return true;
                case 15:
                    long j9 = parcel.readLong();
                    String string6 = parcel.readString();
                    FileTransferInfo fileTransferInfo4 = (FileTransferInfo) sgh.a(parcel, FileTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult[] fileTransferServiceResultArrSendGroupFileTransferRequest = sendGroupFileTransferRequest(j9, string6, fileTransferInfo4);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(fileTransferServiceResultArrSendGroupFileTransferRequest, 1);
                    return true;
                case 16:
                    long[] resumeableSessions = getResumeableSessions();
                    parcel2.writeNoException();
                    parcel2.writeLongArray(resumeableSessions);
                    return true;
                case 17:
                    long j10 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    boolean zIsResumeable = isResumeable(j10);
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsResumeable ? 1 : 0);
                    return true;
                case 18:
                    String string7 = parcel.readString();
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    long j11 = parcel.readLong();
                    boolean zG = sgh.g(parcel);
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    FileTransferServiceResult fileTransferServiceResultStartNewIncomingFileTransfer = startNewIncomingFileTransfer(string7, string8, string9, j11, zG, bArrCreateByteArray);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileTransferServiceResultStartNewIncomingFileTransfer);
                    return true;
                case 19:
                    FileDownloadRequest fileDownloadRequest = (FileDownloadRequest) sgh.a(parcel, FileDownloadRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    FileDownloadResult fileDownloadResultDownloadFile = downloadFile(fileDownloadRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, fileDownloadResultDownloadFile);
                    return true;
                case 20:
                    PauseDownloadRequest pauseDownloadRequest = (PauseDownloadRequest) sgh.a(parcel, PauseDownloadRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PauseDownloadResult pauseDownloadResultPauseDownload = pauseDownload(pauseDownloadRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, pauseDownloadResultPauseDownload);
                    return true;
                case 21:
                    ResumeDownloadRequest resumeDownloadRequest = (ResumeDownloadRequest) sgh.a(parcel, ResumeDownloadRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    ResumeDownloadResult resumeDownloadResultResumeDownload = resumeDownload(resumeDownloadRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, resumeDownloadResultResumeDownload);
                    return true;
                default:
                    return false;
            }
        }
    }

    FileTransferServiceResult acceptFileTransferRequest(long j);

    FileTransferServiceResult cancelFileTransfer(long j);

    FileTransferServiceResult deleteFileTransfer(long j);

    FileDownloadResult downloadFile(FileDownloadRequest fileDownloadRequest);

    long[] getActiveFileTransferSessions();

    long[] getActiveImageSharingSessions();

    String getFileTransferOption();

    FileTransferState getFileTransferState(long j);

    long[] getResumeableSessions();

    boolean isResumeable(long j);

    PauseDownloadResult pauseDownload(PauseDownloadRequest pauseDownloadRequest);

    FileTransferServiceResult pauseFileTransfer(long j);

    FileTransferServiceResult rejectFileTransferRequest(long j);

    ResumeDownloadResult resumeDownload(ResumeDownloadRequest resumeDownloadRequest);

    FileTransferServiceResult resumeFileTransfer(long j);

    FileTransferServiceResult resumeUploadToContentServer(long j);

    FileTransferServiceResult sendFileTransferRequest(String str, String str2, FileTransferInfo fileTransferInfo);

    FileTransferServiceResult[] sendGroupFileTransferRequest(long j, String str, FileTransferInfo fileTransferInfo);

    FileTransferServiceResult sendImageSharingRequest(String str, FileTransferInfo fileTransferInfo);

    FileTransferServiceResult startNewIncomingFileTransfer(String str, String str2, String str3, long j, boolean z, byte[] bArr);

    FileTransferServiceResult uploadToContentServer(String str, String str2, FileTransferInfo fileTransferInfo);
}
