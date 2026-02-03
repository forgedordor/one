package com.google.android.gms.kids.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.kids.AreConversationsAllowedRequest;
import com.google.android.gms.kids.TrustedContactsRequest;
import com.google.android.gms.kids.internal.IKidsCallbacks;
import com.google.android.gms.kids.internal.IParentalControlsCacheCallback;
import com.google.android.gms.kids.internal.IParentalControlsListener;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IParentalControlsService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IParentalControlsService {
        static final int TRANSACTION_areAllowed = 7;
        static final int TRANSACTION_areConversationsAllowed = 12;
        static final int TRANSACTION_getNotAllowedDialogPendingIntent = 5;
        static final int TRANSACTION_registerCacheCallback = 10;
        static final int TRANSACTION_registerParentalControlsListener = 8;
        static final int TRANSACTION_requestTrustedContactsPendingIntent = 6;
        static final int TRANSACTION_unregisterCacheCallback = 11;
        static final int TRANSACTION_unregisterParentalControlsListener = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IParentalControlsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IParentalControlsService");
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void areAllowed(List<Uri> list, IKidsCallbacks iKidsCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void areConversationsAllowed(AreConversationsAllowedRequest areConversationsAllowedRequest, IKidsCallbacks iKidsCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, areConversationsAllowedRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void getNotAllowedDialogPendingIntent(Uri uri, IKidsCallbacks iKidsCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void registerCacheCallback(IParentalControlsCacheCallback iParentalControlsCacheCallback, IKidsCallbacks iKidsCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iParentalControlsCacheCallback);
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void registerParentalControlsListener(IParentalControlsListener iParentalControlsListener, IKidsCallbacks iKidsCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iParentalControlsListener);
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void requestTrustedContactsPendingIntent(TrustedContactsRequest trustedContactsRequest, IKidsCallbacks iKidsCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, trustedContactsRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void unregisterCacheCallback(IParentalControlsCacheCallback iParentalControlsCacheCallback, IKidsCallbacks iKidsCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iParentalControlsCacheCallback);
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void unregisterParentalControlsListener(IParentalControlsListener iParentalControlsListener, IKidsCallbacks iKidsCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iParentalControlsListener);
                sgh.f(parcelObtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IParentalControlsService");
        }

        public static IParentalControlsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IParentalControlsService");
            return iInterfaceQueryLocalInterface instanceof IParentalControlsService ? (IParentalControlsService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 5:
                    Uri uri = (Uri) sgh.a(parcel, Uri.CREATOR);
                    IKidsCallbacks iKidsCallbacksAsInterface = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getNotAllowedDialogPendingIntent(uri, iKidsCallbacksAsInterface);
                    break;
                case 6:
                    TrustedContactsRequest trustedContactsRequest = (TrustedContactsRequest) sgh.a(parcel, TrustedContactsRequest.CREATOR);
                    IKidsCallbacks iKidsCallbacksAsInterface2 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestTrustedContactsPendingIntent(trustedContactsRequest, iKidsCallbacksAsInterface2);
                    break;
                case 7:
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                    IKidsCallbacks iKidsCallbacksAsInterface3 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    areAllowed(arrayListCreateTypedArrayList, iKidsCallbacksAsInterface3);
                    break;
                case 8:
                    IParentalControlsListener iParentalControlsListenerAsInterface = IParentalControlsListener.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks iKidsCallbacksAsInterface4 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerParentalControlsListener(iParentalControlsListenerAsInterface, iKidsCallbacksAsInterface4);
                    break;
                case 9:
                    IParentalControlsListener iParentalControlsListenerAsInterface2 = IParentalControlsListener.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks iKidsCallbacksAsInterface5 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterParentalControlsListener(iParentalControlsListenerAsInterface2, iKidsCallbacksAsInterface5);
                    break;
                case 10:
                    IParentalControlsCacheCallback iParentalControlsCacheCallbackAsInterface = IParentalControlsCacheCallback.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks iKidsCallbacksAsInterface6 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerCacheCallback(iParentalControlsCacheCallbackAsInterface, iKidsCallbacksAsInterface6);
                    break;
                case 11:
                    IParentalControlsCacheCallback iParentalControlsCacheCallbackAsInterface2 = IParentalControlsCacheCallback.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks iKidsCallbacksAsInterface7 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterCacheCallback(iParentalControlsCacheCallbackAsInterface2, iKidsCallbacksAsInterface7);
                    break;
                case 12:
                    AreConversationsAllowedRequest areConversationsAllowedRequest = (AreConversationsAllowedRequest) sgh.a(parcel, AreConversationsAllowedRequest.CREATOR);
                    IKidsCallbacks iKidsCallbacksAsInterface8 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    areConversationsAllowed(areConversationsAllowedRequest, iKidsCallbacksAsInterface8);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void areAllowed(List<Uri> list, IKidsCallbacks iKidsCallbacks);

    void areConversationsAllowed(AreConversationsAllowedRequest areConversationsAllowedRequest, IKidsCallbacks iKidsCallbacks);

    void getNotAllowedDialogPendingIntent(Uri uri, IKidsCallbacks iKidsCallbacks);

    void registerCacheCallback(IParentalControlsCacheCallback iParentalControlsCacheCallback, IKidsCallbacks iKidsCallbacks);

    void registerParentalControlsListener(IParentalControlsListener iParentalControlsListener, IKidsCallbacks iKidsCallbacks);

    void requestTrustedContactsPendingIntent(TrustedContactsRequest trustedContactsRequest, IKidsCallbacks iKidsCallbacks);

    void unregisterCacheCallback(IParentalControlsCacheCallback iParentalControlsCacheCallback, IKidsCallbacks iKidsCallbacks);

    void unregisterParentalControlsListener(IParentalControlsListener iParentalControlsListener, IKidsCallbacks iKidsCallbacks);
}
