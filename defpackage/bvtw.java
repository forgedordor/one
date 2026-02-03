package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvtw extends cayv {
    public static final cczv a = cdag.q(164486593, "use_attachment_to_blobstore_uploader_worker");
    public final fcsu b;
    public final fcsu c;
    public final bael d;
    public final bfsa e;
    public final ceku f;
    public final aqmq g;
    private final eosc h;
    private final eosc i;
    private final eygg j;

    public bvtw(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, bael baelVar, bfsa bfsaVar, ceku cekuVar, eygg eyggVar, aqmq aqmqVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.h = eoscVar;
        this.i = eoscVar2;
        this.d = baelVar;
        this.e = bfsaVar;
        this.f = cekuVar;
        this.j = eyggVar;
        this.g = aqmqVar;
    }

    private final boolean k() {
        return Collection.EL.stream((Set) this.j.b()).allMatch(new Predicate() { // from class: bvtt
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
                return ((bvmk) obj).b();
            }
        });
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.c(5);
        caxzVarL.f(pza.a);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("UploadAttachmentsToBlobstoreHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bvty.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final /* synthetic */ boolean h(evuh evuhVar) {
        return k();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final bvty bvtyVar = (bvty) evuhVar;
        return !k() ? eijx.e(cbcw.k()) : eijx.h(new eooy() { // from class: bvtu
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ArrayList arrayList;
                bvtw bvtwVar = this.a;
                bvsl bvslVar = (bvsl) bvtwVar.b.b();
                bvty bvtyVar2 = bvtyVar;
                List list = (List) Collection.EL.stream(bvtyVar2.b).map(new Function() { // from class: bvtr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cczv cczvVar = bvtw.a;
                        return bary.b((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bvts
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                if (bvtwVar.g.a()) {
                    arrayList = new ArrayList();
                    bfrj bfrjVar = (bfrj) bvtwVar.e.c((MessageIdType[]) list.toArray(new MessageIdType[0])).b().p();
                    while (bfrjVar.moveToNext()) {
                        try {
                            arrayList.add(((baeb) bvtwVar.c.b()).c(bfrjVar));
                        } finally {
                        }
                    }
                    bfrjVar.close();
                } else {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        bgvb bgvbVar = (bgvb) bvtwVar.d.b((MessageIdType) it.next()).p();
                        try {
                            if (bgvbVar.moveToNext()) {
                                arrayList.add(((baeb) bvtwVar.c.b()).e(bgvbVar));
                            }
                            bgvbVar.close();
                        } finally {
                        }
                    }
                }
                boolean z = bvtyVar2.c;
                String str = bvtyVar2.d;
                return bvslVar.a(bvsl.b(arrayList, str), z, str, bvtwVar.f, Optional.empty());
            }
        }, this.i).h(new ejvr() { // from class: bvtv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cczv cczvVar = bvtw.a;
                return cbcw.i();
            }
        }, this.h);
    }
}
