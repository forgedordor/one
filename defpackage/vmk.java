package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmk implements vdy {
    private final fdpl a;
    private final Set b;

    public vmk(Context context, final afzc afzcVar) {
        context.getClass();
        afzcVar.getClass();
        String string = context.getString(R.string.action_advanced_feedback);
        string.getClass();
        Object objE = ackx.a.e();
        objE.getClass();
        this.a = new fdpu(new dihq(string, null, false, true, ((Boolean) objE).booleanValue(), false, null, false, null, new fdae() { // from class: vmj
            @Override // defpackage.fdae
            public final Object invoke() {
                afzcVar.h(agfq.a);
                return fctx.a;
            }
        }, 998));
        this.b = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.a;
    }
}
