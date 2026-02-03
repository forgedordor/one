package com.google.android.ims.rcsservice.contacts;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dgww;
import defpackage.dgwx;
import defpackage.dhcb;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ImsCapabilities extends dgwx implements Parcelable {
    public static final long k = TimeUnit.SECONDS.toMillis(5);
    public static final Parcelable.Creator<ImsCapabilities> CREATOR = new dhcb();

    public ImsCapabilities(long j) {
        super(j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.e);
        parcel.writeInt(this.g);
        parcel.writeStringList(this.i);
        Map map = this.h;
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString(((dgww) entry.getKey()).toString(), (String) entry.getValue());
        }
        parcel.writeBundle(bundle);
        parcel.writeLong(this.f);
        parcel.writeString(this.j.isEmpty() ? null : (String) this.j.get());
    }

    public ImsCapabilities(Parcel parcel) {
        this.c = parcel.readInt() == 1;
        this.e = parcel.readLong();
        this.g = parcel.readInt();
        parcel.readStringList(this.i);
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        bundle.getClass();
        for (dgww dgwwVar : dgww.values()) {
            String string = bundle.getString(dgwwVar.toString());
            if (!TextUtils.isEmpty(string)) {
                this.h.put(dgwwVar, string);
            }
        }
        long j = parcel.readLong();
        if (j > 0) {
            this.f = j;
        } else {
            this.f = k;
        }
        this.j = Optional.ofNullable(parcel.readString());
    }

    public ImsCapabilities(dgwx dgwxVar) {
        super(dgwxVar);
    }
}
