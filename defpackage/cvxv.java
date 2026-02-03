package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxv implements cvxq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversation/details/encryption/e2eestatus/E2eeStatusUiAdapterImpl");
    public final Conversation b;
    public final fdjx c;
    public final fcsu d;
    public final egyt e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    private final Context j;
    private final fdpl k;
    private final fdpl l;
    private final fdjx m;
    private final fdpl n;
    private final fdpl o;
    private final String p;

    public cvxv(Context context, fdpl fdplVar, fdpl fdplVar2, fdjx fdjxVar, fdpl fdplVar3, Conversation conversation, fdpl fdplVar4, fdjx fdjxVar2, fcsu fcsuVar, egyt egytVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        context.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fdjxVar.getClass();
        fdplVar3.getClass();
        conversation.getClass();
        fdjxVar2.getClass();
        egytVar.getClass();
        fcsuVar2.getClass();
        fcsuVar5.getClass();
        this.j = context;
        this.k = fdplVar;
        this.l = fdplVar2;
        this.m = fdjxVar;
        this.n = fdplVar3;
        this.b = conversation;
        this.o = fdplVar4;
        this.c = fdjxVar2;
        this.d = fcsuVar;
        this.e = egytVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        String string = context.getString(R.string.more_about_rcs_chats);
        string.getClass();
        this.p = string;
    }

    @Override // defpackage.cvxq
    public final fdpl a() {
        fdpl fdplVar = this.o;
        fdpl fdplVar2 = this.n;
        return avac.h(auyk.a(this.k, "ConversationProperties"), auyk.a(fdplVar2, "ComposeConstraints"), auyk.a(fdplVar, "ActiveSelfIdentity"), this.l, this.m, new cvxt(this, null));
    }

    public final cvxw b() {
        return new cvxw(2, this.j.getString(R.string.encryption_status_details_off, this.p));
    }
}
