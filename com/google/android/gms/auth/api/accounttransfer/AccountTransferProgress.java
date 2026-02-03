package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.a;
import defpackage.csq;
import defpackage.dboj;
import defpackage.dclw;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountTransferProgress extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator<AccountTransferProgress> CREATOR = new dboj();
    private static final csq g;
    final int a;
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;

    static {
        csq csqVar = new csq();
        g = csqVar;
        csqVar.put("registered", new FastJsonResponse.Field(7, true, 7, true, "registered", 2, null));
        csqVar.put("in_progress", new FastJsonResponse.Field(7, true, 7, true, "in_progress", 3, null));
        csqVar.put("success", new FastJsonResponse.Field(7, true, 7, true, "success", 4, null));
        csqVar.put("failed", new FastJsonResponse.Field(7, true, 7, true, "failed", 5, null));
        csqVar.put("escrowed", new FastJsonResponse.Field(7, true, 7, true, "escrowed", 6, null));
    }

    public AccountTransferProgress() {
        this.a = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object a(FastJsonResponse.Field field) {
        int i = field.g;
        switch (i) {
            case 1:
                return Integer.valueOf(this.a);
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                throw new IllegalStateException(a.g(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map b() {
        return g;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean c(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.D(parcel, 2, this.b);
        dclw.D(parcel, 3, this.c);
        dclw.D(parcel, 4, this.d);
        dclw.D(parcel, 5, this.e);
        dclw.D(parcel, 6, this.f);
        dclw.c(parcel, iA);
    }

    public AccountTransferProgress(int i, List list, List list2, List list3, List list4, List list5) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }
}
