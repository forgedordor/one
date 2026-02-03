package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xqr extends fcyz implements fdav {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ xqu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqr(xqu xquVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.e = xquVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        xqr xqrVar = new xqr(this.e, (fcxy) obj4);
        xqrVar.b = (ekgb) obj;
        xqrVar.c = (Optional) obj2;
        xqrVar.d = zBooleanValue;
        return xqrVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ResolvedRecipient resolvedRecipient;
        final ResolvedRecipient resolvedRecipient2;
        boolean z;
        fcyl fcylVar = fcyl.a;
        if (this.a == 0) {
            fctl.b(obj);
            ekgb ekgbVar = (ekgb) this.b;
            Object obj2 = this.c;
            boolean z2 = this.d;
            if (((Boolean) ((cczi) crvx.a.get()).e()).booleanValue()) {
                xqu xquVar = this.e;
                if ((xquVar.d instanceof EmergencyConversationId) || !((Boolean) ((cczi) crvx.k.get()).e()).booleanValue() || (resolvedRecipient = (ResolvedRecipient) fcva.Y(ekgbVar)) == null) {
                    return null;
                }
                this.b = resolvedRecipient;
                this.d = z2;
                this.a = 1;
                if (xquVar.a(resolvedRecipient, (Optional) obj2, this) == fcylVar) {
                    return fcylVar;
                }
                resolvedRecipient2 = resolvedRecipient;
                z = z2;
            }
            return null;
        }
        z = this.d;
        resolvedRecipient2 = (ResolvedRecipient) this.b;
        fctl.b(obj);
        if (!z) {
            return null;
        }
        final xqu xquVar2 = this.e;
        ((crwg) xquVar2.h.b()).g(1);
        Context context = xquVar2.a;
        String string = context.getString(R.string.unsubscribe_toolstone);
        string.getClass();
        String string2 = context.getString(R.string.unsubscribe_toolstone_link);
        string2.getClass();
        return new dlls("ChatbotUnsubscribeToolstone", string, null, fcva.b(new diin(dijs.h, fdgn.O(string, string2, 0, false, 6), fdgn.O(string, string2, 0, false, 6) + string2.length(), string, new fdap() { // from class: xqo
            @Override // defpackage.fdap
            public final Object invoke(Object obj3) {
                final xqu xquVar3 = xquVar2;
                ((crwg) xquVar3.h.b()).g(2);
                final ResolvedRecipient resolvedRecipient3 = resolvedRecipient2;
                xquVar3.g.b(new fdap() { // from class: xqq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        ahat ahatVar = (ahat) obj4;
                        ahatVar.getClass();
                        xqu xquVar4 = xquVar3;
                        return ((ctez) xquVar4.f.b()).a(ahatVar, resolvedRecipient3, xquVar4.c.d(), crvz.b);
                    }
                });
                return true;
            }
        })), new fdae() { // from class: xqp
            @Override // defpackage.fdae
            public final Object invoke() {
                xqu xquVar3 = xquVar2;
                ((crwg) xquVar3.h.b()).g(3);
                auvw.m(xquVar3.b, null, new xqs(xquVar3, resolvedRecipient2, null), 3);
                return fctx.a;
            }
        }, 4);
    }
}
