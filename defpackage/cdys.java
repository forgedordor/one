package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdys {
    public final cdye a;
    public final eosd b;
    public final appk c;

    public cdys(cdye cdyeVar, eosd eosdVar, appk appkVar) {
        this.a = cdyeVar;
        this.b = eosdVar;
        this.c = appkVar;
    }

    public final eiju a(MessageIdType messageIdType) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        cqob cqobVar = new cqob(new cdyn(settableFutureCreate), new Consumer() { // from class: cdyr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                settableFutureCreate.set(cbcw.k());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cdyc cdycVar = (cdyc) cdyd.a.createBuilder();
        cdycVar.b(messageIdType.b());
        cdyd cdydVar = (cdyd) cdycVar.build();
        caxr caxrVar = new caxr();
        caxrVar.e = cqobVar;
        this.a.b(cdydVar, caxrVar.a());
        return eiju.g(settableFutureCreate);
    }

    public final eiju b(MessageIdType messageIdType, cdyt cdytVar) {
        if (!this.c.a()) {
            return a(messageIdType);
        }
        final SettableFuture settableFutureCreate = SettableFuture.create();
        cqob cqobVar = new cqob(new cdyn(settableFutureCreate), new Consumer() { // from class: cdyo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                settableFutureCreate.set(cbcw.k());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cdye cdyeVar = this.a;
        cdyc cdycVar = (cdyc) cdyd.a.createBuilder();
        cdycVar.b(messageIdType.b());
        cdycVar.copyOnWrite();
        cdyd cdydVar = (cdyd) cdycVar.instance;
        cdydVar.e = cdytVar.a();
        cdydVar.b |= 1;
        cdyd cdydVar2 = (cdyd) cdycVar.build();
        caxr caxrVar = new caxr();
        caxrVar.e = cqobVar;
        cdyeVar.b(cdydVar2, caxrVar.a());
        return eiju.g(settableFutureCreate);
    }

    public final eiju c(List list) {
        cdyc cdycVar = (cdyc) cdyd.a.createBuilder();
        cdycVar.a((Iterable) Collection.EL.stream(list).map(new cdyl()).collect(Collectors.toCollection(new cdym())));
        eiju eijuVarA = this.a.a((cdyd) cdycVar.build());
        cdyp cdypVar = new cdyp();
        eosd eosdVar = this.b;
        return eijuVarA.i(cdypVar, eosdVar).h(new cdyq(), eosdVar);
    }

    public final void d(MessageIdType messageIdType) {
        cdyc cdycVar = (cdyc) cdyd.a.createBuilder();
        cdycVar.b(messageIdType.b());
        this.a.c((cdyd) cdycVar.build());
    }

    public final void e(MessageIdType messageIdType, cdyt cdytVar) {
        if (!this.c.a()) {
            d(messageIdType);
            return;
        }
        cdye cdyeVar = this.a;
        cdyc cdycVar = (cdyc) cdyd.a.createBuilder();
        cdycVar.b(messageIdType.b());
        cdycVar.copyOnWrite();
        cdyd cdydVar = (cdyd) cdycVar.instance;
        cdydVar.e = cdytVar.a();
        cdydVar.b |= 1;
        cdyeVar.c((cdyd) cdycVar.build());
    }

    public final void f(List list) {
        cdyc cdycVar = (cdyc) cdyd.a.createBuilder();
        cdycVar.a((Iterable) Collection.EL.stream(list).map(new cdyl()).collect(Collectors.toCollection(new cdym())));
        this.a.c((cdyd) cdycVar.build());
    }

    public final void g(List list, cdyt cdytVar) {
        if (!this.c.a()) {
            f(list);
            return;
        }
        cdye cdyeVar = this.a;
        cdyc cdycVar = (cdyc) cdyd.a.createBuilder();
        cdycVar.a((Iterable) Collection.EL.stream(list).map(new cdyl()).collect(Collectors.toCollection(new cdym())));
        cdycVar.copyOnWrite();
        cdyd cdydVar = (cdyd) cdycVar.instance;
        cdydVar.e = cdytVar.a();
        cdydVar.b |= 1;
        cdyeVar.c((cdyd) cdycVar.build());
    }
}
