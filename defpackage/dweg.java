package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dweg {
    public static dwpk a(eypt eyptVar) {
        dwip dwipVar = new dwip();
        dwpj dwpjVar = dwpj.UNKNOWN;
        int iB = eyrf.b(eyptVar.b);
        if (iB == 0) {
            iB = 1;
        }
        int i = iB - 2;
        if (i == 1) {
            dwipVar.e(dwpj.PHONE_NUMBER);
        } else if (i == 2) {
            dwipVar.e(dwpj.EMAIL);
        } else if (i == 3) {
            dwipVar.e(dwpj.HANDLER);
            dwipVar.b(eyptVar.d);
        } else if (i != 5) {
            dwipVar.e(dwpj.UNKNOWN);
        } else {
            dwipVar.e(dwpj.DEVICE_ID);
        }
        dwipVar.c(eyptVar.c);
        dwipVar.d(eyptVar.e);
        return dwipVar.a();
    }

    public static eypt b(dwpk dwpkVar) {
        eyps eypsVar = (eyps) eypt.a.createBuilder();
        String strD = dwpkVar.d();
        eypsVar.copyOnWrite();
        ((eypt) eypsVar.instance).c = strD;
        String strE = dwpkVar.e();
        eypsVar.copyOnWrite();
        ((eypt) eypsVar.instance).e = strE;
        dwpj dwpjVar = dwpj.UNKNOWN;
        int iOrdinal = dwpkVar.b().ordinal();
        if (iOrdinal == 0) {
            eypsVar.copyOnWrite();
            ((eypt) eypsVar.instance).b = eyrf.a(2);
        } else if (iOrdinal == 1) {
            eypsVar.copyOnWrite();
            ((eypt) eypsVar.instance).b = eyrf.a(3);
        } else if (iOrdinal == 2) {
            eypsVar.copyOnWrite();
            ((eypt) eypsVar.instance).b = eyrf.a(4);
        } else if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                eypsVar.copyOnWrite();
                ((eypt) eypsVar.instance).b = eyrf.a(7);
            }
        } else if (dwpkVar.c().g()) {
            eypsVar.copyOnWrite();
            ((eypt) eypsVar.instance).b = eyrf.a(5);
            String str = (String) dwpkVar.c().c();
            eypsVar.copyOnWrite();
            ((eypt) eypsVar.instance).d = str;
        }
        return (eypt) eypsVar.build();
    }

    public static eypt c(dwjl dwjlVar) {
        dwpj dwpjVar = dwpj.UNKNOWN;
        int iC = dwjlVar.c() - 1;
        if (iC == 1) {
            return b(dwjlVar.a());
        }
        if (iC != 2) {
            eyps eypsVar = (eyps) eypt.a.createBuilder();
            eypsVar.copyOnWrite();
            ((eypt) eypsVar.instance).b = eyrf.a(2);
            return (eypt) eypsVar.build();
        }
        eyps eypsVar2 = (eyps) eypt.a.createBuilder();
        eypsVar2.copyOnWrite();
        ((eypt) eypsVar2.instance).b = eyrf.a(6);
        String str = ((dwiu) dwjlVar.b()).b;
        eypsVar2.copyOnWrite();
        ((eypt) eypsVar2.instance).e = str;
        String str2 = ((dwiu) dwjlVar.b()).a;
        eypsVar2.copyOnWrite();
        ((eypt) eypsVar2.instance).c = str2;
        return (eypt) eypsVar2.build();
    }
}
