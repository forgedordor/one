package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duku {
    public static volatile boolean a = false;
    public final Context b;
    public final durk c;
    public final dugr d;
    public final dugs e;
    public final dunz f;
    public final duoc g;
    public final dubf h;
    public final dtvq i;
    public final dutj j;
    public final durp k;
    public final dusj l;
    public final ejwi m;
    public final Executor n;
    public final ejwi o;
    public final dtpi p;
    public final duru q;

    public duku(Context context, durk durkVar, dunz dunzVar, duoc duocVar, dugr dugrVar, dugs dugsVar, dubf dubfVar, dtvq dtvqVar, dutj dutjVar, durp durpVar, dusj dusjVar, ejwi ejwiVar, Executor executor, ejwi ejwiVar2, dtpi dtpiVar, duru duruVar) {
        this.b = context;
        this.c = durkVar;
        this.f = dunzVar;
        this.g = duocVar;
        this.d = dugrVar;
        this.e = dugsVar;
        this.h = dubfVar;
        this.i = dtvqVar;
        this.j = dutjVar;
        this.k = durpVar;
        this.l = dusjVar;
        this.m = ejwiVar;
        this.n = executor;
        this.o = ejwiVar2;
        this.p = dtpiVar;
        this.q = duruVar;
    }

    public static ekgb a(List list) throws NoSuchAlgorithmException {
        String strA;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iA = dtqr.a(((dtqs) it.next()).f);
            if (iA != 0 && iA == 2) {
                ekfw ekfwVarD = ekgb.d(list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    dtqs dtqsVar = (dtqs) it2.next();
                    int iA2 = dtqr.a(dtqsVar.f);
                    if (iA2 == 0) {
                        iA2 = 1;
                    }
                    if (iA2 - 1 != 0) {
                        dtqp dtqpVar = (dtqp) dtqsVar.toBuilder();
                        String str = dtqsVar.d;
                        MessageDigest messageDigestE = duqr.e();
                        if (messageDigestE == null) {
                            strA = "";
                        } else {
                            byte[] bytes = str.getBytes();
                            messageDigestE.update(bytes, 0, bytes.length);
                            strA = duqr.a(messageDigestE.digest());
                        }
                        if (dutx.g(dtqsVar)) {
                            dtqpVar.copyOnWrite();
                            dtqs dtqsVar2 = (dtqs) dtqpVar.instance;
                            dtqsVar2.b |= 64;
                            dtqsVar2.i = strA;
                        } else {
                            dtqpVar.copyOnWrite();
                            dtqs dtqsVar3 = (dtqs) dtqpVar.instance;
                            dtqsVar3.b |= 16;
                            dtqsVar3.g = strA;
                        }
                        dtqs dtqsVar4 = (dtqs) dtqpVar.instance;
                        durt.c("FileId %s does not have checksum. Generated checksum from url %s", dtqsVar4.c, dtqsVar4.g);
                        ekfwVarD.h((dtqs) dtqpVar.build());
                    } else {
                        ekfwVarD.h(dtqsVar);
                    }
                }
                return ekfwVarD.g();
            }
        }
        return ekgb.n(list);
    }

    public static final ListenableFuture i(dtqy dtqyVar) {
        long j = dtqyVar.t;
        return eorv.a;
    }

    public final ListenableFuture b() {
        final dunz dunzVar = this.f;
        return eika.k(eika.k(dunzVar.c.c(), new eooz() { // from class: dunc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                final dunz dunzVar2 = dunzVar;
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(dunzVar2.a((dtsd) it.next()));
                    }
                } catch (Exception unused) {
                    dunzVar2.b.a();
                }
                return dvat.a(arrayList).b(new eooy() { // from class: dumv
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        return dunzVar2.b();
                    }
                }, dunzVar2.l);
            }
        }, dunzVar.l), new eooz() { // from class: dukq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duku dukuVar = this.a;
                return eika.k(dukuVar.g.a(), new eooz() { // from class: dujk
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return dukuVar.e.b();
                    }
                }, dukuVar.n);
            }
        }, this.n);
    }

    public final ListenableFuture c() {
        return eika.k(this.f.b(), new eooz() { // from class: dujj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duku dukuVar = this.a;
                return eika.k(dukuVar.g.a(), new eooz() { // from class: dujg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return dukuVar.e.b();
                    }
                }, dukuVar.n);
            }
        }, this.n);
    }

    public final ListenableFuture d(final boolean z, final eooz eoozVar) {
        durt.c("%s downloadAllPendingGroups on wifi = %s", "MDDManager", Boolean.valueOf(z));
        return eika.k(h(), new eooz() { // from class: duko
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                duku dukuVar = this.a;
                if (!dukuVar.p.S()) {
                    return eorv.a;
                }
                final eooz eoozVar2 = eoozVar;
                final boolean z2 = z;
                dukuVar.c.l(1031);
                final dugr dugrVar = dukuVar.d;
                return dugrVar.r(dugrVar.d.d(), eiid.d(new eooz() { // from class: duda
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) obj2).iterator();
                        while (true) {
                            final dugr dugrVar2 = dugrVar;
                            if (!it.hasNext()) {
                                return dvat.a(arrayList).a(new Callable() { // from class: duft
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return null;
                                    }
                                }, dugrVar2.h);
                            }
                            final dtrw dtrwVar = (dtrw) it.next();
                            if (!dtrwVar.f) {
                                final eooz eoozVar3 = eoozVar2;
                                final boolean z3 = z2;
                                arrayList.add(dugrVar2.r(dugrVar2.d.g(dtrwVar), new eooz() { // from class: dufs
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        int iA;
                                        boolean z4;
                                        dtqy dtqyVar = (dtqy) obj3;
                                        if (dtqyVar == null || !((iA = dvao.a(dtqyVar.s)) == 0 || iA == 1)) {
                                            return eork.i(null);
                                        }
                                        dtrk dtrkVar = dtqyVar.n;
                                        if (dtrkVar == null) {
                                            dtrkVar = dtrk.a;
                                        }
                                        dugr dugrVar3 = dugrVar2;
                                        int iA2 = dtrh.a(dtrkVar.d);
                                        if (iA2 != 0 && iA2 == 2) {
                                            z4 = true;
                                        } else {
                                            dtrk dtrkVar2 = dtqyVar.n;
                                            if (dtrkVar2 == null) {
                                                dtrkVar2 = dtrk.a;
                                            }
                                            int iA3 = dtrh.a(dtrkVar2.d);
                                            if (iA3 != 0 && iA3 == 3) {
                                                long jA = dugrVar3.m.a();
                                                dtqu dtquVar = dtqyVar.c;
                                                if (dtquVar == null) {
                                                    dtquVar = dtqu.a;
                                                }
                                                long j = jA - dtquVar.d;
                                                dtrk dtrkVar3 = dtqyVar.n;
                                                if (dtrkVar3 == null) {
                                                    dtrkVar3 = dtrk.a;
                                                }
                                                if (j / 1000 > dtrkVar3.e) {
                                                    dtqx dtqxVar = (dtqx) dtqyVar.toBuilder();
                                                    dtrk dtrkVar4 = dtqyVar.n;
                                                    if (dtrkVar4 == null) {
                                                        dtrkVar4 = dtrk.a;
                                                    }
                                                    dtrf dtrfVar = (dtrf) dtrkVar4.toBuilder();
                                                    dtrfVar.copyOnWrite();
                                                    dtrk dtrkVar5 = (dtrk) dtrfVar.instance;
                                                    dtrkVar5.d = 1;
                                                    dtrkVar5.b |= 2;
                                                    dtqxVar.copyOnWrite();
                                                    dtqy dtqyVar2 = (dtqy) dtqxVar.instance;
                                                    dtrk dtrkVar6 = (dtrk) dtrfVar.build();
                                                    dtrkVar6.getClass();
                                                    dtqyVar2.n = dtrkVar6;
                                                    dtqyVar2.b |= 2048;
                                                    dtqyVar = (dtqy) dtqxVar.build();
                                                    z4 = true;
                                                }
                                            }
                                            z4 = false;
                                        }
                                        boolean z5 = z3;
                                        durt.d("%s: Try to download pending file group: %s, download over cellular = %s", "FileGroupManager", dtqyVar.d, Boolean.valueOf(z4));
                                        if (!z5 && !z4) {
                                            return eork.i(null);
                                        }
                                        dtrk dtrkVar7 = dtqyVar.n;
                                        if (dtrkVar7 == null) {
                                            dtrkVar7 = dtrk.a;
                                        }
                                        return dugrVar3.e(dtrwVar, dtrkVar7, eoozVar3);
                                    }
                                }));
                            }
                        }
                    }
                }));
            }
        }, this.n);
    }

    public final ListenableFuture e(final dtrw dtrwVar, final ejwi ejwiVar, final eooz eoozVar) {
        durt.d("%s downloadFileGroup %s %s", "MDDManager", dtrwVar.c, dtrwVar.d);
        return eika.k(h(), new eooz() { // from class: dujl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.d.e(dtrwVar, (dtrk) ejwiVar.f(), eoozVar);
            }
        }, this.n);
    }

    public final ListenableFuture f() {
        durt.b("%s getAllFreshGroups", "MDDManager");
        return eika.k(h(), new eooz() { // from class: dukm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.e.c();
            }
        }, this.n);
    }

    public final ListenableFuture g(final dtrw dtrwVar, final boolean z) {
        durt.d("%s getFileGroup %s %s", "MDDManager", dtrwVar.c, dtrwVar.d);
        return eika.k(h(), new eooz() { // from class: dukr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.d.g(dtrwVar, z);
            }
        }, this.n);
    }

    public final ListenableFuture h() {
        if (a) {
            return eorv.a;
        }
        dvaq dvaqVarE = dvaq.e(eorv.a);
        eooz eoozVar = new eooz() { // from class: duka
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                duku dukuVar = this.a;
                final SharedPreferences sharedPreferencesA = duuj.a(dukuVar.b, "gms_icing_mdd_manager_metadata", dukuVar.m);
                if (sharedPreferencesA.getBoolean("mdd_migrated_to_offroad", false)) {
                    return eorv.a;
                }
                durt.b("%s Clearing MDD as device isn't migrated to offroad.", "MDDManager");
                return eika.j(dukuVar.c(), new ejvr() { // from class: duiw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        boolean z = duku.a;
                        sharedPreferencesA.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
                        return null;
                    }
                }, dukuVar.n);
            }
        };
        Executor executor = this.n;
        return dvaqVarE.g(eoozVar, executor).g(new eooz() { // from class: dukb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duku dukuVar = this.a;
                dunz dunzVar = dukuVar.f;
                Context context = dunzVar.a;
                SharedPreferences sharedPreferencesA = duuj.a(context, "gms_icing_mdd_shared_file_manager_metadata", dunzVar.k);
                if (sharedPreferencesA.contains("migrated_to_new_file_key")) {
                    if (sharedPreferencesA.getBoolean("migrated_to_new_file_key", false)) {
                        duiv.e(context);
                    }
                    sharedPreferencesA.edit().remove("migrated_to_new_file_key").commit();
                }
                return eika.k(eork.i(true), new eooz() { // from class: dujr
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return eorv.a;
                        }
                        duku dukuVar2 = dukuVar;
                        durt.n("%s Clearing MDD since FileManager failed or needs migration.", "MDDManager");
                        return dukuVar2.c();
                    }
                }, dukuVar.n);
            }
        }, executor).g(new eooz() { // from class: dukc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duku dukuVar = this.a;
                return eika.k(dukuVar.g.d(), new eooz() { // from class: dujq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return eorv.a;
                        }
                        duku dukuVar2 = dukuVar;
                        durt.n("%s Clearing MDD since FilesMetadata failed or needs migration.", "MDDManager");
                        return dukuVar2.c();
                    }
                }, dukuVar.n);
            }
        }, executor).g(new eooz() { // from class: dukd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.e.f();
            }
        }, executor).f(new ejvr() { // from class: duke
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                duku.a = true;
                return null;
            }
        }, executor);
    }
}
