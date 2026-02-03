package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
@fcsv
/* loaded from: classes2.dex */
public final class xsc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/customthemes/SelectedThemeTracker");
    public final ConversationId b;
    public final ajln c;
    public final cogw d;
    public final zuh e;
    public final fdvc f;
    private final fdpl g;
    private final fdjx h;
    private final Context i;
    private final boolean j;
    private final dtic k;
    private final fdpl l;
    private final fdpl m;

    public xsc(fdpl fdplVar, fdpl fdplVar2, ConversationId conversationId, fdjx fdjxVar, Context context, ajln ajlnVar, cogw cogwVar, zuh zuhVar) {
        fdplVar.getClass();
        fdplVar2.getClass();
        conversationId.getClass();
        fdjxVar.getClass();
        context.getClass();
        ajlnVar.getClass();
        cogwVar.getClass();
        zuhVar.getClass();
        this.g = fdplVar2;
        this.b = conversationId;
        this.h = fdjxVar;
        this.i = context;
        this.c = ajlnVar;
        this.d = cogwVar;
        this.e = zuhVar;
        boolean zB = dtew.b();
        this.j = zB;
        fdat fdatVar = dlkk.a;
        dtic dticVar = (dtic) fdatVar.a(context, Boolean.valueOf(zB));
        this.k = dticVar;
        new dlju().a(Boolean.valueOf(dpgx.e(context)), dticVar, Boolean.valueOf(zB));
        xrw xrwVar = new xrw(fdqq.a(new xrt(fdplVar2)));
        this.l = xrwVar;
        fdus fdusVar = fdur.b;
        this.f = fdtg.b(xrwVar, fdjxVar, fdusVar, null);
        fdpl fdplVarA = fdqq.a(new xrz(fdplVar));
        this.m = fdplVarA;
        fdtg.b(new fdua(fdplVarA, xrwVar, new xsa(this, null)), fdjxVar, fdusVar, fdatVar);
    }
}
