package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzes implements bzbe {
    private final cprh b;
    private final cpuk c;
    private final fcsu d;
    private final eksp e;
    private final cpum f;

    public bzes(cprh cprhVar, cpuk cpukVar, cpum cpumVar, fcsu fcsuVar) {
        cprhVar.getClass();
        fcsuVar.getClass();
        this.b = cprhVar;
        this.c = cpukVar;
        this.f = cpumVar;
        this.d = fcsuVar;
        this.e = eksp.c("BugleCms");
    }

    @Override // defpackage.bzbe
    public final /* bridge */ /* synthetic */ cpyi a(Object obj) {
        cpua cpuaVar = (cpua) obj;
        cpuaVar.getClass();
        return cpuaVar.b().H();
    }

    @Override // defpackage.bzbe
    public final /* bridge */ /* synthetic */ Object b(Object obj, bnar bnarVar, boolean z, EnumSet enumSet, fcxy fcxyVar) {
        int i;
        cpua cpuaVar = (cpua) obj;
        ParticipantsTable.BindData bindDataB = cpuaVar.b();
        String strR = bindDataB.R();
        String strT = bindDataB.T();
        int iR = bindDataB.r();
        ains ainsVar = (ains) this.d.b();
        boolean z2 = iR == -1;
        eqnl eqnlVar = null;
        if (z2) {
            if (strT == null) {
                i = 1;
                strT = null;
            } else {
                i = 2;
            }
        } else if (strT == null) {
            strT = null;
            i = 3;
        } else {
            i = 4;
        }
        ainsVar.e("Bugle.Cms.Participants.Assembly.DestinationStatus", i - 1);
        if (!z2 && TextUtils.isEmpty(strT)) {
            throw new cpul();
        }
        String strB = this.b.b(strT, Boolean.valueOf(z2));
        cpum cpumVar = this.f;
        ejwl.l(!ecem.g());
        ParticipantsTable.BindData bindDataB2 = cpuaVar.b();
        int iR2 = bindDataB2.r();
        if (iR2 == -2 || iR2 == -1) {
            eplx eplxVar = (eplx) eply.a.createBuilder();
            ParticipantsTable.BindData bindDataB3 = cpuaVar.b();
            String strR2 = bindDataB3.R();
            if (!TextUtils.isEmpty(strR2)) {
                long jA = cpuaVar.a();
                eplxVar.copyOnWrite();
                ((eply) eplxVar.instance).p = jA;
            }
            String strT2 = bindDataB3.T();
            if (!TextUtils.isEmpty(strT2)) {
                eplxVar.copyOnWrite();
                eply eplyVar = (eply) eplxVar.instance;
                strT2.getClass();
                eplyVar.c = strT2;
                String str = String.format("#%06X", Integer.valueOf((bindDataB3.m() == 2 ? bindDataB3.n() : ((crlw) cpumVar.d.b()).e(cpbs.a(strT2), false)) & 16777215));
                eplxVar.copyOnWrite();
                eply eplyVar2 = (eply) eplxVar.instance;
                str.getClass();
                eplyVar2.k = str;
            }
            String strV = bindDataB3.V();
            if (!TextUtils.isEmpty(strV)) {
                eplxVar.copyOnWrite();
                eply eplyVar3 = (eply) eplxVar.instance;
                strV.getClass();
                eplyVar3.d = strV;
            }
            String strO = bindDataB3.O();
            if (!TextUtils.isEmpty(strO)) {
                eplxVar.copyOnWrite();
                eply eplyVar4 = (eply) eplxVar.instance;
                strO.getClass();
                eplyVar4.e = strO;
            }
            String strP = bindDataB3.P();
            if (!TextUtils.isEmpty(strP)) {
                eplxVar.copyOnWrite();
                eply eplyVar5 = (eply) eplxVar.instance;
                strP.getClass();
                eplyVar5.f = strP;
            }
            String strQ = bindDataB3.Q();
            if (!TextUtils.isEmpty(strQ)) {
                eplxVar.copyOnWrite();
                eply eplyVar6 = (eply) eplxVar.instance;
                strQ.getClass();
                eplyVar6.g = strQ;
            }
            String strU = bindDataB3.U();
            if (!TextUtils.isEmpty(strU)) {
                cqbd cqbdVarC = cpum.b.c();
                cqbdVarC.I("Backing up blobId for");
                cqbdVarC.A("participant", strR2);
                cqbdVarC.A("blobId", strU);
                cqbdVarC.r();
                eplxVar.copyOnWrite();
                eply eplyVar7 = (eply) eplxVar.instance;
                strU.getClass();
                eplyVar7.h = strU;
            }
            byte[] bArrAc = bindDataB3.ac();
            if (bArrAc != null) {
                evqs evqsVarX = evqs.x(bArrAc);
                eplxVar.copyOnWrite();
                ((eply) eplxVar.instance).i = evqsVarX;
            }
            boolean zK = bbdl.k(bindDataB3);
            eplxVar.copyOnWrite();
            ((eply) eplxVar.instance).j = zK;
            boolean zX = bindDataB3.X();
            eplxVar.copyOnWrite();
            ((eply) eplxVar.instance).l = zX;
            boolean zAa = bindDataB3.aa();
            eplxVar.copyOnWrite();
            ((eply) eplxVar.instance).n = zAa;
            int iO = bindDataB3.o();
            eplxVar.copyOnWrite();
            ((eply) eplxVar.instance).o = iO;
            int iP = bindDataB3.p();
            int i2 = iP != 0 ? iP != 1 ? 2 : 4 : 3;
            eplxVar.copyOnWrite();
            ((eply) eplxVar.instance).m = i2 - 2;
            if (zK) {
                eplz eplzVar = (eplz) epma.a.createBuilder();
                btxd btxdVarC = cpuaVar.c();
                if (btxdVarC != null) {
                    String strO2 = btxdVarC.o();
                    if (!TextUtils.isEmpty(strO2)) {
                        eplzVar.copyOnWrite();
                        epma epmaVar = (epma) eplzVar.instance;
                        strO2.getClass();
                        epmaVar.b = strO2;
                    }
                    int iK = btxdVarC.k();
                    eplzVar.copyOnWrite();
                    ((epma) eplzVar.instance).c = iK;
                    int iM = btxdVarC.m();
                    eplzVar.copyOnWrite();
                    ((epma) eplzVar.instance).d = iM;
                    btxdVarC.aA(5, "subscription_name");
                    String str2 = btxdVarC.f;
                    if (!TextUtils.isEmpty(str2)) {
                        eplzVar.copyOnWrite();
                        epma epmaVar2 = (epma) eplzVar.instance;
                        str2.getClass();
                        epmaVar2.e = str2;
                    }
                    btxdVarC.aA(8, "smsc");
                    String str3 = btxdVarC.i;
                    if (!TextUtils.isEmpty(str3)) {
                        eplzVar.copyOnWrite();
                        epma epmaVar3 = (epma) eplzVar.instance;
                        str3.getClass();
                        epmaVar3.f = str3;
                    }
                }
                epma epmaVar4 = (epma) eplzVar.build();
                eplxVar.copyOnWrite();
                eply eplyVar8 = (eply) eplxVar.instance;
                epmaVar4.getClass();
                eplyVar8.q = epmaVar4;
                eplyVar8.b |= 1;
            }
            byte[] byteArray = ((eply) eplxVar.build()).toByteArray();
            epkg epkgVar = (epkg) epkh.a.createBuilder();
            cpum.l(byteArray, bnarVar, epkgVar);
            epkh epkhVar = (epkh) epkgVar.build();
            String strL = bindDataB2.L();
            eqnk eqnkVar = (eqnk) eqnl.a.createBuilder();
            if (strL == null || !strL.startsWith("dummy_participant_cms_id_")) {
                if (!TextUtils.isEmpty(strL)) {
                    eqnkVar.copyOnWrite();
                    eqnl eqnlVar2 = (eqnl) eqnkVar.instance;
                    strL.getClass();
                    eqnlVar2.c = strL;
                }
                String strT3 = bindDataB2.T();
                boolean z3 = bindDataB2.r() == -1;
                if (!z3 && TextUtils.isEmpty(strT3)) {
                    throw new cpul();
                }
                String strB2 = cpumVar.c.b(strT3, Boolean.valueOf(z3));
                eqmv eqmvVar = (eqmv) eqmw.a.createBuilder();
                eqmvVar.copyOnWrite();
                ((eqmw) eqmvVar.instance).b = strB2;
                eqmvVar.copyOnWrite();
                ((eqmw) eqmvVar.instance).c = eqmu.a(7);
                eqmw eqmwVar = (eqmw) eqmvVar.build();
                eqnp eqnpVar = (eqnp) eqnq.a.createBuilder();
                eqnpVar.copyOnWrite();
                eqnq eqnqVar = (eqnq) eqnpVar.instance;
                eqmwVar.getClass();
                eqnqVar.c = eqmwVar;
                eqnqVar.b |= 1;
                eqnq eqnqVar2 = (eqnq) eqnpVar.build();
                eqnkVar.copyOnWrite();
                eqnl eqnlVar3 = (eqnl) eqnkVar.instance;
                eqnqVar2.getClass();
                eqnlVar3.d = eqnqVar2;
                eqnlVar3.b |= 1;
                evqd evqdVar = (evqd) evqe.a.createBuilder();
                evqdVar.copyOnWrite();
                ((evqe) evqdVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
                evqs byteString = epkhVar.toByteString();
                evqdVar.copyOnWrite();
                ((evqe) evqdVar.instance).c = byteString;
                eqnkVar.copyOnWrite();
                eqnl eqnlVar4 = (eqnl) eqnkVar.instance;
                evqe evqeVar = (evqe) evqdVar.build();
                evqeVar.getClass();
                eqnlVar4.e = evqeVar;
                eqnlVar4.b |= 2;
                eqnlVar = (eqnl) eqnkVar.build();
            }
        }
        if (eqnlVar == null) {
            eksl ekslVar = (eksl) this.e.h();
            ekslVar.X(bzmz.c, strR);
            ekslVar.q("CMS Participant item was skipped");
            strR.getClass();
            throw new bzde(strR);
        }
        String str4 = eqnlVar.c;
        str4.getClass();
        if (str4.length() > 0 && !fdbq.f(eqnlVar.c, strB)) {
            eksl ekslVar2 = (eksl) this.e.j();
            ekslVar2.X(bzmz.c, strR);
            ekslVar2.X(bzmz.g, eqnlVar.c);
            ekslVar2.q("CMS Participant ID does not match to its normalized destination Hash.");
            strR.getClass();
            throw new bzde(strR);
        }
        eqnk eqnkVar2 = (eqnk) eqnlVar.toBuilder();
        eqnkVar2.getClass();
        String str5 = ((eqnl) eqnkVar2.instance).c;
        str5.getClass();
        if (str5.length() == 0) {
            eqnq eqnqVar3 = ((eqnl) eqnkVar2.instance).d;
            if (eqnqVar3 == null) {
                eqnqVar3 = eqnq.a;
            }
            eqnqVar3.getClass();
            eqmw eqmwVar2 = eqnqVar3.c;
            if (eqmwVar2 == null) {
                eqmwVar2 = eqmw.a;
            }
            String str6 = eqmwVar2.b;
            str6.getClass();
            eqnkVar2.copyOnWrite();
            ((eqnl) eqnkVar2.instance).c = str6;
        }
        evsn evsnVarBuild = eqnkVar2.build();
        evsnVarBuild.getClass();
        return (eqnl) evsnVarBuild;
    }

    @Override // defpackage.bzbe
    public final /* bridge */ /* synthetic */ Object c(final String str, EnumSet enumSet) throws X {
        str.getClass();
        enumSet.getClass();
        Object objOrElseThrow = this.c.a(str).orElseThrow(new Supplier() { // from class: bzer
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bzdd(str);
            }
        });
        objOrElseThrow.getClass();
        return (cpua) objOrElseThrow;
    }

    @Override // defpackage.bzbe
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        cpua cpuaVar = (cpua) obj;
        cpuaVar.getClass();
        return cpuaVar.b().L();
    }

    @Override // defpackage.bzbe
    public final Map e(Collection collection, EnumSet enumSet) {
        collection.getClass();
        enumSet.getClass();
        List listAo = fcva.ao(collection);
        final cpuk cpukVar = this.c;
        ekgp ekgpVar = (ekgp) Collection.EL.stream(((bbca) cpukVar.c.b()).n(listAo).entrySet()).collect(ekcv.a(new Function() { // from class: cpuh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: cpui
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) entry.getValue();
                String str = (String) entry.getKey();
                cptz cptzVarD = cpua.d();
                cptzVarD.c(bindData);
                cpuk cpukVar2 = cpukVar;
                cptzVarD.b(bbfz.d(str));
                if (bindData.r() == -1) {
                    btxd btxdVarA = bbdn.a(aofa.b(str));
                    if (btxdVarA != null) {
                        ((cplx) cptzVarD).a = btxdVarA;
                    }
                }
                return cptzVarD.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        ekgpVar.getClass();
        ArrayList arrayList = new ArrayList(ekgpVar.size());
        Iterator it = ekgpVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new fcti((String) entry.getKey(), new fctk((cpua) entry.getValue())));
        }
        Map mapK = fcwa.k(arrayList);
        Set setE = fcwm.e(fcva.av(collection), mapK.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(setE, 10)), 16));
        for (Object obj : setE) {
            String str = (String) obj;
            str.getClass();
            linkedHashMap.put(obj, new fctk(fctl.a(new bzdd(str))));
        }
        return fcwa.j(mapK, linkedHashMap);
    }
}
