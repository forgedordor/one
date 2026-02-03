package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbdd {
    public final eksp a;
    public final fddf b;
    private final fcsu c;
    private final fcsu d;

    public bbdd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        cogwVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar3;
        this.a = eksp.c("BugleParticipantData");
        this.b = fddg.d(cogwVar.f().toEpochMilli());
    }

    public static final esvh a(String str) {
        esvg esvgVar = esvg.CONFIRMED_UPLOAD_SAFE_USER_DATA;
        if (str == null) {
            str = "";
        }
        return new esvh(esvgVar, str);
    }

    public static /* synthetic */ void b(bbdd bbddVar, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, int i) {
        boolean zD = d(str, str3);
        boolean zD2 = d(str2, str4);
        boolean zD3 = d(str3, null);
        boolean zD4 = d(str4, null);
        if (zD || zD2 || zD3 || zD4) {
            fcsu fcsuVar = bbddVar.c;
            List listM = ((crny) fcsuVar.b()).m();
            ArrayList arrayList = new ArrayList(fcva.p(listM, 10));
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                arrayList.add(bbddVar.c(((crof) it.next()).p()));
            }
            ArrayList arrayList2 = new ArrayList(fcva.p(listM, 10));
            Iterator it2 = listM.iterator();
            while (it2.hasNext()) {
                arrayList2.add(bbddVar.c(((crof) it2.next()).s()));
            }
            int i2 = i & 64;
            crnc crncVarC = bbddVar.c(((crny) fcsuVar.b()).g().s());
            crnc crncVarC2 = bbddVar.c(((crny) fcsuVar.b()).g().r());
            bbcy bbcyVar = bbcz.a;
            bbcz bbczVarA = bbcy.a(str, str2, str3, str4, crncVarC, crncVarC2, arrayList2, arrayList, bbddVar.b, 2752);
            boolean zO = dfog.O();
            Boolean bool = (Boolean) ((cczi) bbcb.b.get()).e();
            eksl ekslVar = (eksl) bbddVar.a.j();
            eksk ekskVar = i2 != 0 ? eksk.FULL : eksk.NONE;
            int i3 = i & 512;
            int i4 = i & 128;
            boolean z3 = (i & 256) == 0;
            boolean z4 = i4 == 0;
            String str6 = i3 == 0 ? str5 : null;
            boolean z5 = z3 & z2;
            ekslVar.Z(ekskVar);
            ekslVar.O("Destination mutation found during participant update: originalNormalizedDestination = [%s], originalSendDestination = [%s], updatedNormalizedDestination = [%s], updatedSendDestination = [%s], expectedNormalizedDestination = [%s], expectedSendDestination = [%s], localeCountryCode = [%s], deviceCountryCodeDeprecated = [%s], simCountryCodes = [%s], networkCountryCodes = [%s]roamingFixFlag = [%s], deviceCountryCode = [%s], settingsCountryCode = [%s], stopUpdatesFlag = [%s], blockedSendDestinationUpdate = [%s], blockedNormalizedDestinationUpdate = [%s], updateSource = [%s], ", a(bbczVarA.d), a(bbczVarA.e), a(bbczVarA.f), a(bbczVarA.g), a(bbczVarA.h), a(bbczVarA.i), a(bbczVarA.j), a(bbczVarA.l), a(bbczVarA.n.toString()), a(bbczVarA.o.toString()), e(String.valueOf(zO)), a(String.valueOf(bbczVarA.k)), a(String.valueOf(bbczVarA.m)), e(bool.toString()), e(String.valueOf(z4 & z)), e(String.valueOf(z5)), e(str6));
        }
    }

    private final crnc c(String str) {
        if (str != null) {
            if (true == fdgn.H(str)) {
                str = null;
            }
            if (str != null) {
                crmx crmxVarG = ((crny) this.c.b()).g();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                crnc crncVarC = crmxVarG.c(upperCase);
                crnc crncVar = true != crncVarC.b() ? crncVarC : null;
                if (crncVar != null) {
                    return crncVar;
                }
            }
        }
        return new crnc(0);
    }

    private static final boolean d(String str, String str2) {
        return (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0 || fdbq.f(str, str2)) ? false : true;
    }

    private static final esvh e(String str) {
        esvg esvgVar = esvg.NO_USER_DATA;
        if (str == null) {
            str = "";
        }
        return new esvh(esvgVar, str);
    }
}
