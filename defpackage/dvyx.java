package defpackage;

import android.content.Context;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.sun.jna.Function;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvyx implements dwhr {
    private static dvyx b;
    public final Set a;
    private final Context c;
    private final dbyl d;
    private final Executor e;

    private dvyx(Context context) {
        List list = dbyl.m;
        dbyl dbylVarC = new dbyi(context, "LIGHTER_ANDROID").c();
        this.a = Collections.newSetFromMap(new WeakHashMap());
        this.e = Executors.newSingleThreadExecutor();
        this.c = context;
        this.d = dbylVarC;
    }

    public static synchronized dvyx a(Context context) {
        dvyx dvyxVar = b;
        if (dvyxVar != null) {
            return dvyxVar;
        }
        dvyx dvyxVar2 = new dvyx(context.getApplicationContext());
        b = dvyxVar2;
        return dvyxVar2;
    }

    public static final ephd c(dwpk dwpkVar) {
        final ephc ephcVar = (ephc) ephd.a.createBuilder();
        String strD = dwpkVar.d();
        ephcVar.copyOnWrite();
        ((ephd) ephcVar.instance).c = strD;
        String strE = dwpkVar.e();
        ephcVar.copyOnWrite();
        ((ephd) ephcVar.instance).e = strE;
        dwpj dwpjVar = dwpj.UNKNOWN;
        int iOrdinal = dwpkVar.b().ordinal();
        if (iOrdinal == 0) {
            ephcVar.copyOnWrite();
            ((ephd) ephcVar.instance).b = eyrf.a(2);
        } else if (iOrdinal == 1) {
            ephcVar.copyOnWrite();
            ((ephd) ephcVar.instance).b = eyrf.a(3);
        } else if (iOrdinal == 2) {
            ephcVar.copyOnWrite();
            ((ephd) ephcVar.instance).b = eyrf.a(4);
        } else if (iOrdinal == 3) {
            dvhx.b(dwpkVar.c(), new lbz() { // from class: dvyr
                @Override // defpackage.lbz
                public final void accept(Object obj) {
                    ephc ephcVar2 = ephcVar;
                    String str = (String) obj;
                    ephcVar2.copyOnWrite();
                    ephd ephdVar = (ephd) ephcVar2.instance;
                    ephd ephdVar2 = ephd.a;
                    ephdVar.b = eyrf.a(5);
                    ephcVar2.copyOnWrite();
                    ephd ephdVar3 = (ephd) ephcVar2.instance;
                    str.getClass();
                    ephdVar3.d = str;
                }
            });
        } else if (iOrdinal == 4) {
            ephcVar.copyOnWrite();
            ((ephd) ephcVar.instance).b = eyrf.a(7);
        }
        return (ephd) ephcVar.build();
    }

    @Override // defpackage.dwhr
    public final void b(final dwhq dwhqVar) {
        int i;
        ejud ejudVar = ejud.a;
        ejwi ejwiVarJ = (dwhqVar.l().g() && ((dwpk) dwhqVar.l().c()).b().equals(dwpj.EMAIL)) ? ejwi.j(((dwpk) dwhqVar.l().c()).d()) : ejudVar;
        dbyl dbylVar = this.d;
        final epgq epgqVar = (epgq) epgr.a.createBuilder();
        Context context = this.c;
        String packageName = context.getPackageName();
        epgqVar.copyOnWrite();
        epgr epgrVar = (epgr) epgqVar.instance;
        packageName.getClass();
        epgrVar.s = packageName;
        int iA = dwhqVar.a();
        if (iA != 10088) {
            switch (iA) {
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
                case 19:
                    i = 21;
                    break;
                case 20:
                    i = 22;
                    break;
                case 21:
                    i = 23;
                    break;
                case 22:
                    i = 24;
                    break;
                case 23:
                    i = 25;
                    break;
                case 24:
                    i = 26;
                    break;
                case 25:
                    i = 27;
                    break;
                case 26:
                    i = 28;
                    break;
                case 27:
                    i = 29;
                    break;
                case 28:
                    i = 30;
                    break;
                case 29:
                    i = 31;
                    break;
                case 30:
                    i = 32;
                    break;
                case 31:
                    i = 33;
                    break;
                case 32:
                    i = 34;
                    break;
                case 33:
                    i = 35;
                    break;
                case 34:
                    i = 36;
                    break;
                case 35:
                    i = 37;
                    break;
                case 36:
                    i = 38;
                    break;
                case 37:
                    i = 39;
                    break;
                case 38:
                    i = 40;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i = 41;
                    break;
                case 40:
                    i = 42;
                    break;
                case 41:
                    i = 43;
                    break;
                case 42:
                    i = 44;
                    break;
                case 43:
                    i = 45;
                    break;
                case 44:
                    i = 46;
                    break;
                case 45:
                    i = 47;
                    break;
                case 46:
                    i = 48;
                    break;
                case 47:
                    i = 49;
                    break;
                case 48:
                    i = 50;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i = 51;
                    break;
                case 50:
                    i = 52;
                    break;
                case 51:
                    i = 53;
                    break;
                case 52:
                    i = 54;
                    break;
                case 53:
                    i = 55;
                    break;
                case 54:
                    i = 56;
                    break;
                case 55:
                    i = 57;
                    break;
                case 56:
                    i = 58;
                    break;
                case 57:
                    i = 59;
                    break;
                case 58:
                    i = 60;
                    break;
                case 59:
                    i = 61;
                    break;
                case 60:
                    i = 62;
                    break;
                default:
                    switch (iA) {
                        case 62:
                            i = 64;
                            break;
                        case Function.ALT_CONVENTION /* 63 */:
                            i = 65;
                            break;
                        case 64:
                            i = 66;
                            break;
                        case 65:
                            i = 67;
                            break;
                        case 66:
                            i = 68;
                            break;
                        case 67:
                            i = 69;
                            break;
                        case 68:
                            i = 70;
                            break;
                        case 69:
                            i = 71;
                            break;
                        case 70:
                            i = 72;
                            break;
                        case 71:
                            i = 73;
                            break;
                        case 72:
                            i = 74;
                            break;
                        case 73:
                            i = 75;
                            break;
                        case 74:
                            i = 76;
                            break;
                        case 75:
                            i = 77;
                            break;
                        case 76:
                            i = 78;
                            break;
                        case 77:
                            i = 79;
                            break;
                        case 78:
                            i = 80;
                            break;
                        case 79:
                            i = 81;
                            break;
                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                            i = 82;
                            break;
                        case 81:
                            i = 83;
                            break;
                        case 82:
                            i = 84;
                            break;
                        case 83:
                            i = 85;
                            break;
                        case 84:
                            i = 86;
                            break;
                        case 85:
                            i = 87;
                            break;
                        case 86:
                            i = 88;
                            break;
                        case 87:
                            i = 89;
                            break;
                        case 88:
                            i = 90;
                            break;
                        case 89:
                            i = 91;
                            break;
                        case 90:
                            i = 92;
                            break;
                        case 91:
                            i = 93;
                            break;
                        case 92:
                            i = 94;
                            break;
                        case 93:
                            i = 95;
                            break;
                        case 94:
                            i = 96;
                            break;
                        case 95:
                            i = 97;
                            break;
                        case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                            i = 98;
                            break;
                        default:
                            switch (iA) {
                                case VCardConstants.DEFAULT_PREF /* 100 */:
                                    i = 102;
                                    break;
                                case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                    i = 103;
                                    break;
                                case 102:
                                    i = 104;
                                    break;
                                case 103:
                                    i = 105;
                                    break;
                                case 104:
                                    i = 106;
                                    break;
                                case 105:
                                    i = 107;
                                    break;
                                case 106:
                                    i = 108;
                                    break;
                                case 107:
                                    i = 109;
                                    break;
                                case 108:
                                    i = 110;
                                    break;
                                case 109:
                                    i = 111;
                                    break;
                                case 110:
                                    i = 112;
                                    break;
                                case 111:
                                    i = 113;
                                    break;
                                case 112:
                                    i = 114;
                                    break;
                                case 113:
                                    i = 115;
                                    break;
                                case 114:
                                    i = 116;
                                    break;
                                case 115:
                                    i = 117;
                                    break;
                                case 116:
                                    i = 118;
                                    break;
                                case 117:
                                    i = 119;
                                    break;
                                case 118:
                                    i = 120;
                                    break;
                                case 119:
                                    i = 121;
                                    break;
                                case 120:
                                    i = 122;
                                    break;
                                case 121:
                                    i = 123;
                                    break;
                                case 122:
                                    i = 124;
                                    break;
                                case 123:
                                    i = 125;
                                    break;
                                case 124:
                                    i = 126;
                                    break;
                                case 125:
                                    i = 127;
                                    break;
                                case 126:
                                    i = 128;
                                    break;
                                case 127:
                                    i = 129;
                                    break;
                                case 128:
                                    i = 130;
                                    break;
                                case 129:
                                    i = 131;
                                    break;
                                case 130:
                                    i = 132;
                                    break;
                                case 131:
                                    i = 133;
                                    break;
                                case 132:
                                    i = 134;
                                    break;
                                case 133:
                                    i = 135;
                                    break;
                                case 134:
                                    i = 136;
                                    break;
                                case 135:
                                    i = 137;
                                    break;
                                case 136:
                                    i = 138;
                                    break;
                                case 137:
                                    i = 139;
                                    break;
                                case 138:
                                    i = 140;
                                    break;
                                case 139:
                                    i = 141;
                                    break;
                                case 140:
                                    i = 142;
                                    break;
                                case 141:
                                    i = 143;
                                    break;
                                case 142:
                                    i = 144;
                                    break;
                                case 143:
                                    i = 145;
                                    break;
                                case 144:
                                    i = 146;
                                    break;
                                case 145:
                                    i = 147;
                                    break;
                                case 146:
                                    i = 148;
                                    break;
                                case 147:
                                    i = 149;
                                    break;
                                case 148:
                                    i = 150;
                                    break;
                                case 149:
                                    i = 151;
                                    break;
                                case 150:
                                    i = 152;
                                    break;
                                case 151:
                                    i = 153;
                                    break;
                                case 152:
                                    i = 154;
                                    break;
                                default:
                                    switch (iA) {
                                        case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                                            i = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
                                            break;
                                        case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                                            i = 204;
                                            break;
                                        case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                                            i = 205;
                                            break;
                                        case 204:
                                            i = 206;
                                            break;
                                        case 205:
                                            i = 207;
                                            break;
                                        case 206:
                                            i = 208;
                                            break;
                                        case 207:
                                            i = 209;
                                            break;
                                        case 208:
                                            i = 210;
                                            break;
                                        case 209:
                                            i = 211;
                                            break;
                                        case 210:
                                            i = 212;
                                            break;
                                        case 211:
                                            i = 213;
                                            break;
                                        case 212:
                                            i = 214;
                                            break;
                                        case 213:
                                            i = 215;
                                            break;
                                        default:
                                            switch (iA) {
                                                case 10000:
                                                    i = 10002;
                                                    break;
                                                case 10001:
                                                    i = 10003;
                                                    break;
                                                case 10002:
                                                    i = 10004;
                                                    break;
                                                case 10003:
                                                    i = 10005;
                                                    break;
                                                case 10004:
                                                    i = 10006;
                                                    break;
                                                case 10005:
                                                    i = 10007;
                                                    break;
                                                case 10006:
                                                    i = 10008;
                                                    break;
                                                case 10007:
                                                    i = 10009;
                                                    break;
                                                case 10008:
                                                    i = 10010;
                                                    break;
                                                case 10009:
                                                    i = 10011;
                                                    break;
                                                case 10010:
                                                    i = 10012;
                                                    break;
                                                case 10011:
                                                    i = 10013;
                                                    break;
                                                case 10012:
                                                    i = 10014;
                                                    break;
                                                case 10013:
                                                    i = 10015;
                                                    break;
                                                case 10014:
                                                    i = 10016;
                                                    break;
                                                case 10015:
                                                    i = 10017;
                                                    break;
                                                case 10016:
                                                    i = 10018;
                                                    break;
                                                case 10017:
                                                    i = 10019;
                                                    break;
                                                case 10018:
                                                    i = 10020;
                                                    break;
                                                case 10019:
                                                    i = 10021;
                                                    break;
                                                case 10020:
                                                    i = 10022;
                                                    break;
                                                case 10021:
                                                    i = 10023;
                                                    break;
                                                case 10022:
                                                    i = 10024;
                                                    break;
                                                case 10023:
                                                    i = 10025;
                                                    break;
                                                case 10024:
                                                    i = 10026;
                                                    break;
                                                case 10025:
                                                    i = 10027;
                                                    break;
                                                case 10026:
                                                    i = 10028;
                                                    break;
                                                case 10027:
                                                    i = 10029;
                                                    break;
                                                case 10028:
                                                    i = 10030;
                                                    break;
                                                case 10029:
                                                    i = 10031;
                                                    break;
                                                case 10030:
                                                    i = 10032;
                                                    break;
                                                case 10031:
                                                    i = 10033;
                                                    break;
                                                case 10032:
                                                    i = 10034;
                                                    break;
                                                case 10033:
                                                    i = 10035;
                                                    break;
                                                case 10034:
                                                    i = 10036;
                                                    break;
                                                case 10035:
                                                    i = 10037;
                                                    break;
                                                case 10036:
                                                    i = 10038;
                                                    break;
                                                case 10037:
                                                    i = 10039;
                                                    break;
                                                case 10038:
                                                    i = 10040;
                                                    break;
                                                case 10039:
                                                    i = 10041;
                                                    break;
                                                case 10040:
                                                    i = 10042;
                                                    break;
                                                case 10041:
                                                    i = 10043;
                                                    break;
                                                case 10042:
                                                    i = 10044;
                                                    break;
                                                case 10043:
                                                    i = 10045;
                                                    break;
                                                case 10044:
                                                    i = 10046;
                                                    break;
                                                case 10045:
                                                    i = 10047;
                                                    break;
                                                case 10046:
                                                    i = 10048;
                                                    break;
                                                case 10047:
                                                    i = 10049;
                                                    break;
                                                case 10048:
                                                    i = 10050;
                                                    break;
                                                case 10049:
                                                    i = 10051;
                                                    break;
                                                case 10050:
                                                    i = 10052;
                                                    break;
                                                case 10051:
                                                    i = 10053;
                                                    break;
                                                case 10052:
                                                    i = 10054;
                                                    break;
                                                case 10053:
                                                    i = 10055;
                                                    break;
                                                case 10054:
                                                    i = 10056;
                                                    break;
                                                case 10055:
                                                    i = 10057;
                                                    break;
                                                case 10056:
                                                    i = 10058;
                                                    break;
                                                case 10057:
                                                    i = 10059;
                                                    break;
                                                case 10058:
                                                    i = 10060;
                                                    break;
                                                case 10059:
                                                    i = 10061;
                                                    break;
                                                case 10060:
                                                    i = 10062;
                                                    break;
                                                case 10061:
                                                    i = 10063;
                                                    break;
                                                case 10062:
                                                    i = 10064;
                                                    break;
                                                case 10063:
                                                    i = 10065;
                                                    break;
                                                case 10064:
                                                    i = 10066;
                                                    break;
                                                case 10065:
                                                    i = 10067;
                                                    break;
                                                case 10066:
                                                    i = 10068;
                                                    break;
                                                case 10067:
                                                    i = 10069;
                                                    break;
                                                case 10068:
                                                    i = 10070;
                                                    break;
                                                case 10069:
                                                    i = 10071;
                                                    break;
                                                case 10070:
                                                    i = 10072;
                                                    break;
                                                case 10071:
                                                    i = 10073;
                                                    break;
                                                case 10072:
                                                    i = 10074;
                                                    break;
                                                case 10073:
                                                    i = 10075;
                                                    break;
                                                case 10074:
                                                    i = 10076;
                                                    break;
                                                case 10075:
                                                    i = 10077;
                                                    break;
                                                case 10076:
                                                    i = 10078;
                                                    break;
                                                case 10077:
                                                    i = 10079;
                                                    break;
                                                default:
                                                    switch (iA) {
                                                        case 10099:
                                                            i = 10101;
                                                            break;
                                                        case 10100:
                                                            i = 10102;
                                                            break;
                                                        case 10101:
                                                            i = 10103;
                                                            break;
                                                        case 10102:
                                                            i = 10104;
                                                            break;
                                                        case 10103:
                                                            i = 10105;
                                                            break;
                                                        case 10104:
                                                            i = 10106;
                                                            break;
                                                        case 10105:
                                                            i = 10107;
                                                            break;
                                                        case 10106:
                                                            i = 10108;
                                                            break;
                                                        case 10107:
                                                            i = 10109;
                                                            break;
                                                        case 10108:
                                                            i = 10110;
                                                            break;
                                                        default:
                                                            i = 0;
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            i = 10090;
        }
        epgqVar.copyOnWrite();
        epgr epgrVar2 = (epgr) epgqVar.instance;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        epgrVar2.c = i - 2;
        dvhx.b(dwhqVar.l(), new lbz() { // from class: dvyt
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                ephd ephdVarC = dvyx.c((dwpk) obj);
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                ephdVarC.getClass();
                epgrVar3.d = ephdVarC;
                epgrVar3.b |= 1;
            }
        });
        dvhx.b(dwhqVar.m(), new lbz() { // from class: dvxs
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                epgq epgqVar2 = epgqVar;
                String str = (String) obj;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                str.getClass();
                epgrVar3.e = str;
            }
        });
        dvhx.b(ejudVar, new lbz() { // from class: dvxt
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                epgq epgqVar2 = epgqVar;
                String str = (String) obj;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                str.getClass();
                epgrVar3.i = str;
            }
        });
        dvhx.b(dwhqVar.n(), new lbz() { // from class: dvxu
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                epgq epgqVar2 = epgqVar;
                String str = (String) obj;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                str.getClass();
                epgrVar3.h = str;
            }
        });
        dvhx.b(dwhqVar.b(), new lbz() { // from class: dvxv
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                dwig dwigVar = (dwig) obj;
                final epgs epgsVar = (epgs) epgt.a.createBuilder();
                ejwi ejwiVarB = dwigVar.b();
                epgsVar.getClass();
                dvhx.b(ejwiVarB, new lbz() { // from class: dvyn
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        epgs epgsVar2 = epgsVar;
                        epgsVar2.copyOnWrite();
                        epgt epgtVar = (epgt) epgsVar2.instance;
                        epgt epgtVar2 = epgt.a;
                        epgtVar.c = iIntValue;
                    }
                });
                dvhx.b(dwigVar.c(), new lbz() { // from class: dvyo
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        epgs epgsVar2 = epgsVar;
                        epgsVar2.copyOnWrite();
                        epgt epgtVar = (epgt) epgsVar2.instance;
                        epgt epgtVar2 = epgt.a;
                        epgtVar.b = iIntValue;
                    }
                });
                dvhx.b(dwigVar.a(), new lbz() { // from class: dvyp
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        epgs epgsVar2 = epgsVar;
                        epgsVar2.copyOnWrite();
                        epgt epgtVar = (epgt) epgsVar2.instance;
                        epgt epgtVar2 = epgt.a;
                        epgtVar.d = jLongValue;
                    }
                });
                epgt epgtVar = (epgt) epgsVar.build();
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                epgtVar.getClass();
                epgrVar3.t = epgtVar;
                epgrVar3.b |= 256;
            }
        });
        dvhx.b(dwhqVar.c(), new lbz() { // from class: dvxw
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                ephd ephdVarC = dvyx.c((dwpk) obj);
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                ephdVarC.getClass();
                epgrVar3.f = ephdVarC;
                epgrVar3.b |= 2;
            }
        });
        dvhx.b(dwhqVar.d(), new lbz() { // from class: dvxy
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                ephd ephdVarC;
                dwpx dwpxVar = (dwpx) obj;
                if (dwpxVar.e() == dwpu.ONE_TO_ONE) {
                    ephdVarC = dvyx.c(dwpxVar.c());
                } else {
                    ephc ephcVar = (ephc) ephd.a.createBuilder();
                    String strA = dwpxVar.d().a();
                    ephcVar.copyOnWrite();
                    ((ephd) ephcVar.instance).e = strA;
                    String strB = dwpxVar.d().b();
                    ephcVar.copyOnWrite();
                    ((ephd) ephcVar.instance).c = strB;
                    ephcVar.copyOnWrite();
                    ((ephd) ephcVar.instance).b = eyrf.a(6);
                    ephdVarC = (ephd) ephcVar.build();
                }
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                ephdVarC.getClass();
                epgrVar3.f = ephdVarC;
                epgrVar3.b |= 2;
            }
        });
        dvhx.b(dwhqVar.h(), new lbz() { // from class: dvxz
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                int i2;
                switch (((Integer) obj).intValue()) {
                    case 0:
                        i2 = 2;
                        break;
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        i2 = 4;
                        break;
                    case 3:
                        i2 = 5;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 7;
                        break;
                    case 6:
                        i2 = 8;
                        break;
                    case 7:
                        i2 = 9;
                        break;
                    case 8:
                        i2 = 10;
                        break;
                    case 9:
                        i2 = 11;
                        break;
                    case 10:
                        i2 = 12;
                        break;
                    case 11:
                        i2 = 13;
                        break;
                    case 12:
                        i2 = 14;
                        break;
                    case 13:
                        i2 = 15;
                        break;
                    case 14:
                        i2 = 16;
                        break;
                    case 15:
                        i2 = 17;
                        break;
                    case 16:
                        i2 = 18;
                        break;
                    case 17:
                        i2 = 19;
                        break;
                    case 18:
                        i2 = 20;
                        break;
                    case 19:
                        i2 = 21;
                        break;
                    case 20:
                        i2 = 22;
                        break;
                    case 21:
                        i2 = 23;
                        break;
                    case 22:
                        i2 = 24;
                        break;
                    case 23:
                        i2 = 25;
                        break;
                    case 24:
                        i2 = 26;
                        break;
                    case 25:
                        i2 = 27;
                        break;
                    case 26:
                        i2 = 28;
                        break;
                    case 27:
                        i2 = 29;
                        break;
                    case 28:
                        i2 = 30;
                        break;
                    case 29:
                        i2 = 31;
                        break;
                    case 30:
                        i2 = 32;
                        break;
                    case 31:
                        i2 = 33;
                        break;
                    case 32:
                        i2 = 34;
                        break;
                    case 33:
                        i2 = 35;
                        break;
                    case 34:
                        i2 = 36;
                        break;
                    case 35:
                        i2 = 37;
                        break;
                    case 36:
                        i2 = 38;
                        break;
                    case 37:
                        i2 = 39;
                        break;
                    case 38:
                        i2 = 40;
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        i2 = 41;
                        break;
                    case 40:
                        i2 = 42;
                        break;
                    case 41:
                        i2 = 43;
                        break;
                    case 42:
                        i2 = 44;
                        break;
                    case 43:
                        i2 = 45;
                        break;
                    case 44:
                        i2 = 46;
                        break;
                    case 45:
                        i2 = 47;
                        break;
                    case 46:
                        i2 = 48;
                        break;
                    case 47:
                        i2 = 49;
                        break;
                    case 48:
                        i2 = 50;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    case 50:
                    case 61:
                    case 69:
                    case 70:
                    default:
                        i2 = 0;
                        break;
                    case 51:
                        i2 = 53;
                        break;
                    case 52:
                        i2 = 54;
                        break;
                    case 53:
                        i2 = 55;
                        break;
                    case 54:
                        i2 = 56;
                        break;
                    case 55:
                        i2 = 57;
                        break;
                    case 56:
                        i2 = 58;
                        break;
                    case 57:
                        i2 = 59;
                        break;
                    case 58:
                        i2 = 60;
                        break;
                    case 59:
                        i2 = 61;
                        break;
                    case 60:
                        i2 = 62;
                        break;
                    case 62:
                        i2 = 64;
                        break;
                    case Function.ALT_CONVENTION /* 63 */:
                        i2 = 65;
                        break;
                    case 64:
                        i2 = 66;
                        break;
                    case 65:
                        i2 = 67;
                        break;
                    case 66:
                        i2 = 68;
                        break;
                    case 67:
                        i2 = 69;
                        break;
                    case 68:
                        i2 = 70;
                        break;
                    case 71:
                        i2 = 73;
                        break;
                    case 72:
                        i2 = 74;
                        break;
                    case 73:
                        i2 = 75;
                        break;
                    case 74:
                        i2 = 76;
                        break;
                    case 75:
                        i2 = 77;
                        break;
                    case 76:
                        i2 = 78;
                        break;
                    case 77:
                        i2 = 79;
                        break;
                    case 78:
                        i2 = 80;
                        break;
                    case 79:
                        i2 = 81;
                        break;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        i2 = 82;
                        break;
                    case 81:
                        i2 = 83;
                        break;
                    case 82:
                        i2 = 84;
                        break;
                    case 83:
                        i2 = 85;
                        break;
                    case 84:
                        i2 = 86;
                        break;
                    case 85:
                        i2 = 87;
                        break;
                    case 86:
                        i2 = 88;
                        break;
                    case 87:
                        i2 = 89;
                        break;
                    case 88:
                        i2 = 90;
                        break;
                    case 89:
                        i2 = 91;
                        break;
                    case 90:
                        i2 = 92;
                        break;
                    case 91:
                        i2 = 93;
                        break;
                    case 92:
                        i2 = 94;
                        break;
                    case 93:
                        i2 = 95;
                        break;
                    case 94:
                        i2 = 96;
                        break;
                }
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                if (i2 == 1) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                epgrVar3.g = i2 - 2;
            }
        });
        dvhx.b(dwhqVar.f(), new lbz() { // from class: dvya
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                int i2;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 201) {
                    i2 = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
                } else if (iIntValue == 202) {
                    i2 = 204;
                } else if (iIntValue == 441) {
                    i2 = 443;
                } else if (iIntValue != 442) {
                    switch (iIntValue) {
                        case 0:
                            i2 = 2;
                            break;
                        case 1:
                            i2 = 3;
                            break;
                        case 2:
                            i2 = 4;
                            break;
                        case 3:
                            i2 = 5;
                            break;
                        case 4:
                            i2 = 6;
                            break;
                        case 5:
                            i2 = 7;
                            break;
                        case 6:
                            i2 = 8;
                            break;
                        case 7:
                            i2 = 9;
                            break;
                        case 8:
                            i2 = 10;
                            break;
                        case 9:
                            i2 = 11;
                            break;
                        case 10:
                            i2 = 12;
                            break;
                        default:
                            switch (iIntValue) {
                                case 51:
                                    i2 = 53;
                                    break;
                                case 52:
                                    i2 = 54;
                                    break;
                                case 53:
                                    i2 = 55;
                                    break;
                                case 54:
                                    i2 = 56;
                                    break;
                                case 55:
                                    i2 = 57;
                                    break;
                                case 56:
                                    i2 = 58;
                                    break;
                                case 57:
                                    i2 = 59;
                                    break;
                                case 58:
                                    i2 = 60;
                                    break;
                                case 59:
                                    i2 = 61;
                                    break;
                                case 60:
                                    i2 = 62;
                                    break;
                                case 61:
                                    i2 = 63;
                                    break;
                                case 62:
                                    i2 = 64;
                                    break;
                                case Function.ALT_CONVENTION /* 63 */:
                                    i2 = 65;
                                    break;
                                case 64:
                                    i2 = 66;
                                    break;
                                case 65:
                                    i2 = 67;
                                    break;
                                case 66:
                                    i2 = 68;
                                    break;
                                case 67:
                                    i2 = 69;
                                    break;
                                default:
                                    switch (iIntValue) {
                                        case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                            i2 = 103;
                                            break;
                                        case 102:
                                            i2 = 104;
                                            break;
                                        case 103:
                                            i2 = 105;
                                            break;
                                        case 104:
                                            i2 = 106;
                                            break;
                                        case 105:
                                            i2 = 107;
                                            break;
                                        case 106:
                                            i2 = 108;
                                            break;
                                        case 107:
                                            i2 = 109;
                                            break;
                                        case 108:
                                            i2 = 110;
                                            break;
                                        case 109:
                                            i2 = 111;
                                            break;
                                        case 110:
                                            i2 = 112;
                                            break;
                                        case 111:
                                            i2 = 113;
                                            break;
                                        case 112:
                                            i2 = 114;
                                            break;
                                        case 113:
                                            i2 = 115;
                                            break;
                                        case 114:
                                            i2 = 116;
                                            break;
                                        case 115:
                                            i2 = 117;
                                            break;
                                        case 116:
                                            i2 = 118;
                                            break;
                                        default:
                                            switch (iIntValue) {
                                                case 131:
                                                    i2 = 133;
                                                    break;
                                                case 132:
                                                    i2 = 134;
                                                    break;
                                                case 133:
                                                    i2 = 135;
                                                    break;
                                                case 134:
                                                    i2 = 136;
                                                    break;
                                                case 135:
                                                    i2 = 137;
                                                    break;
                                                case 136:
                                                    i2 = 138;
                                                    break;
                                                case 137:
                                                    i2 = 139;
                                                    break;
                                                case 138:
                                                    i2 = 140;
                                                    break;
                                                case 139:
                                                    i2 = 141;
                                                    break;
                                                case 140:
                                                    i2 = 142;
                                                    break;
                                                default:
                                                    switch (iIntValue) {
                                                        case 151:
                                                            i2 = 153;
                                                            break;
                                                        case 152:
                                                            i2 = 154;
                                                            break;
                                                        case 153:
                                                            i2 = 155;
                                                            break;
                                                        case 154:
                                                            i2 = 156;
                                                            break;
                                                        case 155:
                                                            i2 = 157;
                                                            break;
                                                        case 156:
                                                            i2 = 158;
                                                            break;
                                                        default:
                                                            switch (iIntValue) {
                                                                case 221:
                                                                    i2 = 223;
                                                                    break;
                                                                case 222:
                                                                    i2 = 224;
                                                                    break;
                                                                case 223:
                                                                    i2 = 225;
                                                                    break;
                                                                case 224:
                                                                    i2 = 226;
                                                                    break;
                                                                case 225:
                                                                    i2 = 227;
                                                                    break;
                                                                case 226:
                                                                    i2 = 228;
                                                                    break;
                                                                case 227:
                                                                    i2 = 229;
                                                                    break;
                                                                case 228:
                                                                    i2 = 230;
                                                                    break;
                                                                case 229:
                                                                    i2 = 231;
                                                                    break;
                                                                default:
                                                                    switch (iIntValue) {
                                                                        case 301:
                                                                            i2 = 303;
                                                                            break;
                                                                        case 371:
                                                                            i2 = 373;
                                                                            break;
                                                                        case 381:
                                                                            i2 = 383;
                                                                            break;
                                                                        case 391:
                                                                            i2 = 393;
                                                                            break;
                                                                        case 392:
                                                                            i2 = 394;
                                                                            break;
                                                                        case 393:
                                                                            i2 = 395;
                                                                            break;
                                                                        case 394:
                                                                            i2 = 396;
                                                                            break;
                                                                        case 395:
                                                                            i2 = 397;
                                                                            break;
                                                                        case 396:
                                                                            i2 = 398;
                                                                            break;
                                                                        case 397:
                                                                            i2 = 399;
                                                                            break;
                                                                        case 398:
                                                                            i2 = 400;
                                                                            break;
                                                                        case 399:
                                                                            i2 = 401;
                                                                            break;
                                                                        case 400:
                                                                            i2 = 402;
                                                                            break;
                                                                        case 401:
                                                                            i2 = 403;
                                                                            break;
                                                                        case 402:
                                                                            i2 = 404;
                                                                            break;
                                                                        case 403:
                                                                            i2 = 405;
                                                                            break;
                                                                        case 404:
                                                                            i2 = 406;
                                                                            break;
                                                                        case 405:
                                                                            i2 = 407;
                                                                            break;
                                                                        case 406:
                                                                            i2 = 408;
                                                                            break;
                                                                        case 407:
                                                                            i2 = 409;
                                                                            break;
                                                                        case 408:
                                                                            i2 = 410;
                                                                            break;
                                                                        case 409:
                                                                            i2 = 411;
                                                                            break;
                                                                        case 410:
                                                                            i2 = 412;
                                                                            break;
                                                                        case 411:
                                                                            i2 = 413;
                                                                            break;
                                                                        case 412:
                                                                            i2 = 414;
                                                                            break;
                                                                        case 461:
                                                                            i2 = 463;
                                                                            break;
                                                                        case 462:
                                                                            i2 = 464;
                                                                            break;
                                                                        case 463:
                                                                            i2 = 465;
                                                                            break;
                                                                        case 464:
                                                                            i2 = 466;
                                                                            break;
                                                                        case 481:
                                                                            i2 = 483;
                                                                            break;
                                                                        case 482:
                                                                            i2 = 484;
                                                                            break;
                                                                        case 491:
                                                                            i2 = 493;
                                                                            break;
                                                                        case 492:
                                                                            i2 = 494;
                                                                            break;
                                                                        case 493:
                                                                            i2 = 495;
                                                                            break;
                                                                        case 494:
                                                                            i2 = 496;
                                                                            break;
                                                                        case 495:
                                                                            i2 = 497;
                                                                            break;
                                                                        case 496:
                                                                            i2 = 498;
                                                                            break;
                                                                        case 497:
                                                                            i2 = 499;
                                                                            break;
                                                                        case 498:
                                                                            i2 = 500;
                                                                            break;
                                                                        case 499:
                                                                            i2 = 501;
                                                                            break;
                                                                        case 500:
                                                                            i2 = 502;
                                                                            break;
                                                                        case 501:
                                                                            i2 = 503;
                                                                            break;
                                                                        case 502:
                                                                            i2 = 504;
                                                                            break;
                                                                        case 511:
                                                                            i2 = 513;
                                                                            break;
                                                                        case 512:
                                                                            i2 = 514;
                                                                            break;
                                                                        case 601:
                                                                            i2 = 603;
                                                                            break;
                                                                        case 602:
                                                                            i2 = 604;
                                                                            break;
                                                                        case 603:
                                                                            i2 = 605;
                                                                            break;
                                                                        case 604:
                                                                            i2 = 606;
                                                                            break;
                                                                        case 605:
                                                                            i2 = 607;
                                                                            break;
                                                                        case 606:
                                                                            i2 = 608;
                                                                            break;
                                                                        case 607:
                                                                            i2 = 609;
                                                                            break;
                                                                        case 608:
                                                                            i2 = 610;
                                                                            break;
                                                                        case 609:
                                                                            i2 = 611;
                                                                            break;
                                                                        case 610:
                                                                            i2 = 612;
                                                                            break;
                                                                        case 611:
                                                                            i2 = 613;
                                                                            break;
                                                                        case 612:
                                                                            i2 = 614;
                                                                            break;
                                                                        case 613:
                                                                            i2 = 615;
                                                                            break;
                                                                        case 701:
                                                                            i2 = 703;
                                                                            break;
                                                                        case 702:
                                                                            i2 = 704;
                                                                            break;
                                                                        case 706:
                                                                            i2 = 708;
                                                                            break;
                                                                        case 711:
                                                                            i2 = 713;
                                                                            break;
                                                                        case 712:
                                                                            i2 = 714;
                                                                            break;
                                                                        case 713:
                                                                            i2 = 715;
                                                                            break;
                                                                        default:
                                                                            switch (iIntValue) {
                                                                                case 341:
                                                                                    i2 = 343;
                                                                                    break;
                                                                                case 342:
                                                                                    i2 = 344;
                                                                                    break;
                                                                                case 343:
                                                                                    i2 = 345;
                                                                                    break;
                                                                                case 344:
                                                                                    i2 = 346;
                                                                                    break;
                                                                                case 345:
                                                                                    i2 = 347;
                                                                                    break;
                                                                                case 346:
                                                                                    i2 = 348;
                                                                                    break;
                                                                                case 347:
                                                                                    i2 = 349;
                                                                                    break;
                                                                                case 348:
                                                                                    i2 = 350;
                                                                                    break;
                                                                                default:
                                                                                    i2 = 0;
                                                                                    break;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    i2 = 444;
                }
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                if (i2 == 1) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                epgrVar3.j = i2 - 2;
            }
        });
        dvhx.b(dwhqVar.k(), new lbz() { // from class: dvyu
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                epgrVar3.k = iIntValue;
            }
        });
        dvhx.b(dwhqVar.j(), new lbz() { // from class: dvyv
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                epgrVar3.l = iIntValue;
            }
        });
        dvhx.b(dwhqVar.i(), new lbz() { // from class: dvyw
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar3 = (epgr) epgqVar2.instance;
                epgr epgrVar4 = epgr.a;
                epgrVar3.p = iIntValue;
            }
        });
        if (!dwhqVar.q().isEmpty()) {
            epha ephaVar = (epha) ephb.a.createBuilder();
            ekgb ekgbVarQ = dwhqVar.q();
            ephaVar.copyOnWrite();
            ephb ephbVar = (ephb) ephaVar.instance;
            evta evtaVar = ephbVar.b;
            if (!evtaVar.c()) {
                ephbVar.b = evsn.mutableCopy(evtaVar);
            }
            evpz.addAll(ekgbVarQ, ephbVar.b);
            epgqVar.copyOnWrite();
            epgr epgrVar3 = (epgr) epgqVar.instance;
            ephb ephbVar2 = (ephb) ephaVar.build();
            ephbVar2.getClass();
            epgrVar3.m = ephbVar2;
            epgrVar3.b |= 4;
        }
        dvhx.b(dwhqVar.o(), new lbz() { // from class: dvxo
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar4 = (epgr) epgqVar2.instance;
                epgr epgrVar5 = epgr.a;
                epgrVar4.n = iIntValue;
            }
        });
        dvhx.b(dwhqVar.p(), new lbz() { // from class: dvxp
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                dwso dwsoVar = (dwso) obj;
                final epgy epgyVar = (epgy) epgz.a.createBuilder();
                ejwi ejwiVarD = dwsoVar.d();
                epgyVar.getClass();
                dvhx.b(ejwiVarD, new lbz() { // from class: dvyb
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        epgy epgyVar2 = epgyVar;
                        epgyVar2.copyOnWrite();
                        epgz epgzVar = (epgz) epgyVar2.instance;
                        epgz epgzVar2 = epgz.a;
                        epgzVar.d = jLongValue;
                    }
                });
                dvhx.b(dwsoVar.f(), new lbz() { // from class: dvyc
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        epgy epgyVar2 = epgyVar;
                        epgyVar2.copyOnWrite();
                        epgz epgzVar = (epgz) epgyVar2.instance;
                        epgz epgzVar2 = epgz.a;
                        epgzVar.e = jLongValue;
                    }
                });
                dvhx.b(dwsoVar.e(), new lbz() { // from class: dvyd
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        epgy epgyVar2 = epgyVar;
                        String str = (String) obj2;
                        epgyVar2.copyOnWrite();
                        epgz epgzVar = (epgz) epgyVar2.instance;
                        epgz epgzVar2 = epgz.a;
                        str.getClass();
                        epgzVar.j = str;
                    }
                });
                dvhx.b(dwsoVar.b(), new lbz() { // from class: dvye
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        epgy epgyVar2 = epgyVar;
                        String str = (String) obj2;
                        epgyVar2.copyOnWrite();
                        epgz epgzVar = (epgz) epgyVar2.instance;
                        epgz epgzVar2 = epgz.a;
                        str.getClass();
                        epgzVar.g = str;
                    }
                });
                dvhx.b(dwsoVar.c(), new lbz() { // from class: dvyf
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        epgy epgyVar2 = epgyVar;
                        epgyVar2.copyOnWrite();
                        epgz epgzVar = (epgz) epgyVar2.instance;
                        epgz epgzVar2 = epgz.a;
                        epgzVar.f = jLongValue;
                    }
                });
                dvhx.b(dwsoVar.a(), new lbz() { // from class: dvyg
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        epgy epgyVar2 = epgyVar;
                        epgyVar2.copyOnWrite();
                        epgz epgzVar = (epgz) epgyVar2.instance;
                        epgz epgzVar2 = epgz.a;
                        epgzVar.h = jLongValue;
                    }
                });
                dvhx.b(dwsoVar.g(), new lbz() { // from class: dvyh
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        dwsn dwsnVar = (dwsn) obj2;
                        dwpj dwpjVar = dwpj.UNKNOWN;
                        int iC = dwsnVar.c();
                        int i2 = iC - 1;
                        if (iC == 0) {
                            throw null;
                        }
                        epgy epgyVar2 = epgyVar;
                        int i3 = 4;
                        if (i2 == 1) {
                            epgyVar2.copyOnWrite();
                            epgz epgzVar = (epgz) epgyVar2.instance;
                            epgz epgzVar2 = epgz.a;
                            epgzVar.i = epgj.a(3);
                            dwih dwihVarA = dwsnVar.a();
                            final epgk epgkVar = (epgk) epgl.a.createBuilder();
                            String strE = dwihVarA.e();
                            epgkVar.copyOnWrite();
                            epgl epglVar = (epgl) epgkVar.instance;
                            strE.getClass();
                            epglVar.b = strE;
                            int iA2 = dwihVarA.a();
                            if (iA2 == 1) {
                                i3 = 3;
                            } else if (iA2 != 2) {
                                i3 = 2;
                            }
                            epgkVar.copyOnWrite();
                            ((epgl) epgkVar.instance).e = i3 - 2;
                            dvhx.b(dwihVarA.b(), new lbz() { // from class: dvxn
                                @Override // defpackage.lbz
                                public final void accept(Object obj3) {
                                    int i4 = dwjj.PREFILL_MESSAGE.m;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    epgk epgkVar2 = epgkVar;
                                    epgkVar2.copyOnWrite();
                                    epgl epglVar2 = (epgl) epgkVar2.instance;
                                    epgl epglVar3 = epgl.a;
                                    epglVar2.g = i4 == iIntValue;
                                }
                            });
                            dvhx.b(dwihVarA.c(), new lbz() { // from class: dvxx
                                @Override // defpackage.lbz
                                public final void accept(Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    epgk epgkVar2 = epgkVar;
                                    epgkVar2.copyOnWrite();
                                    epgl epglVar2 = (epgl) epgkVar2.instance;
                                    epgl epglVar3 = epgl.a;
                                    epglVar2.c = iIntValue;
                                }
                            });
                            dvhx.b(dwihVarA.d(), new lbz() { // from class: dvyi
                                @Override // defpackage.lbz
                                public final void accept(Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    epgk epgkVar2 = epgkVar;
                                    epgkVar2.copyOnWrite();
                                    epgl epglVar2 = (epgl) epgkVar2.instance;
                                    epgl epglVar3 = epgl.a;
                                    epglVar2.d = iIntValue;
                                }
                            });
                            dvhx.b(dwihVarA.b(), new lbz() { // from class: dvyq
                                @Override // defpackage.lbz
                                public final void accept(Object obj3) {
                                    int iC2 = dwdv.c(((Integer) obj3).intValue());
                                    epgk epgkVar2 = epgkVar;
                                    epgkVar2.copyOnWrite();
                                    epgl epglVar2 = (epgl) epgkVar2.instance;
                                    epgl epglVar3 = epgl.a;
                                    epglVar2.f = eyra.a(iC2);
                                }
                            });
                            epgl epglVar2 = (epgl) epgkVar.build();
                            epgyVar2.copyOnWrite();
                            epgz epgzVar3 = (epgz) epgyVar2.instance;
                            epglVar2.getClass();
                            epgzVar3.c = epglVar2;
                            epgzVar3.b = 7;
                            return;
                        }
                        if (i2 == 2) {
                            epgyVar2.copyOnWrite();
                            epgz epgzVar4 = (epgz) epgyVar2.instance;
                            epgz epgzVar5 = epgz.a;
                            epgzVar4.i = epgj.a(5);
                            return;
                        }
                        if (i2 == 4) {
                            epgyVar2.copyOnWrite();
                            epgz epgzVar6 = (epgz) epgyVar2.instance;
                            epgz epgzVar7 = epgz.a;
                            epgzVar6.i = epgj.a(7);
                            return;
                        }
                        if (i2 == 5) {
                            epgyVar2.copyOnWrite();
                            epgz epgzVar8 = (epgz) epgyVar2.instance;
                            epgz epgzVar9 = epgz.a;
                            epgzVar8.i = epgj.a(8);
                            return;
                        }
                        if (i2 != 6) {
                            return;
                        }
                        dwii dwiiVarB = dwsnVar.b();
                        epgyVar2.copyOnWrite();
                        epgz epgzVar10 = (epgz) epgyVar2.instance;
                        epgz epgzVar11 = epgz.a;
                        epgzVar10.i = epgj.a(6);
                        epgm epgmVar = (epgm) epgn.a.createBuilder();
                        dwiiVarB.d();
                        epgmVar.copyOnWrite();
                        ((epgn) epgmVar.instance).d = false;
                        boolean zB = dwiiVarB.b();
                        epgmVar.copyOnWrite();
                        ((epgn) epgmVar.instance).b = zB;
                        long jA = dwiiVarB.a();
                        epgmVar.copyOnWrite();
                        ((epgn) epgmVar.instance).c = jA;
                        boolean zC = dwiiVarB.c();
                        epgmVar.copyOnWrite();
                        ((epgn) epgmVar.instance).e = zC;
                        epgn epgnVar = (epgn) epgmVar.build();
                        epgyVar2.copyOnWrite();
                        epgz epgzVar12 = (epgz) epgyVar2.instance;
                        epgnVar.getClass();
                        epgzVar12.c = epgnVar;
                        epgzVar12.b = 9;
                    }
                });
                dvhx.b(dwsoVar.h(), new lbz() { // from class: dvyj
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        epgy epgyVar2 = epgyVar;
                        String str = (String) obj2;
                        epgyVar2.copyOnWrite();
                        epgz epgzVar = (epgz) epgyVar2.instance;
                        epgz epgzVar2 = epgz.a;
                        str.getClass();
                        epgzVar.k = str;
                    }
                });
                epgz epgzVar = (epgz) epgyVar.build();
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar4 = (epgr) epgqVar2.instance;
                epgr epgrVar5 = epgr.a;
                epgzVar.getClass();
                epgrVar4.o = epgzVar;
                epgrVar4.b |= 8;
            }
        });
        dvhx.b(dwhqVar.g(), new lbz() { // from class: dvxq
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                dwik dwikVar = (dwik) obj;
                final epgu epguVar = (epgu) epgv.a.createBuilder();
                ejwi ejwiVarC = dwikVar.c();
                epguVar.getClass();
                dvhx.b(ejwiVarC, new lbz() { // from class: dvyk
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        epgu epguVar2 = epguVar;
                        epguVar2.copyOnWrite();
                        epgv epgvVar = (epgv) epguVar2.instance;
                        epgv epgvVar2 = epgv.a;
                        epgvVar.c = iIntValue;
                    }
                });
                dvhx.b(dwikVar.a(), new lbz() { // from class: dvyl
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        epgu epguVar2 = epguVar;
                        epguVar2.copyOnWrite();
                        epgv epgvVar = (epgv) epguVar2.instance;
                        epgv epgvVar2 = epgv.a;
                        epgvVar.d = iIntValue;
                    }
                });
                dvhx.b(dwikVar.b(), new lbz() { // from class: dvym
                    @Override // defpackage.lbz
                    public final void accept(Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        epgu epguVar2 = epguVar;
                        epguVar2.copyOnWrite();
                        epgv epgvVar = (epgv) epguVar2.instance;
                        epgv epgvVar2 = epgv.a;
                        epgvVar.b = iIntValue;
                    }
                });
                epgv epgvVar = (epgv) epguVar.build();
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar4 = (epgr) epgqVar2.instance;
                epgr epgrVar5 = epgr.a;
                epgvVar.getClass();
                epgrVar4.r = epgvVar;
                epgrVar4.b |= 64;
            }
        });
        dvhx.b(dwhqVar.e(), new lbz() { // from class: dvxr
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                epgw epgwVar = (epgw) epgx.a.createBuilder();
                long jLongValue = ((Long) obj).longValue();
                epgwVar.copyOnWrite();
                ((epgx) epgwVar.instance).b = jLongValue;
                epgq epgqVar2 = epgqVar;
                epgqVar2.copyOnWrite();
                epgr epgrVar4 = (epgr) epgqVar2.instance;
                epgx epgxVar = (epgx) epgwVar.build();
                epgr epgrVar5 = epgr.a;
                epgxVar.getClass();
                epgrVar4.q = epgxVar;
                epgrVar4.b |= 16;
            }
        });
        epgr epgrVar4 = (epgr) epgqVar.build();
        int iA2 = dwhqVar.a();
        dbyk dbykVarK = dbylVar.k(epgrVar4, dqnz.b(context, new fecd()));
        dbykVarK.j(iA2);
        if (ejwiVarJ.g()) {
            dbykVarK.h((String) ejwiVarJ.c());
        }
        dbykVarK.c();
        this.e.execute(new Runnable() { // from class: dvys
            @Override // java.lang.Runnable
            public final void run() {
                Set set = this.a.a;
                dwhq dwhqVar2 = dwhqVar;
                synchronized (set) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((dwhr) it.next()).b(dwhqVar2);
                    }
                }
            }
        });
    }
}
