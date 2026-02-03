package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGoogleCertificatesApi extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGoogleCertificatesApi {
        static final int TRANSACTION_getGoogleCertificates = 1;
        static final int TRANSACTION_getGoogleReleaseCertificates = 2;
        static final int TRANSACTION_isFineGrainedPackageVerificationAvailable = 9;
        static final int TRANSACTION_isGoogleOrPlatformSigned = 5;
        static final int TRANSACTION_isGoogleReleaseSigned = 3;
        static final int TRANSACTION_isGoogleSigned = 4;
        static final int TRANSACTION_isPackageGoogleOrPlatformSigned = 6;
        static final int TRANSACTION_isPackageGoogleOrPlatformSignedAvailable = 7;
        static final int TRANSACTION_queryPackageSigned = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGoogleCertificatesApi {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public IObjectWrapper getGoogleCertificates() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public IObjectWrapper getGoogleReleaseCertificates() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public boolean isFineGrainedPackageVerificationAvailable() {
                Parcel parcelTransactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleCertificatesQuery);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public boolean isGoogleReleaseSigned(String str, IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public boolean isGoogleSigned(String str, IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public GoogleCertificatesLookupResponse isPackageGoogleOrPlatformSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleCertificatesLookupQuery);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) sgh.a(parcelTransactAndReadException, GoogleCertificatesLookupResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return googleCertificatesLookupResponse;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public boolean isPackageGoogleOrPlatformSignedAvailable() {
                Parcel parcelTransactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public GoogleCertificatesLookupResponse queryPackageSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleCertificatesLookupQuery);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) sgh.a(parcelTransactAndReadException, GoogleCertificatesLookupResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return googleCertificatesLookupResponse;
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        }

        public static IGoogleCertificatesApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
            return iInterfaceQueryLocalInterface instanceof IGoogleCertificatesApi ? (IGoogleCertificatesApi) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper googleCertificates = getGoogleCertificates();
                    parcel2.writeNoException();
                    sgh.f(parcel2, googleCertificates);
                    return true;
                case 2:
                    IObjectWrapper googleReleaseCertificates = getGoogleReleaseCertificates();
                    parcel2.writeNoException();
                    sgh.f(parcel2, googleReleaseCertificates);
                    return true;
                case 3:
                    String string = parcel.readString();
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zIsGoogleReleaseSigned = isGoogleReleaseSigned(string, iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsGoogleReleaseSigned ? 1 : 0);
                    return true;
                case 4:
                    String string2 = parcel.readString();
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zIsGoogleSigned = isGoogleSigned(string2, iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zIsGoogleSigned ? 1 : 0);
                    return true;
                case 5:
                    GoogleCertificatesQuery googleCertificatesQuery = (GoogleCertificatesQuery) sgh.a(parcel, GoogleCertificatesQuery.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zIsGoogleOrPlatformSigned = isGoogleOrPlatformSigned(googleCertificatesQuery, iObjectWrapperAsInterface3);
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsGoogleOrPlatformSigned ? 1 : 0);
                    return true;
                case 6:
                    GoogleCertificatesLookupQuery googleCertificatesLookupQuery = (GoogleCertificatesLookupQuery) sgh.a(parcel, GoogleCertificatesLookupQuery.CREATOR);
                    enforceNoDataAvail(parcel);
                    GoogleCertificatesLookupResponse googleCertificatesLookupResponseIsPackageGoogleOrPlatformSigned = isPackageGoogleOrPlatformSigned(googleCertificatesLookupQuery);
                    parcel2.writeNoException();
                    sgh.e(parcel2, googleCertificatesLookupResponseIsPackageGoogleOrPlatformSigned);
                    return true;
                case 7:
                    boolean zIsPackageGoogleOrPlatformSignedAvailable = isPackageGoogleOrPlatformSignedAvailable();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsPackageGoogleOrPlatformSignedAvailable ? 1 : 0);
                    return true;
                case 8:
                    GoogleCertificatesLookupQuery googleCertificatesLookupQuery2 = (GoogleCertificatesLookupQuery) sgh.a(parcel, GoogleCertificatesLookupQuery.CREATOR);
                    enforceNoDataAvail(parcel);
                    GoogleCertificatesLookupResponse googleCertificatesLookupResponseQueryPackageSigned = queryPackageSigned(googleCertificatesLookupQuery2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, googleCertificatesLookupResponseQueryPackageSigned);
                    return true;
                case 9:
                    boolean zIsFineGrainedPackageVerificationAvailable = isFineGrainedPackageVerificationAvailable();
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zIsFineGrainedPackageVerificationAvailable ? 1 : 0);
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper getGoogleCertificates();

    IObjectWrapper getGoogleReleaseCertificates();

    boolean isFineGrainedPackageVerificationAvailable();

    boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, IObjectWrapper iObjectWrapper);

    boolean isGoogleReleaseSigned(String str, IObjectWrapper iObjectWrapper);

    boolean isGoogleSigned(String str, IObjectWrapper iObjectWrapper);

    GoogleCertificatesLookupResponse isPackageGoogleOrPlatformSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery);

    boolean isPackageGoogleOrPlatformSignedAvailable();

    GoogleCertificatesLookupResponse queryPackageSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery);
}
