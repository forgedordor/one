package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvrt implements tdg {
    public final Context a;
    public final ConversationId b;
    public final tlj c;
    public final cvry d;
    private final fcyh e;
    private final fdjx f;
    private final tdu g;

    public cvrt(Context context, fcyh fcyhVar, fdjx fdjxVar, ConversationId conversationId, cvry cvryVar, tlj tljVar, tdu tduVar) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        conversationId.getClass();
        tljVar.getClass();
        tduVar.getClass();
        this.a = context;
        this.e = fcyhVar;
        this.f = fdjxVar;
        this.b = conversationId;
        this.d = cvryVar;
        this.c = tljVar;
        this.g = tduVar;
    }

    @Override // defpackage.tdg
    public final fdvc a() {
        cvry cvryVar = this.d;
        return egwx.a(fdqc.b(new cvrx(cvryVar.b, cvryVar), this.e), this.f, new cvrr(this));
    }

    @Override // defpackage.tdg
    public final boolean b() {
        return true;
    }

    public final void c(ResolvedRecipient resolvedRecipient, int i) {
        auvw.k(this.f, this.e, null, new cvrs(this, resolvedRecipient, i == 4 ? eofr.DISMISSED_WARNING_BANNER : eofr.REPORTED_NOT_SPAM, null), 2);
        this.g.a("spam_banner", tdv.b);
    }
}
