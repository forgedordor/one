package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.StringJoiner;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiyt implements cdfg {
    public static final cqce a = cqce.g("Bugle", "RecentMessageCodesService");
    public final cmfo b;
    private final eosc c;

    public aiyt(cmfo cmfoVar, eosc eoscVar) {
        this.b = cmfoVar;
        this.c = eoscVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ekgp a(aiyl aiylVar) {
        String strValueOf;
        Optional optionalEmpty;
        String strA;
        char c;
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("last_outgoing_sms_error_code", (aiylVar.b & 1) != 0 ? String.valueOf(aiylVar.c) : "None");
        ekgiVar.i("last_outgoing_sms_result_code", (aiylVar.b & 2) != 0 ? String.valueOf(aiylVar.d) : "None");
        ekgiVar.i("last_outgoing_mms_result_code", (aiylVar.b & 4) != 0 ? String.valueOf(aiylVar.e) : "None");
        ekgiVar.i("last_mms_connection_failure_code", (aiylVar.b & 32) != 0 ? String.valueOf(aiylVar.i) : "None");
        ekgiVar.i("last_outgoing_rcs_result_code", (aiylVar.b & 8) != 0 ? String.valueOf(aiylVar.f) : "None");
        if ((aiylVar.b & 16) != 0) {
            int iA = ewdh.a(aiylVar.g);
            if (iA == 0) {
                iA = 1;
            }
            strValueOf = String.valueOf(iA - 1);
        } else {
            strValueOf = "None";
        }
        ekgiVar.i("last_outgoing_chat_session_event_info", strValueOf);
        Iterator it = ekjz.f(aiylVar.h).iterator();
        while (true) {
            if (!it.hasNext()) {
                optionalEmpty = Optional.empty();
                break;
            }
            aiyd aiydVar = (aiyd) it.next();
            int iB = eloc.b(aiydVar.c);
            if (iB != 0 && iB == 3 && !g(aiydVar)) {
                optionalEmpty = Optional.of(Integer.valueOf(aiydVar.g));
                break;
            }
        }
        ekgiVar.i("last_mms_download_result_code", (String) optionalEmpty.map(new Function() { // from class: aiyo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Integer) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("None"));
        if ((aiylVar.b & 64) != 0) {
            ekgiVar.i("last_outgoing_slm_result_code", String.valueOf(aiylVar.j));
        }
        if (aiylVar.h.size() > 0) {
            StringJoiner stringJoiner = new StringJoiner("\n");
            evtg evtgVar = aiylVar.h;
            for (int i = 0; i < evtgVar.size(); i++) {
                StringJoiner stringJoiner2 = new StringJoiner(", ", "{ ", " }");
                aiyd aiydVar2 = (aiyd) evtgVar.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append("type: ");
                if (g(aiydVar2)) {
                    int iB2 = eloc.b(aiydVar2.c);
                    if (iB2 == 0) {
                        iB2 = 1;
                    }
                    strA = eloc.a(iB2).concat("_SLM");
                } else {
                    int iB3 = eloc.b(aiydVar2.c);
                    if (iB3 == 0) {
                        iB3 = 1;
                    }
                    strA = eloc.a(iB3);
                }
                sb.append(strA);
                StringJoiner stringJoinerAdd = stringJoiner2.add(sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("message_id: ");
                elpr elprVar = aiydVar2.d;
                if (elprVar == null) {
                    elprVar = elpr.a;
                }
                sb2.append(elprVar.c);
                StringJoiner stringJoinerAdd2 = stringJoinerAdd.add(sb2).add("x_message_id: " + aiydVar2.n);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("message_status: ");
                sb3.append(aiydVar2.e);
                StringJoiner stringJoinerAdd3 = stringJoinerAdd2.add(sb3);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("result_code: ");
                sb4.append(aiydVar2.g);
                stringJoinerAdd3.add(sb4).add("conversation_type: " + aiydVar2.o);
                int iB4 = eloc.b(aiydVar2.c);
                if (iB4 == 0) {
                    iB4 = 1;
                }
                int i2 = iB4 - 1;
                if (i2 == 1) {
                    c = 3;
                    if (!g(aiydVar2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("sms_error_code: ");
                        sb5.append(aiydVar2.f);
                        stringJoiner2.add(sb5);
                    }
                } else if (i2 != 2) {
                    c = 3;
                    if (i2 == 3) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("rcs_message_id: ");
                        elpr elprVar2 = aiydVar2.d;
                        if (elprVar2 == null) {
                            elprVar2 = elpr.a;
                        }
                        sb6.append(elprVar2.d);
                        StringJoiner stringJoinerAdd4 = stringJoiner2.add(sb6);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("chat_session_event_info: ");
                        int iA2 = ewdh.a(aiydVar2.h);
                        if (iA2 == 0) {
                            iA2 = 1;
                        }
                        sb7.append(iA2 - 1);
                        stringJoinerAdd4.add(sb7);
                    }
                } else {
                    c = 3;
                    if (!g(aiydVar2)) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("last_mms_connection_failure_code: ");
                        sb8.append(aiydVar2.i);
                        stringJoiner2.add(sb8);
                    }
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append("retry: ");
                sb9.append(aiydVar2.j);
                sb9.append("/");
                sb9.append(aiydVar2.k);
                stringJoiner2.add(sb9);
                aiyg aiygVar = aiydVar2.l;
                if (aiygVar == null) {
                    aiygVar = aiyg.b;
                }
                StringJoiner stringJoiner3 = new StringJoiner(", ", "{ ", " }");
                StringBuilder sb10 = new StringBuilder();
                sb10.append("airplaneMode: ");
                sb10.append(aiygVar.d);
                StringJoiner stringJoinerAdd5 = stringJoiner3.add(sb10);
                StringBuilder sb11 = new StringBuilder();
                sb11.append("mobileData: ");
                sb11.append(aiygVar.e);
                StringJoiner stringJoinerAdd6 = stringJoinerAdd5.add(sb11);
                StringBuilder sb12 = new StringBuilder();
                sb12.append("signalStrength: ");
                sb12.append(aiygVar.f);
                StringJoiner stringJoinerAdd7 = stringJoinerAdd6.add(sb12);
                StringBuilder sb13 = new StringBuilder();
                sb13.append("networkTransport: ");
                sb13.append(Arrays.toString(Collection.EL.stream(new evsz(aiygVar.g, aiyg.a)).map(new Function() { // from class: aiys
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((aiyi) obj).name();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).toArray()));
                stringJoinerAdd7.add(sb13);
                StringBuilder sb14 = new StringBuilder();
                sb14.append("network_conditions: ");
                sb14.append(stringJoiner3);
                stringJoiner2.add(sb14);
                stringJoiner.add(stringJoiner2.toString());
            }
            ekgiVar.i("last_messages_codes", stringJoiner.toString());
        }
        return ekgiVar.c();
    }

    public static boolean g(aiyd aiydVar) {
        elpf elpfVarB = elpf.b(aiydVar.m);
        if (elpfVarB == null) {
            elpfVarB = elpf.UNSPECIFIED;
        }
        return elpfVarB.equals(elpf.SLM);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        eiju eijuVarH = this.b.h();
        eooz eoozVar = new eooz() { // from class: aiyp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eijx.e(aiyt.a((aiyl) obj));
            }
        };
        eosc eoscVar = this.c;
        return eijuVarH.i(eoozVar, eoscVar).h(new ejvr() { // from class: aiyq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cdfd.a((Map) obj);
            }
        }, eoscVar);
    }

    public final void e(aiyd aiydVar) {
        f(aiydVar, false);
    }

    public final void f(final aiyd aiydVar, final boolean z) {
        this.b.m(new ejvr() { // from class: aiyn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aiyl aiylVar = (aiyl) obj;
                aiyk aiykVar = (aiyk) aiylVar.toBuilder();
                aiyd aiydVar2 = aiydVar;
                if (z) {
                    int iB = eloc.b(aiydVar2.c);
                    if (iB == 0) {
                        iB = 1;
                    }
                    int i = iB - 1;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                int i2 = aiydVar2.g;
                                aiykVar.copyOnWrite();
                                aiyl aiylVar2 = (aiyl) aiykVar.instance;
                                aiylVar2.b |= 8;
                                aiylVar2.f = i2;
                                if ((aiydVar2.b & 32) != 0) {
                                    int iA = ewdh.a(aiydVar2.h);
                                    int i3 = iA != 0 ? iA : 1;
                                    aiykVar.copyOnWrite();
                                    aiyl aiylVar3 = (aiyl) aiykVar.instance;
                                    aiylVar3.g = i3 - 1;
                                    aiylVar3.b |= 16;
                                }
                            }
                        } else if (aiyt.g(aiydVar2)) {
                            int i4 = aiydVar2.g;
                            aiykVar.copyOnWrite();
                            aiyl aiylVar4 = (aiyl) aiykVar.instance;
                            aiylVar4.b |= 64;
                            aiylVar4.j = i4;
                        } else {
                            int i5 = aiydVar2.g;
                            aiykVar.copyOnWrite();
                            aiyl aiylVar5 = (aiyl) aiykVar.instance;
                            aiylVar5.b |= 4;
                            aiylVar5.e = i5;
                            int i6 = aiydVar2.i;
                            aiykVar.copyOnWrite();
                            aiyl aiylVar6 = (aiyl) aiykVar.instance;
                            aiylVar6.b |= 32;
                            aiylVar6.i = i6;
                        }
                    } else if (aiyt.g(aiydVar2)) {
                        int i7 = aiydVar2.g;
                        aiykVar.copyOnWrite();
                        aiyl aiylVar7 = (aiyl) aiykVar.instance;
                        aiylVar7.b |= 64;
                        aiylVar7.j = i7;
                    } else {
                        int i8 = aiydVar2.f;
                        aiykVar.copyOnWrite();
                        aiyl aiylVar8 = (aiyl) aiykVar.instance;
                        aiylVar8.b = 1 | aiylVar8.b;
                        aiylVar8.c = i8;
                        int i9 = aiydVar2.g;
                        aiykVar.copyOnWrite();
                        aiyl aiylVar9 = (aiyl) aiykVar.instance;
                        aiylVar9.b = 2 | aiylVar9.b;
                        aiylVar9.d = i9;
                    }
                }
                if (aiylVar.h.size() == 10) {
                    aiykVar.copyOnWrite();
                    aiyl aiylVar10 = (aiyl) aiykVar.instance;
                    aiylVar10.a();
                    aiylVar10.h.remove(0);
                }
                aiykVar.copyOnWrite();
                aiyl aiylVar11 = (aiyl) aiykVar.instance;
                aiydVar2.getClass();
                aiylVar11.a();
                aiylVar11.h.add(aiydVar2);
                return (aiyl) aiykVar.build();
            }
        });
    }
}
