package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vkx extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ vky c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkx(vky vkyVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = vkyVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vkx vkxVar = new vkx(this.c, (fcxy) obj3);
        vkxVar.a = (ekgb) obj;
        vkxVar.b = (ajlk) obj2;
        return vkxVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final vky vkyVar = this.c;
        Context context = vkyVar.a;
        Object obj2 = this.a;
        final ?? r4 = this.b;
        String string = context.getString(R.string.notifications);
        string.getClass();
        final ekgb ekgbVar = (ekgb) obj2;
        return new dihq(string, djrr.cF, false, false, false, false, null, false, null, new fdae() { // from class: vkw
            @Override // defpackage.fdae
            public final Object invoke() {
                ajlk ajlkVar = r4;
                ConversationId conversationIdD = ajlkVar.d();
                String strM = ajlkVar.m();
                strM.getClass();
                bvdk bvdkVarI = ajlkVar.i();
                conversationIdD.getClass();
                ResolvedRecipient resolvedRecipient = ajlkVar.c() != ajlj.GROUP ? (ResolvedRecipient) fcva.N(ekgbVar) : null;
                vkyVar.b.h(new agdw(conversationIdD, strM, resolvedRecipient, bvdkVarI));
                return fctx.a;
            }
        }, 996);
    }
}
