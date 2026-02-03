package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amzf extends amzg {
    public final MessageCoreData a;
    private final amlm b;
    private final amvr c;
    private final ekgb d;
    private final ajlt e;
    private final anaa f;
    private final MessageUsageStatisticsDataImpl g;
    private final long h;
    private final long i;

    public amzf(amlm amlmVar, MessageCoreData messageCoreData, amvr amvrVar, ekgb ekgbVar, ajlt ajltVar, anaa anaaVar, MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl, long j, long j2) {
        this.b = amlmVar;
        this.a = messageCoreData;
        this.c = amvrVar;
        this.d = ekgbVar;
        this.e = ajltVar;
        this.f = anaaVar;
        this.g = messageUsageStatisticsDataImpl;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.amzg
    public final long a() {
        return this.i;
    }

    @Override // defpackage.amzg
    public final long b() {
        return this.h;
    }

    @Override // defpackage.amzg
    public final ajlt c() {
        return this.e;
    }

    @Override // defpackage.amzg
    public final amlm d() {
        return this.b;
    }

    @Override // defpackage.amzg
    public final amvr e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        amvr amvrVar;
        ajlt ajltVar;
        anaa anaaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof amzg) {
            amzg amzgVar = (amzg) obj;
            if (this.b.equals(amzgVar.d()) && this.a.equals(amzgVar.g()) && ((amvrVar = this.c) != null ? amvrVar.equals(amzgVar.e()) : amzgVar.e() == null) && ekjz.h(this.d, amzgVar.i()) && ((ajltVar = this.e) != null ? ajltVar.equals(amzgVar.c()) : amzgVar.c() == null) && ((anaaVar = this.f) != null ? anaaVar.equals(amzgVar.f()) : amzgVar.f() == null) && this.g.equals(amzgVar.h()) && this.h == amzgVar.b() && this.i == amzgVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amzg
    public final anaa f() {
        return this.f;
    }

    @Override // defpackage.amzg
    public final MessageCoreData g() {
        return this.a;
    }

    @Override // defpackage.amzg
    public final MessageUsageStatisticsDataImpl h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        amvr amvrVar = this.c;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (amvrVar == null ? 0 : amvrVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        ajlt ajltVar = this.e;
        int iHashCode3 = (iHashCode2 ^ (ajltVar == null ? 0 : ajltVar.hashCode())) * 1000003;
        anaa anaaVar = this.f;
        int iHashCode4 = (((iHashCode3 ^ (anaaVar != null ? anaaVar.hashCode() : 0)) * 1000003) ^ this.g.hashCode()) * 1000003;
        long j = this.h;
        long j2 = this.i;
        return ((iHashCode4 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // defpackage.amzg
    public final ekgb i() {
        return this.d;
    }

    public final String toString() {
        MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = this.g;
        anaa anaaVar = this.f;
        ajlt ajltVar = this.e;
        ekgb ekgbVar = this.d;
        amvr amvrVar = this.c;
        MessageCoreData messageCoreData = this.a;
        return "BugleMessageEnvelope{constraints=" + this.b.toString() + ", message=" + messageCoreData.toString() + ", textContent=" + String.valueOf(amvrVar) + ", attachments=" + ekgbVar.toString() + ", repliedToMessage=" + String.valueOf(ajltVar) + ", reactionEnvelopeInfo=" + String.valueOf(anaaVar) + ", usageStatistics=" + messageUsageStatisticsDataImpl.toString() + ", sendStartTime=" + this.h + ", sendElapsedTime=" + this.i + "}";
    }
}
