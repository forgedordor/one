package defpackage;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxtn {
    public static final /* synthetic */ int a = 0;
    private static final fctc b = fctd.a(new fdae() { // from class: bxtm
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fdae
        public final Object invoke() {
            evpn evpnVar;
            int i = bxtn.a;
            evpv evpvVar = (evpv) evpw.b.createBuilder();
            evpvVar.copyOnWrite();
            evpw evpwVar = (evpw) evpvVar.instance;
            evpwVar.c |= 8;
            evpwVar.g = 86129221;
            evpw evpwVar2 = (evpw) evpvVar.build();
            exdc exdcVar = exdc.a;
            exdb exdbVar = (exdb) exdcVar.createBuilder();
            exdbVar.copyOnWrite();
            exdc exdcVar2 = (exdc) exdbVar.instance;
            exdcVar2.e = 48;
            exdcVar2.b |= 16384;
            if ((evpwVar2.c & 1) != 0) {
                long j = evpwVar2.d;
                exdbVar.copyOnWrite();
                exdc exdcVar3 = (exdc) exdbVar.instance;
                exdcVar3.b |= 32768;
                exdcVar3.f = j;
            }
            if ((evpwVar2.c & 8) != 0) {
                int i2 = evpwVar2.g;
                exdbVar.copyOnWrite();
                exdc exdcVar4 = (exdc) exdbVar.instance;
                exdcVar4.c |= 2048;
                exdcVar4.h = i2;
            }
            if (!evpwVar2.h.isEmpty()) {
                exdbVar.a(evpwVar2.h);
            }
            evsx evsxVar = evpwVar2.i;
            evsy evsyVar = evpw.a;
            if (!new evsz(evsxVar, evsyVar).isEmpty()) {
                evsz evszVar = new evsz(evpwVar2.i, evsyVar);
                exdbVar.copyOnWrite();
                exdc exdcVar5 = (exdc) exdbVar.instance;
                evsx evsxVar2 = exdcVar5.j;
                if (!evsxVar2.c()) {
                    exdcVar5.j = evsn.mutableCopy(evsxVar2);
                }
                Iterator<T> it = evszVar.iterator();
                while (it.hasNext()) {
                    exdcVar5.j.h(((evpa) it.next()).a());
                }
            }
            if ((evpwVar2.c & 64) != 0) {
                boolean z = evpwVar2.j;
                exdbVar.copyOnWrite();
                exdc exdcVar6 = (exdc) exdbVar.instance;
                exdcVar6.c |= 524288;
                exdcVar6.n = z;
            }
            if ((evpwVar2.c & 2) != 0) {
                long j2 = evpwVar2.e;
                exdbVar.copyOnWrite();
                exdc exdcVar7 = (exdc) exdbVar.instance;
                exdcVar7.b |= 65536;
                exdcVar7.g = j2;
            }
            if ((evpwVar2.c & 4) != 0) {
                String str = evpwVar2.f;
                exdbVar.copyOnWrite();
                exdc exdcVar8 = (exdc) exdbVar.instance;
                str.getClass();
                exdcVar8.b |= 256;
                exdcVar8.d = str;
            }
            if ((evpwVar2.c & 256) != 0) {
                boolean z2 = evpwVar2.k;
                exdbVar.copyOnWrite();
                exdc exdcVar9 = (exdc) exdbVar.instance;
                exdcVar9.c |= 131072;
                exdcVar9.m = z2;
            }
            if ((evpwVar2.c & 512) != 0) {
                boolean z3 = evpwVar2.l;
                exdbVar.copyOnWrite();
                exdc exdcVar10 = (exdc) exdbVar.instance;
                exdcVar10.c |= 32768;
                exdcVar10.k = z3;
            }
            if ((evpwVar2.c & 1024) != 0) {
                int iA = evpr.a(evpwVar2.m);
                if (iA == 0) {
                    iA = 1;
                }
                exdbVar.copyOnWrite();
                exdc exdcVar11 = (exdc) exdbVar.instance;
                exdcVar11.l = iA - 1;
                exdcVar11.c |= 65536;
            }
            evpj evpjVar = evpj.a;
            evpi evpiVar = (evpi) evpjVar.createBuilder();
            exde exdeVar = exde.a;
            exdd exddVar = (exdd) exdeVar.createBuilder();
            exddVar.copyOnWrite();
            exde exdeVar2 = (exde) exddVar.instance;
            exdc exdcVar12 = (exdc) exdbVar.build();
            exdcVar12.getClass();
            exdeVar2.c = exdcVar12;
            exdeVar2.b |= 1;
            evpiVar.copyOnWrite();
            evpj evpjVar2 = (evpj) evpiVar.instance;
            exde exdeVar3 = (exde) exddVar.build();
            exdeVar3.getClass();
            evpjVar2.c = exdeVar3;
            evpjVar2.b |= 1;
            evpt evptVarA = evpd.a(evpiVar);
            evptVarA.getClass();
            evsl evslVar = evpf.b;
            evsl evslVarCheckIsLite = evsn.checkIsLite(evslVar);
            evptVarA.d(evslVarCheckIsLite);
            if (evptVarA.r.o(evslVarCheckIsLite.d)) {
                evsl evslVarCheckIsLite2 = evsn.checkIsLite(evslVar);
                evptVarA.d(evslVarCheckIsLite2);
                Object objL = evptVarA.r.l(evslVarCheckIsLite2.d);
                evpnVar = (evpn) (objL == null ? evslVarCheckIsLite2.b : evslVarCheckIsLite2.c(objL));
            } else {
                evsl evslVar2 = evph.b;
                evsl evslVarCheckIsLite3 = evsn.checkIsLite(evslVar2);
                evptVarA.d(evslVarCheckIsLite3);
                if (!evptVarA.r.o(evslVarCheckIsLite3.d)) {
                    throw new IllegalArgumentException("Malformed pToken: pToken version is not recognized.");
                }
                evpk evpkVar = (evpk) evpn.a.createBuilder();
                evpl evplVar = (evpl) evpm.a.createBuilder();
                evsl evslVarCheckIsLite4 = evsn.checkIsLite(evslVar2);
                evptVarA.d(evslVarCheckIsLite4);
                Object objL2 = evptVarA.r.l(evslVarCheckIsLite4.d);
                evpj evpjVar3 = (evpj) (objL2 == null ? evslVarCheckIsLite4.b : evslVarCheckIsLite4.c(objL2));
                evplVar.copyOnWrite();
                evpm evpmVar = (evpm) evplVar.instance;
                evpjVar3.getClass();
                evpmVar.c = evpjVar3;
                evpmVar.b = 1;
                evpkVar.copyOnWrite();
                evpn evpnVar2 = (evpn) evpkVar.instance;
                evpm evpmVar2 = (evpm) evplVar.build();
                evpmVar2.getClass();
                evtg evtgVar = evpnVar2.b;
                if (!evtgVar.c()) {
                    evpnVar2.b = evsn.mutableCopy(evtgVar);
                }
                evpnVar2.b.add(evpmVar2);
                evpnVar = (evpn) evpkVar.build();
            }
            ejwl.d(evpnVar.b.size() == 1, "Unexpected number of scalar ptokens: %s", evpnVar.b.size());
            evpm evpmVar3 = (evpm) evpnVar.b.get(0);
            exde exdeVar4 = (evpmVar3.b == 1 ? (evpj) evpmVar3.c : evpjVar).c;
            if (exdeVar4 == null) {
                exdeVar4 = exdeVar;
            }
            exdc exdcVar13 = exdeVar4.c;
            if (exdcVar13 == null) {
                exdcVar13 = exdcVar;
            }
            exdb exdbVar2 = (exdb) exdcVar.createBuilder();
            if ((exdcVar13.c & 524288) != 0) {
                boolean z4 = exdcVar13.n;
                exdbVar2.copyOnWrite();
                exdc exdcVar14 = (exdc) exdbVar2.instance;
                exdcVar14.c = 524288 | exdcVar14.c;
                exdcVar14.n = z4;
            }
            if ((exdcVar13.c & 131072) != 0) {
                boolean z5 = exdcVar13.m;
                exdbVar2.copyOnWrite();
                exdc exdcVar15 = (exdc) exdbVar2.instance;
                exdcVar15.c = 131072 | exdcVar15.c;
                exdcVar15.m = z5;
            }
            if ((exdcVar13.c & 2048) != 0) {
                int i3 = exdcVar13.h;
                exdbVar2.copyOnWrite();
                exdc exdcVar16 = (exdc) exdbVar2.instance;
                exdcVar16.c |= 2048;
                exdcVar16.h = i3;
            }
            if ((exdcVar13.c & 32768) != 0) {
                boolean z6 = exdcVar13.k;
                exdbVar2.copyOnWrite();
                exdc exdcVar17 = (exdc) exdbVar2.instance;
                exdcVar17.c = 32768 | exdcVar17.c;
                exdcVar17.k = z6;
            }
            if ((exdcVar13.c & 65536) != 0) {
                int iA2 = evpr.a(exdcVar13.l);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                exdbVar2.copyOnWrite();
                exdc exdcVar18 = (exdc) exdbVar2.instance;
                exdcVar18.l = iA2 - 1;
                exdcVar18.c |= 65536;
            }
            if (!exdcVar13.i.isEmpty()) {
                exdbVar2.a(exdcVar13.i);
            }
            if ((exdcVar13.b & 16384) != 0) {
                int iA3 = evpp.a(exdcVar13.e);
                if (iA3 == 0) {
                    iA3 = 1;
                }
                exdbVar2.copyOnWrite();
                exdc exdcVar19 = (exdc) exdbVar2.instance;
                exdcVar19.e = iA3 - 1;
                exdcVar19.b |= 16384;
            }
            evpi evpiVar2 = (evpi) evpjVar.createBuilder();
            exdd exddVar2 = (exdd) exdeVar.createBuilder();
            exddVar2.copyOnWrite();
            exde exdeVar5 = (exde) exddVar2.instance;
            exdc exdcVar20 = (exdc) exdbVar2.build();
            exdcVar20.getClass();
            exdeVar5.c = exdcVar20;
            exdeVar5.b |= 1;
            evpiVar2.copyOnWrite();
            evpj evpjVar4 = (evpj) evpiVar2.instance;
            exde exdeVar6 = (exde) exddVar2.build();
            exdeVar6.getClass();
            evpjVar4.c = exdeVar6;
            evpjVar4.b |= 1;
            evpt evptVarA2 = evpd.a(evpiVar2);
            byte[] byteArray = evptVarA.toByteArray();
            aff affVar = G3AttributionInfo.a;
            return new G3AttributionInfo("", "", byteArray, eldz.e.g().j(evptVarA2.toByteArray()));
        }
    });

    public static final G3AttributionInfo a() {
        return (G3AttributionInfo) b.a();
    }
}
