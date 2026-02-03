package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.a;
import defpackage.dbrx;
import defpackage.dcjo;
import defpackage.dclw;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BeaconSeedEntity extends FastSafeParcelableJsonResponse implements dcjo {
    public static final Parcelable.Creator<BeaconSeedEntity> CREATOR = new dbrx();
    private static final HashMap e;
    final Set a;
    String b;
    long c;
    long d;

    static {
        HashMap map = new HashMap();
        e = map;
        map.put(GroupManagementRequest.DATA_TAG, new FastJsonResponse.Field(7, false, 7, false, GroupManagementRequest.DATA_TAG, 2, null));
        map.put("endTimeMillis", new FastJsonResponse.Field(2, false, 2, false, "endTimeMillis", 3, null));
        map.put("startTimeMillis", new FastJsonResponse.Field(2, false, 2, false, "startTimeMillis", 4, null));
    }

    public BeaconSeedEntity(Set set, String str, long j, long j2) {
        this.a = set;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object a(FastJsonResponse.Field field) {
        int i = field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return Long.valueOf(this.c);
        }
        if (i == 4) {
            return Long.valueOf(this.d);
        }
        throw new IllegalStateException(a.g(i, "Unknown safe parcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map b() {
        return e;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean c(FastJsonResponse.Field field) {
        return this.a.contains(Integer.valueOf(field.g));
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof BeaconSeedEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BeaconSeedEntity beaconSeedEntity = (BeaconSeedEntity) obj;
        for (FastJsonResponse.Field field : e.values()) {
            if (c(field)) {
                if (!beaconSeedEntity.c(field) || !a(field).equals(beaconSeedEntity.a(field))) {
                    return false;
                }
            } else if (beaconSeedEntity.c(field)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int iHashCode = 0;
        for (FastJsonResponse.Field field : e.values()) {
            if (c(field)) {
                iHashCode = iHashCode + field.g + a(field).hashCode();
            }
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int iA = dclw.a(parcel);
        if (set.contains(2)) {
            dclw.m(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            dclw.j(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            dclw.j(parcel, 4, this.d);
        }
        dclw.c(parcel, iA);
    }

    public BeaconSeedEntity() {
        this.a = new HashSet();
    }
}
