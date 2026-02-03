package defpackage;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejog implements ejop {
    private final euob a;
    private final ejhz b;

    public ejog(ejhz ejhzVar, ejkt ejktVar) throws ejkv {
        if (ejhzVar == null) {
            throw new ejkv("HobbesChatJniAdapter: config is null.");
        }
        this.b = ejhzVar;
        if ((ejhzVar.b & 1) == 0) {
            throw new ejkv("HobbesChatJniAdapter: cannot initialize without a model file.");
        }
        int iA = ejil.a(ejhzVar.f);
        iA = iA == 0 ? 2 : iA;
        ejha ejhaVar = ejhzVar.c;
        this.a = ejktVar.b(iA, ejhaVar == null ? ejha.a : ejhaVar);
    }

    @Override // defpackage.ejop
    public final ArrayList a(ezcy ezcyVar, Locale locale) throws ejkv {
        ezdx ezdxVar = ezcyVar.f;
        if (ezdxVar == null) {
            ezdxVar = ezdx.a;
        }
        evtg evtgVar = ezdxVar.b;
        if (!evtgVar.isEmpty()) {
            ezdv ezdvVar = (ezdv) ekis.j(evtgVar);
            if (!(ezdvVar.b == 30 ? (String) ezdvVar.c : "").isEmpty() && !ezcyVar.g.equals(((ezdv) ekis.j(evtgVar)).d)) {
                List listA = ejoh.a(ezcyVar, System.currentTimeMillis());
                ejhz ejhzVar = this.b;
                int i = (ejhzVar.b & 2) != 0 ? ezcyVar.h * ejhzVar.e : ezcyVar.h;
                HashMap map = new HashMap();
                for (ejhy ejhyVar : ejhzVar.d) {
                    if (ejhyVar.b == 2) {
                        String str = ejhyVar.d;
                        Integer num = (Integer) ejhyVar.c;
                        num.intValue();
                        map.put(str, num);
                    }
                    if (ejhyVar.b == 3) {
                        String str2 = ejhyVar.d;
                        Float f = (Float) ejhyVar.c;
                        f.floatValue();
                        map.put(str2, f);
                    }
                    if (ejhyVar.b == 4) {
                        String str3 = ejhyVar.d;
                        Boolean bool = (Boolean) ejhyVar.c;
                        bool.booleanValue();
                        map.put(str3, bool);
                    }
                }
                try {
                    Map<String, List<? extends PredictorResult.Prediction>> mapGeneratePredictions = this.a.generatePredictions(new euoe(listA, map), ekgp.l(PredictorResult.Types.REPLY_SUGGESTION, Integer.valueOf(i)));
                    ArrayList arrayList = new ArrayList();
                    if (mapGeneratePredictions != null) {
                        for (String str4 : mapGeneratePredictions.keySet()) {
                            for (PredictorResult.Prediction prediction : mapGeneratePredictions.get(str4)) {
                                if (str4.equals(PredictorResult.Types.REPLY_SUGGESTION)) {
                                    PredictorResult.TextPrediction textPrediction = (PredictorResult.TextPrediction) prediction;
                                    ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
                                    ezgj ezgjVar = (ezgj) ezgk.a.createBuilder();
                                    String str5 = textPrediction.text;
                                    ezgjVar.copyOnWrite();
                                    ezgk ezgkVar = (ezgk) ezgjVar.instance;
                                    str5.getClass();
                                    ezgkVar.c = str5;
                                    ezghVar.copyOnWrite();
                                    ezgi ezgiVar = (ezgi) ezghVar.instance;
                                    ezgk ezgkVar2 = (ezgk) ezgjVar.build();
                                    ezgkVar2.getClass();
                                    ezgiVar.d = ezgkVar2;
                                    ezgiVar.c = 2;
                                    ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
                                    float f2 = textPrediction.score;
                                    ezgfVar.copyOnWrite();
                                    ((ezgg) ezgfVar.instance).f = f2;
                                    ezal ezalVar = ezal.HOBBES_CHAT_ON_DEVICE;
                                    ezgfVar.copyOnWrite();
                                    ((ezgg) ezgfVar.instance).g = ezalVar.a();
                                    ezan ezanVar = ezan.FULL_MESSAGE;
                                    ezgfVar.copyOnWrite();
                                    ((ezgg) ezgfVar.instance).l = ezanVar.a();
                                    ezghVar.copyOnWrite();
                                    ezgi ezgiVar2 = (ezgi) ezghVar.instance;
                                    ezgg ezggVar = (ezgg) ezgfVar.build();
                                    ezggVar.getClass();
                                    ezgiVar2.e = ezggVar;
                                    ezgiVar2.b |= 1;
                                    arrayList.add((ezgi) ezghVar.build());
                                }
                            }
                        }
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw new ejkv("HobbesChatJniAdapter: Exception/Error getting suggestions from HobbesChatJni.", th);
                }
            }
        }
        return new ArrayList();
    }

    @Override // defpackage.ejop
    public final /* synthetic */ void b() {
    }
}
