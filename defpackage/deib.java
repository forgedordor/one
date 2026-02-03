package defpackage;

import com.google.android.gms.time.dto.ParcelableDuration;
import com.google.android.gms.time.dto.ParcelableInstant;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deib {
    public final ParcelableDuration a;
    public final ParcelableInstant b;
    public final degq c;
    public final ekgb d;
    public final ekgb e;

    public deib(ParcelableDuration parcelableDuration, ParcelableInstant parcelableInstant, degq degqVar, List list, List list2) {
        this.a = parcelableDuration;
        this.b = parcelableInstant;
        this.c = degqVar;
        this.e = ekgb.n(list);
        this.d = ekgb.n(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deib)) {
            return false;
        }
        deib deibVar = (deib) obj;
        return Objects.equals(this.a, deibVar.a) && Objects.equals(this.b, deibVar.b) && Objects.equals(this.c, deibVar.c) && Objects.equals(this.d, deibVar.d) && Objects.equals(this.e, deibVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        ekgb ekgbVar = this.e;
        ekgb ekgbVar2 = this.d;
        degq degqVar = this.c;
        ParcelableInstant parcelableInstant = this.b;
        return "InternalTimeSignal{estimatedError=" + this.a.toString() + ", currentTime=" + parcelableInstant.toString() + ", acquisitionTicks=" + degqVar.toString() + ", futureUnixEpochClockAdjustments=" + String.valueOf(ekgbVar2) + ", pastUnixEpochClockAdjustments=" + String.valueOf(ekgbVar) + "}";
    }
}
