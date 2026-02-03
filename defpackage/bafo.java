package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bafo implements Iterable {
    public final eygg a;
    public final eygg b;
    public final ekgb c;
    public final int d;
    private final ekgp e;

    public bafo(eygg eyggVar, eygg eyggVar2, ekgb ekgbVar, ekgb ekgbVar2) {
        this.a = eyggVar;
        this.b = eyggVar2;
        this.c = ekgbVar;
        this.d = (int) Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: bafh
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
                return !bbdl.k((ParticipantsTable.BindData) obj);
            }
        }).count();
        this.e = (ekgp) Collection.EL.stream(ekgbVar).collect(ekcv.b(new Function() { // from class: bafj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ParticipantsTable.BindData) obj).R();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bafk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ParticipantsTable.BindData) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: bafl
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (ParticipantsTable.BindData) obj;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ParticipantsTable.BindData a() {
        if (this.d != 1) {
            return null;
        }
        ekgb ekgbVar = this.c;
        int size = ekgbVar.size();
        int i = 0;
        while (i < size) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ekgbVar.get(i);
            i++;
            if (!bbdl.k(bindData)) {
                return bindData;
            }
        }
        cqaz.c("Couldn't find other participant");
        return null;
    }

    public final ParticipantsTable.BindData b(String str) {
        return (ParticipantsTable.BindData) this.e.get(str);
    }

    public final ArrayList c() {
        return (ArrayList) Collection.EL.stream(this.c).filter(new Predicate() { // from class: baff
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
                return !bbdl.k((ParticipantsTable.BindData) obj);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bafg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
    }

    public final boolean d() {
        for (ParticipantsTable.BindData bindData : this.c) {
            if (bindData.p() == 3 || Objects.equals(bindData.T(), "+18339913448")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        if (this.d == 1) {
            ekgb ekgbVar = this.c;
            int size = ekgbVar.size();
            int i = 0;
            while (i < size) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ekgbVar.get(i);
                i++;
                if (!bbdl.k(bindData)) {
                    return bbbd.m(bindData);
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ekjz.h(this.c, ((bafo) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<ParticipantsTable.BindData> iterator() {
        return this.c.iterator();
    }
}
