package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupEvent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhp extends efja {
    public ekfw a;
    public ekgb b;

    @Override // defpackage.efja
    public final GroupEvent a() {
        ekfw ekfwVar = this.a;
        if (ekfwVar != null) {
            this.b = ekfwVar.g();
        } else if (this.b == null) {
            int i = ekgb.d;
            this.b = ekoe.a;
        }
        return new AutoValue_GroupEvent(this.b);
    }
}
