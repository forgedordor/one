package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.cmb;
import defpackage.cmk;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class Mileage {
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Float> mOdometerMeters;

    private Mileage() {
        this.mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        return Objects.equals(getOdometerInKilometers(), mileage.getOdometerInKilometers()) && Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public CarValue<Float> getOdometerInKilometers() {
        CarValue<Float> carValue = this.mOdometerMeters;
        carValue.getClass();
        return carValue;
    }

    @Deprecated
    public CarValue<Float> getOdometerMeters() {
        return getOdometerInKilometers();
    }

    public int hashCode() {
        return Objects.hash(getOdometerInKilometers(), this.mDistanceDisplayUnit);
    }

    public String toString() {
        return "[ odometer: " + getOdometerInKilometers() + ", distance display unit: " + this.mDistanceDisplayUnit + "]";
    }

    Mileage(cmk cmkVar) {
        CarValue carValue = cmkVar.a;
        throw null;
    }
}
