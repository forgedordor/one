package defpackage;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsm {
    public final List a = new ArrayList();
    private final erep b = erep.a;
    private boolean c = false;

    public final eqso a() throws GeneralSecurityException {
        int i;
        eqsn eqsnVar;
        ermk ermkVarG;
        if (this.c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.c = true;
        ermi ermiVar = (ermi) erml.a.createBuilder();
        List<eqsk> list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            eqsl eqslVar = ((eqsk) list.get(i2)).e;
            eqsl eqslVar2 = eqsl.a;
            if (eqslVar == eqslVar2 && ((eqsk) list.get(i3)).e != eqslVar2) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (eqsk eqskVar : list) {
            eqsi eqsiVar = eqskVar.b;
            eqsl eqslVar3 = eqskVar.e;
            if (eqslVar3 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (eqslVar3 == eqsl.a) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    Charset charset = ergh.a;
                    i = 0;
                    while (i == 0) {
                        byte[] bArrB = erfy.b(4);
                        i = (bArrB[3] & 255) | ((bArrB[0] & 255) << 24) | ((bArrB[1] & 255) << 16) | ((bArrB[2] & 255) << 8);
                    }
                }
            } else {
                i = eqslVar3.b;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(a.e(i, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            eqsg eqsgVar = eqskVar.c;
            if (eqsgVar != null) {
                eqsnVar = new eqsn(eqsgVar, eqsiVar, i, eqskVar.a);
                ermkVarG = eqso.g(eqsgVar, eqsiVar, i);
            } else {
                eqst eqstVar = eqskVar.d;
                eqsg eqsgVarA = eres.a.a(eqstVar, true != eqstVar.a() ? null : numValueOf);
                eqsnVar = new eqsn(eqsgVarA, eqsiVar, i, eqskVar.a);
                ermkVarG = eqso.g(eqsgVarA, eqsiVar, i);
            }
            ermiVar.a(ermkVarG);
            if (eqskVar.a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (eqsiVar != eqsi.a) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(eqsnVar);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        int iIntValue = num.intValue();
        ermiVar.copyOnWrite();
        ((erml) ermiVar.instance).b = iIntValue;
        erml ermlVar = (erml) ermiVar.build();
        eqso.i(ermlVar);
        return new eqso(ermlVar, arrayList, this.b);
    }

    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((eqsk) it.next()).a = false;
        }
    }

    public final void c(eqsk eqskVar) {
        if (eqskVar.f != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (eqskVar.a) {
            b();
        }
        eqskVar.f = this;
        this.a.add(eqskVar);
    }
}
