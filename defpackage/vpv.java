package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpv implements vdy {
    public final ConversationId a;
    public final afzc b;
    public final fdpl c;
    private final Context d;
    private final fdjx e;
    private final Set f;

    public vpv(Context context, ConversationId conversationId, afzc afzcVar, fdjx fdjxVar) {
        context.getClass();
        conversationId.getClass();
        afzcVar.getClass();
        fdjxVar.getClass();
        this.d = context;
        this.a = conversationId;
        this.b = afzcVar;
        this.e = fdjxVar;
        String string = context.getString(R.string.view_starred_action);
        string.getClass();
        this.c = new fdpu(new dihq(string, djrr.dV, false, true, false, false, null, false, null, auxh.b(new fdae() { // from class: vpu
            @Override // defpackage.fdae
            public final Object invoke() {
                vpv vpvVar = this.a;
                vpvVar.b.h(new agfo(vpvVar.a));
                return fctx.a;
            }
        }, fdjxVar), 1012));
        this.f = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.c;
    }
}
