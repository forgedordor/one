package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxj implements cvxc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversation/details/encryption/EncryptionUiAdapterImpl");
    public final Context b;
    public final fdjx c;
    public final fdpl d;
    public final ConversationId e;
    public final fcsu f;
    public final fdap g;
    private final fdpl h;
    private final fdpl i;
    private final fcsu j;
    private final fcsu k;

    public cvxj(Context context, fdjx fdjxVar, fdpl fdplVar, fdpl fdplVar2, ConversationId conversationId, fdpl fdplVar3, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        conversationId.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.h = fdplVar;
        this.d = fdplVar2;
        this.e = conversationId;
        this.i = fdplVar3;
        this.f = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
        this.g = auxh.a(new cvxi(this), 1000L, fdjxVar);
    }

    @Override // defpackage.cvxc
    public final fdvc a() {
        fdpl fdplVarA = auyk.a(this.h, "ConversationProperties");
        fdpl fdplVarA2 = auyk.a(((vlr) this.j.b()).b, "RcsLearnMoreAction");
        fdpl fdplVarA3 = auyk.a(((cvxq) this.k.b()).a(), "E2eeStatusUiData");
        fdpl fdplVarA4 = auyk.a(this.i, "SelfIdentity");
        cvxg cvxgVar = new cvxg(this, null);
        fdpl fdplVar = this.d;
        fdjx fdjxVar = this.c;
        return fdtg.b(avac.e(fdplVarA, fdplVarA2, fdplVarA3, fdplVarA4, fdplVar, fdjxVar, cvxgVar), fdjxVar, fdur.a(0L, 3), null);
    }
}
