package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amsq implements anpj {
    public final auaq a;
    public final alrj b;
    public final ExecutorService c;
    public final cogw d;
    public final BugleConversationId e;
    public final anpj f;
    public final cqtq g;
    public cquc h = null;

    public amsq(auaq auaqVar, cqtp cqtpVar, alrj alrjVar, ExecutorService executorService, cogw cogwVar, BugleConversationId bugleConversationId, anpj anpjVar) {
        this.a = auaqVar;
        this.g = cqtpVar.a(new amsp(this));
        this.b = alrjVar;
        this.c = executorService;
        this.d = cogwVar;
        this.e = bugleConversationId;
        this.f = anpjVar;
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.g.a(new cqtk() { // from class: amsf
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "ActiveComposersSupplier::register", "ActiveComposersSupplier::callback", "ActiveComposersSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return this.a.b().i(new eooz() { // from class: amsl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final amsq amsqVar = this.a;
                final ekgp ekgpVar = (ekgp) ((ekgp) obj).getOrDefault(amsqVar.e.a, ekoj.a);
                if (!ekgpVar.isEmpty()) {
                    return amsqVar.f.b().h(new ejvr() { // from class: amsm
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            Stream stream = Collection.EL.stream(ekgpVar.entrySet());
                            final amsq amsqVar2 = amsqVar;
                            final ekgp ekgpVar2 = (ekgp) stream.collect(ekcv.a(new Function() { // from class: amsg
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return amsqVar2.b.b((aubq) ((Map.Entry) obj3).getKey());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: amsh
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return (Instant) ((Map.Entry) obj3).getValue();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                            Stream map = Collection.EL.stream((ekgb) obj2).filter(new Predicate() { // from class: amsi
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
                                public final boolean test(Object obj3) {
                                    ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj3;
                                    alqm alqmVarG = resolvedRecipient.g();
                                    ekgp ekgpVar3 = ekgpVar2;
                                    if (ekgpVar3.containsKey(alqmVarG)) {
                                        return ((Instant) ekgpVar3.get(resolvedRecipient.g())).isAfter(amsqVar2.d.f());
                                    }
                                    return false;
                                }
                            }).map(new Function() { // from class: amsj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj3;
                                    if (resolvedRecipient == null) {
                                        throw new NullPointerException("Null recipient");
                                    }
                                    Instant instant = (Instant) ekgpVar2.get(resolvedRecipient.g());
                                    instant.getClass();
                                    return new amrm(resolvedRecipient, instant);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = ekgb.d;
                            return (ekgb) map.collect(ekcv.a);
                        }
                    }, amsqVar.c);
                }
                int i = ekgb.d;
                return eijx.e(ekoe.a);
            }
        }, this.c);
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final eiju d() {
        return eijx.f(new Runnable() { // from class: amse
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g.c(new Supplier() { // from class: amsk
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return null;
                    }
                }, "ActiveComposersNotify");
            }
        }, this.c);
    }
}
