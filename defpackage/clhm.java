package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhm extends fcyz implements fdat {
    int a;
    final /* synthetic */ clhq b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clhm(fcxy fcxyVar, clhq clhqVar, int i) {
        super(2, fcxyVar);
        this.b = clhqVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clhm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarF = this.b.b.f("EMERGENCY+SERVICE+PROVIDER");
            eijuVarF.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarF, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            int iN = ((bojh) optional.get()).n();
            int i2 = this.c;
            if (iN != i2) {
                ekrw ekrwVarH = clhq.a.h();
                ekrwVarH.X(eksq.a, "BugleSatellite");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrdVar.X(cqnc.s, ((bojh) optional.get()).C());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/satelliteapi/conversation/EmergencyConversationOperations$changeEmergencyConversationStateIfPresent$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 195, "EmergencyConversationOperations.kt")).t("Updating emergency conversation joinedState to [%s]", bvdh.a(i2));
                bakt baktVar = (bakt) this.b.c.b();
                ConversationIdType conversationIdTypeC = ((bojh) optional.get()).C();
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.A(i2);
                baktVar.W(conversationIdTypeC, boteVar);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clhm clhmVar = new clhm(fcxyVar, this.b, this.c);
        clhmVar.d = obj;
        return clhmVar;
    }
}
