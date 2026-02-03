package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvsi implements tdg {
    public final Context a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final ConversationId e;
    public final fdjx f;
    private final fcyh g;

    public cvsi(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, ConversationId conversationId, fcyh fcyhVar, fdjx fdjxVar) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        conversationId.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = conversationId;
        this.g = fcyhVar;
        this.f = fdjxVar;
    }

    @Override // defpackage.tdg
    public final fdvc a() {
        return egwx.a(fdqc.b(new fdui(new cvsm(((cvsn) this.b.b()).a, null)), this.g), this.f, new cvsf(this));
    }

    @Override // defpackage.tdg
    public final boolean b() {
        return true;
    }
}
