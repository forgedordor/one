package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aftz implements aftv {
    public final fdjx a;
    public final fcyh b;
    public final Context c;
    public final eigp d;
    public final anty e;
    public final afmz f;
    public final ajln g;
    public final afnm h;
    public final fcsu i;
    private final lwn j;
    private final afzc k;
    private final fdvc l;

    public aftz(fdjx fdjxVar, fcyh fcyhVar, Context context, eigp eigpVar, anty antyVar, afmz afmzVar, ajln ajlnVar, afnm afnmVar, lwn lwnVar, afzc afzcVar, fcsu fcsuVar, afus afusVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        context.getClass();
        eigpVar.getClass();
        antyVar.getClass();
        afmzVar.getClass();
        ajlnVar.getClass();
        afnmVar.getClass();
        afzcVar.getClass();
        fcsuVar.getClass();
        afusVar.getClass();
        this.a = fdjxVar;
        this.b = fcyhVar;
        this.c = context;
        this.d = eigpVar;
        this.e = antyVar;
        this.f = afmzVar;
        this.g = ajlnVar;
        this.h = afnmVar;
        this.j = lwnVar;
        this.k = afzcVar;
        this.i = fcsuVar;
        this.l = fdtg.b(new fdua(afusVar.a, afnmVar.a(), new afty(this, null)), fdjxVar, fdur.a(0L, 3), null);
    }

    @Override // defpackage.aftv
    public final fdvc a() {
        return this.l;
    }

    public final void b(ConversationId conversationId) {
        ComposeRowState composeRowStateC = avnt.c(this.j);
        if (composeRowStateC != null) {
            this.k.h(new agbq(new agbs(conversationId, false, false, 3, composeRowStateC, false, true, 454)));
        }
    }
}
