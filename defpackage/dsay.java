package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsay implements dsah {
    private static final eksp a = eksp.c("GnpSdk");
    private final dxgg b;
    private final String c;
    private final Context d;
    private final eygg e;
    private final dxgy f;
    private final ejwi g;
    private final fcsu h;
    private final eygg i;
    private final eygg j;
    private final dxpd k;

    public dsay(dxgg dxggVar, String str, Context context, eygg eyggVar, dxgy dxgyVar, ejwi ejwiVar, fcsu fcsuVar, eygg eyggVar2, eygg eyggVar3, dxpd dxpdVar) {
        dxggVar.getClass();
        str.getClass();
        context.getClass();
        eyggVar.getClass();
        fcsuVar.getClass();
        eyggVar2.getClass();
        eyggVar3.getClass();
        this.b = dxggVar;
        this.c = str;
        this.d = context;
        this.e = eyggVar;
        this.f = dxgyVar;
        this.g = ejwiVar;
        this.h = fcsuVar;
        this.i = eyggVar2;
        this.j = eyggVar3;
        this.k = dxpdVar;
    }

    private final etjo s(dsbi dsbiVar) {
        etju etjuVarA = etjt.a((etiu) etjo.c.createBuilder());
        etht ethtVar = dsbiVar.c().c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        ethtVar.getClass();
        etiu etiuVar = etjuVarA.a;
        int i = ethtVar.b;
        etiuVar.copyOnWrite();
        etjo etjoVar = (etjo) etiuVar.instance;
        etjoVar.d |= 1;
        etjoVar.f = i;
        DesugarCollections.unmodifiableList(etjoVar.e).getClass();
        evsx evsxVar = ethtVar.c;
        evsxVar.getClass();
        etiuVar.copyOnWrite();
        etjo etjoVar2 = (etjo) etiuVar.instance;
        evsx evsxVar2 = etjoVar2.e;
        if (!evsxVar2.c()) {
            etjoVar2.e = evsn.mutableCopy(evsxVar2);
        }
        evpz.addAll(evsxVar, etjoVar2.e);
        etgf etgfVar = dsbiVar.c().h;
        if (etgfVar == null) {
            etgfVar = etgf.a;
        }
        String str = etgfVar.c == 4 ? (String) etgfVar.d : "";
        str.getClass();
        if (str.length() > 0) {
            etiuVar.copyOnWrite();
            etjo etjoVar3 = (etjo) etiuVar.instance;
            etjoVar3.d |= 8192;
            etjoVar3.r = str;
        }
        evhv evhvVarD = dsbiVar.d();
        if (evhvVarD != null && evhvVarD.e != 0) {
            String str2 = evhvVarD.c;
            str2.getClass();
            etiuVar.copyOnWrite();
            etjo etjoVar4 = (etjo) etiuVar.instance;
            etjoVar4.d |= 16;
            etjoVar4.h = str2;
            long j = evhvVarD.e;
            etiuVar.copyOnWrite();
            etjo etjoVar5 = (etjo) etiuVar.instance;
            etjoVar5.d |= 32;
            etjoVar5.i = j;
            int iX = x();
            etiuVar.copyOnWrite();
            etjo etjoVar6 = (etjo) etiuVar.instance;
            etjoVar6.v = iX - 1;
            etjoVar6.d |= 262144;
            evqs evqsVar = evhvVarD.f;
            evqsVar.getClass();
            etiuVar.copyOnWrite();
            etjo etjoVar7 = (etjo) etiuVar.instance;
            etjoVar7.d |= 4;
            etjoVar7.g = evqsVar;
        }
        String str3 = ((dxgw) this.f).a;
        if (str3.length() != 0) {
            etjuVarA.b(str3);
        }
        etjuVarA.e(t(dsbiVar));
        return etjuVarA.a();
    }

    private final eveg t(dsbi dsbiVar) {
        return u(dsbiVar.e(), dsbiVar.f());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [dxnh, java.lang.Object] */
    private final eveg u(String str, String str2) {
        boolean z = false;
        if (str != null && str.length() != 0 && (fbdm.a.get().a() || str2 == null || str2.length() == 0)) {
            z = true;
        }
        evef evefVar = (evef) eveg.a.createBuilder();
        evefVar.getClass();
        eveh.d(evefVar);
        dxft dxftVarB = ((ejwt) this.g).a.b(z);
        if (dxftVarB instanceof dxfo) {
            ((eksl) ((eksl) a.j()).g(((dxfo) dxftVarB).a())).q("Failed creating the delivery address log for this event, leaving it empty");
        }
        if (dxftVarB instanceof dxfx) {
            eveh.b((evcx) ((dxfx) dxftVarB).a, evefVar);
        }
        if (str2 != null) {
            eveh.c(str2, evefVar);
        }
        return eveh.a(evefVar);
    }

    private final void v(dsbi dsbiVar, etim etimVar, etin etinVar) {
        w(dsbiVar.e(), etimVar, etinVar);
    }

    private final void w(String str, etim etimVar, etin etinVar) {
        Context context = this.d;
        String strA = dsbe.a(context);
        if (strA == null) {
            strA = "";
        }
        etjq etjqVarA = etjp.a((etil) etinVar.toBuilder());
        etil etilVar = etjqVarA.a;
        etilVar.copyOnWrite();
        etin etinVar2 = (etin) etilVar.instance;
        etinVar2.b |= 1;
        String str2 = this.c;
        etinVar2.c = str2;
        etilVar.copyOnWrite();
        etin etinVar3 = (etin) etilVar.instance;
        etinVar3.b |= 4;
        etinVar3.d = 757365213;
        etilVar.copyOnWrite();
        etin etinVar4 = (etin) etilVar.instance;
        etinVar4.b |= 8;
        etinVar4.e = strA;
        etin etinVarA = etjqVarA.a();
        int i = 0;
        ((ecoe) ((dxtx) this.e.b()).r.get()).a(str2, dxuz.a(str), etimVar.name());
        dbyk dbykVarK = ((dbyl) this.b.a(str)).k(etinVarA, dqnz.b(context, new etjr()));
        dbykVarK.j(etimVar.bQ);
        dbykVarK.c();
        eksp ekspVar = a;
        ekspVar.o().D("Logged %s for %s", etimVar, str);
        ekspVar.getClass();
        ekspVar.o().t("Dumping proto %s", etinVarA);
        String strA2 = dxgh.a(etinVarA);
        int iCeil = (int) Math.ceil(strA2.length() / 3500.0d);
        while (i < iCeil) {
            int i2 = i * 3500;
            i++;
            String strSubstring = strA2.substring(i2, Math.min(i * 3500, strA2.length()));
            strSubstring.getClass();
            ekspVar.o().I("(%d/%d) %s", Integer.valueOf(i), Integer.valueOf(iCeil), strSubstring);
        }
    }

    private final int x() {
        int iOrdinal = ((dxlf) this.h.b()).ordinal();
        if (iOrdinal == 0) {
            return 4;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 5;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal == 4) {
            return 6;
        }
        if (iOrdinal == 5) {
            return 7;
        }
        throw new fctg();
    }

    @Override // defpackage.dsah
    public final void a(dsbi dsbiVar, boolean z, etgd etgdVar) {
        etgdVar.getClass();
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etio etioVar = (etio) etip.a.createBuilder();
        etioVar.getClass();
        int iX = x();
        etioVar.copyOnWrite();
        etip etipVar = (etip) etioVar.instance;
        etipVar.e = iX - 1;
        etipVar.b |= 8;
        etiq etiqVar = (etiq) etir.a.createBuilder();
        etiqVar.getClass();
        etjs.b(z ? etgb.ANDROID_PERMISSION_STATE_AUTHORIZED : etgb.ANDROID_PERMISSION_STATE_DENIED, etiqVar);
        etjs.c(etgdVar, etiqVar);
        etir etirVarA = etjs.a(etiqVar);
        etioVar.copyOnWrite();
        etip etipVar2 = (etip) etioVar.instance;
        etipVar2.c = etirVarA;
        etipVar2.b |= 2;
        evhv evhvVarD = dsbiVar.d();
        if (evhvVarD != null) {
            String str = evhvVarD.c;
            str.getClass();
            etioVar.copyOnWrite();
            etip etipVar3 = (etip) etioVar.instance;
            etipVar3.b |= 64;
            etipVar3.h = str;
            long j = evhvVarD.e;
            etioVar.copyOnWrite();
            etip etipVar4 = (etip) etioVar.instance;
            etipVar4.b |= 4;
            etipVar4.d = j;
            evqs evqsVar = evhvVarD.f;
            evqsVar.getClass();
            etioVar.copyOnWrite();
            etip etipVar5 = (etip) etioVar.instance;
            etipVar5.b |= 128;
            etipVar5.i = evqsVar;
        }
        String str2 = ((dxgw) this.f).a;
        if (str2.length() != 0) {
            etioVar.copyOnWrite();
            etip etipVar6 = (etip) etioVar.instance;
            etipVar6.b |= 32;
            etipVar6.g = str2;
        }
        eveg evegVarT = t(dsbiVar);
        etioVar.copyOnWrite();
        etip etipVar7 = (etip) etioVar.instance;
        etipVar7.f = evegVarT;
        etipVar7.b |= 16;
        evsn evsnVarBuild = etioVar.build();
        evsnVarBuild.getClass();
        etil etilVar = etjqVarA.a;
        etilVar.copyOnWrite();
        etin etinVar = (etin) etilVar.instance;
        etinVar.g = (etip) evsnVarBuild;
        etinVar.b |= 16777216;
        v(dsbiVar, z ? etim.USER_AUTHORIZED_PERMISSION : etim.USER_DENIED_PERMISSION, etjqVarA.a());
    }

    @Override // defpackage.dsah
    public final void b(Map map, List list, String str) {
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etij etijVar = (etij) etik.a.createBuilder();
        etijVar.getClass();
        DesugarCollections.unmodifiableList(((etik) etijVar.instance).c).getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            etiq etiqVar = (etiq) etir.a.createBuilder();
            etiqVar.getClass();
            etjs.c((etgd) entry.getKey(), etiqVar);
            etjs.b((etgb) entry.getValue(), etiqVar);
            arrayList.add(etjs.a(etiqVar));
        }
        etijVar.copyOnWrite();
        etik etikVar = (etik) etijVar.instance;
        evtg evtgVar = etikVar.c;
        if (!evtgVar.c()) {
            etikVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(arrayList, etikVar.c);
        if (str.length() > 0) {
            etijVar.copyOnWrite();
            etik etikVar2 = (etik) etijVar.instance;
            etikVar2.b |= 16;
            etikVar2.d = str;
        }
        evsn evsnVarBuild = etijVar.build();
        evsnVarBuild.getClass();
        etil etilVar = etjqVarA.a;
        etilVar.copyOnWrite();
        etin etinVar = (etin) etilVar.instance;
        etinVar.f = (etik) evsnVarBuild;
        etinVar.b |= 512;
        etin etinVarA = etjqVarA.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w((String) it.next(), etim.PERIODIC_APPLICATION_STATE, etinVarA);
        }
        w(null, etim.PERIODIC_APPLICATION_STATE, etinVarA);
    }

    @Override // defpackage.dsah
    public final void c(dsbi dsbiVar, List list) {
        etiw etiwVar;
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etju etjuVarA = etjt.a((etiu) s(dsbiVar).toBuilder());
        etiu etiuVar = etjuVarA.a;
        new evsz(((etjo) etiuVar.instance).n, etjo.b);
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dsdz dsdzVar = (dsdz) it.next();
            dsdzVar.getClass();
            switch (dsdzVar) {
                case UNKNOWN:
                    etiwVar = etiw.CONDITION_UNKNOWN;
                    break;
                case BATTERY:
                    etiwVar = etiw.CONDITION_BATTERY;
                    break;
                case INSTALLED_APPS:
                    etiwVar = etiw.CONDITION_INSTALLED_APP;
                    break;
                case NETWORK:
                    etiwVar = etiw.CONDITION_NETWORK;
                    break;
                case LANGUAGE:
                    etiwVar = etiw.CONDITION_LOCALE;
                    break;
                case TIME_CONSTRAINT:
                    etiwVar = etiw.CONDITION_TIME_CONSTRAINT;
                    break;
                case DISPLAY_WITHOUT_NEW_SYNC:
                    etiwVar = etiw.CONDITION_SYNC_REQUIRED;
                    break;
                case VALID_INTENT:
                    etiwVar = etiw.CONDITION_VALID_INTENT;
                    break;
                case DASHER_FILTER:
                    etiwVar = etiw.CONDITION_DASHER;
                    break;
                case MINOR_FILTER:
                    etiwVar = etiw.CONDITION_MINOR;
                    break;
                default:
                    throw new fctg();
            }
            arrayList.add(etiwVar);
        }
        etiuVar.copyOnWrite();
        etjo etjoVar = (etjo) etiuVar.instance;
        evsx evsxVar = etjoVar.n;
        if (!evsxVar.c()) {
            etjoVar.n = evsn.mutableCopy(evsxVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            etjoVar.n.h(((etiw) it2.next()).o);
        }
        etjqVarA.b(etjuVarA.a());
        v(dsbiVar, etim.PROMO_CONDITIONS_EVALUATED, etjqVarA.a());
    }

    @Override // defpackage.dsah
    public final void d(dsbi dsbiVar) {
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etjqVarA.b(s(dsbiVar));
        v(dsbiVar, etim.PROMO_EXPIRED, etjqVarA.a());
    }

    @Override // defpackage.dsah
    public final void e(dsbi dsbiVar, evok evokVar) {
        dsbiVar.getClass();
        evokVar.getClass();
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etju etjuVarA = etjt.a((etiu) s(dsbiVar).toBuilder());
        Object objFM = dsao.a.fM(evokVar);
        if (objFM == null) {
            throw new IllegalStateException("Required value was null.");
        }
        etjuVarA.d((etjg) objFM);
        etjqVarA.b(etjuVarA.a());
        v(dsbiVar, etim.PROMO_NOT_SHOWN, etjqVarA.a());
    }

    @Override // defpackage.dsah
    public final void f(dsbi dsbiVar, dsbj dsbjVar) {
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etju etjuVarA = etjt.a((etiu) s(dsbiVar).toBuilder());
        dsak dsakVar = dsao.d;
        evoc evocVarC = dsbjVar.c();
        if (evocVarC == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object objFM = dsakVar.fM(evocVarC);
        if (objFM == null) {
            throw new IllegalStateException("Required value was null.");
        }
        etjuVarA.c((etjd) objFM);
        etjuVarA.d(etjg.PROMO_NOT_SHOWN_CONTROL_GROUP);
        etjqVarA.b(etjuVarA.a());
        v(dsbiVar, etim.PROMO_NOT_SHOWN, etjqVarA.a());
        ((dxtx) this.e.b()).g(this.c, "CONTROL_NOT_SEEN");
    }

    @Override // defpackage.dsah
    public final void g(dsbi dsbiVar) {
        dsbiVar.getClass();
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etjqVarA.b(s(dsbiVar));
        v(dsbiVar, etim.PROMO_NOT_SHOWN_DEVICE_CAPPED, etjqVarA.a());
    }

    @Override // defpackage.dsah
    public final void h(dsbi dsbiVar, dsoo dsooVar) {
        etjg etjgVar;
        dsooVar.getClass();
        if (dsoo.SUCCESS == dsooVar) {
            return;
        }
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etju etjuVarA = etjt.a((etiu) s(dsbiVar).toBuilder());
        switch (dsooVar.ordinal()) {
            case 1:
                etjgVar = etjg.PROMO_NOT_SHOWN_RENDERER_INTERNAL_ERROR;
                break;
            case 2:
                etjgVar = etjg.PROMO_NOT_SHOWN_INTERNAL_ERROR;
                break;
            case 3:
                etjgVar = etjg.PROMO_NOT_SHOWN_UNSUPPORTED_PROMO_UI;
                break;
            case 4:
                etjgVar = etjg.PROMO_NOT_SHOWN_UNSUPPORTED_CUSTOM_UI_TYPE;
                break;
            case 5:
                etjgVar = etjg.PROMO_NOT_SHOWN_THEME_NOT_FOUND;
                break;
            case 6:
                etjgVar = etjg.PROMO_NOT_SHOWN_APPLICATION_IN_BACKGROUND;
                break;
            case 7:
                etjgVar = etjg.PROMO_NOT_SHOWN_VIEW_NOT_IN_SCREEN;
                break;
            case 8:
                etjgVar = etjg.PROMO_NOT_SHOWN_VIEW_MOSTLY_HIDDEN;
                break;
            case 9:
                etjgVar = etjg.PROMO_NOT_SHOWN_MISSING_ASSETS;
                break;
            case 10:
                etjgVar = etjg.PROMO_NOT_SHOWN_INVALID_PROMOTION;
                break;
            case 11:
                etjgVar = etjg.PROMO_NOT_SHOWN_INVALID_CUSTOM_UI_PROTO;
                break;
            case 12:
                etjgVar = etjg.PROMO_NOT_SHOWN_PERMISSION_GRANTED;
                break;
            default:
                etjgVar = etjg.PROMO_NOT_SHOWN_RENDERER_INTERNAL_ERROR;
                break;
        }
        etjuVarA.d(etjgVar);
        etjqVarA.b(etjuVarA.a());
        v(dsbiVar, etim.PROMO_NOT_SHOWN, etjqVarA.a());
    }

    @Override // defpackage.dsah
    public final void i(dsbi dsbiVar) {
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etjqVarA.b(s(dsbiVar));
        v(dsbiVar, etim.PROMO_SENT_FOR_RENDERING, etjqVarA.a());
    }

    @Override // defpackage.dsah
    public final void j(dsbi dsbiVar, dsbj dsbjVar) {
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etju etjuVarA = etjt.a((etiu) s(dsbiVar).toBuilder());
        dsak dsakVar = dsao.d;
        evoc evocVarC = dsbjVar.c();
        if (evocVarC == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object objFM = dsakVar.fM(evocVarC);
        if (objFM == null) {
            throw new IllegalStateException("Required value was null.");
        }
        etjuVarA.c((etjd) objFM);
        etjqVarA.b(etjuVarA.a());
        v(dsbiVar, etim.PROMO_SHOWN, etjqVarA.a());
    }

    @Override // defpackage.dsah
    public final void k(dsbi dsbiVar, boolean z, Set set) {
        set.getClass();
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etju etjuVarA = etjt.a((etiu) s(dsbiVar).toBuilder());
        etiu etiuVar = etjuVarA.a;
        etiuVar.copyOnWrite();
        etjo etjoVar = (etjo) etiuVar.instance;
        etjoVar.d |= 256;
        etjoVar.l = z;
        if (z && !set.isEmpty()) {
            new evsz(((etjo) etiuVar.instance).m, etjo.a);
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                etjl etjlVar = (etjl) dsao.c.fM((evon) it.next());
                if (etjlVar != null) {
                    arrayList.add(etjlVar);
                }
            }
            etiuVar.copyOnWrite();
            etjo etjoVar2 = (etjo) etiuVar.instance;
            evsx evsxVar = etjoVar2.m;
            if (!evsxVar.c()) {
                etjoVar2.m = evsn.mutableCopy(evsxVar);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                etjoVar2.m.h(((etjl) it2.next()).n);
            }
        }
        etjqVarA.b(etjuVarA.a());
        v(dsbiVar, etim.PROMO_TARGETING_EVALUATED, etjqVarA.a());
    }

    @Override // defpackage.dsah
    public final void l(dsbi dsbiVar, int i) {
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etju etjuVarA = etjt.a((etiu) s(dsbiVar).toBuilder());
        etiu etiuVar = etjuVarA.a;
        etiuVar.copyOnWrite();
        etjo etjoVar = (etjo) etiuVar.instance;
        etjoVar.d |= 128;
        etjoVar.k = i;
        etjqVarA.b(etjuVarA.a());
        v(dsbiVar, etim.PROMO_TRIGGERED, etjqVarA.a());
    }

    @Override // defpackage.dsah
    public final void m(dsbi dsbiVar, evoo evooVar) {
        evooVar.getClass();
        Object objFM = dsao.b.fM(evooVar);
        if (objFM == null) {
            throw new IllegalStateException("Required value was null.");
        }
        etjn etjnVar = (etjn) objFM;
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etju etjuVarA = etjt.a((etiu) s(dsbiVar).toBuilder());
        etjuVarA.f(etjnVar);
        etjqVarA.b(etjuVarA.a());
        v(dsbiVar, etim.PROMO_USER_ACTION, etjqVarA.a());
        ((dxtx) this.e.b()).g(this.c, etjnVar.name());
    }

    @Override // defpackage.dsah
    public final void n(dsbi dsbiVar) {
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etju etjuVarA = etjt.a((etiu) s(dsbiVar).toBuilder());
        etjuVarA.f(etjn.ACTION_DISMISS);
        etjqVarA.b(etjuVarA.a());
        v(dsbiVar, etim.PROMO_USER_DISMISSED, etjqVarA.a());
        ((dxtx) this.e.b()).g(this.c, "DISMISSED");
    }

    @Override // defpackage.dsah
    public final void o(dsbi dsbiVar, int i) {
        etjq etjqVarA = etjp.a((etil) etin.a.createBuilder());
        etju etjuVarA = etjt.a((etiu) s(dsbiVar).toBuilder());
        etjuVarA.d(etjg.PROMO_NOT_SHOWN_CLIENT_BLOCK);
        int i2 = i + (-1) == 1 ? 2 : 1;
        etiu etiuVar = etjuVarA.a;
        etiuVar.copyOnWrite();
        etjo etjoVar = (etjo) etiuVar.instance;
        etjoVar.p = i2 - 1;
        etjoVar.d |= 1024;
        etjqVarA.b(etjuVarA.a());
        v(dsbiVar, etim.PROMO_NOT_SHOWN, etjqVarA.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dsah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r9, int r10, boolean r11, java.lang.String r12, java.lang.String r13, java.util.List r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsay.p(java.lang.String, int, boolean, java.lang.String, java.lang.String, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.dxvi r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dsav
            if (r0 == 0) goto L13
            r0 = r6
            dsav r0 = (defpackage.dsav) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsav r0 = new dsav
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            dxpd r6 = r4.k
            boolean r6 = r6.e()
            if (r6 == 0) goto L43
            eygg r6 = r4.j
            java.lang.Object r6 = r6.b()
            dxrk r6 = (defpackage.dxrk) r6
            goto L4b
        L43:
            eygg r6 = r4.i
            java.lang.Object r6 = r6.b()
            dxrk r6 = (defpackage.dxrk) r6
        L4b:
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 == r1) goto L81
        L56:
            dxft r6 = (defpackage.dxft) r6
            boolean r5 = r6 instanceof defpackage.dxfx
            if (r5 == 0) goto L74
            dxfx r6 = (defpackage.dxfx) r6
            java.lang.Object r5 = r6.a
            dxhe r5 = (defpackage.dxhe) r5
            if (r5 != 0) goto L6e
            dxfp r5 = new dxfp
            java.lang.String r6 = "Account not in storage"
            r0 = 18
            r5.<init>(r6, r0)
            return r5
        L6e:
            dxfx r6 = new dxfx
            r6.<init>(r5)
            return r6
        L74:
            boolean r5 = r6 instanceof defpackage.dxfo
            if (r5 == 0) goto L7b
            dxfo r6 = (defpackage.dxfo) r6
            return r6
        L7b:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsay.q(dxvi, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dsax
            if (r0 == 0) goto L13
            r0 = r5
            dsax r0 = (defpackage.dsax) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsax r0 = new dsax
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L56
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            dxpd r5 = r4.k
            boolean r5 = r5.e()
            if (r5 == 0) goto L43
            eygg r5 = r4.j
            java.lang.Object r5 = r5.b()
            dxrk r5 = (defpackage.dxrk) r5
            goto L4b
        L43:
            eygg r5 = r4.i
            java.lang.Object r5 = r5.b()
            dxrk r5 = (defpackage.dxrk) r5
        L4b:
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto Lb0
        L56:
            dxft r5 = (defpackage.dxft) r5
            boolean r0 = r5 instanceof defpackage.dxfx
            if (r0 == 0) goto La3
            dxfx r5 = (defpackage.dxfx) r5
            java.lang.Object r5 = r5.a
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
        L71:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r1.next()
            dxhe r2 = (defpackage.dxhe) r2
            dxvi r2 = r2.s()
            java.lang.String r2 = r2.a()
            r0.add(r2)
            goto L71
        L89:
            java.util.List r0 = defpackage.fcva.ab(r0)
            dxfx r1 = new dxfx
            int r5 = r5.size()
            int r0 = r0.size()
            if (r5 <= r0) goto L9a
            goto L9b
        L9a:
            r3 = 0
        L9b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r1.<init>(r5)
            return r1
        La3:
            boolean r0 = r5 instanceof defpackage.dxfo
            if (r0 == 0) goto Laa
            dxfo r5 = (defpackage.dxfo) r5
            return r5
        Laa:
            fctg r5 = new fctg
            r5.<init>()
            throw r5
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsay.r(fcxy):java.lang.Object");
    }
}
