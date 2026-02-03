package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.denv;
import defpackage.denw;
import defpackage.derj;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DataItemParcelable extends AbstractSafeParcelable implements denv {
    public static final Parcelable.Creator<DataItemParcelable> CREATOR = new derj();
    public final Uri a;
    public byte[] b;
    private final Map c;

    public DataItemParcelable(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap map = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        dclh.m(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            dclh.m(parcelable);
            map.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.c = map;
        this.b = bArr;
    }

    @Override // defpackage.denv
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.denv
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.denv
    public final byte[] c() {
        return this.b;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.b;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Map map = this.c;
        sb.append(", numAssets=" + map.size());
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.a))));
        if (!zIsLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : map.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(map.get(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, uri, i, false);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        dclh.m(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((denw) entry.getValue()));
        }
        dclw.p(parcel, 4, bundle);
        dclw.f(parcel, 5, this.b, false);
        dclw.c(parcel, iA);
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
