package defpackage;

import com.google.chat.smartmessaging.smartreply.android.models.assistant.IntentClassifierJni;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmf implements ejmp {
    private final IntentClassifierJni a;
    private final int b;
    private final float c;
    private final boolean d;
    private final ekgd e;
    private final float f;
    private final ekgp g;
    private final ekgp h;

    public ejmf(IntentClassifierJni intentClassifierJni, int i, float f, boolean z, ekgd ekgdVar, float f2, ekgp ekgpVar, ekgp ekgpVar2) {
        this.a = intentClassifierJni;
        this.b = i;
        this.c = f;
        this.d = z;
        this.e = ekgdVar;
        this.f = f2;
        this.g = ekgpVar;
        this.h = ekgpVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ejmp
    public final ekgb a(ezdx ezdxVar, String str, ejqq ejqqVar) throws ejkv {
        boolean z;
        ekgb ekgbVarR;
        sqf sqfVar;
        String string;
        sqg sqgVar = (sqg) sql.a.createBuilder();
        ArrayList arrayList = new ArrayList(ezdxVar.b.size());
        for (ezdv ezdvVar : ezdxVar.b) {
            if (ezdvVar.b == 30) {
                sqh sqhVar = (sqh) sqk.a.createBuilder();
                String str2 = ezdvVar.b == 30 ? (String) ezdvVar.c : "";
                sqhVar.copyOnWrite();
                sqk sqkVar = (sqk) sqhVar.instance;
                str2.getClass();
                sqkVar.b = str2;
                long j = ezdvVar.e;
                sqhVar.copyOnWrite();
                ((sqk) sqhVar.instance).c = j;
                boolean z2 = true;
                int i = true != ezdvVar.d.equals(str) ? 4 : 3;
                sqhVar.copyOnWrite();
                ((sqk) sqhVar.instance).e = i - 2;
                for (ezds ezdsVar : ezdvVar.f) {
                    ekgp ekgpVar = this.g;
                    eyzy eyzyVarB = eyzy.b(ezdsVar.e);
                    if (eyzyVarB == null) {
                        eyzyVarB = eyzy.UNRECOGNIZED;
                    }
                    Float f = (Float) ekgpVar.getOrDefault(eyzyVarB, Float.valueOf(0.0f));
                    float fFloatValue = f.floatValue();
                    eyzy eyzyVarB2 = eyzy.b(ezdsVar.e);
                    if (eyzyVarB2 == null) {
                        eyzyVarB2 = eyzy.UNRECOGNIZED;
                    }
                    if (eyzyVarB2 == eyzy.WEBREF_ANNOTATION) {
                        fFloatValue = ((Float) this.h.getOrDefault((ezdsVar.c == 9 ? (ezhg) ezdsVar.d : ezhg.a).c, f)).floatValue();
                    }
                    if (fFloatValue > this.f) {
                        sqi sqiVar = (sqi) sqj.a.createBuilder();
                        int i2 = ezdsVar.h;
                        sqiVar.copyOnWrite();
                        ((sqj) sqiVar.instance).c = i2;
                        int i3 = ezdsVar.i;
                        sqiVar.copyOnWrite();
                        ((sqj) sqiVar.instance).d = i3;
                        sqiVar.copyOnWrite();
                        ((sqj) sqiVar.instance).e = fFloatValue;
                        eyzy eyzyVarB3 = eyzy.b(ezdsVar.e);
                        if (eyzyVarB3 == null) {
                            eyzyVarB3 = eyzy.UNRECOGNIZED;
                        }
                        int iOrdinal = eyzyVarB3.ordinal();
                        z = z2;
                        if (iOrdinal == 5) {
                            sqe sqeVar = (sqe) sqf.a.createBuilder();
                            String str3 = (ezdsVar.c == 6 ? (ezbq) ezdsVar.d : ezbq.a).d;
                            sqeVar.copyOnWrite();
                            sqf sqfVar2 = (sqf) sqeVar.instance;
                            str3.getClass();
                            sqfVar2.b = str3;
                            sqeVar.copyOnWrite();
                            ((sqf) sqeVar.instance).c = sqd.a(10);
                            sqfVar = (sqf) sqeVar.build();
                        } else if (iOrdinal == 6) {
                            sqe sqeVar2 = (sqe) sqf.a.createBuilder();
                            ezbd ezbdVar = ezdsVar.c == 7 ? (ezbd) ezdsVar.d : ezbd.a;
                            ezer ezerVar = ezbdVar.d;
                            if (ezerVar == null) {
                                ezerVar = ezer.a;
                            }
                            if (ezerVar.d.isEmpty()) {
                                ezet ezetVar = ezbdVar.e;
                                if (ezetVar == null) {
                                    ezetVar = ezet.a;
                                }
                                if (ezetVar.c.isEmpty()) {
                                    ezha ezhaVar = ezbdVar.f;
                                    if (ezhaVar == null) {
                                        ezhaVar = ezha.a;
                                    }
                                    if (!ezhaVar.b.isEmpty()) {
                                        ezha ezhaVar2 = ezbdVar.f;
                                        if (ezhaVar2 == null) {
                                            ezhaVar2 = ezha.a;
                                        }
                                        string = ezhaVar2.b;
                                    } else if ((ezbdVar.b & 1) != 0) {
                                        ezev ezevVar = ezbdVar.c;
                                        if (ezevVar == null) {
                                            ezevVar = ezev.a;
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        String[] strArr = {ezevVar.b, ezevVar.c, ezevVar.e, ezevVar.f, ezevVar.g};
                                        for (int i4 = 0; i4 < 5; i4++) {
                                            String str4 = strArr[i4];
                                            if (!str4.isEmpty()) {
                                                if (sb.length() != 0) {
                                                    sb.append(", ");
                                                }
                                                sb.append(str4);
                                            }
                                        }
                                        string = sb.toString();
                                    } else {
                                        string = "";
                                    }
                                } else {
                                    ezet ezetVar2 = ezbdVar.e;
                                    if (ezetVar2 == null) {
                                        ezetVar2 = ezet.a;
                                    }
                                    string = ezetVar2.c;
                                }
                            } else {
                                ezer ezerVar2 = ezbdVar.d;
                                if (ezerVar2 == null) {
                                    ezerVar2 = ezer.a;
                                }
                                string = ezerVar2.d;
                            }
                            sqeVar2.copyOnWrite();
                            sqf sqfVar3 = (sqf) sqeVar2.instance;
                            string.getClass();
                            sqfVar3.b = string;
                            sqeVar2.copyOnWrite();
                            ((sqf) sqeVar2.instance).c = sqd.a(4);
                            sqfVar = (sqf) sqeVar2.build();
                        } else if (iOrdinal == 7) {
                            sqe sqeVar3 = (sqe) sqf.a.createBuilder();
                            String str5 = (ezdsVar.c == 9 ? (ezhg) ezdsVar.d : ezhg.a).d;
                            sqeVar3.copyOnWrite();
                            sqf sqfVar4 = (sqf) sqeVar3.instance;
                            str5.getClass();
                            sqfVar4.b = str5;
                            String str6 = (ezdsVar.c == 9 ? (ezhg) ezdsVar.d : ezhg.a).c;
                            sqeVar3.copyOnWrite();
                            sqf sqfVar5 = (sqf) sqeVar3.instance;
                            str6.getClass();
                            evtg evtgVar = sqfVar5.d;
                            if (!evtgVar.c()) {
                                sqfVar5.d = evsn.mutableCopy(evtgVar);
                            }
                            sqfVar5.d.add(str6);
                            sqfVar = (sqf) sqeVar3.build();
                        } else if (iOrdinal == 9) {
                            sqe sqeVar4 = (sqe) sqf.a.createBuilder();
                            ezor ezorVar = (ezdsVar.c == 11 ? (ezec) ezdsVar.d : ezec.a).c;
                            if (ezorVar == null) {
                                ezorVar = ezor.a;
                            }
                            long j2 = ezorVar.b;
                            String strConcat = j2 == 0 ? "" : String.valueOf(String.valueOf(j2)).concat(String.valueOf(ezorVar.c));
                            sqeVar4.copyOnWrite();
                            ((sqf) sqeVar4.instance).b = strConcat;
                            sqeVar4.copyOnWrite();
                            ((sqf) sqeVar4.instance).c = sqd.a(13);
                            sqfVar = (sqf) sqeVar4.build();
                        } else if (iOrdinal != 10) {
                            sqfVar = sqf.a;
                        } else {
                            sqe sqeVar5 = (sqe) sqf.a.createBuilder();
                            sqeVar5.copyOnWrite();
                            ((sqf) sqeVar5.instance).c = sqd.a(7);
                            sqfVar = (sqf) sqeVar5.build();
                        }
                        sqiVar.copyOnWrite();
                        sqj sqjVar = (sqj) sqiVar.instance;
                        sqfVar.getClass();
                        sqjVar.f = sqfVar;
                        sqjVar.b |= 1;
                        ekgbVarR = ekgb.r((sqj) sqiVar.build());
                    } else {
                        z = z2;
                        int i5 = ekgb.d;
                        ekgbVarR = ekoe.a;
                    }
                    sqhVar.copyOnWrite();
                    sqk sqkVar2 = (sqk) sqhVar.instance;
                    evtg evtgVar2 = sqkVar2.d;
                    if (!evtgVar2.c()) {
                        sqkVar2.d = evsn.mutableCopy(evtgVar2);
                    }
                    evpz.addAll(ekgbVarR, sqkVar2.d);
                    z2 = z;
                }
                arrayList.add((sqk) sqhVar.build());
            }
        }
        List listSubList = arrayList.subList(Math.max(0, arrayList.size() - this.b), arrayList.size());
        sqgVar.copyOnWrite();
        sql sqlVar = (sql) sqgVar.instance;
        evtg evtgVar3 = sqlVar.b;
        if (!evtgVar3.c()) {
            sqlVar.b = evsn.mutableCopy(evtgVar3);
        }
        IntentClassifierJni intentClassifierJni = this.a;
        evpz.addAll(listSubList, sqlVar.b);
        sqgVar.copyOnWrite();
        ((sql) sqgVar.instance).c = "en";
        float f2 = this.c;
        sqgVar.copyOnWrite();
        ((sql) sqgVar.instance).d = f2;
        sql sqlVar2 = (sql) sqgVar.build();
        boolean z3 = this.d;
        long j3 = ((ejmg) intentClassifierJni).a.get();
        if (j3 == 0) {
            throw new ejkv("Handle destroyed.");
        }
        try {
            byte[] bArrNativeClassify = IntentClassifierJni.nativeClassify(j3, sqlVar2.toByteArray(), z3);
            if (bArrNativeClassify == null) {
                throw new ejkv("Native classiflier failed.");
            }
            try {
                sqn sqnVar = (sqn) evsn.parseFrom(sqn.a, bArrNativeClassify, evrr.a());
                int i6 = ekgb.d;
                ekgb ekgbVarG = ekoe.a;
                float f3 = 0.0f;
                for (sqt sqtVar : sqnVar.b) {
                    if (sqtVar.b > f3) {
                        ekgd ekgdVar = this.e;
                        sqp sqpVar = sqtVar.c;
                        if (sqpVar == null) {
                            sqpVar = sqp.a;
                        }
                        sqr sqrVarB = sqr.b(sqpVar.b);
                        if (sqrVarB == null) {
                            sqrVarB = sqr.UNRECOGNIZED;
                        }
                        if (ekgdVar.s(sqrVarB)) {
                            ekfw ekfwVar = new ekfw();
                            sqp sqpVar2 = sqtVar.c;
                            if (sqpVar2 == null) {
                                sqpVar2 = sqp.a;
                            }
                            sqr sqrVarB2 = sqr.b(sqpVar2.b);
                            if (sqrVarB2 == null) {
                                sqrVarB2 = sqr.UNRECOGNIZED;
                            }
                            ekgb ekgbVarA = ekgdVar.a(sqrVarB2);
                            int size = ekgbVarA.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                ejhq ejhqVar = (ejhq) ekgbVarA.get(i7);
                                ekfw ekfwVar2 = new ekfw();
                                sqf sqfVar6 = sqtVar.d;
                                if (sqfVar6 == null) {
                                    sqfVar6 = sqf.a;
                                }
                                if (!sqfVar6.b.isEmpty()) {
                                    ejml ejmlVarH = ejmm.h();
                                    sqf sqfVar7 = sqtVar.d;
                                    if (sqfVar7 == null) {
                                        sqfVar7 = sqf.a;
                                    }
                                    ejmlVarH.f(sqfVar7.b);
                                    ejmlVarH.g(ejhqVar.d);
                                    sqf sqfVar8 = sqtVar.d;
                                    if (sqfVar8 == null) {
                                        sqfVar8 = sqf.a;
                                    }
                                    ejmlVarH.e(sqfVar8.d.size() > 0 ? (String) sqfVar8.d.get(0) : "");
                                    ekfwVar2.h(ejmlVarH.a());
                                }
                                ejmn ejmnVarF = ejmo.f();
                                ejmnVarF.e(ezal.ASSISTANT);
                                ejmnVarF.c(ejhqVar.c);
                                ejmnVarF.d(sqtVar.b);
                                ejmnVarF.b(ekfwVar2.g());
                                ekfwVar.h(ejmnVarF.a());
                            }
                            ekgbVarG = ekfwVar.g();
                            f3 = sqtVar.b;
                        }
                    }
                }
                return ekgbVarG;
            } catch (evtj e) {
                throw new ejkv("Failed to parse the response: ".concat(String.valueOf(e.getMessage())), (Exception) e);
            }
        } catch (Throwable th) {
            throw new ejkv("Unexpected exception: ".concat(String.valueOf(th.getMessage())), th);
        }
    }

    @Override // defpackage.ejmp
    public final /* synthetic */ void b() {
    }
}
