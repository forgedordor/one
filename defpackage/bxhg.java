package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class bxhg {
    public final /* synthetic */ axhh a;

    public /* synthetic */ bxhg(axhh axhhVar) {
        this.a = axhhVar;
    }

    public final dqsy a(dqrs dqrsVar) {
        axhh axhhVar = this.a;
        Context context = (Context) axhhVar.a.b();
        context.getClass();
        Optional optional = (Optional) axhhVar.c.b();
        optional.getClass();
        cogw cogwVar = (cogw) axhhVar.i.b();
        cogwVar.getClass();
        bbmi bbmiVar = (bbmi) axhhVar.j.b();
        bbmiVar.getClass();
        Map map = (Map) axhhVar.m.b();
        map.getClass();
        dqro dqroVar = (dqro) axhhVar.n.b();
        dqroVar.getClass();
        aptk aptkVar = (aptk) axhhVar.o.b();
        aptkVar.getClass();
        final axhg axhgVar = new axhg(context, axhhVar.b, optional, axhhVar.d, axhhVar.e, axhhVar.f, axhhVar.g, axhhVar.h, cogwVar, bbmiVar, axhhVar.k, axhhVar.l, map, dqroVar, aptkVar, dqrsVar);
        synchronized (axhgVar.j) {
            AtomicReference atomicReference = axhgVar.i;
            dqsy dqsyVar = (dqsy) atomicReference.get();
            if (dqsyVar != null) {
                return dqsyVar;
            }
            ejwl.l(atomicReference.get() == null);
            eieu eieuVarK = eiiy.k("DatabaseHelperBasic#getDatabaseWrapperForAnyThread create");
            try {
                axhgVar.setWriteAheadLoggingEnabled(true);
                bwwx bwwxVar = (bwwx) axhgVar.g.b();
                dqrs dqrsVar2 = axhgVar.l;
                bwzz bwzzVar = (bwzz) bwwxVar.b.b();
                Stream streamFilter = Collection.EL.stream(((Map) bwwxVar.a.b()).entrySet()).sorted(Comparator.CC.comparingInt(new ToIntFunction() { // from class: bwwu
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        return ((Integer) ((Map.Entry) obj).getKey()).intValue();
                    }
                })).map(new Function() { // from class: bwwv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (bxam) ((Map.Entry) obj).getValue();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: bwww
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
                        bxam bxamVar = (bxam) obj;
                        return bxamVar != null && bxamVar.o();
                    }
                });
                int i = ekgb.d;
                ekgb ekgbVar = (ekgb) streamFilter.collect(ekcv.a);
                Context context2 = (Context) bwzzVar.a.b();
                context2.getClass();
                fcsu fcsuVar = bwzzVar.b;
                fcsu fcsuVar2 = bwzzVar.c;
                cogw cogwVar2 = (cogw) bwzzVar.d.b();
                cogwVar2.getClass();
                dqrsVar2.getClass();
                ekgbVar.getClass();
                bwzy bwzyVar = new bwzy(context2, fcsuVar, cogwVar2, dqrsVar2, ekgbVar);
                final SettableFuture settableFutureCreate = SettableFuture.create();
                final bwzt bwztVar = bwzyVar.j;
                eiju eijuVarG = eiju.g(settableFutureCreate);
                eijuVarG.getClass();
                AtomicReference atomicReference2 = bwztVar.a;
                ejwl.l(atomicReference2.get() == null);
                atomicReference2.set(eijuVarG);
                ((ListenableFuture) atomicReference2.get()).getClass();
                ejvr ejvrVar = new ejvr() { // from class: bwzq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        bwztVar.b.b((SQLiteDatabase) obj);
                        return null;
                    }
                };
                eoqg eoqgVar = eoqg.a;
                eijuVarG.h(ejvrVar, eoqgVar);
                ejwl.l(atomicReference.get() == null);
                atomicReference.set(bwzyVar);
                eiju.g(((eosc) axhgVar.h.b()).submit(eiid.l(new Callable() { // from class: axha
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eieu eieuVarK2 = eiiy.k("DatabaseHelperBasic#doInitialization");
                        axhg axhgVar2 = axhgVar;
                        try {
                            AtomicReference atomicReference3 = axhgVar2.i;
                            ((bwzy) atomicReference3.get()).getClass();
                            SQLiteDatabase sQLiteDatabaseA = axhgVar2.a();
                            eieu eieuVarK3 = eiiy.k("DatabaseHelperBasic#initPlugins");
                            if (sQLiteDatabaseA != null) {
                                try {
                                    for (bxam bxamVar : ((bwzy) atomicReference3.get()).f) {
                                        bxamVar.n(sQLiteDatabaseA);
                                    }
                                } finally {
                                }
                            }
                            eieuVarK3.close();
                            eieuVarK2.close();
                            return sQLiteDatabaseA;
                        } catch (Throwable th) {
                            try {
                                eieuVarK2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }))).h(new ejvr() { // from class: axhb
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        AtomicBoolean atomicBoolean = axhg.a;
                        settableFutureCreate.set((SQLiteDatabase) obj);
                        return null;
                    }
                }, eoqgVar).e(Throwable.class, new ejvr() { // from class: axhc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        AtomicBoolean atomicBoolean = axhg.a;
                        auvh.d(th);
                        if (!cqbe.j()) {
                            return null;
                        }
                        settableFutureCreate.setException(th);
                        return null;
                    }
                }, eoqgVar);
                bwzy bwzyVar2 = (bwzy) atomicReference.get();
                bwzyVar2.getClass();
                eieuVarK.close();
                return bwzyVar2;
            } finally {
            }
        }
    }
}
