package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpxb implements dqsj {
    @Override // defpackage.dqsj
    public final String a() {
        return "link_preview";
    }

    @Override // defpackage.dqsj
    public final void b(dqsy dqsyVar) {
        dqsyVar.v(bpxj.e(Alert.DURATION_SHOW_INDEFINITELY, "link_preview"));
        for (String str : bpxj.h()) {
            dqsyVar.v(str);
        }
    }
}
