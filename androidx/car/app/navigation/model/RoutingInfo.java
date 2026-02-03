package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Distance;
import defpackage.cmb;
import defpackage.cqn;
import defpackage.cqt;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class RoutingInfo implements cqn {
    private final Distance mCurrentDistance;
    private final Step mCurrentStep;
    private final boolean mIsLoading;
    private final CarIcon mJunctionImage;
    private final Step mNextStep;

    private RoutingInfo() {
        this.mCurrentStep = null;
        this.mCurrentDistance = null;
        this.mNextStep = null;
        this.mJunctionImage = null;
        this.mIsLoading = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutingInfo)) {
            return false;
        }
        RoutingInfo routingInfo = (RoutingInfo) obj;
        return this.mIsLoading == routingInfo.mIsLoading && Objects.equals(this.mCurrentStep, routingInfo.mCurrentStep) && Objects.equals(this.mCurrentDistance, routingInfo.mCurrentDistance) && Objects.equals(this.mNextStep, routingInfo.mNextStep) && Objects.equals(this.mJunctionImage, routingInfo.mJunctionImage);
    }

    public Distance getCurrentDistance() {
        return this.mCurrentDistance;
    }

    public Step getCurrentStep() {
        return this.mCurrentStep;
    }

    public CarIcon getJunctionImage() {
        return this.mJunctionImage;
    }

    public Step getNextStep() {
        return this.mNextStep;
    }

    public int hashCode() {
        return Objects.hash(this.mCurrentStep, this.mCurrentDistance, this.mNextStep, this.mJunctionImage, Boolean.valueOf(this.mIsLoading));
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "RoutingInfo";
    }

    RoutingInfo(cqt cqtVar) {
        Step step = cqtVar.a;
        this.mCurrentStep = null;
        Distance distance = cqtVar.b;
        this.mCurrentDistance = null;
        Step step2 = cqtVar.c;
        this.mNextStep = null;
        CarIcon carIcon = cqtVar.d;
        this.mJunctionImage = null;
        boolean z = cqtVar.e;
        this.mIsLoading = false;
    }
}
