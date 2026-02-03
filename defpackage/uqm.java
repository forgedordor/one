package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqm {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;

    public uqm(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.d = fcsuVar3;
        this.c = fcsuVar4;
    }

    public final Intent a(Context context, boolean z, int i, boolean z2, boolean z3, int i2, int i3) {
        Intent intent = new Intent(context, (Class<?>) ConversationDetailsActivity.class);
        intent.putExtra("is_rcs_conversation", z);
        intent.putExtra("is_group_conversation", false);
        intent.putExtra("conversation_state", i);
        if (((aprb) this.c.b()).a()) {
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        if (((bvur) this.d.b()).o()) {
            intent.putExtra("is_e2ee_rcs_conversation", z2);
            intent.putExtra("has_been_e2ee", z3);
            intent.putExtra("conversation_send_mode", i3);
            intent.putExtra("conversation_settings_launch_source", i2);
        }
        return intent;
    }
}
