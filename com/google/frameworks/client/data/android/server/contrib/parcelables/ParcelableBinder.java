package com.google.frameworks.client.data.android.server.contrib.parcelables;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.esuk;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ParcelableBinder<T extends IBinder> implements Parcelable {
    public static final Parcelable.Creator<ParcelableBinder<?>> CREATOR = new esuk();
    private final T binder;

    public ParcelableBinder(T t) {
        t.getClass();
        this.binder = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParcelableBinder copy$default(ParcelableBinder parcelableBinder, IBinder iBinder, int i, Object obj) {
        if ((i & 1) != 0) {
            iBinder = parcelableBinder.binder;
        }
        return parcelableBinder.copy(iBinder);
    }

    public final T component1() {
        return this.binder;
    }

    public final ParcelableBinder<T> copy(T t) {
        t.getClass();
        return new ParcelableBinder<>(t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParcelableBinder) && fdbq.f(this.binder, ((ParcelableBinder) obj).binder);
    }

    public final T getBinder() {
        return this.binder;
    }

    public int hashCode() {
        return this.binder.hashCode();
    }

    public String toString() {
        return "ParcelableBinder(binder=" + this.binder + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStrongBinder(this.binder);
    }
}
