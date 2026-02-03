package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.privacy.identitydetails.IdentityDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahcg implements eyif {
    public static IdentityDetailsActivity a(Activity activity) {
        if (!(activity instanceof IdentityDetailsActivity)) {
            throw new IllegalStateException(a.L(activity, ahcf.class, "Attempt to inject a Activity wrapper of type "));
        }
        IdentityDetailsActivity identityDetailsActivity = (IdentityDetailsActivity) activity;
        identityDetailsActivity.getClass();
        return identityDetailsActivity;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
