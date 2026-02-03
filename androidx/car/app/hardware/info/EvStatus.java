package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.cmb;
import defpackage.cmj;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class EvStatus {
    private final CarValue<Boolean> mEvChargePortConnected;
    private final CarValue<Boolean> mEvChargePortOpen;

    private EvStatus() {
        CarValue<Boolean> carValue = CarValue.UNKNOWN_BOOLEAN;
        this.mEvChargePortOpen = carValue;
        this.mEvChargePortConnected = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvStatus)) {
            return false;
        }
        EvStatus evStatus = (EvStatus) obj;
        return Objects.equals(this.mEvChargePortConnected, evStatus.mEvChargePortConnected) && Objects.equals(this.mEvChargePortOpen, evStatus.mEvChargePortOpen);
    }

    public CarValue<Boolean> getEvChargePortConnected() {
        CarValue<Boolean> carValue = this.mEvChargePortConnected;
        carValue.getClass();
        return carValue;
    }

    public CarValue<Boolean> getEvChargePortOpen() {
        CarValue<Boolean> carValue = this.mEvChargePortOpen;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mEvChargePortOpen, this.mEvChargePortConnected);
    }

    public String toString() {
        return "[ EV charge port open: " + this.mEvChargePortOpen + ", EV charge port connected: " + this.mEvChargePortConnected + "]";
    }

    EvStatus(cmj cmjVar) {
        CarValue carValue = cmjVar.b;
        this.mEvChargePortConnected = null;
        CarValue carValue2 = cmjVar.a;
        this.mEvChargePortOpen = null;
    }
}
