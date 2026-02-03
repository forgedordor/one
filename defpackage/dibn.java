package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.PatternMatcher;
import android.util.Log;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dibn extends diaj {
    public dibn() {
        super(dbjt.SHARED_PREFERENCES_DELETION, 10L);
    }

    @Override // defpackage.diaj
    public final diap a(diap diapVar, ejwi ejwiVar) {
        long jCount;
        if (!ejwiVar.g() || ((dbkw) ejwiVar.c()).b != 6) {
            throw new IllegalArgumentException();
        }
        Context contextCreateDeviceProtectedStorageContext = diapVar.b;
        dbkw dbkwVar = (dbkw) ejwiVar.c();
        dbkr dbkrVar = dbkwVar.b == 6 ? (dbkr) dbkwVar.c : dbkr.a;
        if (dbkrVar.b) {
            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
        }
        boolean z = false;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences(dbkrVar.c, 0);
        evtg<String> evtgVar = dbkrVar.d;
        evtg evtgVar2 = dbkrVar.e;
        final SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : evtgVar) {
            if (sharedPreferences.contains(str)) {
                editorEdit.remove(str);
                z = true;
            }
        }
        if (evtgVar2.isEmpty()) {
            jCount = 0;
        } else {
            Stream map = Collection.EL.stream(evtgVar2).map(new Function() { // from class: dibj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new PatternMatcher((String) obj, 2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
            Stream streamFilter = Collection.EL.stream(sharedPreferences.getAll().keySet()).filter(new Predicate() { // from class: dibk
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
                    final String str2 = (String) obj;
                    return Collection.EL.stream(ekgbVar).anyMatch(new Predicate() { // from class: dibm
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
                        public final boolean test(Object obj2) {
                            return ((PatternMatcher) obj2).match(str2);
                        }
                    });
                }
            });
            editorEdit.getClass();
            jCount = streamFilter.map(new Function() { // from class: dibl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return editorEdit.remove((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).count();
        }
        if ((z || jCount > 0) && editorEdit.commit()) {
            Log.i("SPDeletionFix", "Preferences were deleted.");
            return diapVar;
        }
        Log.i("SPDeletionFix", "No preferences were deleted.");
        return diapVar;
    }

    @Override // defpackage.diaj
    public final String b() {
        return "SHARED_PREFERENCES_DELETION";
    }
}
