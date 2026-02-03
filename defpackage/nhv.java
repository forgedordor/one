package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhv implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ nid a;

    public nhv(nid nidVar) {
        this.a = nidVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.g();
    }
}
