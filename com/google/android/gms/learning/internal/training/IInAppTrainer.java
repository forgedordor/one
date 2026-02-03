package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.InAppTrainerOptions;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppTrainer extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppTrainer {
        static final int TRANSACTION_initV26 = 6;
        static final int TRANSACTION_initW24 = 7;
        static final int TRANSACTION_initY2020W18 = 8;
        static final int TRANSACTION_initY2020W30 = 9;
        static final int TRANSACTION_initY2020W36 = 10;
        static final int TRANSACTION_initY2021W30 = 11;
        static final int TRANSACTION_initY2022W24 = 12;
        static final int TRANSACTION_initY2023W12 = 13;
        static final int TRANSACTION_start = 3;
        static final int TRANSACTION_stop = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppTrainer {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainer");
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initV26(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, inAppTrainerOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initW24(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, inAppTrainerOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2020W18(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, inAppTrainerOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2020W30(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, inAppTrainerOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2020W36(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, inAppTrainerOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2021W30(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, inAppTrainerOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2022W24(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, inAppTrainerOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(12, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2023W12(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, inAppTrainerOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                Parcel parcelTransactAndReadException = transactAndReadException(13, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public void start(int i, IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public void stop(IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IInAppTrainer");
        }

        public static IInAppTrainer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainer");
            return iInterfaceQueryLocalInterface instanceof IInAppTrainer ? (IInAppTrainer) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 3:
                    int i3 = parcel.readInt();
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    start(i3, iStatusCallbackAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    stop(iStatusCallbackAsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 5:
                default:
                    return false;
                case 6:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions = (InAppTrainerOptions) sgh.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zInitV26 = initV26(iObjectWrapperAsInterface, iObjectWrapperAsInterface2, inAppTrainerOptions, iStatusCallbackAsInterface3);
                    parcel2.writeNoException();
                    parcel2.writeInt(zInitV26 ? 1 : 0);
                    return true;
                case 7:
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions2 = (InAppTrainerOptions) sgh.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zInitW24 = initW24(iObjectWrapperAsInterface3, iObjectWrapperAsInterface4, inAppTrainerOptions2, iStatusCallbackAsInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zInitW24 ? 1 : 0);
                    return true;
                case 8:
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions3 = (InAppTrainerOptions) sgh.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback iStatusCallbackAsInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zInitY2020W18 = initY2020W18(iObjectWrapperAsInterface5, iObjectWrapperAsInterface6, inAppTrainerOptions3, iStatusCallbackAsInterface5);
                    parcel2.writeNoException();
                    parcel2.writeInt(zInitY2020W18 ? 1 : 0);
                    return true;
                case 9:
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions4 = (InAppTrainerOptions) sgh.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback iStatusCallbackAsInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zInitY2020W30 = initY2020W30(iObjectWrapperAsInterface7, iObjectWrapperAsInterface8, inAppTrainerOptions4, iStatusCallbackAsInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zInitY2020W30 ? 1 : 0);
                    return true;
                case 10:
                    IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions5 = (InAppTrainerOptions) sgh.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback iStatusCallbackAsInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zInitY2020W36 = initY2020W36(iObjectWrapperAsInterface9, iObjectWrapperAsInterface10, inAppTrainerOptions5, iStatusCallbackAsInterface7);
                    parcel2.writeNoException();
                    parcel2.writeInt(zInitY2020W36 ? 1 : 0);
                    return true;
                case 11:
                    IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions6 = (InAppTrainerOptions) sgh.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback iStatusCallbackAsInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zInitY2021W30 = initY2021W30(iObjectWrapperAsInterface11, iObjectWrapperAsInterface12, inAppTrainerOptions6, iStatusCallbackAsInterface8);
                    parcel2.writeNoException();
                    parcel2.writeInt(zInitY2021W30 ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions7 = (InAppTrainerOptions) sgh.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback iStatusCallbackAsInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zInitY2022W24 = initY2022W24(iObjectWrapperAsInterface13, iObjectWrapperAsInterface14, inAppTrainerOptions7, iStatusCallbackAsInterface9);
                    parcel2.writeNoException();
                    parcel2.writeInt(zInitY2022W24 ? 1 : 0);
                    return true;
                case 13:
                    IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions8 = (InAppTrainerOptions) sgh.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback iStatusCallbackAsInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zInitY2023W12 = initY2023W12(iObjectWrapperAsInterface15, iObjectWrapperAsInterface16, inAppTrainerOptions8, iStatusCallbackAsInterface10);
                    parcel2.writeNoException();
                    parcel2.writeInt(zInitY2023W12 ? 1 : 0);
                    return true;
            }
        }
    }

    boolean initV26(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initW24(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2020W18(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2020W30(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2020W36(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2021W30(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2022W24(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2023W12(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    void start(int i, IStatusCallback iStatusCallback);

    void stop(IStatusCallback iStatusCallback);
}
