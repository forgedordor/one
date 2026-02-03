package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.denw;
import defpackage.derg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, denw {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new derg();
    public final String a;
    public final String b;

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.denw
    public final String a() {
        return this.b;
    }

    @Override // defpackage.denw
    public final String b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.a;
        if (str == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(str);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }

    public DataItemAssetParcelable(denw denwVar) {
        String strB = denwVar.b();
        dclh.m(strB);
        this.a = strB;
        String strA = denwVar.a();
        dclh.m(strA);
        this.b = strA;
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
