package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duui {
    public static dtsd a(String str, Context context, dtvq dtvqVar) throws duuh {
        dtsc dtscVar;
        List listI = ejxk.d("|").i(str);
        int iOrdinal = duiv.a(context, dtvqVar).ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (listI.size() != 4) {
                    throw new duuh("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
                }
                dtscVar = (dtsc) dtsd.a.createBuilder();
                String str2 = (String) listI.get(0);
                dtscVar.copyOnWrite();
                dtsd dtsdVar = (dtsd) dtscVar.instance;
                str2.getClass();
                dtsdVar.b |= 1;
                dtsdVar.c = str2;
                long j = Integer.parseInt((String) listI.get(1));
                dtscVar.copyOnWrite();
                dtsd dtsdVar2 = (dtsd) dtscVar.instance;
                dtsdVar2.b |= 2;
                dtsdVar2.d = j;
                String str3 = (String) listI.get(2);
                dtscVar.copyOnWrite();
                dtsd dtsdVar3 = (dtsd) dtscVar.instance;
                str3.getClass();
                dtsdVar3.b |= 4;
                dtsdVar3.e = str3;
                int iA = dtqw.a(Integer.parseInt((String) listI.get(3)));
                dtscVar.copyOnWrite();
                dtsd dtsdVar4 = (dtsd) dtscVar.instance;
                int i = iA - 1;
                if (iA == 0) {
                    throw null;
                }
                dtsdVar4.f = i;
                dtsdVar4.b |= 8;
            } else {
                if (listI.size() != 2) {
                    throw new duuh("Bad-format serializedFileKey = s".concat(String.valueOf(str)));
                }
                dtscVar = (dtsc) dtsd.a.createBuilder();
                String str4 = (String) listI.get(0);
                dtscVar.copyOnWrite();
                dtsd dtsdVar5 = (dtsd) dtscVar.instance;
                str4.getClass();
                dtsdVar5.b |= 4;
                dtsdVar5.e = str4;
                int iA2 = dtqw.a(Integer.parseInt((String) listI.get(1)));
                dtscVar.copyOnWrite();
                dtsd dtsdVar6 = (dtsd) dtscVar.instance;
                int i2 = iA2 - 1;
                if (iA2 == 0) {
                    throw null;
                }
                dtsdVar6.f = i2;
                dtsdVar6.b |= 8;
            }
        } else {
            if (listI.size() != 5) {
                throw new duuh("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
            }
            dtsc dtscVar2 = (dtsc) dtsd.a.createBuilder();
            String str5 = (String) listI.get(0);
            dtscVar2.copyOnWrite();
            dtsd dtsdVar7 = (dtsd) dtscVar2.instance;
            str5.getClass();
            dtsdVar7.b |= 1;
            dtsdVar7.c = str5;
            long j2 = Integer.parseInt((String) listI.get(1));
            dtscVar2.copyOnWrite();
            dtsd dtsdVar8 = (dtsd) dtscVar2.instance;
            dtsdVar8.b |= 2;
            dtsdVar8.d = j2;
            String str6 = (String) listI.get(2);
            dtscVar2.copyOnWrite();
            dtsd dtsdVar9 = (dtsd) dtscVar2.instance;
            str6.getClass();
            dtsdVar9.b |= 4;
            dtsdVar9.e = str6;
            int iA3 = dtqw.a(Integer.parseInt((String) listI.get(3)));
            dtscVar2.copyOnWrite();
            dtsd dtsdVar10 = (dtsd) dtscVar2.instance;
            int i3 = iA3 - 1;
            if (iA3 == 0) {
                throw null;
            }
            dtsdVar10.f = i3;
            dtsdVar10.b |= 8;
            if (listI.get(4) != null && !((String) listI.get(4)).isEmpty()) {
                try {
                    exyx exyxVar = (exyx) duuj.b((String) listI.get(4), exyx.a.getParserForType());
                    dtscVar2.copyOnWrite();
                    dtsd dtsdVar11 = (dtsd) dtscVar2.instance;
                    exyxVar.getClass();
                    dtsdVar11.g = exyxVar;
                    dtsdVar11.b |= 16;
                } catch (evtj e) {
                    throw new duuh("Failed to deserialize key:".concat(String.valueOf(str)), e);
                }
            }
            dtscVar = dtscVar2;
        }
        return (dtsd) dtscVar.build();
    }

    public static String b(dtsd dtsdVar, Context context, dtvq dtvqVar) {
        int iOrdinal = duiv.a(context, dtvqVar).ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? c(dtsdVar) : d(dtsdVar) : e(dtsdVar) : c(dtsdVar);
    }

    public static String c(dtsd dtsdVar) {
        StringBuilder sb = new StringBuilder(dtsdVar.c);
        sb.append("|");
        sb.append(dtsdVar.d);
        sb.append("|");
        sb.append(dtsdVar.e);
        sb.append("|");
        int iA = dtqw.a(dtsdVar.f);
        if (iA == 0) {
            iA = 1;
        }
        sb.append(iA - 1);
        return sb.toString();
    }

    public static String d(dtsd dtsdVar) {
        StringBuilder sb = new StringBuilder(dtsdVar.e);
        sb.append("|");
        int iA = dtqw.a(dtsdVar.f);
        if (iA == 0) {
            iA = 1;
        }
        sb.append(iA - 1);
        return sb.toString();
    }

    public static String e(dtsd dtsdVar) {
        String strE;
        StringBuilder sb = new StringBuilder(dtsdVar.c);
        sb.append("|");
        sb.append(dtsdVar.d);
        sb.append("|");
        sb.append(dtsdVar.e);
        sb.append("|");
        int iA = dtqw.a(dtsdVar.f);
        if (iA == 0) {
            iA = 1;
        }
        sb.append(iA - 1);
        sb.append("|");
        if ((dtsdVar.b & 16) != 0) {
            exyx exyxVar = dtsdVar.g;
            if (exyxVar == null) {
                exyxVar = exyx.a;
            }
            strE = duuj.e(exyxVar);
        } else {
            strE = "";
        }
        sb.append(strE);
        return sb.toString();
    }
}
