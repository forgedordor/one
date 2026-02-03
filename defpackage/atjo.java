package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atjo {
    private final aimb a;

    public atjo(aimb aimbVar) {
        aimbVar.getClass();
        this.a = aimbVar;
    }

    private static final int b(int i) {
        if (i <= 0) {
            return 2;
        }
        if (i < 8) {
            return 3;
        }
        if (i < 16) {
            return 4;
        }
        if (i < 32) {
            return 5;
        }
        if (i < 64) {
            return 6;
        }
        if (i < 96) {
            return 7;
        }
        if (i < 128) {
            return 8;
        }
        if (i < 160) {
            return 9;
        }
        if (i < 192) {
            return 10;
        }
        if (i < 256) {
            return 11;
        }
        if (i < 320) {
            return 12;
        }
        if (i < 384) {
            return 13;
        }
        if (i < 480) {
            return 14;
        }
        if (i < 512) {
            return 28;
        }
        if (i < 720) {
            return 15;
        }
        if (i < 768) {
            return 29;
        }
        if (i < 1024) {
            return 16;
        }
        if (i < 1280) {
            return 17;
        }
        if (i < 1536) {
            return 18;
        }
        if (i < 1792) {
            return 19;
        }
        if (i < 2048) {
            return 20;
        }
        if (i < 2560) {
            return 21;
        }
        if (i < 3072) {
            return 22;
        }
        if (i < 4096) {
            return 23;
        }
        if (i < 6144) {
            return 24;
        }
        if (i < 8192) {
            return 25;
        }
        return i < 12288 ? 26 : 27;
    }

    public final void a(athh athhVar, Long l, atjp atjpVar) {
        int i;
        emwa emwaVar = (emwa) emwn.b.createBuilder();
        emwaVar.getClass();
        emwaVar.copyOnWrite();
        emwn emwnVar = (emwn) emwaVar.instance;
        emwnVar.c |= 1;
        emwnVar.d = athhVar.a;
        if (atjpVar.m == 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        emwaVar.copyOnWrite();
        emwn emwnVar2 = (emwn) emwaVar.instance;
        emwnVar2.f = atjn.a(r2) - 1;
        emwnVar2.c |= 4;
        new evsz(emwnVar2.h, emwn.a);
        List list = atjpVar.a;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(atjs.a((atjr) it.next()));
        }
        emwaVar.copyOnWrite();
        emwn emwnVar3 = (emwn) emwaVar.instance;
        evsx evsxVar = emwnVar3.h;
        if (!evsxVar.c()) {
            emwnVar3.h = evsn.mutableCopy(evsxVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            emwnVar3.h.h(((emwm) it2.next()).n);
        }
        int i3 = atjpVar.b;
        emwaVar.copyOnWrite();
        emwn emwnVar4 = (emwn) emwaVar.instance;
        emwnVar4.c |= 32;
        emwnVar4.k = i3;
        boolean z = atjpVar.d;
        emwaVar.copyOnWrite();
        emwn emwnVar5 = (emwn) emwaVar.instance;
        emwnVar5.c |= 64;
        emwnVar5.l = z;
        int i4 = atjpVar.n;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i4 - 1;
        int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? 6 : 5 : 4 : 3 : 2;
        emwaVar.copyOnWrite();
        emwn emwnVar6 = (emwn) emwaVar.instance;
        emwnVar6.q = i6 - 2;
        emwnVar6.c |= 2048;
        int iA = cqmf.a(atjpVar.h);
        emwaVar.copyOnWrite();
        emwn emwnVar7 = (emwn) emwaVar.instance;
        emwnVar7.n = elgz.a(iA);
        emwnVar7.c |= 256;
        DesugarCollections.unmodifiableList(emwnVar7.i).getClass();
        List<atjq> list2 = atjpVar.j;
        ArrayList arrayList2 = new ArrayList(fcva.p(list2, 10));
        for (atjq atjqVar : list2) {
            emwj emwjVar = (emwj) emwk.a.createBuilder();
            emwjVar.getClass();
            emwm emwmVarA = atjs.a(atjqVar.a);
            emwjVar.copyOnWrite();
            emwk emwkVar = (emwk) emwjVar.instance;
            emwkVar.c = emwmVarA.n;
            emwkVar.b |= 1;
            int iA2 = atjn.a(atjqVar.c);
            emwjVar.copyOnWrite();
            emwk emwkVar2 = (emwk) emwjVar.instance;
            emwkVar2.d = iA2 - 1;
            emwkVar2.b |= 2;
            evrj evrjVarA = evxd.a(atjqVar.b);
            emwjVar.copyOnWrite();
            emwk emwkVar3 = (emwk) emwjVar.instance;
            emwkVar3.e = evrjVarA;
            emwkVar3.b |= 4;
            evsn evsnVarBuild = emwjVar.build();
            evsnVarBuild.getClass();
            arrayList2.add((emwk) evsnVarBuild);
        }
        emwaVar.copyOnWrite();
        emwn emwnVar8 = (emwn) emwaVar.instance;
        evtg evtgVar = emwnVar8.i;
        if (!evtgVar.c()) {
            emwnVar8.i = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(arrayList2, emwnVar8.i);
        long jLongValue = l.longValue();
        emwaVar.copyOnWrite();
        emwn emwnVar9 = (emwn) emwaVar.instance;
        emwnVar9.c |= 2;
        emwnVar9.e = jLongValue;
        Duration duration = atjpVar.e;
        if (duration != null) {
            evrj evrjVarA2 = evxd.a(duration);
            emwaVar.copyOnWrite();
            emwn emwnVar10 = (emwn) emwaVar.instance;
            emwnVar10.g = evrjVarA2;
            emwnVar10.c |= 8;
        }
        String str = atjpVar.f;
        if (str != null) {
            emwaVar.copyOnWrite();
            emwn emwnVar11 = (emwn) emwaVar.instance;
            emwnVar11.c |= 128;
            emwnVar11.m = str;
        }
        ContentType contentType = atjpVar.g;
        if (contentType != null) {
            elhc elhcVarA = cqmg.a(contentType.toString());
            elhcVarA.getClass();
            emwaVar.copyOnWrite();
            emwn emwnVar12 = (emwn) emwaVar.instance;
            emwnVar12.j = elhcVarA.a();
            emwnVar12.c |= 16;
        }
        Integer num = atjpVar.i;
        if (num != null) {
            int iIntValue = num.intValue();
            emwaVar.copyOnWrite();
            emwn emwnVar13 = (emwn) emwaVar.instance;
            emwnVar13.c |= 512;
            emwnVar13.o = iIntValue;
        }
        emwy emwyVar = atjpVar.l;
        if (emwyVar != null) {
            emwaVar.copyOnWrite();
            emwn emwnVar14 = (emwn) emwaVar.instance;
            emwnVar14.r = emwyVar;
            emwnVar14.c |= 4096;
        }
        bxnx bxnxVar = atjpVar.k;
        if (bxnxVar != null) {
            emwd emwdVar = (emwd) emwi.a.createBuilder();
            emwdVar.getClass();
            int iB = bxnw.b(bxnxVar.c);
            if (iB == 0) {
                iB = 1;
            }
            int i7 = iB + (-2) != 1 ? 3 : 2;
            emwdVar.copyOnWrite();
            emwi emwiVar = (emwi) emwdVar.instance;
            emwiVar.f = emkf.a(i7);
            emwiVar.b |= 2;
            emki emkiVar = bxnxVar.g;
            if (emkiVar == null) {
                emkiVar = emki.a;
            }
            int i8 = 9;
            switch (emkiVar.v) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                case 11:
                    i = 13;
                    break;
                case 12:
                    i = 14;
                    break;
                case 13:
                    i = 15;
                    break;
                case 14:
                    i = 16;
                    break;
                case 15:
                    i = 17;
                    break;
                case 16:
                    i = 18;
                    break;
                case 17:
                    i = 19;
                    break;
                case 18:
                    i = 20;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                i = 1;
            }
            emwdVar.copyOnWrite();
            emwi emwiVar2 = (emwi) emwdVar.instance;
            emwiVar2.g = emkd.a(i);
            emwiVar2.b |= 4;
            emki emkiVar2 = bxnxVar.g;
            if (emkiVar2 == null) {
                emkiVar2 = emki.a;
            }
            int iB2 = emkg.b(emkiVar2.t);
            if (iB2 == 0) {
                iB2 = 1;
            }
            emwdVar.copyOnWrite();
            emwi emwiVar3 = (emwi) emwdVar.instance;
            emwiVar3.e = emkg.a(iB2);
            emwiVar3.b |= 1;
            int iB3 = emkg.b(((emwi) emwdVar.instance).e);
            if (iB3 == 0) {
                iB3 = 1;
            }
            int i9 = iB3 - 2;
            if (i9 == 1 || i9 == 2) {
                emwe emweVar = (emwe) emwf.a.createBuilder();
                emweVar.getClass();
                if (contentType != null) {
                    String string = contentType.toString();
                    if (le.o(string)) {
                        i8 = 3;
                    } else if (string.equals("image/gif")) {
                        i8 = 4;
                    } else if (string.equals("image/vnd.wap.wbmp")) {
                        i8 = 5;
                    } else if (string.equals("image/png")) {
                        i8 = 6;
                    } else if (string.equals("image/x-ms-bmp")) {
                        i8 = 7;
                    } else if (string.equals("image/heif")) {
                        i8 = 8;
                    } else if (!string.equals("image/heic")) {
                        i8 = 2;
                    }
                    emweVar.copyOnWrite();
                    emwf emwfVar = (emwf) emweVar.instance;
                    emwfVar.g = i8 - 2;
                    emwfVar.b |= 16;
                }
                emki emkiVar3 = bxnxVar.g;
                if (emkiVar3 == null) {
                    emkiVar3 = emki.a;
                }
                int iB4 = b(emkiVar3.p);
                emweVar.copyOnWrite();
                emwf emwfVar2 = (emwf) emweVar.instance;
                emwfVar2.c = emwc.a(iB4);
                emwfVar2.b |= 1;
                emki emkiVar4 = bxnxVar.g;
                if (emkiVar4 == null) {
                    emkiVar4 = emki.a;
                }
                int iB5 = b(emkiVar4.o);
                emweVar.copyOnWrite();
                emwf emwfVar3 = (emwf) emweVar.instance;
                emwfVar3.d = emwc.a(iB5);
                emwfVar3.b |= 2;
                emki emkiVar5 = bxnxVar.g;
                if (emkiVar5 == null) {
                    emkiVar5 = emki.a;
                }
                int iB6 = b(emkiVar5.r);
                emweVar.copyOnWrite();
                emwf emwfVar4 = (emwf) emweVar.instance;
                emwfVar4.e = emwc.a(iB6);
                emwfVar4.b |= 4;
                emki emkiVar6 = bxnxVar.g;
                if (emkiVar6 == null) {
                    emkiVar6 = emki.a;
                }
                int iB7 = b(emkiVar6.q);
                emweVar.copyOnWrite();
                emwf emwfVar5 = (emwf) emweVar.instance;
                emwfVar5.f = emwc.a(iB7);
                emwfVar5.b |= 8;
                evsn evsnVarBuild2 = emweVar.build();
                evsnVarBuild2.getClass();
                emwdVar.copyOnWrite();
                emwi emwiVar4 = (emwi) emwdVar.instance;
                emwiVar4.d = (emwf) evsnVarBuild2;
                emwiVar4.c = 4;
            } else if (i9 == 3) {
                emwg emwgVar = (emwg) emwh.a.createBuilder();
                emwgVar.getClass();
                emki emkiVar7 = bxnxVar.g;
                if (emkiVar7 == null) {
                    emkiVar7 = emki.a;
                }
                int i10 = emkiVar7.u;
                if (i10 < 1000000) {
                    i2 = 3;
                } else if (i10 < 1500000) {
                    i2 = 4;
                } else if (i10 < 2000000) {
                    i2 = 5;
                } else if (i10 < 2500000) {
                    i2 = 6;
                } else if (i10 < 5000000) {
                    i2 = 7;
                } else if (i10 < 10000000) {
                    i2 = 8;
                } else if (i10 < 20000000) {
                    i2 = 9;
                }
                emwgVar.copyOnWrite();
                emwh emwhVar = (emwh) emwgVar.instance;
                emwhVar.c = i2 - 2;
                emwhVar.b = 1 | emwhVar.b;
                emki emkiVar8 = bxnxVar.g;
                if (emkiVar8 == null) {
                    emkiVar8 = emki.a;
                }
                emkh emkhVarB = emkh.b(emkiVar8.l);
                if (emkhVarB == null) {
                    emkhVarB = emkh.UNRECOGNIZED;
                }
                emkhVarB.getClass();
                emwgVar.copyOnWrite();
                emwh emwhVar2 = (emwh) emwgVar.instance;
                emwhVar2.d = emkhVarB.a();
                emwhVar2.b |= 2;
                emki emkiVar9 = bxnxVar.g;
                if (emkiVar9 == null) {
                    emkiVar9 = emki.a;
                }
                emkh emkhVarB2 = emkh.b(emkiVar9.i);
                if (emkhVarB2 == null) {
                    emkhVarB2 = emkh.UNRECOGNIZED;
                }
                emkhVarB2.getClass();
                emwgVar.copyOnWrite();
                emwh emwhVar3 = (emwh) emwgVar.instance;
                emwhVar3.e = emkhVarB2.a();
                emwhVar3.b |= 4;
                emki emkiVar10 = bxnxVar.g;
                if (emkiVar10 == null) {
                    emkiVar10 = emki.a;
                }
                int iB8 = b(emkiVar10.n);
                emwgVar.copyOnWrite();
                emwh emwhVar4 = (emwh) emwgVar.instance;
                emwhVar4.f = emwc.a(iB8);
                emwhVar4.b |= 8;
                emki emkiVar11 = bxnxVar.g;
                if (emkiVar11 == null) {
                    emkiVar11 = emki.a;
                }
                int iB9 = b(emkiVar11.m);
                emwgVar.copyOnWrite();
                emwh emwhVar5 = (emwh) emwgVar.instance;
                emwhVar5.g = emwc.a(iB9);
                emwhVar5.b |= 16;
                evsn evsnVarBuild3 = emwgVar.build();
                evsnVarBuild3.getClass();
                emwdVar.copyOnWrite();
                emwi emwiVar5 = (emwi) emwdVar.instance;
                emwiVar5.d = (emwh) evsnVarBuild3;
                emwiVar5.c = 5;
            }
            evsn evsnVarBuild4 = emwdVar.build();
            evsnVarBuild4.getClass();
            emwaVar.copyOnWrite();
            emwn emwnVar15 = (emwn) emwaVar.instance;
            emwnVar15.p = (emwi) evsnVarBuild4;
            emwnVar15.c |= 1024;
        }
        evsn evsnVarBuild5 = emwaVar.build();
        evsnVarBuild5.getClass();
        ailn ailnVarA = this.a.a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BUGLE_FILE_PROCESSING, ellgVar);
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.cq = (emwn) evsnVarBuild5;
        ellhVar.h |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_FILE_PROCESSING_EVENT);
    }
}
