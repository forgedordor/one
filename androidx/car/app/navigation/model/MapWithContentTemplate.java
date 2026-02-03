package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import defpackage.cmb;
import defpackage.cpp;
import defpackage.cqj;
import defpackage.cqk;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class MapWithContentTemplate implements cpp {
    private final ActionStrip mActionStrip;
    private final cpp mContentTemplate;
    private final MapController mMapController;

    private MapWithContentTemplate() {
        this.mMapController = null;
        this.mContentTemplate = new cqj();
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapWithContentTemplate)) {
            return false;
        }
        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
        return Objects.equals(this.mContentTemplate, mapWithContentTemplate.mContentTemplate) && Objects.equals(this.mMapController, mapWithContentTemplate.mMapController) && Objects.equals(this.mActionStrip, mapWithContentTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public cpp getContentTemplate() {
        return this.mContentTemplate;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mContentTemplate, this.mActionStrip);
    }

    MapWithContentTemplate(cqk cqkVar) {
        MapController mapController = cqkVar.a;
        this.mMapController = null;
        cpp cppVar = cqkVar.b;
        this.mContentTemplate = null;
        ActionStrip actionStrip = cqkVar.c;
        this.mActionStrip = null;
    }
}
