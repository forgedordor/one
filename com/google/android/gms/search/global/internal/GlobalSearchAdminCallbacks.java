package com.google.android.gms.search.global.internal;

import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;
import com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GlobalSearchAdminCallbacks<T> extends IGlobalSearchAdminCallbacks.Stub {
    private final defr a;

    public GlobalSearchAdminCallbacks(defr<T> defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetCurrentExperimentIdsResponse(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response) {
        dcjb.b(getCurrentExperimentIdsCall$Response.a, getCurrentExperimentIdsCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetGlobalSearchSourcesResponse(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response) {
        dcjb.b(getGlobalSearchSourcesCall$Response.a, getGlobalSearchSourcesCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetPendingExperimentIdsResponse(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response) {
        dcjb.b(getPendingExperimentIdsCall$Response.a, getPendingExperimentIdsCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onSetExperimentIdsResponse(SetExperimentIdsCall$Response setExperimentIdsCall$Response) {
        dcjb.b(setExperimentIdsCall$Response.a, null, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onSetIncludeInGlobalSearchResponse(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response) {
        dcjb.b(setIncludeInGlobalSearchCall$Response.a, null, this.a);
    }
}
