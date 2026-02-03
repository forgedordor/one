package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cklf {
    public final aiqu a;
    public final cmum b;
    public final aika c;
    private final aiqx d;

    public cklf(aiqu aiquVar, aiqx aiqxVar, cmum cmumVar, aika aikaVar) {
        this.a = aiquVar;
        this.d = aiqxVar;
        this.b = cmumVar;
        this.c = aikaVar;
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        return ((str.length() + 4) / 5) * 5;
    }

    public static engg b(ckmc ckmcVar, boolean z, boolean z2, engi engiVar) {
        engf engfVar = (engf) engg.a.createBuilder();
        int iH = h(ckmcVar);
        engfVar.copyOnWrite();
        engg enggVar = (engg) engfVar.instance;
        enggVar.e = iH - 1;
        enggVar.b |= 1;
        engfVar.copyOnWrite();
        engg enggVar2 = (engg) engfVar.instance;
        engiVar.getClass();
        enggVar2.d = engiVar;
        enggVar2.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        engfVar.copyOnWrite();
        engg enggVar3 = (engg) engfVar.instance;
        enggVar3.b |= 2;
        enggVar3.f = z;
        engfVar.copyOnWrite();
        engg enggVar4 = (engg) engfVar.instance;
        enggVar4.b |= 4;
        enggVar4.g = z2;
        return (engg) engfVar.build();
    }

    public static engg c(ckmc ckmcVar, boolean z, boolean z2, engk engkVar) {
        engf engfVar = (engf) engg.a.createBuilder();
        int iH = h(ckmcVar);
        engfVar.copyOnWrite();
        engg enggVar = (engg) engfVar.instance;
        enggVar.e = iH - 1;
        enggVar.b |= 1;
        engfVar.copyOnWrite();
        engg enggVar2 = (engg) engfVar.instance;
        enggVar2.b |= 2;
        enggVar2.f = z;
        engfVar.copyOnWrite();
        engg enggVar3 = (engg) engfVar.instance;
        enggVar3.b |= 4;
        enggVar3.g = z2;
        engfVar.copyOnWrite();
        engg enggVar4 = (engg) engfVar.instance;
        engkVar.getClass();
        enggVar4.d = engkVar;
        enggVar4.c = 104;
        return (engg) engfVar.build();
    }

    public static engg d(ckmc ckmcVar, boolean z, boolean z2, engo engoVar) {
        engf engfVar = (engf) engg.a.createBuilder();
        int iH = h(ckmcVar);
        engfVar.copyOnWrite();
        engg enggVar = (engg) engfVar.instance;
        enggVar.e = iH - 1;
        enggVar.b |= 1;
        engfVar.copyOnWrite();
        engg enggVar2 = (engg) engfVar.instance;
        engoVar.getClass();
        enggVar2.d = engoVar;
        enggVar2.c = 102;
        engfVar.copyOnWrite();
        engg enggVar3 = (engg) engfVar.instance;
        enggVar3.b |= 2;
        enggVar3.f = z;
        engfVar.copyOnWrite();
        engg enggVar4 = (engg) engfVar.instance;
        enggVar4.b |= 4;
        enggVar4.g = z2;
        return (engg) engfVar.build();
    }

    public static engi e(ckmb ckmbVar, eyga eygaVar, basd basdVar) {
        ckml ckmlVarB = ckml.b(ckmbVar.e);
        if (ckmlVarB == null) {
            ckmlVarB = ckml.UNRECOGNIZED;
        }
        civa civaVar = ckmlVarB == ckml.EMOTIFY ? civa.EMOTIFY_REACTIONS_NAMESPACE : civa.REACTIONS_NAMESPACE;
        int i = ckmbVar.e;
        if (ckml.b(i) == null) {
            ckml ckmlVar = ckml.UNRECOGNIZED;
        }
        if (ckml.b(i) == null) {
            ckml ckmlVar2 = ckml.UNRECOGNIZED;
        }
        boolean zIsPresent = civb.a(eygaVar, civaVar, "In-Reply-To-Message-Id").isPresent();
        boolean zIsPresent2 = civb.a(eygaVar, civaVar, "Message-Reply-Type").isPresent();
        engh enghVar = (engh) engi.a.createBuilder();
        enghVar.copyOnWrite();
        engi engiVar = (engi) enghVar.instance;
        engiVar.b |= 1;
        engiVar.c = zIsPresent;
        enghVar.copyOnWrite();
        engi engiVar2 = (engi) enghVar.instance;
        engiVar2.b |= 2;
        engiVar2.d = zIsPresent2;
        ckml ckmlVarB2 = ckml.b(ckmbVar.e);
        if (ckmlVarB2 == null) {
            ckmlVarB2 = ckml.UNRECOGNIZED;
        }
        boolean z = ckmlVarB2 != ckml.REACTION_TYPE_UNSPECIFIED;
        enghVar.copyOnWrite();
        engi engiVar3 = (engi) enghVar.instance;
        engiVar3.b |= 4;
        engiVar3.e = z;
        String str = basdVar.b;
        if (str != null) {
            enghVar.copyOnWrite();
            engi engiVar4 = (engi) enghVar.instance;
            engiVar4.b |= 8;
            engiVar4.f = str;
        }
        return (engi) enghVar.build();
    }

    public static engk f(ckmb ckmbVar, eyga eygaVar) {
        boolean zIsPresent = civb.a(eygaVar, civa.GSMA_RCS_NAMESPACE, "Reference-ID").isPresent();
        engj engjVar = (engj) engk.a.createBuilder();
        engjVar.copyOnWrite();
        engk engkVar = (engk) engjVar.instance;
        engkVar.b |= 1;
        engkVar.c = zIsPresent;
        ckml ckmlVarB = ckml.b(ckmbVar.e);
        if (ckmlVarB == null) {
            ckmlVarB = ckml.UNRECOGNIZED;
        }
        boolean z = ckmlVarB != ckml.REACTION_TYPE_UNSPECIFIED;
        engjVar.copyOnWrite();
        engk engkVar2 = (engk) engjVar.instance;
        engkVar2.b |= 2;
        engkVar2.d = z;
        return (engk) engjVar.build();
    }

    public static int h(ckmc ckmcVar) {
        int iOrdinal = ckmcVar.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 1 : 3;
        }
        return 2;
    }

    public final void g(MessageCoreData messageCoreData, List list, engg enggVar) {
        if (messageCoreData.t() == 0) {
            messageCoreData.bW(this.c.d(messageCoreData));
        }
        aiqx aiqxVar = this.d;
        long jT = messageCoreData.t();
        int iA = aisd.a(messageCoreData);
        Integer numValueOf = Integer.valueOf(this.b.a(-1).b());
        list.getClass();
        aiqx.b(aiqxVar, jT, iA, numValueOf, list, enggVar, null, null, null, 224);
    }
}
