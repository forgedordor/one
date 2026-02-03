package defpackage;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqi {
    public static final ekrg a = ekrg.c("com/google/chat/smartmessaging/smartreply/android/templating/Templater");
    public static final ejqb b;
    public static final ejqb c;
    public static final ejqb d;
    public static final ejqb e;
    public final ekgd f;
    public final ejpw g;
    public final boolean h;
    public final boolean i;

    static {
        ejqa ejqaVar = (ejqa) ejqb.a.createBuilder();
        ezan ezanVar = ezan.FULL_MESSAGE;
        ejqaVar.copyOnWrite();
        ejqb ejqbVar = (ejqb) ejqaVar.instance;
        ejqbVar.c = ezanVar.a();
        ejqbVar.b |= 1;
        ejqaVar.copyOnWrite();
        ejqb ejqbVar2 = (ejqb) ejqaVar.instance;
        ejqbVar2.h = ezaq.a(3);
        ejqbVar2.b |= 8;
        ejqaVar.a(PredictorResult.Types.REPLY_SUGGESTION);
        b = (ejqb) ejqaVar.build();
        ejqa ejqaVar2 = (ejqa) ejqb.a.createBuilder();
        ezan ezanVar2 = ezan.SPAM;
        ejqaVar2.copyOnWrite();
        ejqb ejqbVar3 = (ejqb) ejqaVar2.instance;
        ejqbVar3.c = ezanVar2.a();
        ejqbVar3.b |= 1;
        ejqaVar2.copyOnWrite();
        ejqb ejqbVar4 = (ejqb) ejqaVar2.instance;
        ejqbVar4.h = ezaq.a(3);
        ejqbVar4.b |= 8;
        ejqaVar2.a("SPAM");
        c = (ejqb) ejqaVar2.build();
        ejqa ejqaVar3 = (ejqa) ejqb.a.createBuilder();
        ezan ezanVar3 = ezan.CATEGORY_BERT;
        ejqaVar3.copyOnWrite();
        ejqb ejqbVar5 = (ejqb) ejqaVar3.instance;
        ejqbVar5.c = ezanVar3.a();
        ejqbVar5.b |= 1;
        ejqaVar3.copyOnWrite();
        ejqb ejqbVar6 = (ejqb) ejqaVar3.instance;
        ejqbVar6.h = ezaq.a(3);
        ejqbVar6.b |= 8;
        ejqaVar3.a("CATEGORY_BERT");
        d = (ejqb) ejqaVar3.build();
        ejqa ejqaVar4 = (ejqa) ejqb.a.createBuilder();
        ezan ezanVar4 = ezan.CATEGORY_BERT;
        ejqaVar4.copyOnWrite();
        ejqb ejqbVar7 = (ejqb) ejqaVar4.instance;
        ejqbVar7.c = ezanVar4.a();
        ejqbVar7.b |= 1;
        ejqaVar4.copyOnWrite();
        ejqb ejqbVar8 = (ejqb) ejqaVar4.instance;
        ejqbVar8.h = ezaq.a(4);
        ejqbVar8.b |= 8;
        ejqaVar4.a("CATEGORY_BERT");
        e = (ejqb) ejqaVar4.build();
    }

    public ejqi(ejpw ejpwVar, ekgd ekgdVar, boolean z, boolean z2) {
        this.g = ejpwVar;
        this.f = ekgdVar;
        this.h = z;
        this.i = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ekgb a(ekgb ekgbVar) {
        ekfw ekfwVar = new ekfw();
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            ejmm ejmmVar = (ejmm) ekgbVar.get(i);
            if (!ejmmVar.e().isEmpty()) {
                ezcs ezcsVar = (ezcs) ezct.a.createBuilder();
                String strE = ejmmVar.e();
                ezcsVar.copyOnWrite();
                ((ezct) ezcsVar.instance).b = strE;
                ekfwVar.h((ezct) ezcsVar.build());
            }
        }
        return ekfwVar.g();
    }

    public static ezgf b(ejmo ejmoVar, ejqg ejqgVar, ezan ezanVar) {
        ezgr ezgrVar = (ezgr) ezgs.a.createBuilder();
        ejpg ejpgVar = (ejpg) ejqgVar;
        Optional optional = ejpgVar.c;
        if (optional.isPresent()) {
            Object obj = optional.get();
            ezgrVar.copyOnWrite();
            ((ezgs) ezgrVar.instance).c = (String) obj;
        }
        Optional optional2 = ejpgVar.d;
        if (optional2.isPresent()) {
            Object obj2 = optional2.get();
            ezgrVar.copyOnWrite();
            ((ezgs) ezgrVar.instance).d = (String) obj2;
        }
        Optional optional3 = ejpgVar.e;
        if (optional3.isPresent()) {
            ezew ezewVar = (ezew) ezex.a.createBuilder();
            long jLongValue = ((Long) optional3.get()).longValue();
            ezewVar.copyOnWrite();
            ((ezex) ezewVar.instance).b = jLongValue;
            ezgrVar.copyOnWrite();
            ezgs ezgsVar = (ezgs) ezgrVar.instance;
            ezex ezexVar = (ezex) ezewVar.build();
            ezexVar.getClass();
            ezgsVar.e = ezexVar;
            ezgsVar.b |= 1;
        }
        ezgf ezgfVarC = c(ejmoVar, ezanVar, ejpgVar.f);
        ezgfVarC.copyOnWrite();
        ezgg ezggVar = (ezgg) ezgfVarC.instance;
        ezgs ezgsVar2 = (ezgs) ezgrVar.build();
        evsy evsyVar = ezgg.a;
        ezgsVar2.getClass();
        ezggVar.j = ezgsVar2;
        ezggVar.c |= 2;
        return ezgfVarC;
    }

    public static ezgf c(ejmo ejmoVar, ezan ezanVar, Optional optional) {
        ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
        float fFloatValue = optional.isPresent() ? ((Float) optional.get()).floatValue() : ejmoVar.a();
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).f = fFloatValue;
        ezdh ezdhVar = (ezdh) ezdi.a.createBuilder();
        String strD = ejmoVar.d();
        ezdhVar.copyOnWrite();
        ((ezdi) ezdhVar.instance).b = strD;
        ezdhVar.a(a(ejmoVar.b()));
        ezgfVar.copyOnWrite();
        ezgg ezggVar = (ezgg) ezgfVar.instance;
        ezdi ezdiVar = (ezdi) ezdhVar.build();
        ezdiVar.getClass();
        ezggVar.i = ezdiVar;
        ezggVar.c |= 1;
        ezal ezalVarC = ejmoVar.c();
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).g = ezalVarC.a();
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).l = ezanVar.a();
        return ezgfVar;
    }
}
