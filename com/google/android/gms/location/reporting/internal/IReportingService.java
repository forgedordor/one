package com.google.android.gms.location.reporting.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.SendDataRequest;
import com.google.android.gms.location.reporting.UlrPrivateModeRequest;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IReportingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IReportingService {
        static final int TRANSACTION_cancelUploadRequest = 4;
        static final int TRANSACTION_getReportingState = 1;
        static final int TRANSACTION_privateModeToggle = 8;
        static final int TRANSACTION_reportPlace = 5;
        static final int TRANSACTION_requestUpload = 3;
        static final int TRANSACTION_sendData = 7;
        static final int TRANSACTION_tryOptIn = 2;
        static final int TRANSACTION_tryOptInRequest = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IReportingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.reporting.internal.IReportingService");
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int cancelUploadRequest(long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public ReportingState getReportingState(Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                ReportingState reportingState = (ReportingState) sgh.a(parcelTransactAndReadException, ReportingState.CREATOR);
                parcelTransactAndReadException.recycle();
                return reportingState;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int privateModeToggle(UlrPrivateModeRequest ulrPrivateModeRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, ulrPrivateModeRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int reportPlace(Account account, PlaceReport placeReport) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                sgh.d(parcelObtainAndWriteInterfaceToken, placeReport);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public UploadRequestResult requestUpload(UploadRequest uploadRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, uploadRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                UploadRequestResult uploadRequestResult = (UploadRequestResult) sgh.a(parcelTransactAndReadException, UploadRequestResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return uploadRequestResult;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int sendData(Account account, SendDataRequest sendDataRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                sgh.d(parcelObtainAndWriteInterfaceToken, sendDataRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int tryOptIn(Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.location.reporting.internal.IReportingService
            public int tryOptInRequest(OptInRequest optInRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, optInRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.gms.location.reporting.internal.IReportingService");
        }

        public static IReportingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.reporting.internal.IReportingService");
            return iInterfaceQueryLocalInterface instanceof IReportingService ? (IReportingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    ReportingState reportingState = getReportingState(account);
                    parcel2.writeNoException();
                    sgh.e(parcel2, reportingState);
                    return true;
                case 2:
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iTryOptIn = tryOptIn(account2);
                    parcel2.writeNoException();
                    parcel2.writeInt(iTryOptIn);
                    return true;
                case 3:
                    UploadRequest uploadRequest = (UploadRequest) sgh.a(parcel, UploadRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    UploadRequestResult uploadRequestResultRequestUpload = requestUpload(uploadRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, uploadRequestResultRequestUpload);
                    return true;
                case 4:
                    long j = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    int iCancelUploadRequest = cancelUploadRequest(j);
                    parcel2.writeNoException();
                    parcel2.writeInt(iCancelUploadRequest);
                    return true;
                case 5:
                    Account account3 = (Account) sgh.a(parcel, Account.CREATOR);
                    PlaceReport placeReport = (PlaceReport) sgh.a(parcel, PlaceReport.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iReportPlace = reportPlace(account3, placeReport);
                    parcel2.writeNoException();
                    parcel2.writeInt(iReportPlace);
                    return true;
                case 6:
                    OptInRequest optInRequest = (OptInRequest) sgh.a(parcel, OptInRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iTryOptInRequest = tryOptInRequest(optInRequest);
                    parcel2.writeNoException();
                    parcel2.writeInt(iTryOptInRequest);
                    return true;
                case 7:
                    Account account4 = (Account) sgh.a(parcel, Account.CREATOR);
                    SendDataRequest sendDataRequest = (SendDataRequest) sgh.a(parcel, SendDataRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iSendData = sendData(account4, sendDataRequest);
                    parcel2.writeNoException();
                    parcel2.writeInt(iSendData);
                    return true;
                case 8:
                    UlrPrivateModeRequest ulrPrivateModeRequest = (UlrPrivateModeRequest) sgh.a(parcel, UlrPrivateModeRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iPrivateModeToggle = privateModeToggle(ulrPrivateModeRequest);
                    parcel2.writeNoException();
                    parcel2.writeInt(iPrivateModeToggle);
                    return true;
                default:
                    return false;
            }
        }
    }

    int cancelUploadRequest(long j);

    ReportingState getReportingState(Account account);

    int privateModeToggle(UlrPrivateModeRequest ulrPrivateModeRequest);

    int reportPlace(Account account, PlaceReport placeReport);

    UploadRequestResult requestUpload(UploadRequest uploadRequest);

    int sendData(Account account, SendDataRequest sendDataRequest);

    int tryOptIn(Account account);

    int tryOptInRequest(OptInRequest optInRequest);
}
