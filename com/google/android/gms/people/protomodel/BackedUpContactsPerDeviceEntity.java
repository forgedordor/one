package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddxr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator<BackedUpContactsPerDeviceEntity> CREATOR = new ddxr();
    public final String a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final DeviceVersionEntity f;
    private final List g;
    private List h;

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersionEntity deviceVersionEntity) {
        this.a = str;
        this.b = l;
        this.g = list;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = deviceVersionEntity;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final DeviceVersion a() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long c() {
        return this.e;
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BackedUpContactsPerDevice backedUpContactsPerDevice = (BackedUpContactsPerDevice) obj;
        return dclc.a(g(), backedUpContactsPerDevice.g()) && dclc.a(b(), backedUpContactsPerDevice.b()) && dclc.a(h(), backedUpContactsPerDevice.h()) && dclc.a(f(), backedUpContactsPerDevice.f()) && dclc.a(e(), backedUpContactsPerDevice.e()) && dclc.a(c(), backedUpContactsPerDevice.c()) && dclc.a(a(), backedUpContactsPerDevice.a());
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final String f() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final String g() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final List h() {
        List list;
        if (this.h == null && (list = this.g) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add((SourceStats) it.next());
            }
        }
        return this.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{g(), b(), h(), f(), e(), c(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.n(parcel, 3, h(), false);
        dclw.m(parcel, 4, this.c, false);
        dclw.A(parcel, 5, this.d);
        dclw.A(parcel, 6, this.e);
        dclw.A(parcel, 7, this.b);
        dclw.k(parcel, 8, this.f, i, false);
        dclw.c(parcel, iA);
    }
}
