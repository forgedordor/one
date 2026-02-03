package com.google.android.gms.appdatasearch.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks;
import com.google.android.gms.common.api.Status;
import defpackage.dcgq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class LightweightAppDataSearchCallbacks<T> extends ILightweightAppDataSearchCallbacks.Stub {
    protected dcgq<T> mHolder;

    public LightweightAppDataSearchCallbacks(dcgq<T> dcgqVar) {
        this.mHolder = dcgqVar;
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onGetRecentContextResponse(GetRecentContextCall$Response getRecentContextCall$Response) {
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onStatus(Status status) {
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onFileDescriptor(Status status, ParcelFileDescriptor parcelFileDescriptor) {
    }
}
