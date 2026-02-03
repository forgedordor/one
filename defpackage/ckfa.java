package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckfa {
    private final bxlc a;

    public ckfa(bxlc bxlcVar) {
        bxlcVar.getClass();
        this.a = bxlcVar;
    }

    public static final Instant b(final basd basdVar, final String str) {
        String[] strArr = bqfo.a;
        bqfj bqfjVar = new bqfj(bqfo.a);
        bqfjVar.A("queryReceivedTimestamps");
        bqfjVar.v();
        bqfjVar.g(new Function() { // from class: ckex
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqfn bqfnVar = (bqfn) obj;
                bqfnVar.b(basdVar);
                return bqfnVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.f(new Function() { // from class: ckey
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).i;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: ckeg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.W(str);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdp brdpVarB = brdrVarD.b();
        bran branVar = MessagesTable.c;
        bqfjVar.H(dqts.i(brdpVarB, branVar.a, bqfo.c.a).g());
        ekgb ekgbVarZ = bqfjVar.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = ekgbVarZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dqpd[] dqpdVarArrAH = ((bqec) it.next()).aH("messages", new MessagesTable.BindData[0]);
            dqpdVarArrAH.getClass();
            MessagesTable.BindData bindData = (MessagesTable.BindData) fcur.I(dqpdVarArrAH);
            Long lValueOf = bindData != null ? Long.valueOf(bindData.w()) : null;
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        if (!arrayList.isEmpty()) {
            return Instant.ofEpochMilli(((Number) fcva.J(arrayList)).longValue() + 1);
        }
        brdr brdrVarD2 = MessagesTable.d();
        brdrVarD2.A("timestampsByRcsMessageId");
        brdrVarD2.f(new Function() { // from class: ckeh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bran) obj).i;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD2.h(new Function() { // from class: ckei
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                final basd basdVar2 = basdVar;
                brecVar.b(new Function() { // from class: ckeq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brec brecVar2 = (brec) obj2;
                        brecVar2.N(basdVar2);
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cker
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brec brecVar2 = (brec) obj2;
                        brecVar2.F(basdVar2);
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brecVar.W(str);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD2.y(1);
        brap brapVar = (brap) brdrVarD2.b().q(branVar.i);
        try {
            ekgb ekgbVarZ2 = brapVar.z();
            brapVar.close();
            ekgbVarZ2.getClass();
            if (ekgbVarZ2.isEmpty()) {
                return null;
            }
            return Instant.ofEpochMilli(((Number) fcva.J(ekgbVarZ2)).longValue() + 1);
        } catch (Throwable th) {
            try {
                brapVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final ckez c(final basd basdVar, final String str) throws IOException {
        String[] strArr = bqfo.a;
        bqfj bqfjVar = new bqfj(bqfo.a);
        bqfjVar.A("queryLatestEditVersion");
        bqfjVar.e(new Function() { // from class: ckeu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqeu bqeuVar = (bqeu) obj;
                return new bqev[]{bqeuVar.b, bqeuVar.d};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqfjVar.g(new Function() { // from class: ckev
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqfn bqfnVar = (bqfn) obj;
                bqfnVar.b(basdVar);
                return bqfnVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqfjVar.y(1);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.v();
        brdrVarD.h(new Function() { // from class: ckew
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.W(str);
                brecVar.A(false);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqfjVar.H(dqts.i(brdrVarD.b(), MessagesTable.c.a, bqfo.c.a).g());
        dqqj dqqjVarP = bqfjVar.b().p();
        try {
            bqew bqewVar = (bqew) dqqjVarP;
            if (!bqewVar.moveToFirst()) {
                fczl.a(dqqjVarP, null);
                return null;
            }
            MessageIdType messageIdTypeC = bqewVar.c();
            Instant instantF = bqewVar.f();
            instantF.getClass();
            ckez ckezVar = new ckez(messageIdTypeC, instantF);
            fczl.a(dqqjVarP, null);
            return ckezVar;
        } finally {
        }
    }

    private final void d(ConversationIdType conversationIdType, MessageIdType messageIdType, MessageIdType messageIdType2) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("hideMessage");
        brduVar.q(true);
        brduVar.e(messageIdType);
        String[] strArr2 = bqkl.a;
        bqki bqkiVar = new bqki();
        MessageIdType messageIdType3 = bary.a;
        if (messageIdType2.equals(messageIdType3)) {
            bqkiVar.a.putNull("message_id");
        } else {
            bqkiVar.a.put("message_id", Long.valueOf(bary.a(messageIdType2)));
        }
        bqkiVar.c(messageIdType);
        String[] strArr3 = bqsm.a;
        bqsj bqsjVar = new bqsj();
        if (messageIdType2.equals(messageIdType3)) {
            bqsjVar.a.putNull("message_id");
        } else {
            bqsjVar.a.put("message_id", Long.valueOf(bary.a(messageIdType2)));
        }
        bqsl bqslVar = new bqsl();
        bqslVar.b(messageIdType);
        bqsjVar.aj(new bqsk(bqslVar), "message_star-buildAndUpdateForMessageId");
        String[] strArr4 = bqmc.a;
        bqlz bqlzVar = new bqlz();
        bqlzVar.c(messageIdType2);
        bqmb bqmbVar = new bqmb();
        bqmbVar.b(messageIdType);
        bqlzVar.ae(new bqma(bqmbVar), "message_replies-buildAndUpdateForRepliedToMessageId");
        bqlz bqlzVar2 = new bqlz();
        if (messageIdType2.equals(messageIdType3)) {
            bqlzVar2.a.putNull("message_id");
        } else {
            bqlzVar2.a.put("message_id", Long.valueOf(bary.a(messageIdType2)));
        }
        bqmb bqmbVar2 = new bqmb();
        bqmbVar2.ap(new dqpj("message_replies.message_id", 1, Long.valueOf(bary.a(messageIdType))));
        bqlzVar2.aj(new bqma(bqmbVar2), "message_replies-buildAndUpdateForMessageId");
        this.a.l(conversationIdType, messageIdType, new String[0]);
    }

    public final void a(ConversationIdType conversationIdType, MessageIdType messageIdType, final String str, final basd basdVar, Instant instant, Instant instant2, ckez ckezVar) throws IOException {
        MessageIdType messageIdType2;
        if (ckezVar == null || !ckezVar.b.isAfter(instant)) {
            String[] strArr = bqfo.a;
            bqfl bqflVar = new bqfl();
            bqflVar.ap("updateLatestMessageId");
            if (messageIdType.equals(bary.a)) {
                bqflVar.a.putNull("latest_message_id");
            } else {
                bqflVar.a.put("latest_message_id", Long.valueOf(bary.a(messageIdType)));
            }
            bqflVar.af(new bqfm((bqfn) new Function() { // from class: ckef
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqfn bqfnVar = (bqfn) obj;
                    String[] strArr2 = bqfo.a;
                    bqfj bqfjVar = new bqfj(bqfo.a);
                    bqfjVar.f(new Function() { // from class: ckel
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((bqeu) obj2).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final basd basdVar2 = basdVar;
                    bqfjVar.g(new Function() { // from class: ckem
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bqfn bqfnVar2 = (bqfn) obj2;
                            bqfnVar2.b(basdVar2);
                            return bqfnVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.v();
                    final String str2 = str;
                    brdrVarD.h(new Function() { // from class: cken
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar = (brec) obj2;
                            brecVar.W(str2);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bqfjVar.H(dqts.i(brdrVarD.b(), MessagesTable.c.a, bqfo.c.a).g());
                    bqfnVar.ap(new dqpk("message_edits.message_id", 3, bqfjVar.b()));
                    return bqfnVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new bqfn())));
            bqflVar.b().e();
            if (ckezVar != null) {
                d(conversationIdType, ckezVar.a, messageIdType);
            } else {
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("insertOriginalMessageIfPresent");
                brdrVarD.e(new Function() { // from class: ckej
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bran branVar = (bran) obj;
                        return new brao[]{branVar.b, branVar.a, branVar.i};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdrVarD.h(new Function() { // from class: ckek
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        final basd basdVar2 = basdVar;
                        brecVar.b(new Function() { // from class: ckes
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                brec brecVar2 = (brec) obj2;
                                brecVar2.N(basdVar2);
                                return brecVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cket
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                brec brecVar2 = (brec) obj2;
                                brecVar2.F(basdVar2);
                                return brecVar2;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brecVar.W(str);
                        brecVar.A(false);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdrVarD.y(1);
                dqqj dqqjVarP = brdrVarD.b().p();
                try {
                    brap brapVar = (brap) dqqjVarP;
                    if (brapVar.moveToFirst()) {
                        bqeh bqehVar = new bqeh();
                        bqehVar.e(brapVar.q());
                        bqehVar.d(messageIdType);
                        bqehVar.f(basdVar);
                        bqehVar.c(Instant.ofEpochMilli(-1L));
                        bqehVar.g(Instant.ofEpochMilli(brapVar.l()));
                        bqehVar.b();
                        d(brapVar.p(), brapVar.q(), messageIdType);
                    }
                    fczl.a(dqqjVarP, null);
                } finally {
                }
            }
            messageIdType2 = messageIdType;
        } else {
            messageIdType2 = ckezVar.a;
        }
        String[] strArr2 = bqfo.a;
        bqeh bqehVar2 = new bqeh();
        bqehVar2.e(messageIdType);
        bqehVar2.d(messageIdType2);
        bqehVar2.f(basdVar);
        bqehVar2.c(instant);
        bqehVar2.g(instant2);
        bqehVar2.b();
    }
}
