package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqso implements erej {
    public final erml a;
    private final List b;
    private final erep c;

    public eqso(erml ermlVar, List list, erep erepVar) throws GeneralSecurityException {
        this.a = ermlVar;
        this.b = list;
        this.c = erepVar;
        if (eqyz.a.a()) {
            HashSet hashSet = new HashSet();
            for (ermk ermkVar : ermlVar.c) {
                if (hashSet.contains(Integer.valueOf(ermkVar.e))) {
                    throw new GeneralSecurityException("KeyID " + ermkVar.e + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
                hashSet.add(Integer.valueOf(ermkVar.e));
            }
            if (!hashSet.contains(Integer.valueOf(ermlVar.b))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    public static final eqso d(erml ermlVar) throws GeneralSecurityException {
        i(ermlVar);
        return new eqso(ermlVar, l(ermlVar), erep.a);
    }

    @Deprecated
    public static final eqso f(byte[] bArr) throws GeneralSecurityException {
        try {
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            erml ermlVar = (erml) evsn.parseFrom(erml.a, bArr, evrr.a);
            j(ermlVar);
            return d(ermlVar);
        } catch (evtj unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static ermk g(eqsg eqsgVar, eqsi eqsiVar, int i) throws GeneralSecurityException {
        int i2;
        erfv erfvVar = (erfv) erfb.a.c(eqsgVar, erfv.class, eqsy.a);
        Integer num = erfvVar.e;
        if (num != null && num.intValue() != i) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (eqsi.a.equals(eqsiVar)) {
            i2 = 3;
        } else if (eqsi.b.equals(eqsiVar)) {
            i2 = 4;
        } else {
            if (!eqsi.c.equals(eqsiVar)) {
                throw new IllegalStateException("Unknown key status");
            }
            i2 = 5;
        }
        ermj ermjVar = (ermj) ermk.a.createBuilder();
        ermc ermcVar = (ermc) erme.a.createBuilder();
        String str = erfvVar.a;
        ermcVar.copyOnWrite();
        erme ermeVar = (erme) ermcVar.instance;
        str.getClass();
        ermeVar.b = str;
        evqs evqsVar = erfvVar.c;
        ermcVar.copyOnWrite();
        erme ermeVar2 = (erme) ermcVar.instance;
        evqsVar.getClass();
        ermeVar2.c = evqsVar;
        int i3 = erfvVar.f;
        ermcVar.copyOnWrite();
        ((erme) ermcVar.instance).d = ermd.a(i3);
        ermjVar.copyOnWrite();
        ermk ermkVar = (ermk) ermjVar.instance;
        erme ermeVar3 = (erme) ermcVar.build();
        ermeVar3.getClass();
        ermkVar.c = ermeVar3;
        ermkVar.b |= 1;
        ermjVar.copyOnWrite();
        ((ermk) ermjVar.instance).d = ermf.a(i2);
        ermjVar.copyOnWrite();
        ((ermk) ermjVar.instance).e = i;
        ermy ermyVar = erfvVar.d;
        ermjVar.copyOnWrite();
        ((ermk) ermjVar.instance).f = ermyVar.a();
        return (ermk) ermjVar.build();
    }

    public static void i(erml ermlVar) throws GeneralSecurityException {
        if (ermlVar == null || ermlVar.c.size() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(defpackage.erml r6) throws java.security.GeneralSecurityException {
        /*
            evtg r6 = r6.c
            java.util.Iterator r6 = r6.iterator()
        L6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r6.next()
            ermk r0 = (defpackage.ermk) r0
            erme r1 = r0.c
            if (r1 != 0) goto L18
            erme r1 = defpackage.erme.a
        L18:
            int r1 = r1.d
            int r1 = defpackage.ermd.b(r1)
            r2 = 4
            r3 = 3
            r4 = 2
            if (r1 != 0) goto L24
            goto L26
        L24:
            if (r1 == r4) goto L47
        L26:
            erme r1 = r0.c
            if (r1 != 0) goto L2d
            erme r5 = defpackage.erme.a
            goto L2e
        L2d:
            r5 = r1
        L2e:
            int r5 = r5.d
            int r5 = defpackage.ermd.b(r5)
            if (r5 != 0) goto L37
            goto L39
        L37:
            if (r5 == r3) goto L47
        L39:
            if (r1 != 0) goto L3d
            erme r1 = defpackage.erme.a
        L3d:
            int r1 = r1.d
            int r1 = defpackage.ermd.b(r1)
            if (r1 == 0) goto L6
            if (r1 != r2) goto L6
        L47:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            erme r0 = r0.c
            if (r0 != 0) goto L50
            erme r1 = defpackage.erme.a
            goto L51
        L50:
            r1 = r0
        L51:
            int r1 = r1.d
            int r1 = defpackage.ermd.b(r1)
            if (r1 != 0) goto L5a
            goto L66
        L5a:
            if (r1 == r4) goto L75
            if (r1 == r3) goto L72
            if (r1 == r2) goto L6f
            r2 = 5
            if (r1 == r2) goto L6c
            r2 = 6
            if (r1 == r2) goto L69
        L66:
            java.lang.String r1 = "UNRECOGNIZED"
            goto L77
        L69:
            java.lang.String r1 = "REMOTE"
            goto L77
        L6c:
            java.lang.String r1 = "ASYMMETRIC_PUBLIC"
            goto L77
        L6f:
            java.lang.String r1 = "ASYMMETRIC_PRIVATE"
            goto L77
        L72:
            java.lang.String r1 = "SYMMETRIC"
            goto L77
        L75:
            java.lang.String r1 = "UNKNOWN_KEYMATERIAL"
        L77:
            if (r0 != 0) goto L7b
            erme r0 = defpackage.erme.a
        L7b:
            java.lang.String r0 = r0.b
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r6.<init>(r0)
            throw r6
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqso.j(erml):void");
    }

    private static eqsg k(ermk ermkVar) throws GeneralSecurityException {
        int i = ermkVar.e;
        ermy ermyVarB = ermy.b(ermkVar.f);
        if (ermyVarB == null) {
            ermyVarB = ermy.UNRECOGNIZED;
        }
        Integer numValueOf = ermyVarB == ermy.RAW ? null : Integer.valueOf(i);
        erme ermeVar = ermkVar.c;
        if (ermeVar == null) {
            ermeVar = erme.a;
        }
        String str = ermeVar.b;
        erme ermeVar2 = ermkVar.c;
        evqs evqsVar = (ermeVar2 == null ? erme.a : ermeVar2).c;
        if (ermeVar2 == null) {
            ermeVar2 = erme.a;
        }
        int iB = ermd.b(ermeVar2.d);
        if (iB == 0) {
            iB = 1;
        }
        ermy ermyVarB2 = ermy.b(ermkVar.f);
        if (ermyVarB2 == null) {
            ermyVarB2 = ermy.UNRECOGNIZED;
        }
        erfv erfvVarA = erfv.a(str, evqsVar, iB, ermyVarB2, numValueOf);
        erfb erfbVar = erfb.a;
        return !((erge) erfbVar.b.get()).b.containsKey(new ergc(erfvVarA.getClass(), erfvVarA.b)) ? new eren(erfvVarA) : erfbVar.a(erfvVarA, eqsy.a);
    }

    private static List l(erml ermlVar) throws GeneralSecurityException {
        ArrayList arrayList = new ArrayList(ermlVar.c.size());
        for (ermk ermkVar : ermlVar.c) {
            int i = ermkVar.e;
            try {
                eqsg eqsgVarK = k(ermkVar);
                int iB = ermf.b(ermkVar.d);
                boolean z = true;
                if (iB == 0) {
                    iB = 1;
                }
                eqsi eqsiVarM = m(iB);
                if (i != ermlVar.b) {
                    z = false;
                }
                arrayList.add(new eqsn(eqsgVarK, eqsiVarM, i, z));
            } catch (GeneralSecurityException e) {
                if (eqyz.a.a()) {
                    throw new GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e);
                }
                arrayList.add(null);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static eqsi m(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return eqsi.a;
        }
        if (i2 == 2) {
            return eqsi.b;
        }
        if (i2 == 3) {
            return eqsi.c;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    @Override // defpackage.erej
    public final int a() {
        return this.b.size();
    }

    public final eqsn b(int i) {
        if (i >= 0 && i < a()) {
            List list = this.b;
            if (list.get(i) != null) {
                return (eqsn) list.get(i);
            }
            throw new IllegalStateException(a.e(i, "Keyset-Entry at position ", " has wrong status or key parsing failed"));
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + " for keyset of size " + a());
    }

    public final eqsn c() {
        for (eqsn eqsnVar : this.b) {
            if (eqsnVar != null && eqsnVar.d) {
                if (eqsnVar.b == eqsi.a) {
                    return eqsnVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eqso e() throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqso.e():eqso");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(eqsc eqscVar, Class cls) throws GeneralSecurityException {
        if (!(eqscVar instanceof ereb)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        erml ermlVar = this.a;
        int i = eqtb.a;
        int i2 = ermlVar.b;
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        for (ermk ermkVar : ermlVar.c) {
            int i4 = ermkVar.d;
            int iB = ermf.b(i4);
            if (iB != 0 && iB == 3) {
                if ((ermkVar.b & 1) == 0) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(ermkVar.e)));
                }
                ermy ermyVarB = ermy.b(ermkVar.f);
                if (ermyVarB == null) {
                    ermyVarB = ermy.UNRECOGNIZED;
                }
                if (ermyVarB == ermy.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(ermkVar.e)));
                }
                int iB2 = ermf.b(i4);
                if (iB2 != 0 && iB2 == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(ermkVar.e)));
                }
                if (ermkVar.e == i2) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                erme ermeVar = ermkVar.c;
                if (ermeVar == null) {
                    ermeVar = erme.a;
                }
                int iB3 = ermd.b(ermeVar.d);
                z2 &= iB3 != 0 && iB3 == 5;
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i5 = 0; i5 < a(); i5++) {
            if (this.b.get(i5) == null) {
                erme ermeVar2 = ((ermk) ermlVar.c.get(i5)).c;
                if (ermeVar2 == null) {
                    ermeVar2 = erme.a;
                }
                throw new GeneralSecurityException("Key parsing of key with index " + i5 + " and type_url " + ermeVar2.b + " failed, unable to get primitive");
            }
        }
        return ((ereb) eqscVar).a(this, this.c, cls);
    }

    public final String toString() {
        return eqtb.a(this.a).toString();
    }
}
