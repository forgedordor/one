package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmcm extends dqws<cmbz, cmck, cmcm, ScheduledSendTable.BindData, cmby> {
    public cmcm(String[] strArr) {
        super("scheduled_send", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cmck b() {
        l();
        return new cmck(this.a.a());
    }

    public final void c(cmby... cmbyVarArr) {
        int iIntValue = ScheduledSendTable.d().intValue();
        if (((Integer) ScheduledSendTable.b.getOrDefault(cmbyVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        m(cmbyVarArr);
    }

    public final void d(cmcs cmcsVar) {
        k(new cmcr(cmcsVar));
    }

    public final void e(Function function) {
        String[] strArr = ScheduledSendTable.a;
        k(new cmcr((cmcs) function.apply(new cmcs())));
    }
}
