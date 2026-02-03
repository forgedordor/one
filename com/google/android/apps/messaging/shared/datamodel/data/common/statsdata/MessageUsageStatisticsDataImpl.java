package com.google.android.apps.messaging.shared.datamodel.data.common.statsdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import defpackage.baka;
import defpackage.eiju;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.elnm;
import defpackage.elnu;
import defpackage.elnw;
import defpackage.elny;
import defpackage.eloe;
import defpackage.elwq;
import defpackage.eorv;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtj;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class MessageUsageStatisticsDataImpl implements MessageUsageStatisticsData {
    public elny a;
    public DeviceData c;
    public int d;
    public elnw e;

    @Deprecated
    public elnm f;
    public eloe g;
    public elnu h;
    public elwq i;
    public int j;
    public long k;
    public Optional l;
    public Optional m;
    private final boolean o;
    private static final ekrg n = ekrg.c("com/google/android/apps/messaging/shared/datamodel/data/common/statsdata/MessageUsageStatisticsDataImpl");
    public static final Parcelable.Creator<MessageUsageStatisticsData> CREATOR = new baka();

    public MessageUsageStatisticsDataImpl() {
        this(elny.UNKNOWN_BUGLE_MESSAGE_SOURCE);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int b() {
        return this.j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final long c() {
        return this.k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final DeviceData d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final MessageUsageStatisticsData e() {
        final MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = new MessageUsageStatisticsDataImpl();
        messageUsageStatisticsDataImpl.a = this.a;
        DeviceData deviceData = this.c;
        if (deviceData != null) {
            DeviceData deviceData2 = new DeviceData(deviceData.a);
            deviceData2.c = deviceData.c;
            deviceData2.b = deviceData.b;
            deviceData2.d = deviceData.d;
            messageUsageStatisticsDataImpl.c = deviceData2;
        } else {
            messageUsageStatisticsDataImpl.c = null;
        }
        messageUsageStatisticsDataImpl.d = this.d;
        messageUsageStatisticsDataImpl.e = this.e;
        messageUsageStatisticsDataImpl.f = this.f;
        messageUsageStatisticsDataImpl.g = this.g;
        messageUsageStatisticsDataImpl.h = this.h;
        messageUsageStatisticsDataImpl.i = this.i;
        messageUsageStatisticsDataImpl.j = this.j;
        messageUsageStatisticsDataImpl.k = this.k;
        this.l.ifPresent(new Consumer() { // from class: bajy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.a.l = Optional.of((Long) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.m.ifPresent(new Consumer() { // from class: bajz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.a.m = Optional.of((Boolean) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return messageUsageStatisticsDataImpl;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eiju f() {
        return eiju.g(eorv.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elnm g() {
        return this.f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elnu h() {
        return this.h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elnw i() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elny j() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eloe k() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elwq l() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional m() {
        return this.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional n() {
        return this.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void o(elnw elnwVar) {
        this.e = elnwVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void p(elwq elwqVar) {
        this.i = elwqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void q() {
        this.h = elnu.MANUAL_FALLBACK;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void r(DeviceData deviceData) {
        this.c = deviceData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void s() {
        this.g = eloe.WAS_RCS_CONVERSATION;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final boolean t() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.M);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(-1);
        parcel.writeInt(this.e.d);
        parcel.writeInt(this.f.d);
        parcel.writeInt(this.g.d);
        parcel.writeInt(this.h.p);
        parcel.writeInt(this.j);
        parcel.writeLong(this.k);
        elwq elwqVar = this.i;
        parcel.writeByteArray(elwqVar != null ? elwqVar.toByteArray() : new byte[0]);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
    }

    public MessageUsageStatisticsDataImpl(Parcel parcel) {
        this.d = 0;
        this.l = Optional.empty();
        this.m = Optional.empty();
        elny elnyVarB = elny.b(parcel.readInt());
        this.a = elnyVarB == null ? elny.UNKNOWN_BUGLE_MESSAGE_SOURCE : elnyVarB;
        this.c = (DeviceData) parcel.readParcelable(DeviceData.class.getClassLoader());
        this.d = parcel.readInt();
        parcel.readInt();
        this.e = (elnw) Optional.ofNullable(elnw.b(parcel.readInt())).orElse(elnw.UNKNOWN_RESEND_ATTEMPT);
        this.f = (elnm) Optional.ofNullable(elnm.b(parcel.readInt())).orElse(elnm.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON);
        this.g = (eloe) Optional.ofNullable(eloe.b(parcel.readInt())).orElse(eloe.UNKNOWN_WAS_RCS_CONVERSATION);
        this.h = (elnu) Optional.ofNullable(elnu.b(parcel.readInt())).orElse(elnu.UNKNOWN_RCS_STATUS_REASON);
        this.j = parcel.readInt();
        this.k = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray != null && bArrCreateByteArray.length > 0) {
            try {
                this.i = (elwq) evsn.parseFrom(elwq.a, bArrCreateByteArray, evrr.a());
            } catch (evtj e) {
                ekrw ekrwVarJ = n.j();
                ekrwVarJ.X(eksq.a, "BugleUsageStatistics");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/data/common/statsdata/MessageUsageStatisticsDataImpl", "<init>", (char) 127, "MessageUsageStatisticsDataImpl.java")).q("failed to unparcel ConversationProtocolConditions");
            }
        }
        this.o = parcel.readByte() != 0;
    }

    public MessageUsageStatisticsDataImpl(elny elnyVar) {
        this.d = 0;
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.a = elnyVar;
        this.e = elnw.UNKNOWN_RESEND_ATTEMPT;
        this.f = elnm.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON;
        this.g = eloe.UNKNOWN_WAS_RCS_CONVERSATION;
        this.h = elnu.UNKNOWN_RCS_STATUS_REASON;
        this.o = false;
    }

    public MessageUsageStatisticsDataImpl(elny elnyVar, DeviceData deviceData, int i, elnw elnwVar, elnm elnmVar, eloe eloeVar, elnu elnuVar, elwq elwqVar, int i2, long j) {
        this.d = 0;
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.a = elnyVar == null ? elny.UNKNOWN_BUGLE_MESSAGE_SOURCE : elnyVar;
        this.c = deviceData;
        this.d = i;
        this.e = (elnw) Optional.ofNullable(elnwVar).orElse(elnw.UNKNOWN_RESEND_ATTEMPT);
        this.f = (elnm) Optional.ofNullable(elnmVar).orElse(elnm.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON);
        this.g = (eloe) Optional.ofNullable(eloeVar).orElse(eloe.UNKNOWN_WAS_RCS_CONVERSATION);
        this.h = (elnu) Optional.ofNullable(elnuVar).orElse(elnu.UNKNOWN_RCS_STATUS_REASON);
        this.i = elwqVar;
        this.j = i2;
        this.k = j;
        this.o = true;
    }
}
