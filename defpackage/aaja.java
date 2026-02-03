package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaja implements tdg {
    public final Context a;
    public final fdjx b;
    public final Conversation c;
    private final fdpl d;

    public aaja(Context context, fdjx fdjxVar, fdpl fdplVar, Conversation conversation) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        conversation.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.d = fdplVar;
        this.c = conversation;
    }

    @Override // defpackage.tdg
    public final fdvc a() {
        return egwx.a(this.d, this.b, new aaix(this));
    }

    @Override // defpackage.tdg
    public final boolean b() {
        return true;
    }
}
