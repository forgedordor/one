package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alyy {
    public final eosc a;
    public final amfr b;

    public alyy(eosc eoscVar, boolean z) {
        this.a = eoscVar;
        this.b = new amfr(z);
    }

    public final brdp a(final BugleConversationId bugleConversationId, final alzi alziVar, int i) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getIdsBeforeKeyQuery");
        brdrVarD.f(new Function() { // from class: alya
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: alyb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                amfr.b(brecVar, bugleConversationId);
                amfr.d(brecVar, alziVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.d((brdo[]) amgh.a.c.toArray(new brdo[0]));
        brdrVarD.y(i);
        return this.b.a(brdrVarD).b();
    }

    final brdp b(BugleConversationId bugleConversationId, int i, int i2) {
        brdr brdrVarD = d(bugleConversationId, i, i2);
        brdrVarD.d((brdo[]) amgh.a.b.toArray(new brdo[0]));
        return brdrVarD.b();
    }

    public final brdr c(final BugleConversationId bugleConversationId, final alzi alziVar, int i) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getIdsAfterKeyQueryInternal");
        brdrVarD.f(new Function() { // from class: alyv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: alyw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                amfr.b(brecVar, bugleConversationId);
                amfr.c(brecVar, alziVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.d((brdo[]) amgh.a.b.toArray(new brdo[0]));
        brdrVarD.y(i);
        return this.b.a(brdrVarD);
    }

    public final brdr d(final BugleConversationId bugleConversationId, int i, int i2) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getIdsWithOffsetLimitQuery");
        brdrVarD.f(new Function() { // from class: alxy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: alxz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                amfr.b(brecVar, bugleConversationId);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.y(i2);
        brdr brdrVarA = this.b.a(brdrVarD);
        if (i > 0) {
            brdrVarA.B(i);
        }
        return brdrVarA;
    }

    public final eiju e(final BugleConversationId bugleConversationId, final MessageIdType messageIdType, final long j, final long j2, final boolean z) {
        return eijx.g(new Callable() { // from class: alyo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("partOffsetQuery");
                brdrVarD.v();
                brdrVarD.n(new dqxm("COUNT(*)"), "count");
                bsje bsjeVarC = PartsTable.c();
                bsjeVarC.f(new Function() { // from class: alyh
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
                brdrVarD.H(dqts.i(bsjeVarC.b(), PartsTable.d.b, MessagesTable.c.a).g());
                final BugleConversationId bugleConversationId2 = bugleConversationId;
                final long j3 = j2;
                final MessageIdType messageIdType2 = messageIdType;
                final long j4 = j;
                if (z) {
                    brdrVarD.h(new Function() { // from class: alyi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            amfr.b(brecVar, bugleConversationId2);
                            final long j5 = j3;
                            final MessageIdType messageIdType3 = messageIdType2;
                            final long j6 = j4;
                            brecVar.b(new Function() { // from class: alys
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return amgh.a.d.a((brec) obj2, Long.valueOf(j5));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: alyt
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    Object objA = amgh.a.e.a((brec) obj2, Long.valueOf(j5));
                                    ((brec) objA).v(messageIdType3.a);
                                    return objA;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: alyu
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    Object objA = amgh.a.e.a((brec) obj2, Long.valueOf(j5));
                                    ((brec) objA).p(messageIdType3);
                                    ((dqyp) objA).ar(new dqxl("$V{J:parts} < $V", new Object[]{PartsTable.d.a, Long.valueOf(j6)}));
                                    return objA;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                } else {
                    brdrVarD.h(new Function() { // from class: alyj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            amfr.b(brecVar, bugleConversationId2);
                            final long j5 = j3;
                            final MessageIdType messageIdType3 = messageIdType2;
                            final long j6 = j4;
                            brecVar.b(new Function() { // from class: alxv
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return amgh.a.f.a((brec) obj2, Long.valueOf(j5));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: alxw
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    Object objA = amgh.a.e.a((brec) obj2, Long.valueOf(j5));
                                    ((brec) objA).r(messageIdType3.a);
                                    return objA;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: alxx
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    Object objA = amgh.a.e.a((brec) obj2, Long.valueOf(j5));
                                    ((brec) objA).p(messageIdType3);
                                    ((dqyp) objA).ar(new dqxl("$V{J:parts} > $V", new Object[]{PartsTable.d.a, Long.valueOf(j6)}));
                                    return objA;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
                brap brapVar = (brap) brdrVarD.b().p();
                try {
                    if (!brapVar.moveToNext()) {
                        throw new IllegalStateException("cannot determine the absolute offset of a message part");
                    }
                    Integer numValueOf = Integer.valueOf(Integer.parseInt(brapVar.de("count")));
                    brapVar.close();
                    return numValueOf;
                } finally {
                }
            }
        }, this.a);
    }

    public final brdr f(final BugleConversationId bugleConversationId, final alzi alziVar, int i) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getIdsAfterKeyQueryInternal");
        brdrVarD.f(new Function() { // from class: alyk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: alyl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                amfr.b(brecVar, bugleConversationId);
                amfr.c(brecVar, alziVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.d((brdo[]) amgh.a.b.toArray(new brdo[0]));
        brdrVarD.y(i);
        return this.b.a(brdrVarD);
    }

    public final brdp g(final BugleConversationId bugleConversationId, final alzi alziVar, int i) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getIdsBeforeKeyQuery");
        brdrVarD.f(new Function() { // from class: alyp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: alyr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                amfr.b(brecVar, bugleConversationId);
                amfr.d(brecVar, alziVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.d((brdo[]) amgh.a.c.toArray(new brdo[0]));
        brdrVarD.y(i);
        return this.b.a(brdrVarD).b();
    }
}
