package defpackage;

import android.content.Context;
import android.database.MatrixCursor;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
@fcsv
/* loaded from: classes3.dex */
public final class cpwg implements cpvt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/customthemes/CustomThemesCmsDataProvider");
    private final aurx b;
    private final fcsu c;
    private final apod d;

    public cpwg(aurx aurxVar, fcsu fcsuVar, apod apodVar, dzuc dzucVar) {
        aurxVar.getClass();
        fcsuVar.getClass();
        apodVar.getClass();
        dzucVar.getClass();
        this.b = aurxVar;
        this.c = fcsuVar;
        this.d = apodVar;
    }

    @Override // defpackage.cpvt
    public final epjl a() {
        return epjl.CUSTOM_THEMES;
    }

    @Override // defpackage.cpvt
    public final List b() {
        if (this.b.aj()) {
            bbmm bbmmVarA = ((bzad) this.c.b()).a(2, bbml.UPDATE, 0);
            bbmmVarA.f = 2;
            bbmmVarA.d = fcva.b("custom_theme");
            bbmmVarA.a = "_theme";
            bbmmVarA.g = bzas.a(65);
            return fcva.b(bbmmVarA.a());
        }
        bbmm bbmmVar = new bbmm();
        bbmmVar.c = bbml.UPDATE;
        bbmmVar.e = 32;
        bbmmVar.f = 2;
        bbmmVar.b = 2;
        bbmmVar.d = fcva.b("custom_theme");
        bbmmVar.c();
        bbmmVar.a = "_theme";
        bbmmVar.g = bzas.a(65);
        bbmmVar.h = this.d.a();
        return fcva.b(bbmmVar.a());
    }

    @Override // defpackage.cpvt
    public final List c() {
        return fcva.b(((bzad) this.c.b()).d(2, bbml.UPDATE, "_theme"));
    }

    @Override // defpackage.cpvt
    public final Map d(final List list) {
        botb botbVarE = botm.e();
        botbVarE.A("CustomThemesCmsDataProvider.getData");
        botbVarE.i(new Function() { // from class: cpwe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List<String> list2 = list;
                botl botlVar = (botl) obj;
                ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
                for (String str : list2) {
                    str.getClass();
                    arrayList.add(barn.b(str));
                }
                botlVar.u(arrayList);
                int iIntValue = botm.g().intValue();
                if (iIntValue < 59820) {
                    dqru.x("custom_theme", iIntValue);
                }
                botlVar.ap(new dqpn("conversations.custom_theme", 6));
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.f(new Function() { // from class: cpwf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bopp boppVar = (bopp) obj;
                return new bopq[]{boppVar.a, boppVar.ar};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb<bojh> ekgbVarZ = botbVarE.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (bojh bojhVar : ekgbVarZ) {
            String strA = bojhVar.C().a();
            cidt cidtVarK = bojhVar.K();
            cidtVarK.getClass();
            fcti fctiVar = new fcti(strA, new fctk(cidtVarK.toByteString()));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cpvt
    public final Map e(Map map) {
        map.getClass();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                cidt cidtVar = (cidt) evsn.parseFrom(cidt.a, (evqs) entry.getValue());
                cidtVar.getClass();
                linkedHashMap.put(str, cidtVar);
            } catch (evtj e) {
                linkedHashMap2.put(str, e);
            }
        }
        if (!linkedHashMap.isEmpty()) {
            bopp boppVar = botm.c;
            bopq bopqVar = boppVar.a;
            String strD = bopqVar.d();
            bopq bopqVar2 = boppVar.ar;
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{strD, bopqVar2.d()});
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                matrixCursor.addRow(fcva.g(Long.valueOf(barn.b((String) entry2.getKey()).a), ((cidt) entry2.getValue()).toByteArray()));
            }
            bote boteVar = new bote();
            boteVar.ap("restoreDataInTransaction");
            boteVar.ad(new Function() { // from class: cpwd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    Set setKeySet = linkedHashMap.keySet();
                    ArrayList arrayList = new ArrayList(fcva.p(setKeySet, 10));
                    Iterator it = setKeySet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(barn.b((String) it.next()));
                    }
                    botlVar.u(arrayList);
                    int iIntValue = botm.g().intValue();
                    if (iIntValue < 59820) {
                        dqru.x("custom_theme", iIntValue);
                    }
                    botlVar.ap(new dqpn("conversations.custom_theme", 5));
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarA = ekfv.a(fcva.b(bopqVar2));
            Context context = dqru.b;
            boteVar.ao(ekgbVarA, matrixCursor, new dqxl("$R = $V", new Object[]{"_I._id", bopqVar}));
            try {
                int iE = boteVar.b().e();
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleCmsAddFields");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/customthemes/CustomThemesCmsDataProvider", "restoreDataInTransaction", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "CustomThemesCmsDataProvider.kt")).u("Updated the custom theme column of %s conversation rows having null custom theme, out of %s.", iE, linkedHashMap.size());
            } catch (Exception e2) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
                ((ekrd) ((ekrd) ekrwVarJ).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/customthemes/CustomThemesCmsDataProvider", "restoreDataInTransaction", 207, "CustomThemesCmsDataProvider.kt")).q("Bulk UPDATE of custom theme column failed.");
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(fcwa.a(map.size()));
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap3.put(((Map.Entry) it.next()).getKey(), e2);
                }
                linkedHashMap2.putAll(linkedHashMap3);
            }
        }
        return linkedHashMap2;
    }
}
