package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejon implements ejop {
    private final int a;

    public ejon(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ejop
    public final ArrayList a(ezcy ezcyVar, Locale locale) {
        ArrayList arrayList = new ArrayList();
        ezdx ezdxVar = ezcyVar.f;
        if (ezdxVar == null) {
            ezdxVar = ezdx.a;
        }
        HashSet hashSet = new HashSet();
        for (int i = 1; i <= Math.min(ezdxVar.b.size(), this.a); i++) {
            ezdv ezdvVar = (ezdv) ezdxVar.b.get(ezdxVar.b.size() - i);
            if (ezdvVar.g.size() > 0) {
                for (ezgi ezgiVar : ezdvVar.g) {
                    ezgg ezggVar = ezgiVar.e;
                    if (ezggVar == null) {
                        ezggVar = ezgg.b;
                    }
                    ezai ezaiVarB = ezai.b(ezggVar.d);
                    if (ezaiVarB == null) {
                        ezaiVarB = ezai.UNRECOGNIZED;
                    }
                    if (ezaiVarB == ezai.CLICKED) {
                        ezgg ezggVar2 = ezgiVar.e;
                        if (ezggVar2 == null) {
                            ezggVar2 = ezgg.b;
                        }
                        hashSet.add(ezggVar2.k);
                    }
                    if (ezgiVar.c == 19) {
                        ezgg ezggVar3 = ezgiVar.e;
                        if (ezggVar3 == null) {
                            ezggVar3 = ezgg.b;
                        }
                        if (!hashSet.contains(ezggVar3.k)) {
                            ezgg ezggVar4 = ezgiVar.e;
                            if (ezggVar4 == null) {
                                ezggVar4 = ezgg.b;
                            }
                            ezal ezalVarB = ezal.b(ezggVar4.g);
                            if (ezalVarB == null) {
                                ezalVarB = ezal.UNRECOGNIZED;
                            }
                            ezal ezalVar = ezal.STICKY_PROVIDER;
                            if (ezalVarB != ezalVar) {
                                ezgh ezghVar = (ezgh) ezgiVar.toBuilder();
                                ezgg ezggVar5 = ezgiVar.e;
                                if (ezggVar5 == null) {
                                    ezggVar5 = ezgg.b;
                                }
                                ezgf ezgfVar = (ezgf) ezggVar5.toBuilder();
                                ezgfVar.copyOnWrite();
                                ((ezgg) ezgfVar.instance).g = ezalVar.a();
                                ezgg ezggVar6 = (ezgg) ezgfVar.build();
                                ezghVar.copyOnWrite();
                                ezgi ezgiVar2 = (ezgi) ezghVar.instance;
                                ezggVar6.getClass();
                                ezgiVar2.e = ezggVar6;
                                ezgiVar2.b |= 1;
                                arrayList.add((ezgi) ezghVar.build());
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.ejop
    public final /* synthetic */ void b() {
    }
}
