package com.google.android.gms.kids.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.AreConversationsAllowedResponse;
import defpackage.dcjb;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalParentalControlsClient$areConversationsAllowed$1$1$1 extends AbstractKidsCallbacks {
    final /* synthetic */ defr<AreConversationsAllowedResponse> $completionSource;

    InternalParentalControlsClient$areConversationsAllowed$1$1$1(defr<AreConversationsAllowedResponse> defrVar) {
        this.$completionSource = defrVar;
    }

    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
    public void onAreConversationsAllowedResponse(Status status, AreConversationsAllowedResponse areConversationsAllowedResponse) {
        status.getClass();
        areConversationsAllowedResponse.getClass();
        dcjb.b(status, areConversationsAllowedResponse, this.$completionSource);
    }
}
