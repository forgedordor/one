package defpackage;

import android.graphics.Color;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ealr {
    public final ekgp a;
    public final ekgp b;
    private final ealu c;
    private final ekgp d;
    private final ekgp e;

    public ealr(ealu ealuVar) {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(euth.OPERATIONAL, eate.OPERATIONAL);
        ekgiVar.i(euth.CLOSED_TEMPORARILY, eate.CLOSED_TEMPORARILY);
        ekgiVar.i(euth.CLOSED_PERMANENTLY, eate.CLOSED_PERMANENTLY);
        this.d = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i(eutn.ACCESS, easo.ACCESS);
        ekgiVar2.i(eutn.BREAKFAST, easo.BREAKFAST);
        ekgiVar2.i(eutn.BRUNCH, easo.BRUNCH);
        ekgiVar2.i(eutn.DELIVERY, easo.DELIVERY);
        ekgiVar2.i(eutn.DINNER, easo.DINNER);
        ekgiVar2.i(eutn.DRIVE_THROUGH, easo.DRIVE_THROUGH);
        ekgiVar2.i(eutn.HAPPY_HOUR, easo.HAPPY_HOUR);
        ekgiVar2.i(eutn.KITCHEN, easo.KITCHEN);
        ekgiVar2.i(eutn.LUNCH, easo.LUNCH);
        ekgiVar2.i(eutn.ONLINE_SERVICE_HOURS, easo.ONLINE_SERVICE_HOURS);
        ekgiVar2.i(eutn.PICKUP, easo.PICKUP);
        ekgiVar2.i(eutn.SENIOR_HOURS, easo.SENIOR_HOURS);
        ekgiVar2.i(eutn.TAKEOUT, easo.TAKEOUT);
        this.e = ekgiVar2.c();
        ekgi ekgiVar3 = new ekgi();
        ekgiVar3.i(eusk.EV_CONNECTOR_TYPE_UNSPECIFIED, easb.EV_CONNECTOR_TYPE_UNSPECIFIED);
        ekgiVar3.i(eusk.EV_CONNECTOR_TYPE_OTHER, easb.EV_CONNECTOR_TYPE_OTHER);
        ekgiVar3.i(eusk.EV_CONNECTOR_TYPE_J1772, easb.EV_CONNECTOR_TYPE_J1772);
        ekgiVar3.i(eusk.EV_CONNECTOR_TYPE_TYPE_2, easb.EV_CONNECTOR_TYPE_TYPE_2);
        ekgiVar3.i(eusk.EV_CONNECTOR_TYPE_CHADEMO, easb.EV_CONNECTOR_TYPE_CHADEMO);
        ekgiVar3.i(eusk.EV_CONNECTOR_TYPE_CCS_COMBO_1, easb.EV_CONNECTOR_TYPE_CCS_COMBO_1);
        ekgiVar3.i(eusk.EV_CONNECTOR_TYPE_CCS_COMBO_2, easb.EV_CONNECTOR_TYPE_CCS_COMBO_2);
        ekgiVar3.i(eusk.EV_CONNECTOR_TYPE_TESLA, easb.EV_CONNECTOR_TYPE_TESLA);
        ekgiVar3.i(eusk.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T, easb.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T);
        ekgiVar3.i(eusk.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET, easb.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET);
        this.a = ekgiVar3.c();
        ekgi ekgiVar4 = new ekgi();
        ekgiVar4.i(eusn.FUEL_TYPE_UNSPECIFIED, easf.FUEL_TYPE_UNSPECIFIED);
        ekgiVar4.i(eusn.DIESEL, easf.DIESEL);
        ekgiVar4.i(eusn.REGULAR_UNLEADED, easf.REGULAR_UNLEADED);
        ekgiVar4.i(eusn.MIDGRADE, easf.MIDGRADE);
        ekgiVar4.i(eusn.PREMIUM, easf.PREMIUM);
        ekgiVar4.i(eusn.SP91, easf.SP91);
        ekgiVar4.i(eusn.SP91_E10, easf.SP91_E10);
        ekgiVar4.i(eusn.SP92, easf.SP92);
        ekgiVar4.i(eusn.SP95, easf.SP95);
        ekgiVar4.i(eusn.SP95_E10, easf.SP95_E10);
        ekgiVar4.i(eusn.SP98, easf.SP98);
        ekgiVar4.i(eusn.SP99, easf.SP99);
        ekgiVar4.i(eusn.SP100, easf.SP100);
        ekgiVar4.i(eusn.LPG, easf.LPG);
        ekgiVar4.i(eusn.E80, easf.E80);
        ekgiVar4.i(eusn.E85, easf.E85);
        ekgiVar4.i(eusn.METHANE, easf.METHANE);
        ekgiVar4.i(eusn.BIO_DIESEL, easf.BIO_DIESEL);
        ekgiVar4.i(eusn.TRUCK_DIESEL, easf.TRUCK_DIESEL);
        this.b = ekgiVar4.c();
        this.c = ealuVar;
    }

    public static final String b(String str) {
        return str.startsWith("//") ? "https:".concat(String.valueOf(str)) : str;
    }

    public static final Instant c(evvp evvpVar) {
        return Instant.ofEpochSecond(evvpVar.b, evvpVar.c);
    }

    public static final easl d(eybk eybkVar) {
        String str = eybkVar.b;
        long j = eybkVar.c;
        Long lValueOf = Long.valueOf(j);
        int i = eybkVar.d;
        Integer numValueOf = Integer.valueOf(i);
        if (str == null) {
            throw new NullPointerException("Null currencyCode");
        }
        lValueOf.getClass();
        if (j > 0) {
            numValueOf.getClass();
            ejwl.f(i >= 0, "Unit is positive and nano must be positive or zero, but was: %s.", numValueOf);
        } else if (j < 0) {
            numValueOf.getClass();
            ejwl.f(i <= 0, "Unit is negative and nano must be negative or zero, but was: %s.", numValueOf);
        }
        return new eaqs(str, lValueOf, numValueOf);
    }

    public static final String e(String str, String str2) {
        ekhx ekhxVar = eldq.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        if (!"a".matches("[a-z0-9-]+")) {
            throw new IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
        }
        if (eldq.a.contains("a")) {
            throw new IllegalArgumentException("Element \"a\" is not supported.");
        }
        eldq.c(eldt.a(str), "a", linkedHashMap);
        eldq.b(str2, "a", arrayList);
        return eldq.a("a", linkedHashMap, arrayList).a;
    }

    private final easp f(eutq eutqVar) throws dcff {
        Instant instantJ;
        eutn eutnVar;
        Instant instantJ2;
        eatv eatvVarQ;
        easm easmVarH = easp.h();
        evtg evtgVar = eutqVar.d;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = evtgVar.iterator();
        while (true) {
            instantJ = null;
            eatv eatvVarQ2 = null;
            if (!it.hasNext()) {
                break;
            }
            eutm eutmVar = (eutm) it.next();
            eaot eaotVar = new eaot();
            if ((1 & eutmVar.b) != 0) {
                eutl eutlVar = eutmVar.c;
                if (eutlVar == null) {
                    eutlVar = eutl.a;
                }
                eatvVarQ = q(eutlVar);
            } else {
                eatvVarQ = null;
            }
            eaotVar.a = eatvVarQ;
            if ((eutmVar.b & 2) != 0) {
                eutl eutlVar2 = eutmVar.d;
                if (eutlVar2 == null) {
                    eutlVar2 = eutl.a;
                }
                eatvVarQ2 = q(eutlVar2);
            }
            eaotVar.b = eatvVarQ2;
            arrayList.add(eaotVar.a());
        }
        easmVarH.b(arrayList);
        easmVarH.d(eutqVar.e);
        switch (eutqVar.f) {
            case 0:
                eutnVar = eutn.SECONDARY_HOURS_TYPE_UNSPECIFIED;
                break;
            case 1:
                eutnVar = eutn.DRIVE_THROUGH;
                break;
            case 2:
                eutnVar = eutn.HAPPY_HOUR;
                break;
            case 3:
                eutnVar = eutn.DELIVERY;
                break;
            case 4:
                eutnVar = eutn.TAKEOUT;
                break;
            case 5:
                eutnVar = eutn.KITCHEN;
                break;
            case 6:
                eutnVar = eutn.BREAKFAST;
                break;
            case 7:
                eutnVar = eutn.LUNCH;
                break;
            case 8:
                eutnVar = eutn.DINNER;
                break;
            case 9:
                eutnVar = eutn.BRUNCH;
                break;
            case 10:
                eutnVar = eutn.PICKUP;
                break;
            case 11:
                eutnVar = eutn.ACCESS;
                break;
            case 12:
                eutnVar = eutn.SENIOR_HOURS;
                break;
            case 13:
                eutnVar = eutn.ONLINE_SERVICE_HOURS;
                break;
            default:
                eutnVar = null;
                break;
        }
        if (eutnVar == null) {
            eutnVar = eutn.UNRECOGNIZED;
        }
        eaon eaonVar = (eaon) easmVarH;
        eaonVar.a = (easo) this.e.getOrDefault(eutnVar, null);
        evtg evtgVar2 = eutqVar.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it2 = evtgVar2.iterator();
        while (it2.hasNext()) {
            try {
                eyaz eyazVar = ((eutp) it2.next()).b;
                if (eyazVar == null) {
                    eyazVar = eyaz.a;
                }
                eatr eatrVarC = eats.c(n(eyazVar));
                eatrVarC.b(true);
                arrayList2.add(eatrVarC.a());
            } catch (IllegalArgumentException e) {
                throw h(String.format("Special day is not properly defined: %s", e.getMessage()));
            }
        }
        easmVarH.c(arrayList2);
        eaonVar.b = (eutqVar.b & 1) != 0 ? Boolean.valueOf(eutqVar.c) : null;
        if ((eutqVar.b & 2) != 0) {
            evvp evvpVar = eutqVar.h;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            instantJ2 = j(evvpVar);
        } else {
            instantJ2 = null;
        }
        eaonVar.c = instantJ2;
        if ((eutqVar.b & 4) != 0) {
            evvp evvpVar2 = eutqVar.i;
            if (evvpVar2 == null) {
                evvpVar2 = evvp.a;
            }
            instantJ = j(evvpVar2);
        }
        eaonVar.d = instantJ;
        return easmVarH.e();
    }

    private final List g(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f((eutq) it.next()));
        }
        return arrayList;
    }

    private static final dcff h(String str) {
        return new dcff(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static final String i(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static final Instant j(evvp evvpVar) {
        return Instant.ofEpochSecond(evvpVar.b, evvpVar.c);
    }

    private static final eatb k(boolean z, boolean z2) {
        return !z ? eatb.UNKNOWN : z2 ? eatb.TRUE : eatb.FALSE;
    }

    private static final String l(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return String.valueOf(str).concat(".png");
    }

    private static final LatLng m(eybg eybgVar) {
        return new LatLng(eybgVar.b, eybgVar.c);
    }

    private static final easi n(eyaz eyazVar) {
        return easi.e(eyazVar.b, eyazVar.c, eyazVar.d);
    }

    private static final Uri o(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return Uri.parse(str);
    }

    private static final eapr p(eusd eusdVar) throws dcff {
        String str = eusdVar.b;
        if (str.isEmpty()) {
            throw h("Author name not provided for an AuthorAttribution result.");
        }
        eaob eaobVar = new eaob();
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        eaobVar.a = str;
        eaobVar.b = i(eusdVar.c);
        eaobVar.c = i(eusdVar.d);
        ejwl.b(!((eaoc) eaobVar.a()).a.isEmpty(), "Name must not be empty.");
        return eaobVar.a();
    }

    private static final eatv q(eutl eutlVar) throws dcff {
        easi easiVarN;
        eary earyVar;
        int i = eutlVar.c;
        easj easjVarC = easj.c(eutlVar.d, eutlVar.e);
        if ((eutlVar.b & 8) != 0) {
            eyaz eyazVar = eutlVar.f;
            if (eyazVar == null) {
                eyazVar = eyaz.a;
            }
            easiVarN = n(eyazVar);
        } else {
            easiVarN = null;
        }
        switch (i) {
            case 0:
                earyVar = eary.SUNDAY;
                break;
            case 1:
                earyVar = eary.MONDAY;
                break;
            case 2:
                earyVar = eary.TUESDAY;
                break;
            case 3:
                earyVar = eary.WEDNESDAY;
                break;
            case 4:
                earyVar = eary.THURSDAY;
                break;
            case 5:
                earyVar = eary.FRIDAY;
                break;
            case 6:
                earyVar = eary.SATURDAY;
                break;
            default:
                throw h("Day of week must an integer between 0 and 6");
        }
        eatu eatuVarE = eatv.e(earyVar, easjVarC);
        ((eapj) eatuVarE).a = easiVarN;
        eatuVarE.b(eutlVar.g);
        return eatuVarE.a();
    }

    final eatj a(eutz eutzVar) throws dcff {
        eatb eatbVar;
        eatb eatbVar2;
        eatb eatbVar3;
        eapy eapyVar;
        List list;
        easp easpVarF;
        String strI;
        String strI2;
        String strI3;
        String strI4;
        eaqg eaqgVar;
        eaqi eaqiVar;
        Integer numValueOf;
        LatLng latLngM;
        LatLng latLngM2;
        String strI5;
        String strI6;
        easp easpVarF2;
        eatb eatbVar4;
        eatb eatbVar5;
        eatb eatbVar6;
        eatb eatbVar7;
        eatb eatbVar8;
        eatb eatbVar9;
        eatb eatbVar10;
        eatb eatbVar11;
        eatb eatbVar12;
        ArrayList arrayList;
        eaqc eaqcVar;
        eatm eatmVarA;
        eark earkVar;
        String strI7;
        String strI8;
        ArrayList arrayList2;
        String strH;
        String strI9;
        String strI10;
        String strI11;
        String strI12;
        ArrayList arrayList3;
        ArrayList arrayList4;
        LatLngBounds latLngBounds;
        easl easlVarD;
        eatc eatcVarAx = eatj.ax();
        eutb eutbVar = eutzVar.aj;
        if (eutbVar == null) {
            eutbVar = eutb.a;
        }
        eanw eanwVar = new eanw();
        eatb eatbVar13 = eatb.UNKNOWN;
        eanwVar.a(eatbVar13);
        eanwVar.c(eatbVar13);
        eanwVar.b(eatbVar13);
        eanwVar.d(eatbVar13);
        int i = 1;
        eanwVar.b(k(1 == (eutbVar.b & 1), eutbVar.c));
        eanwVar.a(k((eutbVar.b & 2) != 0, eutbVar.d));
        eanwVar.c(k((eutbVar.b & 4) != 0, eutbVar.e));
        eanwVar.d(k((eutbVar.b & 8) != 0, eutbVar.f));
        eatb eatbVar14 = eanwVar.a;
        if (eatbVar14 == null || (eatbVar = eanwVar.b) == null || (eatbVar2 = eanwVar.c) == null || (eatbVar3 = eanwVar.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (eanwVar.a == null) {
                sb.append(" wheelchairAccessibleParking");
            }
            if (eanwVar.b == null) {
                sb.append(" wheelchairAccessibleEntrance");
            }
            if (eanwVar.c == null) {
                sb.append(" wheelchairAccessibleRestroom");
            }
            if (eanwVar.d == null) {
                sb.append(" wheelchairAccessibleSeating");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        eapu eapuVar = new eapu(eatbVar14, eatbVar, eatbVar2, eatbVar3);
        eaox eaoxVar = (eaox) eatcVarAx;
        eaoxVar.S = eapuVar;
        eaoxVar.a = i(eutzVar.l);
        evtg<eutd> evtgVar = eutzVar.n;
        if (evtgVar.isEmpty()) {
            eapyVar = null;
        } else {
            ArrayList arrayList5 = new ArrayList();
            for (eutd eutdVar : evtgVar) {
                try {
                    eapn eapnVarD = eapo.d(eutdVar.b, eutdVar.d);
                    ((eany) eapnVarD).b = i(eutdVar.c);
                    arrayList5.add(eapnVarD.c());
                } catch (IllegalArgumentException e) {
                    throw h(String.format("AddressComponent is not properly defined: %s.", e.getMessage()));
                }
            }
            eapyVar = new eapy(arrayList5);
        }
        eaoxVar.e = eapyVar;
        String str = eutzVar.y;
        eaoxVar.d = str.isEmpty() ? null : eldr.a(str).a;
        eatcVarAx.b(k(1 == (eutzVar.c & 1), eutzVar.ac));
        evtg evtgVar2 = eutzVar.B;
        if (evtgVar2.isEmpty()) {
            list = null;
        } else {
            Stream map = Collection.EL.stream(evtgVar2).map(new Function() { // from class: ealp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    eutf eutfVar = (eutf) obj;
                    return ealr.e(ealr.b(eutfVar.c), eutfVar.b);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i2 = ekgb.d;
            list = (List) map.collect(ekcv.a);
        }
        eaoxVar.f = list;
        int i3 = eutzVar.z;
        euth euthVar = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? null : euth.FUTURE_OPENING : euth.CLOSED_PERMANENTLY : euth.CLOSED_TEMPORARILY : euth.OPERATIONAL : euth.BUSINESS_STATUS_UNSPECIFIED;
        if (euthVar == null) {
            euthVar = euth.UNRECOGNIZED;
        }
        eaoxVar.g = (eate) this.d.getOrDefault(euthVar, null);
        eatcVarAx.d(k((eutzVar.b & 8192) != 0, eutzVar.I));
        if ((eutzVar.b & 4194304) != 0) {
            eutq eutqVar = eutzVar.R;
            if (eutqVar == null) {
                eutqVar = eutq.a;
            }
            easpVarF = f(eutqVar);
        } else {
            easpVarF = null;
        }
        eaoxVar.h = easpVarF;
        eaoxVar.K = g(eutzVar.S);
        eatcVarAx.e(k((eutzVar.b & 2048) != 0, eutzVar.G));
        eatcVarAx.f(k((eutzVar.b & 4096) != 0, eutzVar.H));
        if ((eutzVar.b & 1) != 0) {
            eybi eybiVar = eutzVar.f;
            if (eybiVar == null) {
                eybiVar = eybi.a;
            }
            strI = i(eybiVar.b);
        } else {
            strI = null;
        }
        eaoxVar.r = strI;
        if ((eutzVar.b & 1) != 0) {
            eybi eybiVar2 = eutzVar.f;
            if (eybiVar2 == null) {
                eybiVar2 = eybi.a;
            }
            strI2 = i(eybiVar2.c);
        } else {
            strI2 = null;
        }
        eaoxVar.t = strI2;
        if ((eutzVar.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
            eybi eybiVar3 = eutzVar.U;
            if (eybiVar3 == null) {
                eybiVar3 = eybi.a;
            }
            strI3 = i(eybiVar3.b);
        } else {
            strI3 = null;
        }
        eaoxVar.i = strI3;
        if ((eutzVar.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
            eybi eybiVar4 = eutzVar.U;
            if (eybiVar4 == null) {
                eybiVar4 = eybi.a;
            }
            strI4 = i(eybiVar4.c);
        } else {
            strI4 = null;
        }
        eaoxVar.j = strI4;
        if ((eutzVar.c & 8192) != 0) {
            eusj eusjVar = eutzVar.al;
            if (eusjVar == null) {
                eusjVar = eusj.a;
            }
            Integer numValueOf2 = Integer.valueOf(eusjVar.b);
            Stream map2 = Collection.EL.stream(eusjVar.c).map(new Function() { // from class: ealq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    eusk euskVar;
                    eusi eusiVar = (eusi) obj;
                    Instant instantC = null;
                    switch (eusiVar.c) {
                        case 0:
                            euskVar = eusk.EV_CONNECTOR_TYPE_UNSPECIFIED;
                            break;
                        case 1:
                            euskVar = eusk.EV_CONNECTOR_TYPE_OTHER;
                            break;
                        case 2:
                            euskVar = eusk.EV_CONNECTOR_TYPE_J1772;
                            break;
                        case 3:
                            euskVar = eusk.EV_CONNECTOR_TYPE_TYPE_2;
                            break;
                        case 4:
                            euskVar = eusk.EV_CONNECTOR_TYPE_CHADEMO;
                            break;
                        case 5:
                            euskVar = eusk.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                            break;
                        case 6:
                            euskVar = eusk.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                            break;
                        case 7:
                            euskVar = eusk.EV_CONNECTOR_TYPE_TESLA;
                            break;
                        case 8:
                            euskVar = eusk.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                            break;
                        case 9:
                            euskVar = eusk.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                            break;
                        case 10:
                            euskVar = eusk.EV_CONNECTOR_TYPE_NACS;
                            break;
                        default:
                            euskVar = null;
                            break;
                    }
                    if (euskVar == null) {
                        euskVar = eusk.UNRECOGNIZED;
                    }
                    easb easbVar = (easb) this.a.a.getOrDefault(euskVar, easb.EV_CONNECTOR_TYPE_UNSPECIFIED);
                    Double dValueOf = Double.valueOf(eusiVar.d);
                    Integer numValueOf3 = Integer.valueOf(eusiVar.e);
                    if (easbVar == null) {
                        throw new NullPointerException("Null type");
                    }
                    Integer numValueOf4 = (eusiVar.b & 1) != 0 ? Integer.valueOf(eusiVar.f) : null;
                    Integer numValueOf5 = (eusiVar.b & 2) != 0 ? Integer.valueOf(eusiVar.g) : null;
                    if ((eusiVar.b & 4) != 0) {
                        evvp evvpVar = eusiVar.h;
                        if (evvpVar == null) {
                            evvpVar = evvp.a;
                        }
                        instantC = ealr.c(evvpVar);
                    }
                    return new eaqe(easbVar, dValueOf, numValueOf3, numValueOf4, numValueOf5, instantC);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i4 = ekgb.d;
            List list2 = (List) map2.collect(ekcv.a);
            if (list2 == null) {
                throw new NullPointerException("Null connectorAggregations");
            }
            eaqgVar = new eaqg(numValueOf2, list2);
        } else {
            eaqgVar = null;
        }
        eaoxVar.V = eaqgVar;
        eaoxVar.b = i(eutzVar.l);
        if ((eutzVar.c & 4096) != 0) {
            eusp euspVar = eutzVar.ak;
            if (euspVar == null) {
                euspVar = eusp.a;
            }
            Stream map3 = Collection.EL.stream(euspVar.b).map(new Function() { // from class: ealo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    eusn eusnVar;
                    euso eusoVar = (euso) obj;
                    switch (eusoVar.b) {
                        case 0:
                            eusnVar = eusn.FUEL_TYPE_UNSPECIFIED;
                            break;
                        case 1:
                            eusnVar = eusn.DIESEL;
                            break;
                        case 2:
                            eusnVar = eusn.REGULAR_UNLEADED;
                            break;
                        case 3:
                            eusnVar = eusn.MIDGRADE;
                            break;
                        case 4:
                            eusnVar = eusn.PREMIUM;
                            break;
                        case 5:
                            eusnVar = eusn.SP91;
                            break;
                        case 6:
                            eusnVar = eusn.SP91_E10;
                            break;
                        case 7:
                            eusnVar = eusn.SP92;
                            break;
                        case 8:
                            eusnVar = eusn.SP95;
                            break;
                        case 9:
                            eusnVar = eusn.SP95_E10;
                            break;
                        case 10:
                            eusnVar = eusn.SP98;
                            break;
                        case 11:
                            eusnVar = eusn.SP99;
                            break;
                        case 12:
                            eusnVar = eusn.SP100;
                            break;
                        case 13:
                            eusnVar = eusn.LPG;
                            break;
                        case 14:
                            eusnVar = eusn.E80;
                            break;
                        case 15:
                            eusnVar = eusn.E85;
                            break;
                        case 16:
                            eusnVar = eusn.METHANE;
                            break;
                        case 17:
                            eusnVar = eusn.BIO_DIESEL;
                            break;
                        case 18:
                            eusnVar = eusn.TRUCK_DIESEL;
                            break;
                        case 19:
                            eusnVar = eusn.DIESEL_PLUS;
                            break;
                        case 20:
                            eusnVar = eusn.E100;
                            break;
                        default:
                            eusnVar = null;
                            break;
                    }
                    if (eusnVar == null) {
                        eusnVar = eusn.UNRECOGNIZED;
                    }
                    easf easfVar = (easf) this.a.b.getOrDefault(eusnVar, easf.FUEL_TYPE_UNSPECIFIED);
                    eybk eybkVar = eusoVar.c;
                    if (eybkVar == null) {
                        eybkVar = eybk.a;
                    }
                    easl easlVarD2 = ealr.d(eybkVar);
                    evvp evvpVar = eusoVar.d;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    Instant instantC = ealr.c(evvpVar);
                    if (easfVar == null) {
                        throw new NullPointerException("Null type");
                    }
                    if (instantC != null) {
                        return new eaqk(easfVar, easlVarD2, instantC);
                    }
                    throw new NullPointerException("Null updateTime");
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i5 = ekgb.d;
            List list3 = (List) map3.collect(ekcv.a);
            eaog eaogVar = new eaog();
            eaogVar.a(list3);
            List list4 = eaogVar.a;
            if (list4 == null) {
                throw new IllegalStateException("Property \"fuelPrices\" has not been set");
            }
            eaogVar.a(ekgb.n(list4));
            List list5 = eaogVar.a;
            if (list5 == null) {
                throw new IllegalStateException("Missing required properties: fuelPrices");
            }
            eaqiVar = new eaqi(list5);
        } else {
            eaqiVar = null;
        }
        eaoxVar.X = eaqiVar;
        eatcVarAx.g(k((eutzVar.b & Integer.MIN_VALUE) != 0, eutzVar.ab));
        eatcVarAx.h(k((eutzVar.c & 4) != 0, eutzVar.ae));
        eatcVarAx.i(k((eutzVar.c & 8) != 0, eutzVar.af));
        eaoxVar.R = o(eutzVar.s);
        String str2 = eutzVar.E;
        if (str2.isEmpty()) {
            numValueOf = null;
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
            }
        }
        eaoxVar.k = numValueOf;
        eaoxVar.m = l(eutzVar.D);
        eaoxVar.l = l(eutzVar.D);
        eaoxVar.n = i(eutzVar.e);
        eaoxVar.x = i(eutzVar.k);
        if ((eutzVar.b & 16) != 0) {
            eybg eybgVar = eutzVar.p;
            if (eybgVar == null) {
                eybgVar = eybg.a;
            }
            latLngM = m(eybgVar);
        } else {
            latLngM = null;
        }
        eaoxVar.o = latLngM;
        eatcVarAx.j(k((eutzVar.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0, eutzVar.W));
        if ((eutzVar.b & 16) != 0) {
            eybg eybgVar2 = eutzVar.p;
            if (eybgVar2 == null) {
                eybgVar2 = eybg.a;
            }
            latLngM2 = m(eybgVar2);
        } else {
            latLngM2 = null;
        }
        eaoxVar.p = latLngM2;
        eatcVarAx.k(k((eutzVar.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0, eutzVar.X));
        if ((eutzVar.b & 1) != 0) {
            eybi eybiVar5 = eutzVar.f;
            if (eybiVar5 == null) {
                eybiVar5 = eybi.a;
            }
            strI5 = i(eybiVar5.b);
        } else {
            strI5 = null;
        }
        eaoxVar.q = strI5;
        if ((eutzVar.b & 1) != 0) {
            eybi eybiVar6 = eutzVar.f;
            if (eybiVar6 == null) {
                eybiVar6 = eybi.a;
            }
            strI6 = i(eybiVar6.c);
        } else {
            strI6 = null;
        }
        eaoxVar.s = strI6;
        eaoxVar.y = i(eutzVar.j);
        if ((eutzVar.b & 64) != 0) {
            eutq eutqVar2 = eutzVar.v;
            if (eutqVar2 == null) {
                eutqVar2 = eutq.a;
            }
            easpVarF2 = f(eutqVar2);
        } else {
            easpVarF2 = null;
        }
        eaoxVar.v = easpVarF2;
        eatcVarAx.l(k((eutzVar.b & 16777216) != 0, eutzVar.V));
        euts eutsVar = eutzVar.ah;
        if (eutsVar == null) {
            eutsVar = euts.a;
        }
        eaop eaopVar = new eaop();
        eatb eatbVar15 = eatb.UNKNOWN;
        eaopVar.b(eatbVar15);
        eaopVar.e(eatbVar15);
        eaopVar.c(eatbVar15);
        eaopVar.f(eatbVar15);
        eaopVar.g(eatbVar15);
        eaopVar.a(eatbVar15);
        eaopVar.d(eatbVar15);
        eaopVar.b(k(1 == (eutsVar.b & 1), eutsVar.c));
        eaopVar.e(k((eutsVar.b & 2) != 0, eutsVar.d));
        eaopVar.c(k((eutsVar.b & 4) != 0, eutsVar.e));
        eaopVar.f(k((eutsVar.b & 8) != 0, eutsVar.f));
        eaopVar.g(k((eutsVar.b & 16) != 0, eutsVar.g));
        eaopVar.a(k((eutsVar.b & 32) != 0, eutsVar.h));
        eaopVar.d(k((eutsVar.b & 64) != 0, eutsVar.i));
        eatb eatbVar16 = eaopVar.a;
        if (eatbVar16 == null || (eatbVar4 = eaopVar.b) == null || (eatbVar5 = eaopVar.c) == null || (eatbVar6 = eaopVar.d) == null || (eatbVar7 = eaopVar.e) == null || (eatbVar8 = eaopVar.f) == null || (eatbVar9 = eaopVar.g) == null) {
            StringBuilder sb2 = new StringBuilder();
            if (eaopVar.a == null) {
                sb2.append(" freeParkingLot");
            }
            if (eaopVar.b == null) {
                sb2.append(" paidParkingLot");
            }
            if (eaopVar.c == null) {
                sb2.append(" freeStreetParking");
            }
            if (eaopVar.d == null) {
                sb2.append(" paidStreetParking");
            }
            if (eaopVar.e == null) {
                sb2.append(" valetParking");
            }
            if (eaopVar.f == null) {
                sb2.append(" freeGarageParking");
            }
            if (eaopVar.g == null) {
                sb2.append(" paidGarageParking");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        eaoxVar.T = new eaqw(eatbVar16, eatbVar4, eatbVar5, eatbVar6, eatbVar7, eatbVar8, eatbVar9);
        eutu eutuVar = eutzVar.ag;
        if (eutuVar == null) {
            eutuVar = eutu.a;
        }
        eaor eaorVar = new eaor();
        eaorVar.b(eatbVar15);
        eaorVar.c(eatbVar15);
        eaorVar.a(eatbVar15);
        eaorVar.d(eatbVar15);
        eaorVar.b(k(1 == (eutuVar.b & 1), eutuVar.c));
        eaorVar.c(k((eutuVar.b & 2) != 0, eutuVar.d));
        eaorVar.a(k((eutuVar.b & 4) != 0, eutuVar.e));
        eaorVar.d(k((eutuVar.b & 8) != 0, eutuVar.f));
        eatb eatbVar17 = eaorVar.a;
        if (eatbVar17 == null || (eatbVar10 = eaorVar.b) == null || (eatbVar11 = eaorVar.c) == null || (eatbVar12 = eaorVar.d) == null) {
            StringBuilder sb3 = new StringBuilder();
            if (eaorVar.a == null) {
                sb3.append(" acceptsCreditCards");
            }
            if (eaorVar.b == null) {
                sb3.append(" acceptsDebitCards");
            }
            if (eaorVar.c == null) {
                sb3.append(" acceptsCashOnly");
            }
            if (eaorVar.d == null) {
                sb3.append(" acceptsNfc");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
        }
        eaoxVar.U = new eaqy(eatbVar17, eatbVar10, eatbVar11, eatbVar12);
        eaoxVar.w = i(eutzVar.k);
        evtg<eusx> evtgVar3 = eutzVar.x;
        if (evtgVar3.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (eusx eusxVar : evtgVar3) {
                String str3 = eusxVar.b;
                if (str3.isEmpty() || str3.split("/").length != 4) {
                    throw h("Photo reference not provided for a PhotoMetadata result.");
                }
                easy easyVarG = easz.g((String) ekis.h(ejxk.b('/').g(str3), 3));
                eaov eaovVar = (eaov) easyVarG;
                eaovVar.b = eusxVar.b;
                easyVarG.b((String) Collection.EL.stream(eusxVar.e).map(new Function() { // from class: ealn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        eusd eusdVar = (eusd) obj;
                        return ealr.e(ealr.b(eusdVar.c), eusdVar.b);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.joining(", ")));
                easyVarG.c(eusxVar.d);
                easyVarG.d(eusxVar.c);
                evtg evtgVar4 = eusxVar.e;
                if (evtgVar4.isEmpty()) {
                    eaqcVar = null;
                } else {
                    int i6 = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    Iterator<E> it = evtgVar4.iterator();
                    while (it.hasNext()) {
                        ekfwVar.h(p((eusd) it.next()));
                    }
                    eaqcVar = new eaqc(ekgb.n(ekfwVar.g()));
                }
                eaovVar.c = eaqcVar;
                arrayList.add(easyVarG.e());
            }
        }
        eaoxVar.z = arrayList;
        eaoxVar.B = eutzVar.g.isEmpty() ? null : eutzVar.g;
        if ((eutzVar.b & 8) != 0) {
            eutw eutwVar = eutzVar.o;
            if (eutwVar == null) {
                eutwVar = eutw.a;
            }
            eapa eapaVar = new eapa();
            eapaVar.a = i(eutwVar.c);
            eapaVar.b = i(eutwVar.b);
            eatmVarA = eapaVar.a();
        } else {
            eatmVarA = null;
        }
        eaoxVar.C = eatmVarA;
        int i7 = eutzVar.A;
        euud euudVar = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? null : euud.PRICE_LEVEL_VERY_EXPENSIVE : euud.PRICE_LEVEL_EXPENSIVE : euud.PRICE_LEVEL_MODERATE : euud.PRICE_LEVEL_INEXPENSIVE : euud.PRICE_LEVEL_FREE : euud.PRICE_LEVEL_UNSPECIFIED;
        if (euudVar == null) {
            euudVar = euud.UNRECOGNIZED;
        }
        int iOrdinal = euudVar.ordinal();
        eaoxVar.D = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? null : 4 : 3 : 2 : 1 : 0;
        euuf euufVar = eutzVar.an;
        if (euufVar == null) {
            euufVar = euuf.a;
        }
        if ((euufVar.b & 1) != 0) {
            euuf euufVar2 = eutzVar.an;
            if (euufVar2 == null) {
                euufVar2 = euuf.a;
            }
            eybk eybkVar = euufVar2.c;
            if (eybkVar == null) {
                eybkVar = eybk.a;
            }
            easl easlVarD2 = d(eybkVar);
            euuf euufVar3 = eutzVar.an;
            if (((euufVar3 == null ? euuf.a : euufVar3).b & 2) != 0) {
                if (euufVar3 == null) {
                    euufVar3 = euuf.a;
                }
                eybk eybkVar2 = euufVar3.d;
                if (eybkVar2 == null) {
                    eybkVar2 = eybk.a;
                }
                easlVarD = d(eybkVar2);
            } else {
                easlVarD = null;
            }
            earkVar = new eark(easlVarD2, easlVarD);
        } else {
            earkVar = null;
        }
        eaoxVar.E = earkVar;
        eaoxVar.F = i(eutzVar.h);
        if ((eutzVar.b & 2) != 0) {
            eybi eybiVar7 = eutzVar.i;
            if (eybiVar7 == null) {
                eybiVar7 = eybi.a;
            }
            strI7 = i(eybiVar7.b);
        } else {
            strI7 = null;
        }
        eaoxVar.G = strI7;
        if ((eutzVar.b & 2) != 0) {
            eybi eybiVar8 = eutzVar.i;
            if (eybiVar8 == null) {
                eybiVar8 = eybi.a;
            }
            strI8 = i(eybiVar8.c);
        } else {
            strI8 = null;
        }
        eaoxVar.H = strI8;
        int i8 = 65536;
        eatcVarAx.o(k((eutzVar.c & 65536) != 0, eutzVar.am));
        double d = eutzVar.r;
        double d2 = 1.0d;
        eaoxVar.I = d < 1.0d ? null : Double.valueOf(d);
        eatcVarAx.p(k((eutzVar.b & 16384) != 0, eutzVar.J));
        eaoxVar.u = i(eutzVar.d);
        eatcVarAx.q(k((eutzVar.c & 2) != 0, eutzVar.ad));
        evtg evtgVar5 = eutzVar.u;
        if (evtgVar5.isEmpty()) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            Iterator it2 = evtgVar5.iterator();
            while (it2.hasNext()) {
                euuh euuhVar = (euuh) it2.next();
                double d3 = euuhVar.f;
                if (d3 == 0.0d) {
                    throw h("Review rating not provided for a Review result.");
                }
                int i9 = euuhVar.b;
                if ((i9 & 4) == 0) {
                    throw h("Author attribution not provided for a Review result.");
                }
                if ((i9 & 8) != 0) {
                    evvp evvpVar = euuhVar.h;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    strH = evxc.h(evvpVar);
                } else {
                    strH = null;
                }
                if ((euuhVar.b & i) != 0) {
                    eybi eybiVar9 = euuhVar.d;
                    if (eybiVar9 == null) {
                        eybiVar9 = eybi.a;
                    }
                    strI9 = i(eybiVar9.b);
                } else {
                    strI9 = null;
                }
                if ((euuhVar.b & i) != 0) {
                    eybi eybiVar10 = euuhVar.d;
                    if (eybiVar10 == null) {
                        eybiVar10 = eybi.a;
                    }
                    strI10 = i(eybiVar10.c);
                } else {
                    strI10 = null;
                }
                int i10 = i8;
                if ((euuhVar.b & 2) != 0) {
                    eybi eybiVar11 = euuhVar.e;
                    if (eybiVar11 == null) {
                        eybiVar11 = eybi.a;
                    }
                    strI11 = i(eybiVar11.b);
                } else {
                    strI11 = null;
                }
                if ((euuhVar.b & 2) != 0) {
                    eybi eybiVar12 = euuhVar.e;
                    if (eybiVar12 == null) {
                        eybiVar12 = eybi.a;
                    }
                    strI12 = i(eybiVar12.c);
                } else {
                    strI12 = null;
                }
                double d4 = d2;
                String strI13 = i(euuhVar.c);
                Double dValueOf = Double.valueOf(d3);
                eusd eusdVar = euuhVar.g;
                if (eusdVar == null) {
                    eusdVar = eusd.a;
                }
                eapr eaprVarP = p(eusdVar);
                eaoc eaocVar = (eaoc) eaprVarP;
                String strB = ejwk.b(eaocVar.b);
                Iterator it3 = it2;
                if (strB.startsWith("//")) {
                    strB = "https:".concat(strB);
                }
                ekhx ekhxVar = eldq.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str4 = strB;
                ArrayList arrayList6 = new ArrayList();
                eatc eatcVar = eatcVarAx;
                if (!"a".matches("[a-z0-9-]+")) {
                    throw new IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
                }
                if (eldq.a.contains("a")) {
                    throw new IllegalArgumentException("Element \"a\" is not supported.");
                }
                eldq.c(eldt.a(str4), "a", linkedHashMap);
                eldq.b(eaocVar.a, "a", arrayList6);
                eldp eldpVarA = eldq.a("a", linkedHashMap, arrayList6);
                eapd eapdVar = new eapd();
                eapdVar.f = dValueOf;
                eapdVar.g = eaprVarP;
                eapdVar.h = eldpVarA.a;
                eapdVar.i = strH;
                eapdVar.b = strI9;
                eapdVar.c = strI10;
                eapdVar.d = strI11;
                eapdVar.e = strI12;
                eapdVar.a = strI13;
                Double d5 = ((eape) eapdVar.a()).f;
                ejwl.f(d5.doubleValue() >= d4 && d5.doubleValue() <= 5.0d, "Rating must between 1.0 and 5.0 (inclusive), but was: %s.", d5);
                arrayList2.add(eapdVar.a());
                i8 = i10;
                d2 = d4;
                it2 = it3;
                eatcVarAx = eatcVar;
                i = 1;
            }
        }
        eatc eatcVar2 = eatcVarAx;
        int i11 = i8;
        eaoxVar.A = arrayList2;
        eaoxVar.J = g(eutzVar.T);
        eatcVar2.t(k((eutzVar.b & 262144) != 0, eutzVar.N));
        eatcVar2.u(k((eutzVar.b & 32768) != 0, eutzVar.K));
        eatcVar2.v(k((eutzVar.b & 1048576) != 0, eutzVar.P));
        eatcVar2.w(k((eutzVar.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0, eutzVar.Y));
        eatcVar2.x(k((eutzVar.b & 536870912) != 0, eutzVar.aa));
        eatcVar2.y(k((eutzVar.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0, eutzVar.Z));
        eatcVar2.z(k((eutzVar.b & 131072) != 0, eutzVar.M));
        eatcVar2.A(k((eutzVar.b & i11) != 0, eutzVar.L));
        eatcVar2.B(k((eutzVar.b & 2097152) != 0, eutzVar.Q));
        eatcVar2.C(k((eutzVar.b & 524288) != 0, eutzVar.O));
        eaoxVar.c = i(eutzVar.m);
        evtg<euty> evtgVar6 = eutzVar.ai;
        if (evtgVar6.isEmpty()) {
            arrayList3 = null;
        } else {
            arrayList3 = new ArrayList();
            for (euty eutyVar : evtgVar6) {
                String str5 = eutyVar.c;
                String str6 = eutyVar.b;
                if (str5 == null) {
                    throw new NullPointerException("Null id");
                }
                if (str6 == null) {
                    throw new NullPointerException("Null name");
                }
                arrayList3.add(new ears(str5, str6));
            }
        }
        eaoxVar.W = arrayList3;
        eatcVar2.D(k((eutzVar.b & 1024) != 0, eutzVar.F));
        ealu ealuVar = this.c;
        evtg<String> evtgVar7 = eutzVar.g;
        evtgVar7.getClass();
        if (evtgVar7.isEmpty()) {
            arrayList4 = null;
        } else {
            arrayList4 = new ArrayList();
            boolean z = false;
            for (String str7 : evtgVar7) {
                ekgp ekgpVar = ealuVar.a;
                if (ekgpVar.containsKey(str7)) {
                    arrayList4.add((eati) ekgpVar.get(str7));
                } else {
                    z = true;
                }
            }
            if (z) {
                arrayList4.add(eati.OTHER);
            }
        }
        eaoxVar.L = arrayList4;
        eaoxVar.N = (eutzVar.b & 512) != 0 ? Integer.valueOf(eutzVar.C) : null;
        eaoxVar.M = (eutzVar.b & 512) != 0 ? Integer.valueOf(eutzVar.C) : null;
        eaoxVar.O = (eutzVar.b & 128) != 0 ? Integer.valueOf(eutzVar.w) : null;
        if ((eutzVar.b & 32) != 0) {
            esxi esxiVar = eutzVar.q;
            if (esxiVar == null) {
                esxiVar = esxi.a;
            }
            eybg eybgVar3 = esxiVar.c;
            if (eybgVar3 == null) {
                eybgVar3 = eybg.a;
            }
            LatLng latLngM3 = m(eybgVar3);
            eybg eybgVar4 = esxiVar.d;
            if (eybgVar4 == null) {
                eybgVar4 = eybg.a;
            }
            latLngBounds = new LatLngBounds(latLngM3, m(eybgVar4));
        } else {
            latLngBounds = null;
        }
        eaoxVar.P = latLngBounds;
        eaoxVar.Q = o(eutzVar.t);
        eutb eutbVar2 = eutzVar.aj;
        boolean z2 = ((eutbVar2 == null ? eutb.a : eutbVar2).b & 2) != 0;
        if (eutbVar2 == null) {
            eutbVar2 = eutb.a;
        }
        eatcVar2.F(k(z2, eutbVar2.d));
        return eatcVar2.G();
    }
}
