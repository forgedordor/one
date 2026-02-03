package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.a;
import defpackage.css;
import defpackage.dbol;
import defpackage.dclw;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticatorTransferInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator<AuthenticatorTransferInfo> CREATOR = new dbol();
    private static final HashMap h;
    final Set a;
    final int b;
    public String c;
    public int d;
    public byte[] e;
    public PendingIntent f;
    public DeviceMetaData g;

    static {
        HashMap map = new HashMap();
        h = map;
        map.put("accountType", new FastJsonResponse.Field(7, false, 7, false, "accountType", 2, null));
        map.put("status", new FastJsonResponse.Field(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new FastJsonResponse.Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public AuthenticatorTransferInfo(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = bArr;
        this.f = pendingIntent;
        this.g = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object a(FastJsonResponse.Field field) {
        int i = field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return Integer.valueOf(this.d);
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(a.g(i, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map b() {
        return h;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean c(FastJsonResponse.Field field) {
        return this.a.contains(Integer.valueOf(field.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int iA = dclw.a(parcel);
        if (set.contains(1)) {
            dclw.i(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            dclw.m(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            dclw.i(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            dclw.f(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            dclw.k(parcel, 5, this.f, i, true);
        }
        if (set.contains(6)) {
            dclw.k(parcel, 6, this.g, i, true);
        }
        dclw.c(parcel, iA);
    }

    public AuthenticatorTransferInfo() {
        this.a = new css(3);
        this.b = 1;
    }
}
