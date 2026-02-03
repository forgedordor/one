package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clho extends fcyz implements fdat {
    int a;
    final /* synthetic */ clhq b;
    final /* synthetic */ alqm c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clho(fcxy fcxyVar, clhq clhqVar, alqm alqmVar, int i) {
        super(2, fcxyVar);
        this.b = clhqVar;
        this.c = alqmVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clho) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        bojh bojhVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            clhq clhqVar = this.b;
            ParticipantsTable.BindData bindDataA = clhqVar.a(this.c);
            eiju eijuVarM = clhqVar.b.m(bindDataA.T(), new clhp(bindDataA));
            eijuVarM.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarM, this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            bojhVar = (bojh) this.e;
            fctl.b(obj);
            bojh bojhVarR = ((bakt) this.b.c.b()).r(bojhVar.C());
            bojhVarR.getClass();
            return bojhVarR;
        }
        fctl.b(obj);
        int i2 = this.d;
        bojh bojhVar2 = (bojh) obj;
        if (i2 == 9) {
            if (bojhVar2.n() != 9) {
                clhq clhqVar2 = this.b;
                this.e = bojhVar2;
                this.a = 2;
                if (clhqVar2.d(this) != fcylVar) {
                    bojhVar = bojhVar2;
                    bojh bojhVarR2 = ((bakt) this.b.c.b()).r(bojhVar.C());
                    bojhVarR2.getClass();
                    return bojhVarR2;
                }
                return fcylVar;
            }
            i2 = 9;
        }
        clhq clhqVar3 = this.b;
        if (!clhq.f(this.c) || i2 != 0) {
            bojhVar2.getClass();
            return bojhVar2;
        }
        bojhVar2.getClass();
        if (bojhVar2.n() != 9) {
            return bojhVar2;
        }
        ekrw ekrwVarH = clhq.a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.s, bojhVar2.C());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/satelliteapi/conversation/EmergencyConversationOperations", "resumeEmergencyConversationIfDisabled", 219, "EmergencyConversationOperations.kt")).q("Resuming disabled emergency conversation");
        fcsu fcsuVar = clhqVar3.c;
        bakt baktVar = (bakt) fcsuVar.b();
        ConversationIdType conversationIdTypeC = bojhVar2.C();
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("resumeEmergencyConversationIfDisabled");
        boteVar.A(0);
        baktVar.W(conversationIdTypeC, boteVar);
        bojh bojhVarR3 = ((bakt) fcsuVar.b()).r(bojhVar2.C());
        bojhVarR3.getClass();
        return bojhVarR3;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clho clhoVar = new clho(fcxyVar, this.b, this.c, this.d);
        clhoVar.e = obj;
        return clhoVar;
    }
}
