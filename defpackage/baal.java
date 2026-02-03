package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baal {
    public static final azkz a(boolean z) {
        if (z) {
            return f(btts.c);
        }
        azkz azkzVarA = azlc.a();
        azkzVarA.v();
        azji azjiVar = azlc.c;
        azkzVarA.n(new dqxl("$V", new Object[]{azjiVar.a}), "backup_id");
        azkzVarA.n(new dqxl("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
        azkz azkzVarC = c(azkzVarA, new fdap() { // from class: azzz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                brdr brdrVar = (brdr) obj;
                brdrVar.getClass();
                bsbo bsboVarE = ParticipantsTable.e();
                bsboVarE.v();
                dqtr dqtrVarI = dqts.i(bsboVarE.b(), ParticipantsTable.c.a, MessagesTable.c.c);
                ((dqos) dqtrVarI).e = "bugle_participant";
                return (brdr) brdrVar.j(dqtrVarI);
            }
        }, new fdap() { // from class: baaa
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                brdr brdrVar = (brdr) obj;
                brdrVar.getClass();
                String[] strArr = btuu.a;
                btur bturVar = new btur(btuu.a);
                bturVar.A("joinWithRestoreScratchForDestinationSuffix");
                bturVar.c(new Function() { // from class: baag
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        btut btutVar = (btut) obj2;
                        btutVar.b(bvde.a);
                        return btutVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                dqtr dqtrVarI = dqts.i(bturVar.b(), btuu.b.b, MessagesTable.c.c);
                ((dqos) dqtrVarI).e = "bugle_suffix_scratch";
                return (brdr) brdrVar.j(dqtrVarI);
            }
        });
        azuq azuqVarA = azut.a();
        azuqVarA.v();
        azup azupVarB = azuqVarA.b();
        azto aztoVar = azut.c.a;
        azjj azjjVar = azjiVar.h;
        dqtr dqtrVarI = dqts.i(azupVarB, aztoVar, azjjVar);
        ((dqos) dqtrVarI).e = "backup_participant";
        azkz azkzVar = (azkz) azkzVarC.j(dqtrVarI);
        String[] strArr = btuu.a;
        btur bturVar = new btur(btuu.a);
        bturVar.A("joinWithRestoreScratchForDestinationSuffix");
        bturVar.c(new Function() { // from class: azzy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btut btutVar = (btut) obj;
                btutVar.b(bvde.b);
                return btutVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI2 = dqts.i(bturVar.b(), btuu.b.b, azjjVar);
        ((dqos) dqtrVarI2).e = "backup_suffix_scratch";
        azkz azkzVar2 = (azkz) azkzVar.j(dqtrVarI2);
        azlb azlbVar = new azlb();
        Function[] functionArr = {new Function() { // from class: baae
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                azlb azlbVar2 = (azlb) obj;
                btuf btufVar = btuu.b.c;
                azlbVar2.ar(new dqxl("$V{J:backup_suffix_scratch} = $V{J:bugle_suffix_scratch}", new Object[]{btufVar, btufVar}));
                return azlbVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: baaf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                azlb azlbVar2 = (azlb) obj;
                azlbVar2.ar(new dqxl("$V{J:backup_participant} = 1 AND  $V{J:bugle_participant} <> -2", new Object[]{azut.c.h, ParticipantsTable.c.d}));
                return azlbVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }};
        azlb[] azlbVarArr = new azlb[2];
        for (int i = 0; i < 2; i++) {
            azlbVarArr[i] = (azlb) functionArr[i].apply(new azlb());
        }
        azlbVar.aq(azlbVarArr);
        azkzVar2.d(azlbVar);
        azkzVar2.k(new azla((azlb) new Function() { // from class: baab
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                azlb azlbVar2 = (azlb) obj;
                azlbVar2.ap(new dqty("messages_backup.received_timestamp", 7, 0L));
                return azlbVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new azlb())));
        return azkzVar2;
    }

    public static final azkz b(boolean z) {
        if (z) {
            return f(btts.b);
        }
        azkz azkzVarA = azlc.a();
        azkzVarA.v();
        azjj azjjVar = azlc.c.a;
        azkzVarA.n(new dqxl("$V", new Object[]{azjjVar}), "backup_id");
        azkzVarA.n(new dqxl("$V{J:bugle_messages}", new Object[]{MessagesTable.c.a}), "bugle_id");
        azkz azkzVarC = c(azkzVarA, new fdap() { // from class: baad
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                brdr brdrVar = (brdr) obj;
                brdrVar.getClass();
                bsje bsjeVarC = PartsTable.c();
                bsjeVarC.v();
                dqtr dqtrVarI = dqts.i(bsjeVarC.b(), PartsTable.d.b, MessagesTable.c.a);
                ((dqos) dqtrVarI).e = "bugle_parts";
                return (brdr) brdrVar.j(dqtrVarI);
            }
        });
        aznp aznpVarA = azns.a();
        aznpVarA.v();
        aznpVarA.c(new Function() { // from class: baaj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aznr aznrVar = (aznr) obj;
                aznrVar.b();
                return aznrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        azno aznoVarB = aznpVarA.b();
        azmp azmpVar = azns.c;
        dqtr dqtrVarI = dqts.i(aznoVarB, azmpVar.b, azjjVar);
        ((dqos) dqtrVarI).e = "backup_parts";
        azkz azkzVar = (azkz) azkzVarC.j(dqtrVarI);
        azlb azlbVar = new azlb();
        azlbVar.ar(new dqxl("$V{J:backup_parts} = $V{J:bugle_parts}", new Object[]{azmpVar.e, PartsTable.d.c}));
        azkzVar.d(azlbVar);
        return azkzVar;
    }

    public static final azkz c(azkz azkzVar, fdap... fdapVarArr) {
        brdr brdrVarE = e();
        for (fdap fdapVar : fdapVarArr) {
            fdapVar.invoke(brdrVarE);
        }
        dqtr dqtrVarI = dqts.i(brdrVarE.b(), MessagesTable.c.i, azlc.c.m);
        ((dqos) dqtrVarI).e = "bugle_messages";
        return (azkz) azkzVar.j(dqtrVarI);
    }

    public static final azkz d(azkz azkzVar, brao braoVar, azjj azjjVar) {
        dqtr dqtrVarI = dqts.i(e().b(), braoVar, azjjVar);
        ((dqos) dqtrVarI).e = "bugle_messages";
        return (azkz) azkzVar.j(dqtrVarI);
    }

    public static final brdr e() {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("messagesTableQueryBuilder");
        brdrVarD.v();
        String[] strArr = bmkn.a;
        bmki bmkiVar = new bmki(bmkn.a);
        bmkiVar.v();
        bmkiVar.d(new Function() { // from class: baac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.b(new Function() { // from class: baah
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bmkm bmkmVar2 = (bmkm) obj2;
                        bmkmVar2.ap(new dqty("backup_id_map.status", 2, 2L));
                        return bmkmVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: baai
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bmkm bmkmVar2 = (bmkm) obj2;
                        bmkmVar2.ap(new dqpn("backup_id_map.status", 5));
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
        bmkh bmkhVarB = bmkiVar.b();
        bmju bmjuVar = bmkn.c.d;
        brao braoVar = MessagesTable.c.a;
        bmkm bmkmVar = new bmkm();
        bmkmVar.g(azvt.b.a);
        brdrVarD.G(bmkhVarB.t(bmjuVar, braoVar, new bmkl(bmkmVar)));
        return brdrVarD;
    }

    private static final azkz f(final btts bttsVar) {
        azkz azkzVarA = azlc.a();
        azkzVarA.A("queryScratchTableForPrecomputedDuplicates");
        azkzVarA.v();
        azjj azjjVar = azlc.c.a;
        azkzVarA.n(new dqxl("$V", new Object[]{azjjVar}), "backup_id");
        bttb bttbVar = bttr.b;
        azkzVarA.n(new dqxl("$V{J:scratch_duplicates}", new Object[]{bttbVar.c}), "bugle_id");
        btto bttoVar = new btto(bttr.a);
        bttoVar.v();
        bttoVar.c(new Function() { // from class: baak
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bttq bttqVar = (bttq) obj;
                bttqVar.b(bttsVar);
                return bttqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqtr dqtrVarI = dqts.i(bttoVar.b(), bttbVar.b, azjjVar);
        ((dqos) dqtrVarI).e = "scratch_duplicates";
        return (azkz) azkzVarA.j(dqtrVarI);
    }
}
