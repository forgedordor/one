package com.google.android.ims.rcsservice.contacts;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IContactsManagement extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactsManagement {
        static final int TRANSACTION_forceRefreshCapabilities = 3;
        static final int TRANSACTION_getCachedCapabilities = 2;
        static final int TRANSACTION_refreshCapabilities = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactsManagement {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.contacts.IContactsManagement");
            }

            @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
            public ContactsServiceResult forceRefreshCapabilities(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                ContactsServiceResult contactsServiceResult = (ContactsServiceResult) sgh.a(parcelTransactAndReadException, ContactsServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return contactsServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
            public ImsCapabilities getCachedCapabilities(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                ImsCapabilities imsCapabilities = (ImsCapabilities) sgh.a(parcelTransactAndReadException, ImsCapabilities.CREATOR);
                parcelTransactAndReadException.recycle();
                return imsCapabilities;
            }

            @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
            public ContactsServiceResult refreshCapabilities(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                ContactsServiceResult contactsServiceResult = (ContactsServiceResult) sgh.a(parcelTransactAndReadException, ContactsServiceResult.CREATOR);
                parcelTransactAndReadException.recycle();
                return contactsServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.contacts.IContactsManagement");
        }

        public static IContactsManagement asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.contacts.IContactsManagement");
            return iInterfaceQueryLocalInterface instanceof IContactsManagement ? (IContactsManagement) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                ContactsServiceResult contactsServiceResultRefreshCapabilities = refreshCapabilities(string);
                parcel2.writeNoException();
                sgh.e(parcel2, contactsServiceResultRefreshCapabilities);
            } else if (i == 2) {
                String string2 = parcel.readString();
                enforceNoDataAvail(parcel);
                ImsCapabilities cachedCapabilities = getCachedCapabilities(string2);
                parcel2.writeNoException();
                sgh.e(parcel2, cachedCapabilities);
            } else {
                if (i != 3) {
                    return false;
                }
                String string3 = parcel.readString();
                enforceNoDataAvail(parcel);
                ContactsServiceResult contactsServiceResultForceRefreshCapabilities = forceRefreshCapabilities(string3);
                parcel2.writeNoException();
                sgh.e(parcel2, contactsServiceResultForceRefreshCapabilities);
            }
            return true;
        }
    }

    ContactsServiceResult forceRefreshCapabilities(String str);

    ImsCapabilities getCachedCapabilities(String str);

    ContactsServiceResult refreshCapabilities(String str);
}
