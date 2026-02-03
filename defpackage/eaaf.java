package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.internal.IPhenotypeService;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaaf implements eaaa {
    private final ddzn a;

    public eaaf(ddzn ddznVar) {
        ddznVar.getClass();
        this.a = ddznVar;
    }

    private static ListenableFuture k(defn defnVar) {
        return eooh.g(drgi.a(defnVar), dcff.class, new eooz() { // from class: eaae
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dcff dcffVar = (dcff) obj;
                throw new eaab(dcffVar.a(), dcffVar.getMessage(), dcffVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.eaaa
    public final ListenableFuture a(String str) {
        str.getClass();
        return k(this.a.b(str));
    }

    @Override // defpackage.eaaa
    public final ListenableFuture b(final dzzs dzzsVar) {
        dzzsVar.getClass();
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddzf
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = ddzn.a;
                ((IPhenotypeService) ((ddzx) obj).w()).commitToConfigurationV2(new ddzm((defr) obj2), dzzsVar.toByteArray());
            }
        };
        dcizVar.b = new Feature[]{ddym.a};
        dcizVar.b();
        dcja dcjaVarA = dcizVar.a();
        final ddzn ddznVar = this.a;
        return k(ddznVar.j(dcjaVarA).e(eoqg.a, new deeq() { // from class: ddze
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                boolean z = defnVar.h() instanceof dcgc;
                ddzn ddznVar2 = ddznVar;
                dzzs dzzsVar2 = dzzsVar;
                if (z) {
                    return ddznVar2.b(dzzsVar2.c);
                }
                if (!(defnVar.h() instanceof dcff)) {
                    return defnVar;
                }
                dcff dcffVar = (dcff) defnVar.h();
                dcffVar.getClass();
                return dcffVar.a() == 29514 ? ddznVar2.b(dzzsVar2.c) : defnVar;
            }
        }));
    }

    @Override // defpackage.eaaa
    public final ListenableFuture c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return k(this.a.o(str, str2).c(eoqg.a, new deeq() { // from class: eaac
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                int i;
                dzzz dzzzVar;
                int i2;
                Configurations configurations = (Configurations) defnVar.i();
                dzzt dzztVar = (dzzt) dzzu.a.createBuilder();
                String str3 = configurations.a;
                dzztVar.copyOnWrite();
                dzzu dzzuVar = (dzzu) dzztVar.instance;
                str3.getClass();
                int i3 = 1;
                dzzuVar.b |= 1;
                dzzuVar.c = str3;
                String str4 = configurations.c;
                dzztVar.copyOnWrite();
                dzzu dzzuVar2 = (dzzu) dzztVar.instance;
                str4.getClass();
                dzzuVar2.b |= 4;
                dzzuVar2.e = str4;
                boolean z = configurations.f;
                dzztVar.copyOnWrite();
                dzzu dzzuVar3 = (dzzu) dzztVar.instance;
                dzzuVar3.b |= 8;
                dzzuVar3.h = z;
                long j = configurations.g;
                dzztVar.copyOnWrite();
                dzzu dzzuVar4 = (dzzu) dzztVar.instance;
                dzzuVar4.b |= 16;
                dzzuVar4.i = j;
                byte[] bArr = configurations.b;
                if (bArr != null) {
                    evqs evqsVarX = evqs.x(bArr);
                    dzztVar.copyOnWrite();
                    dzzu dzzuVar5 = (dzzu) dzztVar.instance;
                    dzzuVar5.b |= 2;
                    dzzuVar5.d = evqsVarX;
                }
                Configuration[] configurationArr = configurations.d;
                int length = configurationArr.length;
                int i4 = 0;
                while (i4 < length) {
                    Configuration configuration = configurationArr[i4];
                    Flag[] flagArr = configuration.b;
                    int length2 = flagArr.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        Flag flag = flagArr[i5];
                        int i6 = flag.g;
                        if (i6 != i3) {
                            if (i6 == 2) {
                                i2 = i3;
                                dzzx dzzxVar = (dzzx) dzzz.a.createBuilder();
                                String str5 = flag.a;
                                dzzxVar.copyOnWrite();
                                dzzz dzzzVar2 = (dzzz) dzzxVar.instance;
                                str5.getClass();
                                dzzzVar2.b |= 1;
                                dzzzVar2.e = str5;
                                boolean zE = flag.e();
                                dzzxVar.copyOnWrite();
                                dzzz dzzzVar3 = (dzzz) dzzxVar.instance;
                                dzzzVar3.c = 2;
                                dzzzVar3.d = Boolean.valueOf(zE);
                                dzzzVar = (dzzz) dzzxVar.build();
                            } else if (i6 == 3) {
                                i2 = i3;
                                dzzx dzzxVar2 = (dzzx) dzzz.a.createBuilder();
                                String str6 = flag.a;
                                dzzxVar2.copyOnWrite();
                                dzzz dzzzVar4 = (dzzz) dzzxVar2.instance;
                                str6.getClass();
                                dzzzVar4.b |= 1;
                                dzzzVar4.e = str6;
                                double dA = flag.a();
                                dzzxVar2.copyOnWrite();
                                dzzz dzzzVar5 = (dzzz) dzzxVar2.instance;
                                dzzzVar5.c = 3;
                                dzzzVar5.d = Double.valueOf(dA);
                                dzzzVar = (dzzz) dzzxVar2.build();
                            } else if (i6 == 4) {
                                i2 = i3;
                                dzzx dzzxVar3 = (dzzx) dzzz.a.createBuilder();
                                String str7 = flag.a;
                                dzzxVar3.copyOnWrite();
                                dzzz dzzzVar6 = (dzzz) dzzxVar3.instance;
                                str7.getClass();
                                dzzzVar6.b |= 1;
                                dzzzVar6.e = str7;
                                String strC = flag.c();
                                dzzxVar3.copyOnWrite();
                                dzzz dzzzVar7 = (dzzz) dzzxVar3.instance;
                                dzzzVar7.c = 4;
                                dzzzVar7.d = strC;
                                dzzzVar = (dzzz) dzzxVar3.build();
                            } else {
                                if (i6 != 5) {
                                    throw new IllegalArgumentException(a.g(i6, "Unrecognized flag type: "));
                                }
                                dzzx dzzxVar4 = (dzzx) dzzz.a.createBuilder();
                                String str8 = flag.a;
                                dzzxVar4.copyOnWrite();
                                dzzz dzzzVar8 = (dzzz) dzzxVar4.instance;
                                str8.getClass();
                                i2 = i3;
                                dzzzVar8.b |= 1;
                                dzzzVar8.e = str8;
                                evqs evqsVarX2 = evqs.x(flag.f());
                                dzzxVar4.copyOnWrite();
                                dzzz dzzzVar9 = (dzzz) dzzxVar4.instance;
                                dzzzVar9.c = 5;
                                dzzzVar9.d = evqsVarX2;
                                dzzzVar = (dzzz) dzzxVar4.build();
                            }
                            i = i2;
                        } else {
                            int i7 = i3;
                            dzzx dzzxVar5 = (dzzx) dzzz.a.createBuilder();
                            String str9 = flag.a;
                            dzzxVar5.copyOnWrite();
                            dzzz dzzzVar10 = (dzzz) dzzxVar5.instance;
                            str9.getClass();
                            dzzzVar10.b |= 1;
                            dzzzVar10.e = str9;
                            long jB = flag.b();
                            dzzxVar5.copyOnWrite();
                            dzzz dzzzVar11 = (dzzz) dzzxVar5.instance;
                            i = i7;
                            dzzzVar11.c = i;
                            dzzzVar11.d = Long.valueOf(jB);
                            dzzzVar = (dzzz) dzzxVar5.build();
                        }
                        dzztVar.copyOnWrite();
                        dzzu dzzuVar6 = (dzzu) dzztVar.instance;
                        dzzzVar.getClass();
                        evtg evtgVar = dzzuVar6.f;
                        if (!evtgVar.c()) {
                            dzzuVar6.f = evsn.mutableCopy(evtgVar);
                        }
                        dzzuVar6.f.add(dzzzVar);
                        i5++;
                        i3 = i;
                    }
                    int i8 = i3;
                    String[] strArr = configuration.c;
                    if (strArr != null) {
                        for (String str10 : strArr) {
                            dzztVar.copyOnWrite();
                            dzzu dzzuVar7 = (dzzu) dzztVar.instance;
                            str10.getClass();
                            evtg evtgVar2 = dzzuVar7.g;
                            if (!evtgVar2.c()) {
                                dzzuVar7.g = evsn.mutableCopy(evtgVar2);
                            }
                            dzzuVar7.g.add(str10);
                        }
                    }
                    i4++;
                    i3 = i8;
                }
                return (dzzu) dzztVar.build();
            }
        }));
    }

    @Override // defpackage.eaaa
    public final ListenableFuture d(final String str) {
        str.getClass();
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddyv
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = ddzn.a;
                ((IPhenotypeService) ((ddzx) obj).w()).getExperimentsForLogging(new ddzm((defr) obj2), str, null);
            }
        };
        return k(this.a.j(dcizVar.a()).c(eoqg.a, new deeq() { // from class: eaad
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                ExperimentTokens experimentTokens = (ExperimentTokens) defnVar.i();
                dzzv dzzvVar = (dzzv) dzzw.a.createBuilder();
                String str2 = experimentTokens.b;
                dzzvVar.copyOnWrite();
                dzzw dzzwVar = (dzzw) dzzvVar.instance;
                str2.getClass();
                dzzwVar.b |= 1;
                dzzwVar.c = str2;
                byte[] bArr = experimentTokens.c;
                if (bArr != null) {
                    dzzvVar.a(evqs.x(bArr));
                }
                byte[][] bArr2 = experimentTokens.i;
                if (bArr2 != null) {
                    for (byte[] bArr3 : bArr2) {
                        if (bArr3 != null) {
                            dzzvVar.a(evqs.x(bArr3));
                        }
                    }
                }
                byte[][] bArr4 = experimentTokens.d;
                if (bArr4 != null) {
                    for (byte[] bArr5 : bArr4) {
                        evqs evqsVarX = evqs.x(bArr5);
                        dzzvVar.copyOnWrite();
                        dzzw dzzwVar2 = (dzzw) dzzvVar.instance;
                        evtg evtgVar = dzzwVar2.e;
                        if (!evtgVar.c()) {
                            dzzwVar2.e = evsn.mutableCopy(evtgVar);
                        }
                        dzzwVar2.e.add(evqsVarX);
                    }
                }
                byte[][] bArr6 = experimentTokens.e;
                if (bArr6 != null) {
                    for (byte[] bArr7 : bArr6) {
                        evqs evqsVarX2 = evqs.x(bArr7);
                        dzzvVar.copyOnWrite();
                        dzzw dzzwVar3 = (dzzw) dzzvVar.instance;
                        evtg evtgVar2 = dzzwVar3.f;
                        if (!evtgVar2.c()) {
                            dzzwVar3.f = evsn.mutableCopy(evtgVar2);
                        }
                        dzzwVar3.f.add(evqsVarX2);
                    }
                }
                byte[][] bArr8 = experimentTokens.f;
                if (bArr8 != null) {
                    for (byte[] bArr9 : bArr8) {
                        evqs evqsVarX3 = evqs.x(bArr9);
                        dzzvVar.copyOnWrite();
                        dzzw dzzwVar4 = (dzzw) dzzvVar.instance;
                        evtg evtgVar3 = dzzwVar4.g;
                        if (!evtgVar3.c()) {
                            dzzwVar4.g = evsn.mutableCopy(evtgVar3);
                        }
                        dzzwVar4.g.add(evqsVarX3);
                    }
                }
                byte[][] bArr10 = experimentTokens.g;
                if (bArr10 != null) {
                    for (byte[] bArr11 : bArr10) {
                        evqs evqsVarX4 = evqs.x(bArr11);
                        dzzvVar.copyOnWrite();
                        dzzw dzzwVar5 = (dzzw) dzzvVar.instance;
                        evtg evtgVar4 = dzzwVar5.h;
                        if (!evtgVar4.c()) {
                            dzzwVar5.h = evsn.mutableCopy(evtgVar4);
                        }
                        dzzwVar5.h.add(evqsVarX4);
                    }
                }
                int[] iArr = experimentTokens.h;
                if (iArr != null) {
                    for (int i : iArr) {
                        dzzvVar.copyOnWrite();
                        dzzw dzzwVar6 = (dzzw) dzzvVar.instance;
                        evsx evsxVar = dzzwVar6.i;
                        if (!evsxVar.c()) {
                            dzzwVar6.i = evsn.mutableCopy(evsxVar);
                        }
                        dzzwVar6.i.h(i);
                    }
                }
                return (dzzw) dzzvVar.build();
            }
        }));
    }

    @Override // defpackage.eaaa
    public final ListenableFuture e() {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: ddyt
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = ddzn.a;
                ((IPhenotypeService) ((ddzx) obj).w()).getStorageInfo(new ddzj((defr) obj2));
            }
        };
        dcizVar.b = new Feature[]{ddym.i};
        dcizVar.b();
        return k(this.a.j(dcizVar.a()));
    }

    @Override // defpackage.eaaa
    public final ListenableFuture f(String str, int i, String[] strArr, byte[] bArr) {
        str.getClass();
        strArr.getClass();
        return k(this.a.c(str, i, strArr, bArr));
    }

    @Override // defpackage.eaaa
    public final ListenableFuture g(String str, eryf eryfVar) {
        return k(this.a.d(str, eryfVar));
    }

    @Override // defpackage.eaaa
    public final ListenableFuture h(final String str, eryf eryfVar, final byte[] bArr) {
        final ddzn ddznVar = this.a;
        return k(ddznVar.d(str, eryfVar).e(eoqg.a, new deeq() { // from class: ddyx
            @Override // defpackage.deeq
            public final Object a(defn defnVar) {
                if (defnVar.m()) {
                    return defnVar;
                }
                ddzn ddznVar2 = ddznVar;
                if (!ddznVar2.e(11925000)) {
                    return ddzn.a();
                }
                final byte[] bArr2 = bArr;
                final String str2 = str;
                dciz dcizVar = new dciz();
                dcizVar.a = new dcir() { // from class: ddyw
                    @Override // defpackage.dcir
                    public final void a(Object obj, Object obj2) {
                        int i = ddzn.a;
                        ((IPhenotypeService) ((ddzx) obj).w()).setAppSpecificProperties(new ddzm((defr) obj2), str2, bArr2);
                    }
                };
                return ddznVar2.j(dcizVar.a());
            }
        }));
    }

    @Override // defpackage.eaaa
    public final boolean i() {
        return this.a.e(12200000);
    }

    @Override // defpackage.eaaa
    public final ListenableFuture j(eaeb eaebVar) throws Throwable {
        final String str;
        String simpleName = ddzx.class.getSimpleName();
        ddzn ddznVar = this.a;
        final dcib dcibVarG = ddznVar.g(eaebVar, simpleName);
        String strA = dcnj.a();
        if (strA == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = strA + "|" + System.identityHashCode(ddzx.class);
        }
        dcir dcirVar = new dcir() { // from class: ddyy
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = ddzn.a;
                ((IPhenotypeService) ((ddzx) obj).w()).registerFlagUpdateListener(str, new ddzl(dcibVarG));
            }
        };
        dcir dcirVar2 = new dcir() { // from class: ddyz
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = ddzn.a;
            }
        };
        dcip dcipVar = new dcip();
        dcipVar.c = dcibVarG;
        dcipVar.a = dcirVar;
        dcipVar.b = dcirVar2;
        dcipVar.d = new Feature[]{ddym.d};
        dcipVar.b();
        return k(ddznVar.k(dcipVar.a()));
    }
}
