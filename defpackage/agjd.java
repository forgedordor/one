package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjd implements tdg {
    public final Context a;
    public final fcyh b;
    public final fdjx c;
    public final ConversationId d;
    public final ajln e;
    public final fcsu f;
    public final cogw g;
    private final fdpl h;
    private final arpr i;
    private final boolean j;

    public agjd(Context context, fcyh fcyhVar, fdjx fdjxVar, ConversationId conversationId, fdpl fdplVar, ajln ajlnVar, arpr arprVar, fcsu fcsuVar, cogw cogwVar) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        conversationId.getClass();
        fdplVar.getClass();
        ajlnVar.getClass();
        arprVar.getClass();
        cogwVar.getClass();
        this.a = context;
        this.b = fcyhVar;
        this.c = fdjxVar;
        this.d = conversationId;
        this.h = fdplVar;
        this.e = ajlnVar;
        this.i = arprVar;
        this.f = fcsuVar;
        this.g = cogwVar;
        this.j = arprVar.a();
    }

    @Override // defpackage.tdg
    public final fdvc a() {
        return egwx.a(this.h, this.c, new agiz(this));
    }

    @Override // defpackage.tdg
    public final boolean b() {
        return this.j;
    }
}
