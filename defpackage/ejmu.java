package defpackage;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmu implements ejmp {
    private final ejkz a;
    private final ekgp b;
    private final ekgp c;
    private final ekgp d;
    private final int e;
    private final boolean f;
    private final int g;

    public ejmu(ejkz ejkzVar, ekgp ekgpVar, ekgp ekgpVar2, ekgp ekgpVar3, int i, boolean z, int i2) {
        this.a = ejkzVar;
        this.b = ekgpVar;
        this.c = ekgpVar2;
        this.d = ekgpVar3;
        this.e = i;
        this.g = i2;
        this.f = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ejmp
    public final ekgb a(ezdx ezdxVar, String str, ejqq ejqqVar) throws ejkv {
        String str2;
        ezdx ezdxVar2 = ezdxVar;
        if (ezdxVar2 == null) {
            throw new ejkv("LinguaModel: MessageStream is null.");
        }
        try {
            ejky ejkyVarA = this.a.a();
            try {
                euob euobVar = (euob) ejkyVarA.a();
                if (euobVar == null) {
                    throw new ejkv("LinguaModel: predictor is null.");
                }
                int i = this.g;
                int i2 = 0;
                if (i > 0) {
                    int size = ezdxVar2.b.size();
                    ezdw ezdwVar = (ezdw) ezdxVar2.toBuilder();
                    ezdwVar.copyOnWrite();
                    ((ezdx) ezdwVar.instance).b = ezdx.emptyProtobufList();
                    ezdwVar.a(ezdxVar2.b.subList(Math.max(size - i, 0), size));
                    ezdxVar2 = (ezdx) ezdwVar.build();
                }
                evtg evtgVar = ezdxVar2.b;
                if (!evtgVar.isEmpty()) {
                    ezdv ezdvVar = (ezdv) evtgVar.get(evtgVar.size() - 1);
                    int i3 = 30;
                    if (!(ezdvVar.b == 30 ? (String) ezdvVar.c : "").isEmpty()) {
                        List listB = ejmv.b(ezdxVar2.b, str, System.currentTimeMillis() / 1000.0f);
                        ekgi ekgiVar = new ekgi();
                        ekgiVar.g(this.d);
                        if (this.f) {
                            ekgi ekgiVar2 = new ekgi();
                            for (ejqo ejqoVar : ejqqVar.b) {
                                String str3 = ejqoVar.b;
                                if (str3.startsWith("SPToken_")) {
                                    ekgiVar2.i(Integer.valueOf(Integer.parseInt(str3.substring(8))), Float.valueOf(ejqoVar.c));
                                }
                            }
                            ekgp ekgpVarC = ekgiVar2.c();
                            int i4 = ((ekoj) ekgpVarC).d;
                            int[] iArr = new int[i4];
                            float[] fArr = new float[i4];
                            ekqg ekqgVarListIterator = ekgpVarC.entrySet().listIterator();
                            int i5 = 0;
                            while (ekqgVarListIterator.hasNext()) {
                                Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                                iArr[i5] = ((Integer) entry.getKey()).intValue();
                                fArr[i5] = ((Float) entry.getValue()).floatValue();
                                i5++;
                            }
                            ekgiVar.g(ekgp.m("user_profile_token_index", iArr, "user_profile_token_weight", fArr));
                        }
                        Map<String, List<? extends PredictorResult.Prediction>> mapGeneratePredictions = euobVar.generatePredictions(new euoe(listB, ekgiVar.c()), this.b);
                        ejkyVarA.close();
                        int iC = ejkw.c(ezdxVar2, str);
                        if (mapGeneratePredictions == null) {
                            int i6 = ekgb.d;
                            return ekoe.a;
                        }
                        int i7 = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        int iMax = Math.max(0, evtgVar.size() - this.e);
                        while (iMax < evtgVar.size()) {
                            ezdv ezdvVar2 = (ezdv) evtgVar.get(iMax);
                            for (ezds ezdsVar : ezdvVar2.f) {
                                int i8 = ezdsVar.c;
                                if (i8 == 6) {
                                    ejml ejmlVarH = ejmm.h();
                                    ejmlVarH.h(ezdsVar.c == 6 ? (ezbq) ezdsVar.d : ezbq.a);
                                    ejmlVarH.f((ezdvVar2.b == i3 ? (String) ezdvVar2.c : "").substring(ezdsVar.h, ezdsVar.i));
                                    ekfwVar.h(ejmlVarH.a());
                                } else if (i8 == 9) {
                                    ejml ejmlVarH2 = ejmm.h();
                                    ejmlVarH2.e((ezdsVar.c == 9 ? (ezhg) ezdsVar.d : ezhg.a).c);
                                    ejmlVarH2.f((ezdvVar2.b == i3 ? (String) ezdvVar2.c : "").substring(ezdsVar.h, ezdsVar.i));
                                    ejmlVarH2.d((ezdsVar.c == 9 ? (ezhg) ezdsVar.d : ezhg.a).d);
                                    ekfwVar.h(ejmlVarH2.a());
                                    i3 = 30;
                                }
                            }
                            iMax++;
                            i3 = 30;
                        }
                        ekgb ekgbVarG = ekfwVar.g();
                        ekfw ekfwVar2 = new ekfw();
                        Iterator<String> it = mapGeneratePredictions.keySet().iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (!mapGeneratePredictions.get(next).isEmpty()) {
                                ekgp ekgpVar = this.b;
                                if (ekgpVar.containsKey(next) && ((Integer) ekgpVar.get(next)).intValue() > 0) {
                                    if (mapGeneratePredictions.get(next).get(i2) instanceof PredictorResult.BooleanPrediction) {
                                        PredictorResult.BooleanPrediction booleanPrediction = (PredictorResult.BooleanPrediction) mapGeneratePredictions.get(next).get(i2);
                                        if (booleanPrediction.indicator) {
                                            ekgp ekgpVar2 = this.c;
                                            if (!ekgpVar2.containsKey(next) || booleanPrediction.score >= ((Double) ekgpVar2.get(next)).doubleValue()) {
                                                ejmn ejmnVarF = ejmo.f();
                                                ejmnVarF.c(next);
                                                ejmnVarF.d(booleanPrediction.score);
                                                ejmnVarF.b(ekgbVarG);
                                                ejmnVarF.e(ezal.MULTI_TASK);
                                                ekfwVar2.h(ejmnVarF.a());
                                            }
                                        }
                                    } else if (iC != 4 || mapGeneratePredictions.containsKey("EMOTION_COMPLETE") || mapGeneratePredictions.containsKey("BUSINESS_MESSAGE")) {
                                        for (PredictorResult.Prediction prediction : mapGeneratePredictions.get(next)) {
                                            boolean zE = ejuf.e(next, "BUSINESS_MESSAGE");
                                            PredictorResult.TextPrediction textPrediction = (PredictorResult.TextPrediction) prediction;
                                            String str4 = zE ? textPrediction.text : next;
                                            ekgp ekgpVar3 = this.c;
                                            if (ekgpVar3.containsKey(str4)) {
                                                str2 = next;
                                                if (prediction.score >= ((Double) ekgpVar3.get(str4)).doubleValue()) {
                                                }
                                                next = str2;
                                                i2 = 0;
                                            } else {
                                                str2 = next;
                                            }
                                            ejmn ejmnVarF2 = ejmo.f();
                                            ejmnVarF2.c(str4);
                                            ejmnVarF2.d(textPrediction.score);
                                            ejmnVarF2.e(ezal.MULTI_TASK);
                                            if (!zE) {
                                                ejmnVarF2.f(textPrediction.text);
                                                ejml ejmlVarH3 = ejmm.h();
                                                ejmlVarH3.g(textPrediction.text);
                                                ejmm ejmmVarA = ejmlVarH3.a();
                                                String strValueOf = String.valueOf(str2);
                                                ejml ejmlVarH4 = ejmm.h();
                                                ejmlVarH4.g(strValueOf.concat("_ENTITY"));
                                                ejmlVarH4.f(textPrediction.text);
                                                ejmnVarF2.b(ekgb.s(ejmmVarA, ejmlVarH4.a()));
                                            }
                                            ekfwVar2.h(ejmnVarF2.a());
                                            next = str2;
                                            i2 = 0;
                                        }
                                    }
                                }
                            }
                        }
                        return ekfwVar2.g();
                    }
                }
                int i9 = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                ejkyVarA.close();
                return ekgbVar;
            } finally {
            }
        } catch (Throwable th) {
            throw new ejkv("LinguaModel: Exception/Error getting interpretations from Predictor.", th);
        }
    }

    @Override // defpackage.ejmp
    public final void b() {
        this.a.b();
    }
}
