package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajfn {
    private final Map e = new ConcurrentHashMap();
    public final Map a = new ConcurrentHashMap();
    private final Map f = new ConcurrentHashMap();
    private final Map g = new ConcurrentHashMap();
    private final Map h = new ConcurrentHashMap();
    public final Map b = new ConcurrentHashMap();
    private final Map i = new ConcurrentHashMap();
    private final Map j = new ConcurrentHashMap();
    public final Map c = new ConcurrentHashMap();
    public final Map d = new ConcurrentHashMap();

    final ajhc a(String str) {
        return (ajhc) this.e.get(str);
    }

    public final elnm b(String str) {
        Map map = this.h;
        return map.containsKey(str) ? (elnm) map.get(str) : elnm.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON;
    }

    public final elnu c(String str) {
        Map map = this.i;
        return map.containsKey(str) ? (elnu) map.get(str) : elnu.UNKNOWN_RCS_STATUS_REASON;
    }

    public final elnw d(String str) {
        elnw elnwVar;
        Map map = this.g;
        return (!map.containsKey(str) || (elnwVar = (elnw) map.remove(str)) == null) ? elnw.UNKNOWN_RESEND_ATTEMPT : elnwVar;
    }

    public final Integer e(String str) {
        return (Integer) this.f.get(str);
    }

    public final void f(MessageCoreData messageCoreData) {
        if (messageCoreData == null || messageCoreData.C().c() || messageCoreData.z() == null) {
            return;
        }
        String strB = messageCoreData.C().b();
        MessageUsageStatisticsData messageUsageStatisticsDataZ = messageCoreData.z();
        this.e.put(strB, new ajhc(messageCoreData));
        if (messageUsageStatisticsDataZ.d() != null) {
            Map map = this.a;
            DeviceData deviceDataD = messageUsageStatisticsDataZ.d();
            deviceDataD.getClass();
            map.put(strB, deviceDataD);
        }
        this.f.put(strB, Integer.valueOf(messageUsageStatisticsDataZ.a()));
        this.g.put(strB, messageUsageStatisticsDataZ.i());
        this.h.put(strB, messageUsageStatisticsDataZ.g());
        this.b.put(strB, messageUsageStatisticsDataZ.k());
        this.i.put(strB, messageUsageStatisticsDataZ.h());
        this.j.put(strB, Integer.valueOf(messageUsageStatisticsDataZ.b()));
        elwq elwqVarL = messageUsageStatisticsDataZ.l();
        if (elwqVarL != null) {
            this.c.put(strB, elwqVarL);
        }
        this.d.put(strB, Long.valueOf(messageUsageStatisticsDataZ.c()));
    }
}
