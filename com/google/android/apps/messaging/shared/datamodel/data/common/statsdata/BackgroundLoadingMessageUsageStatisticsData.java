package com.google.android.apps.messaging.shared.datamodel.data.common.statsdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import defpackage.auvw;
import defpackage.baju;
import defpackage.bajv;
import defpackage.bajw;
import defpackage.eiju;
import defpackage.elnm;
import defpackage.elnu;
import defpackage.elnw;
import defpackage.elny;
import defpackage.eloe;
import defpackage.elwq;
import defpackage.eork;
import defpackage.fcyi;
import defpackage.fdim;
import defpackage.fdjx;
import defpackage.fdjz;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class BackgroundLoadingMessageUsageStatisticsData implements MessageUsageStatisticsData {

    @UsedByReflection
    public static final Parcelable.Creator<MessageUsageStatisticsData> CREATOR;
    public eiju a;
    private final elny c;
    private final fdjx d;

    static {
        Parcelable.Creator<MessageUsageStatisticsData> creator = MessageUsageStatisticsDataImpl.CREATOR;
        creator.getClass();
        CREATOR = creator;
    }

    public BackgroundLoadingMessageUsageStatisticsData(eiju<MessageUsageStatisticsDataImpl> eijuVar, elny elnyVar, fdjx fdjxVar) {
        eijuVar.getClass();
        elnyVar.getClass();
        fdjxVar.getClass();
        this.a = eijuVar;
        this.c = elnyVar;
        this.d = fdjxVar;
    }

    private final MessageUsageStatisticsDataImpl u() {
        Object objQ = eork.q(this.a);
        objQ.getClass();
        return (MessageUsageStatisticsDataImpl) objQ;
    }

    private final eiju v(eiju eijuVar) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new baju(eijuVar, null));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int a() {
        return u().d;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int b() {
        return u().j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final long c() {
        return u().k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final DeviceData d() {
        return u().c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final MessageUsageStatisticsData e() {
        eiju eijuVarV = v(this.a);
        this.a = v(this.a);
        return new BackgroundLoadingMessageUsageStatisticsData(eijuVarV, this.c, this.d);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eiju f() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new bajv(this, null));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elnm g() {
        elnm elnmVar = u().f;
        elnmVar.getClass();
        return elnmVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elnu h() {
        elnu elnuVar = u().h;
        elnuVar.getClass();
        return elnuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elnw i() {
        elnw elnwVar = u().e;
        elnwVar.getClass();
        return elnwVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elny j() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eloe k() {
        eloe eloeVar = u().g;
        eloeVar.getClass();
        return eloeVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elwq l() {
        return u().i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional m() {
        Optional optional = u().l;
        optional.getClass();
        return optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional n() {
        Optional optional = u().m;
        optional.getClass();
        return optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void o(elnw elnwVar) {
        elnwVar.getClass();
        u().e = elnwVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void p(elwq elwqVar) {
        u().i = elwqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void q() {
        u().q();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void r(DeviceData deviceData) {
        u().c = deviceData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void s() {
        u().s();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final boolean t() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        fdim.a(fcyi.a, new bajw(this, parcel, i, null));
    }
}
