package androidx.car.app.hardware.climate;

import androidx.car.app.hardware.common.CarZone;
import defpackage.cmb;
import defpackage.cmf;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class CarClimateFeature {
    private final List<CarZone> mCarZones;
    private final int mFeature;

    CarClimateFeature(cmf cmfVar) {
        List list = cmfVar.b;
        this.mCarZones = DesugarCollections.unmodifiableList(null);
        int i = cmfVar.a;
        this.mFeature = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CarClimateFeature carClimateFeature = (CarClimateFeature) obj;
            if (Objects.equals(Integer.valueOf(this.mFeature), Integer.valueOf(carClimateFeature.mFeature)) && Objects.equals(this.mCarZones, carClimateFeature.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    public List<CarZone> getCarZones() {
        return this.mCarZones;
    }

    public int getFeature() {
        return this.mFeature;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mFeature), this.mCarZones);
    }

    public String toString() {
        return "ClimateProfileFeature{mFeature='" + this.mFeature + "', mCarZones=" + this.mCarZones + '}';
    }
}
