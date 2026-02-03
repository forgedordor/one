package com.google.android.gms.auth.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.internal.IAuthCallbacks;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthService {
        static final int TRANSACTION_getSpatulaHeader = 3;
        static final int TRANSACTION_performProxyGrpcRequest = 2;
        static final int TRANSACTION_performProxyRequest = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
            }

            @Override // com.google.android.gms.auth.api.internal.IAuthService
            public void getSpatulaHeader(IAuthCallbacks iAuthCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAuthCallbacks);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.internal.IAuthService
            public void performProxyGrpcRequest(IAuthCallbacks iAuthCallbacks, ProxyGrpcRequest proxyGrpcRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAuthCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, proxyGrpcRequest);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.internal.IAuthService
            public void performProxyRequest(IAuthCallbacks iAuthCallbacks, ProxyRequest proxyRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAuthCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, proxyRequest);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.internal.IAuthService");
        }

        public static IAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
            return iInterfaceQueryLocalInterface instanceof IAuthService ? (IAuthService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IAuthCallbacks iAuthCallbacksAsInterface = IAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ProxyRequest proxyRequest = (ProxyRequest) sgh.a(parcel, ProxyRequest.CREATOR);
                enforceNoDataAvail(parcel);
                performProxyRequest(iAuthCallbacksAsInterface, proxyRequest);
            } else if (i == 2) {
                IAuthCallbacks iAuthCallbacksAsInterface2 = IAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ProxyGrpcRequest proxyGrpcRequest = (ProxyGrpcRequest) sgh.a(parcel, ProxyGrpcRequest.CREATOR);
                enforceNoDataAvail(parcel);
                performProxyGrpcRequest(iAuthCallbacksAsInterface2, proxyGrpcRequest);
            } else {
                if (i != 3) {
                    return false;
                }
                IAuthCallbacks iAuthCallbacksAsInterface3 = IAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getSpatulaHeader(iAuthCallbacksAsInterface3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getSpatulaHeader(IAuthCallbacks iAuthCallbacks);

    void performProxyGrpcRequest(IAuthCallbacks iAuthCallbacks, ProxyGrpcRequest proxyGrpcRequest);

    void performProxyRequest(IAuthCallbacks iAuthCallbacks, ProxyRequest proxyRequest);
}
