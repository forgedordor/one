package com.google.android.gms.appdatasearch.internal;

import com.google.android.gms.common.api.Status;
import defpackage.dcgq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UsageReportingApiImpl {
    public static final /* synthetic */ int a = 0;

    /* compiled from: PG */
    public static final class OnStatusCallback extends LightweightAppDataSearchCallbacks<Status> {
        public OnStatusCallback(dcgq<Status> dcgqVar) {
            super(dcgqVar);
        }

        @Override // com.google.android.gms.appdatasearch.internal.LightweightAppDataSearchCallbacks, com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
        public void onStatus(Status status) {
            this.mHolder.c(status);
        }
    }
}
