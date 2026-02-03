package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.libraries.abuse.hades.tartarus.runtime.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhxz implements dhyr {
    private final fdap a;
    private final dhtx b = new dhtx(true);

    public dhxz(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.dhyr
    public final dhtx a() {
        return this.b;
    }

    @Override // defpackage.dhyr
    public final dhyq b(final dhuu dhuuVar, final List list, final List list2) throws dhvf {
        dhun dhunVar;
        Map linkedHashMap;
        List listQ;
        Object objInvoke = this.a.invoke(dhzo.a(new fdap() { // from class: dhyi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Data data = (Data) obj;
                data.getClass();
                sbp sbpVarA = sbo.a((sbm) sbn.a.createBuilder());
                sdh sdhVar = (sdh) sdi.a.createBuilder();
                sdhVar.getClass();
                sbq sbqVar = (sbq) sbr.a.createBuilder();
                sbqVar.getClass();
                sbqVar.copyOnWrite();
                sbr sbrVar = (sbr) sbqVar.instance;
                sbrVar.b |= 1;
                sbrVar.c = "/internal/moirai_default/1";
                evsn evsnVarBuild = sbqVar.build();
                evsnVarBuild.getClass();
                sdj.b((sbr) evsnVarBuild, sdhVar);
                sbpVarA.c(sdj.a(sdhVar));
                for (Map.Entry entry : fcwa.j(fcwa.c(new fcti("/engine/top_target_entity_id", sbpVarA.a())), dhuuVar.a).entrySet()) {
                    String str = (String) entry.getKey();
                    final sbn sbnVar = (sbn) entry.getValue();
                    sbnVar.getClass();
                    data.putData(str, dhtr.a(new dhrp() { // from class: dhsw
                        @Override // defpackage.dhrp
                        public final void a(dhtq dhtqVar) {
                            sbn sbnVar2 = sbnVar;
                            if ((sbnVar2.b & 1) != 0) {
                                final sdi sdiVar = sbnVar2.c;
                                if (sdiVar == null) {
                                    sdiVar = sdi.a;
                                }
                                sdiVar.getClass();
                                dhtqVar.b("canonical", new dhrp() { // from class: dhsu
                                    @Override // defpackage.dhrp
                                    public final void a(dhtq dhtqVar2) {
                                        sdi sdiVar2 = sdiVar;
                                        if ((sdiVar2.b & 1) != 0) {
                                            final sbr sbrVar2 = sdiVar2.c;
                                            if (sbrVar2 == null) {
                                                sbrVar2 = sbr.a;
                                            }
                                            sbrVar2.getClass();
                                            dhtqVar2.b("entityId", new dhrp() { // from class: dhtk
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    sbr sbrVar3 = sbrVar2;
                                                    if ((sbrVar3.b & 1) != 0) {
                                                        String str2 = sbrVar3.c;
                                                        str2.getClass();
                                                        dhtqVar3.c("id", str2);
                                                    }
                                                }
                                            });
                                        }
                                        if ((sdiVar2.b & 2) != 0) {
                                            final sbt sbtVar = sdiVar2.d;
                                            if (sbtVar == null) {
                                                sbtVar = sbt.a;
                                            }
                                            sbtVar.getClass();
                                            dhtqVar2.b(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, new dhrp() { // from class: dhst
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    sbt sbtVar2 = sbtVar;
                                                    if ((sbtVar2.b & 1) != 0) {
                                                        String str2 = sbtVar2.c;
                                                        str2.getClass();
                                                        dhtqVar3.c("rawContent", str2);
                                                    }
                                                    if ((sbtVar2.b & 2) != 0) {
                                                        String str3 = sbtVar2.d;
                                                        str3.getClass();
                                                        dhtqVar3.c("language", str3);
                                                    }
                                                }
                                            });
                                        }
                                        if ((sdiVar2.b & 4) != 0) {
                                            sby sbyVar = sdiVar2.e;
                                            if (sbyVar == null) {
                                                sbyVar = sby.a;
                                            }
                                            sbyVar.getClass();
                                            dhtqVar2.b("url", dhto.a(sbyVar));
                                        }
                                        if ((sdiVar2.b & 8) != 0) {
                                            final sca scaVar = sdiVar2.f;
                                            if (scaVar == null) {
                                                scaVar = sca.a;
                                            }
                                            scaVar.getClass();
                                            dhtqVar2.b("urlSet", new dhrp() { // from class: dhtj
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    evtg evtgVar = scaVar.b;
                                                    evtgVar.getClass();
                                                    ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
                                                    Iterator<E> it = evtgVar.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(dhto.a((sby) it.next()));
                                                    }
                                                    dhtqVar3.d("url", arrayList);
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                            if ((sbnVar2.b & 2) != 0) {
                                final sdl sdlVar = sbnVar2.d;
                                if (sdlVar == null) {
                                    sdlVar = sdl.a;
                                }
                                sdlVar.getClass();
                                dhtqVar.b("gppd", new dhrp() { // from class: dhta
                                    @Override // defpackage.dhrp
                                    public final void a(dhtq dhtqVar2) {
                                        sdl sdlVar2 = sdlVar;
                                        if ((sdlVar2.b & 1) != 0) {
                                            final scq scqVar = sdlVar2.c;
                                            if (scqVar == null) {
                                                scqVar = scq.a;
                                            }
                                            scqVar.getClass();
                                            dhtqVar2.b("swInput", new dhrp() { // from class: dhtm
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    scq scqVar2 = scqVar;
                                                    evss evssVar = scqVar2.b;
                                                    evssVar.getClass();
                                                    dhtqVar3.d("values", evssVar);
                                                    evtg evtgVar = scqVar2.c;
                                                    evtgVar.getClass();
                                                    dhtqVar3.d("strings", evtgVar);
                                                }
                                            });
                                        }
                                        if ((sdlVar2.b & 2) != 0) {
                                            final scm scmVar = sdlVar2.d;
                                            if (scmVar == null) {
                                                scmVar = scm.a;
                                            }
                                            scmVar.getClass();
                                            dhtqVar2.b("cmInput", new dhrp() { // from class: dhsy
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    scm scmVar2 = scmVar;
                                                    evss evssVar = scmVar2.b;
                                                    evssVar.getClass();
                                                    dhtqVar3.d("values", evssVar);
                                                    evtg evtgVar = scmVar2.c;
                                                    evtgVar.getClass();
                                                    dhtqVar3.d("strings", evtgVar);
                                                }
                                            });
                                        }
                                        if ((sdlVar2.b & 4) != 0) {
                                            final sco scoVar = sdlVar2.e;
                                            if (scoVar == null) {
                                                scoVar = sco.a;
                                            }
                                            scoVar.getClass();
                                            dhtqVar2.b("sprInput", new dhrp() { // from class: dhtc
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    sco scoVar2 = scoVar;
                                                    evss evssVar = scoVar2.b;
                                                    evssVar.getClass();
                                                    dhtqVar3.d("values", evssVar);
                                                    evtg evtgVar = scoVar2.c;
                                                    evtgVar.getClass();
                                                    dhtqVar3.d("strings", evtgVar);
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                            if ((sbnVar2.b & 4) != 0) {
                                final sdo sdoVar = sbnVar2.e;
                                if (sdoVar == null) {
                                    sdoVar = sdo.a;
                                }
                                sdoVar.getClass();
                                dhtqVar.b("onDevice", new dhrp() { // from class: dhss
                                    @Override // defpackage.dhrp
                                    public final void a(dhtq dhtqVar2) {
                                        sdo sdoVar2 = sdoVar;
                                        if ((sdoVar2.b & 1) != 0) {
                                            final sdc sdcVar = sdoVar2.c;
                                            if (sdcVar == null) {
                                                sdcVar = sdc.a;
                                            }
                                            sdcVar.getClass();
                                            dhtqVar2.b("signals", new dhrp() { // from class: dhth
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    sdc sdcVar2 = sdcVar;
                                                    if ((sdcVar2.b & 1) != 0) {
                                                        String str2 = sdcVar2.c;
                                                        str2.getClass();
                                                        dhtqVar3.c(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, str2);
                                                    }
                                                    if ((sdcVar2.b & 2) != 0) {
                                                        String str3 = sdcVar2.d;
                                                        str3.getClass();
                                                        dhtqVar3.c("androidId", str3);
                                                    }
                                                    if ((sdcVar2.b & 4) != 0) {
                                                        String str4 = sdcVar2.e;
                                                        str4.getClass();
                                                        dhtqVar3.c("filePath", str4);
                                                    }
                                                    evtg<sdb> evtgVar = sdcVar2.f;
                                                    evtgVar.getClass();
                                                    ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
                                                    for (final sdb sdbVar : evtgVar) {
                                                        sdbVar.getClass();
                                                        arrayList.add(new dhrp() { // from class: dhti
                                                            @Override // defpackage.dhrp
                                                            public final void a(dhtq dhtqVar4) {
                                                                sdb sdbVar2 = sdbVar;
                                                                if ((sdbVar2.b & 1) != 0) {
                                                                    String str5 = sdbVar2.c;
                                                                    str5.getClass();
                                                                    dhtqVar4.c("tensorKey", str5);
                                                                }
                                                                evsx evsxVar = sdbVar2.d;
                                                                evsxVar.getClass();
                                                                dhtqVar4.d("tensorShape", evsxVar);
                                                                if ((sdbVar2.b & 2) != 0) {
                                                                    final sda sdaVar = sdbVar2.e;
                                                                    if (sdaVar == null) {
                                                                        sdaVar = sda.a;
                                                                    }
                                                                    sdaVar.getClass();
                                                                    dhtqVar4.b("tensorsData", new dhrp() { // from class: dhsx
                                                                        @Override // defpackage.dhrp
                                                                        public final void a(dhtq dhtqVar5) {
                                                                            sda sdaVar2 = sdaVar;
                                                                            if (sdaVar2.b == 1) {
                                                                                final scy scyVar = (scy) sdaVar2.c;
                                                                                scyVar.getClass();
                                                                                dhtqVar5.b("tensorDataFloat", new dhrp() { // from class: dhtd
                                                                                    @Override // defpackage.dhrp
                                                                                    public final void a(dhtq dhtqVar6) {
                                                                                        evsw evswVar = scyVar.b;
                                                                                        evswVar.getClass();
                                                                                        dhtqVar6.d("floatArray", evswVar);
                                                                                    }
                                                                                });
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                        });
                                                    }
                                                    dhtqVar3.d("tensors", arrayList);
                                                }
                                            });
                                        }
                                        if ((sdoVar2.b & 2) != 0) {
                                            final scs scsVar = sdoVar2.d;
                                            if (scsVar == null) {
                                                scsVar = scs.a;
                                            }
                                            scsVar.getClass();
                                            dhtqVar2.b("hashes", new dhrp() { // from class: dhtn
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    scs scsVar2 = scsVar;
                                                    if ((scsVar2.b & 1) != 0) {
                                                        String str2 = scsVar2.c;
                                                        str2.getClass();
                                                        dhtqVar3.c("contentHash", str2);
                                                    }
                                                    if ((scsVar2.b & 2) != 0) {
                                                        String str3 = scsVar2.d;
                                                        str3.getClass();
                                                        dhtqVar3.c("encryptedHash", str3);
                                                    }
                                                    if ((scsVar2.b & 4) != 0) {
                                                        dhtqVar3.e("isHashMatched", scsVar2.e);
                                                    }
                                                    if ((scsVar2.b & 8) != 0) {
                                                        dhtqVar3.e("isSignatureVerified", scsVar2.f);
                                                    }
                                                }
                                            });
                                        }
                                        if ((sdoVar2.b & 4) != 0) {
                                            final scu scuVar = sdoVar2.e;
                                            if (scuVar == null) {
                                                scuVar = scu.a;
                                            }
                                            scuVar.getClass();
                                            dhtqVar2.b("ocr", new dhrp() { // from class: dhtb
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    scu scuVar2 = scuVar;
                                                    if ((scuVar2.b & 1) != 0) {
                                                        String str2 = scuVar2.c;
                                                        str2.getClass();
                                                        dhtqVar3.c("ocrResults", str2);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                            if ((sbnVar2.b & 8) != 0) {
                                final sdf sdfVar = sbnVar2.f;
                                if (sdfVar == null) {
                                    sdfVar = sdf.a;
                                }
                                sdfVar.getClass();
                                dhtqVar.b("amOnDevice", new dhrp() { // from class: dhsv
                                    @Override // defpackage.dhrp
                                    public final void a(dhtq dhtqVar2) {
                                        sdf sdfVar2 = sdfVar;
                                        if ((sdfVar2.b & 1) != 0) {
                                            final sck sckVar = sdfVar2.c;
                                            if (sckVar == null) {
                                                sckVar = sck.a;
                                            }
                                            sckVar.getClass();
                                            dhtqVar2.b("sInfoParams", new dhrp() { // from class: dhtl
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    evtg<scj> evtgVar = sckVar.b;
                                                    evtgVar.getClass();
                                                    ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
                                                    for (final scj scjVar : evtgVar) {
                                                        scjVar.getClass();
                                                        arrayList.add(new dhrp() { // from class: dhsz
                                                            @Override // defpackage.dhrp
                                                            public final void a(dhtq dhtqVar4) {
                                                                if ((scjVar.b & 1) != 0) {
                                                                    dhtqVar4.a.putDouble("uss", r0.c);
                                                                }
                                                            }
                                                        });
                                                    }
                                                    dhtqVar3.d("sInfos", arrayList);
                                                }
                                            });
                                        }
                                        if ((sdfVar2.b & 2) != 0) {
                                            final scg scgVar = sdfVar2.d;
                                            if (scgVar == null) {
                                                scgVar = scg.a;
                                            }
                                            scgVar.getClass();
                                            dhtqVar2.b("messageContext", new dhrp() { // from class: dhtg
                                                @Override // defpackage.dhrp
                                                public final void a(dhtq dhtqVar3) {
                                                    scg scgVar2 = scgVar;
                                                    if ((scgVar2.b & 1) != 0) {
                                                        int iA = scd.a(scgVar2.c);
                                                        if (iA == 0) {
                                                            iA = 1;
                                                        }
                                                        dhtqVar3.a("protocol", iA - 1);
                                                    }
                                                    if ((scgVar2.b & 2) != 0) {
                                                        dhtqVar3.a(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, (scf.a(scgVar2.d) != 0 ? r1 : 1) - 1);
                                                    }
                                                    if ((scgVar2.b & 4) != 0) {
                                                        String str2 = scgVar2.e;
                                                        str2.getClass();
                                                        dhtqVar3.c("groupName", str2);
                                                    }
                                                    if ((scgVar2.b & 8) != 0) {
                                                        dhtqVar3.a("incomingMessageCount", scgVar2.f);
                                                    }
                                                    if ((scgVar2.b & 16) != 0) {
                                                        dhtqVar3.a("outgoingMessageCount", scgVar2.g);
                                                    }
                                                    if ((scgVar2.b & 32) != 0) {
                                                        final sbw sbwVar = scgVar2.h;
                                                        if (sbwVar == null) {
                                                            sbwVar = sbw.a;
                                                        }
                                                        sbwVar.getClass();
                                                        dhtqVar3.b("firstInTimestamp", new dhrp() { // from class: dhte
                                                            @Override // defpackage.dhrp
                                                            public final void a(dhtq dhtqVar4) {
                                                                sbw sbwVar2 = sbwVar;
                                                                if ((sbwVar2.b & 1) != 0) {
                                                                    dhtqVar4.a.putInteger("seconds", sbwVar2.c);
                                                                }
                                                                if ((sbwVar2.b & 2) != 0) {
                                                                    dhtqVar4.a("nanos", sbwVar2.d);
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        }
                    }));
                }
                for (final dhwg dhwgVar : list) {
                    dhzo.b(data, "/internal/moirai_default/1/model_name/" + dhwgVar.c.a + "/model_version/live", new fdap() { // from class: dhyh
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            Data data2 = (Data) obj2;
                            data2.getClass();
                            final dhwg dhwgVar2 = dhwgVar;
                            dhzo.b(data2, "easyLearn", new fdap() { // from class: dhyl
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    Data data3 = (Data) obj3;
                                    data3.getClass();
                                    final dhwg dhwgVar3 = dhwgVar2;
                                    dhzo.b(data3, "classificationResult", new fdap() { // from class: dhyn
                                        @Override // defpackage.fdap
                                        public final Object invoke(Object obj4) {
                                            Map map;
                                            Data data4 = (Data) obj4;
                                            data4.getClass();
                                            dhpa dhpaVar = dhwgVar3.a;
                                            if (dhpaVar != null && (map = dhpaVar.a) != null) {
                                                ArrayList arrayList = new ArrayList(map.size());
                                                for (final Map.Entry entry2 : map.entrySet()) {
                                                    arrayList.add(dhzo.a(new fdap() { // from class: dhyj
                                                        @Override // defpackage.fdap
                                                        public final Object invoke(Object obj5) {
                                                            Data data5 = (Data) obj5;
                                                            data5.getClass();
                                                            final Map.Entry entry3 = entry2;
                                                            dhzo.b(data5, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, new fdap() { // from class: dhym
                                                                @Override // defpackage.fdap
                                                                public final Object invoke(Object obj6) {
                                                                    Data data6 = (Data) obj6;
                                                                    data6.getClass();
                                                                    final Map.Entry entry4 = entry3;
                                                                    dhzo.b(data6, "id", new fdap() { // from class: dhyk
                                                                        @Override // defpackage.fdap
                                                                        public final Object invoke(Object obj7) {
                                                                            Data data7 = (Data) obj7;
                                                                            data7.getClass();
                                                                            Object key = entry4.getKey();
                                                                            Objects.toString(key);
                                                                            data7.putString("id", "/abuse/label/".concat(String.valueOf(key)));
                                                                            return fctx.a;
                                                                        }
                                                                    });
                                                                    return fctx.a;
                                                                }
                                                            });
                                                            data5.putDouble("score", ((Number) entry3.getValue()).floatValue());
                                                            return fctx.a;
                                                        }
                                                    }));
                                                }
                                                data4.putList("class", arrayList);
                                            }
                                            return fctx.a;
                                        }
                                    });
                                    return fctx.a;
                                }
                            });
                            return fctx.a;
                        }
                    });
                }
                for (dhtu dhtuVar : list2) {
                    if (dhtuVar instanceof dhtt) {
                        dhtt dhttVar = (dhtt) dhtuVar;
                        data.putBuffer(dhttVar.a, dhttVar.b);
                    }
                }
                return fctx.a;
            }
        }));
        try {
            try {
                Data data = ((Data) objInvoke).getData("output/final-verdict");
                String string = data.getString("policy_violation");
                String string2 = data.getString(GroupManagementRequest.ACTION_TAG);
                if (fdbq.f(string2, "WARNING_REQUIRED")) {
                    dhunVar = dhun.b;
                } else {
                    try {
                        dhunVar = (dhun) Enum.valueOf(dhun.class, string2);
                    } catch (IllegalArgumentException e) {
                        ((ekrd) ((ekrd) dhyo.a.j()).g(e).h("com/google/android/libraries/abuse/hades/moirai/tartarus/TartarusOutputDataConverter", "toVerdict", 86, "TartarusOutputDataConverter.kt")).q("Unknown action in Tartarus verdict.");
                        throw new dhvf(8, 11, "Unknown action in Tartarus verdict.", e, null, 48);
                    }
                }
                int i = 0;
                if (((Data) objInvoke).hasKey(".%z6g*")) {
                    linkedHashMap = new LinkedHashMap();
                    if (((Data) objInvoke).isData(".%z6g*")) {
                        Data data2 = ((Data) objInvoke).getData(".%z6g*");
                        int size = data2.size() - 1;
                        if (size >= 0) {
                            int i2 = 0;
                            while (true) {
                                String strKeyAt = data2.keyAt(i2);
                                linkedHashMap.put(strKeyAt, data2.getData(strKeyAt).toString());
                                if (i2 == size) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                } else {
                    linkedHashMap = fcvp.a;
                }
                dhvp dhvpVar = new dhvp(string, dhunVar, linkedHashMap);
                Data data3 = (Data) objInvoke;
                String nullableString = data3.getNullableString("output/log");
                if (data3.isData("b!rgh*")) {
                    Data data4 = data3.getData("b!rgh*");
                    if (data4.size() == 0) {
                        listQ = fcvo.a;
                    } else {
                        fddq fddqVarR = fddu.r(0, data4.size());
                        ArrayList arrayList = new ArrayList();
                        fcvy it = fddqVarR.iterator();
                        while (((fddp) it).a) {
                            String strKeyAt2 = data4.keyAt(it.a());
                            ArrayList arrayList2 = null;
                            if (data4.isData(strKeyAt2)) {
                                Data data5 = data4.getData(strKeyAt2);
                                fddq fddqVarR2 = fddu.r(i, data5.size());
                                ArrayList arrayList3 = new ArrayList();
                                fcvy it2 = fddqVarR2.iterator();
                                while (((fddp) it2).a) {
                                    String strKeyAt3 = data5.keyAt(it2.a());
                                    dhvd dhvdVar = !data5.isDouble(strKeyAt3) ? null : new dhvd(strKeyAt2, strKeyAt3, data5.getDouble(strKeyAt3));
                                    if (dhvdVar != null) {
                                        arrayList3.add(dhvdVar);
                                    }
                                }
                                arrayList2 = arrayList3;
                            }
                            if (arrayList2 != null) {
                                arrayList.add(arrayList2);
                            }
                            i = 0;
                        }
                        listQ = fcva.q(arrayList);
                    }
                } else {
                    listQ = fcvo.a;
                }
                return new dhyq(dhvpVar, nullableString, listQ, fcvo.a);
            } catch (NullPointerException e2) {
                ((ekrd) ((ekrd) dhyo.a.j()).g(e2).h("com/google/android/libraries/abuse/hades/moirai/tartarus/TartarusOutputDataConverter", "toVerdict", 67, "TartarusOutputDataConverter.kt")).q("No verdict in Tartarus output.");
                throw new dhvf(7, 15, "No verdict in Tartarus output.", e2, null, 48);
            }
        } catch (RuntimeException e3) {
            ((ekrd) ((ekrd) dhyo.a.j()).g(e3).h("com/google/android/libraries/abuse/hades/moirai/tartarus/TartarusOutputDataConverter", "convert", 46, "TartarusOutputDataConverter.kt")).q("Error converting Tartarus data to verdict.");
            throw new dhvf(6, 10, "Error converting Tartarus data to verdict.", e3, null, 48);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
