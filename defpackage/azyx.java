package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azyx implements azvn {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/messages/CombinedMessagesWriterWorkflowSteps");
    public final fcsu a;
    public final Map b = new LinkedHashMap();
    public final List c;
    private final fdjx e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final azvz k;
    private final azvz l;

    public azyx(fdjx fdjxVar, fcsu fcsuVar, azvp azvpVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, azvv azvvVar) {
        this.e = fdjxVar;
        this.a = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        final boolean z = azvvVar.a;
        Map map = baba.a;
        this.k = new azvz(azxx.a, azvpVar, new fcsu() { // from class: baaz
            @Override // defpackage.fcsu
            public final Object b() {
                Map map2 = baba.a;
                fcww fcwwVar = new fcww((byte[]) null);
                azkz azkzVarA = azlc.a();
                azkzVarA.A("duplicateMessagePersistenceIdQuery");
                azkzVarA.v();
                azji azjiVar = azlc.c;
                azjj azjjVar = azjiVar.a;
                azkzVarA.n(new dqxl("$V", new Object[]{azjjVar}), "backup_id");
                bran branVar = MessagesTable.c;
                brao braoVar = branVar.a;
                azkzVarA.n(new dqxl("$V{J:bugle_messages}", new Object[]{braoVar}), "bugle_id");
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.v();
                dqtr dqtrVarI = dqts.i(brdrVarD.b(), branVar.ar, azjiVar.b);
                ((dqos) dqtrVarI).e = "bugle_messages";
                fcwwVar.add((azkz) azkzVarA.j(dqtrVarI));
                azkz azkzVarA2 = azlc.a();
                azkzVarA2.A("duplicateCmsIdQuery");
                azkzVarA2.v();
                azkzVarA2.n(new dqxl("$V", new Object[]{azjjVar}), "backup_id");
                azkzVarA2.n(new dqxl("$V{J:bugle_messages}", new Object[]{braoVar}), "bugle_id");
                fcwwVar.add(baal.d(azkzVarA2, branVar.M, azjiVar.A));
                azkz azkzVarA3 = azlc.a();
                azkzVarA3.A("duplicateRcsIdQuery");
                azkzVarA3.v();
                azkzVarA3.n(new dqxl("$V", new Object[]{azjjVar}), "backup_id");
                azkzVarA3.n(new dqxl("$V{J:bugle_messages}", new Object[]{braoVar}), "bugle_id");
                fcwwVar.add(baal.d(azkzVarA3, branVar.C, azjiVar.y));
                azkz azkzVarA4 = azlc.a();
                azkzVarA4.A("duplicateTombstone");
                azkzVarA4.v();
                azkzVarA4.n(new dqxl("$V", new Object[]{azjjVar}), "backup_id");
                boolean z2 = z;
                azkzVarA4.n(new dqxl("$V{J:bugle_messages}", new Object[]{braoVar}), "bugle_id");
                azkz azkzVarC = baal.c(azkzVarA4, new fdap[0]);
                azlb azlbVar = new azlb();
                azjj azjjVar2 = azjiVar.d;
                azlbVar.ar(new dqxl("($V >= 200) AND ($V = $V{J:bugle_messages})", new Object[]{azjjVar2, azjjVar2, branVar.k}));
                azkzVarC.d(azlbVar);
                fcwwVar.add(azkzVarC);
                if (z2) {
                    fcwwVar.add(baal.b(false));
                    fcwwVar.add(baal.a(false));
                    fcwwVar.add(baal.b(true));
                    fcwwVar.add(baal.a(true));
                }
                return fcva.a(fcwwVar);
            }
        }, baba.a, null, baba.b, 0, baba.c, 80);
        final boolean z2 = azvvVar.b;
        Map map2 = babi.a;
        this.l = new azvz(azxy.a, azyi.a, new fcsu() { // from class: babh
            @Override // defpackage.fcsu
            public final Object b() {
                char c;
                int i;
                Map map3 = babi.a;
                fcww fcwwVar = new fcww((byte[]) null);
                if (z2) {
                    dqxe dqxeVar = babe.a;
                    aznp aznpVarA = azns.a();
                    aznpVarA.A("duplicatePartsByPartOrderQuery");
                    aznpVarA.v();
                    azmp azmpVar = azns.c;
                    aznpVarA.n(new dqxl("$V", new Object[]{azmpVar.a}), "backup_id");
                    bsgr bsgrVar = PartsTable.d;
                    aznpVarA.n(new dqxl("$V{J:bugle_parts}", new Object[]{bsgrVar.a}), "bugle_id");
                    String[] strArr = bmkn.a;
                    bmki bmkiVar = new bmki(bmkn.a);
                    bmkiVar.v();
                    bmkiVar.d(new Function() { // from class: babb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bmkm bmkmVar = (bmkm) obj;
                            dqxe dqxeVar2 = babe.a;
                            bmkmVar.g(azvt.b.a);
                            bmkmVar.c(-1L);
                            return bmkmVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsje bsjeVarC = PartsTable.c();
                    bsjeVarC.v();
                    bsjeVarC.h(new Function() { // from class: babc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsjl bsjlVar = (bsjl) obj;
                            dqxe dqxeVar2 = babe.a;
                            bsjlVar.ar(new dqxl("($V) = ($V)", new Object[]{babe.b, babe.a}));
                            bsjlVar.ar(new dqxl("($V) = ($V)", new Object[]{babe.d, babe.c}));
                            bsgr bsgrVar2 = PartsTable.d;
                            bsjlVar.ar(new dqxl("$V{J:bugle_parts} <> $V", new Object[]{bsgrVar2.f, "text/plain"}));
                            bsgs bsgsVar = bsgrVar2.e;
                            bsjlVar.ar(new dqxl("($V{J:bugle_parts} IS NULL OR $V{J:bugle_parts} = \"\")", new Object[]{bsgsVar, bsgsVar}));
                            return bsjlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsjc bsjcVarB = bsjeVarC.b();
                    bsgs bsgsVar = bsgrVar.b;
                    bmjt bmjtVar = bmkn.c;
                    bmju bmjuVar = bmjtVar.d;
                    bsjl bsjlVar = new bsjl();
                    c = 0;
                    i = 1;
                    bsjlVar.ar(new dqxl("$V = $V{J:bugle_parts}", new Object[]{azmpVar.c, bsgrVar.f}));
                    dqtr dqtrVarT = bsjcVarB.t(bsgsVar, bmjuVar, new bsji(bsjlVar));
                    ((dqos) dqtrVarT).e = "bugle_parts";
                    dqtr dqtrVarI = dqts.i(((bmki) bmkiVar.j(dqtrVarT)).b(), bmjtVar.c, azmpVar.b);
                    ((dqos) dqtrVarI).e = "message_id_map";
                    fcwwVar.add((aznp) aznpVarA.j(dqtrVarI));
                } else {
                    c = 0;
                    i = 1;
                }
                dqxe dqxeVar2 = babe.a;
                aznp aznpVarA2 = azns.a();
                aznpVarA2.A("parentMessageWasADuplicateQuery");
                aznpVarA2.v();
                azmp azmpVar2 = azns.c;
                int i2 = i;
                Object[] objArr = new Object[i2];
                objArr[c] = azmpVar2.a;
                aznpVarA2.n(new dqxl("$V", objArr), "backup_id");
                Object[] objArr2 = new Object[i2];
                objArr2[c] = -1;
                aznpVarA2.n(new dqxl("$V", objArr2), "bugle_id");
                String[] strArr2 = bmkn.a;
                bmki bmkiVar2 = new bmki(bmkn.a);
                bmkiVar2.v();
                bmkiVar2.d(new Function() { // from class: babd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bmkm bmkmVar = (bmkm) obj;
                        dqxe dqxeVar3 = babe.a;
                        bmkmVar.g(azvt.b.a);
                        bmkmVar.c(-1L);
                        return bmkmVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                fcwwVar.add((aznp) aznpVarA2.j(dqts.i(bmkiVar2.b(), bmkn.c.c, azmpVar2.b)));
                return fcva.a(fcwwVar);
            }
        }, babi.a, babi.c, babi.b, 0, babi.d, 64);
        this.c = fcva.g(1L, 2L, 3L);
    }

    @Override // defpackage.azvn
    public final int a() {
        return this.k.a();
    }

    @Override // defpackage.azvn
    public final void b(dqws dqwsVar) {
        azkz azkzVarA = azlc.a();
        azkzVarA.v();
        azji azjiVar = azlc.c;
        azkzVarA.D((String) DesugarArrays.stream(new azkw[]{new azkw(azjiVar.m)}).map(new Function() { // from class: azky
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((azkw) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        azkzVarA.n(new dqxl("$V", new Object[]{azjiVar.a}), "backup_id");
        this.k.b(azkzVarA);
        this.l.b(null);
        azzx.a.b(null);
        azzn.a.b(null);
        azzu.c.b(null);
        if (((aqlq) this.f.b()).a()) {
            azzb.a.b(null);
        }
        if (((arjm) this.i.b()).a()) {
            azzi.c.b(null);
        }
        if (((arjn) this.j.b()).a()) {
            babl.a.b(null);
        }
    }

    @Override // defpackage.azvn
    public final void c(ahzu ahzuVar) {
        this.k.c(ahzuVar);
        this.l.c(ahzuVar);
        azzx.a.c(ahzuVar);
        azzn.a.c(ahzuVar);
        azzu.c.c(ahzuVar);
        if (((aqlq) this.f.b()).a()) {
            azzb.a.c(ahzuVar);
        }
        if (((arjm) this.i.b()).a()) {
            azzi.c.c(ahzuVar);
        }
        if (((arjn) this.j.b()).a()) {
            babl.a.c(ahzuVar);
        }
    }

    @Override // defpackage.azvn
    public final void d(ahzu ahzuVar) {
        this.k.d(ahzuVar);
        this.l.d(ahzuVar);
        azzx.a.d(ahzuVar);
        azzn.a.d(ahzuVar);
        azzu.c.d(ahzuVar);
        if (((aqlq) this.f.b()).a()) {
            azzb.a.d(ahzuVar);
        }
        if (((arjm) this.i.b()).a()) {
            azzi.c.d(ahzuVar);
        }
        if (((arjn) this.j.b()).a()) {
            babl.a.d(ahzuVar);
        }
        if (((arjl) this.g.b()).a()) {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("orderedConversationsInThisBatchQuery");
            bran branVar = MessagesTable.c;
            brdrVarD.c(branVar.b);
            brdrVarD.u();
            brdrVarD.d(new brdo(branVar.i, false));
            String[] strArr = bmkn.a;
            bmki bmkiVar = new bmki(bmkn.a);
            bmkiVar.v();
            bmkiVar.d(new Function() { // from class: azyo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmkm bmkmVar = (bmkm) obj;
                    bmkmVar.g(azvt.b.a);
                    bmkmVar.c(1L);
                    return bmkmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dqtr dqtrVarI = dqts.i(bmkiVar.b(), bmkn.c.d, branVar.a);
            dqtrVarI.d(true);
            ekgb ekgbVarZ = ((brdr) brdrVarD.j(dqtrVarI)).b().z();
            ekgbVarZ.getClass();
            ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
            Iterator<E> it = ekgbVarZ.iterator();
            while (it.hasNext()) {
                arrayList.add(((MessagesTable.BindData) it.next()).D());
            }
            Iterator it2 = fcva.ab(arrayList).iterator();
            while (it2.hasNext()) {
                Map.EL.putIfAbsent(this.b, (ConversationIdType) it2.next(), false);
            }
            return;
        }
        brdr brdrVarD2 = MessagesTable.d();
        brdrVarD2.A("conversationsInThisBatchQuery");
        bran branVar2 = MessagesTable.c;
        brdrVarD2.c(branVar2.b);
        String[] strArr2 = bmkn.a;
        bmki bmkiVar2 = new bmki(bmkn.a);
        bmkiVar2.v();
        bmkiVar2.d(new Function() { // from class: azyu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.g(azvt.b.a);
                bmkmVar.c(1L);
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI2 = dqts.i(bmkiVar2.b(), bmkn.c.d, branVar2.a);
        dqtrVarI2.d(true);
        ekgb ekgbVarZ2 = ((brdr) brdrVarD2.j(dqtrVarI2)).b().z();
        ekgbVarZ2.getClass();
        ArrayList arrayList2 = new ArrayList(fcva.p(ekgbVarZ2, 10));
        Iterator<E> it3 = ekgbVarZ2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((MessagesTable.BindData) it3.next()).D());
        }
        List listAb = fcva.ab(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listAb) {
            if (!this.b.keySet().contains((ConversationIdType) obj)) {
                arrayList3.add(obj);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            this.b.put((ConversationIdType) it4.next(), false);
        }
    }

    @Override // defpackage.azvn
    public final void e(ahzu ahzuVar) {
        if (!((arjl) this.g.b()).a()) {
            auvw.k(this.e, null, null, new azyw(this, null), 3);
            return;
        }
        int i = 0;
        if (ahzuVar != null) {
            java.util.Map map = this.b;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                        i++;
                    }
                }
            }
            ahzuVar.e("conversations in need of refresh: [%s]", Integer.valueOf(i));
        } else {
            ekrw ekrwVarG = d.g();
            ekrwVarG.X(eksq.a, "BugleRestore");
            ekrd ekrdVar = (ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/messages/CombinedMessagesWriterWorkflowSteps", "postBatchWork", 308, "BatchedMessageRestoreTableWriter.kt");
            java.util.Map map2 = this.b;
            if (!map2.isEmpty()) {
                Iterator it2 = map2.entrySet().iterator();
                while (it2.hasNext()) {
                    if (!((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                        i++;
                    }
                }
            }
            ekrdVar.r("conversations in need of refresh: [%s]", i);
        }
        int iLongValue = (int) ((Number) this.h.b()).longValue();
        java.util.Map map3 = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map3.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List listAm = fcva.am(linkedHashMap.keySet(), iLongValue);
        ((azxa) this.a.b()).c(ekfv.a(listAm));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(listAm, 10)), 16));
        for (Object obj : listAm) {
            linkedHashMap2.put(obj, true);
        }
        map3.putAll(linkedHashMap2);
    }

    @Override // defpackage.azvn
    public final void f() {
        this.k.f();
        this.l.f();
        azzx.a.f();
        azzn.a.f();
        azzu.c.f();
        if (((aqlq) this.f.b()).a()) {
            azzb.a.f();
        }
        if (((arjm) this.i.b()).a()) {
            azzi.c.f();
        }
        if (((arjn) this.j.b()).a()) {
            babl.a.f();
        }
    }

    @Override // defpackage.azvn
    public final void g(int i, dqxe dqxeVar) {
        this.k.g(i, null);
        aznp aznpVarA = azns.a();
        azmp azmpVar = azns.c;
        azmq azmqVar = azmpVar.b;
        azmq azmqVar2 = azmpVar.a;
        azwc azwcVar = azvt.b;
        this.l.g(i, azvt.a(aznpVarA, azmqVar, azmqVar2, azwcVar, azvt.d));
        String[] strArr = azgl.a;
        azgi azgiVar = new azgi(azgl.a);
        azfv azfvVar = azgl.c;
        azzx.a.g(i, azvt.a(azgiVar, azfvVar.b, azfvVar.a, azwcVar, azvt.g));
        String[] strArr2 = bmkn.a;
        String[] strArr3 = bmkn.a;
        bmki bmkiVar = new bmki(strArr3);
        bmjt bmjtVar = bmkn.c;
        bmju bmjuVar = bmjtVar.c;
        bmju bmjuVar2 = bmjtVar.a;
        bmkiVar.c(bmjuVar, bmjuVar2);
        bmkiVar.d(new Function() { // from class: azyv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.g(azvt.i.a);
                bmkmVar.c(0L);
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String[] strArr4 = azdx.a;
        azdu azduVar = new azdu(azdx.a);
        azduVar.v();
        bmki bmkiVar2 = new bmki(strArr3);
        bmkiVar2.v();
        bmkiVar2.d(new Function() { // from class: azyl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                final azyx azyxVar = this.a;
                bmkmVar.b(new Function() { // from class: azyk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bmkm bmkmVar2 = (bmkm) obj2;
                        bmkmVar2.d(azyxVar.c);
                        return bmkmVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: azyn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bmkm bmkmVar2 = (bmkm) obj2;
                        bmkmVar2.h();
                        return bmkmVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bmkh bmkhVarB = bmkiVar2.b();
        azdd azddVar = azdx.c;
        azde azdeVar = azddVar.d;
        bmkm bmkmVar = new bmkm();
        bmkmVar.g(azwcVar.a);
        dqtr dqtrVarT = bmkhVarB.t(bmjuVar, azdeVar, new bmkl(bmkmVar));
        ((dqos) dqtrVarT).e = "reacted_message_id_map";
        azduVar.G(dqtrVarT);
        bmki bmkiVar3 = new bmki(strArr3);
        bmkiVar3.v();
        bmkiVar3.d(new Function() { // from class: azym
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar2 = (bmkm) obj;
                bmkmVar2.g(azvt.b.a);
                bmkmVar2.d(this.a.c);
                return bmkmVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI = dqts.i(bmkiVar3.b(), bmjuVar, azddVar.b);
        ((dqos) dqtrVarI).e = "message_id_map";
        dqtr dqtrVarI2 = dqts.i(((azdu) azduVar.j(dqtrVarI)).b(), azddVar.a, bmjuVar);
        ((dqos) dqtrVarI2).e = "reactions_id_map";
        azzn.a.g(i, ((bmki) bmkiVar.j(dqtrVarI2)).b());
        azzu.c.g(i, null);
        if (((aqlq) this.f.b()).a()) {
            String[] strArr5 = azbe.a;
            azbb azbbVar = new azbb(azbe.a);
            azai azaiVar = azbe.c;
            azzb.a.g(i, azvt.a(azbbVar, azaiVar.b, azaiVar.a, azwcVar, azvt.m));
        }
        if (((arjm) this.i.b()).a()) {
            azzi.c.g(i, null);
        }
        if (((arjn) this.j.b()).a()) {
            bmki bmkiVar4 = new bmki(strArr3);
            bmkiVar4.c(bmjuVar, bmjuVar2);
            bmkiVar4.d(new Function() { // from class: azyp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmkm bmkmVar2 = (bmkm) obj;
                    bmkmVar2.g(azvt.l.a);
                    bmkmVar2.c(0L);
                    return bmkmVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            String[] strArr6 = azph.a;
            azpe azpeVar = new azpe(azph.a);
            azpeVar.v();
            bmki bmkiVar5 = new bmki(strArr3);
            bmkiVar5.v();
            bmkiVar5.d(new Function() { // from class: azyq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmkm bmkmVar2 = (bmkm) obj;
                    bmkmVar2.g(azvt.b.a);
                    bmkmVar2.d(this.a.c);
                    return bmkmVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bmkh bmkhVarB2 = bmkiVar5.b();
            azoo azooVar = azph.c;
            dqtr dqtrVarI3 = dqts.i(bmkhVarB2, bmjuVar, azooVar.b);
            ((dqos) dqtrVarI3).e = "message_id_map";
            azpe azpeVar2 = (azpe) azpeVar.j(dqtrVarI3);
            bmki bmkiVar6 = new bmki(strArr3);
            bmkiVar6.v();
            bmkiVar6.d(new Function() { // from class: azyr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmkm bmkmVar2 = (bmkm) obj;
                    final azyx azyxVar = this.a;
                    bmkmVar2.b(new Function() { // from class: azys
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bmkm bmkmVar3 = (bmkm) obj2;
                            bmkmVar3.g(azvt.c.a);
                            return bmkmVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: azyt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bmkm bmkmVar3 = (bmkm) obj2;
                            bmkmVar3.d(azyxVar.c);
                            return bmkmVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return bmkmVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bmkh bmkhVarB3 = bmkiVar6.b();
            azop azopVar = azooVar.c;
            bmkm bmkmVar2 = new bmkm();
            bmkmVar2.g(azvt.c.a);
            dqtr dqtrVarT2 = bmkhVarB3.t(bmjuVar, azopVar, new bmkl(bmkmVar2));
            ((dqos) dqtrVarT2).e = "participant_id_map";
            dqtr dqtrVarI4 = dqts.i(((azpe) azpeVar2.j(dqtrVarT2)).b(), azooVar.a, bmjuVar);
            ((dqos) dqtrVarI4).e = "read_reports_id_map";
            babl.a.g(i, ((bmki) bmkiVar4.j(dqtrVarI4)).b());
        }
    }
}
