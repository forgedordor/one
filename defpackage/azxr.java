package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.File;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxr implements ayso {
    public final aysy b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final ayrn f;
    public final aqlt g;
    public final fcsu h;
    public final ahzu i;
    private final babs k;
    private final azwm l;
    private final azyb m;
    private final fdjx n;
    private static final ekrg j = ekrg.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/impl/DatabaseRestorerImpl");
    public static final feav a = new feaz();

    public azxr(babs babsVar, azwm azwmVar, azyb azybVar, aysy aysyVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar, ayrn ayrnVar, aqlt aqltVar, ahzv ahzvVar, fcsu fcsuVar4) {
        aysyVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        ayrnVar.getClass();
        ahzvVar.getClass();
        fcsuVar4.getClass();
        this.k = babsVar;
        this.l = azwmVar;
        this.m = azybVar;
        this.b = aysyVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.n = fdjxVar;
        this.f = ayrnVar;
        this.g = aqltVar;
        this.h = fcsuVar4;
        this.i = ahzvVar.a(j, null, null);
    }

    @Override // defpackage.ayso
    public final Object a(File file, azvv azvvVar, fcxy fcxyVar) {
        this.i.g("Starting restoreFromBackupDatabase");
        Object objA = fdin.a(eicg.a(this.n.hE()), new azxo(null, this, file, azvvVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final void b(azvv azvvVar) {
        babs babsVar = this.k;
        ahzv ahzvVar = (ahzv) babsVar.b.b();
        ahzvVar.getClass();
        ((fdjx) babsVar.d.b()).getClass();
        ((arjk) babsVar.e.b()).getClass();
        final babr babrVar = new babr(babsVar.a, ahzvVar, babsVar.c);
        azwm azwmVar = this.l;
        fdjx fdjxVar = (fdjx) azwmVar.c.b();
        fdjxVar.getClass();
        ahzv ahzvVar2 = (ahzv) azwmVar.d.b();
        ahzvVar2.getClass();
        final azwl azwlVar = new azwl(azwmVar.a, azwmVar.b, fdjxVar, ahzvVar2, azwmVar.e);
        azyb azybVar = this.m;
        azyy azyyVar = (azyy) azybVar.b.b();
        azyyVar.getClass();
        ahzv ahzvVar3 = (ahzv) azybVar.d.b();
        ahzvVar3.getClass();
        final azya azyaVar = new azya(azybVar.a, azyyVar, azybVar.c, ahzvVar3, azvvVar);
        ahzu ahzuVar = this.i;
        ahzuVar.g("Restoring participants table");
        ahzuVar.h("Participants restore time: [%s]ms", Long.valueOf(fdhi.g(ayrq.c("DatabaseRestorerImpl::restoreFromBackupDatabase#participantsTable", new fdae() { // from class: azxl
            @Override // defpackage.fdae
            public final Object invoke() {
                azvl azvlVar = babrVar.a;
                azvlVar.b();
                azvlVar.c((int) ((Number) this.d.b()).longValue());
                return fctx.a;
            }
        }))));
        ahzuVar.g("Restoring conversations table");
        ahzuVar.h("Conversations restore time: [%s]ms", Long.valueOf(fdhi.g(ayrq.c("DatabaseRestorerImpl::restoreFromBackupDatabase#conversationsTable", new fdae() { // from class: azxm
            @Override // defpackage.fdae
            public final Object invoke() {
                azwl azwlVar2 = azwlVar;
                azvl azvlVar = azwlVar2.a;
                azvlVar.b();
                azvlVar.c((int) ((Number) this.c.b()).longValue());
                azwlVar2.d.g("Starting participant full refresh");
                auvw.k(azwlVar2.c, null, null, new azwk(azwlVar2, null), 3);
                return fctx.a;
            }
        }))));
        ahzuVar.g("Restoring messages table");
        ahzuVar.h("Messages restore time: [%s]ms", Long.valueOf(fdhi.g(ayrq.c("DatabaseRestorerImpl::restoreFromBackupDatabase#messagesTable", new fdae() { // from class: azxn
            @Override // defpackage.fdae
            public final Object invoke() {
                azvl azvlVar;
                boolean z;
                azya azyaVar2;
                azya azyaVar3 = azyaVar;
                azvl azvlVar2 = azyaVar3.c;
                azvlVar2.b();
                boolean z2 = azyaVar3.a.a;
                if (z2) {
                    int i = fdhq.a;
                    long jB = fdhq.b();
                    baay.a();
                    String[] strArr = btvz.a;
                    dqtq dqtqVar = new dqtq("restore_workflow_scratch_timestamps", "$primary");
                    btvi btviVar = btvz.b;
                    btvj btvjVar = btviVar.b;
                    btvj btvjVar2 = btviVar.a;
                    btvj btvjVar3 = btviVar.c;
                    btvj btvjVar4 = btviVar.d;
                    dqtqVar.b(btvjVar, btvjVar2, btvjVar3, btvjVar4);
                    azkz azkzVarA = azlc.a();
                    azji azjiVar = azlc.c;
                    z = z2;
                    azjj azjjVar = azjiVar.a;
                    azkzVarA.c(azjjVar);
                    bvde bvdeVar = bvde.b;
                    azkzVarA.n(new dqxl("$V", new Object[]{Integer.valueOf(bvdeVar.ordinal())}), "which_database");
                    azjj azjjVar2 = azjiVar.m;
                    azkzVarA.n(new dqxl("$V/1000", new Object[]{azjjVar2}), "timestamp_in_seconds");
                    azvlVar = azvlVar2;
                    azkzVarA.n(new dqxl("$V % 1000", new Object[]{azjjVar2}), "timestamp_mod_1000");
                    dqtqVar.c = azkzVarA.b();
                    dqtqVar.a().a();
                    dqtq dqtqVar2 = new dqtq("restore_workflow_scratch_timestamps", "$primary");
                    dqtqVar2.d = 5;
                    dqtqVar2.b(btvjVar, btvjVar2, btvjVar3, btvjVar4);
                    brdr brdrVarD = MessagesTable.d();
                    bran branVar = MessagesTable.c;
                    brao braoVar = branVar.a;
                    brdrVarD.c(braoVar);
                    bvde bvdeVar2 = bvde.a;
                    brdrVarD.n(new dqxl("$V", new Object[]{Integer.valueOf(bvdeVar2.ordinal())}), "which_database");
                    brao braoVar2 = branVar.i;
                    brdrVarD.n(new dqxl("$V/1000", new Object[]{braoVar2}), "timestamp_in_seconds");
                    brdrVarD.n(new dqxl("$V % 1000", new Object[]{braoVar2}), "timestamp_mod_1000");
                    dqtqVar2.c = brdrVarD.b();
                    dqtqVar2.a().a();
                    String[] strArr2 = btuu.a;
                    dqtq dqtqVar3 = new dqtq("restore_workflow_scratch_suffix", "$primary");
                    dqtqVar3.d = 5;
                    btue btueVar = btuu.b;
                    btuf btufVar = btueVar.b;
                    btuf btufVar2 = btueVar.a;
                    btuf btufVar3 = btueVar.c;
                    dqtqVar3.b(btufVar, btufVar2, btufVar3);
                    azuq azuqVarA = azut.a();
                    aztn aztnVar = azut.c;
                    azuqVarA.c(aztnVar.a);
                    azuqVarA.n(new dqxl("$V", new Object[]{Integer.valueOf(bvdeVar.ordinal())}), "which_database");
                    azto aztoVar = aztnVar.h;
                    azto aztoVar2 = aztnVar.c;
                    azuqVarA.n(new dqxl("CASE WHEN $V <> 0 THEN 'self' WHEN $V LIKE '%@%' THEN $V ELSE substr($V, -7) END", new Object[]{aztoVar, aztoVar2, aztoVar2, aztoVar2}), "destination_suffix");
                    dqtqVar3.c = azuqVarA.b();
                    dqtqVar3.a().a();
                    dqtq dqtqVar4 = new dqtq("restore_workflow_scratch_suffix", "$primary");
                    dqtqVar4.b(btufVar, btufVar2, btufVar3);
                    bsbo bsboVarE = ParticipantsTable.e();
                    brzh brzhVar = ParticipantsTable.c;
                    bsboVarE.c(brzhVar.a);
                    bsboVarE.n(new dqxl("$V", new Object[]{Integer.valueOf(bvdeVar2.ordinal())}), "which_database");
                    brzi brziVar = brzhVar.d;
                    brzi brziVar2 = brzhVar.f;
                    bsboVarE.n(new dqxl("CASE WHEN $V <> $V THEN 'self'  WHEN $V LIKE '%@%' THEN $V ELSE substr($V, -7) END", new Object[]{brziVar, -2, brziVar2, brziVar2, brziVar2}), "destination_suffix");
                    dqtqVar4.c = bsboVarE.b();
                    dqtqVar4.a().a();
                    String[] strArr3 = bttr.a;
                    dqtq dqtqVar5 = new dqtq("restore_workflow_scratch_duplicates", "$primary");
                    bttb bttbVar = bttr.b;
                    bttc bttcVar = bttbVar.a;
                    bttc bttcVar2 = bttbVar.b;
                    bttc bttcVar3 = bttbVar.c;
                    dqtqVar5.b(bttcVar, bttcVar2, bttcVar3);
                    String[] strArr4 = btvz.a;
                    btvw btvwVar = new btvw(strArr4);
                    btvwVar.A("truncatedTimestampMatchesQuery");
                    btvwVar.v();
                    btvwVar.n(new dqxl("$V", new Object[]{Integer.valueOf(btts.a.ordinal())}), "key");
                    btvwVar.n(new dqxl("$V", new Object[]{btvjVar}), "backup_id");
                    btvwVar.n(new dqxl("$V{bugle_scratch}", new Object[]{btvjVar}), "bugle_id");
                    btvwVar.c(new Function() { // from class: baas
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            btvy btvyVar = (btvy) obj;
                            btvyVar.c(bvde.b);
                            btvyVar.b();
                            btvj btvjVar5 = btvz.b.d;
                            btvyVar.ar(new dqxl("$V + $V{J:bugle_scratch} <> 0", new Object[]{btvjVar5, btvjVar5}));
                            Function[] functionArr = {new Function() { // from class: baan
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    btvy btvyVar2 = (btvy) obj2;
                                    btvyVar2.ar(new dqxl("$V = 0", new Object[]{btvz.b.d}));
                                    return btvyVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: baao
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    btvy btvyVar2 = (btvy) obj2;
                                    btvyVar2.ar(new dqxl("$V{J:bugle_scratch} = 0", new Object[]{btvz.b.d}));
                                    return btvyVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }};
                            btvy[] btvyVarArr = new btvy[2];
                            for (int i2 = 0; i2 < 2; i2++) {
                                btvyVarArr[i2] = (btvy) functionArr[i2].apply(new btvy());
                            }
                            btvyVar.aq(btvyVarArr);
                            return btvyVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    btvw btvwVar2 = new btvw(strArr4);
                    btvwVar2.v();
                    btvwVar2.c(new Function() { // from class: baat
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            btvy btvyVar = (btvy) obj;
                            btvyVar.b();
                            btvyVar.c(bvde.a);
                            return btvyVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    dqtr dqtrVarI = dqts.i(btvwVar2.b(), btvjVar3, btvjVar3);
                    ((dqos) dqtrVarI).e = "bugle_scratch";
                    dqtqVar5.c = ((btvw) btvwVar.j(dqtrVarI)).b();
                    dqtqVar5.a().a();
                    dqtq dqtqVar6 = new dqtq("restore_workflow_scratch_duplicates", "$primary");
                    dqtqVar6.b(bttcVar, bttcVar2, bttcVar3);
                    String[] strArr5 = bttr.a;
                    btto bttoVar = new btto(strArr5);
                    bttoVar.c(new Function() { // from class: baam
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bttq bttqVar = (bttq) obj;
                            bttqVar.b(btts.a);
                            return bttqVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bttoVar.v();
                    bttoVar.n(new dqxl("$V", new Object[]{Integer.valueOf(btts.b.ordinal())}), "key");
                    bttoVar.n(new dqxl("$V", new Object[]{bttcVar2}), "backup_id");
                    bttoVar.n(new dqxl("$V", new Object[]{bttcVar3}), "bugle_id");
                    bsje bsjeVarC = PartsTable.c();
                    bsjeVarC.v();
                    bsjeVarC.h(new Function() { // from class: baap
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsjl bsjlVar = (bsjl) obj;
                            bsjlVar.u();
                            return bsjlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    dqtr dqtrVarI2 = dqts.i(bsjeVarC.b(), PartsTable.d.b, bttcVar3);
                    ((dqos) dqtrVarI2).e = "bugle_parts";
                    btto bttoVar2 = (btto) bttoVar.j(dqtrVarI2);
                    aznp aznpVarA = azns.a();
                    aznpVarA.v();
                    aznpVarA.c(new Function() { // from class: baaq
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
                    dqtr dqtrVarI3 = dqts.i(aznpVarA.b(), azns.c.b, bttcVar2);
                    ((dqos) dqtrVarI3).e = "backup_parts";
                    btto bttoVar3 = (btto) bttoVar2.j(dqtrVarI3);
                    bttoVar3.c(new Function() { // from class: baar
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bttq bttqVar = (bttq) obj;
                            bttqVar.ar(new dqxl("$V{J:bugle_parts} = $V{J:backup_parts}", new Object[]{PartsTable.d.c, azns.c.e}));
                            return bttqVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    dqtqVar6.c = bttoVar3.b();
                    dqtqVar6.a().a();
                    dqtq dqtqVar7 = new dqtq("restore_workflow_scratch_duplicates", "$primary");
                    dqtqVar7.b(bttcVar, bttcVar2, bttcVar3);
                    btto bttoVar4 = new btto(strArr5);
                    bttoVar4.c(new Function() { // from class: baau
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bttq bttqVar = (bttq) obj;
                            bttqVar.b(btts.a);
                            return bttqVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bttoVar4.v();
                    bttoVar4.n(new dqxl("$V", new Object[]{Integer.valueOf(btts.c.ordinal())}), "key");
                    bttoVar4.n(new dqxl("$V", new Object[]{bttcVar2}), "backup_id");
                    bttoVar4.n(new dqxl("$V", new Object[]{bttcVar3}), "bugle_id");
                    brdr brdrVarD2 = MessagesTable.d();
                    brdrVarD2.v();
                    String[] strArr6 = btuu.a;
                    btur bturVar = new btur(strArr6);
                    bturVar.v();
                    bturVar.c(new Function() { // from class: baav
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            btut btutVar = (btut) obj;
                            btutVar.b(bvde.a);
                            return btutVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    dqtr dqtrVarI4 = dqts.i(bturVar.b(), btufVar, branVar.c);
                    ((dqos) dqtrVarI4).e = "bugle_destination_suffix";
                    dqtr dqtrVarI5 = dqts.i(((brdr) brdrVarD2.j(dqtrVarI4)).b(), braoVar, bttcVar3);
                    ((dqos) dqtrVarI5).e = "bugle_messages";
                    btto bttoVar5 = (btto) bttoVar4.j(dqtrVarI5);
                    azkz azkzVarA2 = azlc.a();
                    azkzVarA2.v();
                    btur bturVar2 = new btur(strArr6);
                    bturVar2.v();
                    bturVar2.c(new Function() { // from class: baaw
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
                    dqtr dqtrVarI6 = dqts.i(bturVar2.b(), btufVar, azjiVar.h);
                    ((dqos) dqtrVarI6).e = "backup_destination_suffix";
                    dqtr dqtrVarI7 = dqts.i(((azkz) azkzVarA2.j(dqtrVarI6)).b(), azjjVar, bttcVar2);
                    ((dqos) dqtrVarI7).e = "backup_messages";
                    btto bttoVar6 = (btto) bttoVar5.j(dqtrVarI7);
                    bttoVar6.c(new Function() { // from class: baax
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bttq bttqVar = (bttq) obj;
                            btuf btufVar4 = btuu.b.c;
                            bttqVar.ar(new dqxl("$V{J:bugle_destination_suffix} = $V{J:backup_destination_suffix}", new Object[]{btufVar4, btufVar4}));
                            return bttqVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    dqtqVar7.c = bttoVar6.b();
                    dqtqVar7.a().a();
                    azyaVar2 = azyaVar3;
                    azyaVar2.b.c("[%s] precompute work [%s]ms", azvt.b.a, Long.valueOf(fdhi.g(fdhr.b(jB))));
                } else {
                    azvlVar = azvlVar2;
                    z = z2;
                    azyaVar2 = azyaVar3;
                }
                azvlVar.c((int) ((Number) this.e.b()).longValue());
                if (z) {
                    azyaVar2.b.g("Clearing Messages restore scratch data");
                    baay.a();
                }
                return fctx.a;
            }
        }))));
    }
}
