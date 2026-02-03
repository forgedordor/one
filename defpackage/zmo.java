package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmo {
    public final cwuj a;
    public final Context b;
    public final ahax c;
    public final zwj d;
    public final fcsu e;
    public final fcsu f;
    public final fdpl g;
    public final afzc h;

    public zmo(cwuj cwujVar, Context context, ahax ahaxVar, zwj zwjVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdpl fdplVar, fdpl fdplVar2, fdjx fdjxVar, Conversation conversation, fdpl fdplVar3, afzc afzcVar) {
        cwujVar.getClass();
        context.getClass();
        ahaxVar.getClass();
        fcsuVar3.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        fdjxVar.getClass();
        conversation.getClass();
        afzcVar.getClass();
        this.a = cwujVar;
        this.b = context;
        this.c = ahaxVar;
        this.d = zwjVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fdplVar3;
        this.h = afzcVar;
        fctd.a(new fdae() { // from class: zmg
            @Override // defpackage.fdae
            public final Object invoke() {
                return (tlj) this.a.f.b();
            }
        });
    }

    public final djzh a(int i, djrr djrrVar) {
        String string = this.b.getString(i);
        string.getClass();
        return new djzh(string, djrrVar, (List) null, false, 28);
    }
}
