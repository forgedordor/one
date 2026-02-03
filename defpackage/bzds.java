package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzds implements bzba {
    public static final eksp a = eksp.c("BugleCms");
    public final bzzt b;
    public final aurx c;
    public final dqsn d;
    public final dzuc e;
    private final efwo f;
    private final fcsu g;
    private final bzrq h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fdjx l;
    private final fcyh m;
    private final apoj n;

    public bzds(efwo efwoVar, fcsu fcsuVar, bzrq bzrqVar, bzzt bzztVar, aurx aurxVar, cpmh cpmhVar, fcsu fcsuVar2, dqsn dqsnVar, dzuc dzucVar, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar, fcyh fcyhVar, apoj apojVar) {
        efwoVar.getClass();
        fcsuVar.getClass();
        bzrqVar.getClass();
        aurxVar.getClass();
        cpmhVar.getClass();
        fcsuVar2.getClass();
        dqsnVar.getClass();
        dzucVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        apojVar.getClass();
        this.f = efwoVar;
        this.g = fcsuVar;
        this.h = bzrqVar;
        this.b = bzztVar;
        this.c = aurxVar;
        this.i = fcsuVar2;
        this.d = dqsnVar;
        this.e = dzucVar;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.l = fdjxVar;
        this.m = fcyhVar;
        this.n = apojVar;
    }

    public static final ekgb h(List list) {
        ekgb<String> ekgbVarA = ekfv.a(list);
        ecem.b();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarA, 10));
        for (String str : ekgbVarA) {
            str.getClass();
            arrayList.add(fdgn.h(str));
        }
        final ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Long) obj) != null) {
                arrayList2.add(obj);
            }
        }
        String[] strArr = bmnn.a;
        bmnf bmnfVar = new bmnf();
        bmnfVar.f("CmsBackupDependencyCacheDatabaseOperations#deleteDependencyMessages");
        bmnfVar.c(new Function() { // from class: cpmg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bmnm bmnmVar = (bmnm) obj2;
                bmnmVar.getClass();
                bmnmVar.ap(new dqpm("cms_backup_dependency_cache_table.dependency_id", 3, bmnm.as(arrayList2), true));
                return bmnmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bmnl bmnlVar = (bmnl) bmnfVar.b().b;
        ekgb<bmmk> ekgbVar = (ekgb) bmnn.a().p("cms_backup_dependency_cache_table-deleteAndReturnDeletedRows-txn", new ejxr() { // from class: bmmh
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr2 = bmnn.a;
                bmnk bmnkVar = new bmnk(bmnn.a);
                bmnl bmnlVar2 = bmnlVar;
                bmnkVar.k(bmnlVar2);
                bmnkVar.A("cms_backup_dependency_cache_table-deleteAndReturnDeletedRows-query");
                ekgb ekgbVarZ = bmnkVar.b().z();
                bmnf bmnfVar2 = new bmnf();
                bmnfVar2.b = bmnlVar2;
                bmnfVar2.f("cms_backup_dependency_cache_table-deleteAndReturnDeletedRows-delete");
                bmnfVar2.b().b();
                return ekgbVarZ;
            }
        });
        ekgbVar.getClass();
        ArrayList arrayList3 = new ArrayList(fcva.p(ekgbVar, 10));
        for (bmmk bmmkVar : ekgbVar) {
            bmmkVar.aA(1, "dependent_id");
            arrayList3.add(String.valueOf(bmmkVar.b));
        }
        return ekfv.a(arrayList3);
    }

    private final void i(String str, Optional optional, bzbz bzbzVar) throws IOException {
        eieu eieuVarH = eiiy.h("CmsMessagesBackupDelegate#scheduleInitialMediaUploadForMessage");
        try {
            cprt cprtVar = (cprt) fdct.b(optional);
            if (cprtVar == null) {
                if (!((appk) this.k.b()).a()) {
                    throw new bzdd(str);
                }
                throw new bzdd(str, this.j);
            }
            MessageCoreData messageCoreDataA = cprtVar.a();
            boolean zB = ((Boolean) ((cczi) cpyl.G.get()).e()).booleanValue() ? cpxz.b(bzbzVar.c) : true;
            bzrq bzrqVar = this.h;
            evvp evvpVar = evxc.c;
            bzrqVar.g(messageCoreDataA, zB, evvpVar);
            bzrqVar.f(messageCoreDataA, zB, evvpVar);
            fczl.a(eieuVarH, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.bzba
    public final Object a(Map map, bzbz bzbzVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.m), new bzdm(null, map, this, bzbzVar), fcxyVar);
    }

    @Override // defpackage.bzba
    public final void b(avbk avbkVar, String str, Optional optional, String str2, bzbz bzbzVar) throws IOException {
        avbkVar.getClass();
        if (this.n.a()) {
            if (!cpxz.b(bzbzVar.c) && ((Boolean) ((cczi) cpyl.G.get()).e()).booleanValue() && avbkVar == avbk.CMS_EVENT_TYPE_CREATE_TRIGGERED) {
                i(str, optional, bzbzVar);
            }
        } else if (cpxz.b(bzbzVar.c) || (((Boolean) ((cczi) cpyl.G.get()).e()).booleanValue() && avbkVar == avbk.CMS_EVENT_TYPE_CREATE_TRIGGERED)) {
            i(str, optional, bzbzVar);
        }
        if (cpyl.a() && ((apom) this.i.b()).a() && !cpxz.b(bzbzVar.c)) {
            auvw.k(this.l, null, null, new bzdr(this, str, bzbzVar, null), 3);
        }
    }

    @Override // defpackage.bzba
    public final Object c(String str, String str2) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(bzmz.c, str);
        ekslVar.X(bzmz.e, str2);
        ekslVar.q("Recovering from ALREADY_EXISTS error for message");
        return bzau.a;
    }

    @Override // defpackage.bzba
    public final /* synthetic */ Object d(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new fctk(entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // defpackage.bzba
    public final void e(avbk avbkVar, String str, bzbz bzbzVar) {
        avbkVar.getClass();
        eksl ekslVar = (eksl) a.j();
        bzch bzchVar = bzbzVar.b;
        ekslVar.X(bzmz.d, bzchVar.a);
        ekslVar.X(bzmz.c, str);
        ekslVar.X(bzmz.p, Integer.valueOf(bzchVar.b));
        ekslVar.q("Failure while processing Cms Message.");
    }

    @Override // defpackage.bzba
    public final void f(List list, bzbz bzbzVar) {
        if (cpyl.a() && ((Boolean) ((cczi) cpyl.o.get()).e()).booleanValue() && cpxz.b(bzbzVar.c)) {
            auvw.k(this.l, null, null, new bzdn(this, list, null), 3);
        }
        if (((apom) this.i.b()).a() && cpyl.a()) {
            auvw.k(this.l, null, null, new bzdp(this, list, bzbzVar, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ekgb ekgbVar, bzbz bzbzVar) {
        ekqh it = ekgbVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            String str = (String) it.next();
            byiu byiuVar = (byiu) byiv.a.createBuilder();
            byiuVar.getClass();
            byin.b(this.f.a(), byiuVar);
            byin.f(5, byiuVar);
            str.getClass();
            byin.e(str, byiuVar);
            byin.c(byxy.a(6), byiuVar);
            byin.d(cpxz.b(bzbzVar.c), byiuVar);
            fcsu fcsuVar = this.g;
            ((bykf) fcsuVar.b()).c(byin.a(byiuVar));
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(bzmz.c, str);
            bzch bzchVar = bzbzVar.b;
            ekslVar.X(bzmz.d, bzchVar.a);
            ekslVar.X(bzmz.p, Integer.valueOf(bzchVar.b));
            ekslVar.q("Queued deferred message dependent work.");
        }
    }
}
