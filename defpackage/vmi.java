package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmi implements vdy {
    public final ConversationId a;
    public final afzc b;
    public final fdpl c;
    private final Context d;
    private final Optional e;
    private final fdjx f;
    private final Set g;

    public vmi(Context context, ConversationId conversationId, afzc afzcVar, Optional optional, fdjx fdjxVar) {
        context.getClass();
        conversationId.getClass();
        afzcVar.getClass();
        fdjxVar.getClass();
        this.d = context;
        this.a = conversationId;
        this.b = afzcVar;
        this.e = optional;
        this.f = fdjxVar;
        String string = context.getString(R.string.search_action);
        string.getClass();
        djrr djrrVar = djrr.dx;
        optional.isPresent();
        this.c = new fdpu(new dihq(string, djrrVar, false, true, true, false, null, false, null, auxh.b(new fdae() { // from class: vmh
            @Override // defpackage.fdae
            public final Object invoke() {
                vmi vmiVar = this.a;
                vmiVar.b.h(new agch(vmiVar.a));
                return fctx.a;
            }
        }, fdjxVar), 996));
        this.g = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.c;
    }
}
