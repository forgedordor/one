package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Random;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejlu {
    public static final ekrg a = ekrg.c("com/google/chat/smartmessaging/smartreply/android/emotivecontentproviders/StickerProvider");
    public final ekgp b;
    public ekgb c;
    private final ekgp d;
    private String e;
    private final Random f;

    public ejlu(ekgp ekgpVar, ekgp ekgpVar2, String str, ekgb ekgbVar, Random random) {
        this.e = "";
        int i = ekgb.d;
        ekgb ekgbVar2 = ekoe.a;
        this.d = ekgpVar;
        this.b = ekgpVar2;
        this.e = str;
        this.c = ekgbVar;
        this.f = random;
    }

    public static ekgb a(String str) {
        return ekgb.n(ejxk.b(',').f().a().i(str));
    }

    public static int c(String str) {
        if (str.toLowerCase().endsWith(".gif")) {
            return 5;
        }
        if (str.toLowerCase().endsWith(".png")) {
            return 4;
        }
        return str.toLowerCase().endsWith(".webp") ? 3 : 2;
    }

    public final etyp b(String str, final String str2, String str3, final ekgb ekgbVar) {
        if (!this.e.equals(str3)) {
            this.c = a(str3);
            this.e = str3;
        }
        etyp etypVar = etyp.a;
        String lowerCase = str.toLowerCase();
        ekgp ekgpVar = this.d;
        if (ekgpVar.containsKey(lowerCase)) {
            Optional optionalEmpty = Optional.empty();
            Stream streamFilter = Collection.EL.stream((ekgb) ekgpVar.get(lowerCase)).filter(new Predicate() { // from class: ejle
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
                    ejlu ejluVar = this.a;
                    String str4 = (String) obj;
                    if (ejluVar.c.contains(str4)) {
                        return false;
                    }
                    ekgp ekgpVar2 = ejluVar.b;
                    if (!ekgpVar2.containsKey(str4)) {
                        return false;
                    }
                    etyb etybVar = ((etyp) ekgpVar2.get(str4)).g;
                    if (etybVar == null) {
                        etybVar = etyb.a;
                    }
                    return !ekgbVar.contains(etybVar.c);
                }
            });
            int i = ekgb.d;
            ekgb ekgbVar2 = (ekgb) streamFilter.collect(ekcv.a);
            if (str2 != null) {
                optionalEmpty = Collection.EL.stream(ekgbVar2).filter(new Predicate() { // from class: ejll
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
                        etyb etybVar = ((etyp) this.a.b.get((String) obj)).g;
                        if (etybVar == null) {
                            etybVar = etyb.a;
                        }
                        return str2.equals(etybVar.c);
                    }
                }).findAny();
            }
            if (!ekgbVar2.isEmpty()) {
                if (!optionalEmpty.isEmpty()) {
                    return (etyp) this.b.get(optionalEmpty.get());
                }
                return (etyp) this.b.getOrDefault(ekgbVar2.get(this.f.nextInt(ekgbVar2.size())), etypVar);
            }
        }
        return etypVar;
    }
}
