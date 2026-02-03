package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.axmr;
import defpackage.axms;
import defpackage.crnf;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CountryCodeDetectorAction extends ThrottledAction {
    private final crnf b;
    private static final long a = TimeUnit.MINUTES.toMillis(2);
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new axmr();

    /* compiled from: PG */
    public interface CountryCodeDetectorActionInjector {
        axms hD();
    }

    public CountryCodeDetectorAction(crnf crnfVar) {
        super(elgm.COUNTRY_CODE_DETECTOR_ACTION);
        this.b = crnfVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("CountryCodeDetectorAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.CountryCodeDetector.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 102;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "CountryCodeDetectorAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        this.b.e();
    }

    public CountryCodeDetectorAction(crnf crnfVar, Parcel parcel) {
        super(parcel, elgm.COUNTRY_CODE_DETECTOR_ACTION);
        this.b = crnfVar;
    }
}
