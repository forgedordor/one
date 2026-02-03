package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtvl implements dtsl {
    public final Context a;
    public final durk b;
    public final ejwi c;
    public final duku d;
    public final ecev e;
    public final dtpi f;
    public final dutv g;
    public final dutv h;
    public final Executor i;
    public final ejwi j;
    public final ejwi k;
    public final duag m;
    private final List n;
    private final duut o;
    private final dvap p = new dvap();
    public final eooz l = new eooz() { // from class: dtuw
        @Override // defpackage.eooz
        public final ListenableFuture a(Object obj) {
            return eork.i(dtng.SUCCESS);
        }
    };

    public dtvl(Context context, durk durkVar, duku dukuVar, Executor executor, List list, ejwi ejwiVar, ecev ecevVar, ejwi ejwiVar2, ejwi ejwiVar3, dtpi dtpiVar, duut duutVar, duag duagVar) {
        this.a = context;
        this.b = durkVar;
        this.n = list;
        this.c = ejwiVar;
        this.i = executor;
        this.d = dukuVar;
        this.e = ecevVar;
        this.j = ejwiVar2;
        this.k = ejwiVar3;
        this.f = dtpiVar;
        this.o = duutVar;
        this.h = dutv.a(executor);
        this.g = new dutv(executor, new dtvi(ejwiVar3, context));
        this.m = duagVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dtlw n(String str, long j, long j2, String str2, evqe evqeVar, boolean z, String str3) {
        dtlv dtlvVar = (dtlv) dtlw.a.createBuilder();
        dtlvVar.copyOnWrite();
        dtlw dtlwVar = (dtlw) dtlvVar.instance;
        str.getClass();
        dtlwVar.b |= 1;
        dtlwVar.c = str;
        dtlvVar.copyOnWrite();
        dtlw dtlwVar2 = (dtlw) dtlvVar.instance;
        dtlwVar2.b |= 4;
        dtlwVar2.e = (int) j;
        dtlvVar.copyOnWrite();
        dtlw dtlwVar3 = (dtlw) dtlvVar.instance;
        dtlwVar3.b |= 32;
        dtlwVar3.h = z;
        dtlvVar.copyOnWrite();
        dtlw dtlwVar4 = (dtlw) dtlvVar.instance;
        str3.getClass();
        dtlwVar4.b |= 64;
        dtlwVar4.i = str3;
        if (j2 > 0) {
            dtlvVar.copyOnWrite();
            dtlw dtlwVar5 = (dtlw) dtlvVar.instance;
            dtlwVar5.b |= 8;
            dtlwVar5.f = (int) j2;
        }
        if (j > 2147483647L || j2 > 2147483647L) {
            evsl evslVar = dtmc.b;
            dtmb dtmbVar = (dtmb) dtmc.a.createBuilder();
            dtmbVar.copyOnWrite();
            dtmc dtmcVar = (dtmc) dtmbVar.instance;
            dtmcVar.c |= 1;
            dtmcVar.d = j;
            dtmbVar.copyOnWrite();
            dtmc dtmcVar2 = (dtmc) dtmbVar.instance;
            dtmcVar2.c |= 2;
            dtmcVar2.e = j2;
            dtlvVar.e(evslVar, (dtmc) dtmbVar.build());
        }
        if (str2 != null) {
            dtlvVar.copyOnWrite();
            dtlw dtlwVar6 = (dtlw) dtlvVar.instance;
            dtlwVar6.b |= 2;
            dtlwVar6.d = str2;
        }
        if (evqeVar != null) {
            dtlvVar.copyOnWrite();
            dtlw dtlwVar7 = (dtlw) dtlvVar.instance;
            dtlwVar7.g = evqeVar;
            dtlwVar7.b |= 16;
        }
        return (dtlw) dtlvVar.build();
    }

    public static ejwi o(dtrw dtrwVar, dtqy dtqyVar, dtpi dtpiVar) {
        return dtpiVar.J() ? (dtrwVar.b & 16) != 0 ? ejwi.j(dtrwVar.g) : ejud.a : dtqyVar != null ? ejwi.j(dtqyVar.u) : ejud.a;
    }

    public static eoir p(dtma dtmaVar) {
        eoiq eoiqVar = (eoiq) eoir.a.createBuilder();
        String str = dtmaVar.c;
        eoiqVar.copyOnWrite();
        eoir eoirVar = (eoir) eoiqVar.instance;
        str.getClass();
        eoirVar.b |= 1;
        eoirVar.c = str;
        String str2 = dtmaVar.d;
        eoiqVar.copyOnWrite();
        eoir eoirVar2 = (eoir) eoiqVar.instance;
        str2.getClass();
        eoirVar2.b |= 4;
        eoirVar2.e = str2;
        int i = dtmaVar.f;
        eoiqVar.copyOnWrite();
        eoir eoirVar3 = (eoir) eoiqVar.instance;
        eoirVar3.b |= 2;
        eoirVar3.d = i;
        int size = dtmaVar.h.size();
        eoiqVar.copyOnWrite();
        eoir eoirVar4 = (eoir) eoiqVar.instance;
        eoirVar4.b |= 8;
        eoirVar4.f = size;
        String str3 = dtmaVar.j;
        eoiqVar.copyOnWrite();
        eoir eoirVar5 = (eoir) eoiqVar.instance;
        str3.getClass();
        eoirVar5.b |= 128;
        eoirVar5.j = str3;
        long j = dtmaVar.i;
        eoiqVar.copyOnWrite();
        eoir eoirVar6 = (eoir) eoiqVar.instance;
        eoirVar6.b |= 64;
        eoirVar6.i = j;
        return (eoir) eoiqVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List s(ecev ecevVar, Uri uri, String str) throws ecgh {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : ecevVar.b(uri)) {
            if (ecevVar.i(uri2)) {
                arrayList.addAll(s(ecevVar, uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    long jA = ecevVar.a(uri2);
                    dtlv dtlvVar = (dtlv) dtlw.a.createBuilder();
                    String strReplaceFirst = path.replaceFirst(str, "");
                    dtlvVar.copyOnWrite();
                    dtlw dtlwVar = (dtlw) dtlvVar.instance;
                    strReplaceFirst.getClass();
                    dtlwVar.b |= 1;
                    dtlwVar.c = strReplaceFirst;
                    dtlvVar.copyOnWrite();
                    dtlw dtlwVar2 = (dtlw) dtlvVar.instance;
                    dtlwVar2.b |= 4;
                    dtlwVar2.e = (int) jA;
                    String string = uri2.toString();
                    dtlvVar.copyOnWrite();
                    dtlw dtlwVar3 = (dtlw) dtlvVar.instance;
                    string.getClass();
                    dtlwVar3.b |= 2;
                    dtlwVar3.d = string;
                    if (jA > 2147483647L) {
                        evsl evslVar = dtmc.b;
                        dtmb dtmbVar = (dtmb) dtmc.a.createBuilder();
                        dtmbVar.copyOnWrite();
                        dtmc dtmcVar = (dtmc) dtmbVar.instance;
                        dtmcVar.c |= 1;
                        dtmcVar.d = jA;
                        dtlvVar.e(evslVar, (dtmc) dtmbVar.build());
                    }
                    arrayList.add((dtlw) dtlvVar.build());
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public static final ejwi t(ejwi ejwiVar, Map map, String str) {
        ?? r1 = ((ejwt) ejwiVar).a;
        return r1.containsKey(str) ? ejwi.i((dtvt) r1.get(str)) : ejwi.i((dtvt) map.get(str));
    }

    public static ListenableFuture u(final dtqy dtqyVar, ejwi ejwiVar, String str, dtlz dtlzVar, final boolean z, final duku dukuVar, Executor executor, final ecev ecevVar) {
        dvaq dvaqVarG;
        if (dtqyVar == null) {
            return eork.i(null);
        }
        final dtlx dtlxVar = (dtlx) dtma.a.createBuilder();
        String str2 = dtqyVar.d;
        dtlxVar.copyOnWrite();
        dtma dtmaVar = (dtma) dtlxVar.instance;
        str2.getClass();
        dtmaVar.b |= 1;
        dtmaVar.c = str2;
        String str3 = dtqyVar.e;
        dtlxVar.copyOnWrite();
        dtma dtmaVar2 = (dtma) dtlxVar.instance;
        str3.getClass();
        dtmaVar2.b |= 2;
        dtmaVar2.d = str3;
        int i = dtqyVar.f;
        dtlxVar.copyOnWrite();
        dtma dtmaVar3 = (dtma) dtlxVar.instance;
        dtmaVar3.b |= 8;
        dtmaVar3.f = i;
        evqe evqeVar = dtqyVar.g;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        dtlxVar.copyOnWrite();
        dtma dtmaVar4 = (dtma) dtlxVar.instance;
        evqeVar.getClass();
        dtmaVar4.l = evqeVar;
        dtmaVar4.b |= 128;
        long j = dtqyVar.t;
        dtlxVar.copyOnWrite();
        dtma dtmaVar5 = (dtma) dtlxVar.instance;
        dtmaVar5.b |= 32;
        dtmaVar5.i = j;
        dtlxVar.copyOnWrite();
        dtma dtmaVar6 = (dtma) dtlxVar.instance;
        dtmaVar6.g = dtlzVar.e;
        dtmaVar6.b |= 16;
        evtg evtgVar = dtqyVar.v;
        dtlxVar.copyOnWrite();
        dtma dtmaVar7 = (dtma) dtlxVar.instance;
        evtg evtgVar2 = dtmaVar7.k;
        if (!evtgVar2.c()) {
            dtmaVar7.k = evsn.mutableCopy(evtgVar2);
        }
        evpz.addAll(evtgVar, dtmaVar7.k);
        if (ejwiVar.g()) {
            Object objC = ejwiVar.c();
            dtlxVar.copyOnWrite();
            dtma dtmaVar8 = (dtma) dtlxVar.instance;
            dtmaVar8.b |= 64;
            dtmaVar8.j = (String) objC;
        }
        if (str != null) {
            dtlxVar.copyOnWrite();
            dtma dtmaVar9 = (dtma) dtlxVar.instance;
            dtmaVar9.b |= 4;
            dtmaVar9.e = str;
        }
        if ((dtqyVar.b & 32) != 0) {
            evqe evqeVar2 = dtqyVar.h;
            if (evqeVar2 == null) {
                evqeVar2 = evqe.a;
            }
            dtlxVar.copyOnWrite();
            dtma dtmaVar10 = (dtma) dtlxVar.instance;
            evqeVar2.getClass();
            dtmaVar10.m = evqeVar2;
            dtmaVar10.b |= 256;
        }
        final evtg evtgVar3 = dtqyVar.p;
        ListenableFuture listenableFuture = eorv.a;
        if (dtlzVar == dtlz.DOWNLOADED || dtlzVar == dtlz.PENDING_CUSTOM_VALIDATION) {
            if (dtqyVar.o) {
                ejwl.a(true);
                String string = dutx.c(dukuVar.b, dukuVar.m, dtqyVar).toString();
                dtlxVar.copyOnWrite();
                dtma dtmaVar11 = (dtma) dtlxVar.instance;
                string.getClass();
                dtmaVar11.b |= 1024;
                dtmaVar11.n = string;
            }
            dtlz dtlzVar2 = dtlz.PENDING_CUSTOM_VALIDATION;
            durt.c("%s: getDataFileUris %s", "MDDManager", dtqyVar.d);
            final boolean z2 = dtlzVar != dtlzVar2 && dutx.j(dtqyVar);
            ekgi ekgiVar = new ekgi();
            if (z2) {
                ekgiVar.g(dukuVar.d.b(dtqyVar));
            }
            final ekgp ekgpVarB = ekgiVar.b();
            dvaq dvaqVarE = dvaq.e(dukuVar.h());
            eooz eoozVar = new eooz() { // from class: dukt
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (z2 && !z) {
                        return eork.i(ekoj.a);
                    }
                    return dukuVar.d.k(dtqyVar);
                }
            };
            Executor executor2 = dukuVar.n;
            dvaqVarG = dvaq.e(dvaqVarE.g(eoozVar, executor2).f(new ejvr() { // from class: duix
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekgp ekgpVar = (ekgp) obj;
                    if (!z2) {
                        return ekgpVar;
                    }
                    ekgp ekgpVar2 = ekgpVarB;
                    return !z ? ekgpVar2 : dukuVar.d.c(ekgpVar2, ekgpVar);
                }
            }, executor2).f(new ejvr() { // from class: duiy
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekgi ekgiVar2 = new ekgi();
                    ekqg ekqgVarListIterator = ((ekgp) obj).entrySet().listIterator();
                    while (ekqgVarListIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                        dtqs dtqsVar = (dtqs) entry.getKey();
                        if (entry.getValue() != null) {
                            if ((dtqsVar.b & 256) != 0) {
                                Uri uriBuild = (Uri) entry.getValue();
                                exyx exyxVar = dtqsVar.k;
                                if (exyxVar == null) {
                                    exyxVar = exyx.a;
                                }
                                if (dukuVar.p.C() && exyxVar.b.size() != 0) {
                                    uriBuild = uriBuild.buildUpon().encodedFragment(echy.a(exyxVar)).build();
                                }
                                ekgiVar2.i(dtqsVar, uriBuild);
                            } else {
                                ekgiVar2.j(entry);
                            }
                        }
                    }
                    return ekgiVar2.b();
                }
            }, executor2)).g(new eooz() { // from class: dtur
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    boolean zG;
                    dtlx dtlxVar2;
                    evqe evqeVar3;
                    ecev ecevVar2 = ecevVar;
                    ekgp ekgpVar = (ekgp) obj;
                    for (dtqs dtqsVar : evtgVar3) {
                        if (!ekgpVar.containsKey(dtqsVar)) {
                            dtov dtovVarA = dtox.a();
                            dtovVarA.a = dtow.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                            dtovVarA.b = "getDataFileUris() resolved to null";
                            return eork.h(dtovVarA.a());
                        }
                        Uri uri = (Uri) ekgpVar.get(dtqsVar);
                        try {
                            zG = dutx.g(dtqsVar);
                            dtlxVar2 = dtlxVar;
                        } catch (IOException e) {
                            durt.j(e, "Failed to list files under directory:".concat(String.valueOf(String.valueOf(uri))));
                        }
                        if (zG && ecevVar2.i(uri)) {
                            String path = uri.getPath();
                            if (path != null) {
                                List listS = dtvl.s(ecevVar2, uri, path);
                                dtlxVar2.copyOnWrite();
                                dtma dtmaVar12 = (dtma) dtlxVar2.instance;
                                dtma dtmaVar13 = dtma.a;
                                dtmaVar12.a();
                                evpz.addAll(listS, dtmaVar12.h);
                            }
                        } else {
                            String str4 = dtqsVar.c;
                            long j2 = dtqsVar.e;
                            long j3 = dtqsVar.j;
                            String string2 = uri.toString();
                            if ((dtqsVar.b & 8192) != 0) {
                                evqeVar3 = dtqsVar.q;
                                if (evqeVar3 == null) {
                                    evqeVar3 = evqe.a;
                                }
                            } else {
                                evqeVar3 = null;
                            }
                            dtlxVar2.a(dtvl.n(str4, j2, j3, string2, evqeVar3, true, dtqsVar.g));
                        }
                    }
                    return eorv.a;
                }
            }, executor);
        } else {
            final dugr dugrVar = dukuVar.d;
            dvaq dvaqVarE2 = dvaq.e(eork.i(dtqyVar.p));
            ejvr ejvrVar = new ejvr() { // from class: duey
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Stream stream = Collection.EL.stream((List) obj);
                    Function function = new Function() { // from class: dubj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return (dtqs) obj2;
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    };
                    final dtqy dtqyVar2 = dtqyVar;
                    return (ekgp) stream.collect(ekcv.a(function, new Function() { // from class: dubk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            dtqs dtqsVar = (dtqs) obj2;
                            int iA = dtqw.a(dtqyVar2.k);
                            if (iA == 0) {
                                iA = 1;
                            }
                            return duob.a(dtqsVar, iA);
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    }));
                }
            };
            Executor executor3 = dugrVar.h;
            final dvaq dvaqVarF = dvaqVarE2.f(ejvrVar, executor3);
            dvaqVarG = dvaq.e(dvaqVarF.g(new eooz() { // from class: dufa
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return dugrVar.e.c.f(ekhx.o(((ekgp) obj).values()));
                }
            }, executor3).g(new eooz() { // from class: dufb
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ekgp ekgpVar = (ekgp) obj;
                    ekgp ekgpVar2 = (ekgp) eork.q(dvaqVarF);
                    HashMap map = new HashMap();
                    ekqg ekqgVarListIterator = ekgpVar2.entrySet().listIterator();
                    while (ekqgVarListIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                        if (ekgpVar.containsKey(entry.getValue())) {
                            dtqs dtqsVar = (dtqs) entry.getKey();
                            dtru dtruVarB = dtru.b(((dtsh) ekgpVar.get(entry.getValue())).d);
                            if (dtruVarB == null) {
                                dtruVarB = dtru.NONE;
                            }
                            map.put(dtqsVar, dtruVarB);
                        }
                    }
                    return eork.i(ekgp.j(map));
                }
            }, executor3)).g(new eooz() { // from class: dtus
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    evqe evqeVar3;
                    ekgp ekgpVar = (ekgp) obj;
                    for (dtqs dtqsVar : evtgVar3) {
                        String str4 = dtqsVar.c;
                        long j2 = dtqsVar.e;
                        long j3 = dtqsVar.j;
                        if ((dtqsVar.b & 8192) != 0) {
                            evqeVar3 = dtqsVar.q;
                            if (evqeVar3 == null) {
                                evqeVar3 = evqe.a;
                            }
                        } else {
                            evqeVar3 = null;
                        }
                        evqe evqeVar4 = evqeVar3;
                        boolean z3 = false;
                        if (ekgpVar.containsKey(dtqsVar) && ekgpVar.get(dtqsVar) == dtru.DOWNLOAD_COMPLETE) {
                            z3 = true;
                        }
                        dtlxVar.a(dtvl.n(str4, j2, j3, null, evqeVar4, z3, dtqsVar.g));
                    }
                    return eorv.a;
                }
            }, executor);
        }
        return dvaq.e(dvaqVarG).f(new ejvr() { // from class: dtut
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (dtma) dtlxVar.build();
            }
        }, executor).c(dtox.class, new ejvr() { // from class: dtuu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, executor);
    }

    private final ListenableFuture w(final boolean z) {
        dvaq dvaqVarE = dvaq.e(r());
        eooz eoozVar = new eooz() { // from class: dtst
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtvl dtvlVar = this.a;
                return dtvlVar.d.d(z, dtvlVar.l);
            }
        };
        Executor executor = this.i;
        return dvaqVarE.g(eoozVar, executor).g(new eooz() { // from class: dtsu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.r();
            }
        }, executor).g(new eooz() { // from class: dtsv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtvl dtvlVar = this.a;
                return dtvlVar.d.d(z, dtvlVar.l);
            }
        }, executor);
    }

    private final void x(final int i, final ListenableFuture listenableFuture, final long j, final eoir eoirVar, final dtvk dtvkVar, final dtvj dtvjVar) {
        listenableFuture.b(eiid.k(new Runnable() { // from class: dtss
            @Override // java.lang.Runnable
            public final void run() {
                final dtvl dtvlVar = this.a;
                final long jB = dtvlVar.m.b() - j;
                final eoir eoirVar2 = eoirVar;
                final ListenableFuture listenableFuture2 = listenableFuture;
                final dtvj dtvjVar2 = dtvjVar;
                final dtvk dtvkVar2 = dtvkVar;
                final int i2 = i;
                eika.g(new Runnable() { // from class: dtto
                    /* JADX WARN: Removed duplicated region for block: B:37:0x004d  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            r7 = this;
                            com.google.common.util.concurrent.ListenableFuture r0 = r3
                            dtvj r1 = r4
                            r2 = 4
                            java.lang.Object r0 = defpackage.eork.q(r0)     // Catch: java.lang.Throwable -> L10
                            int r1 = r1.a(r0)     // Catch: java.lang.Throwable -> Le
                            goto L49
                        Le:
                            r1 = move-exception
                            goto L12
                        L10:
                            r1 = move-exception
                            r0 = 0
                        L12:
                            boolean r3 = r1 instanceof java.util.concurrent.ExecutionException
                            if (r3 == 0) goto L1a
                            java.lang.Throwable r1 = r1.getCause()
                        L1a:
                            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
                            if (r3 == 0) goto L20
                            r1 = 5
                            goto L49
                        L20:
                            boolean r3 = r1 instanceof java.lang.InterruptedException
                            if (r3 == 0) goto L26
                            r1 = 6
                            goto L49
                        L26:
                            boolean r3 = r1 instanceof java.io.IOException
                            if (r3 == 0) goto L2c
                            r1 = 7
                            goto L49
                        L2c:
                            boolean r3 = r1 instanceof java.lang.IllegalStateException
                            if (r3 == 0) goto L33
                            r1 = 8
                            goto L49
                        L33:
                            boolean r3 = r1 instanceof java.lang.IllegalArgumentException
                            if (r3 == 0) goto L3a
                            r1 = 9
                            goto L49
                        L3a:
                            boolean r3 = r1 instanceof java.lang.UnsupportedOperationException
                            if (r3 == 0) goto L41
                            r1 = 10
                            goto L49
                        L41:
                            boolean r1 = r1 instanceof defpackage.dtox
                            if (r1 == 0) goto L48
                            r1 = 11
                            goto L49
                        L48:
                            r1 = r2
                        L49:
                            eoir r3 = r2
                            if (r0 == 0) goto L63
                            dtvk r4 = r5
                            evsf r3 = r3.toBuilder()
                            eoiq r3 = (defpackage.eoiq) r3
                            eoir r0 = r4.a(r0)
                            r3.mergeFrom(r0)
                            evsn r0 = r3.build()
                            r3 = r0
                            eoir r3 = (defpackage.eoir) r3
                        L63:
                            int r0 = r6
                            eojl r4 = defpackage.eojl.a
                            evsf r4 = r4.createBuilder()
                            eojk r4 = (defpackage.eojk) r4
                            r4.copyOnWrite()
                            MessageType extends evsn<MessageType, BuilderType> r5 = r4.instance
                            eojl r5 = (defpackage.eojl) r5
                            int r0 = r0 + (-2)
                            r5.c = r0
                            int r0 = r5.b
                            r0 = r0 | 1
                            r5.b = r0
                            r4.copyOnWrite()
                            MessageType extends evsn<MessageType, BuilderType> r0 = r4.instance
                            eojl r0 = (defpackage.eojl) r0
                            long r5 = r7
                            int r1 = r1 + (-2)
                            r0.d = r1
                            int r1 = r0.b
                            r1 = r1 | 2
                            r0.b = r1
                            r4.copyOnWrite()
                            MessageType extends evsn<MessageType, BuilderType> r0 = r4.instance
                            eojl r0 = (defpackage.eojl) r0
                            int r1 = r0.b
                            r1 = r1 | r2
                            r0.b = r1
                            r0.f = r5
                            r4.copyOnWrite()
                            MessageType extends evsn<MessageType, BuilderType> r0 = r4.instance
                            eojl r0 = (defpackage.eojl) r0
                            r3.getClass()
                            evtg r1 = r0.e
                            boolean r2 = r1.c()
                            if (r2 != 0) goto Lb7
                            evtg r1 = defpackage.evsn.mutableCopy(r1)
                            r0.e = r1
                        Lb7:
                            dtvl r1 = r1
                            evtg r0 = r0.e
                            r0.add(r3)
                            evsn r0 = r4.build()
                            eojl r0 = (defpackage.eojl) r0
                            durk r1 = r1.b
                            r1.g(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtto.run():void");
                    }
                }, dtvlVar.i);
            }
        }), eoqg.a);
    }

    @Override // defpackage.dtsl
    public final ListenableFuture a(final dtmh dtmhVar) {
        long jB = this.m.b();
        ListenableFuture listenableFutureB = this.p.b(new eooy() { // from class: dtuo
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dtmk dtmkVar = (dtmk) dtmhVar;
                dtns dtnsVar = dtmkVar.a;
                String str = dtnsVar.c;
                String str2 = dtnsVar.i;
                Long lValueOf = Long.valueOf(dtnsVar.h);
                ejwi ejwiVar = dtmkVar.b;
                String strValueOf = String.valueOf(ejwiVar.f());
                ejwi ejwiVar2 = dtmkVar.c;
                durt.d("%s: Adding for download group = '%s', variant = '%s', buildId = '%d' and associating it with account = '%s', variant = '%s'", "MobileDataDownload", str, str2, lValueOf, strValueOf, String.valueOf(ejwiVar2.f()));
                dtvl dtvlVar = this.a;
                if (dtvlVar.f.J() && ejwiVar2.g() && !dtnsVar.i.equals(ejwiVar2.c())) {
                    durt.i("%s: Added group = '%s' with wrong variant id: '%s' v.s. '%s' ", "MobileDataDownload", dtnsVar.c, ejwiVar2.c(), dtnsVar.i);
                    return eork.i(false);
                }
                if ((dtnsVar.b & 2) == 0) {
                    dtnr dtnrVar = (dtnr) dtnsVar.toBuilder();
                    String packageName = dtvlVar.a.getPackageName();
                    dtnrVar.copyOnWrite();
                    dtns dtnsVar2 = (dtns) dtnrVar.instance;
                    packageName.getClass();
                    dtnsVar2.b |= 2;
                    dtnsVar2.d = packageName;
                    dtnsVar = (dtns) dtnrVar.build();
                } else if (!dtvlVar.a.getPackageName().equals(dtnsVar.d)) {
                    durt.i("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", "MobileDataDownload", dtnsVar.c, dtvlVar.a.getPackageName(), dtnsVar.d);
                    return eork.i(false);
                }
                dtrv dtrvVar = (dtrv) dtrw.a.createBuilder();
                String str3 = dtnsVar.c;
                dtrvVar.copyOnWrite();
                dtrw dtrwVar = (dtrw) dtrvVar.instance;
                str3.getClass();
                dtrwVar.b |= 1;
                dtrwVar.c = str3;
                String str4 = dtnsVar.d;
                dtrvVar.copyOnWrite();
                dtrw dtrwVar2 = (dtrw) dtrvVar.instance;
                str4.getClass();
                dtrwVar2.b = 2 | dtrwVar2.b;
                dtrwVar2.d = str4;
                if (ejwiVar.g()) {
                    String strA = dtvy.a((Account) ejwiVar.c());
                    dtrvVar.copyOnWrite();
                    dtrw dtrwVar3 = (dtrw) dtrvVar.instance;
                    dtrwVar3.b = 4 | dtrwVar3.b;
                    dtrwVar3.e = strA;
                }
                if (ejwiVar2.g()) {
                    Object objC = ejwiVar2.c();
                    dtrvVar.copyOnWrite();
                    dtrw dtrwVar4 = (dtrw) dtrvVar.instance;
                    dtrwVar4.b |= 16;
                    dtrwVar4.g = (String) objC;
                }
                try {
                    byte[] byteArray = dtnsVar.toByteArray();
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    final dtqy dtqyVar = (dtqy) evsn.parseFrom(dtqy.a, byteArray, evrr.a);
                    Stream map = Collection.EL.stream(dtnsVar.g).map(new Function() { // from class: duua
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            dtnq dtnqVar = (dtnq) obj;
                            for (dtqs dtqsVar : dtqyVar.p) {
                                if (dtqsVar.c.equals(dtnqVar.c)) {
                                    evsl evslVar = dtos.b;
                                    evsl evslVarCheckIsLite = evsn.checkIsLite(evslVar);
                                    dtnqVar.d(evslVarCheckIsLite);
                                    if (!dtnqVar.r.o(evslVarCheckIsLite.d)) {
                                        return dtqsVar;
                                    }
                                    evsl evslVarCheckIsLite2 = evsn.checkIsLite(evslVar);
                                    dtnqVar.d(evslVarCheckIsLite2);
                                    Object objL = dtnqVar.r.l(evslVarCheckIsLite2.d);
                                    dtos dtosVar = (dtos) (objL == null ? evslVarCheckIsLite2.b : evslVarCheckIsLite2.c(objL));
                                    dtqp dtqpVar = (dtqp) dtqsVar.toBuilder();
                                    long j = dtosVar.d;
                                    dtqpVar.copyOnWrite();
                                    dtqs dtqsVar2 = (dtqs) dtqpVar.instance;
                                    dtqsVar2.b |= 4;
                                    dtqsVar2.e = j;
                                    long j2 = dtosVar.e;
                                    dtqpVar.copyOnWrite();
                                    dtqs dtqsVar3 = (dtqs) dtqpVar.instance;
                                    dtqsVar3.b |= 128;
                                    dtqsVar3.j = j2;
                                    return (dtqs) dtqpVar.build();
                                }
                            }
                            throw new IllegalArgumentException("DataFileGroupInternal does not contain DataFile with fileId: ".concat(String.valueOf(dtnqVar.c)));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = ekgb.d;
                    ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                    dtqx dtqxVar = (dtqx) dtqyVar.toBuilder();
                    dtqxVar.copyOnWrite();
                    ((dtqy) dtqxVar.instance).p = dtqy.emptyProtobufList();
                    dtqxVar.a(ekgbVar);
                    final dtqy dtqyVar2 = (dtqy) dtqxVar.build();
                    final duku dukuVar = dtvlVar.d;
                    final dtrw dtrwVar5 = (dtrw) dtrvVar.build();
                    final eooz eoozVar = dtvlVar.l;
                    durt.c("%s addGroupForDownload %s", "MDDManager", dtrwVar5.c);
                    return eika.f(eika.k(dukuVar.h(), new eooz() { // from class: dukn
                        /* JADX WARN: Code restructure failed: missing block: B:141:0x020c, code lost:
                        
                            r2 = r10.c;
                            r3 = r8.c;
                            r4 = new java.lang.Object[4];
                            r4[r20 == true ? 1 : 0] = "DataFileGroupValidator";
                            r4[1] = r12;
                            r4[2] = r2;
                            r4[r24] = r3;
                            defpackage.durt.i("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", r4);
                            r20 = r20;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:148:0x0256, code lost:
                        
                            r20 = r8;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:149:0x0259, code lost:
                        
                            r20 = r8;
                            r24 = 3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:150:0x025d, code lost:
                        
                            r2 = r0.d;
                            r3 = r10.c;
                            r4 = new java.lang.Object[r24];
                            r4[r20 == true ? 1 : 0] = "DataFileGroupValidator";
                            r4[1] = r2;
                            r4[2] = r3;
                            defpackage.durt.i("%s File details missing in added group = %s, file id = %s", r4);
                            r20 = r20;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:176:0x02ef  */
                        /* JADX WARN: Removed duplicated region for block: B:90:0x015c  */
                        /* JADX WARN: Removed duplicated region for block: B:99:0x017a  */
                        @Override // defpackage.eooz
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r24) throws defpackage.duok, java.security.NoSuchAlgorithmException, defpackage.dubg {
                            /*
                                Method dump skipped, instructions count: 1044
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.dukn.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                        }
                    }, dukuVar.n), IOException.class, new eooz() { // from class: dttn
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            durt.k((IOException) obj, "%s: IOException while adding group for download", "MobileDataDownload");
                            return eork.i(false);
                        }
                    }, dtvlVar.i);
                } catch (evtj e) {
                    durt.k(e, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", "MobileDataDownload");
                    return eork.i(false);
                }
            }
        }, this.i);
        eoiq eoiqVar = (eoiq) eoir.a.createBuilder();
        dtmk dtmkVar = (dtmk) dtmhVar;
        dtns dtnsVar = dtmkVar.a;
        String str = dtnsVar.c;
        eoiqVar.copyOnWrite();
        eoir eoirVar = (eoir) eoiqVar.instance;
        str.getClass();
        eoirVar.b |= 1;
        eoirVar.c = str;
        long j = dtnsVar.h;
        eoiqVar.copyOnWrite();
        eoir eoirVar2 = (eoir) eoiqVar.instance;
        eoirVar2.b |= 64;
        eoirVar2.i = j;
        String str2 = dtnsVar.i;
        eoiqVar.copyOnWrite();
        eoir eoirVar3 = (eoir) eoiqVar.instance;
        str2.getClass();
        eoirVar3.b |= 128;
        eoirVar3.j = str2;
        boolean zG = dtmkVar.b.g();
        eoiqVar.copyOnWrite();
        eoir eoirVar4 = (eoir) eoiqVar.instance;
        eoirVar4.b |= 32;
        eoirVar4.h = zG;
        boolean zG2 = dtmkVar.c.g();
        eoiqVar.copyOnWrite();
        eoir eoirVar5 = (eoir) eoiqVar.instance;
        eoirVar5.b |= 256;
        eoirVar5.k = zG2;
        int i = dtnsVar.e;
        eoiqVar.copyOnWrite();
        eoir eoirVar6 = (eoir) eoiqVar.instance;
        eoirVar6.b |= 2;
        eoirVar6.d = i;
        String str3 = dtnsVar.d;
        eoiqVar.copyOnWrite();
        eoir eoirVar7 = (eoir) eoiqVar.instance;
        str3.getClass();
        eoirVar7.b |= 4;
        eoirVar7.e = str3;
        int size = dtnsVar.g.size();
        eoiqVar.copyOnWrite();
        eoir eoirVar8 = (eoir) eoiqVar.instance;
        eoirVar8.b |= 8;
        eoirVar8.f = size;
        final eoir eoirVar9 = (eoir) eoiqVar.build();
        x(3, listenableFutureB, jB, eoirVar9, new dtvk() { // from class: dtup
            @Override // defpackage.dtvk
            public final eoir a(Object obj) {
                return eoirVar9;
            }
        }, new dtvj() { // from class: dtuq
            @Override // defpackage.dtvj
            public final int a(Object obj) {
                return ((Boolean) obj).booleanValue() ? 3 : 4;
            }
        });
        return listenableFutureB;
    }

    @Override // defpackage.dtsl
    public final ListenableFuture b() {
        final duku dukuVar = this.d;
        return this.p.b(new eooy() { // from class: dtth
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                durt.b("%s Clearing MDD internal storage", "MDDManager");
                dvaq dvaqVarE = dvaq.e(eorv.a);
                final duku dukuVar2 = dukuVar;
                eooz eoozVar = new eooz() { // from class: dujf
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return dukuVar2.b();
                    }
                };
                Executor executor = dukuVar2.n;
                return dvaqVarE.g(eoozVar, executor).g(new eooz() { // from class: dujh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        duku dukuVar3 = dukuVar2;
                        Context context = dukuVar3.b;
                        duiv.b(context);
                        duuj.a(context, "gms_icing_mdd_manager_metadata", dukuVar3.m).edit().clear().commit();
                        duku.a = false;
                        return eorv.a;
                    }
                }, executor).g(new eooz() { // from class: duji
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return dukuVar2.q.a();
                    }
                }, executor);
            }
        }, this.i);
    }

    @Override // defpackage.dtsl
    public final ListenableFuture c(final dtoz dtozVar) {
        return eika.i(new eooy() { // from class: dtsq
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final dtvl dtvlVar = this.a;
                final dtoz dtozVar2 = dtozVar;
                return eika.k(dtvlVar.q(dtozVar2), new eooz() { // from class: dtta
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        duan duanVar = (duan) obj;
                        int iB = duanVar.b() - 1;
                        if (iB == 1) {
                            return duanVar.c();
                        }
                        if (iB == 2) {
                            return eork.i(duanVar.a());
                        }
                        final dtoz dtozVar3 = dtozVar2;
                        final dtvl dtvlVar2 = dtvlVar;
                        dtrv dtrvVar = (dtrv) dtrw.a.createBuilder();
                        dtrvVar.copyOnWrite();
                        dtrw dtrwVar = (dtrw) dtrvVar.instance;
                        dtrwVar.b = 1 | dtrwVar.b;
                        dtmn dtmnVar = (dtmn) dtozVar3;
                        dtrwVar.c = dtmnVar.a;
                        String packageName = dtvlVar2.a.getPackageName();
                        dtrvVar.copyOnWrite();
                        dtrw dtrwVar2 = (dtrw) dtrvVar.instance;
                        packageName.getClass();
                        dtrwVar2.b = 2 | dtrwVar2.b;
                        dtrwVar2.d = packageName;
                        ejwi ejwiVar = dtmnVar.b;
                        if (ejwiVar.g()) {
                            String strA = dtvy.a((Account) ejwiVar.c());
                            dtrvVar.copyOnWrite();
                            dtrw dtrwVar3 = (dtrw) dtrvVar.instance;
                            dtrwVar3.b |= 4;
                            dtrwVar3.e = strA;
                        }
                        final dtrw dtrwVar4 = (dtrw) dtrvVar.build();
                        try {
                            ejwi ejwiVar2 = ((dtmn) dtozVar3).d;
                            final ejwi ejwiVarJ = ejwiVar2.g() ? ejwi.j(duub.a((dtoa) ejwiVar2.c())) : ejud.a;
                            final duab duabVarC = duab.c(dtmnVar.a, dtmnVar.b);
                            final eosa eosaVar = new eosa(new Callable() { // from class: dtty
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return null;
                                }
                            });
                            dvaq dvaqVarE = dvaq.e(eosaVar);
                            eooz eoozVar = new eooz() { // from class: dtue
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    dtvl dtvlVar3 = dtvlVar2;
                                    return dtvlVar3.d.e(dtrwVar4, ejwiVarJ, dtvlVar3.l);
                                }
                            };
                            Executor executor = dtvlVar2.i;
                            final dvaq dvaqVarF = dvaqVarE.g(eoozVar, executor).g(new eooz() { // from class: dtun
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    dtrw dtrwVar5 = dtrwVar4;
                                    dtqy dtqyVar = (dtqy) obj2;
                                    dtvl dtvlVar3 = dtvlVar2;
                                    ejwi ejwiVarO = dtvl.o(dtrwVar5, dtqyVar, dtvlVar3.f);
                                    dtmn dtmnVar2 = (dtmn) dtozVar3;
                                    ejwi ejwiVar3 = dtmnVar2.b;
                                    return dtvl.u(dtqyVar, ejwiVarO, ejwiVar3.g() ? dtvy.a((Account) ejwiVar3.c()) : null, dtlz.DOWNLOADED, dtmnVar2.f, dtvlVar3.d, dtvlVar3.i, dtvlVar3.e);
                                }
                            }, executor).f(new dtux(), executor);
                            final dvaq dvaqVarG = dvaq.e(dtvlVar2.h.b(((duaa) duabVarC).a, dvaqVarF)).g(new eooz() { // from class: dtuy
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    eosaVar.run();
                                    return dvaqVarF;
                                }
                            }, executor);
                            dvaq dvaqVarG2 = dvaqVarG.g(new eooz() { // from class: dtuz
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return dtvlVar2.h.e(((duaa) duabVarC).a);
                                }
                            }, executor).g(new eooz() { // from class: dtsr
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return eork.i((dtma) eork.q(dvaqVarG));
                                }
                            }, executor);
                            eika.l(dvaqVarG2, new dtva(dtvlVar2, duabVarC), executor);
                            return dvaqVarG2;
                        } catch (evtj e) {
                            return eork.h(e);
                        }
                    }
                }, dtvlVar.i);
            }
        }, this.i);
    }

    @Override // defpackage.dtsl
    public final ListenableFuture d(final dtoz dtozVar) {
        durt.d("%s: downloadFileGroupWithForegroundService start for group %s package %s", "MobileDataDownload", ((dtmn) dtozVar).a, this.a.getPackageName());
        if (!this.k.g()) {
            return eork.h(new IllegalArgumentException("downloadFileGroupWithForegroundService: ForegroundDownloadService is not provided!"));
        }
        if (this.j.g()) {
            return eika.i(new eooy() { // from class: dtuv
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final dtvl dtvlVar = this.a;
                    final dtoz dtozVar2 = dtozVar;
                    return eika.k(dtvlVar.q(dtozVar2), new eooz() { // from class: dtul
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) throws Resources.NotFoundException {
                            duan duanVar = (duan) obj;
                            int iB = duanVar.b() - 1;
                            if (iB == 1) {
                                return duanVar.c();
                            }
                            if (iB == 2) {
                                return eork.i(duanVar.a());
                            }
                            final dtoz dtozVar3 = dtozVar2;
                            final dtvl dtvlVar2 = dtvlVar;
                            dtqy dtqyVarD = duanVar.d();
                            Context context = dtvlVar2.a;
                            duac.c(context);
                            dtrv dtrvVar = (dtrv) dtrw.a.createBuilder();
                            dtrvVar.copyOnWrite();
                            dtrw dtrwVar = (dtrw) dtrvVar.instance;
                            dtrwVar.b |= 1;
                            dtmn dtmnVar = (dtmn) dtozVar3;
                            String str = dtmnVar.a;
                            dtrwVar.c = str;
                            String packageName = context.getPackageName();
                            dtrvVar.copyOnWrite();
                            dtrw dtrwVar2 = (dtrw) dtrvVar.instance;
                            packageName.getClass();
                            dtrwVar2.b |= 2;
                            dtrwVar2.d = packageName;
                            ejwi ejwiVar = dtmnVar.b;
                            if (ejwiVar.g()) {
                                String strA = dtvy.a((Account) ejwiVar.c());
                                dtrvVar.copyOnWrite();
                                dtrw dtrwVar3 = (dtrw) dtrvVar.instance;
                                dtrwVar3.b |= 4;
                                dtrwVar3.e = strA;
                            }
                            final dtrw dtrwVar4 = (dtrw) dtrvVar.build();
                            duab duabVarC = duab.c(str, ejwiVar);
                            dtrk dtrkVar = dtqyVarD.n;
                            if (dtrkVar == null) {
                                dtrkVar = dtrk.a;
                            }
                            int iA = dtrh.a(dtrkVar.d);
                            if (iA == 0) {
                                iA = 1;
                            }
                            ejwi ejwiVar2 = dtmnVar.d;
                            if (ejwiVar2.g()) {
                                try {
                                    iA = dtrh.a(duub.a((dtoa) ejwiVar2.c()).d);
                                    if (iA == 0) {
                                        iA = 1;
                                    }
                                } catch (evtj unused) {
                                }
                            }
                            int i = iA - 1;
                            String string = (i == 0 || i == 2) ? dtvlVar2.a.getResources().getString(R.string.mdd_notification_download_paused_wifi) : dtvlVar2.a.getResources().getString(R.string.mdd_notification_download_paused);
                            Context context2 = dtvlVar2.a;
                            kwx kwxVar = new kwx(context2);
                            String str2 = dtmnVar.a;
                            duab duabVarC2 = duab.c(str2, dtmnVar.b);
                            kvq kvqVarB = duac.b(context2);
                            kvqVarB.i(str2);
                            kvqVarB.h(str2);
                            kvqVarB.g = null;
                            kvqVarB.r(android.R.drawable.stat_sys_download);
                            kvqVarB.o(true);
                            kvqVarB.q(0, 0, false);
                            int i2 = dtmnVar.g;
                            int iHashCode = str2.hashCode();
                            if (i2 == 2) {
                                ejwi ejwiVar3 = dtvlVar2.k;
                                String str3 = ((duaa) duabVarC2).a;
                                Intent intent = new Intent(context2, (Class<?>) ejwiVar3.c());
                                intent.setPackage(context2.getPackageName());
                                intent.putExtra("cancel-action", iHashCode);
                                intent.putExtra("key", str3);
                                PendingIntent foregroundService = PendingIntent.getForegroundService(context2, iHashCode, ebsn.f(intent, 1140850688, 0), 1140850688);
                                String string2 = context2.getResources().getString(R.string.mdd_notification_action_cancel);
                                foregroundService.getClass();
                                kvqVarB.e(new kve(android.R.drawable.stat_sys_warning, string2, foregroundService).a());
                                kwxVar.g(iHashCode, kvqVarB.a());
                            }
                            dtvh dtvhVar = new dtvh(dtvlVar2, duabVarC2, dtozVar3, kvqVarB, kwxVar, iHashCode, string);
                            Object objC = dtvlVar2.j.c();
                            synchronized (duvp.class) {
                                HashMap map = ((duvp) objC).c;
                                if (!map.containsKey(str2)) {
                                    duvo duvoVar = new duvo((duvp) objC, str2, dtvhVar);
                                    final duag duagVar = ((duvp) objC).d;
                                    map.put(str2, new ecgv(duvoVar, new ecgt() { // from class: duvm
                                        @Override // defpackage.ecgt
                                        public final long a() {
                                            return duagVar.a();
                                        }
                                    }, 1000L, TimeUnit.MILLISECONDS));
                                }
                            }
                            try {
                                ejwi ejwiVar4 = ((dtmn) dtozVar3).d;
                                final ejwi ejwiVarJ = ejwiVar4.g() ? ejwi.j(duub.a((dtoa) ejwiVar4.c())) : ejud.a;
                                final eosa eosaVar = new eosa(new Callable() { // from class: dttv
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return null;
                                    }
                                });
                                dvaq dvaqVarE = dvaq.e(eosaVar);
                                eooz eoozVar = new eooz() { // from class: dttw
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        dtvl dtvlVar3 = dtvlVar2;
                                        return dtvlVar3.d.e(dtrwVar4, ejwiVarJ, dtvlVar3.l);
                                    }
                                };
                                Executor executor = dtvlVar2.i;
                                final dvaq dvaqVarF = dvaqVarE.g(eoozVar, executor).g(new eooz() { // from class: dttx
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        dtrw dtrwVar5 = dtrwVar4;
                                        dtqy dtqyVar = (dtqy) obj2;
                                        dtvl dtvlVar3 = dtvlVar2;
                                        ejwi ejwiVarO = dtvl.o(dtrwVar5, dtqyVar, dtvlVar3.f);
                                        dtmn dtmnVar2 = (dtmn) dtozVar3;
                                        ejwi ejwiVar5 = dtmnVar2.b;
                                        return dtvl.u(dtqyVar, ejwiVarO, ejwiVar5.g() ? dtvy.a((Account) ejwiVar5.c()) : null, dtlz.DOWNLOADED, dtmnVar2.f, dtvlVar3.d, dtvlVar3.i, dtvlVar3.e);
                                    }
                                }, executor).f(new dtux(), executor);
                                ListenableFuture listenableFutureK = eika.k(dtvlVar2.g.b(((duaa) duabVarC).a, dvaqVarF), new eooz() { // from class: dttz
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        eosaVar.run();
                                        return dvaqVarF;
                                    }
                                }, executor);
                                eika.l(listenableFutureK, new dtvb(dtvhVar), executor);
                                return listenableFutureK;
                            } catch (evtj e) {
                                return eork.h(e);
                            }
                        }
                    }, dtvlVar.i);
                }
            }, this.i);
        }
        dtov dtovVarA = dtox.a();
        dtovVarA.a = dtow.DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR;
        dtovVarA.b = "downloadFileGroupWithForegroundService: Download Monitor is not provided!";
        return eork.h(dtovVarA.a());
    }

    @Override // defpackage.dtsl
    public final ListenableFuture e(final dtqa dtqaVar) {
        long jB = this.m.b();
        ListenableFuture listenableFutureB = this.p.b(new eooy() { // from class: dttb
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dtrv dtrvVar = (dtrv) dtrw.a.createBuilder();
                dtrvVar.copyOnWrite();
                dtrw dtrwVar = (dtrw) dtrvVar.instance;
                dtrwVar.b |= 1;
                final dtqa dtqaVar2 = dtqaVar;
                dtrwVar.c = ((dtmp) dtqaVar2).a;
                final dtvl dtvlVar = this.a;
                String packageName = dtvlVar.a.getPackageName();
                dtrvVar.copyOnWrite();
                dtrw dtrwVar2 = (dtrw) dtrvVar.instance;
                packageName.getClass();
                dtrwVar2.b |= 2;
                dtrwVar2.d = packageName;
                final dtrw dtrwVar3 = (dtrw) dtrvVar.build();
                return eika.k(dtvlVar.d.g(dtrwVar3, true), new eooz() { // from class: dtuk
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        dtqa dtqaVar3 = dtqaVar2;
                        dtqy dtqyVar = (dtqy) obj;
                        if (dtqyVar == null) {
                            durt.c("%s: File group with name %s not found", "MobileDataDownload", ((dtmp) dtqaVar3).a);
                        } else {
                            durt.c("%s: File group with name %s found", "MobileDataDownload", ((dtmp) dtqaVar3).a);
                        }
                        return dtvlVar.v(dtrwVar3, dtqyVar, true, ((dtmp) dtqaVar3).b);
                    }
                }, dtvlVar.i);
            }
        }, this.i);
        eoiq eoiqVar = (eoiq) eoir.a.createBuilder();
        eoiqVar.copyOnWrite();
        eoir eoirVar = (eoir) eoiqVar.instance;
        eoirVar.b |= 1;
        eoirVar.c = ((dtmp) dtqaVar).a;
        eoiqVar.copyOnWrite();
        eoir eoirVar2 = (eoir) eoiqVar.instance;
        eoirVar2.b |= 32;
        eoirVar2.h = false;
        eoiqVar.copyOnWrite();
        eoir eoirVar3 = (eoir) eoiqVar.instance;
        eoirVar3.b |= 2;
        eoirVar3.d = -1;
        eoiqVar.copyOnWrite();
        eoir eoirVar4 = (eoir) eoiqVar.instance;
        eoirVar4.b |= 64;
        eoirVar4.i = -1L;
        x(4, listenableFutureB, jB, (eoir) eoiqVar.build(), new dtvk() { // from class: dttc
            @Override // defpackage.dtvk
            public final eoir a(Object obj) {
                return dtvl.p((dtma) obj);
            }
        }, new dtvj() { // from class: dttd
            @Override // defpackage.dtvj
            public final int a(Object obj) {
                return 3;
            }
        });
        return listenableFutureB;
    }

    @Override // defpackage.dtsl
    public final ListenableFuture f(final dtqc dtqcVar) {
        return this.p.b(new eooy() { // from class: dtsy
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final dtvl dtvlVar = this.a;
                ListenableFuture listenableFutureF = dtvlVar.d.f();
                final dtqc dtqcVar2 = dtqcVar;
                ejvr ejvrVar = new ejvr() { // from class: dttf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        List<duon> list = (List) obj;
                        int i = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        if (((dtmr) dtqcVar2).a) {
                            ekfwVar.j(list);
                            return ekfwVar.g();
                        }
                        for (duon duonVar : list) {
                            duonVar.b();
                            duonVar.a();
                            ekfwVar.h(duonVar);
                        }
                        return ekfwVar.g();
                    }
                };
                Executor executor = dtvlVar.i;
                return eika.k(eika.j(listenableFutureF, ejvrVar, executor), new eooz() { // from class: dttg
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ekgb ekgbVar = (ekgb) obj;
                        int i = ekgb.d;
                        ListenableFuture listenableFutureI = eork.i(new ekfw());
                        int size = ekgbVar.size();
                        int i2 = 0;
                        while (true) {
                            final dtvl dtvlVar2 = dtvlVar;
                            if (i2 >= size) {
                                return eika.j(listenableFutureI, new ejvr() { // from class: dttt
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        return ((ekfw) obj2).g();
                                    }
                                }, dtvlVar2.i);
                            }
                            final dtqc dtqcVar3 = dtqcVar2;
                            final duon duonVar = (duon) ekgbVar.get(i2);
                            listenableFutureI = eika.k(listenableFutureI, new eooz() { // from class: dtts
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    final ekfw ekfwVar = (ekfw) obj2;
                                    duon duonVar2 = duonVar;
                                    dtrw dtrwVarB = duonVar2.b();
                                    dtqy dtqyVarA = duonVar2.a();
                                    boolean z = dtrwVarB.f;
                                    boolean z2 = ((dtmr) dtqcVar3).b;
                                    dtvl dtvlVar3 = dtvlVar2;
                                    return eika.j(dtvlVar3.v(dtrwVarB, dtqyVarA, z, z2), new ejvr() { // from class: dtum
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            ekfw ekfwVar2 = ekfwVar;
                                            dtma dtmaVar = (dtma) obj3;
                                            if (dtmaVar != null) {
                                                ekfwVar2.h(dtmaVar);
                                            }
                                            return ekfwVar2;
                                        }
                                    }, dtvlVar3.i);
                                }
                            }, dtvlVar2.i);
                            i2++;
                        }
                    }
                }, executor);
            }
        }, this.i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // defpackage.dtsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture g(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -2105562759: goto L2a;
                case -1202768674: goto L20;
                case -69128772: goto L16;
                case 437964371: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L34
        Lc:
            java.lang.String r0 = "MDD.WIFI.CHARGING.PERIODIC.TASK"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L34
            r0 = r2
            goto L35
        L16:
            java.lang.String r0 = "MDD.CHARGING.PERIODIC.TASK"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L34
            r0 = r4
            goto L35
        L20:
            java.lang.String r0 = "MDD.CELLULAR.CHARGING.PERIODIC.TASK"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L34
            r0 = r3
            goto L35
        L2a:
            java.lang.String r0 = "MDD.MAINTENANCE.PERIODIC.GCM.TASK"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L34
            r0 = r1
            goto L35
        L34:
            r0 = -1
        L35:
            if (r0 == 0) goto L72
            if (r0 == r4) goto L5e
            if (r0 == r3) goto L59
            if (r0 == r2) goto L54
            java.lang.String r0 = "%s: gcm task doesn't belong to MDD"
            java.lang.String r1 = "MobileDataDownload"
            defpackage.durt.b(r0, r1)
            java.lang.String r0 = "Unknown task tag sent to MDD.handleTask() "
            java.lang.String r6 = r0.concat(r6)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            com.google.common.util.concurrent.ListenableFuture r6 = defpackage.eork.h(r0)
            return r6
        L54:
            com.google.common.util.concurrent.ListenableFuture r6 = r5.w(r4)
            return r6
        L59:
            com.google.common.util.concurrent.ListenableFuture r6 = r5.w(r1)
            return r6
        L5e:
            com.google.common.util.concurrent.ListenableFuture r6 = r5.r()
            dtsx r0 = new dtsx
            r0.<init>()
            eooz r0 = defpackage.eiid.d(r0)
            java.util.concurrent.Executor r1 = r5.i
            com.google.common.util.concurrent.ListenableFuture r6 = defpackage.eika.k(r6, r0, r1)
            return r6
        L72:
            dvap r6 = r5.p
            duku r0 = r5.d
            dtsw r1 = new dtsw
            r1.<init>()
            java.util.concurrent.Executor r0 = r5.i
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtvl.g(java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtsl
    public final ListenableFuture h(final dtqe dtqeVar) {
        dtrv dtrvVar = (dtrv) dtrw.a.createBuilder();
        dtrvVar.copyOnWrite();
        dtrw dtrwVar = (dtrw) dtrvVar.instance;
        int i = 1;
        dtrwVar.b |= 1;
        dtmt dtmtVar = (dtmt) dtqeVar;
        dtrwVar.c = dtmtVar.a;
        String packageName = this.a.getPackageName();
        dtrvVar.copyOnWrite();
        dtrw dtrwVar2 = (dtrw) dtrvVar.instance;
        packageName.getClass();
        dtrwVar2.b |= 2;
        dtrwVar2.d = packageName;
        ejwi ejwiVar = dtmtVar.g;
        if (ejwiVar.g()) {
            String strA = dtvy.a((Account) ejwiVar.c());
            dtrvVar.copyOnWrite();
            dtrw dtrwVar3 = (dtrw) dtrvVar.instance;
            dtrwVar3.b |= 4;
            dtrwVar3.e = strA;
        }
        final dtrw dtrwVar4 = (dtrw) dtrvVar.build();
        ekgb ekgbVar = dtmtVar.e;
        int i2 = ((ekoe) ekgbVar).c;
        final ekfw ekfwVarD = ekgb.d(i2);
        int i3 = 0;
        while (i3 < i2) {
            dtnq dtnqVar = (dtnq) ekgbVar.get(i3);
            dtqp dtqpVar = (dtqp) dtqs.a.createBuilder();
            String str = dtnqVar.c;
            dtqpVar.copyOnWrite();
            dtqs dtqsVar = (dtqs) dtqpVar.instance;
            str.getClass();
            dtqsVar.b |= i;
            dtqsVar.c = str;
            String str2 = dtnqVar.d;
            dtqpVar.copyOnWrite();
            dtqs dtqsVar2 = (dtqs) dtqpVar.instance;
            str2.getClass();
            dtqsVar2.b |= 2;
            dtqsVar2.d = str2;
            long j = dtnqVar.e;
            dtqpVar.copyOnWrite();
            dtqs dtqsVar3 = (dtqs) dtqpVar.instance;
            dtqsVar3.b |= 4;
            dtqsVar3.e = j;
            dtnp dtnpVarB = dtnp.b(dtnqVar.f);
            if (dtnpVarB == null) {
                dtnpVarB = dtnp.DEFAULT;
            }
            int iA = dtqr.a(dtnpVarB.d);
            dtqpVar.copyOnWrite();
            dtqs dtqsVar4 = (dtqs) dtqpVar.instance;
            if (iA == 0) {
                throw null;
            }
            dtqsVar4.f = iA - 1;
            dtqsVar4.b |= 8;
            String str3 = dtnqVar.g;
            dtqpVar.copyOnWrite();
            dtqs dtqsVar5 = (dtqs) dtqpVar.instance;
            str3.getClass();
            dtqsVar5.b |= 16;
            dtqsVar5.g = str3;
            String str4 = dtnqVar.i;
            dtqpVar.copyOnWrite();
            dtqs dtqsVar6 = (dtqs) dtqpVar.instance;
            str4.getClass();
            dtqsVar6.b |= 64;
            dtqsVar6.i = str4;
            long j2 = dtnqVar.j;
            dtqpVar.copyOnWrite();
            dtqs dtqsVar7 = (dtqs) dtqpVar.instance;
            dtqsVar7.b |= 128;
            dtqsVar7.j = j2;
            int iA2 = dtnm.a(dtnqVar.m);
            if (iA2 == 0) {
                iA2 = i;
            }
            dtqpVar.copyOnWrite();
            dtqs dtqsVar8 = (dtqs) dtqpVar.instance;
            int iA3 = dtqo.a(iA2 - 1);
            int i4 = iA3 - 1;
            if (iA3 == 0) {
                throw null;
            }
            dtqsVar8.m = i4;
            dtqsVar8.b |= 512;
            int iA4 = dtnk.a(dtnqVar.n);
            if (iA4 == 0) {
                iA4 = i;
            }
            dtqpVar.copyOnWrite();
            dtqs dtqsVar9 = (dtqs) dtqpVar.instance;
            int iA5 = dtqm.a(iA4 - 1);
            int i5 = iA5 - 1;
            if (iA5 == 0) {
                throw null;
            }
            dtqsVar9.n = i5;
            dtqsVar9.b |= 1024;
            String str5 = dtnqVar.o;
            dtqpVar.copyOnWrite();
            dtqs dtqsVar10 = (dtqs) dtqpVar.instance;
            str5.getClass();
            dtqsVar10.b |= 2048;
            dtqsVar10.o = str5;
            String str6 = dtnqVar.p;
            dtqpVar.copyOnWrite();
            dtqs dtqsVar11 = (dtqs) dtqpVar.instance;
            str6.getClass();
            dtqsVar11.b |= 4096;
            dtqsVar11.p = str6;
            if ((dtnqVar.b & 8192) != 0) {
                evqe evqeVar = dtnqVar.q;
                if (evqeVar == null) {
                    evqeVar = evqe.a;
                }
                dtqpVar.copyOnWrite();
                dtqs dtqsVar12 = (dtqs) dtqpVar.instance;
                evqeVar.getClass();
                dtqsVar12.q = evqeVar;
                dtqsVar12.b |= 8192;
            }
            if ((dtnqVar.b & 32) != 0) {
                exyx exyxVar = dtnqVar.h;
                if (exyxVar == null) {
                    exyxVar = exyx.a;
                }
                dtqpVar.copyOnWrite();
                dtqs dtqsVar13 = (dtqs) dtqpVar.instance;
                exyxVar.getClass();
                dtqsVar13.h = exyxVar;
                dtqsVar13.b |= 32;
            }
            if ((dtnqVar.b & 256) != 0) {
                exyx exyxVar2 = dtnqVar.k;
                if (exyxVar2 == null) {
                    exyxVar2 = exyx.a;
                }
                dtqpVar.copyOnWrite();
                dtqs dtqsVar14 = (dtqs) dtqpVar.instance;
                exyxVar2.getClass();
                dtqsVar14.k = exyxVar2;
                dtqsVar14.b |= 256;
            }
            for (dtnw dtnwVar : dtnqVar.l) {
                dtqz dtqzVar = (dtqz) dtrc.a.createBuilder();
                String str7 = dtnwVar.c;
                dtqzVar.copyOnWrite();
                dtrc dtrcVar = (dtrc) dtqzVar.instance;
                str7.getClass();
                dtrcVar.b |= i;
                dtrcVar.c = str7;
                long j3 = dtnwVar.d;
                dtqzVar.copyOnWrite();
                dtrc dtrcVar2 = (dtrc) dtqzVar.instance;
                int i6 = i;
                dtrcVar2.b |= 2;
                dtrcVar2.d = j3;
                String str8 = dtnwVar.e;
                dtqzVar.copyOnWrite();
                dtrc dtrcVar3 = (dtrc) dtqzVar.instance;
                str8.getClass();
                dtrcVar3.b |= 4;
                dtrcVar3.e = str8;
                int iA6 = dtnv.a(dtnwVar.f);
                if (iA6 == 0) {
                    iA6 = i6;
                }
                dtqzVar.copyOnWrite();
                dtrc dtrcVar4 = (dtrc) dtqzVar.instance;
                int iA7 = dtrb.a(iA6 - 1);
                int i7 = iA7 - 1;
                if (iA7 == 0) {
                    throw null;
                }
                dtrcVar4.f = i7;
                dtrcVar4.b |= 8;
                dtqj dtqjVar = (dtqj) dtqk.a.createBuilder();
                dtni dtniVar = dtnwVar.g;
                if (dtniVar == null) {
                    dtniVar = dtni.a;
                }
                String str9 = dtniVar.b;
                dtqjVar.copyOnWrite();
                dtqk dtqkVar = (dtqk) dtqjVar.instance;
                str9.getClass();
                dtqkVar.b |= 1;
                dtqkVar.c = str9;
                dtqk dtqkVar2 = (dtqk) dtqjVar.build();
                dtqzVar.copyOnWrite();
                dtrc dtrcVar5 = (dtrc) dtqzVar.instance;
                dtqkVar2.getClass();
                dtrcVar5.g = dtqkVar2;
                dtrcVar5.b |= 16;
                dtrc dtrcVar6 = (dtrc) dtqzVar.build();
                dtqpVar.copyOnWrite();
                dtqs dtqsVar15 = (dtqs) dtqpVar.instance;
                dtrcVar6.getClass();
                evtg evtgVar = dtqsVar15.l;
                if (!evtgVar.c()) {
                    dtqsVar15.l = evsn.mutableCopy(evtgVar);
                }
                dtqsVar15.l.add(dtrcVar6);
                i = i6;
            }
            ekfwVarD.h((dtqs) dtqpVar.build());
            i3++;
            i = i;
        }
        return this.p.b(new eooy() { // from class: dtuj
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final ekgb ekgbVarG = ekfwVarD.g();
                final dtrw dtrwVar5 = dtrwVar4;
                durt.d("%s: importFiles %s %s", "MDDManager", dtrwVar5.c, dtrwVar5.d);
                dtmt dtmtVar2 = (dtmt) dtqeVar;
                final long j4 = dtmtVar2.b;
                final String str10 = dtmtVar2.c;
                final ekgp ekgpVar = dtmtVar2.f;
                final ejwi ejwiVar2 = dtmtVar2.d;
                dtvl dtvlVar = this.a;
                final duku dukuVar = dtvlVar.d;
                ListenableFuture listenableFutureH = dukuVar.h();
                final eooz eoozVar = dtvlVar.l;
                return eika.k(listenableFutureH, new eooz() { // from class: duks
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) throws NoSuchAlgorithmException {
                        final dugr dugrVar = dukuVar.d;
                        final ekgb ekgbVarA = duku.a(ekgbVarG);
                        final duri duriVar = new duri(dugrVar.b, 2);
                        ListenableFuture listenableFutureC = dugrVar.d.c();
                        final dtrw dtrwVar6 = dtrwVar5;
                        final long j5 = j4;
                        final String str11 = str10;
                        final ejwi ejwiVar3 = ejwiVar2;
                        final ListenableFuture listenableFutureR = dugrVar.r(dugrVar.q(listenableFutureC, new ejvr() { // from class: duga
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ejwi ejwiVarJ;
                                for (duon duonVar : (List) obj2) {
                                    String str12 = str11;
                                    long j6 = j5;
                                    dtrw dtrwVar7 = dtrwVar6;
                                    String str13 = dtrwVar7.e;
                                    dtqy dtqyVarA = duonVar.a();
                                    if (duonVar.b().e.equals(str13)) {
                                        long j7 = dtqyVarA.t;
                                        if (j7 != j6) {
                                            durt.m("%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched buildId: existing = %d, expected = %d", "FileGroupManager", dtqyVarA.d, Long.valueOf(j7), Long.valueOf(j6));
                                        } else if (str12.equals(dtqyVarA.u)) {
                                            if ((dtqyVarA.b & 16) != 0) {
                                                evqe evqeVar2 = dtqyVarA.g;
                                                if (evqeVar2 == null) {
                                                    evqeVar2 = evqe.a;
                                                }
                                                ejwiVarJ = ejwi.j(evqeVar2);
                                            } else {
                                                ejwiVarJ = ejud.a;
                                            }
                                            ejwi ejwiVar4 = ejwiVar3;
                                            if (!ejwiVarJ.equals(ejwiVar4)) {
                                                durt.m("%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched custom property optional: existing = %s, expected = %s", "FileGroupManager", dtqyVarA.d, ejwiVarJ, ejwiVar4);
                                            } else {
                                                if (dtrwVar7.c.equals(duonVar.b().c)) {
                                                    return duonVar;
                                                }
                                                durt.d("%s: getGroupPairById: Group %s matches the given buildId = %d and variantId = %s, but does not match the given group name %s", "FileGroupManager", duonVar.b().c, Long.valueOf(j6), str12, dtrwVar7.c);
                                            }
                                        } else {
                                            durt.m("%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched variantId: existing = %s, expected = %s", "FileGroupManager", dtqyVarA.d, dtqyVarA.u, str12);
                                        }
                                    } else {
                                        durt.l("%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched account", "FileGroupManager", dtqyVarA.d);
                                    }
                                }
                                return null;
                            }
                        }), new eooz() { // from class: duff
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                duon duonVar = (duon) obj2;
                                if (duonVar != null) {
                                    return eork.i(duonVar);
                                }
                                String str12 = str11;
                                long j6 = j5;
                                dtrw dtrwVar7 = dtrwVar6;
                                durt.i("%s: importFiles for group name: %s, buildId: %d, variantId: %s, but no group was found", "FileGroupManager", dtrwVar7.c, Long.valueOf(j6), str12);
                                dtov dtovVarA = dtox.a();
                                dtovVarA.a = dtow.GROUP_NOT_FOUND_ERROR;
                                dtovVarA.b = "file group: " + dtrwVar7.c + " not found! Make sure addFileGroup has been called.";
                                return eork.h(dtovVarA.a());
                            }
                        });
                        dvaq dvaqVarE = dvaq.e(listenableFutureR);
                        eooz eoozVar2 = new eooz() { // from class: dufg
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                dtqy dtqyVarA = ((duon) obj2).a();
                                dtqx dtqxVar = (dtqx) dtqyVarA.toBuilder();
                                dtqxVar.copyOnWrite();
                                ((dtqy) dtqxVar.instance).p = dtqy.emptyProtobufList();
                                HashMap map = new HashMap();
                                for (dtqs dtqsVar16 : dtqyVarA.p) {
                                    map.put(dtqsVar16.c, dtqsVar16);
                                }
                                ekgb ekgbVar2 = ekgbVarA;
                                int size = ekgbVar2.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    dtqs dtqsVar17 = (dtqs) ekgbVar2.get(i8);
                                    map.put(dtqsVar17.c, dtqsVar17);
                                }
                                duri duriVar2 = duriVar;
                                dugr dugrVar2 = dugrVar;
                                dtqxVar.a(map.values());
                                final dtqy dtqyVar = (dtqy) dtqxVar.build();
                                duriVar2.b(dtqyVar);
                                return dugrVar2.r(dugrVar2.o(dtqyVar), new eooz() { // from class: dubm
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                        dtqy dtqyVar2 = dtqyVar;
                                        if (zBooleanValue) {
                                            return eork.i(dtqyVar2);
                                        }
                                        dtov dtovVarA = dtox.a();
                                        dtovVarA.a = dtow.UNABLE_TO_RESERVE_FILE_ENTRY;
                                        dtovVarA.b = "Failed to reserve new file entries for group: ".concat(String.valueOf(dtqyVar2.d));
                                        return eork.h(dtovVarA.a());
                                    }
                                });
                            }
                        };
                        Executor executor = dugrVar.h;
                        dvaq dvaqVarG = dvaqVarE.g(eoozVar2, executor);
                        final ekgp ekgpVar2 = ekgpVar;
                        final eooz eoozVar3 = eoozVar;
                        return dvaqVarG.g(new eooz() { // from class: dufh
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final dtqy dtqyVar = (dtqy) obj2;
                                final boolean z = ((duon) eork.q(listenableFutureR)).b().f;
                                final boolean z2 = !z;
                                final ArrayList arrayList = new ArrayList();
                                Iterator<E> it = dtqyVar.p.iterator();
                                while (true) {
                                    final dtrw dtrwVar7 = dtrwVar6;
                                    final dugr dugrVar2 = dugrVar;
                                    if (!it.hasNext()) {
                                        final duri duriVar2 = duriVar;
                                        final eooz eoozVar4 = eoozVar3;
                                        final dtqy dtqyVar2 = dtqyVar;
                                        return dugrVar2.r(dvat.a(arrayList).b(new eooy() { // from class: dubh
                                            @Override // defpackage.eooy
                                            public final ListenableFuture a() {
                                                final dugr dugrVar3 = dugrVar2;
                                                final dtrw dtrwVar8 = dtrwVar7;
                                                final dtqy dtqyVar3 = dtqyVar;
                                                final boolean z3 = z2;
                                                final eooz eoozVar5 = eoozVar4;
                                                final duri duriVar3 = duriVar2;
                                                return dugrVar3.l.b(new eooy() { // from class: dubn
                                                    @Override // defpackage.eooy
                                                    public final ListenableFuture a() {
                                                        return dugrVar3.t(dtrwVar8, dtqyVar3, z3, eoozVar5, duriVar3);
                                                    }
                                                }, dugrVar3.h);
                                            }
                                        }, dugrVar2.h), new eooz() { // from class: dudj
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj3) throws dtmi {
                                                dugq dugqVar = (dugq) obj3;
                                                List list = arrayList;
                                                dtmi.d(list, "Failed to import files, %d attempted", Integer.valueOf(list.size()));
                                                final dugr dugrVar3 = dugrVar2;
                                                dtrw dtrwVar8 = dtrwVar7;
                                                dtqy dtqyVar3 = dtqyVar2;
                                                if (dugqVar != dugq.DOWNLOADED) {
                                                    boolean z3 = z;
                                                    dugs dugsVar = dugrVar3.d;
                                                    dtrv dtrvVar2 = (dtrv) dtrwVar8.toBuilder();
                                                    dtrvVar2.copyOnWrite();
                                                    dtrw dtrwVar9 = (dtrw) dtrvVar2.instance;
                                                    dtrwVar9.b |= 8;
                                                    dtrwVar9.f = z3;
                                                    return dugrVar3.r(dugsVar.l((dtrw) dtrvVar2.build(), dtqyVar3), new eooz() { // from class: dufj
                                                        @Override // defpackage.eooz
                                                        public final ListenableFuture a(Object obj4) {
                                                            if (((Boolean) obj4).booleanValue()) {
                                                                return eorv.a;
                                                            }
                                                            dugrVar3.b.l(1036);
                                                            dtov dtovVarA = dtox.a();
                                                            dtovVarA.b = "File Import(s) succeeded, but failed to save MDD state.";
                                                            dtovVarA.a = dtow.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                                                            return eork.h(dtovVarA.a());
                                                        }
                                                    });
                                                }
                                                durk durkVar = dugrVar3.b;
                                                eoiq eoiqVar = (eoiq) eoir.a.createBuilder();
                                                String str12 = dtrwVar8.c;
                                                eoiqVar.copyOnWrite();
                                                eoir eoirVar = (eoir) eoiqVar.instance;
                                                str12.getClass();
                                                eoirVar.b = 1 | eoirVar.b;
                                                eoirVar.c = str12;
                                                String str13 = dtrwVar8.d;
                                                eoiqVar.copyOnWrite();
                                                eoir eoirVar2 = (eoir) eoiqVar.instance;
                                                str13.getClass();
                                                eoirVar2.b |= 4;
                                                eoirVar2.e = str13;
                                                int i8 = dtqyVar3.f;
                                                eoiqVar.copyOnWrite();
                                                eoir eoirVar3 = (eoir) eoiqVar.instance;
                                                eoirVar3.b |= 2;
                                                eoirVar3.d = i8;
                                                long j6 = dtqyVar3.t;
                                                eoiqVar.copyOnWrite();
                                                eoir eoirVar4 = (eoir) eoiqVar.instance;
                                                eoirVar4.b |= 64;
                                                eoirVar4.i = j6;
                                                String str14 = dtqyVar3.u;
                                                eoiqVar.copyOnWrite();
                                                eoir eoirVar5 = (eoir) eoiqVar.instance;
                                                str14.getClass();
                                                eoirVar5.b |= 128;
                                                eoirVar5.j = str14;
                                                durkVar.q(3, (eoir) eoiqVar.build(), 2);
                                                return eorv.a;
                                            }
                                        });
                                    }
                                    final dtqs dtqsVar16 = (dtqs) it.next();
                                    if (dtqsVar16.d.startsWith("inlinefile")) {
                                        int iA8 = dtqw.a(dtqyVar.k);
                                        if (iA8 == 0) {
                                            iA8 = 1;
                                        }
                                        final ekgp ekgpVar3 = ekgpVar2;
                                        final dtsd dtsdVarA = duob.a(dtqsVar16, iA8);
                                        final dtqy dtqyVar3 = dtqyVar;
                                        arrayList.add(dugrVar2.r(dugrVar2.e.d(dtsdVarA), new eooz() { // from class: dugi
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj3) {
                                                if (((dtru) obj3).equals(dtru.DOWNLOAD_COMPLETE)) {
                                                    return eorv.a;
                                                }
                                                final dtqs dtqsVar17 = dtqsVar16;
                                                Map map = ekgpVar3;
                                                if (!map.containsKey(dtqsVar17.c)) {
                                                    durt.h("%s:Attempt to import file without inline file source. Id = %s", "FileGroupManager", dtqsVar17.c);
                                                    dtov dtovVarA = dtox.a();
                                                    dtovVarA.a = dtow.MISSING_INLINE_FILE_SOURCE;
                                                    return eork.h(dtovVarA.a());
                                                }
                                                dtqy dtqyVar4 = dtqyVar3;
                                                dugr dugrVar3 = dugrVar2;
                                                dtrk dtrkVar = dtqyVar4.n;
                                                if (dtrkVar == null) {
                                                    dtrkVar = dtrk.a;
                                                }
                                                final dtrk dtrkVar2 = dtrkVar;
                                                final dtpg dtpgVar = (dtpg) map.get(dtqsVar17.c);
                                                dtpgVar.getClass();
                                                if (dtqsVar17.d.startsWith("inlinefile")) {
                                                    final dunz dunzVar = dugrVar3.e;
                                                    final dtsd dtsdVar = dtsdVarA;
                                                    final dtrw dtrwVar8 = dtrwVar7;
                                                    return eika.k(dunzVar.c.e(dtsdVar), new eooz() { // from class: dunj
                                                        @Override // defpackage.eooz
                                                        public final ListenableFuture a(Object obj4) {
                                                            final dtqs dtqsVar18 = dtqsVar17;
                                                            dtsh dtshVar = (dtsh) obj4;
                                                            if (dtshVar == null) {
                                                                durt.h("%s: Start import called on file that doesn't exist. Id = %s", "SharedFileManager", dtqsVar18.c);
                                                                duoa duoaVar = new duoa();
                                                                dtov dtovVarA2 = dtox.a();
                                                                dtovVarA2.a = dtow.SHARED_FILE_NOT_FOUND_ERROR;
                                                                dtovVarA2.c = duoaVar;
                                                                return eork.h(dtovVarA2.a());
                                                            }
                                                            dtru dtruVarB = dtru.b(dtshVar.d);
                                                            if (dtruVarB == null) {
                                                                dtruVarB = dtru.NONE;
                                                            }
                                                            if (dtruVarB == dtru.DOWNLOAD_COMPLETE) {
                                                                return eorv.a;
                                                            }
                                                            final dtsg dtsgVar = (dtsg) dtshVar.toBuilder();
                                                            final String strB = (dtqsVar18.b & 32) != 0 ? duqq.b(dtshVar.c, dtqsVar18.i) : dtshVar.c;
                                                            final dtpg dtpgVar2 = dtpgVar;
                                                            final dtrk dtrkVar3 = dtrkVar2;
                                                            final dtsd dtsdVar2 = dtsdVar;
                                                            final dtrw dtrwVar9 = dtrwVar8;
                                                            final dunz dunzVar2 = dunzVar;
                                                            ListenableFuture listenableFutureG = dunzVar2.j.g(dtrwVar9);
                                                            eooz eoozVar5 = new eooz() { // from class: dumz
                                                                @Override // defpackage.eooz
                                                                public final ListenableFuture a(Object obj5) {
                                                                    dtqy dtqyVar5 = (dtqy) obj5;
                                                                    if (dtqyVar5 == null) {
                                                                        dtqyVar5 = dtqy.a;
                                                                    }
                                                                    return eork.i(dtqyVar5);
                                                                }
                                                            };
                                                            Executor executor2 = dunzVar2.l;
                                                            return eika.k(eika.k(listenableFutureG, eoozVar5, executor2), new eooz() { // from class: dunw
                                                                @Override // defpackage.eooz
                                                                public final ListenableFuture a(Object obj5) {
                                                                    dtqy dtqyVar5 = (dtqy) obj5;
                                                                    final int i8 = dtqyVar5.f;
                                                                    final long j6 = dtqyVar5.t;
                                                                    final String str12 = dtqyVar5.u;
                                                                    final dtsd dtsdVar3 = dtsdVar2;
                                                                    int iA9 = dtqw.a(dtsdVar3.f);
                                                                    if (iA9 == 0) {
                                                                        iA9 = 1;
                                                                    }
                                                                    final dtpg dtpgVar3 = dtpgVar2;
                                                                    final dtrk dtrkVar4 = dtrkVar3;
                                                                    final dtqs dtqsVar19 = dtqsVar18;
                                                                    final dtrw dtrwVar10 = dtrwVar9;
                                                                    String str13 = strB;
                                                                    final dtsg dtsgVar2 = dtsgVar;
                                                                    final dunz dunzVar3 = dunzVar2;
                                                                    final ListenableFuture listenableFutureK = dunzVar3.k(iA9, str13, dtqsVar19.g);
                                                                    dvaq dvaqVarE2 = dvaq.e(listenableFutureK);
                                                                    eooz eoozVar6 = new eooz() { // from class: dunb
                                                                        @Override // defpackage.eooz
                                                                        public final ListenableFuture a(Object obj6) {
                                                                            dtsg dtsgVar3 = dtsgVar2;
                                                                            dtru dtruVar = dtru.DOWNLOAD_IN_PROGRESS;
                                                                            dtsgVar3.copyOnWrite();
                                                                            dtsh dtshVar2 = (dtsh) dtsgVar3.instance;
                                                                            dtsh dtshVar3 = dtsh.a;
                                                                            dtshVar2.d = dtruVar.h;
                                                                            dtshVar2.b |= 2;
                                                                            return dunzVar3.c.h(dtsdVar3, (dtsh) dtsgVar3.build());
                                                                        }
                                                                    };
                                                                    Executor executor3 = dunzVar3.l;
                                                                    return dvaqVarE2.g(eoozVar6, executor3).g(new eooz() { // from class: dunm
                                                                        @Override // defpackage.eooz
                                                                        public final ListenableFuture a(Object obj6) {
                                                                            final Uri uri = (Uri) eork.q(listenableFutureK);
                                                                            dtsd dtsdVar4 = dtsdVar3;
                                                                            int iA10 = dtqw.a(dtsdVar4.f);
                                                                            if (iA10 == 0) {
                                                                                iA10 = 1;
                                                                            }
                                                                            int i9 = iA10;
                                                                            dunz dunzVar4 = dunzVar3;
                                                                            final dtpg dtpgVar4 = dtpgVar3;
                                                                            final dtrk dtrkVar5 = dtrkVar4;
                                                                            String str14 = str12;
                                                                            long j7 = j6;
                                                                            int i10 = i8;
                                                                            dtrw dtrwVar11 = dtrwVar10;
                                                                            dtqs dtqsVar20 = dtqsVar19;
                                                                            final duqp duqpVar = new duqp(dunzVar4.c, dunzVar4.e, dtqsVar20, i9, dunzVar4.h, dtrwVar11, i10, j7, str14, dunzVar4.i, dunzVar4.l);
                                                                            final String str15 = dtsdVar4.e;
                                                                            final dure dureVar = dunzVar4.d;
                                                                            final String str16 = dtqsVar20.d;
                                                                            final long j8 = dtqsVar20.e;
                                                                            return eika.k(dureVar.b(str15, uri), new eooz() { // from class: duqv
                                                                                @Override // defpackage.eooz
                                                                                public final ListenableFuture a(Object obj7) {
                                                                                    ejwi ejwiVar4 = (ejwi) obj7;
                                                                                    if (ejwiVar4.g()) {
                                                                                        return (ListenableFuture) ejwiVar4.c();
                                                                                    }
                                                                                    final dtpg dtpgVar5 = dtpgVar4;
                                                                                    final dtrk dtrkVar6 = dtrkVar5;
                                                                                    final long j9 = j8;
                                                                                    final String str17 = str16;
                                                                                    durd durdVar = duqpVar;
                                                                                    final Uri uri2 = uri;
                                                                                    String str18 = str15;
                                                                                    final dure dureVar2 = dureVar;
                                                                                    return dureVar2.a(str18, uri2, durdVar, new eooz() { // from class: durb
                                                                                        @Override // defpackage.eooz
                                                                                        public final ListenableFuture a(Object obj8) {
                                                                                            long j10;
                                                                                            dtpg dtpgVar6 = dtpgVar5;
                                                                                            int iD = dtpgVar6.a().d();
                                                                                            long j11 = iD;
                                                                                            long j12 = j9;
                                                                                            dure dureVar3 = dureVar2;
                                                                                            String str19 = str17;
                                                                                            dtrk dtrkVar7 = dtrkVar6;
                                                                                            if (j11 != j12) {
                                                                                                durt.p("%s: expected file size (%d) does not match source file size (%d) -- using source file size for storage check; file: %s", "MddFileDownloader", Long.valueOf(j12), Integer.valueOf(iD), str19);
                                                                                                j10 = j11;
                                                                                            } else {
                                                                                                j10 = j12;
                                                                                            }
                                                                                            try {
                                                                                                dure.e(dureVar3.a, str19, j10, dtrkVar7, dureVar3.h);
                                                                                                Uri uri3 = uri2;
                                                                                                dtzm dtzmVarH = dtzn.h();
                                                                                                dtzmVarH.i(str19);
                                                                                                dtzmVarH.g(uri3);
                                                                                                ((dtzd) dtzmVarH).a = ejwi.j(new dtzf(dtpgVar6));
                                                                                                return ((dtzo) dureVar3.b.get()).b(dtzmVarH.j());
                                                                                            } catch (dtox e) {
                                                                                                durt.h("%s: Not enough space to download file %s", "MddFileDownloader", str19);
                                                                                                return eork.h(e);
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                }
                                                                            }, dureVar.g);
                                                                        }
                                                                    }, executor3);
                                                                }
                                                            }, executor2);
                                                        }
                                                    }, dunzVar.l);
                                                }
                                                dtov dtovVarA2 = dtox.a();
                                                dtovVarA2.a = dtow.INVALID_INLINE_FILE_URL_SCHEME;
                                                dtovVarA2.b = "Importing an inline file requires inlinefile scheme";
                                                return eork.h(dtovVarA2.a());
                                            }
                                        }));
                                        dtqyVar = dtqyVar3;
                                    }
                                }
                            }
                        }, executor).d(Exception.class, new eooz() { // from class: dufi
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final Exception exc = (Exception) obj2;
                                boolean z = exc instanceof dtox;
                                final dugr dugrVar2 = dugrVar;
                                ListenableFuture listenableFutureR2 = eorv.a;
                                final long j6 = j5;
                                final String str12 = str11;
                                final dtrw dtrwVar7 = dtrwVar6;
                                if (z) {
                                    final dtox dtoxVar = (dtox) exc;
                                    durt.c("%s: Logging DownloadException, resultCode = %s", "FileGroupManager", dtoxVar.a);
                                    listenableFutureR2 = dugrVar2.r(listenableFutureR2, new eooz() { // from class: duet
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj3) {
                                            return dugrVar2.n(dtrwVar7, dtoxVar, j6, str12);
                                        }
                                    });
                                } else if (exc instanceof dtmi) {
                                    durt.b("%s: Logging AggregateException", "FileGroupManager");
                                    ekgb ekgbVar2 = ((dtmi) exc).a;
                                    int i8 = ((ekoe) ekgbVar2).c;
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        Throwable th = (Throwable) ekgbVar2.get(i9);
                                        if (th instanceof dtox) {
                                            final dtox dtoxVar2 = (dtox) th;
                                            listenableFutureR2 = dugrVar2.r(listenableFutureR2, new eooz() { // from class: dueu
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj3) {
                                                    return dugrVar2.n(dtrwVar7, dtoxVar2, j6, str12);
                                                }
                                            });
                                        } else {
                                            durt.n("%s: Expecting DownloadExceptions in AggregateException", "FileGroupManager");
                                            durt.e(th, "%s: Received non-DownloadException for a download", "FileGroupManager");
                                        }
                                    }
                                }
                                return dugrVar2.r(listenableFutureR2, new eooz() { // from class: duev
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        return eork.h(exc);
                                    }
                                });
                            }
                        }, executor);
                    }
                }, dukuVar.n);
            }
        }, this.i);
    }

    @Override // defpackage.dtsl
    public final ListenableFuture i(final dtvn dtvnVar) {
        return this.p.b(new eooy() { // from class: dttr
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final dtvl dtvlVar = this.a;
                dvaq dvaqVarE = dvaq.e(dtvlVar.d.f());
                final dtvn dtvnVar2 = dtvnVar;
                return dvaqVarE.g(new eooz() { // from class: dtub
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ekhv ekhvVar = new ekhv();
                        for (duon duonVar : (List) obj) {
                            dtvn dtvnVar3 = dtvnVar2;
                            dtmu dtmuVar = (dtmu) dtvnVar3;
                            if (dtvy.a((Account) ((ejwt) dtmuVar.b).a).equals(duonVar.b().e)) {
                                ejwi ejwiVar = dtmuVar.a;
                                dtpc dtpcVarB = dtpc.b(duonVar.a().j);
                                if (dtpcVarB == null) {
                                    dtpcVarB = dtpc.GDD_UNKNOWN;
                                }
                                if (((dtpc) ((ejwt) ejwiVar).a).equals(dtpcVarB)) {
                                    dtrv dtrvVar = (dtrv) duonVar.b().toBuilder();
                                    dtrvVar.copyOnWrite();
                                    dtrw dtrwVar = (dtrw) dtrvVar.instance;
                                    dtrwVar.b &= -9;
                                    dtrwVar.f = false;
                                    ekhvVar.c((dtrw) dtrvVar.build());
                                }
                            }
                        }
                        final ekhx ekhxVarG = ekhvVar.g();
                        if (ekhxVarG.isEmpty()) {
                            dtmv dtmvVar = new dtmv();
                            dtmvVar.b(0);
                            return eork.i(dtmvVar.a());
                        }
                        dtvl dtvlVar2 = dtvlVar;
                        final ekgb ekgbVarG = ekhxVarG.g();
                        durt.c("%s removeFileGroups for %d groups", "MDDManager", Integer.valueOf(ekgbVarG.size()));
                        final duku dukuVar = dtvlVar2.d;
                        return eika.j(eika.k(dukuVar.h(), new eooz() { // from class: dukk
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final List list = ekgbVarG;
                                final HashMap mapH = ekmi.h(list.size());
                                final HashMap mapH2 = ekmi.h(list.size());
                                final HashSet hashSet = new HashSet();
                                final ArrayList arrayList = new ArrayList(list.size());
                                final dugr dugrVar = dukuVar.d;
                                eooy eooyVar = new eooy() { // from class: dude
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        final List list2 = list;
                                        final ArrayList arrayList2 = new ArrayList(list2.size());
                                        Iterator it = list2.iterator();
                                        while (true) {
                                            final Map map = mapH;
                                            final dugr dugrVar2 = dugrVar;
                                            if (!it.hasNext()) {
                                                return dvat.a(arrayList2).b(new eooy() { // from class: dubv
                                                    @Override // defpackage.eooy
                                                    public final ListenableFuture a() throws dtmi {
                                                        dtmi.d(arrayList2, "Unable to clear SPE Sync Reasons", new Object[0]);
                                                        final Map map2 = map;
                                                        ekgb ekgbVarN = ekgb.n(map2.keySet());
                                                        final dugr dugrVar3 = dugrVar2;
                                                        ListenableFuture listenableFutureJ = dugrVar3.d.j(ekgbVarN);
                                                        final List list3 = list2;
                                                        return dugrVar3.r(listenableFutureJ, new eooz() { // from class: duce
                                                            @Override // defpackage.eooz
                                                            public final ListenableFuture a(Object obj3) {
                                                                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                                                Map map3 = map2;
                                                                if (zBooleanValue) {
                                                                    map3.values();
                                                                    return eorv.a;
                                                                }
                                                                dugr dugrVar4 = dugrVar3;
                                                                List list4 = list3;
                                                                durt.i("%s: Failed to remove %d pending versions of %d requested groups", "FileGroupManager", Integer.valueOf(map3.size()), Integer.valueOf(list4.size()));
                                                                dugrVar4.b.l(1036);
                                                                return eork.h(new IOException("Failed to remove pending group keys, count = " + list4.size()));
                                                            }
                                                        });
                                                    }
                                                }, dugrVar2.h);
                                            }
                                            final Set set = hashSet;
                                            dtrv dtrvVar2 = (dtrv) ((dtrw) it.next()).toBuilder();
                                            dtrvVar2.copyOnWrite();
                                            dtrw dtrwVar2 = (dtrw) dtrvVar2.instance;
                                            dtrwVar2.b |= 8;
                                            dtrwVar2.f = false;
                                            final dtrw dtrwVar3 = (dtrw) dtrvVar2.build();
                                            arrayList2.add(dvaq.e(dugrVar2.d.g(dtrwVar3)).g(new eooz() { // from class: dubu
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj3) {
                                                    int iA;
                                                    dtqy dtqyVar = (dtqy) obj3;
                                                    if (dtqyVar == null) {
                                                        return eorv.a;
                                                    }
                                                    map.put(dtrwVar3, dtqyVar);
                                                    Iterator<E> it2 = dtqyVar.p.iterator();
                                                    while (true) {
                                                        int i = 1;
                                                        if (!it2.hasNext()) {
                                                            break;
                                                        }
                                                        dtqs dtqsVar = (dtqs) it2.next();
                                                        int iA2 = dtqw.a(dtqyVar.k);
                                                        if (iA2 != 0) {
                                                            i = iA2;
                                                        }
                                                        set.add(duob.a(dtqsVar, i));
                                                    }
                                                    ejwi ejwiVar2 = dugrVar2.j;
                                                    return (!ejwiVar2.g() || (iA = dvao.a(dtqyVar.s)) == 0 || iA == 1) ? eorv.a : ((dvcz) ((ejxr) ejwiVar2.c()).get()).a();
                                                }
                                            }, dugrVar2.h));
                                        }
                                    }
                                };
                                Executor executor = dugrVar.h;
                                return dvaq.e(eika.i(eooyVar, executor)).g(new eooz() { // from class: dudf
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        final List list2 = list;
                                        final ArrayList arrayList2 = new ArrayList(list2.size());
                                        Iterator it = list2.iterator();
                                        while (true) {
                                            final Map map = mapH2;
                                            final dugr dugrVar2 = dugrVar;
                                            if (!it.hasNext()) {
                                                return dvat.a(arrayList2).b(new eooy() { // from class: duca
                                                    @Override // defpackage.eooy
                                                    public final ListenableFuture a() throws dtmi {
                                                        dtmi.d(arrayList2, "Unable to read downloaded file groups to remove", new Object[0]);
                                                        final Map map2 = map;
                                                        ekgb ekgbVarN = ekgb.n(map2.keySet());
                                                        final dugr dugrVar3 = dugrVar2;
                                                        ListenableFuture listenableFutureJ = dugrVar3.d.j(ekgbVarN);
                                                        final List list3 = list2;
                                                        return dugrVar3.r(listenableFutureJ, new eooz() { // from class: duck
                                                            @Override // defpackage.eooz
                                                            public final ListenableFuture a(Object obj4) {
                                                                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                                                Map map3 = map2;
                                                                if (zBooleanValue) {
                                                                    map3.values();
                                                                    return eorv.a;
                                                                }
                                                                dugr dugrVar4 = dugrVar3;
                                                                durt.i("%s: Failed to remove %d downloaded versions of %d requested groups", "FileGroupManager", Integer.valueOf(map3.size()), Integer.valueOf(list3.size()));
                                                                dugrVar4.b.l(1036);
                                                                return eork.h(new IOException("Failed to remove downloaded groups, count = " + map3.size()));
                                                            }
                                                        });
                                                    }
                                                }, dugrVar2.h);
                                            }
                                            final List list3 = arrayList;
                                            dtrv dtrvVar2 = (dtrv) ((dtrw) it.next()).toBuilder();
                                            dtrvVar2.copyOnWrite();
                                            dtrw dtrwVar2 = (dtrw) dtrvVar2.instance;
                                            dtrwVar2.b |= 8;
                                            dtrwVar2.f = true;
                                            final dtrw dtrwVar3 = (dtrw) dtrvVar2.build();
                                            arrayList2.add(dugrVar2.r(dugrVar2.d.g(dtrwVar3), new eooz() { // from class: dubr
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj4) {
                                                    dtqy dtqyVar = (dtqy) obj4;
                                                    if (dtqyVar != null) {
                                                        List list4 = list3;
                                                        map.put(dtrwVar3, dtqyVar);
                                                        list4.add(dtqyVar);
                                                    }
                                                    return eorv.a;
                                                }
                                            }));
                                        }
                                    }
                                }, executor).g(new eooz() { // from class: dudg
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        if (mapH2.isEmpty()) {
                                            return eorv.a;
                                        }
                                        List list2 = arrayList;
                                        final ArrayList arrayList2 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (true) {
                                            final dugr dugrVar2 = dugrVar;
                                            if (!it.hasNext()) {
                                                return dvat.a(arrayList2).a(new Callable() { // from class: dufe
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() throws dtmi {
                                                        dtmi.d(arrayList2, "Unable to add removed downloaded groups as stale", new Object[0]);
                                                        return null;
                                                    }
                                                }, dugrVar2.h);
                                            }
                                            final dtqy dtqyVar = (dtqy) it.next();
                                            arrayList2.add(dugrVar2.r(dugrVar2.d.a(dtqyVar), new eooz() { // from class: dufd
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj4) {
                                                    if (((Boolean) obj4).booleanValue()) {
                                                        return eorv.a;
                                                    }
                                                    dtqy dtqyVar2 = dtqyVar;
                                                    dugr dugrVar3 = dugrVar2;
                                                    durt.h("%s: Failed to add to stale for group: '%s';", "FileGroupManager", dtqyVar2.d);
                                                    dugrVar3.b.l(1036);
                                                    return eork.h(new IOException("Failed to add downloaded group to stale: ".concat(String.valueOf(dtqyVar2.d))));
                                                }
                                            }));
                                        }
                                    }
                                }, executor).g(new eooz() { // from class: dudh
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        if (mapH.isEmpty()) {
                                            return eorv.a;
                                        }
                                        final Set set = hashSet;
                                        final dugr dugrVar2 = dugrVar;
                                        final ekhv ekhvVar2 = new ekhv();
                                        return dugrVar2.r(dugrVar2.q(dugrVar2.d.c(), new ejvr() { // from class: dues
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj4) {
                                                Iterator it = ((List) obj4).iterator();
                                                while (true) {
                                                    ekhv ekhvVar3 = ekhvVar2;
                                                    if (!it.hasNext()) {
                                                        return ekhvVar3.g();
                                                    }
                                                    dtqy dtqyVarA = ((duon) it.next()).a();
                                                    for (dtqs dtqsVar : dtqyVarA.p) {
                                                        int iA = dtqw.a(dtqyVarA.k);
                                                        if (iA == 0) {
                                                            iA = 1;
                                                        }
                                                        ekhvVar3.c(duob.a(dtqsVar, iA));
                                                    }
                                                }
                                            }
                                        }), new eooz() { // from class: dubw
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj4) {
                                                ekhx ekhxVar = (ekhx) obj4;
                                                final ArrayList arrayList2 = new ArrayList();
                                                Iterator it = set.iterator();
                                                while (true) {
                                                    dugr dugrVar3 = dugrVar2;
                                                    if (!it.hasNext()) {
                                                        return dvat.a(arrayList2).a(new Callable() { // from class: dudb
                                                            @Override // java.util.concurrent.Callable
                                                            public final Object call() throws dtmi {
                                                                dtmi.d(arrayList2, "Unable to cancel downloads for removed groups", new Object[0]);
                                                                return null;
                                                            }
                                                        }, dugrVar3.h);
                                                    }
                                                    dtsd dtsdVar = (dtsd) it.next();
                                                    if (!ekhxVar.contains(dtsdVar)) {
                                                        arrayList2.add(dugrVar3.e.a(dtsdVar));
                                                    }
                                                }
                                            }
                                        });
                                    }
                                }, executor);
                            }
                        }, dukuVar.n), new ejvr() { // from class: dttj
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                dtmv dtmvVar2 = new dtmv();
                                dtmvVar2.b(ekhxVarG.size());
                                return dtmvVar2.a();
                            }
                        }, dtvlVar2.i);
                    }
                }, dtvlVar.i);
            }
        }, this.i);
    }

    @Override // defpackage.dtsl
    public final ListenableFuture j(final ejwi ejwiVar) {
        return this.p.a(new Callable() { // from class: dtsz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dtvl dtvlVar = this.a;
                ejwi ejwiVar2 = dtvlVar.c;
                if (!ejwiVar2.g()) {
                    durt.g("%s: Called schedulePeriodicTasksInternal when taskScheduler is not provided.", "MobileDataDownload");
                    return null;
                }
                ejwi ejwiVar3 = ejwiVar;
                dtvv dtvvVar = (dtvv) ejwiVar2.c();
                ekgi ekgiVar = new ekgi();
                dtpi dtpiVar = dtvlVar.f;
                ekgiVar.i("MDD.CHARGING.PERIODIC.TASK", dtvw.a(dtpiVar.w()));
                ekgiVar.i("MDD.MAINTENANCE.PERIODIC.GCM.TASK", dtvw.a(dtpiVar.v()));
                ekgiVar.i("MDD.CELLULAR.CHARGING.PERIODIC.TASK", dtvw.a(dtpiVar.u()));
                ekgiVar.i("MDD.WIFI.CHARGING.PERIODIC.TASK", dtvw.a(dtpiVar.x()));
                ekgp ekgpVarC = ekgiVar.c();
                dtvvVar.a("MDD.CHARGING.PERIODIC.TASK", dtpiVar.q(), 3, dtvl.t(ejwiVar3, ekgpVarC, "MDD.CHARGING.PERIODIC.TASK"));
                dtvvVar.a("MDD.MAINTENANCE.PERIODIC.GCM.TASK", dtpiVar.r(), 3, dtvl.t(ejwiVar3, ekgpVarC, "MDD.MAINTENANCE.PERIODIC.GCM.TASK"));
                dtvvVar.a("MDD.CELLULAR.CHARGING.PERIODIC.TASK", dtpiVar.p(), 1, dtvl.t(ejwiVar3, ekgpVarC, "MDD.CELLULAR.CHARGING.PERIODIC.TASK"));
                dtvvVar.a("MDD.WIFI.CHARGING.PERIODIC.TASK", dtpiVar.s(), 2, dtvl.t(ejwiVar3, ekgpVarC, "MDD.WIFI.CHARGING.PERIODIC.TASK"));
                return null;
            }
        }, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtsl
    public final String k() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        try {
            final duku dukuVar = this.d;
            ((eooi) eika.k(dukuVar.h(), new eooz() { // from class: dujp
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final PrintWriter printWriter2 = printWriter;
                    printWriter2.println("==== MDD_FILE_GROUP_MANAGER ====");
                    printWriter2.println("MDD_FRESH_FILE_GROUPS:");
                    final duku dukuVar2 = dukuVar;
                    final dugr dugrVar = dukuVar2.d;
                    return eika.k(dugrVar.r(dugrVar.r(dugrVar.d.c(), new eooz() { // from class: duep
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            ArrayList arrayList = new ArrayList((List) obj2);
                            Collections.sort(arrayList, new Comparator() { // from class: dufc
                                @Override // java.util.Comparator
                                public final int compare(Object obj3, Object obj4) {
                                    duon duonVar = (duon) obj3;
                                    duon duonVar2 = (duon) obj4;
                                    return ekdr.b.c(duonVar.b().c, duonVar2.b().c).c(duonVar.b().e, duonVar2.b().e).a();
                                }
                            });
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                PrintWriter printWriter3 = printWriter2;
                                duon duonVar = (duon) arrayList.get(i);
                                printWriter3.format("GroupName: %s\nAccount: %s\nDataFileGroup:\n %s\n\n", duonVar.b().c, duonVar.b().e, duonVar.a().toString());
                            }
                            return eorv.a;
                        }
                    }), new eooz() { // from class: duez
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final PrintWriter printWriter3 = printWriter2;
                            printWriter3.println("MDD_STALE_FILE_GROUPS:");
                            dugr dugrVar2 = dugrVar;
                            return dugrVar2.r(dugrVar2.d.e(), new eooz() { // from class: duch
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    for (dtqy dtqyVar : (List) obj3) {
                                        PrintWriter printWriter4 = printWriter3;
                                        printWriter4.format("GroupName: %s\nDataFileGroup:\n%s\n", dtqyVar.d, dtqyVar.toString());
                                    }
                                    return eorv.a;
                                }
                            });
                        }
                    }), new eooz() { // from class: duje
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final PrintWriter printWriter3 = printWriter2;
                            printWriter3.println("==== MDD_SHARED_FILES ====");
                            final dunz dunzVar = dukuVar2.f;
                            return eika.k(dunzVar.c.c(), new eooz() { // from class: dunx
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    ListenableFuture listenableFutureK = eorv.a;
                                    for (final dtsd dtsdVar : (List) obj3) {
                                        final PrintWriter printWriter4 = printWriter3;
                                        final dunz dunzVar2 = dunzVar;
                                        listenableFutureK = eika.k(listenableFutureK, new eooz() { // from class: dumw
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj4) {
                                                final dunz dunzVar3 = dunzVar2;
                                                final PrintWriter printWriter5 = printWriter4;
                                                duoc duocVar = dunzVar3.c;
                                                final dtsd dtsdVar2 = dtsdVar;
                                                return eika.k(duocVar.e(dtsdVar2), new eooz() { // from class: dund
                                                    @Override // defpackage.eooz
                                                    public final ListenableFuture a(Object obj5) {
                                                        dtsh dtshVar = (dtsh) obj5;
                                                        if (dtshVar == null) {
                                                            durt.g("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                                                            return eorv.a;
                                                        }
                                                        dtsd dtsdVar3 = dtsdVar2;
                                                        PrintWriter printWriter6 = printWriter5;
                                                        printWriter6.format("FileKey: %s\nFileName: %s\nSharedFile: %s\n", dtsdVar3, dtshVar.c, dtshVar.toString());
                                                        if (dtshVar.e) {
                                                            printWriter6.format("Checksum Android-shared file: %s\n", dtshVar.g);
                                                        } else {
                                                            dunz dunzVar4 = dunzVar3;
                                                            int iA = dtqw.a(dtsdVar3.f);
                                                            Uri uriE = duto.e(dunzVar4.a, iA == 0 ? 1 : iA, dtshVar.c, dtsdVar3.e, dunzVar4.b, dunzVar4.k, false);
                                                            if (uriE != null) {
                                                                printWriter6.format("Checksum downloaded file: %s\n", duqr.b(dunzVar4.e, uriE));
                                                            }
                                                        }
                                                        return eorv.a;
                                                    }
                                                }, dunzVar3.l);
                                            }
                                        }, dunzVar2.l);
                                    }
                                    return listenableFutureK;
                                }
                            }, dunzVar.l);
                        }
                    }, dukuVar2.n);
                }
            }, dukuVar.n)).r(3L, TimeUnit.SECONDS);
            printWriter.println("==== MOBSTORE_DEBUG_INFO ====");
            final ecev ecevVar = this.e;
            printWriter.print(String.format("Registered Mobstore Plugins:\n\nBackends:\n%1$s\n\nTransforms:\n%2$s\n\nMonitors:\n%3$s", TextUtils.join(",\n", ekpg.k(ekis.f(ecevVar.a.keySet(), new ejvr() { // from class: eces
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    return String.format("protocol: %1$s, class: %2$s", str, ((echo) ecevVar.a.get(str)).getClass().getSimpleName());
                }
            }))), TextUtils.join(",\n", ekpg.k(ekis.f(ecevVar.b.values(), new ejvr() { // from class: ecet
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ((echu) obj).getClass().getSimpleName();
                }
            }))), TextUtils.join(",\n", ekpg.k(ekis.f(ecevVar.c, new ejvr() { // from class: eceu
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ((echs) obj).getClass().getSimpleName();
                }
            })))));
            printWriter.println("==== END MOBSTORE_DEBUG_INFO ====");
            printWriter.println("==== MDD Backgground Task Info ===");
            ekqg ekqgVarListIterator = ((dtot) this.p.b(new eooy() { // from class: dtte
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    duku dukuVar2 = this.a.d;
                    return dvaq.e(dukuVar2.q.e()).f(new ejvr() { // from class: dujo
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ekgp ekgpVar = (ekgp) obj;
                            boolean z = duku.a;
                            if (ekgpVar != null) {
                                return new dtml(ekgpVar);
                            }
                            throw new NullPointerException("Null backgroundTaskLastRunTimestamps");
                        }
                    }, dukuVar2.n);
                }
            }, this.i).get(3L, TimeUnit.SECONDS)).a().entrySet().listIterator();
            while (ekqgVarListIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                printWriter.printf("Background task %s last run at %s UTC \n", entry.getKey(), entry.getValue());
                printWriter.printf("Time now is %s UTC \n", Instant.ofEpochMilli(this.m.a()));
            }
            printWriter.println("==== END MDD Background Task Info ====");
            printWriter.flush();
            return byteArrayOutputStream.toString();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            String str = String.format("%s: Couldn't get debug info: %s", "MobileDataDownload", e);
            durt.f(str);
            return str;
        } catch (ExecutionException e2) {
            e = e2;
            String str2 = String.format("%s: Couldn't get debug info: %s", "MobileDataDownload", e);
            durt.f(str2);
            return str2;
        } catch (TimeoutException e3) {
            e = e3;
            String str22 = String.format("%s: Couldn't get debug info: %s", "MobileDataDownload", e);
            durt.f(str22);
            return str22;
        }
    }

    @Override // defpackage.dtsl
    public final void l(final String str) {
        durt.c("%s: CancelForegroundDownload for key = %s", "MobileDataDownload", str);
        eika.k(this.g.d(str), new eooz() { // from class: dtud
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ejwi ejwiVar = (ejwi) obj;
                if (ejwiVar.g()) {
                    durt.l("%s: CancelForegroundDownload future found for key = %s, cancelling...", "MobileDataDownload", str);
                    ((ListenableFuture) ejwiVar.c()).cancel(false);
                }
                return eorv.a;
            }
        }, this.i);
        this.o.b(str);
    }

    @Override // defpackage.dtsl
    public final ListenableFuture m(final String str, ejwi ejwiVar) {
        ListenableFuture listenableFutureG = g(str);
        final ejwi ejwiVarB = ejwiVar.b(new ejvr() { // from class: dtuf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtvr dtvrVar = (dtvr) obj;
                eokc eokcVar = (eokc) eokf.a.createBuilder();
                long jA = dtvrVar.a();
                eokcVar.copyOnWrite();
                eokf eokfVar = (eokf) eokcVar.instance;
                eokfVar.b |= 1;
                eokfVar.c = jA;
                int iE = dtvrVar.e() - 1;
                int i = iE != 0 ? iE != 2 ? 3 : 4 : 2;
                eokcVar.copyOnWrite();
                eokf eokfVar2 = (eokf) eokcVar.instance;
                eokfVar2.d = i - 1;
                eokfVar2.b |= 2;
                boolean zB = dtvrVar.b();
                eokcVar.copyOnWrite();
                eokf eokfVar3 = (eokf) eokcVar.instance;
                eokfVar3.b = 4 | eokfVar3.b;
                eokfVar3.e = zB;
                boolean zC = dtvrVar.c();
                eokcVar.copyOnWrite();
                eokf eokfVar4 = (eokf) eokcVar.instance;
                eokfVar4.b |= 8;
                eokfVar4.f = zC;
                boolean zD = dtvrVar.d();
                eokcVar.copyOnWrite();
                eokf eokfVar5 = (eokf) eokcVar.instance;
                eokfVar5.b |= 16;
                eokfVar5.g = zD;
                dtvrVar.f();
                eokcVar.copyOnWrite();
                eokf eokfVar6 = (eokf) eokcVar.instance;
                eokfVar6.h = 1;
                eokfVar6.b |= 32;
                return (eokf) eokcVar.build();
            }
        });
        dvaq dvaqVarE = dvaq.e(listenableFutureG);
        eooz eoozVar = new eooz() { // from class: dtug
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.b.b(str, ejud.a, ejwiVarB);
            }
        };
        Executor executor = this.i;
        return dvaqVarE.g(eoozVar, executor).d(Exception.class, new eooz() { // from class: dtuh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Throwable cause = (Exception) obj;
                if (cause instanceof ExecutionException) {
                    ExecutionException executionException = (ExecutionException) cause;
                    if (executionException.getCause() != null) {
                        cause = executionException.getCause();
                    }
                }
                ejwi ejwiVar2 = ejwiVarB;
                String str2 = str;
                dtvl dtvlVar = this.a;
                cause.getClass();
                return dvaq.e(dtvlVar.b.b(str2, ejwi.j(cause), ejwiVar2)).g(new eooz() { // from class: dtua
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return eork.h(cause);
                    }
                }, dtvlVar.i);
            }
        }, executor);
    }

    public final ListenableFuture q(final dtoz dtozVar) {
        dtmn dtmnVar = (dtmn) dtozVar;
        ejwi ejwiVar = dtmnVar.b;
        final String str = dtmnVar.a;
        final duab duabVarC = duab.c(str, ejwiVar);
        dtrv dtrvVar = (dtrv) dtrw.a.createBuilder();
        dtrvVar.copyOnWrite();
        dtrw dtrwVar = (dtrw) dtrvVar.instance;
        dtrwVar.b |= 1;
        dtrwVar.c = str;
        String packageName = this.a.getPackageName();
        dtrvVar.copyOnWrite();
        dtrw dtrwVar2 = (dtrw) dtrvVar.instance;
        packageName.getClass();
        dtrwVar2.b |= 2;
        dtrwVar2.d = packageName;
        if (ejwiVar.g()) {
            String strA = dtvy.a((Account) ejwiVar.c());
            dtrvVar.copyOnWrite();
            dtrw dtrwVar3 = (dtrw) dtrvVar.instance;
            dtrwVar3.b |= 4;
            dtrwVar3.e = strA;
        }
        final dtrw dtrwVar4 = (dtrw) dtrvVar.build();
        return this.p.b(new eooy() { // from class: dtti
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                duaa duaaVar = (duaa) duabVarC;
                final dtvl dtvlVar = this.a;
                dutv dutvVar = dtvlVar.h;
                String str2 = duaaVar.a;
                final ListenableFuture listenableFutureD = dtvlVar.g.d(str2);
                final ListenableFuture listenableFutureD2 = dutvVar.d(str2);
                dvas dvasVarD = dvat.d(listenableFutureD, listenableFutureD2);
                final dtrw dtrwVar5 = dtrwVar4;
                final dtoz dtozVar2 = dtozVar;
                final String str3 = str;
                return dvasVarD.b(new eooy() { // from class: dttk
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ListenableFuture listenableFuture = listenableFutureD;
                        if (((ejwi) eork.q(listenableFuture)).g()) {
                            return eork.i(new duaj((ListenableFuture) ((ejwi) eork.q(listenableFuture)).c()));
                        }
                        ListenableFuture listenableFuture2 = listenableFutureD2;
                        if (((ejwi) eork.q(listenableFuture2)).g()) {
                            return eork.i(new duaj((ListenableFuture) ((ejwi) eork.q(listenableFuture2)).c()));
                        }
                        final String str4 = str3;
                        final dtoz dtozVar3 = dtozVar2;
                        final dtrw dtrwVar6 = dtrwVar5;
                        final dtvl dtvlVar2 = dtvlVar;
                        ListenableFuture listenableFutureG = dtvlVar2.d.g(dtrwVar6, false);
                        eooz eoozVar = new eooz() { // from class: dttp
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                dtvl dtvlVar3 = dtvlVar2;
                                final dtqy dtqyVar = (dtqy) obj;
                                return eika.j(dtvlVar3.d.g(dtrwVar6, true), new ejvr() { // from class: dtuc
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        return new duom(dtqyVar, (dtqy) obj2);
                                    }
                                }, dtvlVar3.i);
                            }
                        };
                        Executor executor = dtvlVar2.i;
                        return eika.k(eika.k(listenableFutureG, eoozVar, executor), new eooz() { // from class: dttq
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                duoo duooVar = (duoo) obj;
                                if (duooVar.b() != null) {
                                    dtqy dtqyVarB = duooVar.b();
                                    dtqyVarB.getClass();
                                    return eork.i(new duak(dtqyVarB));
                                }
                                dtrw dtrwVar7 = dtrwVar6;
                                if (duooVar.a() == null) {
                                    dtov dtovVarA = dtox.a();
                                    dtovVarA.a = dtow.GROUP_NOT_FOUND_ERROR;
                                    dtovVarA.b = "Nothing to download for file group: ".concat(String.valueOf(dtrwVar7.c));
                                    return eork.h(dtovVarA.a());
                                }
                                dtoz dtozVar4 = dtozVar3;
                                dtvl dtvlVar3 = dtvlVar2;
                                dtqy dtqyVarA = duooVar.a();
                                dtqyVarA.getClass();
                                ejwi ejwiVarO = dtvl.o(dtrwVar7, dtqyVarA, dtvlVar3.f);
                                dtmn dtmnVar2 = (dtmn) dtozVar4;
                                ejwi ejwiVar2 = dtmnVar2.b;
                                String strA2 = ejwiVar2.g() ? dtvy.a((Account) ejwiVar2.c()) : null;
                                String str5 = str4;
                                boolean z = dtmnVar2.f;
                                duku dukuVar = dtvlVar3.d;
                                Executor executor2 = dtvlVar3.i;
                                dvaq dvaqVarF = dvaq.e(dtvl.u(dtqyVarA, ejwiVarO, strA2, dtlz.DOWNLOADED, z, dukuVar, executor2, dtvlVar3.e)).f(new dtux(), executor2).f(new ejvr(false, dtozVar4, str5) { // from class: dttl
                                    public final /* synthetic */ boolean b = false;
                                    public final /* synthetic */ dtoz c;
                                    public final /* synthetic */ String d;

                                    {
                                        this.c = dtozVar4;
                                        this.d = str5;
                                    }

                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        return (dtma) obj2;
                                    }
                                }, executor2);
                                eika.l(dvaqVarF.b, new dtvc(dtvlVar3, false, str5), executor2);
                                return dvaqVarF.f(new ejvr() { // from class: dttm
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        return new duai((dtma) obj2);
                                    }
                                }, eoqg.a);
                            }
                        }, executor);
                    }
                }, dtvlVar.i);
            }
        }, this.i);
    }

    public final ListenableFuture r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            arrayList.add(((dtpd) it.next()).a(this));
        }
        return dvat.a(arrayList).a(new Callable() { // from class: dtui
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, this.i);
    }

    public final ListenableFuture v(dtrw dtrwVar, dtqy dtqyVar, boolean z, boolean z2) {
        ejwi ejwiVarO = o(dtrwVar, dtqyVar, this.f);
        String str = (dtrwVar.b & 4) != 0 ? dtrwVar.e : null;
        dtlz dtlzVar = z ? dtlz.DOWNLOADED : dtlz.PENDING;
        duku dukuVar = this.d;
        Executor executor = this.i;
        return eika.j(u(dtqyVar, ejwiVarO, str, dtlzVar, z2, dukuVar, executor, this.e), new ejvr() { // from class: dttu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtma dtmaVar = (dtma) obj;
                if (dtmaVar != null) {
                    dtvl dtvlVar = this.a;
                    dtvlVar.b.h(dtvl.p(dtmaVar));
                }
                return dtmaVar;
            }
        }, executor);
    }
}
