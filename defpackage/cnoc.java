package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnoc implements cnlo {
    private final Optional A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    private final fcsu H;
    private final apsl I;
    private final fcsu J;
    public final cogw c;
    public final eosc d;
    public final fcsu e;
    public final fcsu f;
    private final Context h;
    private final dqsn i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final cmqj n;
    private final bveg o;
    private final bahv p;
    private final bywf q;
    private final cmfo r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final fcsu x;
    private final fcsu y;
    private final fcsu z;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync");
    private static final cczi g = cdag.e(cdag.b, "reverse_telephony_sync__max_retries", 30);
    public static final cczi b = cdag.e(cdag.b, "reverse_telephony_sync__max_number_of_entries_in_start_times_history", 10);

    public cnoc(Context context, dqsn dqsnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cmqj cmqjVar, bveg bvegVar, bahv bahvVar, bywf bywfVar, cmgk cmgkVar, cogw cogwVar, eosc eoscVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, Optional optional, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, apsl apslVar, fcsu fcsuVar22) {
        this.h = context;
        this.i = dqsnVar;
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.l = fcsuVar3;
        this.m = fcsuVar4;
        this.n = cmqjVar;
        this.o = bvegVar;
        this.p = bahvVar;
        this.q = bywfVar;
        this.c = cogwVar;
        this.d = eoscVar;
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.REVERSE_TELEPHONY_SYNC_STATE);
        cmggVarC.f(cnoh.a);
        this.r = cmgkVar.a(cmggVarC.a());
        this.s = fcsuVar5;
        this.t = fcsuVar6;
        this.u = fcsuVar7;
        this.v = fcsuVar8;
        this.w = fcsuVar9;
        this.x = fcsuVar10;
        this.y = fcsuVar11;
        this.e = fcsuVar12;
        this.z = fcsuVar13;
        this.A = optional;
        this.B = fcsuVar14;
        this.C = fcsuVar15;
        this.D = fcsuVar16;
        this.E = fcsuVar17;
        this.F = fcsuVar18;
        this.G = fcsuVar19;
        this.H = fcsuVar20;
        this.f = fcsuVar21;
        this.I = apslVar;
        this.J = fcsuVar22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MessageCoreData e(final brap brapVar) {
        MessageCoreData messageCoreDataA = this.o.a();
        messageCoreDataA.bY((MessagesTable.BindData) brapVar.cQ());
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("getMessageCoreData");
        bsjeVarC.h(new Function() { // from class: cnmk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                ekrg ekrgVar = cnoc.a;
                bsjlVar.n(brapVar.q());
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = bsjeVarC.b().z();
        int size = ekgbVarZ.size();
        for (int i = 0; i < size; i++) {
            messageCoreDataA.aM(this.p.e((PartsTable.BindData) ekgbVarZ.get(i)));
        }
        return messageCoreDataA;
    }

    private static evqs f(UUID uuid) {
        return evqs.x(ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
    }

    private final void g() {
        Intent intentRegisterReceiver = this.h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            throw new cnpe("Unable to get device charging state because battery status intent of the device is null.");
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            throw new cnpe("Device is not charging.");
        }
    }

    private final void h(final Function function, final BiFunction biFunction) {
        this.r.m(new ejvr() { // from class: cnnz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cnoh cnohVar = (cnoh) obj;
                ekrg ekrgVar = cnoc.a;
                cnoe cnoeVar = (cnoe) cnohVar.toBuilder();
                cnog cnogVar = cnog.a;
                cnof cnofVar = (cnof) cnogVar.createBuilder();
                cnog cnogVar2 = cnohVar.c;
                if (cnogVar2 != null) {
                    cnogVar = cnogVar2;
                }
                cnoeVar.a((cnog) ((cnof) biFunction.apply(cnofVar, Integer.valueOf(((Integer) function.apply(cnogVar)).intValue() + 1))).build());
                return (cnoh) cnoeVar.build();
            }
        });
    }

    private final void i() {
        h(new Function() { // from class: cnoa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cnog) obj).e);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BiFunction() { // from class: cnob
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                cnof cnofVar = (cnof) obj;
                int iIntValue = ((Integer) obj2).intValue();
                cnofVar.copyOnWrite();
                cnog cnogVar = (cnog) cnofVar.instance;
                cnog cnogVar2 = cnog.a;
                cnogVar.e = iIntValue;
                return cnofVar;
            }
        });
    }

    private static void j(final brap brapVar) {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("markMessageAsDone");
        brduVar.g(false);
        brduVar.X(new Function() { // from class: cnnw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                ekrg ekrgVar = cnoc.a;
                brecVar.p(brapVar.q());
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brduVar.b().e();
    }

    private final void k() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "resetDataStoreStatus", 530, "ReverseTelephonySync.java")).q("Resetting in progress state");
        this.r.m(new ejvr() { // from class: cnmv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrg ekrgVar = cnoc.a;
                cnoe cnoeVar = (cnoe) ((cnoh) obj).toBuilder();
                cnof cnofVar = (cnof) cnog.a.createBuilder();
                cnofVar.copyOnWrite();
                ((cnog) cnofVar.instance).b = false;
                cnog cnogVar = (cnog) cnofVar.build();
                cnoeVar.copyOnWrite();
                cnoh cnohVar = (cnoh) cnoeVar.instance;
                cnogVar.getClass();
                cnohVar.c = cnogVar;
                cnohVar.b |= 1;
                return (cnoh) cnoeVar.build();
            }
        });
    }

    private final void l() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "resumeForwardSync", 408, "ReverseTelephonySync.java")).q("Reverse Telephony Sync complete. Resuming forward sync.");
        eijx.h(new eooy() { // from class: cnmp
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                cobl coblVar = (cobl) this.a.f.b();
                return auvw.a(ejaa.a(coblVar.e, coblVar.f, new cobk(coblVar, null)));
            }
        }, this.d).k(auvh.b(), eoqg.a);
    }

    private final int m(MessageCoreData messageCoreData, int i) {
        axcy axcyVarE = ((bbdl) this.x.b()).e(messageCoreData.v());
        if (axcyVarE == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleRestore");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "getSubId", 1312, "ReverseTelephonySync.java")).D("Self id was not found. messageData.getSelfId: %s, MessageId: %s", messageCoreData.v(), messageCoreData.C());
            return ((crny) this.v.b()).c();
        }
        int iE = axcyVarE.e();
        if (i != 2 || iE <= 1073745920) {
            return iE;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "getSubId", 1329, "ReverseTelephonySync.java")).q("D2D message detected. Returning DEFAULT_SUB_ID for Reverse Sync");
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void n(ellg ellgVar, int i, Optional optional) {
        try {
            cnoh cnohVar = (cnoh) this.r.l();
            cnog cnogVar = cnohVar.c;
            if (cnogVar == null) {
                cnogVar = cnog.a;
            }
            emgp emgpVar = (emgp) emgq.a.createBuilder();
            emgpVar.copyOnWrite();
            emgq emgqVar = (emgq) emgpVar.instance;
            emgqVar.k = i - 1;
            emgqVar.b |= 256;
            evrj evrjVarD = evwy.d(this.c.f().toEpochMilli() - evxc.a((evvp) cnohVar.d.get(cnohVar.d.size() - 1)));
            emgpVar.copyOnWrite();
            emgq emgqVar2 = (emgq) emgpVar.instance;
            evrjVarD.getClass();
            emgqVar2.c = evrjVarD;
            emgqVar2.b |= 1;
            int iA = cnma.a(cnogVar.f);
            emgpVar.copyOnWrite();
            emgq emgqVar3 = (emgq) emgpVar.instance;
            emgqVar3.f = iA - 1;
            emgqVar3.b |= 8;
            int iA2 = cnma.a(cnogVar.e);
            emgpVar.copyOnWrite();
            emgq emgqVar4 = (emgq) emgpVar.instance;
            emgqVar4.g = iA2 - 1;
            emgqVar4.b |= 16;
            int iA3 = cnma.a(cnogVar.d);
            emgpVar.copyOnWrite();
            emgq emgqVar5 = (emgq) emgpVar.instance;
            emgqVar5.h = iA3 - 1;
            emgqVar5.b |= 32;
            int iA4 = cnma.a(cnogVar.g);
            emgpVar.copyOnWrite();
            emgq emgqVar6 = (emgq) emgpVar.instance;
            emgqVar6.e = iA4 - 1;
            emgqVar6.b |= 4;
            int iA5 = cnma.a(cnogVar.h);
            emgpVar.copyOnWrite();
            emgq emgqVar7 = (emgq) emgpVar.instance;
            emgqVar7.d = iA5 - 1;
            emgqVar7.b |= 2;
            int i2 = cnogVar.c;
            emgpVar.copyOnWrite();
            emgq emgqVar8 = (emgq) emgpVar.instance;
            emgqVar8.b |= 64;
            emgqVar8.i = i2;
            int i3 = cnogVar.i;
            emgpVar.copyOnWrite();
            emgq emgqVar9 = (emgq) emgpVar.instance;
            emgqVar9.b |= 128;
            emgqVar9.j = i3;
            if (optional.isPresent()) {
                evqs evqsVarF = f((UUID) optional.get());
                emgpVar.copyOnWrite();
                emgq emgqVar10 = (emgq) emgpVar.instance;
                emgqVar10.b |= 512;
                emgqVar10.l = evqsVarF;
            }
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            emgq emgqVar11 = (emgq) emgpVar.build();
            ellh ellhVar2 = ellh.a;
            emgqVar11.getClass();
            ellhVar.au = emgqVar11;
            ellhVar.d |= 262144;
        } catch (evtj e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleRestore");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fillInSyncDetails", (char) 577, "ReverseTelephonySync.java")).q("Unable to get state from data store");
        }
    }

    private final void o(final MessageCoreData messageCoreData, Uri uri, int i) {
        BiConsumer biConsumer;
        lt ltVar;
        for (final MessagePartCoreData messagePartCoreData : ((MessageData) messageCoreData).i) {
            ejyb.a(messageCoreData.C().equals(messagePartCoreData.B()));
            if (!messagePartCoreData.bm()) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleRestore");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrdVar.V(10, TimeUnit.SECONDS);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1091, "ReverseTelephonySync.java")).q("Part is not missing in telephony, ignoring");
            } else if (messagePartCoreData.aZ()) {
                HashMap map = new HashMap();
                try {
                    try {
                        ltVar = new lt();
                        String strR = messagePartCoreData.R();
                        if (strR != null) {
                            ltVar.h(strR.getBytes(StandardCharsets.US_ASCII));
                        }
                        String strU = messagePartCoreData.U();
                        if (strU != null) {
                            ltVar.k(strU.getBytes());
                        }
                    } catch (Throwable th) {
                        Map.EL.forEach(map, new BiConsumer() { // from class: cnnb
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) throws IOException {
                                Uri uri2 = (Uri) obj;
                                InputStream inputStream = (InputStream) obj2;
                                ekrg ekrgVar = cnoc.a;
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    ekrw ekrwVarJ = cnoc.a.j();
                                    ekrwVarJ.X(eksq.a, "BugleRestore");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri2);
                                }
                            }

                            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                                return BiConsumer$CC.$default$andThen(this, biConsumer2);
                            }
                        });
                        throw th;
                    }
                } catch (IOException | lj e) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleRestore");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1180, "ReverseTelephonySync.java")).D("Unable to open input stream. MessageId: %s, PartId: %s", messageCoreData.C(), messagePartCoreData.W());
                    biConsumer = new BiConsumer() { // from class: cnnb
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) throws IOException {
                            Uri uri2 = (Uri) obj;
                            InputStream inputStream = (InputStream) obj2;
                            ekrg ekrgVar = cnoc.a;
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                ekrw ekrwVarJ2 = cnoc.a.j();
                                ekrwVarJ2.X(eksq.a, "BugleRestore");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e2)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri2);
                            }
                        }

                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                            return BiConsumer$CC.$default$andThen(this, biConsumer2);
                        }
                    };
                }
                if (messagePartCoreData.t() == null) {
                    String strAb = messagePartCoreData.ab();
                    if (strAb == null) {
                        strAb = "";
                    }
                    ltVar.i(strAb.getBytes());
                    ltVar.d(106);
                    ltVar.k("text.txt".getBytes(StandardCharsets.US_ASCII));
                } else {
                    if (messagePartCoreData.V() != null) {
                        String strV = messagePartCoreData.V();
                        ejyb.e(strV);
                        File file = new File(strV);
                        Uri uri2 = Uri.parse("fake://uri/because/it/is/unused");
                        if (file.exists()) {
                            map.put(uri2, new FileInputStream(file));
                            ltVar.e = uri2;
                        } else {
                            biConsumer = new BiConsumer() { // from class: cnnb
                                @Override // java.util.function.BiConsumer
                                public final void accept(Object obj, Object obj2) throws IOException {
                                    Uri uri22 = (Uri) obj;
                                    InputStream inputStream = (InputStream) obj2;
                                    ekrg ekrgVar = cnoc.a;
                                    try {
                                        inputStream.close();
                                    } catch (IOException e2) {
                                        ekrw ekrwVarJ2 = cnoc.a.j();
                                        ekrwVarJ2.X(eksq.a, "BugleRestore");
                                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e2)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri22);
                                    }
                                }

                                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                                    return BiConsumer$CC.$default$andThen(this, biConsumer2);
                                }
                            };
                        }
                    } else {
                        ekrw ekrwVarH2 = a.h();
                        ekrwVarH2.X(eksq.a, "BugleRestore");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1145, "ReverseTelephonySync.java")).D("Local copy of part does not exist. MessageId: %s, PartId: %s", messageCoreData.C(), messagePartCoreData.W());
                        biConsumer = new BiConsumer() { // from class: cnnb
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) throws IOException {
                                Uri uri22 = (Uri) obj;
                                InputStream inputStream = (InputStream) obj2;
                                ekrg ekrgVar = cnoc.a;
                                try {
                                    inputStream.close();
                                } catch (IOException e2) {
                                    ekrw ekrwVarJ2 = cnoc.a.j();
                                    ekrwVarJ2.X(eksq.a, "BugleRestore");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e2)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri22);
                                }
                            }

                            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                                return BiConsumer$CC.$default$andThen(this, biConsumer2);
                            }
                        };
                    }
                    Map.EL.forEach(map, biConsumer);
                }
                Uri uriB = ((ceae) this.w.b()).b(ltVar, ContentUris.parseId(uri), map);
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "BugleRestore");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1160, "ReverseTelephonySync.java")).I("New uri for part. PartId: %s, URI: %s, part.isText: %s", messagePartCoreData.W(), uriB, Boolean.valueOf(messagePartCoreData.bv()));
                String[] strArr = PartsTable.a;
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("insertPartIfNotAlreadyInserted");
                bsjhVar.t(false);
                bsjhVar.d(false);
                bsjhVar.D(new Function() { // from class: cnnc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsjl bsjlVar = (bsjl) obj;
                        ekrg ekrgVar = cnoc.a;
                        bsjlVar.j(messagePartCoreData.W());
                        return bsjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (messagePartCoreData.t() != null) {
                    bsjhVar.z(uriB);
                }
                bsjhVar.b().e();
                biConsumer = new BiConsumer() { // from class: cnnb
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) throws IOException {
                        Uri uri22 = (Uri) obj;
                        InputStream inputStream = (InputStream) obj2;
                        ekrg ekrgVar = cnoc.a;
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            ekrw ekrwVarJ2 = cnoc.a.j();
                            ekrwVarJ2.X(eksq.a, "BugleRestore");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e2)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1190, "ReverseTelephonySync.java")).t("Error when closing file. URI: %s", uri22);
                        }
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer2);
                    }
                };
                Map.EL.forEach(map, biConsumer);
            } else {
                ekrw ekrwVarE2 = a.e();
                ekrwVarE2.X(eksq.a, "BugleRestore");
                ekrd ekrdVar2 = (ekrd) ekrwVarE2;
                ekrdVar2.V(10, TimeUnit.SECONDS);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "insertPartIfNotAlreadyInserted", 1097, "ReverseTelephonySync.java")).D("Part was already synced, ignoring. Part Id: %s, MessageId: %s", messagePartCoreData.W(), messageCoreData.C());
            }
            if (i == 2 && messagePartCoreData.aX()) {
                ekrg ekrgVar = a;
                ekrw ekrwVarH3 = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH3.X(ekrzVar, "BugleRestore");
                ekrd ekrdVar3 = (ekrd) ekrwVarH3;
                ekrdVar3.V(10, TimeUnit.SECONDS);
                ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "deleteCachedFile", 1197, "ReverseTelephonySync.java")).q("Removing local file copy");
                String strV2 = messagePartCoreData.V();
                if (strV2 == null || strV2.isEmpty()) {
                    ekrw ekrwVarH4 = ekrgVar.h();
                    ekrwVarH4.X(ekrzVar, "BugleRestore");
                    ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "deleteCachedFile", 1201, "ReverseTelephonySync.java")).D("Part does not have a local file copy. Skipping cache file deletion. PartId: %s, ContentType: %s", messagePartCoreData.W(), messagePartCoreData.R());
                } else {
                    if (strV2.length() == 0) {
                        ((ekrd) cnmb.a.j().h("com/google/android/apps/messaging/shared/telephony/ReverseSyncAttachmentsHandler", "removeLocalAttachment", 23, "ReverseSyncAttachmentsHandler.kt")).q("Provided uri is null or empty. Skipping deletion for Bugle attachment copy.");
                    } else {
                        File file2 = new File(strV2);
                        if (!file2.exists()) {
                            ((ekrd) cnmb.a.h().h("com/google/android/apps/messaging/shared/telephony/ReverseSyncAttachmentsHandler", "removeLocalAttachment", 31, "ReverseSyncAttachmentsHandler.kt")).t("File does not exist in directory. Skipping deletion for Bugle attachment copy. uri: %s", strV2);
                        } else if (file2.delete()) {
                            String[] strArr2 = PartsTable.a;
                            bsjh bsjhVar2 = new bsjh();
                            bsjhVar2.ap("updateLocalCachePathAfterLocalCopyDeletion");
                            bsjhVar2.s();
                            bsjhVar2.D(new Function() { // from class: cnnm
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsjl bsjlVar = (bsjl) obj;
                                    ekrg ekrgVar2 = cnoc.a;
                                    bsjlVar.j(messagePartCoreData.W());
                                    return bsjlVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bsjhVar2.b().e();
                        }
                    }
                    ekrw ekrwVarJ2 = ekrgVar.j();
                    ekrwVarJ2.X(ekrzVar, "BugleRestore");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "deleteCachedFile", 1220, "ReverseTelephonySync.java")).t("Failed to remove attachment copy. localCachePath: %s", strV2);
                }
            }
        }
        String[] strArr3 = PartsTable.a;
        bsjh bsjhVar3 = new bsjh();
        bsjhVar3.ap("insertRemainingParts");
        bsjhVar3.D(new Function() { // from class: cnnv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                ekrg ekrgVar2 = cnoc.a;
                bsjlVar.n(messageCoreData.C());
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjhVar3.d(false);
        bsjhVar3.b().e();
    }

    private final void p(int i, int i2, Optional optional) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleRestore");
        int i3 = i - 1;
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "logSyncFailed", 486, "ReverseTelephonySync.java")).r("Sync throttled or failed. Reason %d", i3);
        emgr emgrVar = (emgr) emgt.a.createBuilder();
        emgrVar.copyOnWrite();
        emgt emgtVar = (emgt) emgrVar.instance;
        emgtVar.c = i3;
        emgtVar.b |= 1;
        emgrVar.copyOnWrite();
        emgt emgtVar2 = (emgt) emgrVar.instance;
        emgtVar2.d = i2 - 1;
        emgtVar2.b |= 2;
        if (optional.isPresent()) {
            evqs evqsVarF = f((UUID) optional.get());
            emgrVar.copyOnWrite();
            emgt emgtVar3 = (emgt) emgrVar.instance;
            emgtVar3.b |= 4;
            emgtVar3.e = evqsVarF;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.TELEPHONY_REVERSE_SYNC_FAILED_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emgt emgtVar4 = (emgt) emgrVar.build();
        emgtVar4.getClass();
        ellhVar2.av = emgtVar4;
        ellhVar2.d |= 524288;
        ((aimb) this.s.b()).a().j(ellgVar, aioj.LOG_SPEC_REVERSE_TELEPHONY_SYNC_EVENTS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean q(final defpackage.brap r44, int r45) {
        /*
            Method dump skipped, instructions count: 1589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnoc.q(brap, int):boolean");
    }

    @Override // defpackage.cnlo
    public final cnqj a(final ConversationIdType conversationIdType) {
        return (cnqj) this.i.c("fixThread", new ejxr() { // from class: cnmz
            @Override // defpackage.ejxr
            public final Object get() {
                cnqj cnqjVarB;
                botb botbVarE = botm.e();
                botbVarE.A("fixThread");
                final ConversationIdType conversationIdType2 = conversationIdType;
                botbVarE.i(new Function() { // from class: cnme
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        ekrg ekrgVar = cnoc.a;
                        botlVar.r(conversationIdType2);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bopr boprVar = (bopr) botbVarE.b().p();
                cnoc cnocVar = this.a;
                try {
                    if (!boprVar.moveToFirst()) {
                        ekrw ekrwVarJ = cnoc.a.j();
                        ekrwVarJ.X(eksq.a, "BugleRestore");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1617, "ReverseTelephonySync.java")).t("Conversation was removed before it was fixed. ConversationId: %s", conversationIdType2);
                        cnqjVarB = new cnqj();
                    } else if (!((cnmc) cnocVar.e.b()).a()) {
                        ekrw ekrwVarJ2 = cnoc.a.j();
                        ekrwVarJ2.X(eksq.a, "BugleRestore");
                        ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1623, "ReverseTelephonySync.java")).t("No sync permissions to fix conversation. ConversationId: %s", conversationIdType2);
                        cnqjVarB = boprVar.k();
                    } else if (boprVar.v()) {
                        Optional optionalC = cnocVar.c(boprVar, 1);
                        if (optionalC.isEmpty()) {
                            ekrw ekrwVarJ3 = cnoc.a.j();
                            ekrwVarJ3.X(eksq.a, "BugleRestore");
                            ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1637, "ReverseTelephonySync.java")).t("Unable to create thread id for conversation. ConversationId: %s", conversationIdType2);
                            cnqjVarB = boprVar.k();
                        } else {
                            cnqjVarB = cnqj.b(((Long) optionalC.get()).longValue());
                        }
                    } else {
                        ekrw ekrwVarJ4 = cnoc.a.j();
                        ekrwVarJ4.X(eksq.a, "BugleRestore");
                        ((ekrd) ((ekrd) ekrwVarJ4).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySync", "fixThreadIdInTransaction", 1629, "ReverseTelephonySync.java")).t("Conversation is not awaiting reverse sync. ConversationId: %s", conversationIdType2);
                        cnqjVarB = boprVar.k();
                    }
                    boprVar.close();
                    return cnqjVarB;
                } catch (Throwable th) {
                    try {
                        boprVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
    }

    public final void b() {
        this.r.m(new ejvr() { // from class: cnmq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cnoh cnohVar = (cnoh) obj;
                cnoe cnoeVar = (cnoe) cnohVar.toBuilder();
                if (cnohVar.d.size() >= Math.max(((Integer) cnoc.b.e()).intValue(), ((Integer) cnoj.a.e()).intValue())) {
                    cnoeVar.copyOnWrite();
                    cnoh cnohVar2 = (cnoh) cnoeVar.instance;
                    cnohVar2.a();
                    cnohVar2.d.remove(0);
                }
                evvp evvpVarC = evxc.c(this.a.c.f().toEpochMilli());
                cnoeVar.copyOnWrite();
                cnoh cnohVar3 = (cnoh) cnoeVar.instance;
                evvpVarC.getClass();
                cnohVar3.a();
                cnohVar3.d.add(evvpVarC);
                cnof cnofVar = (cnof) cnog.a.createBuilder();
                cnofVar.copyOnWrite();
                ((cnog) cnofVar.instance).b = true;
                cnofVar.copyOnWrite();
                ((cnog) cnofVar.instance).c = 0;
                cnog cnogVar = (cnog) cnofVar.build();
                cnoeVar.copyOnWrite();
                cnoh cnohVar4 = (cnoh) cnoeVar.instance;
                cnogVar.getClass();
                cnohVar4.c = cnogVar;
                cnohVar4.b |= 1;
                return (cnoh) cnoeVar.build();
            }
        });
    }

    public final Optional c(final bopr boprVar, int i) {
        cnqj cnqjVarB = ((avmr) this.E.b()).b((bojh) boprVar.cQ());
        Optional optionalEmpty = cnqjVarB.d() ? Optional.empty() : Optional.of(Long.valueOf(cnqjVarB.a()));
        if (optionalEmpty.isEmpty()) {
            return optionalEmpty;
        }
        Long l = (Long) optionalEmpty.get();
        long jLongValue = l.longValue();
        ejyb.a(jLongValue != -1);
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("createThreadForConversationAndSyncOneMessage-conversations");
        boteVar.X(new cnqj(jLongValue));
        boteVar.i(false);
        boteVar.f(boprVar.h());
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("createThreadForConversationAndSyncOneMessage");
        brdrVarD.h(new Function() { // from class: cnml
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                ekrg ekrgVar = cnoc.a;
                brecVar.c();
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: cnmm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                ekrg ekrgVar = cnoc.a;
                brecVar.m(boprVar.h());
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brap brapVar = (brap) brdrVarD.b().p();
        while (brapVar.moveToNext()) {
            try {
                final MessageCoreData messageCoreDataE = e(brapVar);
                if (!messageCoreDataE.cY()) {
                    Iterator it = ((MessageData) messageCoreDataE).i.iterator();
                    boolean zBv = true;
                    while (it.hasNext()) {
                        zBv &= ((MessagePartCoreData) it.next()).bv();
                    }
                    if (zBv) {
                        if (q(brapVar, i)) {
                            break;
                        }
                    }
                }
                String[] strArr2 = PartsTable.a;
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("markAllPartsAsMissing");
                bsjhVar.t(true);
                bsjhVar.D(new Function() { // from class: cnmo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsjl bsjlVar = (bsjl) obj;
                        ekrg ekrgVar = cnoc.a;
                        bsjlVar.n(messageCoreDataE.C());
                        return bsjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsjhVar.b().e();
            } catch (Throwable th) {
                try {
                    brapVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        brapVar.close();
        return Optional.of(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01df A[Catch: all -> 0x050e, TryCatch #7 {all -> 0x050e, blocks: (B:3:0x0016, B:5:0x0043, B:8:0x0066, B:10:0x0072, B:11:0x0074, B:13:0x0078, B:30:0x01a2, B:32:0x01df, B:33:0x01e1, B:35:0x01e9, B:42:0x0210, B:44:0x0260, B:45:0x0279, B:48:0x02cb, B:49:0x02d0, B:39:0x01fa, B:51:0x02d4, B:104:0x050d, B:103:0x050a, B:82:0x043e, B:87:0x0498, B:96:0x0500, B:95:0x04fd, B:17:0x00b8, B:19:0x00c7, B:21:0x00ce, B:23:0x00dc, B:25:0x00f4, B:27:0x0186, B:29:0x0191, B:28:0x018c, B:24:0x00f1, B:16:0x009c, B:83:0x048e, B:85:0x0494, B:100:0x0505, B:92:0x04f8), top: B:122:0x0016, inners: #0, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01fa A[Catch: all -> 0x050e, TryCatch #7 {all -> 0x050e, blocks: (B:3:0x0016, B:5:0x0043, B:8:0x0066, B:10:0x0072, B:11:0x0074, B:13:0x0078, B:30:0x01a2, B:32:0x01df, B:33:0x01e1, B:35:0x01e9, B:42:0x0210, B:44:0x0260, B:45:0x0279, B:48:0x02cb, B:49:0x02d0, B:39:0x01fa, B:51:0x02d4, B:104:0x050d, B:103:0x050a, B:82:0x043e, B:87:0x0498, B:96:0x0500, B:95:0x04fd, B:17:0x00b8, B:19:0x00c7, B:21:0x00ce, B:23:0x00dc, B:25:0x00f4, B:27:0x0186, B:29:0x0191, B:28:0x018c, B:24:0x00f1, B:16:0x009c, B:83:0x048e, B:85:0x0494, B:100:0x0505, B:92:0x04f8), top: B:122:0x0016, inners: #0, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0260 A[Catch: all -> 0x050e, TryCatch #7 {all -> 0x050e, blocks: (B:3:0x0016, B:5:0x0043, B:8:0x0066, B:10:0x0072, B:11:0x0074, B:13:0x0078, B:30:0x01a2, B:32:0x01df, B:33:0x01e1, B:35:0x01e9, B:42:0x0210, B:44:0x0260, B:45:0x0279, B:48:0x02cb, B:49:0x02d0, B:39:0x01fa, B:51:0x02d4, B:104:0x050d, B:103:0x050a, B:82:0x043e, B:87:0x0498, B:96:0x0500, B:95:0x04fd, B:17:0x00b8, B:19:0x00c7, B:21:0x00ce, B:23:0x00dc, B:25:0x00f4, B:27:0x0186, B:29:0x0191, B:28:0x018c, B:24:0x00f1, B:16:0x009c, B:83:0x048e, B:85:0x0494, B:100:0x0505, B:92:0x04f8), top: B:122:0x0016, inners: #0, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02cb A[Catch: all -> 0x050e, TryCatch #7 {all -> 0x050e, blocks: (B:3:0x0016, B:5:0x0043, B:8:0x0066, B:10:0x0072, B:11:0x0074, B:13:0x0078, B:30:0x01a2, B:32:0x01df, B:33:0x01e1, B:35:0x01e9, B:42:0x0210, B:44:0x0260, B:45:0x0279, B:48:0x02cb, B:49:0x02d0, B:39:0x01fa, B:51:0x02d4, B:104:0x050d, B:103:0x050a, B:82:0x043e, B:87:0x0498, B:96:0x0500, B:95:0x04fd, B:17:0x00b8, B:19:0x00c7, B:21:0x00ce, B:23:0x00dc, B:25:0x00f4, B:27:0x0186, B:29:0x0191, B:28:0x018c, B:24:0x00f1, B:16:0x009c, B:83:0x048e, B:85:0x0494, B:100:0x0505, B:92:0x04f8), top: B:122:0x0016, inners: #0, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0335 A[Catch: all -> 0x0501, TRY_LEAVE, TryCatch #1 {all -> 0x0501, blocks: (B:53:0x032f, B:55:0x0335, B:61:0x036d, B:62:0x039f, B:64:0x03a5), top: B:110:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0494 A[Catch: all -> 0x04f6, LOOP:2: B:112:0x048e->B:85:0x0494, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x04f6, blocks: (B:83:0x048e, B:85:0x0494), top: B:112:0x048e, outer: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r32, j$.util.Optional r33) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnoc.d(int, j$.util.Optional):void");
    }
}
