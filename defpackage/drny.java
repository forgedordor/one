package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drny implements droc {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/data/GlobalVariantsPreferences");
    public static volatile drny b;
    public final drod e;
    public final drnf f;
    public ListenableFuture h;
    public ListenableFuture i;
    public final AtomicReference c = new AtomicReference(droh.a);
    public final Map d = new ConcurrentHashMap();
    public final Executor g = drle.a().f;

    public drny(Context context) {
        this.f = drnf.e(context);
        this.e = new drmp(context);
    }

    public static drof f(droh drohVar) {
        return (drof) Collection.EL.stream(drohVar.b).filter(new Predicate() { // from class: drnu
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((drof) obj).b == 2;
            }
        }).findFirst().get();
    }

    public static drof i(droh drohVar) {
        return (drof) Collection.EL.stream(drohVar.b).filter(new Predicate() { // from class: drnw
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((drof) obj).b == 1;
            }
        }).findFirst().get();
    }

    public static droh j(drof drofVar, drof drofVar2, drof drofVar3) {
        drog drogVar = (drog) droh.a.createBuilder();
        if (drofVar != null) {
            drogVar.b(drofVar);
        }
        if (drofVar2 != null) {
            drogVar.b(drofVar2);
        }
        if (drofVar3 != null) {
            drogVar.b(drofVar3);
        }
        return (droh) drogVar.build();
    }

    public final drof a(String str) {
        int iA;
        drnf drnfVar = this.f;
        if (drnfVar.a(str) != drnz.SKINTONE_AND_GENDER_DIRECTIONAL || (iA = drmv.a(((drnfVar.c(drnfVar.d(str)).indexOf(str) / 6) % 2) + 1)) == 0) {
            return null;
        }
        droe droeVar = (droe) drof.a.createBuilder();
        droeVar.copyOnWrite();
        drof drofVar = (drof) droeVar.instance;
        drofVar.c = Integer.valueOf(iA - 1);
        drofVar.b = 3;
        return (drof) droeVar.build();
    }

    @Override // defpackage.droc
    public final ListenableFuture b() {
        return this.i;
    }

    @Override // defpackage.droc
    public final String c(String str) {
        drnf drnfVar = this.f;
        drnz drnzVarA = drnfVar.a(str);
        String strD = drnfVar.d(str);
        if (drnzVarA == null || ((droh) this.c.get()).equals(drnf.b)) {
            return null;
        }
        drof drofVarH = h();
        drof drofVarG = g();
        int iOrdinal = drnzVarA.ordinal();
        if (iOrdinal == 0) {
            if (drofVarH == null) {
                return null;
            }
            drog drogVar = (drog) droh.a.createBuilder();
            drogVar.b(drofVarH);
            return k(strD, (droh) drogVar.build());
        }
        if (iOrdinal == 1) {
            if (drofVarG == null) {
                return null;
            }
            drog drogVar2 = (drog) droh.a.createBuilder();
            drogVar2.b(drofVarG);
            return k(strD, (droh) drogVar2.build());
        }
        if (iOrdinal == 2) {
            if (drofVarG == null || drofVarH == null) {
                return null;
            }
            drog drogVar3 = (drog) droh.a.createBuilder();
            drogVar3.b(drofVarH);
            drogVar3.b(drofVarG);
            return k(strD, (droh) drogVar3.build());
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                return null;
            }
            return (String) this.d.get(drnfVar.d(str));
        }
        if (drofVarG == null || drofVarH == null) {
            return null;
        }
        return k(strD, j(drofVarH, drofVarG, a(str)));
    }

    @Override // defpackage.droc
    public final boolean d(String str) {
        drnf drnfVar;
        drnz drnzVarA;
        droh drohVarB;
        if (str.equals(c(str)) || (drnzVarA = (drnfVar = this.f).a(str)) == null || (drohVarB = drnfVar.b(str)) == null) {
            return false;
        }
        int iOrdinal = drnzVarA.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            this.d.put(drnfVar.d(str), str);
                        }
                    } else if (drohVarB.b.size() == 3 && ekis.q(drohVarB.b, new drns()) && ekis.q(drohVarB.b, new drnt())) {
                        this.c.set(j(i(drohVarB), f(drohVarB), null));
                    }
                } else if (drohVarB.b.size() == 2 && ekis.q(drohVarB.b, new drns()) && ekis.q(drohVarB.b, new drnt())) {
                    this.c.set(drohVarB);
                }
            } else if (drohVarB.b.size() == 1 && ekis.q(drohVarB.b, new drns())) {
                this.c.set(j(h(), f(drohVarB), null));
            }
        } else if (drohVarB.b.size() == 1 && ekis.q(drohVarB.b, new drnt())) {
            this.c.set(j(i(drohVarB), g(), null));
        }
        drod drodVar = this.e;
        drnp drnpVar = (drnp) drnr.a.createBuilder();
        droh drohVar = (droh) this.c.get();
        drnpVar.copyOnWrite();
        drnr drnrVar = (drnr) drnpVar.instance;
        drohVar.getClass();
        drnrVar.c = drohVar;
        drnrVar.b |= 1;
        drnpVar.a(this.d);
        ((drmp) drodVar).a((drnr) drnpVar.build());
        return true;
    }

    @Override // defpackage.droc
    public final int e() {
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final drof g() {
        ekgb ekgbVarN = ekgb.n(((droh) this.c.get()).b);
        int iA = ekis.a(ekgbVarN, new drns());
        if (iA < 0) {
            return null;
        }
        return (drof) ekgbVarN.get(iA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final drof h() {
        ekgb ekgbVarN = ekgb.n(((droh) this.c.get()).b);
        int iA = ekis.a(ekgbVarN, new drnt());
        if (iA < 0) {
            return null;
        }
        return (drof) ekgbVarN.get(iA);
    }

    public final String k(String str, droh drohVar) {
        drnf drnfVar = this.f;
        drnb drnbVar = (drnb) ((ekgp) drnfVar.g.get()).get(drnfVar.d(str));
        return drnbVar == null ? str : (String) drnbVar.a.getOrDefault(drohVar, str);
    }
}
