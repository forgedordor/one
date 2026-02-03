package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvxg extends fcyz implements fdax {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ cvxj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvxg(cvxj cvxjVar, fcxy fcxyVar) {
        super(6, fcxyVar);
        this.f = cvxjVar;
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        cvxg cvxgVar = new cvxg(this.f, (fcxy) obj6);
        cvxgVar.a = (ajlk) obj;
        cvxgVar.b = (dihq) obj2;
        cvxgVar.c = (cvxw) obj3;
        cvxgVar.d = (aoer) obj4;
        cvxgVar.e = (ekgb) obj5;
        return cvxgVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ajlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aoer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Context context;
        int i;
        fctl.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        final cvxj cvxjVar = this.f;
        final ?? r5 = this.d;
        ?? r6 = this.e;
        if (cvxjVar.e instanceof PenpalBotConversationId) {
            ekrw ekrwVarH = cvxj.a.h();
            ekrwVarH.X(eksq.a, "BugleCdp");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/conversation/details/encryption/EncryptionUiAdapterImpl", "internalCreateUiData", 102, "EncryptionUiAdapterImpl.kt")).q("Conversation is penpal. Action list will be empty");
            int i2 = ekgb.d;
            ekgb ekgbVar = ekoe.a;
            ekgbVar.getClass();
            return new cvxk(ekgbVar);
        }
        boolean z = obj3 != null && ((cvxw) obj3).b == 1;
        if (z) {
            context = cvxjVar.b;
            i = R.string.on_text;
        } else {
            context = cvxjVar.b;
            i = R.string.off_text;
        }
        String string = context.getString(i);
        string.getClass();
        Context context2 = cvxjVar.b;
        String string2 = context2.getString(R.string.e2e_encryption, string);
        string2.getClass();
        String string3 = context2.getString(R.string.more_about_rcs_chats);
        string3.getClass();
        String str = obj3 != null ? ((cvxw) obj3).a : null;
        if (str == null || r5 == 0) {
            ekrw ekrwVarH2 = cvxj.a.h();
            ekrwVarH2.X(eksq.a, "BugleCdp");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/ui/conversation/details/encryption/EncryptionUiAdapterImpl", "internalCreateUiData", 117, "EncryptionUiAdapterImpl.kt")).q("E2eeStatusUiAdapter returned empty status text or active self identity is empty.");
            int i3 = ekgb.d;
            ekgb ekgbVar2 = ekoe.a;
            ekgbVar2.getClass();
            return new cvxk(ekgbVar2);
        }
        fcww fcwwVar = new fcww((byte[]) null);
        dijs dijsVar = z ? dijs.m : dijs.l;
        int iO = fdgn.O(string2, string, 0, false, 6);
        int iO2 = fdgn.O(str, string3, 0, false, 6);
        ekgb ekgbVarS = ekgb.s(new diin(dijsVar, iO, iO + string.length(), (fdap) null, 24), new diin(dijs.d, iO, iO + string.length(), (fdap) null, 24));
        ekgbVarS.getClass();
        fcwwVar.add(new dkdi(1, ekgbVarS));
        final dihq dihqVar = (dihq) obj2;
        ekgb ekgbVarR = ekgb.r(new diio(string3, iO2, iO2 + string3.length(), new fdap() { // from class: cvxd
            @Override // defpackage.fdap
            public final Object invoke(Object obj4) {
                dihqVar.k.invoke();
                return false;
            }
        }, 24));
        ekgbVarR.getClass();
        fcwwVar.add(new dkdi(2, ekgbVarR));
        ekgb ekgbVarA = ekfv.a(fcva.a(fcwwVar));
        fcww fcwwVar2 = new fcww((byte[]) null);
        fcwwVar2.add(new dkeg(string2, str, null, ekgbVarA, null, new dkdk(z ? djrr.cj : djrr.cl), null, new fdae() { // from class: cvxe
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, 84));
        String strO = ((ekgb) r6).size() == 1 ? ((ResolvedRecipient) fcva.N(r6)).g().o() : null;
        if (r1.c() != ajlj.GROUP && z && strO != null && strO.length() != 0) {
            String string4 = context2.getString(R.string.verify_encryption);
            string4.getClass();
            fcwwVar2.add(new dkeg(string4, null, null, null, null, new dkdk(djrr.aY), null, new fdae() { // from class: cvxf
                @Override // defpackage.fdae
                public final Object invoke() {
                    cvxjVar.g.invoke(r5);
                    return fctx.a;
                }
            }, 94));
        }
        return new cvxk(ekfv.a(fcva.a(fcwwVar2)));
    }
}
