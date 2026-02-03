package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aajc extends fcyz implements fdax {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ aajg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aajc(aajg aajgVar, fcxy fcxyVar) {
        super(6, fcxyVar);
        this.f = aajgVar;
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        aajc aajcVar = new aajc(this.f, (fcxy) obj6);
        aajcVar.a = (List) obj;
        aajcVar.b = (aahj) obj2;
        aajcVar.c = zBooleanValue;
        aajcVar.d = (ResolvedRecipient) obj4;
        aajcVar.e = (Optional) obj5;
        return aajcVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        aahj aahjVar;
        djrr djrrVar;
        anvx anvxVar;
        fctl.b(obj);
        ?? r5 = this.a;
        Object obj2 = this.b;
        boolean z = this.c;
        ?? r1 = this.d;
        Optional optional = (Optional) this.e;
        dihr dihrVar = null;
        if (!optional.isPresent()) {
            return null;
        }
        anvx anvxVar2 = (anvx) optional.get();
        if (z || (djrrVar = (aahjVar = (aahj) obj2).b) == null) {
            anvxVar = anvxVar2;
        } else {
            dihr dihrVar2 = new dihr(aahjVar.a, djrrVar, aahjVar.e);
            anvxVar = anvxVar2;
            dihrVar = dihrVar2;
        }
        dkty dktyVar = new dkty(r1.c(cpbl.b));
        dihr dihrVar3 = dihrVar;
        String strC = anvxVar.c();
        bktm bktmVar = anvxVar.a;
        final aajg aajgVar = this.f;
        final anvx anvxVar3 = anvxVar;
        return new aajh(new dktz(dihrVar3, dktyVar, bktmVar.h(), strC, r5, new fdae() { // from class: aajb
            @Override // defpackage.fdae
            public final Object invoke() {
                String strB = anvxVar3.b();
                aajg aajgVar2 = aajgVar;
                ((ajhd) aajgVar2.b.b()).am(2, elrk.BIZINFO_SOURCE_CONVERSATION_AVATAR, strB);
                aajgVar2.c.h(new agde(aajgVar2.a, strB));
                return fctx.a;
            }
        }), (aahj) obj2);
    }
}
