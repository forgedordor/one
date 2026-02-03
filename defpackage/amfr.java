package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amfr {
    private final boolean a;

    public amfr(boolean z) {
        this.a = z;
    }

    static final void b(brec brecVar, BugleConversationId bugleConversationId) {
        brecVar.A(false);
        ekfw ekfwVar = new ekfw();
        ekfwVar.h(3);
        ekfwVar.h(16);
        if (apsb.a()) {
            ekfwVar.h(235);
            ekfwVar.h(237);
            ekfwVar.h(216);
            ekfwVar.h(219);
            ekfwVar.h(238);
            ekfwVar.h(236);
            ekfwVar.h(215);
            ekfwVar.h(214);
            ekfwVar.h(223);
            ekfwVar.h(224);
            ekfwVar.h(222);
            ekfwVar.h(233);
            ekfwVar.h(234);
            ekfwVar.h(252);
            ekfwVar.h(208);
        }
        brecVar.am(ekfwVar.g());
        brecVar.m(bugleConversationId.a);
    }

    static final void c(brec brecVar, final alzi alziVar) {
        if (alziVar.d()) {
            brecVar.b(new Function() { // from class: amfk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return amgh.a.d.a((brec) obj, Long.valueOf(alziVar.c()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: amfl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    fdat fdatVar = amgh.a.e;
                    alzi alziVar2 = alziVar;
                    Object objA = fdatVar.a((brec) obj, Long.valueOf(alziVar2.c()));
                    ((brec) objA).v(alziVar2.a());
                    return objA;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: amfm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    fdat fdatVar = amgh.a.e;
                    alzi alziVar2 = alziVar;
                    Object objA = fdatVar.a((brec) obj, Long.valueOf(alziVar2.c()));
                    ((brec) objA).p(new MessageIdType(alziVar2.a()));
                    ((dqyp) objA).ar(new dqxl("$V{J:parts} <= $V", new Object[]{PartsTable.d.a, Long.valueOf(alziVar2.b())}));
                    return objA;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            brecVar.b(new Function() { // from class: amfn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return amgh.a.d.a((brec) obj, Long.valueOf(alziVar.c()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: amfo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    fdat fdatVar = amgh.a.e;
                    alzi alziVar2 = alziVar;
                    Object objA = fdatVar.a((brec) obj, Long.valueOf(alziVar2.c()));
                    ((brec) objA).w(alziVar2.a());
                    return objA;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
    }

    static final void d(brec brecVar, final alzi alziVar) {
        if (alziVar.d()) {
            brecVar.b(new Function() { // from class: amfp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return amgh.a.f.a((brec) obj, Long.valueOf(alziVar.c()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: amfq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    fdat fdatVar = amgh.a.e;
                    alzi alziVar2 = alziVar;
                    Object objA = fdatVar.a((brec) obj, Long.valueOf(alziVar2.c()));
                    ((brec) objA).r(alziVar2.a());
                    return objA;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: amfh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    fdat fdatVar = amgh.a.e;
                    alzi alziVar2 = alziVar;
                    Object objA = fdatVar.a((brec) obj, Long.valueOf(alziVar2.c()));
                    ((brec) objA).p(new MessageIdType(alziVar2.a()));
                    ((dqyp) objA).ar(new dqxl("$V{J:parts} >= $V", new Object[]{PartsTable.d.a, Long.valueOf(alziVar2.b())}));
                    return objA;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            brecVar.b(new Function() { // from class: amfi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return amgh.a.f.a((brec) obj, Long.valueOf(alziVar.c()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: amfj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    fdat fdatVar = amgh.a.e;
                    alzi alziVar2 = alziVar;
                    Object objA = fdatVar.a((brec) obj, Long.valueOf(alziVar2.c()));
                    ((dqyp) objA).ap(new dqty("messages._id", 9, Long.valueOf(alziVar2.a())));
                    return objA;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
    }

    public final brdr a(brdr brdrVar) {
        if (!this.a) {
            return brdrVar;
        }
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("fanOutWhenFlatteningIfNeeded");
        bsjeVarC.f(new Function() { // from class: amfg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bsgr) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVar.H(dqts.i(bsjeVarC.b(), PartsTable.d.b, MessagesTable.c.a).g());
        return brdrVar;
    }
}
