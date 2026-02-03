package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwo implements cvwi {
    public final Context a;
    public final fdjx b;
    public final ConversationId c;
    public final ajln d;
    private final fdjx e;
    private final fdpl f;
    private final fdpl g;
    private final fduj h;
    private final fdpl i;
    private final aofc j;
    private final aqhc k;

    public cvwo(Context context, fdjx fdjxVar, fdjx fdjxVar2, ConversationId conversationId, fdpl fdplVar, fdpl fdplVar2, fduj fdujVar, fdpl fdplVar3, aofc aofcVar, ajln ajlnVar, aqhc aqhcVar) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        conversationId.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fdujVar.getClass();
        aofcVar.getClass();
        ajlnVar.getClass();
        aqhcVar.getClass();
        this.a = context;
        this.e = fdjxVar;
        this.b = fdjxVar2;
        this.c = conversationId;
        this.f = fdplVar;
        this.g = fdplVar2;
        this.h = fdujVar;
        this.i = fdplVar3;
        this.j = aofcVar;
        this.d = ajlnVar;
        this.k = aqhcVar;
    }

    public static final String b(aoer aoerVar) {
        return aoerVar.h().b();
    }

    public static final boolean c(ajlk ajlkVar) {
        ajts ajtsVar = ajlkVar instanceof ajts ? (ajts) ajlkVar : null;
        if (ajtsVar == null) {
            return false;
        }
        return bvdi.d(ajtsVar.A());
    }

    @Override // defpackage.cvwi
    public final fdvc a() {
        fdpl fdplVarI;
        if (this.k.a()) {
            anpj anpjVarA = this.j.a();
            anpjVarA.getClass();
            fdplVarI = avac.e(anov.a(anpjVarA), this.f, this.i, this.g, this.h, this.e, new cvwl(this, null));
        } else {
            fdplVarI = avac.i(this.f, this.i, this.e, new cvwm(this, null));
        }
        return fdtg.b(fdplVarI, this.e, fdur.a(0L, 3), null);
    }
}
