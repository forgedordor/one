package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppJobService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppJobService {
        static final int TRANSACTION_init = 9;
        static final int TRANSACTION_onDestroy = 2;
        static final int TRANSACTION_onRebind = 6;
        static final int TRANSACTION_onStartCommand = 4;
        static final int TRANSACTION_onStartJob = 7;
        static final int TRANSACTION_onStopJob = 8;
        static final int TRANSACTION_onTrimMemory = 3;
        static final int TRANSACTION_onUnbind = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppJobService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IInAppJobService");
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public boolean init(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public void onRebind(Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public int onStartCommand(Intent intent, int i, int i2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                int i3 = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i3;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public boolean onStartJob(JobParameters jobParameters) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, jobParameters);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public boolean onStopJob(JobParameters jobParameters) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, jobParameters);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public void onTrimMemory(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public boolean onUnbind(Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IInAppJobService");
        }

        public static IInAppJobService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppJobService");
            return iInterfaceQueryLocalInterface instanceof IInAppJobService ? (IInAppJobService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    onDestroy();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onTrimMemory(i3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    Intent intent = (Intent) sgh.a(parcel, Intent.CREATOR);
                    int i4 = parcel.readInt();
                    int i5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    int iOnStartCommand = onStartCommand(intent, i4, i5);
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnStartCommand);
                    return true;
                case 5:
                    Intent intent2 = (Intent) sgh.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zOnUnbind = onUnbind(intent2);
                    parcel2.writeNoException();
                    parcel2.writeInt(zOnUnbind ? 1 : 0);
                    return true;
                case 6:
                    Intent intent3 = (Intent) sgh.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRebind(intent3);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    JobParameters jobParameters = (JobParameters) sgh.a(parcel, JobParameters.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zOnStartJob = onStartJob(jobParameters);
                    parcel2.writeNoException();
                    parcel2.writeInt(zOnStartJob ? 1 : 0);
                    return true;
                case 8:
                    JobParameters jobParameters2 = (JobParameters) sgh.a(parcel, JobParameters.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zOnStopJob = onStopJob(jobParameters2);
                    parcel2.writeNoException();
                    parcel2.writeInt(zOnStopJob ? 1 : 0);
                    return true;
                case 9:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zInit = init(iObjectWrapperAsInterface, iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zInit ? 1 : 0);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean init(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2);

    void onDestroy();

    void onRebind(Intent intent);

    int onStartCommand(Intent intent, int i, int i2);

    boolean onStartJob(JobParameters jobParameters);

    boolean onStopJob(JobParameters jobParameters);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);
}
