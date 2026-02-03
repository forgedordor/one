package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import defpackage.cmb;
import defpackage.cqh;
import defpackage.cqo;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class MapController {
    private final ActionStrip mMapActionStrip;
    private final cqo mPanModeDelegate;

    private MapController() {
        this.mPanModeDelegate = null;
        this.mMapActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapController)) {
            return false;
        }
        MapController mapController = (MapController) obj;
        return Objects.equals(Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(mapController.mPanModeDelegate == null)) && Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip);
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public cqo getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mPanModeDelegate, this.mMapActionStrip);
    }

    MapController(cqh cqhVar) {
        cqo cqoVar = cqhVar.a;
        this.mPanModeDelegate = null;
        ActionStrip actionStrip = cqhVar.b;
        this.mMapActionStrip = null;
    }
}
