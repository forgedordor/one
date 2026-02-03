package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafu {
    public final String a;
    public final ejxr b;
    final /* synthetic */ eafv c;

    public eafu(eafv eafvVar, String str, final int i, final int i2) {
        this.c = eafvVar;
        this.a = str;
        this.b = new eafr(new ejxr() { // from class: eaft
            @Override // defpackage.ejxr
            public final Object get() throws Resources.NotFoundException {
                eryg erygVar = (eryg) eryi.a.createBuilder();
                eafu eafuVar = this.a;
                int i3 = i;
                try {
                    eafv eafvVar2 = eafuVar.c;
                    Resources resourcesA = eafvVar2.a();
                    if (resourcesA == null) {
                        Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from " + eafuVar.c.a);
                        return null;
                    }
                    try {
                        eafuVar.a(erygVar, resourcesA, i3);
                        long jLongValue = ((Long) eafvVar2.b.get()).longValue();
                        erygVar.copyOnWrite();
                        eryi eryiVar = (eryi) erygVar.instance;
                        eryiVar.b |= 128;
                        eryiVar.l = jLongValue;
                        String strSubstring = eryiVar.g;
                        int iIndexOf = strSubstring.indexOf(35);
                        if (iIndexOf >= 0) {
                            strSubstring = strSubstring.substring(0, iIndexOf);
                        }
                        String str2 = eafuVar.a;
                        ejwl.p(strSubstring.equals(str2), "Resource package does not match expected package, expected package: %s", str2);
                        eryi eryiVar2 = (eryi) erygVar.instance;
                        String strQ = eryiVar2.g;
                        eafv eafvVar3 = eafuVar.c;
                        boolean z = eryiVar2.h;
                        if (strQ.isEmpty()) {
                            throw new IllegalArgumentException("Empty configuration package");
                        }
                        String str3 = eafvVar3.a;
                        if (z) {
                            if (strQ.indexOf(35) >= 0) {
                                throw new IllegalArgumentException(String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", "auto-subpackage", "configuration-package", '#', strQ));
                            }
                            strQ = a.q(str3, strQ, "#");
                        }
                        if (((eryi) erygVar.instance).c != 2) {
                            Integer num = (Integer) eafvVar3.c.get();
                            num.intValue();
                            erygVar.copyOnWrite();
                            eryi eryiVar3 = (eryi) erygVar.instance;
                            eryiVar3.c = 2;
                            eryiVar3.d = num;
                        }
                        int i4 = i2;
                        erygVar.copyOnWrite();
                        eryi eryiVar4 = (eryi) erygVar.instance;
                        strQ.getClass();
                        eryiVar4.b |= 1;
                        eryiVar4.g = strQ;
                        erygVar.copyOnWrite();
                        eryi eryiVar5 = (eryi) erygVar.instance;
                        str3.getClass();
                        eryiVar5.e = 7;
                        eryiVar5.f = str3;
                        erygVar.copyOnWrite();
                        eryi eryiVar6 = (eryi) erygVar.instance;
                        eryiVar6.k = 3;
                        eryiVar6.b |= 32;
                        if (i4 == 0) {
                            return (eryi) erygVar.build();
                        }
                        eafn eafnVar = (eafn) eafo.a.createBuilder();
                        try {
                            eafuVar.a(eafnVar, resourcesA, i4);
                            String str4 = ((eafo) eafnVar.instance).c;
                            String str5 = eafuVar.a;
                            ejwl.r(str4.equals(str5), "Package in HeterodyneInfo binary %s does not match resource lookup for %s", ((eafo) eafnVar.instance).c, str5);
                            eafnVar.copyOnWrite();
                            eafo eafoVar = (eafo) eafnVar.instance;
                            eafoVar.b &= -2;
                            eafoVar.c = eafo.a.c;
                            evqs byteString = ((eafo) eafnVar.build()).toByteString();
                            erygVar.copyOnWrite();
                            eryi eryiVar7 = (eryi) erygVar.instance;
                            eryiVar7.b |= 256;
                            eryiVar7.m = byteString;
                            return (eryi) erygVar.build();
                        } catch (IOException unused) {
                            Log.i("PhenotypeResourceReader", "Failed to read Phenotype HeterodyneInfo resources from ".concat(String.valueOf(eafuVar.c.a)));
                            return null;
                        }
                    } catch (IOException | NullPointerException unused2) {
                        Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from ".concat(String.valueOf(eafuVar.c.a)));
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from ".concat(String.valueOf(eafuVar.c.a)));
                }
            }
        });
    }

    public final void a(evug evugVar, Resources resources, int i) throws Resources.NotFoundException, IOException {
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        try {
            this.c.e.c++;
            evqz evqzVarN = evqz.N(inputStreamOpenRawResource, Math.max(512, Math.min(4096, inputStreamOpenRawResource.available())));
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            evugVar.mergeFrom(evqzVarN, evrr.a);
            if (inputStreamOpenRawResource != null) {
                inputStreamOpenRawResource.close();
            }
        } catch (Throwable th) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
