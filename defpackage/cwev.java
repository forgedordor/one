package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwev {
    public final Context a;
    public final ConversationId b;
    public final fcsu c;
    public final fcsu d;
    public final String e;

    public cwev(Context context, ConversationId conversationId, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        conversationId.getClass();
        this.a = context;
        this.b = conversationId;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = ((cgsa) fcsuVar2.b()).s();
    }

    public static final dkdi b(int i) {
        return new dkdi(1, fcva.b(new diin(dijs.d, 0, i, (fdap) null, 24)));
    }

    public final dkdi a(final String str, int i, int i2) {
        return new dkdi(1, fcva.b(new diio(str, i, i2, new fdap() { // from class: cweu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                afzc afzcVar = (afzc) this.a.c.b();
                Uri uri = Uri.parse(str);
                uri.getClass();
                afzcVar.h(new agdi(uri));
                return true;
            }
        }, 24)));
    }
}
