package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Toggle;
import defpackage.cmb;
import defpackage.cpp;
import defpackage.cqm;
import defpackage.cqn;
import defpackage.cqo;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class NavigationTemplate implements cpp {
    private final ActionStrip mActionStrip;
    private final CarColor mBackgroundColor;
    private final TravelEstimate mDestinationTravelEstimate;
    private final ActionStrip mMapActionStrip;
    private final cqn mNavigationInfo;
    private final cqo mPanModeDelegate;
    private final Toggle mPanModeToggle;

    private NavigationTemplate() {
        this.mNavigationInfo = null;
        this.mBackgroundColor = null;
        this.mDestinationTravelEstimate = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeToggle = null;
        this.mPanModeDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationTemplate)) {
            return false;
        }
        NavigationTemplate navigationTemplate = (NavigationTemplate) obj;
        if (Objects.equals(this.mNavigationInfo, navigationTemplate.mNavigationInfo) && Objects.equals(this.mBackgroundColor, navigationTemplate.mBackgroundColor) && Objects.equals(this.mDestinationTravelEstimate, navigationTemplate.mDestinationTravelEstimate) && Objects.equals(this.mActionStrip, navigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, navigationTemplate.mMapActionStrip) && Objects.equals(this.mPanModeToggle, navigationTemplate.mPanModeToggle)) {
            if (Objects.equals(Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(navigationTemplate.mPanModeDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        ActionStrip actionStrip = this.mActionStrip;
        actionStrip.getClass();
        return actionStrip;
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public TravelEstimate getDestinationTravelEstimate() {
        return this.mDestinationTravelEstimate;
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public cqn getNavigationInfo() {
        return this.mNavigationInfo;
    }

    public cqo getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Deprecated
    public Toggle getPanModeToggle() {
        return this.mPanModeToggle;
    }

    public int hashCode() {
        return Objects.hash(this.mNavigationInfo, this.mBackgroundColor, this.mDestinationTravelEstimate, this.mActionStrip, this.mMapActionStrip, this.mPanModeToggle, Boolean.valueOf(this.mPanModeDelegate == null));
    }

    public String toString() {
        return "NavigationTemplate";
    }

    NavigationTemplate(cqm cqmVar) {
        cqn cqnVar = cqmVar.a;
        this.mNavigationInfo = null;
        CarColor carColor = cqmVar.b;
        this.mBackgroundColor = null;
        TravelEstimate travelEstimate = cqmVar.c;
        this.mDestinationTravelEstimate = null;
        ActionStrip actionStrip = cqmVar.d;
        this.mActionStrip = null;
        ActionStrip actionStrip2 = cqmVar.e;
        this.mMapActionStrip = null;
        Toggle toggle = cqmVar.f;
        this.mPanModeToggle = null;
        cqo cqoVar = cqmVar.g;
        this.mPanModeDelegate = null;
    }
}
