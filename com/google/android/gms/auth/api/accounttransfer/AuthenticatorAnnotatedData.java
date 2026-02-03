package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.a;
import defpackage.dbok;
import defpackage.dclw;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticatorAnnotatedData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator<AuthenticatorAnnotatedData> CREATOR = new dbok();
    private static final HashMap g;
    final Set a;
    final int b;
    public AuthenticatorTransferInfo c;
    public String d;
    public String e;
    public String f;

    static {
        HashMap map = new HashMap();
        g = map;
        map.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, AuthenticatorTransferInfo.class));
        map.put("signature", new FastJsonResponse.Field(7, false, 7, false, "signature", 3, null));
        map.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public AuthenticatorAnnotatedData(Set set, int i, AuthenticatorTransferInfo authenticatorTransferInfo, String str, String str2, String str3) {
        this.a = set;
        this.b = i;
        this.c = authenticatorTransferInfo;
        this.d = str;
        this.e = str2;
        this.f = str3;
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
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(a.g(i, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map b() {
        return g;
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
            dclw.k(parcel, 2, this.c, i, true);
        }
        if (set.contains(3)) {
            dclw.m(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            dclw.m(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            dclw.m(parcel, 5, this.f, true);
        }
        dclw.c(parcel, iA);
    }

    public AuthenticatorAnnotatedData() {
        this.a = new HashSet(3);
        this.b = 1;
    }
}
