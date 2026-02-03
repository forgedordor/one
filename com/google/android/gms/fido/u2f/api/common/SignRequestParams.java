package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ddad;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new ddad();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        this.d = bArr;
        this.e = list;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it.next();
                dclh.b((registeredKey.b == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
                String str2 = registeredKey.c;
                dclh.b(true, "register request has null challenge and no default challenge isprovided");
                String str3 = registeredKey.b;
                if (str3 != null) {
                    hashSet.add(Uri.parse(str3));
                }
            }
        }
        dclh.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (dclc.a(this.a, signRequestParams.a) && dclc.a(this.b, signRequestParams.b) && dclc.a(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d)) {
            List list = this.e;
            List list2 = signRequestParams.e;
            if (list.containsAll(list2) && list2.containsAll(list) && dclc.a(this.f, signRequestParams.f) && dclc.a(this.g, signRequestParams.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int iA = dclw.a(parcel);
        dclw.x(parcel, 2, num);
        dclw.r(parcel, 3, this.b);
        dclw.k(parcel, 4, this.c, i, false);
        dclw.f(parcel, 5, this.d, false);
        dclw.n(parcel, 6, this.e, false);
        dclw.k(parcel, 7, this.f, i, false);
        dclw.m(parcel, 8, this.g, false);
        dclw.c(parcel, iA);
    }
}
