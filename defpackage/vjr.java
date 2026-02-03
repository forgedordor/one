package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjr implements vdy {
    private final fdpl a;
    private final Set b;

    public vjr(Context context, final afzc afzcVar, final Conversation conversation) {
        context.getClass();
        afzcVar.getClass();
        conversation.getClass();
        String string = context.getString(R.string.action_help_and_feedback);
        string.getClass();
        this.a = new fdpu(new dihq(string, null, false, true, !((Boolean) ackx.a.e()).booleanValue(), false, null, false, null, new fdae() { // from class: vjq
            @Override // defpackage.fdae
            public final Object invoke() {
                afzcVar.h(new agcz(null, conversation.j(), 1));
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
