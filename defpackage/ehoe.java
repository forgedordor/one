package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehoe extends eyhb {
    public ehoe(Activity activity) {
        super(activity);
    }

    @Override // defpackage.eyhb
    protected final Object a() {
        Activity activity = this.a;
        ejwl.r(activity.getApplication() instanceof ehnq, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", activity.getClass().getSimpleName(), activity.getApplication().getClass().getSimpleName());
        return super.a();
    }
}
