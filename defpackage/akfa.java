package defpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akfa extends fcyz implements fdat {
    final /* synthetic */ URL a;
    final /* synthetic */ akfb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akfa(fcxy fcxyVar, URL url, akfb akfbVar) {
        super(2, fcxyVar);
        this.a = url;
        this.b = akfbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akfa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        String str;
        Iterator it;
        Object obj3;
        String str2;
        eupa eupaVar;
        ekyo ekyoVar;
        fctl.b(obj);
        feza fezaVar = new feza();
        char[] cArr = feyq.a;
        String string = this.a.toString();
        string.getClass();
        fezaVar.h(feyp.b(string));
        Object obj4 = null;
        fezaVar.e("GET", null);
        fezh fezhVarA = new ffaj(this.b.c, fezaVar.a()).a();
        String str3 = "invokeSuspend";
        if (!fezhVarA.a()) {
            ((ekrd) akfb.a.j().h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/geofilter/GeofilterDbFetcherImpl$fetch$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 32, "GeofilterDbFetcherImpl.kt")).q("Failed to fetch geofilterdb");
            return null;
        }
        fezk fezkVar = fezhVarA.g;
        if (fezkVar == null) {
            ((ekrd) akfb.a.j().h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/geofilter/GeofilterDbFetcherImpl$fetch$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 39, "GeofilterDbFetcherImpl.kt")).q("No data in geofilterdb response");
            return null;
        }
        long jA = fezkVar.a();
        if (jA > 2147483647L) {
            throw new IOException(a.u(jA, "Cannot buffer entire body for content length: "));
        }
        fffb fffbVarC = fezkVar.c();
        try {
            byte[] bArrG = fffbVarC.G();
            fczl.a(fffbVarC, null);
            int length = bArrG.length;
            if (jA != -1 && jA != length) {
                throw new IOException("Content-Length (" + jA + ") and stream length (" + length + ") disagree");
            }
            try {
                eupf eupfVar = (eupf) evsn.parseFrom(eupf.a, bArrG, evrr.a());
                eupfVar.getClass();
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Iterator it2 = eupfVar.b.iterator();
                while (it2.hasNext()) {
                    eupl euplVar = (eupl) it2.next();
                    int i2 = euplVar.b;
                    if (i2 == 2) {
                        esxo esxoVar = ((eupi) euplVar.c).b;
                        if (esxoVar == null) {
                            esxoVar = esxo.a;
                        }
                        byte b = 1;
                        if ((esxoVar.b & 1) != 0) {
                            ekxa ekxaVar = new ekxa(esxoVar.d.m());
                            byte bA = ekxaVar.a();
                            int i3 = 0;
                            if (bA == 1) {
                                it = it2;
                                obj3 = obj4;
                                str2 = str3;
                                ekyo ekyoVar2 = new ekyo();
                                ekxaVar.a();
                                ekxaVar.a();
                                ekyoVar2.d = 0;
                                int iC = ekxaVar.c();
                                if (iC < 0) {
                                    throw new IOException(a.g(iC, "Can only decode polygons with up to 2^31 - 1 loops. Got "));
                                }
                                int i4 = 0;
                                while (i4 < iC) {
                                    byte bA2 = ekxaVar.a();
                                    if (bA2 != b) {
                                        throw new IOException(a.g(bA2, "Unknown S2Loop encoding version encountered during decoding: "));
                                    }
                                    int iC2 = ekxaVar.c();
                                    if (iC2 < 0) {
                                        throw new IOException(a.e(iC2, "Invalid numVertices: ", ". Loops with more than 2^31 - 1 vertices are not supported."));
                                    }
                                    ArrayList arrayList = new ArrayList(iC2);
                                    for (int i5 = i3; i5 < iC2; i5++) {
                                        arrayList.add(new ekyj(ekxaVar.b(), ekxaVar.b(), ekxaVar.b()));
                                    }
                                    boolean z = ekxaVar.a() != 0 ? b : i3;
                                    int iC3 = ekxaVar.c();
                                    ekyh ekyhVar = new ekyh(arrayList, z, ekyd.c(ekxaVar));
                                    ekyhVar.f = iC3;
                                    if (iC2 > 0) {
                                        ekyhVar.f();
                                    }
                                    if (!ekyo.f(ekyhVar)) {
                                        ekyoVar2.d += ekyhVar.c;
                                        ekyoVar2.a.add(ekyhVar);
                                    }
                                    i4++;
                                    b = 1;
                                    i3 = 0;
                                }
                                ekyoVar2.b = ekyd.c(ekxaVar);
                                ekxu.a(ekyoVar2.b);
                                ekyoVar2.c();
                                ekyoVar = ekyoVar2;
                            } else {
                                if (bA != 4) {
                                    throw new IOException(a.g(bA, "Unsupported S2Polygon encoding version "));
                                }
                                byte bA3 = ekxaVar.a();
                                if (bA3 > 30 || bA3 < 0) {
                                    throw new IOException(a.g(bA3, "Invalid level "));
                                }
                                int iD = ekxaVar.d();
                                if (iD < 0) {
                                    throw new IOException(a.g(iD, "Can only decode polygons with up to 2^31 - 1 loops. Got "));
                                }
                                ekyoVar = new ekyo();
                                ekyoVar.c.d();
                                while (i3 < iD) {
                                    int iD2 = ekxaVar.d();
                                    if (iD2 < 0) {
                                        throw new IOException(a.e(iD2, "Invalid numVertices: ", ". Loops with more than 2^31 - 1 vertices are not supported."));
                                    }
                                    List listA = ekyn.a(iD2, bA3, ekxaVar);
                                    obj2 = obj4;
                                    str = str3;
                                    try {
                                        long jE = ekxaVar.e();
                                        Iterator it3 = it2;
                                        int iD3 = ekxaVar.d();
                                        ekyh ekyhVar2 = ekyg.a(ekyf.BOUND_ENCODED, jE) ? new ekyh(listA, ekyg.a(ekyf.ORIGIN_INSIDE, jE), ekyd.c(ekxaVar)) : new ekyh(listA);
                                        ekyhVar2.f = iD3;
                                        if (!ekyo.f(ekyhVar2)) {
                                            ekyoVar.a.add(ekyhVar2);
                                        }
                                        i3++;
                                        obj4 = obj2;
                                        str3 = str;
                                        it2 = it3;
                                    } catch (evtj e) {
                                        e = e;
                                        ((ekrd) ((ekrd) akfb.a.j()).g(e).h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/geofilter/GeofilterDbFetcherImpl$fetch$$inlined$withLegacyPropagatingContext$1", str, 48, "GeofilterDbFetcherImpl.kt")).q("Failed to fetch GeofilterDb proto");
                                        return obj2;
                                    }
                                }
                                it = it2;
                                obj3 = obj4;
                                str2 = str3;
                                ekyoVar.d();
                            }
                        } else {
                            it = it2;
                            obj3 = obj4;
                            str2 = str3;
                            ArrayList arrayList2 = new ArrayList(esxoVar.c.size());
                            for (esxq esxqVar : esxoVar.c) {
                                ArrayList arrayListD = ekjz.d(esxqVar.b.size());
                                for (esxm esxmVar : esxqVar.b) {
                                    arrayListD.add(ekyb.d(esxmVar.b, esxmVar.c).e());
                                }
                                arrayList2.add(new ekyh(arrayListD));
                            }
                            ekyoVar = new ekyo(arrayList2);
                        }
                        eupaVar = new eupa(euplVar.d, new eupc(ekyoVar));
                    } else {
                        it = it2;
                        obj3 = obj4;
                        str2 = str3;
                        if (i2 != 3) {
                            throw new UnsupportedOperationException("Unsupported geofilter type: ".concat(i2 != 0 ? i2 != 2 ? i2 != 3 ? "null" : "POSITIVE_S2_FILTER" : "POSITIVE_POLYGON_FILTER" : "POSITIVEFILTER_NOT_SET"));
                        }
                        eupk eupkVar = (eupk) euplVar.c;
                        int i6 = eupb.a;
                        ekxq ekxqVar = new ekxq();
                        evta evtaVar = eupkVar.b;
                        ekxqVar.a = new ArrayList(evtaVar.size());
                        Iterator<E> it4 = evtaVar.iterator();
                        while (it4.hasNext()) {
                            ekxqVar.a.add(new ekxp(((Long) it4.next()).longValue()));
                        }
                        ekxqVar.c();
                        eupaVar = new eupa(euplVar.d, new eupb(ekxqVar));
                    }
                    ekfwVar.h(eupaVar);
                    obj4 = obj3;
                    str3 = str2;
                    it2 = it;
                }
                return new eupd(ekfwVar.g());
            } catch (evtj e2) {
                e = e2;
                obj2 = obj4;
                str = str3;
            }
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        akfa akfaVar = new akfa(fcxyVar, this.a, this.b);
        akfaVar.c = obj;
        return akfaVar;
    }
}
