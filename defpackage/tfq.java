package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfq implements tdg {
    public final Context a;
    public final fcyh b;
    public final fdjx c;
    public final ConversationId d;
    public final tfh e;
    public final aglr f;
    public final afzc g;
    public final tfx h;

    public tfq(Context context, fcyh fcyhVar, fdjx fdjxVar, ConversationId conversationId, tfh tfhVar, aglr aglrVar, afzc afzcVar, tfx tfxVar) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        conversationId.getClass();
        aglrVar.getClass();
        afzcVar.getClass();
        tfxVar.getClass();
        this.a = context;
        this.b = fcyhVar;
        this.c = fdjxVar;
        this.d = conversationId;
        this.e = tfhVar;
        this.f = aglrVar;
        this.g = afzcVar;
        this.h = tfxVar;
    }

    @Override // defpackage.tdg
    public final fdvc a() {
        tfx tfxVar = this.h;
        return egwx.a(fdqc.b(fdqq.a(new fdua(new tfu(tfxVar.c, tfxVar), anov.a(tfxVar.e), new tfv(tfxVar, null))), this.b), this.c, new tfl(this));
    }

    @Override // defpackage.tdg
    public final boolean b() {
        Object objE = ((cczi) tet.k.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }
}
