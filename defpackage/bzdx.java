package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdx implements bzbe {
    public final cptn b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final cpsl f;
    private final fcyh g;
    private final cprh h;

    public bzdx(cpsl cpslVar, cptn cptnVar, fcsu fcsuVar, fcyh fcyhVar, cprh cprhVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcyhVar.getClass();
        cprhVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.f = cpslVar;
        this.b = cptnVar;
        this.c = fcsuVar;
        this.g = fcyhVar;
        this.h = cprhVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    private final void h(cprt cprtVar) {
        if (TextUtils.isEmpty(cprtVar.a().ak())) {
            basd basdVarF = cprtVar.a().F();
            String strD = basdVarF != null ? basd.d(basdVarF) : null;
            if (strD != null && strD.length() > 0) {
                cprtVar.a().bq(this.h.c(strD));
                String[] strArr = MessagesTable.a;
                brdu brduVar = new brdu();
                brduVar.ap("maybePopulateCmsCorrelationId_rcsMessageIdHmac");
                brduVar.j(cprtVar.a().ak());
                if (brduVar.e(cprtVar.a().C())) {
                    return;
                }
                String strB = cprtVar.a().C().b();
                strB.getClass();
                throw new bzdd(strB);
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Objects.toString(uuidRandomUUID);
            String strValueOf = String.valueOf(uuidRandomUUID);
            MessageIdType messageIdTypeC = cprtVar.a().C();
            String[] strArr2 = MessagesTable.a;
            brdu brduVar2 = new brdu();
            brduVar2.ap("maybePopulateCmsCorrelationId");
            String strConcat = "cms:".concat(strValueOf);
            brduVar2.j(strConcat);
            if (brduVar2.e(messageIdTypeC)) {
                cprtVar.a().bq(strConcat);
            } else {
                if (((appk) this.e.b()).a()) {
                    String strB2 = messageIdTypeC.b();
                    strB2.getClass();
                    throw new bzdd(strB2, this.d);
                }
                String strB3 = messageIdTypeC.b();
                strB3.getClass();
                throw new bzdd(strB3);
            }
        }
    }

    @Override // defpackage.bzbe
    public final /* bridge */ /* synthetic */ cpyi a(Object obj) {
        cprt cprtVar = (cprt) obj;
        cprtVar.getClass();
        return cprtVar.a().X();
    }

    @Override // defpackage.bzbe
    public final /* bridge */ /* synthetic */ Object b(Object obj, bnar bnarVar, boolean z, EnumSet enumSet, fcxy fcxyVar) {
        return g((cprt) obj, bnarVar, z, fcxyVar);
    }

    @Override // defpackage.bzbe
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        cprt cprtVar = (cprt) obj;
        cprtVar.getClass();
        return cprtVar.a().al();
    }

    @Override // defpackage.bzbe
    public final Map e(Collection collection, EnumSet enumSet) {
        bzdd bzddVar;
        collection.getClass();
        enumSet.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(bary.b((String) it.next()));
        }
        final cpsl cpslVar = this.f;
        final List listAo = fcva.ao(arrayList);
        ekgp ekgpVar = (ekgp) cpslVar.i.c("CmsMessageObjectFetcher#fetchCmsMessageObjectData-batch", new ejxr() { // from class: cprv
            @Override // defpackage.ejxr
            public final Object get() {
                ekgp ekgpVar2;
                ekgp ekgpVar3;
                ekgp ekgpVar4;
                ekgp ekgpVar5;
                ekgp ekgpVarJ;
                String str = "JOINED_PARTS_RETRIEVAL_TAG";
                final cpsl cpslVar2 = cpslVar;
                final ParticipantsTable.BindData bindDataB = cpslVar2.b();
                final List list = listAo;
                eieu eieuVarK = eiiy.k("LinkPreviewDatabaseOperations#fetchLinkPreviewDataList");
                try {
                    ecem.b();
                    bpxe bpxeVarB = bpxj.b();
                    bpxeVarB.A("+fetchLinkPreviewDataList");
                    bpxeVarB.e(new Function() { // from class: bbfv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bpxi bpxiVar = (bpxi) obj;
                            ekfw ekfwVar = new ekfw();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ekfwVar.h(String.valueOf(bary.a((MessageIdType) it2.next())));
                            }
                            bpxiVar.ap(new dqpm("link_preview.message_id", 3, bpxi.as(ekfwVar.g()), true));
                            return bpxiVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final ekgp ekgpVar6 = (ekgp) Collection.EL.stream(bpxeVarB.b().z()).collect(ekcv.a(new Function() { // from class: bbfw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bpvd) obj).m();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bbfx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (bpvd) obj;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }));
                    eieuVarK.close();
                    eieu eieuVarK2 = eiiy.k("ConversationSuggestionDatabaseOperations#fetchConversationSuggestionsDataList");
                    try {
                        ecem.b();
                        bofm bofmVarA = bofr.a();
                        bofmVarA.A("+fetchConversationSuggestionsDataList");
                        bofmVarA.c(new Function() { // from class: crgx
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bofq bofqVar = (bofq) obj;
                                ekfw ekfwVar = new ekfw();
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    ekfwVar.h(String.valueOf(bary.a((MessageIdType) it2.next())));
                                }
                                bofqVar.ap(new dqpm("conversation_suggestions.message_id", 3, bofq.as(ekfwVar.g()), true));
                                return bofqVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        Stream stream = Collection.EL.stream(bofmVarA.b().z());
                        Function function = new Function() { // from class: crha
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((bods) obj).m();
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        };
                        Supplier supplier = new Supplier() { // from class: crhb
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new HashMap();
                            }
                        };
                        int i = ekgb.d;
                        final ekgp ekgpVar7 = (ekgp) stream.collect(Collectors.collectingAndThen(Collectors.groupingBy(function, supplier, ekcv.a), new Function() { // from class: crhc
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return (ekgp) Collection.EL.stream(((HashMap) obj).entrySet()).collect(ekcv.a(new Function() { // from class: crhi
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return (MessageIdType) ((Map.Entry) obj2).getKey();
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                }, new Function() { // from class: crgy
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return (List) Collection.EL.stream((ekgb) ((Map.Entry) obj2).getValue()).map(new Function() { // from class: crhg
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                                return Function$CC.$default$andThen(this, function2);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                return crhj.a((bods) obj3).b;
                                            }

                                            public final /* synthetic */ Function compose(Function function2) {
                                                return Function$CC.$default$compose(this, function2);
                                            }
                                        }).collect(Collectors.toCollection(new Supplier() { // from class: crhh
                                            @Override // java.util.function.Supplier
                                            public final Object get() {
                                                return new ArrayList();
                                            }
                                        }));
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                }));
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        }));
                        eieuVarK2.close();
                        csea cseaVar = (csea) cpslVar2.f.b();
                        Stream map = Collection.EL.stream(list).filter(new Predicate() { // from class: cpry
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
                                MessageIdType messageIdType = (MessageIdType) obj;
                                return (messageIdType == null || messageIdType.c()) ? false : true;
                            }
                        }).map(new Function() { // from class: cprz
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return new cspi((MessageIdType) obj);
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        });
                        Collector collector = ekcv.a;
                        final Map mapC = cseaVar.c((List) map.collect(collector));
                        eieu eieuVarK3 = eiiy.k("MessageAnnotationDatabaseOperations#fetchMessageAnnotationDataList");
                        try {
                            ecem.b();
                            bpzs bpzsVarA = bpzx.a();
                            bpzsVarA.A("+fetchMessageAnnotationDataList");
                            bpzsVarA.e(new Function() { // from class: cqyq
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function2) {
                                    return Function$CC.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bpzw bpzwVar = (bpzw) obj;
                                    int iIntValue = bpzx.c().intValue();
                                    if (iIntValue < 20040) {
                                        dqru.x("message_id", iIntValue);
                                    }
                                    List list2 = list;
                                    ekfw ekfwVar = new ekfw();
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        ekfwVar.h(String.valueOf(bary.a((MessageIdType) it2.next())));
                                    }
                                    bpzwVar.ap(new dqpm("messages_annotations.message_id", 3, bpzw.as(ekfwVar.g()), true));
                                    return bpzwVar;
                                }

                                public final /* synthetic */ Function compose(Function function2) {
                                    return Function$CC.$default$compose(this, function2);
                                }
                            });
                            final ekgp ekgpVar8 = (ekgp) Collection.EL.stream(bpzsVarA.b().z()).collect(Collectors.collectingAndThen(Collectors.groupingBy(new Function() { // from class: cqyr
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function2) {
                                    return Function$CC.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((bpyn) obj).n();
                                }

                                public final /* synthetic */ Function compose(Function function2) {
                                    return Function$CC.$default$compose(this, function2);
                                }
                            }, new Supplier() { // from class: cqys
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new HashMap();
                                }
                            }, collector), new Function() { // from class: cqyt
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function2) {
                                    return Function$CC.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return (ekgp) Collection.EL.stream(((HashMap) obj).entrySet()).collect(ekcv.a(new Function() { // from class: cqyu
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function2) {
                                            return Function$CC.$default$andThen(this, function2);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            return (MessageIdType) ((Map.Entry) obj2).getKey();
                                        }

                                        public final /* synthetic */ Function compose(Function function2) {
                                            return Function$CC.$default$compose(this, function2);
                                        }
                                    }, new Function() { // from class: cqyv
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function2) {
                                            return Function$CC.$default$andThen(this, function2);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            bbew bbewVar = new bbew();
                                            bbewVar.d((List) ((Map.Entry) obj2).getValue());
                                            return bbewVar.d;
                                        }

                                        public final /* synthetic */ Function compose(Function function2) {
                                            return Function$CC.$default$compose(this, function2);
                                        }
                                    }));
                                }

                                public final /* synthetic */ Function compose(Function function2) {
                                    return Function$CC.$default$compose(this, function2);
                                }
                            }));
                            eieuVarK3.close();
                            eieu eieuVarK4 = eiiy.k("CmsMessageObjectFetcher#getCmsDatas");
                            try {
                                if (((apom) cpslVar2.l.b()).a() && cpyl.a()) {
                                    fcsu fcsuVar = cpslVar2.g;
                                    ekgpVar2 = ((Optional) fcsuVar.b()).isEmpty() ? ekoj.a : (ekgp) Collection.EL.stream(((cpme) cpslVar2.h.b()).a((Map) ((Optional) fcsuVar.b()).get(), (ekgb) Collection.EL.stream(list).map(new Function() { // from class: cpsc
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function2) {
                                            return Function$CC.$default$andThen(this, function2);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return ((MessageIdType) obj).b();
                                        }

                                        public final /* synthetic */ Function compose(Function function2) {
                                            return Function$CC.$default$compose(this, function2);
                                        }
                                    }).collect(ekcv.a)).entrySet()).collect(ekcv.a(new Function() { // from class: cpsd
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function2) {
                                            return Function$CC.$default$andThen(this, function2);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return bary.b((String) ((Map.Entry) obj).getKey());
                                        }

                                        public final /* synthetic */ Function compose(Function function2) {
                                            return Function$CC.$default$compose(this, function2);
                                        }
                                    }, new Function() { // from class: cpse
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function2) {
                                            return Function$CC.$default$andThen(this, function2);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return (ekgp) ((Map.Entry) obj).getValue();
                                        }

                                        public final /* synthetic */ Function compose(Function function2) {
                                            return Function$CC.$default$compose(this, function2);
                                        }
                                    }));
                                }
                                eieuVarK4.close();
                                ekgp ekgpVar9 = ekgpVar2;
                                eieu eieuVarK5 = eiiy.k("CmsMessageObjectFetcher#getMessagesByIdsMap");
                                try {
                                    ecem.b();
                                    brdr brdrVarD = MessagesTable.d();
                                    brdrVarD.A("+getMessagesByIds");
                                    brdrVarD.h(new Function() { // from class: cpsf
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function2) {
                                            return Function$CC.$default$andThen(this, function2);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            brec brecVar = (brec) obj;
                                            brecVar.t(list);
                                            return brecVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function2) {
                                            return Function$CC.$default$compose(this, function2);
                                        }
                                    });
                                    bsjc bsjcVarB = PartsTable.c().b();
                                    bsgs bsgsVar = PartsTable.d.b;
                                    brao braoVar = MessagesTable.c.a;
                                    dqtr dqtrVarI = dqts.i(bsjcVarB, bsgsVar, braoVar);
                                    ((dqos) dqtrVarI).e = "JOINED_PARTS_RETRIEVAL_TAG";
                                    brdrVarD.H(dqtrVarI.g());
                                    int i2 = 0;
                                    brdrVarD.w(braoVar);
                                    brap brapVar = (brap) brdrVarD.b().p();
                                    try {
                                        ekgi ekgiVar = new ekgi();
                                        while (brapVar.moveToNext()) {
                                            MessagesTable.BindData bindData = (MessagesTable.BindData) brapVar.cQ();
                                            MessageCoreData messageCoreDataA = ((bveg) cpslVar2.j.b()).a();
                                            messageCoreDataA.aN(bindData);
                                            PartsTable.BindData[] bindDataArr = (PartsTable.BindData[]) bindData.aH(str, new PartsTable.BindData[i2]);
                                            ArrayList arrayList2 = new ArrayList();
                                            int length = bindDataArr.length;
                                            String str2 = str;
                                            int i3 = 0;
                                            while (i3 < length) {
                                                int i4 = i3;
                                                arrayList2.add(((bahv) cpslVar2.k.b()).e(bindDataArr[i4]));
                                                i3 = i4 + 1;
                                            }
                                            ((bbae) cpslVar2.c.b()).b(messageCoreDataA, arrayList2, false);
                                            ekgiVar.i(messageCoreDataA.C(), messageCoreDataA);
                                            i2 = 0;
                                            str = str2;
                                        }
                                        ekgp ekgpVarC = ekgiVar.c();
                                        brapVar.close();
                                        eieuVarK5.close();
                                        final boolean zA = cpslVar2.m.a();
                                        if (zA) {
                                            eieuVarK2 = eiiy.k("CmsMessageObjectFetcher#getConversationsForMessages");
                                            try {
                                                final ekhx ekhxVar = (ekhx) Collection.EL.stream(ekgpVarC.values()).map(new Function() { // from class: cpsh
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                                        return Function$CC.$default$andThen(this, function2);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj) {
                                                        return ((MessageCoreData) obj).A();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function2) {
                                                        return Function$CC.$default$compose(this, function2);
                                                    }
                                                }).collect(ekcv.b);
                                                botb botbVarE = botm.e();
                                                botbVarE.A("+getExistingConversations");
                                                botbVarE.i(new Function() { // from class: cpsi
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                                        return Function$CC.$default$andThen(this, function2);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj) {
                                                        botl botlVar = (botl) obj;
                                                        botlVar.u(ekhxVar);
                                                        return botlVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function2) {
                                                        return Function$CC.$default$compose(this, function2);
                                                    }
                                                });
                                                ekgpVar5 = (ekgp) Collection.EL.stream(botbVarE.b().z()).collect(ekcv.a(new Function() { // from class: cpsj
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                                        return Function$CC.$default$andThen(this, function2);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj) {
                                                        return ((bojh) obj).C();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function2) {
                                                        return Function$CC.$default$compose(this, function2);
                                                    }
                                                }, new Function() { // from class: cpsk
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                                        return Function$CC.$default$andThen(this, function2);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj) {
                                                        return (bojh) obj;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function2) {
                                                        return Function$CC.$default$compose(this, function2);
                                                    }
                                                }));
                                                ekrw ekrwVarH = cpsl.a.h();
                                                ekrwVarH.X(eksq.a, "BugleCms");
                                                ekgpVar3 = ekgpVarC;
                                                ekgpVar4 = ekgpVar9;
                                                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsMessageObjectFetcher", "getConversationsForMessages", 248, "CmsMessageObjectFetcher.java")).u("Loaded %d conversations for a page of %d messages", ekgpVar5.size(), ((ekoj) ekgpVar3).d);
                                                eieuVarK2.close();
                                            } finally {
                                            }
                                        } else {
                                            ekgpVar3 = ekgpVarC;
                                            ekgpVar4 = ekgpVar9;
                                            ekgpVar5 = ekoj.a;
                                        }
                                        final ekgp ekgpVar10 = ekgpVar5;
                                        if (zA) {
                                            eieuVarK3 = eiiy.k("CmsMessageObjectFetcher#getParticipantsForMessages");
                                            try {
                                                ekgpVarJ = ekgp.j(((bbca) cpslVar2.d.b()).n((ekhx) Collection.EL.stream(ekgpVar3.values()).filter(new Predicate() { // from class: cprw
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
                                                        return ((MessageCoreData) obj).aB() != null;
                                                    }
                                                }).map(new Function() { // from class: cprx
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                                        return Function$CC.$default$andThen(this, function2);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj) {
                                                        String strAB = ((MessageCoreData) obj).aB();
                                                        strAB.getClass();
                                                        return strAB;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function2) {
                                                        return Function$CC.$default$compose(this, function2);
                                                    }
                                                }).collect(ekcv.b)));
                                                ekrw ekrwVarH2 = cpsl.a.h();
                                                ekrwVarH2.X(eksq.a, "BugleCms");
                                                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsMessageObjectFetcher", "getParticipantsForMessages", 268, "CmsMessageObjectFetcher.java")).u("Loaded %d participants for a page of %d messages", ekgpVarJ.size(), ((ekoj) ekgpVar3).d);
                                                eieuVarK3.close();
                                            } finally {
                                            }
                                        } else {
                                            ekgpVarJ = ekoj.a;
                                        }
                                        final ekgp ekgpVar11 = ekgpVarJ;
                                        final ekgp ekgpVar12 = ekgpVar4;
                                        return (ekgp) Collection.EL.stream(ekgpVar3.entrySet()).collect(ekcv.a(new Function() { // from class: cpsa
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                                return Function$CC.$default$andThen(this, function2);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                return (MessageIdType) ((Map.Entry) obj).getKey();
                                            }

                                            public final /* synthetic */ Function compose(Function function2) {
                                                return Function$CC.$default$compose(this, function2);
                                            }
                                        }, new Function() { // from class: cpsb
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                                return Function$CC.$default$andThen(this, function2);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                ekgp ekgpVarE;
                                                Map.Entry entry = (Map.Entry) obj;
                                                MessageIdType messageIdType = (MessageIdType) entry.getKey();
                                                MessageCoreData messageCoreData = (MessageCoreData) entry.getValue();
                                                cpsl cpslVar3 = cpslVar2;
                                                if (((apom) cpslVar3.l.b()).a() && cpyl.a()) {
                                                    ekgp ekgpVar13 = ekgpVar12;
                                                    if (ekgpVar13 != null) {
                                                        ekgpVarE = (ekgp) ekgpVar13.get(messageIdType);
                                                        ekgpVarE.getClass();
                                                    } else {
                                                        ekgpVarE = cpslVar3.e(messageIdType);
                                                    }
                                                } else {
                                                    ekgpVarE = ekoj.a;
                                                }
                                                ekgp ekgpVar14 = ekgpVarE;
                                                Map map2 = ekgpVar7;
                                                bpvd bpvdVar = (bpvd) ekgpVar6.get(messageIdType);
                                                List arrayList3 = map2.containsKey(messageIdType) ? (List) map2.get(messageIdType) : new ArrayList();
                                                Map map3 = mapC;
                                                List arrayList4 = map3.containsKey(messageIdType) ? (List) map3.get(messageIdType) : new ArrayList();
                                                Map map4 = ekgpVar8;
                                                List arrayList5 = map4.containsKey(messageIdType) ? (List) map4.get(messageIdType) : new ArrayList();
                                                boolean z = zA;
                                                return cpslVar3.d(messageCoreData, bindDataB, bpvdVar, arrayList3, arrayList4, ekgpVar14, arrayList5, z ? (ParticipantsTable.BindData) ekgpVar11.get(messageCoreData.aB()) : cpslVar3.c(messageCoreData.aB()), z ? (bojh) ekgpVar10.get(messageCoreData.A()) : cpslVar3.a(messageCoreData.A()));
                                            }

                                            public final /* synthetic */ Function compose(Function function2) {
                                                return Function$CC.$default$compose(this, function2);
                                            }
                                        }));
                                    } finally {
                                    }
                                } finally {
                                    try {
                                        eieuVarK5.close();
                                        throw th;
                                    } catch (Throwable th) {
                                        th.addSuppressed(th);
                                    }
                                }
                            } finally {
                                try {
                                    eieuVarK4.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        } finally {
                            try {
                                eieuVarK3.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                    } finally {
                        try {
                            eieuVarK2.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                    }
                } finally {
                    try {
                        eieuVarK.close();
                        throw th;
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                    }
                }
            }
        });
        ekgpVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(ekgpVar.size()));
        for (Map.Entry entry : ekgpVar.entrySet()) {
            linkedHashMap.put(((MessageIdType) entry.getKey()).b(), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fcwa.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            cprt cprtVar = (cprt) entry2.getValue();
            cprtVar.getClass();
            h(cprtVar);
            linkedHashMap2.put(key, new fctk(cprtVar));
        }
        Set setE = fcwm.e(fcva.av(collection), linkedHashMap2.keySet());
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(setE, 10)), 16));
        for (Object obj : setE) {
            String str = (String) obj;
            if (((appk) this.e.b()).a()) {
                str.getClass();
                bzddVar = new bzdd(str, this.d);
            } else {
                str.getClass();
                bzddVar = new bzdd(str);
            }
            linkedHashMap3.put(obj, new fctk(fctl.a(bzddVar)));
        }
        return fcwa.j(linkedHashMap2, linkedHashMap3);
    }

    @Override // defpackage.bzbe
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cprt c(final String str, EnumSet enumSet) throws X {
        str.getClass();
        enumSet.getClass();
        ecem.b();
        Object objOrElseThrow = this.f.f(bary.b(str)).orElseThrow(new Supplier() { // from class: bzdu
            @Override // java.util.function.Supplier
            public final Object get() {
                bzdx bzdxVar = this.a;
                boolean zA = ((appk) bzdxVar.e.b()).a();
                String str2 = str;
                return zA ? new bzdd(str2, bzdxVar.d) : new bzdd(str2);
            }
        });
        cprt cprtVar = (cprt) objOrElseThrow;
        cprtVar.getClass();
        h(cprtVar);
        objOrElseThrow.getClass();
        return cprtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cprt r11, defpackage.bnar r12, boolean r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.bzdw
            if (r0 == 0) goto L13
            r0 = r14
            bzdw r0 = (defpackage.bzdw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzdw r0 = new bzdw
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r14)
            goto L4b
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.fctl.b(r14)
            fcyh r14 = r10.g
            fcyh r14 = defpackage.eicg.a(r14)
            bzdv r4 = new bzdv
            r5 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r14 = defpackage.fdin.a(r14, r4, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            r14.getClass()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzdx.g(cprt, bnar, boolean, fcxy):java.lang.Object");
    }
}
