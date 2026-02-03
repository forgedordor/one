package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dweb {
    public static dwpk a(ezol ezolVar) {
        dwip dwipVar = new dwip();
        dwipVar.d(ezolVar.d);
        dwpj dwpjVar = dwpj.UNKNOWN;
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        int iOrdinal = felmVarB.ordinal();
        if (iOrdinal == 1) {
            dwipVar.c(ezolVar.c);
            dwipVar.e(dwpj.PHONE_NUMBER);
        } else if (iOrdinal == 13) {
            dwipVar.c(ezolVar.c);
            dwipVar.e(dwpj.DEVICE_ID);
        } else if (iOrdinal == 16) {
            dwipVar.c(ezolVar.c);
            dwipVar.e(dwpj.EMAIL);
        } else {
            if (iOrdinal != 18) {
                return null;
            }
            String[] strArrSplit = ezolVar.c.split(Pattern.quote("|"), 2);
            if (strArrSplit.length != 2) {
                return null;
            }
            dwipVar.c(strArrSplit[1]);
            dwipVar.b(strArrSplit[0]);
            dwipVar.e(dwpj.HANDLER);
        }
        return dwipVar.a();
    }

    public static dwpx b(ezol ezolVar, dwje dwjeVar) {
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        ejwl.a(felmVarB == felm.GROUP_ID);
        dwit dwitVar = new dwit();
        dwitVar.c(ezolVar.c);
        dwitVar.b(ezolVar.d);
        dwpr dwprVarA = dwitVar.a();
        dwir dwirVar = new dwir();
        dwirVar.d(dwprVarA);
        dwirVar.c(dwjeVar.c().f());
        return dwirVar.a();
    }

    public static ezol c(dwpk dwpkVar) {
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        ezokVar.copyOnWrite();
        dwiq dwiqVar = (dwiq) dwpkVar;
        ((ezol) ezokVar.instance).d = dwiqVar.b;
        dwpj dwpjVar = dwpj.UNKNOWN;
        int iOrdinal = dwiqVar.c.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            String str = dwiqVar.a;
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).c = str;
            felm felmVar = felm.PHONE_NUMBER;
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).b = felmVar.a();
        } else if (iOrdinal == 2) {
            String str2 = dwiqVar.a;
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).c = str2;
            felm felmVar2 = felm.EMAIL;
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).b = felmVar2.a();
        } else if (iOrdinal == 3) {
            ejwi ejwiVar = dwiqVar.d;
            if (ejwiVar.g()) {
                String str3 = ((String) ejwiVar.c()) + "|" + dwiqVar.a;
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).c = str3;
                felm felmVar3 = felm.LIGHTER_ID;
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).b = felmVar3.a();
            } else {
                String str4 = dwiqVar.a;
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).c = str4;
                felm felmVar4 = felm.LIGHTER_ID;
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).b = felmVar4.a();
            }
        } else if (iOrdinal == 4) {
            String str5 = dwiqVar.a;
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).c = str5;
            felm felmVar5 = felm.DEVICE_ID;
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).b = felmVar5.a();
        }
        return (ezol) ezokVar.build();
    }
}
