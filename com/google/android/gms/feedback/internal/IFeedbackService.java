package com.google.android.gms.feedback.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.internal.IFeedbackCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFeedbackService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFeedbackService {
        static final int TRANSACTION_dismissFeedback = 10;
        static final int TRANSACTION_saveAsyncFeedbackPsbd = 5;
        static final int TRANSACTION_saveAsyncFeedbackPsd = 4;
        static final int TRANSACTION_sendSilentFeedback = 7;
        static final int TRANSACTION_silentSendFeedback = 3;
        static final int TRANSACTION_startFeedback = 1;
        static final int TRANSACTION_startFeedbackActivity = 8;
        static final int TRANSACTION_startFeedbackWithTimestamp = 6;
        static final int TRANSACTION_startFeedbackWithTimestampAndCallback = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFeedbackService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void dismissFeedback() {
                transactOneway(10, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void saveAsyncFeedbackPsbd(FeedbackOptions feedbackOptions, Bundle bundle, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, feedbackOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void saveAsyncFeedbackPsd(Bundle bundle, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public boolean sendSilentFeedback(FeedbackOptions feedbackOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, feedbackOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public boolean silentSendFeedback(ErrorReport errorReport) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, errorReport);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public boolean startFeedback(ErrorReport errorReport) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, errorReport);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void startFeedbackActivity(FeedbackOptions feedbackOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, feedbackOptions);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void startFeedbackWithTimestamp(ErrorReport errorReport, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, errorReport);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void startFeedbackWithTimestampAndCallback(ErrorReport errorReport, long j, IFeedbackCallbacks iFeedbackCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, errorReport);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFeedbackCallbacks);
                transactOneway(9, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.feedback.internal.IFeedbackService");
        }

        public static IFeedbackService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
            return iInterfaceQueryLocalInterface instanceof IFeedbackService ? (IFeedbackService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    ErrorReport errorReport = (ErrorReport) sgh.a(parcel, ErrorReport.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zStartFeedback = startFeedback(errorReport);
                    parcel2.writeNoException();
                    parcel2.writeInt(zStartFeedback ? 1 : 0);
                    return true;
                case 2:
                default:
                    return false;
                case 3:
                    ErrorReport errorReport2 = (ErrorReport) sgh.a(parcel, ErrorReport.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zSilentSendFeedback = silentSendFeedback(errorReport2);
                    parcel2.writeNoException();
                    parcel2.writeInt(zSilentSendFeedback ? 1 : 0);
                    return true;
                case 4:
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    long j = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    saveAsyncFeedbackPsd(bundle, j);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    FeedbackOptions feedbackOptions = (FeedbackOptions) sgh.a(parcel, FeedbackOptions.CREATOR);
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    long j2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    saveAsyncFeedbackPsbd(feedbackOptions, bundle2, j2);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    ErrorReport errorReport3 = (ErrorReport) sgh.a(parcel, ErrorReport.CREATOR);
                    long j3 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    startFeedbackWithTimestamp(errorReport3, j3);
                    return true;
                case 7:
                    FeedbackOptions feedbackOptions2 = (FeedbackOptions) sgh.a(parcel, FeedbackOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zSendSilentFeedback = sendSilentFeedback(feedbackOptions2);
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendSilentFeedback ? 1 : 0);
                    return true;
                case 8:
                    FeedbackOptions feedbackOptions3 = (FeedbackOptions) sgh.a(parcel, FeedbackOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    startFeedbackActivity(feedbackOptions3);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    ErrorReport errorReport4 = (ErrorReport) sgh.a(parcel, ErrorReport.CREATOR);
                    long j4 = parcel.readLong();
                    IFeedbackCallbacks iFeedbackCallbacksAsInterface = IFeedbackCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startFeedbackWithTimestampAndCallback(errorReport4, j4, iFeedbackCallbacksAsInterface);
                    return true;
                case 10:
                    dismissFeedback();
                    return true;
            }
        }
    }

    void dismissFeedback();

    void saveAsyncFeedbackPsbd(FeedbackOptions feedbackOptions, Bundle bundle, long j);

    void saveAsyncFeedbackPsd(Bundle bundle, long j);

    boolean sendSilentFeedback(FeedbackOptions feedbackOptions);

    boolean silentSendFeedback(ErrorReport errorReport);

    boolean startFeedback(ErrorReport errorReport);

    void startFeedbackActivity(FeedbackOptions feedbackOptions);

    void startFeedbackWithTimestamp(ErrorReport errorReport, long j);

    void startFeedbackWithTimestampAndCallback(ErrorReport errorReport, long j, IFeedbackCallbacks iFeedbackCallbacks);
}
