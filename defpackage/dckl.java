package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckl implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, getServiceRequest.c);
        dclw.i(parcel, 2, getServiceRequest.d);
        dclw.i(parcel, 3, getServiceRequest.e);
        dclw.m(parcel, 4, getServiceRequest.f, false);
        dclw.u(parcel, 5, getServiceRequest.g);
        dclw.E(parcel, 6, getServiceRequest.h, i);
        dclw.p(parcel, 7, getServiceRequest.i);
        dclw.k(parcel, 8, getServiceRequest.j, i, false);
        dclw.E(parcel, 10, getServiceRequest.k, i);
        dclw.E(parcel, 11, getServiceRequest.l, i);
        dclw.d(parcel, 12, getServiceRequest.m);
        dclw.i(parcel, 13, getServiceRequest.n);
        dclw.d(parcel, 14, getServiceRequest.o);
        dclw.m(parcel, 15, getServiceRequest.p, false);
        dclw.c(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Scope[] scopeArr = GetServiceRequest.a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.b;
        Feature[] featureArr2 = featureArr;
        String strT = null;
        IBinder iBinderL = null;
        Account account = null;
        String strT2 = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        boolean zD = false;
        int iF4 = 0;
        boolean zD2 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 3:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 4:
                    strT = dclv.t(parcel, i);
                    break;
                case 5:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 6:
                    scopeArr = (Scope[]) dclv.J(parcel, i, Scope.CREATOR);
                    break;
                case 7:
                    bundle = dclv.k(parcel, i);
                    break;
                case 8:
                    account = (Account) dclv.n(parcel, i, Account.CREATOR);
                    break;
                case 9:
                default:
                    dclv.C(parcel, i);
                    break;
                case 10:
                    featureArr = (Feature[]) dclv.J(parcel, i, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) dclv.J(parcel, i, Feature.CREATOR);
                    break;
                case 12:
                    zD = dclv.D(parcel, i);
                    break;
                case 13:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 14:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 15:
                    strT2 = dclv.t(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GetServiceRequest(iF, iF2, iF3, strT, iBinderL, scopeArr, bundle, account, featureArr, featureArr2, zD, iF4, zD2, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
