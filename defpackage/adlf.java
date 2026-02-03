package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlf implements adkv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/joinvialink/screen/JoinViaLinkUiAdapterImpl");
    public final Context b;
    public final fdjx c;
    public final fcsu d;
    public final fcsu e;
    public final fduf f;
    public final fduf g;
    public ConversationId h;
    public aoer i;
    public Uri j;
    private final fdpl k;
    private final fdpl l;

    public adlf(Context context, fdjx fdjxVar, fdpl fdplVar, fdpl fdplVar2, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fcsuVar2.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.k = fdplVar;
        this.l = fdplVar2;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fdvf.a(false);
        this.g = fdvf.a(false);
    }

    @Override // defpackage.adkv
    public final fdpl a() {
        fdpl fdplVar = this.l;
        return avac.i(auyk.a(this.k, "ConversationProperties"), auyk.a(fdplVar, "Recipients"), this.c, new adld(this, null));
    }
}
