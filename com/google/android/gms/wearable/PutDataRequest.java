package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.deok;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PutDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new deok();
    private static final long e = TimeUnit.MINUTES.toMillis(30);
    public final Uri a;
    public final Bundle b;
    public byte[] c;
    public long d;

    static {
        new SecureRandom();
    }

    public PutDataRequest(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.a = uri;
        this.b = bundle;
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        dclh.m(classLoader);
        bundle.setClassLoader(classLoader);
        this.c = bArr;
        this.d = j;
    }

    public static PutDataRequest a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        }
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        if (str.startsWith("//")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        return b(new Uri.Builder().scheme("wear").path(str).build());
    }

    public static PutDataRequest b(Uri uri) {
        dclh.n(uri, "uri must not be null");
        return new PutDataRequest(uri, new Bundle(), null, e);
    }

    public final Map c() {
        HashMap map = new HashMap();
        Bundle bundle = this.b;
        for (String str : bundle.keySet()) {
            map.put(str, (Asset) bundle.getParcelable(str));
        }
        return DesugarCollections.unmodifiableMap(map);
    }

    public final void d(String str, Asset asset) {
        dclh.m(str);
        dclh.m(asset);
        this.b.putParcelable(str, asset);
    }

    public final void e() {
        this.d = 0L;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.c;
        sb.append("dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Bundle bundle = this.b;
        sb.append(", numAssets=" + bundle.size());
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.a))));
        sb.append(", syncDeadline=" + this.d);
        if (!zIsLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : bundle.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(bundle.getParcelable(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclh.n(parcel, "dest must not be null");
        Uri uri = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, uri, i, false);
        dclw.p(parcel, 4, this.b);
        dclw.f(parcel, 5, this.c, false);
        dclw.j(parcel, 6, this.d);
        dclw.c(parcel, iA);
    }
}
