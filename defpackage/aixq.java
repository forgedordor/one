package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aixq {
    public final fcsu a;
    public final aqof b;
    private final cmvy c;
    private final aqbh d;

    public aixq(cmvy cmvyVar, fcsu fcsuVar, aqbh aqbhVar, aqof aqofVar) {
        this.c = cmvyVar;
        this.a = fcsuVar;
        this.d = aqbhVar;
        this.b = aqofVar;
    }

    public static int e(elns elnsVar) {
        switch (elnsVar.ordinal()) {
            case 3:
                return 3;
            case 4:
            case 14:
            default:
                return 1;
            case 5:
                return 2;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            case 10:
                return 8;
            case 11:
                return 9;
            case 12:
                return 10;
            case 13:
                return 11;
            case 15:
                return 12;
        }
    }

    public static final int f(elns elnsVar) {
        switch (elnsVar.ordinal()) {
            case 3:
                return 4;
            case 4:
            case 14:
            default:
                return 1;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
            case 8:
            case 9:
            case 10:
                return 3;
            case 11:
            case 12:
            case 13:
                return 5;
            case 15:
                return 2;
        }
    }

    public final ekgb a(ekgb ekgbVar) {
        if (ekgbVar.isEmpty()) {
            return ekgb.r(elns.UNKNOWN_FORMAT);
        }
        final ekfw ekfwVar = new ekfw();
        Iterable$EL.forEach(ekgbVar, new Consumer() { // from class: aixp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                elns elnsVarB;
                aixq aixqVar = this.a;
                alqm alqmVar = (alqm) obj;
                if (!((eoth) ((aqns) aixqVar.b).a.b()).a("bugle.use_destination_type_from_messaging_identity")) {
                    elnsVarB = aixqVar.b(alqmVar, alqmVar.A(), true);
                } else if (alpd.b(alqmVar.j())) {
                    elnsVarB = elns.SATELLITE_ESP_DEMO;
                } else {
                    alwk alwkVarA = alqmVar.a();
                    alwkVarA.getClass();
                    switch (alwkVarA) {
                        case UNKNOWN_DESTINATION_TYPE:
                        case UNKNOWN_DIALABLE:
                        case UNRECOGNIZED:
                            elnsVarB = elns.UNKNOWN_FORMAT;
                            break;
                        case PHONE_E164:
                            elnsVarB = elns.E164_PHONE_NUMBER;
                            break;
                        case EMAIL:
                            elnsVarB = elns.EMAIL_ADDRESS;
                            break;
                        case BOT:
                            elnsVarB = elns.RBM_BOT;
                            break;
                        case UNKNOWN_SENDER:
                            elnsVarB = elns.EMPTY_STRING;
                            break;
                        case PHONE_SHORT_NO_COUNTRY:
                            elnsVarB = elns.DIGIT_SHORT_CODE_WITHOUT_COUNTRY;
                            break;
                        case PHONE_SHORT_WITH_COUNTRY:
                            elnsVarB = elns.DIGIT_SHORT_CODE_WITH_COUNTRY;
                            break;
                        case PHONE_EMERGENCY:
                            elnsVarB = elns.EMERGENCY_NUMBER;
                            break;
                        case PHONE_LOCAL_WITH_COUNTRY:
                            elnsVarB = elns.NON_E164_FORMATTABLE_PHONE_LOCAL_WITH_COUNTRY;
                            break;
                        case PHONE_LOCAL_NO_COUNTRY:
                            elnsVarB = elns.NON_E164_FORMATTABLE_LOCAL_NUMBER;
                            break;
                        case PHONE_NATIONAL:
                            elnsVarB = elns.E164_FORMATTABLE_NATIONAL_PHONE_NUMBER;
                            break;
                        case SATELLITE_ESP:
                            elnsVarB = elns.SATELLITE_ESP;
                            break;
                        case PENPAL_BOT:
                            elnsVarB = elns.PENPAL_BOT;
                            break;
                        case ALPHA_SHORT_NO_COUNTRY:
                            elnsVarB = elns.ALPHANUMERIC_SHORT_CODE_WITHOUT_COUNTRY;
                            break;
                        case ALPHA_SHORT_WITH_COUNTRY:
                            elnsVarB = elns.ALPHANUMERIC_SHORT_CODE_WITH_COUNTRY;
                            break;
                        case PHONE_WITH_COUNTRY:
                            elnsVarB = elns.LIKE_E164_PHONE_WITH_COUNTRY;
                            break;
                        case PHONE_WITH_IDD:
                            elnsVarB = elns.LIKE_E164_PHONE_WITH_IDD;
                            break;
                        case PHONE_WITH_PLUS:
                            elnsVarB = elns.LIKE_E164_PHONE_WITH_PLUS;
                            break;
                        case PHONE_INVALID_TOO_SHORT:
                            elnsVarB = elns.PHONE_INVALID_TOO_SHORT;
                            break;
                        case PHONE_INVALID_TOO_LONG:
                            elnsVarB = elns.PHONE_INVALID_TOO_LONG;
                            break;
                        case PHONE_INVALID_LENGTH:
                            elnsVarB = elns.PHONE_INVALID_LENGTH;
                            break;
                        case PHONE_INVALID_COUNTRY_CODE:
                            elnsVarB = elns.PHONE_INVALID_COUNTRY_CODE;
                            break;
                        default:
                            throw new IllegalArgumentException("unknown enum value: ".concat(alwkVarA.toString()));
                    }
                    elnsVarB.getClass();
                }
                ekfwVar.h(elnsVarB);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ekfwVar.g();
    }

    public final elns b(alqm alqmVar, boolean z, boolean z2) {
        String strJ = z2 ? alqmVar.j() : alqmVar.o();
        if (this.d.a() && alqmVar.B()) {
            return alpd.a(strJ) ? elns.SATELLITE_ESP : elns.SATELLITE_ESP_DEMO;
        }
        if (ejwk.c(strJ)) {
            return strJ == null ? elns.UNKNOWN_FORMAT : elns.EMPTY_STRING;
        }
        if (z) {
            return elns.RBM_BOT;
        }
        if ("ʼWAP_PUSH_SI!ʼ".equals(strJ)) {
            return elns.WAP_PUSH_SI;
        }
        cqce cqceVar = cmvy.a;
        if (alwh.i(strJ)) {
            return elns.EMAIL_ADDRESS;
        }
        if (alqmVar.u()) {
            return elns.EMERGENCY_NUMBER;
        }
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && alqmVar.z()) {
            return elns.PENPAL_BOT;
        }
        if (!alwh.k(strJ)) {
            return alqmVar.y() ? elns.E164_PHONE_NUMBER : alqmVar.r() ? elns.E164_FORMATTABLE_NATIONAL_PHONE_NUMBER : elns.NON_E164_FORMATTABLE_LOCAL_NUMBER;
        }
        boolean zContains = strJ.contains("+");
        boolean zH = this.c.h(strJ);
        return zContains ? zH ? elns.ALPHANUMERIC_SHORT_CODE_WITH_COUNTRY : elns.DIGIT_SHORT_CODE_WITH_COUNTRY : zH ? elns.ALPHANUMERIC_SHORT_CODE_WITHOUT_COUNTRY : elns.DIGIT_SHORT_CODE_WITHOUT_COUNTRY;
    }

    public final elns c(alqm alqmVar, boolean z) {
        return b(alqmVar, z, false);
    }

    @Deprecated
    public final List d(List list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            arrayList.add(elns.UNKNOWN_FORMAT);
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            arrayList.add(c(((alrj) this.a.b()).t(bindData), bbbe.d(bindData)));
        }
        return arrayList;
    }
}
