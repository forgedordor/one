package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.play.core.inappreview.protocol.IInAppReviewService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eezl {
    public static final eeza a = new eeza("ReviewService");
    public eezy b;
    public final String c;

    public eezl(Context context) {
        this.c = context.getPackageName();
        if (efac.a(context)) {
            this.b = new eezy(context, a, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new eezu() { // from class: eezh
                @Override // defpackage.eezu
                public final Object a(IBinder iBinder) {
                    return IInAppReviewService.Stub.asInterface(iBinder);
                }
            });
        }
    }
}
