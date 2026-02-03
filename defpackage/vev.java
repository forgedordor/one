package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vev implements vdy {
    public final Context a;
    public final ConversationId b;
    public final afzc c;
    public final OpenConversation2Arguments d;
    public final fcsu e;
    public final fcsu f;
    public final fdpl g;
    public final fdau h;
    private final fdjx i;
    private final fdpl j;
    private final Set k;

    public vev(Context context, final fdjx fdjxVar, fdpl fdplVar, ConversationId conversationId, afzc afzcVar, OpenConversation2Arguments openConversation2Arguments, fdpl fdplVar2, fdpl fdplVar3, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        conversationId.getClass();
        afzcVar.getClass();
        openConversation2Arguments.getClass();
        fdplVar2.getClass();
        fdplVar3.getClass();
        fcsuVar2.getClass();
        this.a = context;
        this.i = fdjxVar;
        this.b = conversationId;
        this.c = afzcVar;
        this.d = openConversation2Arguments;
        this.j = fdplVar3;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fdud.a(fdplVar, fdplVar2, fdplVar3, new vet(this, null));
        this.k = fcwm.b(zqx.a);
        final veu veuVar = new veu(this);
        final fdci fdciVar = new fdci();
        this.h = new fdau() { // from class: auxa
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                fdci fdciVar2 = fdciVar;
                if (fdciVar2.a == null) {
                    fdciVar2.a = auvw.k(fdjxVar, null, null, new auxe(veuVar, obj, obj2, obj3, fdciVar2, null), 3);
                }
                return fctx.a;
            }
        };
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.k;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.g;
    }
}
