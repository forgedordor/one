package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vij implements vdy {
    public final Context a;
    public final ahax b;
    private final fdjx c;
    private final zqm d;
    private final fcsu e;
    private final fdpl f;
    private final Set g;

    public vij(Context context, fdjx fdjxVar, zqm zqmVar, ahax ahaxVar, fcsu fcsuVar, apso apsoVar, afzc afzcVar, ConversationId conversationId) {
        context.getClass();
        fdjxVar.getClass();
        zqmVar.getClass();
        ahaxVar.getClass();
        apsoVar.getClass();
        afzcVar.getClass();
        conversationId.getClass();
        this.a = context;
        this.c = fdjxVar;
        this.d = zqmVar;
        this.b = ahaxVar;
        this.e = fcsuVar;
        this.f = new fdua(zqmVar.a(), ((Optional) fcsuVar.b()).isPresent() ? ((vlk) ((Optional) fcsuVar.b()).get()).b : new fdpu(false), new vig(this, null));
        this.g = fcwm.b(zqx.b);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.f;
    }

    public final void c(ajlt ajltVar) {
        ajltVar.getClass();
        auvw.k(this.c, null, null, new vii(this, ajltVar, null), 3);
    }
}
