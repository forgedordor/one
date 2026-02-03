package com.google.android.gms.auth.proximity.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbwa;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcmw;
import defpackage.ekgb;
import defpackage.ekoe;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncedCryptauthDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncedCryptauthDevice> CREATOR = new dbwa();
    final byte[] a;
    final String b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    final long g;
    final boolean h;
    final String i;
    final boolean j;
    final boolean k;
    final List l;
    final List m;
    final List n;
    final AttestationVerifier o;

    public SyncedCryptauthDevice(byte[] bArr, String str, String str2, String str3, boolean z, boolean z2, long j, boolean z3, String str4, boolean z4, boolean z5, List list, List list2, List list3, AttestationVerifier attestationVerifier) {
        ekgb ekgbVarN;
        dclh.m(bArr);
        this.a = bArr;
        dclh.k(str);
        this.b = str;
        this.c = str2 == null ? "" : str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = j;
        this.h = z3;
        this.i = str4;
        this.j = z4;
        this.k = z5;
        this.l = list;
        this.m = list2;
        if (list3 == null) {
            int i = ekgb.d;
            ekgbVarN = ekoe.a;
        } else {
            ekgbVarN = ekgb.n(list3);
        }
        this.n = ekgbVarN;
        this.o = attestationVerifier;
    }

    private static String a(List list) {
        return "[ " + TextUtils.join(", ", list) + " ]";
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncedCryptauthDevice)) {
            return false;
        }
        SyncedCryptauthDevice syncedCryptauthDevice = (SyncedCryptauthDevice) obj;
        if (Arrays.equals(this.a, syncedCryptauthDevice.a) && TextUtils.equals(this.b, syncedCryptauthDevice.b) && TextUtils.equals(this.c, syncedCryptauthDevice.c) && this.f == syncedCryptauthDevice.f && this.e == syncedCryptauthDevice.e && this.h == syncedCryptauthDevice.h && TextUtils.equals(this.d, syncedCryptauthDevice.d) && TextUtils.equals(this.i, syncedCryptauthDevice.i) && this.j == syncedCryptauthDevice.j && this.k == syncedCryptauthDevice.k) {
            List list = this.m;
            List list2 = syncedCryptauthDevice.m;
            if (list.size() == list2.size() && list.containsAll(list2)) {
                List list3 = this.l;
                List list4 = syncedCryptauthDevice.l;
                if (list3.size() == list4.size() && this.n.equals(syncedCryptauthDevice.n) && list3.containsAll(list4) && dclc.a(this.o, syncedCryptauthDevice.o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.f), Boolean.valueOf(this.e), Boolean.valueOf(this.h), this.d, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), this.l, this.m, this.n, this.o});
    }

    public final String toString() {
        return String.format("SyncedCryptauthDevice { mPublicKey='%s', mAccountId=%s, mName='%s', mIsUnlockable=%b, mIsUnlockKey=%b, mIsMobileHotspotSupported=%b, mBtMacAddress='%s', mDeviceType=%s, mIsPixelPhone=%s, isArcPlusPlus=%s, supportedFeatures=%s, enabledFeatures=%s}", dcmw.b(this.a), this.b, this.c, Boolean.valueOf(this.f), Boolean.valueOf(this.e), Boolean.valueOf(this.h), this.d, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), a(this.l), a(this.m));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 1, bArr, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.d(parcel, 5, this.e);
        dclw.d(parcel, 6, this.f);
        dclw.j(parcel, 7, this.g);
        dclw.d(parcel, 8, this.h);
        dclw.m(parcel, 9, this.i, false);
        dclw.d(parcel, 10, this.j);
        dclw.d(parcel, 11, this.k);
        dclw.D(parcel, 12, this.l);
        dclw.D(parcel, 13, this.m);
        dclw.n(parcel, 14, this.n, false);
        dclw.k(parcel, 15, this.o, i, false);
        dclw.c(parcel, iA);
    }
}
