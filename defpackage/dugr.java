package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dugr {
    public final Context a;
    public final durk b;
    public final dtvq c;
    public final dugs d;
    public final dunz e;
    public final ecev f;
    public final ejwi g;
    public final Executor h;
    public final ejwi i;
    public final ejwi j;
    public final dtpi k;
    public final dvap l = new dvap();
    public final duag m;
    private final Executor n;

    public dugr(Context context, durk durkVar, dtvq dtvqVar, dugs dugsVar, dunz dunzVar, duag duagVar, ejwi ejwiVar, Executor executor, ejwi ejwiVar2, ecev ecevVar, ejwi ejwiVar3, dtpi dtpiVar, Executor executor2) {
        this.a = context;
        this.b = durkVar;
        this.c = dtvqVar;
        this.d = dugsVar;
        this.e = dunzVar;
        this.m = duagVar;
        this.g = ejwiVar;
        this.h = executor;
        this.n = executor2;
        this.i = ejwiVar2;
        this.f = ecevVar;
        this.j = ejwiVar3;
        this.k = dtpiVar;
    }

    public static void C(int i, durk durkVar, dtqy dtqyVar) {
        durkVar.m(i, dtqyVar.d, dtqyVar.f, dtqyVar.t, dtqyVar.u);
    }

    public static void D(durk durkVar, dtqy dtqyVar, dtqs dtqsVar, int i) {
        eoiw eoiwVar = (eoiw) eoix.a.createBuilder();
        eoiwVar.copyOnWrite();
        eoix eoixVar = (eoix) eoiwVar.instance;
        eoixVar.c = eokm.a(i);
        eoixVar.b |= 1;
        String str = dtqyVar.d;
        eoiwVar.copyOnWrite();
        eoix eoixVar2 = (eoix) eoiwVar.instance;
        str.getClass();
        eoixVar2.b |= 2;
        eoixVar2.d = str;
        int i2 = dtqyVar.f;
        eoiwVar.copyOnWrite();
        eoix eoixVar3 = (eoix) eoiwVar.instance;
        eoixVar3.b |= 4;
        eoixVar3.e = i2;
        long j = dtqyVar.t;
        eoiwVar.copyOnWrite();
        eoix eoixVar4 = (eoix) eoiwVar.instance;
        eoixVar4.b |= 128;
        eoixVar4.i = j;
        String str2 = dtqyVar.u;
        eoiwVar.copyOnWrite();
        eoix eoixVar5 = (eoix) eoiwVar.instance;
        str2.getClass();
        eoixVar5.b |= 256;
        eoixVar5.j = str2;
        String str3 = dtqsVar.c;
        eoiwVar.copyOnWrite();
        eoix eoixVar6 = (eoix) eoiwVar.instance;
        str3.getClass();
        eoixVar6.b |= 8;
        eoixVar6.f = str3;
        durkVar.e((eoix) eoiwVar.build());
    }

    public static ejwi a(dtqy dtqyVar, dtqy dtqyVar2) {
        if (dtqyVar2.t != dtqyVar.t) {
            return ejwi.j(eokz.NEW_BUILD_ID);
        }
        if (!dtqyVar2.u.equals(dtqyVar.u)) {
            return ejwi.j(eokz.NEW_VARIANT_ID);
        }
        if (dtqyVar2.f != dtqyVar.f) {
            return ejwi.j(eokz.NEW_VERSION_NUMBER);
        }
        if (!u(dtqyVar, dtqyVar2)) {
            return ejwi.j(eokz.DIFFERENT_FILES);
        }
        evqe evqeVar = dtqyVar2.h;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        evqe evqeVar2 = dtqyVar.h;
        if (evqeVar2 == null) {
            evqeVar2 = evqe.a;
        }
        if (!evqeVar.equals(evqeVar2)) {
            return ejwi.j(eokz.DIFFERENT_CUSTOM_METADATA);
        }
        if (dtqyVar2.l != dtqyVar.l) {
            return ejwi.j(eokz.DIFFERENT_STALE_LIFETIME);
        }
        if (dtqyVar2.m != dtqyVar.m) {
            return ejwi.j(eokz.DIFFERENT_EXPIRATION_DATE);
        }
        dtrk dtrkVar = dtqyVar2.n;
        if (dtrkVar == null) {
            dtrkVar = dtrk.a;
        }
        dtrk dtrkVar2 = dtqyVar.n;
        if (dtrkVar2 == null) {
            dtrkVar2 = dtrk.a;
        }
        if (!dtrkVar.equals(dtrkVar2)) {
            return ejwi.j(eokz.DIFFERENT_DOWNLOAD_CONDITIONS);
        }
        int iA = dtqw.a(dtqyVar2.k);
        if (iA == 0) {
            iA = 1;
        }
        int iA2 = dtqw.a(dtqyVar.k);
        if (iA2 == 0) {
            iA2 = 1;
        }
        if (iA != iA2) {
            return ejwi.j(eokz.DIFFERENT_ALLOWED_READERS);
        }
        int iA3 = dvao.a(dtqyVar2.s);
        if (iA3 == 0) {
            iA3 = 1;
        }
        int iA4 = dvao.a(dtqyVar.s);
        if (iA3 != (iA4 != 0 ? iA4 : 1)) {
            return ejwi.j(eokz.DIFFERENT_DOWNLOAD_POLICY);
        }
        feki fekiVar = dtqyVar2.w;
        if (fekiVar == null) {
            fekiVar = feki.a;
        }
        feki fekiVar2 = dtqyVar.w;
        if (fekiVar2 == null) {
            fekiVar2 = feki.a;
        }
        return !fekiVar.equals(fekiVar2) ? ejwi.j(eokz.DIFFERENT_EXPERIMENT_INFO) : ejud.a;
    }

    public static boolean u(dtqy dtqyVar, dtqy dtqyVar2) {
        return dtqyVar.p.equals(dtqyVar2.p);
    }

    public static boolean w(dtsh dtshVar, long j) {
        return j > dtshVar.f;
    }

    public static final eoir x(dtqy dtqyVar) {
        eoiq eoiqVar = (eoiq) eoir.a.createBuilder();
        String str = dtqyVar.d;
        eoiqVar.copyOnWrite();
        eoir eoirVar = (eoir) eoiqVar.instance;
        str.getClass();
        eoirVar.b |= 1;
        eoirVar.c = str;
        String str2 = dtqyVar.e;
        eoiqVar.copyOnWrite();
        eoir eoirVar2 = (eoir) eoiqVar.instance;
        str2.getClass();
        eoirVar2.b |= 4;
        eoirVar2.e = str2;
        int i = dtqyVar.f;
        eoiqVar.copyOnWrite();
        eoir eoirVar3 = (eoir) eoiqVar.instance;
        eoirVar3.b |= 2;
        eoirVar3.d = i;
        long j = dtqyVar.t;
        eoiqVar.copyOnWrite();
        eoir eoirVar4 = (eoir) eoiqVar.instance;
        eoirVar4.b |= 64;
        eoirVar4.i = j;
        String str3 = dtqyVar.u;
        eoiqVar.copyOnWrite();
        eoir eoirVar5 = (eoir) eoiqVar.instance;
        str3.getClass();
        eoirVar5.b |= 128;
        eoirVar5.j = str3;
        return (eoir) eoiqVar.build();
    }

    public static final void y(List list, dtrw dtrwVar) throws dtmi, dtox {
        durt.i("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", dtrwVar.c, dtrwVar.d);
        dtmi.d(list, "Failed to download file group %s", dtrwVar.c);
        durt.g("%s: An unknown error has occurred during download", "FileGroupManager");
        dtov dtovVarA = dtox.a();
        dtovVarA.a = dtow.UNKNOWN_ERROR;
        throw dtovVarA.a();
    }

    public final ListenableFuture A(final dtqy dtqyVar, final dtqs dtqsVar, final dtsd dtsdVar, final dtsh dtshVar, final int i) throws dutn {
        final String str = dtqsVar.o;
        final long j = dtqyVar.m;
        int iA = dtqw.a(dtsdVar.f);
        if (iA == 0) {
            iA = 1;
        }
        final Context context = this.a;
        final Uri uriE = duto.e(context, iA, dtshVar.c, dtqsVar.g, this.c, this.i, false);
        if (uriE == null) {
            durt.g("%s: Failed to get file uri!", "FileGroupManager");
            throw new dutn(28, "Failed to get local file uri");
        }
        final ecev ecevVar = this.f;
        return dvaq.e(eika.i(new eooy() { // from class: dutl
            @Override // defpackage.eooy
            public final ListenableFuture a() throws dutn, IOException {
                String message;
                message = "";
                Context context2 = context;
                ecev ecevVar2 = ecevVar;
                String str2 = str;
                Uri uri = uriE;
                dtqs dtqsVar2 = dtqsVar;
                dtqy dtqyVar2 = dtqyVar;
                int i2 = 0;
                try {
                    Uri uriC = duto.c(context2, str2);
                    InputStream inputStream = (InputStream) ecevVar2.c(uri, new echh());
                    try {
                        OutputStream outputStream = (OutputStream) ecevVar2.c(uriC, new echm());
                        try {
                            elec.a(inputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (ecfy unused) {
                    durt.i("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", dtqsVar2.c, dtqyVar2.d);
                    message = String.format("System limit exceeded for file %s, group %s", dtqsVar2.c, dtqyVar2.d);
                    i2 = 25;
                } catch (ecge unused2) {
                    durt.i("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", dtqsVar2.c, dtqyVar2.d);
                    message = String.format("Malformed blob Uri for file %s, group %s", dtqsVar2.c, dtqyVar2.d);
                    i2 = 17;
                } catch (ecgh e) {
                    message = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
                    durt.m("%s: Failed to share after download for file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", dtqsVar2.c, dtqyVar2.d, message);
                    message = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(message));
                    i2 = 24;
                } catch (IOException unused3) {
                    durt.i("%s: Failed to copy to the blobstore after download for file %s, file group %s", "AndroidSharingUtil", dtqsVar2.c, dtqyVar2.d);
                    message = String.format("Error while copying file %s, group %s, to the shared blob storage", dtqsVar2.c, dtqyVar2.d);
                    i2 = 22;
                }
                if (i2 == 0) {
                    return eorv.a;
                }
                throw new dutn(i2, message);
            }
        }, this.n)).g(new eooz() { // from class: dudx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final dugr dugrVar = this.a;
                final int i2 = i;
                final dtqy dtqyVar2 = dtqyVar;
                final dtqs dtqsVar2 = dtqsVar;
                dtsh dtshVar2 = dtshVar;
                final dtsd dtsdVar2 = dtsdVar;
                String str2 = str;
                final long j2 = j;
                return dugrVar.r(dugrVar.B(dtqyVar2, dtqsVar2, dtshVar2, dtsdVar2, str2, j2, i2), new eooz() { // from class: dudd
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        if (((Boolean) obj2).booleanValue() || i2 == 6) {
                            return eorv.a;
                        }
                        long j3 = j2;
                        dtsd dtsdVar3 = dtsdVar2;
                        dtqs dtqsVar3 = dtqsVar2;
                        return dugrVar.s(dtqyVar2, dtqsVar3, dtsdVar3, j3);
                    }
                });
            }
        }, this.h);
    }

    final ListenableFuture B(final dtqy dtqyVar, final dtqs dtqsVar, dtsh dtshVar, final dtsd dtsdVar, final String str, long j, final int i) {
        if (dtshVar.e && !w(dtshVar, j)) {
            D(this.b, dtqyVar, dtqsVar, i);
            return eork.i(true);
        }
        final long jMax = Math.max(j, dtshVar.f);
        final Context context = this.a;
        final ecev ecevVar = this.f;
        return r(eika.i(new eooy() { // from class: dutk
            @Override // defpackage.eooy
            public final ListenableFuture a() throws dutn, IOException {
                String message;
                message = "";
                Context context2 = context;
                String str2 = str;
                long j2 = jMax;
                ecev ecevVar2 = ecevVar;
                dtqs dtqsVar2 = dtqsVar;
                dtqy dtqyVar2 = dtqyVar;
                int i2 = 0;
                try {
                    int i3 = ecfh.a;
                    OutputStream outputStream = (OutputStream) ecevVar2.c(ecfg.a(String.valueOf(str2).concat(".lease"), context2.getPackageName(), j2), new echm());
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (ecfy unused) {
                    durt.i("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", dtqsVar2.c, dtqyVar2.d);
                    message = String.format("System limit exceeded for file %s, group %s", dtqsVar2.c, dtqyVar2.d);
                    i2 = 25;
                } catch (ecge unused2) {
                    durt.i("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", dtqsVar2.c, dtqyVar2.d);
                    message = String.format("Malformed lease Uri for file %s, group %s", dtqsVar2.c, dtqyVar2.d);
                    i2 = 18;
                } catch (ecgh e) {
                    message = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
                    durt.m("%s: Failed to share file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", dtqsVar2.c, dtqyVar2.d, message);
                    message = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(message));
                    i2 = 24;
                } catch (IOException unused3) {
                    durt.i("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", dtqsVar2.c, dtqyVar2.d);
                    message = String.format("Error while acquiring lease for file %s, group %s", dtqsVar2.c, dtqyVar2.d);
                    i2 = 20;
                }
                if (i2 == 0) {
                    return eorv.a;
                }
                throw new dutn(i2, message);
            }
        }, this.n), new eooz() { // from class: dubx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtsg dtsgVar = (dtsg) dtsh.a.createBuilder();
                dtru dtruVar = dtru.DOWNLOAD_COMPLETE;
                dtsgVar.copyOnWrite();
                dtsh dtshVar2 = (dtsh) dtsgVar.instance;
                dtshVar2.d = dtruVar.h;
                dtshVar2.b |= 2;
                dtsgVar.copyOnWrite();
                dtsh dtshVar3 = (dtsh) dtsgVar.instance;
                dtshVar3.b |= 1;
                String str2 = str;
                dtshVar3.c = "android_shared_".concat(String.valueOf(str2));
                dtsgVar.copyOnWrite();
                dtsh dtshVar4 = (dtsh) dtsgVar.instance;
                dtshVar4.b |= 4;
                dtshVar4.e = true;
                dtsgVar.copyOnWrite();
                dtsh dtshVar5 = (dtsh) dtsgVar.instance;
                dtshVar5.b |= 8;
                final long j2 = jMax;
                dtshVar5.f = j2;
                dtsgVar.copyOnWrite();
                dtsh dtshVar6 = (dtsh) dtsgVar.instance;
                str2.getClass();
                dtshVar6.b |= 16;
                dtshVar6.g = str2;
                dtsh dtshVar7 = (dtsh) dtsgVar.build();
                final dugr dugrVar = this.a;
                ListenableFuture listenableFutureH = dugrVar.e.c.h(dtsdVar, dtshVar7);
                final dtqs dtqsVar2 = dtqsVar;
                final dtqy dtqyVar2 = dtqyVar;
                final int i2 = i;
                return dugrVar.r(listenableFutureH, new eooz() { // from class: duem
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        dugr dugrVar2 = dugrVar;
                        dtqy dtqyVar3 = dtqyVar2;
                        dtqs dtqsVar3 = dtqsVar2;
                        if (!zBooleanValue) {
                            durt.i("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", dtqsVar3.c, dtqyVar3.d);
                            dugr.D(dugrVar2.b, dtqyVar3, dtqsVar3, 15);
                            return eork.i(false);
                        }
                        long j3 = j2;
                        int i3 = i2;
                        durk durkVar = dugrVar2.b;
                        eoiw eoiwVar = (eoiw) eoix.a.createBuilder();
                        eoiwVar.copyOnWrite();
                        eoix eoixVar = (eoix) eoiwVar.instance;
                        eoixVar.c = eokm.a(i3);
                        eoixVar.b |= 1;
                        String str3 = dtqyVar3.d;
                        eoiwVar.copyOnWrite();
                        eoix eoixVar2 = (eoix) eoiwVar.instance;
                        str3.getClass();
                        eoixVar2.b = 2 | eoixVar2.b;
                        eoixVar2.d = str3;
                        int i4 = dtqyVar3.f;
                        eoiwVar.copyOnWrite();
                        eoix eoixVar3 = (eoix) eoiwVar.instance;
                        eoixVar3.b |= 4;
                        eoixVar3.e = i4;
                        long j4 = dtqyVar3.t;
                        eoiwVar.copyOnWrite();
                        eoix eoixVar4 = (eoix) eoiwVar.instance;
                        eoixVar4.b |= 128;
                        eoixVar4.i = j4;
                        String str4 = dtqyVar3.u;
                        eoiwVar.copyOnWrite();
                        eoix eoixVar5 = (eoix) eoiwVar.instance;
                        str4.getClass();
                        eoixVar5.b |= 256;
                        eoixVar5.j = str4;
                        String str5 = dtqsVar3.c;
                        eoiwVar.copyOnWrite();
                        eoix eoixVar6 = (eoix) eoiwVar.instance;
                        str5.getClass();
                        eoixVar6.b |= 8;
                        eoixVar6.f = str5;
                        eoiwVar.copyOnWrite();
                        eoix eoixVar7 = (eoix) eoiwVar.instance;
                        eoixVar7.b |= 16;
                        eoixVar7.g = true;
                        eoiwVar.copyOnWrite();
                        eoix eoixVar8 = (eoix) eoiwVar.instance;
                        eoixVar8.b |= 32;
                        eoixVar8.h = j3;
                        durkVar.e((eoix) eoiwVar.build());
                        return eork.i(true);
                    }
                });
            }
        });
    }

    public final ekgp b(dtqy dtqyVar) {
        ekgi ekgiVar = new ekgi();
        Uri uriC = dutx.c(this.a, this.i, dtqyVar);
        for (dtqs dtqsVar : dtqyVar.p) {
            ekgiVar.i(dtqsVar, dutx.b(uriC, dtqsVar));
        }
        return ekgiVar.b();
    }

    final ekgp c(ekgp ekgpVar, ekgp ekgpVar2) {
        ekgi ekgiVar = new ekgi();
        ekqg ekqgVarListIterator = ekgpVar2.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            if (entry.getValue() != null && ekgpVar.containsKey(entry.getKey())) {
                Uri uri = (Uri) ekgpVar.get(entry.getKey());
                Uri uri2 = (Uri) entry.getValue();
                try {
                    if (this.f.h(uri)) {
                        try {
                            if (duuk.a(this.a, uri).toString().equals(uri2.toString())) {
                                ekgiVar.i((dtqs) entry.getKey(), uri);
                            } else {
                                durt.i("%s verifyIsolatedFileUris isolated file uri does match expected on-device uri! %s %s", "FileGroupManager", uri, uri2);
                            }
                        } catch (IOException unused) {
                            durt.i("%s verifyIsolatedFileUris unable to read symlink using isolated file uri! %s %s", "FileGroupManager", uri, uri2);
                        }
                    } else {
                        durt.i("%s verifyIsolatedFileUris isolated uri does not exist -- unable to verify it matches the expected target! %s %s", "FileGroupManager", uri, uri2);
                    }
                } catch (IOException unused2) {
                    durt.i("%s verifyIsolatedFileUris unable to check if isolated uri exists! %s %s", "FileGroupManager", uri, uri2);
                }
            }
        }
        return ekgiVar.b();
    }

    public final ListenableFuture d(dtqy dtqyVar) {
        if (!dtqyVar.o) {
            return eorv.a;
        }
        try {
            dutx.f(this.a, this.i, dtqyVar, this.f);
            final evtg evtgVar = dtqyVar.p;
            if (ekis.c(evtgVar, new ejwm() { // from class: ducj
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    int iA = dtqo.a(((dtqs) obj).m);
                    return iA != 0 && iA == 2;
                }
            }).g()) {
                return eork.h(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing"));
            }
            final ekgp ekgpVarB = b(dtqyVar);
            ListenableFuture listenableFutureK = k(dtqyVar);
            eooz eoozVar = new eooz() { // from class: ducl
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    dugr dugrVar = this.a;
                    ekgp ekgpVar = ekgpVarB;
                    ekgp ekgpVar2 = (ekgp) obj;
                    for (dtqs dtqsVar : evtgVar) {
                        try {
                            Uri uri = (Uri) ekgpVar.get(dtqsVar);
                            uri.getClass();
                            Uri uri2 = (Uri) ekgpVar2.get(dtqsVar);
                            uri2.getClass();
                            Uri uri3 = Uri.parse(uri.toString().substring(0, uri.toString().lastIndexOf("/")));
                            ecev ecevVar = dugrVar.f;
                            if (!ecevVar.h(uri3)) {
                                ecevVar.d(uri3);
                            }
                            duuk.b(dugrVar.a, uri, uri2);
                        } catch (IOException | NullPointerException e) {
                            dtov dtovVarA = dtox.a();
                            dtovVarA.a = dtow.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                            dtovVarA.b = "Unable to create symlink";
                            dtovVarA.c = e;
                            return eork.h(dtovVarA.a());
                        }
                    }
                    return eorv.a;
                }
            };
            Executor executor = this.h;
            ListenableFuture listenableFutureK2 = eika.k(listenableFutureK, eoozVar, executor);
            eika.l(listenableFutureK2, new dugo(this, dtqyVar), executor);
            return listenableFutureK2;
        } catch (IOException e) {
            dtov dtovVarA = dtox.a();
            dtovVarA.a = dtow.UNABLE_TO_REMOVE_SYMLINK_STRUCTURE;
            dtovVarA.b = "Unable to cleanup symlink structure";
            dtovVarA.c = e;
            return eork.h(dtovVarA.a());
        }
    }

    public final ListenableFuture e(final dtrw dtrwVar, final dtrk dtrkVar, final eooz eoozVar) {
        final AtomicReference atomicReference = new AtomicReference();
        return eika.f(r(g(dtrwVar, false), new eooz() { // from class: ducf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final dugr dugrVar = this.a;
                final dtrw dtrwVar2 = dtrwVar;
                final AtomicReference atomicReference2 = atomicReference;
                dtqy dtqyVar = (dtqy) obj;
                if (dtqyVar == null) {
                    return dugrVar.r(dugrVar.g(dtrwVar2, true), new eooz() { // from class: dudt
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            dtqy dtqyVar2 = (dtqy) obj2;
                            if (dtqyVar2 != null) {
                                atomicReference2.set(dtqyVar2);
                                return eork.i(dtqyVar2);
                            }
                            dtrw dtrwVar3 = dtrwVar2;
                            dtov dtovVarA = dtox.a();
                            dtovVarA.a = dtow.GROUP_NOT_FOUND_ERROR;
                            dtovVarA.b = "Nothing to download for file group: ".concat(String.valueOf(dtrwVar3.c));
                            return eork.h(dtovVarA.a());
                        }
                    });
                }
                atomicReference2.set(dtqyVar);
                dtqu dtquVar = dtqyVar.c;
                if (dtquVar == null) {
                    dtquVar = dtqu.a;
                }
                int i = dtquVar.g + 1;
                dtqx dtqxVar = (dtqx) dtqyVar.toBuilder();
                dtqt dtqtVar = (dtqt) dtquVar.toBuilder();
                dtqtVar.copyOnWrite();
                dtqu dtquVar2 = (dtqu) dtqtVar.instance;
                dtquVar2.b |= 16;
                dtquVar2.g = i;
                dtqxVar.copyOnWrite();
                dtqy dtqyVar2 = (dtqy) dtqxVar.instance;
                dtqu dtquVar3 = (dtqu) dtqtVar.build();
                dtquVar3.getClass();
                dtqyVar2.c = dtquVar3;
                dtqyVar2.b |= 1;
                final dtqy dtqyVar3 = (dtqy) dtqxVar.build();
                boolean z = (dtquVar.b & 8) != 0;
                final boolean z2 = !z;
                if (!z) {
                    long jA = dugrVar.m.a();
                    dtqu dtquVar4 = dtqyVar3.c;
                    if (dtquVar4 == null) {
                        dtquVar4 = dtqu.a;
                    }
                    dtqt dtqtVar2 = (dtqt) dtquVar4.toBuilder();
                    dtqtVar2.copyOnWrite();
                    dtqu dtquVar5 = (dtqu) dtqtVar2.instance;
                    dtquVar5.b |= 8;
                    dtquVar5.f = jA;
                    dtqu dtquVar6 = (dtqu) dtqtVar2.build();
                    dtqx dtqxVar2 = (dtqx) dtqyVar3.toBuilder();
                    dtqxVar2.copyOnWrite();
                    dtqy dtqyVar4 = (dtqy) dtqxVar2.instance;
                    dtquVar6.getClass();
                    dtqyVar4.c = dtquVar6;
                    dtqyVar4.b = 1 | dtqyVar4.b;
                    dtqyVar3 = (dtqy) dtqxVar2.build();
                }
                final ListenableFuture listenableFutureI = eork.i(dtqyVar3);
                if (!z) {
                    final ArrayList arrayList = new ArrayList();
                    Iterator<E> it = dtqyVar3.p.iterator();
                    while (it.hasNext()) {
                        arrayList.add(dugrVar.j((dtqs) it.next(), dtqyVar3));
                    }
                    dvas dvasVarC = dvat.c(arrayList);
                    Callable callable = new Callable() { // from class: dudi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                dtru dtruVar = (dtru) eork.q((ListenableFuture) it2.next());
                                if (dtruVar != dtru.NONE && dtruVar != dtru.SUBSCRIBED) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    };
                    Executor executor = dugrVar.h;
                    listenableFutureI = dvaq.e(dvasVarC.a(callable, executor)).f(new ejvr() { // from class: duef
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            dtqy dtqyVar5 = dtqyVar3;
                            dtqu dtquVar7 = dtqyVar5.c;
                            if (dtquVar7 == null) {
                                dtquVar7 = dtqu.a;
                            }
                            dtqt dtqtVar3 = (dtqt) dtquVar7.toBuilder();
                            dtqtVar3.copyOnWrite();
                            dtqu dtquVar8 = (dtqu) dtqtVar3.instance;
                            dtquVar8.b |= 64;
                            dtquVar8.i = zBooleanValue;
                            dtqu dtquVar9 = (dtqu) dtqtVar3.build();
                            dtqx dtqxVar3 = (dtqx) dtqyVar5.toBuilder();
                            dtqxVar3.copyOnWrite();
                            dtqy dtqyVar6 = (dtqy) dtqxVar3.instance;
                            dtquVar9.getClass();
                            dtqyVar6.c = dtquVar9;
                            dtqyVar6.b |= 1;
                            return (dtqy) dtqxVar3.build();
                        }
                    }, executor);
                }
                final eooz eoozVar2 = eoozVar;
                final dtrk dtrkVar2 = dtrkVar;
                dvaq dvaqVarE = dvaq.e(listenableFutureI);
                eooz eoozVar3 = new eooz() { // from class: ducm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        dtrv dtrvVar = (dtrv) dtrwVar2.toBuilder();
                        dtrvVar.copyOnWrite();
                        dtrw dtrwVar3 = (dtrw) dtrvVar.instance;
                        dtrwVar3.b |= 8;
                        dtrwVar3.f = false;
                        return dugrVar.d.l((dtrw) dtrvVar.build(), (dtqy) obj2);
                    }
                };
                Executor executor2 = dugrVar.h;
                return dvaq.e(dvaqVarE.g(eoozVar3, executor2).g(new eooz() { // from class: ducn
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        dugr dugrVar2 = dugrVar;
                        if (!zBooleanValue) {
                            dugrVar2.b.l(1036);
                            return eork.h(new IOException("Unable to update file group metadata"));
                        }
                        ListenableFuture listenableFuture = listenableFutureI;
                        if (z2) {
                            new duri(dugrVar2.b, 1).b((dtqy) eork.q(listenableFuture));
                        }
                        return eork.i((dtqy) eork.q(listenableFuture));
                    }
                }, executor2)).d(IOException.class, new eooz() { // from class: dudv
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        dtov dtovVarA = dtox.a();
                        dtovVarA.a = dtow.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                        dtovVarA.c = (IOException) obj2;
                        return eork.h(dtovVarA.a());
                    }
                }, executor2).g(new eooz() { // from class: dudw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ArrayList arrayList2;
                        ListenableFuture listenableFutureH;
                        dtrk dtrkVar3 = dtrkVar2;
                        final dtqy dtqyVar5 = (dtqy) obj2;
                        if (dtrkVar3 == null && (dtrkVar3 = dtqyVar5.n) == null) {
                            dtrkVar3 = dtrk.a;
                        }
                        final dtrk dtrkVar4 = dtrkVar3;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<E> it2 = dtqyVar5.p.iterator();
                        while (true) {
                            final dtrw dtrwVar3 = dtrwVar2;
                            final dugr dugrVar2 = dugrVar;
                            if (!it2.hasNext()) {
                                final ArrayList arrayList4 = arrayList3;
                                final eooz eoozVar4 = eoozVar2;
                                return dvat.a(arrayList4).b(new eooy() { // from class: duci
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        final dugr dugrVar3 = dugrVar2;
                                        final dtrw dtrwVar4 = dtrwVar3;
                                        final eooz eoozVar5 = eoozVar4;
                                        final List list = arrayList4;
                                        return dugrVar3.l.b(new eooy() { // from class: ducv
                                            @Override // defpackage.eooy
                                            public final ListenableFuture a() {
                                                final dugr dugrVar4 = dugrVar3;
                                                final dtrw dtrwVar5 = dtrwVar4;
                                                ListenableFuture listenableFutureI2 = eika.i(new eooy() { // from class: dubp
                                                    @Override // defpackage.eooy
                                                    public final ListenableFuture a() {
                                                        dugr dugrVar5 = dugrVar4;
                                                        dtrw dtrwVar6 = dtrwVar5;
                                                        final ListenableFuture listenableFutureG = dugrVar5.g(dtrwVar6, false);
                                                        final ListenableFuture listenableFutureG2 = dugrVar5.g(dtrwVar6, true);
                                                        return dvat.d(listenableFutureG, listenableFutureG2).b(new eooy() { // from class: duei
                                                            @Override // defpackage.eooy
                                                            public final ListenableFuture a() {
                                                                return eork.i(new duom((dtqy) eork.q(listenableFutureG), (dtqy) eork.q(listenableFutureG2)));
                                                            }
                                                        }, dugrVar5.h);
                                                    }
                                                }, dugrVar4.h);
                                                final eooz eoozVar6 = eoozVar5;
                                                final List list2 = list;
                                                return dugrVar4.r(listenableFutureI2, new eooz() { // from class: dugb
                                                    @Override // defpackage.eooz
                                                    public final ListenableFuture a(Object obj3) throws dtmi, dtox {
                                                        duoo duooVar = (duoo) obj3;
                                                        final dtqy dtqyVarB = duooVar.b() != null ? duooVar.b() : duooVar.a();
                                                        final List list3 = list2;
                                                        final dtrw dtrwVar6 = dtrwVar5;
                                                        if (dtqyVarB == null) {
                                                            dugr.y(list3, dtrwVar6);
                                                            return eork.h(new AssertionError("impossible error"));
                                                        }
                                                        eooz eoozVar7 = eoozVar6;
                                                        final dugr dugrVar5 = dugrVar4;
                                                        return dugrVar5.r(dugrVar5.t(dtrwVar6, dtqyVarB, true, eoozVar7, new duri(dugrVar5.b, 1)), new eooz() { // from class: dufp
                                                            @Override // defpackage.eooz
                                                            public final ListenableFuture a(Object obj4) throws dtmi, dtox {
                                                                dtrw dtrwVar7 = dtrwVar6;
                                                                if (((dugq) obj4) != dugq.DOWNLOADED) {
                                                                    dugr.y(list3, dtrwVar7);
                                                                }
                                                                dtqy dtqyVar6 = dtqyVarB;
                                                                dugr dugrVar6 = dugrVar5;
                                                                eoiq eoiqVar = (eoiq) eoir.a.createBuilder();
                                                                String str = dtrwVar7.c;
                                                                eoiqVar.copyOnWrite();
                                                                eoir eoirVar = (eoir) eoiqVar.instance;
                                                                str.getClass();
                                                                eoirVar.b |= 1;
                                                                eoirVar.c = str;
                                                                String str2 = dtrwVar7.d;
                                                                eoiqVar.copyOnWrite();
                                                                eoir eoirVar2 = (eoir) eoiqVar.instance;
                                                                str2.getClass();
                                                                eoirVar2.b |= 4;
                                                                eoirVar2.e = str2;
                                                                int i2 = dtqyVar6.f;
                                                                eoiqVar.copyOnWrite();
                                                                eoir eoirVar3 = (eoir) eoiqVar.instance;
                                                                eoirVar3.b |= 2;
                                                                eoirVar3.d = i2;
                                                                long j = dtqyVar6.t;
                                                                eoiqVar.copyOnWrite();
                                                                eoir eoirVar4 = (eoir) eoiqVar.instance;
                                                                eoirVar4.b |= 64;
                                                                eoirVar4.i = j;
                                                                String str3 = dtqyVar6.u;
                                                                eoiqVar.copyOnWrite();
                                                                eoir eoirVar5 = (eoir) eoiqVar.instance;
                                                                str3.getClass();
                                                                eoirVar5.b |= 128;
                                                                eoirVar5.j = str3;
                                                                dugrVar6.b.q(3, (eoir) eoiqVar.build(), 2);
                                                                return eork.i(dtqyVar6);
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        }, dugrVar3.h);
                                    }
                                }, dugrVar2.h);
                            }
                            final dtqs dtqsVar = (dtqs) it2.next();
                            if (!dutx.k(dtqsVar)) {
                                int iA = dtqw.a(dtqyVar5.k);
                                if (iA == 0) {
                                    iA = 1;
                                }
                                final dtsd dtsdVarA = duob.a(dtqsVar, iA);
                                if (Build.VERSION.SDK_INT >= 30) {
                                    final ListenableFuture listenableFutureL = dugrVar2.l(dtqyVar5, dtqsVar, dtsdVarA);
                                    dvaq dvaqVarE2 = dvaq.e(listenableFutureL);
                                    eooz eoozVar5 = new eooz() { // from class: ducx
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj3) {
                                            return dugrVar2.f((dtsh) obj3, dtqsVar, dtqyVar5);
                                        }
                                    };
                                    Executor executor3 = dugrVar2.h;
                                    listenableFutureH = dugrVar2.r(dvaqVarE2.g(eoozVar5, executor3).g(new eooz() { // from class: ducy
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj3) {
                                            int iA2;
                                            dugp dugpVar = (dugp) obj3;
                                            String strName = dugpVar.name();
                                            dtqs dtqsVar2 = dtqsVar;
                                            String str = dtqsVar2.c;
                                            dtqy dtqyVar6 = dtqyVar5;
                                            durt.d("%s: Android sharing CASE: %s for file %s, filegroup %s", "FileGroupManager", strName, str, dtqyVar6.d);
                                            dtsh dtshVar = (dtsh) eork.q(listenableFutureL);
                                            int iOrdinal = dugpVar.ordinal();
                                            dugr dugrVar3 = dugrVar2;
                                            dtsd dtsdVar = dtsdVarA;
                                            if (iOrdinal == 1) {
                                                return dugrVar3.r(dugrVar3.B(dtqyVar6, dtqsVar2, dtshVar, dtsdVar, dtshVar.g, dtqyVar6.m, 3), new eooz() { // from class: dudz
                                                    @Override // defpackage.eooz
                                                    public final ListenableFuture a(Object obj4) {
                                                        return eorv.a;
                                                    }
                                                });
                                            }
                                            if (iOrdinal == 3) {
                                                return dugrVar3.z(dtqyVar6, dtqsVar2, dtsdVar, dtshVar, 4);
                                            }
                                            if (iOrdinal == 4) {
                                                dtru dtruVarB = dtru.b(dtshVar.d);
                                                if (dtruVarB == null) {
                                                    dtruVarB = dtru.NONE;
                                                }
                                                if (dtruVarB == dtru.DOWNLOAD_COMPLETE && (iA2 = dtqo.a(dtqsVar2.m)) != 0 && iA2 == 2) {
                                                    return dugrVar3.A(dtqyVar6, dtqsVar2, dtsdVar, dtshVar, 6);
                                                }
                                            }
                                            durt.d("%s: File couldn't be shared before download %s, filegroup %s", "FileGroupManager", dtqsVar2.c, dtqyVar6.d);
                                            return eorv.a;
                                        }
                                    }, executor3).d(dutn.class, new eooz() { // from class: ducz
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj3) {
                                            dtqs dtqsVar2 = dtqsVar;
                                            String str = dtqsVar2.c;
                                            dtqy dtqyVar6 = dtqyVar5;
                                            durt.d("%s: File couldn't be shared before download %s, filegroup %s", "FileGroupManager", str, dtqyVar6.d);
                                            dugr.D(dugrVar2.b, dtqyVar6, dtqsVar2, ((dutn) obj3).a);
                                            return eorv.a;
                                        }
                                    }, executor3), new eooz() { // from class: duby
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj3) {
                                            final dugr dugrVar3 = dugrVar2;
                                            final dtqy dtqyVar6 = dtqyVar5;
                                            final dtqs dtqsVar2 = dtqsVar;
                                            final dtsd dtsdVar = dtsdVarA;
                                            dtrw dtrwVar4 = dtrwVar3;
                                            dtrk dtrkVar5 = dtrkVar4;
                                            try {
                                                dunz dunzVar = dugrVar3.e;
                                                int i2 = dtqyVar6.f;
                                                long j = dtqyVar6.t;
                                                String str = dtqyVar6.u;
                                                int i3 = dtqyVar6.q;
                                                evtg evtgVar = dtqyVar6.r;
                                                evqe evqeVar = dtqyVar6.i;
                                                if (evqeVar == null) {
                                                    evqeVar = evqe.a;
                                                }
                                                return dugrVar3.r(dunzVar.h(dtrwVar4, i2, j, str, dtqsVar2, dtsdVar, dtrkVar5, i3, evtgVar, evqeVar), new eooz() { // from class: dubz
                                                    @Override // defpackage.eooz
                                                    public final ListenableFuture a(Object obj4) {
                                                        final dugr dugrVar4 = dugrVar3;
                                                        final dtqy dtqyVar7 = dtqyVar6;
                                                        final dtqs dtqsVar3 = dtqsVar2;
                                                        final dtsd dtsdVar2 = dtsdVar;
                                                        return dvaq.e(dugrVar4.l(dtqyVar7, dtqsVar3, dtsdVar2)).g(new eooz() { // from class: dufr
                                                            @Override // defpackage.eooz
                                                            public final ListenableFuture a(Object obj5) {
                                                                final dtsh dtshVar = (dtsh) obj5;
                                                                dtru dtruVarB = dtru.b(dtshVar.d);
                                                                if (dtruVarB == null) {
                                                                    dtruVarB = dtru.NONE;
                                                                }
                                                                if (dtruVarB != dtru.DOWNLOAD_COMPLETE) {
                                                                    return eorv.a;
                                                                }
                                                                final dtsd dtsdVar3 = dtsdVar2;
                                                                final dtqs dtqsVar4 = dtqsVar3;
                                                                final dtqy dtqyVar8 = dtqyVar7;
                                                                final dugr dugrVar5 = dugrVar4;
                                                                dvaq dvaqVarE3 = dvaq.e(dugrVar5.f(dtshVar, dtqsVar4, dtqyVar8));
                                                                eooz eoozVar6 = new eooz() { // from class: ducu
                                                                    @Override // defpackage.eooz
                                                                    public final ListenableFuture a(Object obj6) {
                                                                        int iA2;
                                                                        dugp dugpVar = (dugp) obj6;
                                                                        String strName = dugpVar.name();
                                                                        final dtqs dtqsVar5 = dtqsVar4;
                                                                        String str2 = dtqsVar5.c;
                                                                        final dtqy dtqyVar9 = dtqyVar8;
                                                                        durt.d("%s: Android sharing CASE: %s for file %s, filegroup %s", "FileGroupManager", strName, str2, dtqyVar9.d);
                                                                        int iOrdinal = dugpVar.ordinal();
                                                                        final dugr dugrVar6 = dugrVar5;
                                                                        final dtsd dtsdVar4 = dtsdVar3;
                                                                        dtsh dtshVar2 = dtshVar;
                                                                        if (iOrdinal == 1) {
                                                                            final long j2 = dtqyVar9.m;
                                                                            if (!dugr.w(dtshVar2, j2)) {
                                                                                return eorv.a;
                                                                            }
                                                                            durt.d("%s: File already shared after downloaded but lease has to be updated for file %s, filegroup %s", "FileGroupManager", dtqsVar5.c, dtqyVar9.d);
                                                                            return dugrVar6.r(dugrVar6.B(dtqyVar9, dtqsVar5, dtshVar2, dtsdVar4, dtshVar2.g, j2, 27), new eooz() { // from class: duea
                                                                                @Override // defpackage.eooz
                                                                                public final ListenableFuture a(Object obj7) {
                                                                                    if (((Boolean) obj7).booleanValue()) {
                                                                                        return eorv.a;
                                                                                    }
                                                                                    long j3 = j2;
                                                                                    dtsd dtsdVar5 = dtsdVar4;
                                                                                    dtqs dtqsVar6 = dtqsVar5;
                                                                                    return dugrVar6.s(dtqyVar9, dtqsVar6, dtsdVar5, j3);
                                                                                }
                                                                            });
                                                                        }
                                                                        if (iOrdinal == 3) {
                                                                            return dugrVar6.z(dtqyVar9, dtqsVar5, dtsdVar4, dtshVar2, 5);
                                                                        }
                                                                        if (iOrdinal == 4 && (iA2 = dtqo.a(dtqsVar5.m)) != 0 && iA2 == 2) {
                                                                            return dugrVar6.A(dtqyVar9, dtqsVar5, dtsdVar4, dtshVar2, 7);
                                                                        }
                                                                        int iA3 = dtqo.a(dtqsVar5.m);
                                                                        if (iA3 != 0 && iA3 == 2) {
                                                                            dugr.D(dugrVar6.b, dtqyVar9, dtqsVar5, 16);
                                                                        }
                                                                        durt.d("%s: File couldn't be shared after download %s, filegroup %s", "FileGroupManager", dtqsVar5.c, dtqyVar9.d);
                                                                        return dugrVar6.s(dtqyVar9, dtqsVar5, dtsdVar4, dtqyVar9.m);
                                                                    }
                                                                };
                                                                Executor executor4 = dugrVar5.h;
                                                                return dvaqVarE3.g(eoozVar6, executor4).d(dutn.class, new eooz() { // from class: dudc
                                                                    @Override // defpackage.eooz
                                                                    public final ListenableFuture a(Object obj6) {
                                                                        int i4 = ((dutn) obj6).a;
                                                                        dugr dugrVar6 = dugrVar5;
                                                                        durk durkVar = dugrVar6.b;
                                                                        dtqy dtqyVar9 = dtqyVar8;
                                                                        dtqs dtqsVar5 = dtqsVar4;
                                                                        dugr.D(durkVar, dtqyVar9, dtqsVar5, i4);
                                                                        durt.d("%s: File couldn't be shared after download %s, filegroup %s", "FileGroupManager", dtqsVar5.c, dtqyVar9.d);
                                                                        return dugrVar6.s(dtqyVar9, dtqsVar5, dtsdVar3, dtqyVar9.m);
                                                                    }
                                                                }, executor4);
                                                            }
                                                        }, eoqg.a);
                                                    }
                                                });
                                            } catch (RuntimeException e) {
                                                dtov dtovVarA = dtox.a();
                                                dtovVarA.a = dtow.UNKNOWN_ERROR;
                                                dtovVarA.c = e;
                                                return eork.h(dtovVarA.a());
                                            }
                                        }
                                    });
                                    arrayList2 = arrayList3;
                                } else {
                                    try {
                                        dunz dunzVar = dugrVar2.e;
                                        int i2 = dtqyVar5.f;
                                        arrayList2 = arrayList3;
                                        try {
                                            long j = dtqyVar5.t;
                                            String str = dtqyVar5.u;
                                            int i3 = dtqyVar5.q;
                                            evtg evtgVar = dtqyVar5.r;
                                            evqe evqeVar = dtqyVar5.i;
                                            if (evqeVar == null) {
                                                evqeVar = evqe.a;
                                            }
                                            listenableFutureH = dunzVar.h(dtrwVar3, i2, j, str, dtqsVar, dtsdVarA, dtrkVar4, i3, evtgVar, evqeVar);
                                        } catch (RuntimeException e) {
                                            e = e;
                                            dtov dtovVarA = dtox.a();
                                            dtovVarA.a = dtow.UNKNOWN_ERROR;
                                            dtovVarA.c = e;
                                            listenableFutureH = eork.h(dtovVarA.a());
                                            arrayList2.add(listenableFutureH);
                                            arrayList3 = arrayList2;
                                        }
                                    } catch (RuntimeException e2) {
                                        e = e2;
                                        arrayList2 = arrayList3;
                                    }
                                }
                                arrayList2.add(listenableFutureH);
                                arrayList3 = arrayList2;
                            }
                        }
                    }
                }, executor2);
            }
        }), Exception.class, new eooz() { // from class: ducg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                final dtqy dtqyVar = (dtqy) atomicReference.get();
                if (dtqyVar == null) {
                    dtqyVar = dtqy.a;
                }
                final dtrw dtrwVar2 = dtrwVar;
                final dugr dugrVar = this.a;
                boolean z = exc instanceof dtox;
                ListenableFuture listenableFutureR = eorv.a;
                if (z) {
                    final dtox dtoxVar = (dtox) exc;
                    durt.c("%s: Logging DownloadException, resultCode = %s", "FileGroupManager", dtoxVar.a);
                    listenableFutureR = dugrVar.r(listenableFutureR, new eooz() { // from class: dudq
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            dugr dugrVar2 = dugrVar;
                            dtrw dtrwVar3 = dtrwVar2;
                            dtox dtoxVar2 = dtoxVar;
                            dtqy dtqyVar2 = dtqyVar;
                            return dugrVar2.n(dtrwVar3, dtoxVar2, dtqyVar2.t, dtqyVar2.u);
                        }
                    });
                } else if (exc instanceof dtmi) {
                    durt.b("%s: Logging AggregateException", "FileGroupManager");
                    ekgb ekgbVar = ((dtmi) exc).a;
                    int i = ((ekoe) ekgbVar).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        Throwable th = (Throwable) ekgbVar.get(i2);
                        if (th instanceof dtox) {
                            final dtox dtoxVar2 = (dtox) th;
                            listenableFutureR = dugrVar.r(listenableFutureR, new eooz() { // from class: dudr
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    dugr dugrVar2 = dugrVar;
                                    dtrw dtrwVar3 = dtrwVar2;
                                    dtox dtoxVar3 = dtoxVar2;
                                    dtqy dtqyVar2 = dtqyVar;
                                    return dugrVar2.n(dtrwVar3, dtoxVar3, dtqyVar2.t, dtqyVar2.u);
                                }
                            });
                        } else {
                            durt.g("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                        }
                    }
                }
                return dugrVar.r(listenableFutureR, new eooz() { // from class: duds
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) throws Exception {
                        throw exc;
                    }
                });
            }
        }, this.h);
    }

    public final ListenableFuture f(dtsh dtshVar, final dtqs dtqsVar, final dtqy dtqyVar) {
        if (dtshVar.e) {
            return eork.i(dugp.FILE_ALREADY_SHARED);
        }
        if (dtqsVar.o.isEmpty()) {
            return eork.i(dugp.FILE_SHARING_CHECKSUM_NOT_PROVIDED);
        }
        final Context context = this.a;
        final String str = dtqsVar.o;
        final ecev ecevVar = this.f;
        return q(eika.i(new eooy() { // from class: dutm
            /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
            @Override // defpackage.eooy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a() throws defpackage.dutn {
                /*
                    r12 = this;
                    java.lang.String r0 = ""
                    java.lang.String r1 = "AndroidSharingUtil"
                    android.content.Context r2 = r1
                    java.lang.String r3 = r2
                    ecev r4 = r3
                    dtqs r5 = r4
                    dtqy r6 = r5
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    android.net.Uri r2 = defpackage.duto.c(r2, r3)     // Catch: java.io.IOException -> L1c defpackage.ecge -> L40 defpackage.ecgh -> L67
                    boolean r1 = r4.h(r2)     // Catch: java.io.IOException -> L1c defpackage.ecge -> L40 defpackage.ecgh -> L67
                    goto L98
                L1c:
                    java.lang.String r0 = r5.c
                    java.lang.String r2 = r6.d
                    java.lang.Object[] r3 = new java.lang.Object[r7]
                    r3[r10] = r1
                    r3[r9] = r0
                    r3[r8] = r2
                    java.lang.String r0 = "%s: Failed to check existence in the shared storage for file %s, file group %s"
                    defpackage.durt.i(r0, r3)
                    java.lang.String r0 = r5.c
                    java.lang.String r1 = r6.d
                    java.lang.Object[] r2 = new java.lang.Object[r8]
                    r2[r10] = r0
                    r2[r9] = r1
                    java.lang.String r0 = "Error while checking if file %s, group %s, exists in the shared blob storage."
                    java.lang.String r0 = java.lang.String.format(r0, r2)
                    r1 = 19
                    goto L63
                L40:
                    java.lang.String r0 = r5.c
                    java.lang.String r2 = r6.d
                    java.lang.Object[] r3 = new java.lang.Object[r7]
                    r3[r10] = r1
                    r3[r9] = r0
                    r3[r8] = r2
                    java.lang.String r0 = "%s: Malformed lease uri file %s, file group %s"
                    defpackage.durt.i(r0, r3)
                    java.lang.String r0 = r5.c
                    java.lang.String r1 = r6.d
                    java.lang.Object[] r2 = new java.lang.Object[r8]
                    r2[r10] = r0
                    r2[r9] = r1
                    java.lang.String r0 = "Malformed blob Uri for file %s, group %s"
                    java.lang.String r0 = java.lang.String.format(r0, r2)
                    r1 = 17
                L63:
                    r11 = r10
                    r10 = r1
                    r1 = r11
                    goto L98
                L67:
                    r2 = move-exception
                    java.lang.String r3 = r2.getMessage()
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L73
                    goto L77
                L73:
                    java.lang.String r0 = r2.getMessage()
                L77:
                    java.lang.String r2 = r5.c
                    java.lang.String r3 = r6.d
                    r4 = 4
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    r4[r10] = r1
                    r4[r9] = r2
                    r4[r8] = r3
                    r4[r7] = r0
                    java.lang.String r1 = "%s: Failed to share for file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\""
                    defpackage.durt.m(r1, r4)
                    java.lang.String r1 = "UnsupportedFileStorageOperation was thrown: "
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r0 = r1.concat(r0)
                    r1 = 24
                    goto L63
                L98:
                    if (r10 != 0) goto La3
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    com.google.common.util.concurrent.ListenableFuture r0 = defpackage.eork.i(r0)
                    return r0
                La3:
                    dutn r1 = new dutn
                    r1.<init>(r10, r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dutm.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.n), new ejvr() { // from class: dufu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((Boolean) obj).booleanValue() ? dugp.FILE_ALREADY_EXISTS_IN_ANDROID_SHARED_STORAGE : dugp.FILE_NOT_SHARED_IN_ANDROID_SHARED_STORAGE;
            }
        });
    }

    public final ListenableFuture g(dtrw dtrwVar, boolean z) {
        dtrv dtrvVar = (dtrv) dtrwVar.toBuilder();
        dtrvVar.copyOnWrite();
        dtrw dtrwVar2 = (dtrw) dtrvVar.instance;
        dtrwVar2.b |= 8;
        dtrwVar2.f = z;
        return this.d.g((dtrw) dtrvVar.build());
    }

    public final ListenableFuture h(dtqy dtqyVar) {
        return i(dtqyVar, false, false, 0, dtqyVar.p.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture i(final dtqy dtqyVar, final boolean z, final boolean z2, final int i, final int i2) {
        if (i >= i2) {
            return z ? eork.i(dugq.FAILED) : z2 ? eork.i(dugq.PENDING) : eork.i(dugq.DOWNLOADED);
        }
        final dtqs dtqsVar = (dtqs) dtqyVar.p.get(i);
        return dutx.k(dtqsVar) ? i(dtqyVar, z, z2, i + 1, i2) : dvaq.e(j(dtqsVar, dtqyVar)).g(new eooz() { // from class: duge
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dugr dugrVar = this.a;
                dtqy dtqyVar2 = dtqyVar;
                boolean z3 = z;
                boolean z4 = z2;
                int i3 = i + 1;
                dtqs dtqsVar2 = dtqsVar;
                int i4 = i2;
                dtru dtruVar = (dtru) obj;
                if (dtruVar == dtru.DOWNLOAD_COMPLETE) {
                    durt.d("%s: File %s downloaded for group: %s", "FileGroupManager", dtqsVar2.c, dtqyVar2.d);
                    return dugrVar.i(dtqyVar2, z3, z4, i3, i4);
                }
                if (dtruVar == dtru.SUBSCRIBED || dtruVar == dtru.DOWNLOAD_IN_PROGRESS) {
                    durt.d("%s: File %s not downloaded for group: %s", "FileGroupManager", dtqsVar2.c, dtqyVar2.d);
                    return dugrVar.i(dtqyVar2, z3, true, i3, i4);
                }
                durt.d("%s: File %s not downloaded for group: %s", "FileGroupManager", dtqsVar2.c, dtqyVar2.d);
                return dugrVar.i(dtqyVar2, true, z4, i3, i4);
            }
        }, this.h);
    }

    public final ListenableFuture j(dtqs dtqsVar, final dtqy dtqyVar) {
        int iA = dtqw.a(dtqyVar.k);
        if (iA == 0) {
            iA = 1;
        }
        return dvaq.e(this.e.d(duob.a(dtqsVar, iA))).d(duoa.class, new eooz() { // from class: ducb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                durt.h("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", dtqyVar.d);
                this.a.c.a();
                return eork.i(dtru.NONE);
            }
        }, this.h);
    }

    final ListenableFuture k(dtqy dtqyVar) {
        final ekgi ekgiVar = new ekgi();
        ekgi ekgiVar2 = new ekgi();
        for (dtqs dtqsVar : dtqyVar.p) {
            if (dutx.k(dtqsVar)) {
                ekgiVar.i(dtqsVar, Uri.parse(dtqsVar.d));
            } else {
                int iA = dtqw.a(dtqyVar.k);
                if (iA == 0) {
                    iA = 1;
                }
                ekgiVar2.i(dtqsVar, duob.a(dtqsVar, iA));
            }
        }
        final ekgp ekgpVarB = ekgiVar2.b();
        return dvaq.e(this.e.f(ekhx.o(ekgpVarB.values()))).f(new ejvr() { // from class: dufw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgp ekgpVar = (ekgp) obj;
                ekqg ekqgVarListIterator = ekgpVarB.entrySet().listIterator();
                while (true) {
                    ekgi ekgiVar3 = ekgiVar;
                    if (!ekqgVarListIterator.hasNext()) {
                        return ekgiVar3.b();
                    }
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    dtsd dtsdVar = (dtsd) entry.getValue();
                    if (dtsdVar != null && ekgpVar.containsKey(dtsdVar)) {
                        ekgiVar3.i((dtqs) entry.getKey(), (Uri) ekgpVar.get(dtsdVar));
                    }
                }
            }
        }, this.h);
    }

    public final ListenableFuture l(final dtqy dtqyVar, final dtqs dtqsVar, final dtsd dtsdVar) {
        return eika.f(this.e.g(dtsdVar), duoa.class, new eooz() { // from class: dufk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                durt.h("%s: Shared file not found, newFileKey = %s", "FileGroupManager", dtsdVar);
                dugr dugrVar = this.a;
                dugrVar.c.a();
                dugr.D(dugrVar.b, dtqyVar, dtqsVar, 26);
                return eork.h((duoa) obj);
            }
        }, this.h);
    }

    public final ListenableFuture m(final eooz eoozVar) {
        final ArrayList arrayList = new ArrayList();
        return r(this.d.d(), new eooz() { // from class: dufq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Iterator it = ((List) obj).iterator();
                while (true) {
                    List list = arrayList;
                    dugr dugrVar = this.a;
                    if (!it.hasNext()) {
                        return dvat.a(list).a(new Callable() { // from class: dufo
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }, dugrVar.h);
                    }
                    final eooz eoozVar2 = eoozVar;
                    final dtrw dtrwVar = (dtrw) it.next();
                    list.add(dugrVar.r(dugrVar.d.g(dtrwVar), new eooz() { // from class: dufn
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            dtqy dtqyVar = (dtqy) obj2;
                            if (dtqyVar == null) {
                                return eorv.a;
                            }
                            return eoozVar2.a(new duol(dtrwVar, dtqyVar));
                        }
                    }));
                }
            }
        });
    }

    public final ListenableFuture n(dtrw dtrwVar, final dtox dtoxVar, long j, String str) {
        final eoiq eoiqVar = (eoiq) eoir.a.createBuilder();
        String str2 = dtrwVar.c;
        eoiqVar.copyOnWrite();
        eoir eoirVar = (eoir) eoiqVar.instance;
        str2.getClass();
        eoirVar.b |= 1;
        eoirVar.c = str2;
        String str3 = dtrwVar.d;
        eoiqVar.copyOnWrite();
        eoir eoirVar2 = (eoir) eoiqVar.instance;
        str3.getClass();
        eoirVar2.b |= 4;
        eoirVar2.e = str3;
        eoiqVar.copyOnWrite();
        eoir eoirVar3 = (eoir) eoiqVar.instance;
        eoirVar3.b |= 64;
        eoirVar3.i = j;
        eoiqVar.copyOnWrite();
        eoir eoirVar4 = (eoir) eoiqVar.instance;
        str.getClass();
        eoirVar4.b |= 128;
        eoirVar4.j = str;
        dtrv dtrvVar = (dtrv) dtrwVar.toBuilder();
        dtrvVar.copyOnWrite();
        dtrw dtrwVar2 = (dtrw) dtrvVar.instance;
        dtrwVar2.b |= 8;
        dtrwVar2.f = false;
        return r(this.d.g((dtrw) dtrvVar.build()), new eooz() { // from class: dudu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eoiq eoiqVar2 = eoiqVar;
                dtqy dtqyVar = (dtqy) obj;
                if (dtqyVar != null) {
                    int i = dtqyVar.f;
                    eoiqVar2.copyOnWrite();
                    eoir eoirVar5 = (eoir) eoiqVar2.instance;
                    eoir eoirVar6 = eoir.a;
                    eoirVar5.b |= 2;
                    eoirVar5.d = i;
                }
                dtox dtoxVar2 = dtoxVar;
                this.a.b.q(eokq.b(dtoxVar2.a.aF), (eoir) eoiqVar2.build(), eoko.a(dtoxVar2.b - 1));
                return eorv.a;
            }
        });
    }

    public final ListenableFuture o(dtqy dtqyVar) {
        return p(dtqyVar, 0, dtqyVar.p.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture p(final dtqy dtqyVar, final int i, final int i2) {
        if (i >= i2) {
            return eork.i(true);
        }
        dtqs dtqsVar = (dtqs) dtqyVar.p.get(i);
        if (dutx.k(dtqsVar)) {
            return p(dtqyVar, i + 1, i2);
        }
        int iA = dtqw.a(dtqyVar.k);
        final dtsd dtsdVarA = duob.a(dtqsVar, iA != 0 ? iA : 1);
        final dunz dunzVar = this.e;
        return r(eika.k(dunzVar.c.e(dtsdVarA), new eooz() { // from class: dumt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((dtsh) obj) != null) {
                    return eork.i(true);
                }
                final dtsd dtsdVar = dtsdVarA;
                dunz dunzVar2 = dunzVar;
                SharedPreferences sharedPreferencesA = duuj.a(dunzVar2.a, "gms_icing_mdd_shared_file_manager_metadata", dunzVar2.k);
                long j = sharedPreferencesA.getLong("next_file_name_v2", System.currentTimeMillis());
                if (!sharedPreferencesA.edit().putLong("next_file_name_v2", 1 + j).commit()) {
                    durt.h("%s: Unable to update file name %s", "SharedFileManager", dtsdVar);
                    return eork.i(false);
                }
                String strU = a.u(j, "datadownloadfile_");
                dtsg dtsgVar = (dtsg) dtsh.a.createBuilder();
                dtru dtruVar = dtru.SUBSCRIBED;
                dtsgVar.copyOnWrite();
                dtsh dtshVar = (dtsh) dtsgVar.instance;
                dtshVar.d = dtruVar.h;
                dtshVar.b |= 2;
                dtsgVar.copyOnWrite();
                dtsh dtshVar2 = (dtsh) dtsgVar.instance;
                dtshVar2.b = 1 | dtshVar2.b;
                dtshVar2.c = strU;
                return eika.k(dunzVar2.c.h(dtsdVar, (dtsh) dtsgVar.build()), new eooz() { // from class: dunv
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return eork.i(true);
                        }
                        durt.h("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", dtsdVar);
                        return eork.i(false);
                    }
                }, dunzVar2.l);
            }
        }, dunzVar.l), new eooz() { // from class: ducp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                dtqy dtqyVar2 = dtqyVar;
                if (!zBooleanValue) {
                    durt.h("%s: Subscribing to file failed for group: %s", "FileGroupManager", dtqyVar2.d);
                    return eork.i(false);
                }
                return this.a.p(dtqyVar2, i + 1, i2);
            }
        });
    }

    public final ListenableFuture q(ListenableFuture listenableFuture, ejvr ejvrVar) {
        return eika.j(listenableFuture, ejvrVar, this.h);
    }

    public final ListenableFuture r(ListenableFuture listenableFuture, eooz eoozVar) {
        return eika.k(listenableFuture, eoozVar, this.h);
    }

    public final ListenableFuture s(final dtqy dtqyVar, final dtqs dtqsVar, final dtsd dtsdVar, final long j) {
        final dunz dunzVar = this.e;
        return r(eika.k(dunzVar.g(dtsdVar), new eooz() { // from class: dumx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtsh dtshVar = (dtsh) obj;
                long j2 = dtshVar.f;
                long j3 = j;
                if (j3 <= j2) {
                    return eork.i(true);
                }
                dtsd dtsdVar2 = dtsdVar;
                dunz dunzVar2 = dunzVar;
                dtsg dtsgVar = (dtsg) dtshVar.toBuilder();
                dtsgVar.copyOnWrite();
                dtsh dtshVar2 = (dtsh) dtsgVar.instance;
                dtshVar2.b |= 8;
                dtshVar2.f = j3;
                return dunzVar2.c.h(dtsdVar2, (dtsh) dtsgVar.build());
            }
        }, dunzVar.l), new eooz() { // from class: dubq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    dtqy dtqyVar2 = dtqyVar;
                    dtqs dtqsVar2 = dtqsVar;
                    dugr dugrVar = this.a;
                    durt.i("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", dtqsVar2.c, dtqyVar2.d);
                    dugr.D(dugrVar.b, dtqyVar2, dtqsVar2, 14);
                }
                return eorv.a;
            }
        });
    }

    final ListenableFuture t(dtrw dtrwVar, final dtqy dtqyVar, final boolean z, final eooz eoozVar, final duri duriVar) {
        durt.d("%s: Verify group: %s, remove pending version: %s", "FileGroupManager", dtqyVar.d, Boolean.valueOf(z));
        dtrv dtrvVar = (dtrv) dtrwVar.toBuilder();
        dtrvVar.copyOnWrite();
        dtrw dtrwVar2 = (dtrw) dtrvVar.instance;
        dtrwVar2.b |= 8;
        dtrwVar2.f = true;
        final dtrw dtrwVar3 = (dtrw) dtrvVar.build();
        dtrv dtrvVar2 = (dtrv) dtrwVar.toBuilder();
        dtrvVar2.copyOnWrite();
        dtrw dtrwVar4 = (dtrw) dtrvVar2.instance;
        dtrwVar4.b |= 8;
        dtrwVar4.f = false;
        final dtrw dtrwVar5 = (dtrw) dtrvVar2.build();
        dtqu dtquVar = dtqyVar.c;
        if (dtquVar == null) {
            dtquVar = dtqu.a;
        }
        final boolean z2 = (dtquVar.b & 4) != 0;
        long jA = this.m.a();
        dtqu dtquVar2 = dtqyVar.c;
        if (dtquVar2 == null) {
            dtquVar2 = dtqu.a;
        }
        dtqt dtqtVar = (dtqt) dtquVar2.toBuilder();
        dtqtVar.copyOnWrite();
        dtqu dtquVar3 = (dtqu) dtqtVar.instance;
        dtquVar3.b |= 4;
        dtquVar3.e = jA;
        dtqu dtquVar4 = (dtqu) dtqtVar.build();
        dtqx dtqxVar = (dtqx) dtqyVar.toBuilder();
        dtqxVar.copyOnWrite();
        dtqy dtqyVar2 = (dtqy) dtqxVar.instance;
        dtquVar4.getClass();
        dtqyVar2.c = dtquVar4;
        dtqyVar2.b |= 1;
        final dtqy dtqyVar3 = (dtqy) dtqxVar.build();
        dvaq dvaqVarE = dvaq.e(h(dtqyVar));
        eooz eoozVar2 = new eooz() { // from class: duew
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duri duriVar2 = duriVar;
                final dtqy dtqyVar4 = dtqyVar;
                dugq dugqVar = (dugq) obj;
                dugq dugqVar2 = dugq.FAILED;
                if (dugqVar == dugqVar2) {
                    duriVar2.a(dtqyVar4);
                    return eork.i(dugqVar2);
                }
                dugq dugqVar3 = dugq.PENDING;
                if (dugqVar == dugqVar3) {
                    if (duriVar2.b - 1 != 0) {
                        duriVar2.c(1112, dtqyVar4);
                    } else {
                        duriVar2.c(1007, dtqyVar4);
                    }
                    return eork.i(dugqVar3);
                }
                final boolean z3 = z2;
                final dtqy dtqyVar5 = dtqyVar3;
                final dtrw dtrwVar6 = dtrwVar3;
                eooz eoozVar3 = eoozVar;
                final boolean z4 = z;
                final dtrw dtrwVar7 = dtrwVar5;
                final dugr dugrVar = this.a;
                ejwl.a(dugqVar == dugq.DOWNLOADED);
                dvaq dvaqVarE2 = dvaq.e(eoozVar3.a(new duol(dtrwVar7, dtqyVar4)));
                eooz eoozVar4 = new eooz() { // from class: dudy
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        dtng dtngVar = (dtng) obj2;
                        if (dtngVar == dtng.SUCCESS) {
                            return eorv.a;
                        }
                        final dtrw dtrwVar8 = dtrwVar7;
                        boolean z5 = z4;
                        dtqy dtqyVar6 = dtqyVar4;
                        duri duriVar3 = duriVar2;
                        final dugr dugrVar2 = dugrVar;
                        duriVar3.a(dtqyVar6);
                        ListenableFuture listenableFutureI = eork.i(true);
                        if (z5 && dtngVar != dtng.FAILURE_KEEP_PENDING) {
                            listenableFutureI = dugrVar2.d.i(dtrwVar8);
                        }
                        return dugrVar2.r(listenableFutureI, new eooz() { // from class: duek
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                if (((Boolean) obj3).booleanValue()) {
                                    dtov dtovVarA = dtox.a();
                                    dtow dtowVar = dtow.CUSTOM_FILEGROUP_VALIDATION_FAILED;
                                    dtovVarA.a = dtowVar;
                                    dtovVarA.b = dtowVar.name();
                                    return eork.h(dtovVarA.a());
                                }
                                dtrw dtrwVar9 = dtrwVar8;
                                dugr dugrVar3 = dugrVar2;
                                durt.i("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", dtrwVar9.c, dtrwVar9.e);
                                dugrVar3.b.l(1036);
                                return eork.h(new IOException("Failed to remove pending group: ".concat(String.valueOf(dtrwVar9.c))));
                            }
                        });
                    }
                };
                Executor executor = dugrVar.h;
                return dvaqVarE2.g(eoozVar4, executor).g(new eooz() { // from class: dueb
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        dtqy dtqyVar6 = dtqyVar4;
                        return dutx.j(dtqyVar6) ? dugrVar.d(dtqyVar6) : eorv.a;
                    }
                }, executor).g(new eooz() { // from class: duec
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final dugr dugrVar2 = dugrVar;
                        dugs dugsVar = dugrVar2.d;
                        final dtrw dtrwVar8 = dtrwVar6;
                        dvaq dvaqVarE3 = dvaq.e(dugsVar.g(dtrwVar8));
                        ejvr ejvrVar = new ejvr() { // from class: dugl
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return ejwi.i((dtqy) obj3);
                            }
                        };
                        Executor executor2 = dugrVar2.h;
                        final dvaq dvaqVarF = dvaqVarE3.f(ejvrVar, executor2);
                        final dtqy dtqyVar6 = dtqyVar5;
                        return dvaqVarF.g(new eooz() { // from class: dugm
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return dugrVar2.d.l(dtrwVar8, dtqyVar6);
                            }
                        }, executor2).g(new eooz() { // from class: dubi
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                if (((Boolean) obj3).booleanValue()) {
                                    return dvaqVarF;
                                }
                                dtrw dtrwVar9 = dtrwVar8;
                                dugrVar2.b.l(1036);
                                return eork.h(new IOException("Failed to write updated group: ".concat(String.valueOf(dtrwVar9.c))));
                            }
                        }, executor2);
                    }
                }, executor).g(new eooz() { // from class: dued
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final ejwi ejwiVar = (ejwi) obj2;
                        if (!z4) {
                            return eork.i(ejwiVar);
                        }
                        dtrw dtrwVar8 = dtrwVar7;
                        final dugr dugrVar2 = dugrVar;
                        return dugrVar2.q(dugrVar2.d.i(dtrwVar8), new ejvr() { // from class: dueh
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                if (!((Boolean) obj3).booleanValue()) {
                                    dugrVar2.b.l(1036);
                                }
                                return ejwiVar;
                            }
                        });
                    }
                }, executor).g(new eooz() { // from class: duee
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ejwi ejwiVar = (ejwi) obj2;
                        if (!ejwiVar.g()) {
                            return eorv.a;
                        }
                        final dugr dugrVar2 = dugrVar;
                        return dugrVar2.r(dugrVar2.d.a((dtqy) ejwiVar.c()), new eooz() { // from class: dufm
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                if (!((Boolean) obj3).booleanValue()) {
                                    dugrVar2.b.l(1036);
                                }
                                return eorv.a;
                            }
                        });
                    }
                }, executor).f(new ejvr() { // from class: dueg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        duri duriVar3 = duriVar2;
                        if (!z3 || duriVar3.b == 2) {
                            dtqy dtqyVar6 = dtqyVar5;
                            int i = duriVar3.b;
                            if (i - 1 != 0) {
                                duriVar3.c(1114, dtqyVar6);
                            } else {
                                duriVar3.c(1009, dtqyVar6);
                                if (i == 1) {
                                    eoiq eoiqVar = (eoiq) eoir.a.createBuilder();
                                    String str = dtqyVar6.e;
                                    eoiqVar.copyOnWrite();
                                    eoir eoirVar = (eoir) eoiqVar.instance;
                                    str.getClass();
                                    eoirVar.b |= 4;
                                    eoirVar.e = str;
                                    String str2 = dtqyVar6.d;
                                    eoiqVar.copyOnWrite();
                                    eoir eoirVar2 = (eoir) eoiqVar.instance;
                                    str2.getClass();
                                    eoirVar2.b |= 1;
                                    eoirVar2.c = str2;
                                    int i2 = dtqyVar6.f;
                                    eoiqVar.copyOnWrite();
                                    eoir eoirVar3 = (eoir) eoiqVar.instance;
                                    eoirVar3.b |= 2;
                                    eoirVar3.d = i2;
                                    int size = dtqyVar6.p.size();
                                    eoiqVar.copyOnWrite();
                                    eoir eoirVar4 = (eoir) eoiqVar.instance;
                                    eoirVar4.b |= 8;
                                    eoirVar4.f = size;
                                    long j = dtqyVar6.t;
                                    eoiqVar.copyOnWrite();
                                    eoir eoirVar5 = (eoir) eoiqVar.instance;
                                    eoirVar5.b |= 64;
                                    eoirVar5.i = j;
                                    String str3 = dtqyVar6.u;
                                    eoiqVar.copyOnWrite();
                                    eoir eoirVar6 = (eoir) eoiqVar.instance;
                                    str3.getClass();
                                    eoirVar6.b |= 128;
                                    eoirVar6.j = str3;
                                    eoir eoirVar7 = (eoir) eoiqVar.build();
                                    dtqu dtquVar5 = dtqyVar6.c;
                                    if (dtquVar5 == null) {
                                        dtquVar5 = dtqu.a;
                                    }
                                    long j2 = dtquVar5.d;
                                    long j3 = dtquVar5.f;
                                    long j4 = dtquVar5.e;
                                    eoja eojaVar = (eoja) eojb.a.createBuilder();
                                    int i3 = dtquVar5.g;
                                    eojaVar.copyOnWrite();
                                    eojb eojbVar = (eojb) eojaVar.instance;
                                    eojbVar.b = 1 | eojbVar.b;
                                    eojbVar.c = i3;
                                    long j5 = j4 - j3;
                                    eojaVar.copyOnWrite();
                                    eojb eojbVar2 = (eojb) eojaVar.instance;
                                    eojbVar2.b = 2 | eojbVar2.b;
                                    eojbVar2.d = j5;
                                    eojaVar.copyOnWrite();
                                    eojb eojbVar3 = (eojb) eojaVar.instance;
                                    eojbVar3.b |= 4;
                                    eojbVar3.e = j4 - j2;
                                    dtqu dtquVar6 = dtqyVar6.c;
                                    if (dtquVar6 == null) {
                                        dtquVar6 = dtqu.a;
                                    }
                                    boolean z5 = dtquVar6.i;
                                    eojaVar.copyOnWrite();
                                    eojb eojbVar4 = (eojb) eojaVar.instance;
                                    eojbVar4.b |= 8;
                                    eojbVar4.f = z5;
                                    duriVar3.a.f(eoirVar7, (eojb) eojaVar.build());
                                }
                            }
                        }
                        return dugq.DOWNLOADED;
                    }
                }, executor);
            }
        };
        Executor executor = this.h;
        return dvaqVarE.g(eoozVar2, executor).g(new eooz() { // from class: duex
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final dugq dugqVar = (dugq) obj;
                String str = dtqyVar.d;
                return this.a.q(eorv.a, new ejvr() { // from class: ducd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return dugqVar;
                    }
                });
            }
        }, executor);
    }

    public final boolean v(String str) throws PackageManager.NameNotFoundException {
        try {
            this.a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final ListenableFuture z(final dtqy dtqyVar, final dtqs dtqsVar, final dtsd dtsdVar, dtsh dtshVar, final int i) {
        return r(B(dtqyVar, dtqsVar, dtshVar, dtsdVar, dtqsVar.o, dtqyVar.m, i), new eooz() { // from class: duer
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue() || i == 4) {
                    return eorv.a;
                }
                dtsd dtsdVar2 = dtsdVar;
                dtqs dtqsVar2 = dtqsVar;
                dtqy dtqyVar2 = dtqyVar;
                return this.a.s(dtqyVar2, dtqsVar2, dtsdVar2, dtqyVar2.m);
            }
        });
    }
}
