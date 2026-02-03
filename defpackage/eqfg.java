package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqfg implements eqfk {
    private static final Set a = fcwm.d(felm.PHONE_NUMBER, felm.GAIA_ID);
    private final eqfa b;
    private final eqei c;
    private final boolean d;
    private final eqfv e;

    public eqfg(eqfa eqfaVar, eqei eqeiVar, boolean z, eqfv eqfvVar) {
        eqeiVar.getClass();
        this.b = eqfaVar;
        this.c = eqeiVar;
        this.d = z;
        this.e = eqfvVar;
    }

    private final Object d(ezrp ezrpVar, ezol ezolVar, Instant instant, int i, eqfu eqfuVar, fcxy fcxyVar) throws eqfm {
        String str;
        String str2;
        if (ezrpVar.e.size() == 0) {
            throw new eqfm(i, "Received notification for creation of an empty group.");
        }
        ejvj ejvjVarFH = new eqgq().fH();
        felk felkVarB = felk.b(ezrpVar.f);
        if (felkVarB == null) {
            felkVarB = felk.UNRECOGNIZED;
        }
        Object objFM = ejvjVarFH.fM(felkVarB);
        objFM.getClass();
        eqef eqefVar = (eqef) objFM;
        eqdc eqdcVar = new eqdc();
        ezol ezolVar2 = ezrpVar.c;
        if (ezolVar2 == null) {
            ezolVar2 = ezol.a;
        }
        ezolVar2.getClass();
        eqdcVar.c(ezolVar2);
        try {
            URI uriCreate = URI.create(ezrpVar.g);
            uriCreate.getClass();
            eqdcVar.b(uriCreate);
        } catch (IllegalArgumentException unused) {
            eqej eqejVarD = new eqeg().d();
            ((eqeg) eqejVarD).a = "Failed to parse group conference URI.";
            cmyu.a(eqejVarD.a());
        }
        ezoz ezozVarA = eyms.a(ezrpVar);
        if (ezozVarA == null || (str = ezozVarA.b) == null) {
            str = "";
        }
        String str3 = str;
        ezoz ezozVarA2 = eyms.a(ezrpVar);
        eqdp eqdpVar = (ezozVarA2 == null || (str2 = ezozVarA2.c) == null) ? eqdp.a : new eqdp(str2);
        ezoz ezozVar = ezrpVar.d;
        if (ezozVar == null) {
            ezozVar = ezoz.a;
        }
        ezozVar.getClass();
        String str4 = ezozVar.e;
        str4.getClass();
        eqdw eqdwVarA = eqdt.a(str4);
        ezoz ezozVar2 = ezrpVar.d;
        if (ezozVar2 == null) {
            ezozVar2 = ezoz.a;
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(ezozVar2.g);
        mapUnmodifiableMap.getClass();
        eqed eqedVar = new eqed(str3, eqefVar, mapUnmodifiableMap, eqdpVar, eqdwVarA);
        ezse ezseVar = ezrpVar.h;
        if (ezseVar == null) {
            ezseVar = ezse.a;
        }
        ezseVar.getClass();
        eqdo eqdoVarA = eqft.a(ezseVar);
        if (!eqefVar.a(eqdoVarA)) {
            throw new eqfm(i, "Received incompatible group type and group features.");
        }
        ejvj ejvjVarFH2 = new eqgp(eqefVar).fH();
        try {
            evtg evtgVar = ezrpVar.e;
            evtgVar.getClass();
            ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
            Iterator<E> it = evtgVar.iterator();
            while (it.hasNext()) {
                Object objFM2 = ejvjVarFH2.fM((ezrs) it.next());
                objFM2.getClass();
                arrayList.add((eqea) objFM2);
            }
            fcti fctiVar = new fcti(new eqds(eqdcVar.a(), eqedVar, eqdoVarA, ekfv.f(arrayList)), e(ezolVar, i));
            Object objG = this.b.g((eqds) fctiVar.a, (ezol) fctiVar.b, instant, eqfuVar, fcxyVar);
            return objG == fcyl.a ? objG : fctx.a;
        } catch (IllegalStateException e) {
            throw new eqfm(i, "Received notification with incompatible group type and member role.", e);
        }
    }

    private static final ezol e(ezol ezolVar, int i) {
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        felmVarB.getClass();
        if (a.contains(felmVarB)) {
            return ezolVar;
        }
        eqej eqejVarC = new eqeg().c();
        ((eqeg) eqejVarC).a = "Handling unsupported requester ID type, " + felmVarB.a() + " as an empty group updater for GroupMessage of type " + ezjc.b(i);
        cmyu.a(eqejVarC.a());
        return null;
    }

    @Override // defpackage.eqfk
    public final Iterable a() {
        return fcva.b(ezji.GROUP);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.eqfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ezjj r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqfg.b(ezjj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01da, code lost:
    
        if (r1 != r11) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x024d, code lost:
    
        if (r1 != r11) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0328, code lost:
    
        if (r1 != r11) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0376, code lost:
    
        if (r1 != r11) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x037b, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0132, code lost:
    
        if (r1 == r11) goto L231;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ezjj r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqfg.c(ezjj, fcxy):java.lang.Object");
    }
}
