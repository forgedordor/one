package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvyx implements cvyj {
    public final Context a;
    public final fdjx b;
    public final fdpl c;
    public final ConversationId d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final ahax h;
    public final eigp i;
    public final fcsu j;
    public final Optional k;
    public final aqhc l;
    private final fdpl m;
    private final fdpl n;
    private final fdpl o;
    private final fcsu p;
    private final cssf q;

    public cvyx(Context context, fdjx fdjxVar, fdpl fdplVar, fdpl fdplVar2, fdpl fdplVar3, fdpl fdplVar4, ConversationId conversationId, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, ahax ahaxVar, eigp eigpVar, fcsu fcsuVar4, fcsu fcsuVar5, cssf cssfVar, Optional optional, aqhc aqhcVar) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fdplVar3.getClass();
        fdplVar4.getClass();
        conversationId.getClass();
        ahaxVar.getClass();
        eigpVar.getClass();
        cssfVar.getClass();
        aqhcVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.m = fdplVar;
        this.n = fdplVar2;
        this.c = fdplVar3;
        this.o = fdplVar4;
        this.d = conversationId;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = ahaxVar;
        this.i = eigpVar;
        this.j = fcsuVar4;
        this.p = fcsuVar5;
        this.q = cssfVar;
        this.k = optional;
        this.l = aqhcVar;
    }

    public static final String c(ResolvedRecipient resolvedRecipient) {
        String strX = resolvedRecipient.x(true);
        strX.getClass();
        return strX;
    }

    @Override // defpackage.cvyj
    public final fdpl a() {
        return avac.e(auyk.a(this.c, "ConversationProperties"), auyk.a(this.o, "ComposeConstraints"), auyk.a(this.m, "Recipients"), auyk.a(this.n, "SelfIdentities"), auyk.a(((vev) this.p.b()).g, "AddPeopleActionPlugin"), this.b, new cvyt(this, null));
    }

    public final String b(String str) throws Resources.NotFoundException {
        String strD = this.q.d(str);
        strD.getClass();
        return strD;
    }
}
