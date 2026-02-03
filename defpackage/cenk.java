package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ceno b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cenk(fcxy fcxyVar, ceno cenoVar) {
        super(2, fcxyVar);
        this.b = cenoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cenk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Iterator it;
        Object obj2 = fcyl.a;
        if (this.a != 0) {
            it = (Iterator) this.c;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            Set setF = ((cozg) this.b.f.b()).f(coze.c);
            if (setF.isEmpty()) {
                ekrw ekrwVarH = ceno.a.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/TachyonTachygramBindDelegate$bindAllIdentitiesForTachygramIfNeeded$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 55, "TachyonTachygramBindDelegate.kt")).q("No TG identities in CTC, skipping channel binding.");
                return fctx.a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : setF) {
                aubq aubqVar = (aubq) obj3;
                aubp aubpVarB = aubp.b(aubqVar.c);
                if (aubpVarB == null) {
                    aubpVarB = aubp.UNKNOWN_TYPE;
                }
                if (aubpVarB != aubp.PHONE) {
                    ekrw ekrwVarH2 = ceno.a.h();
                    ekrwVarH2.X(eksq.a, "BugleNetwork");
                    ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/net/TachyonTachygramBindDelegate", "filterNonEmptyPhoneId", 68, "TachyonTachygramBindDelegate.kt")).t("Not a phone identity, skipping TG channel binding for id=%s.", aubqVar.d);
                } else {
                    String str = aubqVar.d;
                    str.getClass();
                    if (str.length() == 0) {
                        ekrw ekrwVarH3 = ceno.a.h();
                        ekrwVarH3.X(eksq.a, "BugleNetwork");
                        ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/net/TachyonTachygramBindDelegate", "filterNonEmptyPhoneId", 71, "TachyonTachygramBindDelegate.kt")).q("Skip Phone bind because RCS MSISDN is empty.");
                    } else {
                        arrayList.add(obj3);
                    }
                }
            }
            it = arrayList.iterator();
        }
        while (it.hasNext()) {
            aubq aubqVar2 = (aubq) it.next();
            ceno cenoVar = this.b;
            this.c = it;
            this.a = 1;
            Object objA = fdin.a(eicg.a(cenoVar.c), new cenn(null, aubqVar2, cenoVar), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cenk cenkVar = new cenk(fcxyVar, this.b);
        cenkVar.c = obj;
        return cenkVar;
    }
}
