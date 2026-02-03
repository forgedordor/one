package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acut implements acuf {
    public final eosc a;
    public final eosc b;
    public final bveo c;
    public final fcsu d;
    public final fcsu e;
    public final egyt f;
    public final fcsu g;
    public final fcsu h;
    public final List j = new ArrayList();
    public final List k = new ArrayList();
    public final AtomicBoolean i = new AtomicBoolean(false);
    private boolean m = false;
    public boolean l = false;

    public acut(eosc eoscVar, eosc eoscVar2, bveo bveoVar, fcsu fcsuVar, fcsu fcsuVar2, egyt egytVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = eoscVar;
        this.b = eoscVar2;
        this.c = bveoVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = egytVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
    }

    @Override // defpackage.acuf
    public final eiju a(final ekgb ekgbVar, final bvdk bvdkVar, final elka elkaVar, final efwo efwoVar) {
        return eijx.g(new Callable() { // from class: acup
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cpgf cpgfVar = (cpgf) this.a.e.b();
                efwo efwoVar2 = efwoVar;
                ekgb ekgbVarN = ekgb.n(ekgbVar);
                Optional.of(efwoVar2);
                return (List) Collection.EL.stream(cpgfVar.c(ekgbVarN, bvdkVar, elkaVar)).map(new Function() { // from class: acum
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ConversationIdType) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: acun
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
            }
        }, this.a);
    }

    @Override // defpackage.acuf
    public final void b() {
        ecem.c();
        this.m = true;
        c();
    }

    public final void c() {
        if (this.l && this.m) {
            ((egzh) this.h.b()).a(eijx.e(null), "POPUP_KEY");
        }
    }
}
