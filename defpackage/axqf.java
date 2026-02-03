package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axqf {
    public final Action a;
    public final MessageCoreData b;
    public final DeviceData c;
    public final MessageUsageStatisticsData d;
    public final elny e;
    public final long f;
    public final int g;
    public final int h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final axrf p;

    public axqf(Action action, MessageCoreData messageCoreData, DeviceData deviceData, MessageUsageStatisticsData messageUsageStatisticsData, elny elnyVar, long j, int i, int i2, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, axrf axrfVar) {
        messageCoreData.getClass();
        this.a = action;
        this.b = messageCoreData;
        this.c = deviceData;
        this.d = messageUsageStatisticsData;
        this.e = elnyVar;
        this.f = j;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = str;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = axrfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axqf)) {
            return false;
        }
        axqf axqfVar = (axqf) obj;
        return fdbq.f(this.a, axqfVar.a) && fdbq.f(this.b, axqfVar.b) && fdbq.f(this.c, axqfVar.c) && fdbq.f(this.d, axqfVar.d) && this.e == axqfVar.e && this.f == axqfVar.f && this.g == axqfVar.g && this.h == axqfVar.h && this.i == axqfVar.i && fdbq.f(this.j, axqfVar.j) && this.k == axqfVar.k && this.l == axqfVar.l && this.m == axqfVar.m && this.n == axqfVar.n && this.o == axqfVar.o && fdbq.f(this.p, axqfVar.p);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        DeviceData deviceData = this.c;
        int iHashCode2 = ((iHashCode * 31) + (deviceData == null ? 0 : deviceData.hashCode())) * 31;
        MessageUsageStatisticsData messageUsageStatisticsData = this.d;
        int iHashCode3 = (iHashCode2 + (messageUsageStatisticsData == null ? 0 : messageUsageStatisticsData.hashCode())) * 31;
        elny elnyVar = this.e;
        int iHashCode4 = elnyVar == null ? 0 : elnyVar.hashCode();
        long j = this.f;
        int iA = (((((((((iHashCode3 + iHashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.g) * 31) + this.h) * 31) + axqe.a(this.i)) * 31;
        String str = this.j;
        int iHashCode5 = (((((((((((iA + (str == null ? 0 : str.hashCode())) * 31) + axqe.a(this.k)) * 31) + axqe.a(this.l)) * 31) + axqe.a(this.m)) * 31) + axqe.a(this.n)) * 31) + axqe.a(this.o)) * 31;
        axrf axrfVar = this.p;
        return iHashCode5 + (axrfVar != null ? axrfVar.hashCode() : 0);
    }

    public final String toString() {
        return "InsertNewMessageParameters(parentAction=" + this.a + ", message=" + this.b + ", secondaryDeviceData=" + this.c + ", defaultStatsData=" + this.d + ", source=" + this.e + ", sentTime=" + this.f + ", requestedSubId=" + this.g + ", requestedLockedDefaultSmsSubId=" + this.h + ", updateDraft=" + this.i + ", archiveStatusValue=" + this.j + ", shouldRefreshNotification=" + this.k + ", isFromNotification=" + this.l + ", hasRbmBotRecipient=" + this.m + ", isEarlySend=" + this.n + ", hasUiBeenNotified=" + this.o + ", messageSaveCallback=" + this.p + ")";
    }
}
