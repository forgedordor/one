package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dunz {
    public final Context a;
    public final dtvq b;
    public final duoc c;
    public final dure d;
    public final ecev e;
    public final ejwi f;
    public final ejwi g;
    public final durk h;
    public final dtpi i;
    public final dugs j;
    public final ejwi k;
    public final Executor l;

    public dunz(Context context, dtvq dtvqVar, duoc duocVar, ecev ecevVar, dure dureVar, ejwi ejwiVar, ejwi ejwiVar2, durk durkVar, dtpi dtpiVar, dugs dugsVar, ejwi ejwiVar3, Executor executor) {
        this.a = context;
        this.b = dtvqVar;
        this.c = duocVar;
        this.e = ecevVar;
        this.d = dureVar;
        this.f = ejwiVar;
        this.g = ejwiVar2;
        this.h = durkVar;
        this.i = dtpiVar;
        this.j = dugsVar;
        this.k = ejwiVar3;
        this.l = executor;
    }

    public final ListenableFuture a(final dtsd dtsdVar) {
        return eika.k(this.c.e(dtsdVar), new eooz() { // from class: dums
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtsh dtshVar = (dtsh) obj;
                if (dtshVar == null) {
                    durt.g("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                    return eork.h(new duoa());
                }
                dtru dtruVarB = dtru.b(dtshVar.d);
                if (dtruVarB == null) {
                    dtruVarB = dtru.NONE;
                }
                if (dtruVarB != dtru.DOWNLOAD_COMPLETE) {
                    dtsd dtsdVar2 = dtsdVar;
                    dunz dunzVar = this.a;
                    int iA = dtqw.a(dtsdVar2.f);
                    if (iA == 0) {
                        iA = 1;
                    }
                    Uri uriE = duto.e(dunzVar.a, iA, dtshVar.c, dtsdVar2.e, dunzVar.b, dunzVar.k, false);
                    if (uriE != null) {
                        dunzVar.d.f(dtsdVar2.e, uriE);
                    }
                    dtru dtruVarB2 = dtru.b(dtshVar.d);
                    if (dtruVarB2 == null) {
                        dtruVarB2 = dtru.NONE;
                    }
                    if (dtruVarB2 == dtru.DOWNLOAD_IN_PROGRESS) {
                        duoc duocVar = dunzVar.c;
                        dtsg dtsgVar = (dtsg) dtshVar.toBuilder();
                        dtru dtruVar = dtru.SUBSCRIBED;
                        dtsgVar.copyOnWrite();
                        dtsh dtshVar2 = (dtsh) dtsgVar.instance;
                        dtshVar2.d = dtruVar.h;
                        dtshVar2.b |= 2;
                        return eika.k(duocVar.h(dtsdVar2, (dtsh) dtsgVar.build()), new eooz() { // from class: duns
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return eorv.a;
                            }
                        }, dunzVar.l);
                    }
                }
                return eorv.a;
            }
        }, this.l);
    }

    public final ListenableFuture b() {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Context context = this.a;
                int i = ecfh.a;
                this.e.f(ecfg.a("*.lease", context.getPackageName(), 0L));
                this.h.l(1077);
            } catch (ecgh unused) {
                int i2 = durt.a;
                ekrg ekrgVar = durs.a;
                ((ekrd) ((ekrd) ekrgVar.f()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "v", 35, "LogUtil.java")).t("%s: Failed to release the leases in the android shared storage. UnsupportedFileStorageOperation was thrown", "SharedFileManager");
                ((ekrd) ekrgVar.f()).Q();
            } catch (IOException e) {
                durt.k(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
                this.h.l(1078);
            }
        }
        try {
            this.e.j(duto.a(this.a, this.k));
        } catch (IOException unused2) {
            this.b.a();
        }
        return eorv.a;
    }

    public final ListenableFuture c(final dtsd dtsdVar, final String str, final int i, final long j, final String str2, final dtrw dtrwVar, final dtqs dtqsVar, final dtrc dtrcVar, final dtrk dtrkVar, final int i2, final List list, final evqe evqeVar) {
        return eika.k(g(dtsdVar), new eooz() { // from class: dumr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtsh dtshVar = (dtsh) obj;
                dtru dtruVarB = dtru.b(dtshVar.d);
                if (dtruVarB == null) {
                    dtruVarB = dtru.NONE;
                }
                if (dtruVarB == dtru.DOWNLOAD_COMPLETE) {
                    return eorv.a;
                }
                final dtsd dtsdVar2 = dtsdVar;
                final dtsg dtsgVar = (dtsg) dtshVar.toBuilder();
                int iA = dtqw.a(dtsdVar2.f);
                if (iA == 0) {
                    iA = 1;
                }
                final evqe evqeVar2 = evqeVar;
                final List list2 = list;
                final int i3 = i2;
                final dtrk dtrkVar2 = dtrkVar;
                final String str3 = str2;
                final long j2 = j;
                final int i4 = i;
                final dtrw dtrwVar2 = dtrwVar;
                final dtrc dtrcVar2 = dtrcVar;
                final dtqs dtqsVar2 = dtqsVar;
                String str4 = str;
                final dunz dunzVar = this.a;
                final ListenableFuture listenableFutureK = dunzVar.k(iA, str4, dtqsVar2.g);
                dvaq dvaqVarE = dvaq.e(listenableFutureK);
                eooz eoozVar = new eooz() { // from class: dunh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        dtsg dtsgVar2 = dtsgVar;
                        dtru dtruVar = dtru.DOWNLOAD_IN_PROGRESS;
                        dtsgVar2.copyOnWrite();
                        dtsh dtshVar2 = (dtsh) dtsgVar2.instance;
                        dtsh dtshVar3 = dtsh.a;
                        dtshVar2.d = dtruVar.h;
                        dtshVar2.b |= 2;
                        return dunzVar.c.h(dtsdVar2, (dtsh) dtsgVar2.build());
                    }
                };
                Executor executor = dunzVar.l;
                return dvaqVarE.g(eoozVar, executor).g(new eooz() { // from class: duni
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        dtrc dtrcVar3;
                        Uri uri = (Uri) eork.q(listenableFutureK);
                        dunz dunzVar2 = dunzVar;
                        dtrw dtrwVar3 = dtrwVar2;
                        int i5 = i4;
                        int i6 = i3;
                        long j3 = j2;
                        List list3 = list2;
                        dtqs dtqsVar3 = dtqsVar2;
                        dtsd dtsdVar3 = dtsdVar2;
                        String str5 = str3;
                        dtrk dtrkVar3 = dtrkVar2;
                        evqe evqeVar3 = evqeVar2;
                        ejwi ejwiVar = dunzVar2.f;
                        if (!ejwiVar.g() || (dtrcVar3 = dtrcVar2) == null) {
                            duoc duocVar = dunzVar2.c;
                            ecev ecevVar = dunzVar2.e;
                            int iA2 = dtqw.a(dtsdVar3.f);
                            duqp duqpVar = new duqp(duocVar, ecevVar, dtqsVar3, iA2 != 0 ? iA2 : 1, dunzVar2.h, dtrwVar3, i5, j3, str5, dunzVar2.i, dunzVar2.l);
                            dunzVar2.i(dtrwVar3, uri);
                            return dunzVar2.d.d(dtsdVar3.e, dtrwVar3, i5, j3, str5, uri, dtqsVar3.d, dtqsVar3.e, dtrkVar3, duqpVar, i6, list3, evqeVar3);
                        }
                        Context context = dunzVar2.a;
                        duoc duocVar2 = dunzVar2.c;
                        ecev ecevVar2 = dunzVar2.e;
                        dtvq dtvqVar = dunzVar2.b;
                        int iA3 = dtqw.a(dtsdVar3.f);
                        duqi duqiVar = new duqi(context, duocVar2, ecevVar2, dtvqVar, dtqsVar3, iA3 != 0 ? iA3 : 1, (dtyx) ejwiVar.c(), dtrcVar3, dunzVar2.h, dtrwVar3, i5, j3, str5, dunzVar2.k, dunzVar2.i, dunzVar2.l);
                        dunzVar2.i(dtrwVar3, uri);
                        return dunzVar2.d.d(dtsdVar3.e, dtrwVar3, i5, j3, str5, uri, dtrcVar3.c, dtrcVar3.d, dtrkVar3, duqiVar, i6, list3, evqeVar3);
                    }
                }, executor);
            }
        }, this.l);
    }

    final ListenableFuture d(dtsd dtsdVar) {
        return eika.k(g(dtsdVar), new eooz() { // from class: dunt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtru dtruVarB = dtru.b(((dtsh) obj).d);
                if (dtruVarB == null) {
                    dtruVarB = dtru.NONE;
                }
                return eork.i(dtruVarB);
            }
        }, this.l);
    }

    public final ListenableFuture e(final dtsd dtsdVar) {
        return eika.j(f(new ekph(dtsdVar)), new ejvr() { // from class: dunk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (Uri) ((ekgp) obj).get(dtsdVar);
            }
        }, eoqg.a);
    }

    final ListenableFuture f(final ekhx ekhxVar) {
        return dvaq.e(this.c.f(ekhxVar)).g(new eooz() { // from class: duna
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgp ekgpVar = (ekgp) obj;
                ekgi ekgiVar = new ekgi();
                ekqg ekqgVarListIterator = ekhxVar.listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    dtsd dtsdVar = (dtsd) ekqgVarListIterator.next();
                    if (!ekgpVar.containsKey(dtsdVar)) {
                        durt.h("%s: getOnDeviceUris called on file that doesn't exist. Key = %s!", "SharedFileManager", dtsdVar);
                        return eork.h(new duoa());
                    }
                    dunz dunzVar = this.a;
                    dtsh dtshVar = (dtsh) ekgpVar.get(dtsdVar);
                    int iA = dtqw.a(dtsdVar.f);
                    if (iA == 0) {
                        iA = 1;
                    }
                    Uri uriE = duto.e(dunzVar.a, iA, dtshVar.c, dtshVar.g, dunzVar.b, dunzVar.k, dtshVar.e);
                    if (uriE != null) {
                        ekgiVar.i(dtsdVar, uriE);
                    }
                }
                return eork.i(ekgiVar.b());
            }
        }, this.l);
    }

    final ListenableFuture g(final dtsd dtsdVar) {
        return eika.k(this.c.e(dtsdVar), new eooz() { // from class: dumu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtsh dtshVar = (dtsh) obj;
                if (dtshVar != null) {
                    return eork.i(dtshVar);
                }
                durt.h("%s: getSharedFile called on file that doesn't exist! Key = %s", "SharedFileManager", dtsdVar);
                return eork.h(new duoa());
            }
        }, this.l);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.common.util.concurrent.ListenableFuture h(final defpackage.dtrw r20, final int r21, final long r22, final java.lang.String r24, final defpackage.dtqs r25, final defpackage.dtsd r26, final defpackage.dtrk r27, final int r28, final java.util.List r29, final defpackage.evqe r30) {
        /*
            r19 = this;
            r1 = r19
            r6 = r25
            r8 = r26
            java.lang.String r0 = "SharedFileManager"
            java.lang.String r2 = r6.d
            java.lang.String r3 = "%s: startDownload called for %s"
            defpackage.durt.c(r3, r0, r2)
            java.lang.String r0 = r6.d
            java.lang.String r2 = "inlinefile"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L2e
            dtov r0 = defpackage.dtox.a()
            dtow r2 = defpackage.dtow.INVALID_INLINE_FILE_URL_SCHEME
            r0.a = r2
            java.lang.String r2 = "downloading a file with an inlinefile scheme is not supported, use importFiles instead."
            r0.b = r2
            dtox r0 = r0.a()
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eork.h(r0)
            return r0
        L2e:
            com.google.common.util.concurrent.ListenableFuture r2 = r1.g(r8)
            int r0 = r8.f
            int r0 = defpackage.dtqw.a(r0)
            r3 = 1
            if (r0 != 0) goto L3c
            r0 = r3
        L3c:
            android.content.Context r4 = r1.a
            dtvq r5 = r1.b
            duiu r4 = defpackage.duiv.a(r4, r5)
            int r4 = r4.d
            duiu r5 = defpackage.duiu.USE_CHECKSUM_ONLY
            int r5 = r5.d
            r7 = 0
            if (r4 < r5) goto L62
            ejwi r4 = r1.f
            boolean r5 = r4.g()
            if (r5 == 0) goto L62
            java.lang.Object r4 = r4.c()
            dtyx r4 = (defpackage.dtyx) r4
            evtg r4 = r6.l
            com.google.common.util.concurrent.ListenableFuture r0 = r1.j(r4, r7, r0)
            goto L67
        L62:
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eork.i(r0)
        L67:
            r4 = 2
            com.google.common.util.concurrent.ListenableFuture[] r5 = new com.google.common.util.concurrent.ListenableFuture[r4]
            r5[r7] = r2
            r5[r3] = r0
            dvas r5 = defpackage.dvat.d(r5)
            dunl r9 = new dunl
            r9.<init>()
            eoqg r10 = defpackage.eoqg.a
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a(r9, r10)
            dunn r9 = new dunn
            r9.<init>()
            java.util.concurrent.Executor r11 = r1.l
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.eika.k(r5, r9, r11)
            r12 = 4
            com.google.common.util.concurrent.ListenableFuture[] r12 = new com.google.common.util.concurrent.ListenableFuture[r12]
            r12[r7] = r2
            r12[r3] = r0
            r12[r4] = r5
            r3 = 3
            r12[r3] = r9
            dvas r3 = defpackage.dvat.d(r12)
            duno r4 = new duno
            r4.<init>()
            com.google.common.util.concurrent.ListenableFuture r3 = r3.b(r4, r10)
            dvaq r3 = defpackage.dvaq.e(r3)
            r4 = r3
            r3 = r0
            dunp r0 = new dunp
            r7 = r20
            r12 = r24
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r18 = r4
            r4 = r5
            r5 = r9
            r17 = r11
            r9 = r21
            r10 = r22
            r0.<init>()
            r2 = r0
            r0 = r17
            r4 = r18
            dvaq r2 = r4.g(r2, r0)
            dunq r3 = new dunq
            r3.<init>()
            java.lang.Class<duoa> r4 = defpackage.duoa.class
            dvaq r0 = r2.d(r4, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dunz.h(dtrw, int, long, java.lang.String, dtqs, dtsd, dtrk, int, java.util.List, evqe):com.google.common.util.concurrent.ListenableFuture");
    }

    public final void i(dtrw dtrwVar, Uri uri) {
        ejwi ejwiVar = this.g;
        if (ejwiVar.g()) {
            try {
                long jA = this.e.a(uri);
                if (jA > 0) {
                    ((duvp) ejwiVar.c()).i(dtrwVar.c, jA);
                }
            } catch (IOException unused) {
            }
        }
    }

    public final ListenableFuture j(final List list, final int i, final int i2) {
        if (i == list.size()) {
            return eork.i(null);
        }
        final dtrc dtrcVar = (dtrc) list.get(i);
        int iA = dtrb.a(dtrcVar.f);
        if (iA == 0) {
            iA = 1;
        }
        if (iA != 2) {
            return j(list, i + 1, i2);
        }
        dtsc dtscVar = (dtsc) dtsd.a.createBuilder();
        dtqk dtqkVar = dtrcVar.g;
        if (dtqkVar == null) {
            dtqkVar = dtqk.a;
        }
        String str = dtqkVar.c;
        dtscVar.copyOnWrite();
        dtsd dtsdVar = (dtsd) dtscVar.instance;
        str.getClass();
        dtsdVar.b |= 4;
        dtsdVar.e = str;
        dtscVar.copyOnWrite();
        dtsd dtsdVar2 = (dtsd) dtscVar.instance;
        dtsdVar2.f = i2 - 1;
        dtsdVar2.b |= 8;
        final dtsd dtsdVar3 = (dtsd) dtscVar.build();
        return eika.k(this.c.e(dtsdVar3), new eooz() { // from class: dunr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dunz dunzVar = this.a;
                dtsh dtshVar = (dtsh) obj;
                if (dtshVar != null) {
                    dtru dtruVarB = dtru.b(dtshVar.d);
                    if (dtruVarB == null) {
                        dtruVarB = dtru.NONE;
                    }
                    if (dtruVarB == dtru.DOWNLOAD_COMPLETE) {
                        dtsd dtsdVar4 = dtsdVar3;
                        Context context = dunzVar.a;
                        int iA2 = dtqw.a(dtsdVar4.f);
                        if (iA2 == 0) {
                            iA2 = 1;
                        }
                        if (duto.e(context, iA2, dtshVar.c, dtsdVar4.e, dunzVar.b, dunzVar.k, false) != null) {
                            return eork.i(dtrcVar);
                        }
                    }
                }
                return dunzVar.j(list, i + 1, i2);
            }
        }, this.l);
    }

    public final ListenableFuture k(int i, String str, String str2) {
        Uri uriE = duto.e(this.a, i, str, str2, this.b, this.k, false);
        if (uriE != null) {
            return eork.i(uriE);
        }
        durt.g("%s: Failed to get file uri!", "SharedFileManager");
        dtov dtovVarA = dtox.a();
        dtovVarA.a = dtow.UNABLE_TO_CREATE_FILE_URI_ERROR;
        return eork.h(dtovVarA.a());
    }
}
