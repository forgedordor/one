package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aajq extends fcyz implements fdaz {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ boolean f;
    /* synthetic */ Object g;
    final /* synthetic */ aajt h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aajq(aajt aajtVar, fcxy fcxyVar) {
        super(8, fcxyVar);
        this.h = aajtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ajlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ResolvedRecipient resolvedRecipient;
        String strA;
        String strY;
        fctl.b(obj);
        final ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        ?? r4 = this.d;
        Object obj4 = this.e;
        boolean z = this.f;
        Object obj5 = this.g;
        if (obj3 != null) {
            return new dlnn((String) obj3, null, false, new aajp(this.h), new fdae() { // from class: dlnm
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, new dlnl(0, false, 3));
        }
        final aajt aajtVar = this.h;
        List list = ((zqw) obj2).a;
        if (!list.isEmpty()) {
            return new dlnp(String.valueOf(list.size()), null, null, false, null, new dlnl((int) ((Number) aajtVar.i.b()).longValue(), false, 2), null, 190);
        }
        fcsu fcsuVar = aajtVar.h;
        akbl akblVar = akbl.b;
        final ekgb ekgbVar = (ekgb) r4;
        dkpf dkpfVarB = ((cphz) fcsuVar.b()).b(r1, ekgbVar);
        String strM = r1.m();
        if (strM == null) {
            strM = "";
        }
        String strSubstring = strM.substring(0, Math.min(strM.length(), 100));
        strSubstring.getClass();
        if (r1.c() != ajlj.ONE_ON_ONE) {
            resolvedRecipient = null;
        } else if (((aqsc) aajtVar.k.b()).a()) {
            resolvedRecipient = (ResolvedRecipient) fcva.Y(r4);
            if (resolvedRecipient == null) {
                ekrw ekrwVarJ = aajt.a.j();
                ekrwVarJ.X(eksq.a, "BugleConversation");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.t, r1.d());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/topcontent/topappbar/TopAppBarMiddleUiAdapterImpl", "getOneOnOneRecipientOrNull", 255, "TopAppBarMiddleUiAdapterImpl.kt")).q("Missing a single recipient for 1:1 conversation, can't render top bar.");
            }
        } else {
            resolvedRecipient = (ResolvedRecipient) fcva.X(r4);
        }
        if (resolvedRecipient == null || (strY = resolvedRecipient.y()) == null) {
            strA = null;
        } else {
            String strA2 = aqbw.a() ? cssf.a(strY) : aajtVar.e.d(strY);
            strA2.getClass();
            strA = chsk.a(strA2);
        }
        return new dlnp(strSubstring, strA, dkpfVarB != null ? new dkrk(dkpfVarB, null, 0, 0, 0.0f, null, 62) : null, ((Boolean) aajtVar.g.b()).booleanValue() && (obj4 != null || z), (dlmg) obj4, new dlnl((int) ((Number) aajtVar.i.b()).longValue(), false, 2), obj5 == akblVar ? new fdae() { // from class: aajo
            @Override // defpackage.fdae
            public final Object invoke() {
                aajtVar.n.a(r1, ekgbVar);
                return fctx.a;
            }
        } : null, 8);
    }

    @Override // defpackage.fdaz
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
        aajq aajqVar = new aajq(this.h, (fcxy) obj8);
        aajqVar.a = (ajlk) obj;
        aajqVar.b = (zqw) obj2;
        aajqVar.c = (String) obj3;
        aajqVar.d = (ekgb) obj4;
        aajqVar.e = (dlmg) obj5;
        aajqVar.f = zBooleanValue;
        aajqVar.g = (akbl) obj7;
        return aajqVar.b(fctx.a);
    }
}
