package defpackage;

import android.util.Log;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dddd extends dddf {
    final /* synthetic */ WeakReference a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dddd(dcfq dcfqVar, WeakReference weakReference) {
        super(dcfqVar);
        this.a = weakReference;
    }

    @Override // defpackage.ddde
    protected final void d(IGoogleHelpService iGoogleHelpService) {
        try {
            iGoogleHelpService.processTogglingPip(null, new dddc(this, this.a));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Toggling to help failed!", e);
            k(dddg.a);
        }
    }
}
