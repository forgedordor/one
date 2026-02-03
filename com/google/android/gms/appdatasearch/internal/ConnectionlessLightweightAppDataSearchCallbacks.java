package com.google.android.gms.appdatasearch.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks;
import com.google.android.gms.common.api.Status;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConnectionlessLightweightAppDataSearchCallbacks<T> extends ILightweightAppDataSearchCallbacks.Stub {
    private final defr a;

    public ConnectionlessLightweightAppDataSearchCallbacks(defr<T> defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onFileDescriptor(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        dcjb.b(status, parcelFileDescriptor, this.a);
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onGetRecentContextResponse(GetRecentContextCall$Response getRecentContextCall$Response) {
        dcjb.b(getRecentContextCall$Response.a, getRecentContextCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
    public void onStatus(Status status) {
        dcjb.b(status, null, this.a);
    }
}
