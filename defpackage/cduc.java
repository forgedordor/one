package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Comparator;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cduc implements ejly {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/mdd/MddFileProvider");
    public final cdtc b;
    public final ecev c;
    public final Executor d;
    private final cdte e;
    private final Executor f;

    public cduc(cdte cdteVar, ecev ecevVar, Executor executor, Executor executor2, cdtc cdtcVar) {
        this.c = ecevVar;
        this.e = cdteVar;
        this.d = executor;
        this.f = executor2;
        this.b = cdtcVar;
    }

    private final Uri j(ejhc ejhcVar) {
        cdtc cdtcVar = this.b;
        String str = ejhcVar.c;
        String str2 = ejhcVar.d;
        if (!cdtcVar.b(str, str2)) {
            h(this.e.g(str2), str2);
        }
        return cdtcVar.a(ejhcVar.c, ejhcVar.d);
    }

    private final eiju k(final ejhc ejhcVar) {
        eiju eijuVarE;
        cdtc cdtcVar = this.b;
        String str = ejhcVar.c;
        final String str2 = ejhcVar.d;
        if (cdtcVar.b(str, str2)) {
            eijuVarE = eijx.e(null);
        } else {
            eijuVarE = this.e.h(str2).h(new ejvr() { // from class: cdty
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    this.a.h((Optional) obj, str2);
                    return null;
                }
            }, this.d);
        }
        return eijuVarE.h(new ejvr() { // from class: cdtw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdtc cdtcVar2 = this.a.b;
                ejhc ejhcVar2 = ejhcVar;
                return cdtcVar2.a(ejhcVar2.c, ejhcVar2.d);
            }
        }, this.d);
    }

    @Override // defpackage.ejly
    public final ejha a(String str) {
        return ejlx.a(str);
    }

    @Override // defpackage.ejly
    public final eopy b(final ejha ejhaVar) {
        if ((ejhaVar.b & 2) != 0) {
            return eopy.c(new eopn() { // from class: cdub
                @Override // defpackage.eopn
                public final Object a(eopt eoptVar) {
                    FileInputStream fileInputStream = new FileInputStream(ejhaVar.d);
                    eoptVar.a(fileInputStream, this.a.d);
                    return fileInputStream;
                }
            }, this.d);
        }
        ejhc ejhcVar = ejhaVar.c;
        if (ejhcVar == null) {
            ejhcVar = ejhc.a;
        }
        return new eopy(k(ejhcVar)).e(new eopo() { // from class: cdtu
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) throws IOException {
                cduc cducVar = this.a;
                ejha ejhaVar2 = ejhaVar;
                Uri uri = (Uri) obj;
                if (uri == null) {
                    throw new IOException("Could not get URI for file:, ".concat(ejlx.b(ejhaVar2)));
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream((File) cducVar.c.c(uri, new echf()));
                    eoptVar.a(fileInputStream, cducVar.d);
                    return fileInputStream;
                } catch (Exception e) {
                    ekrw ekrwVarJ = cduc.a.j();
                    ekrwVarJ.X(eksq.a, "BugleMDD");
                    ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/mdd/MddFileProvider", "getFileInputStream", 115, "MddFileProvider.java");
                    ejhc ejhcVar2 = ejhaVar2.c;
                    if (ejhcVar2 == null) {
                        ejhcVar2 = ejhc.a;
                    }
                    String str = ejhcVar2.c;
                    ejhc ejhcVar3 = ejhaVar2.c;
                    if (ejhcVar3 == null) {
                        ejhcVar3 = ejhc.a;
                    }
                    ekrdVar.D("Exception while reading the MDD file. mddFileId = %s, mddGroup = %s", str, ejhcVar3.d);
                    throw new IOException("Could not read file.", e);
                }
            }
        }, this.f);
    }

    @Override // defpackage.ejly
    public final eopy c(final ejha ejhaVar) {
        if ((ejhaVar.b & 2) != 0) {
            return eopy.c(new eopn() { // from class: cdtt
                @Override // defpackage.eopn
                public final Object a(eopt eoptVar) {
                    FileInputStream fileInputStream = new FileInputStream(ejhaVar.d);
                    eoptVar.a(fileInputStream, this.a.d);
                    return fileInputStream;
                }
            }, this.f);
        }
        ejhc ejhcVar = ejhaVar.c;
        if (ejhcVar == null) {
            ejhcVar = ejhc.a;
        }
        return new eopy(k(ejhcVar)).e(new eopo() { // from class: cdtv
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) throws IOException {
                cduc cducVar = this.a;
                InputStream inputStreamG = cducVar.g((Uri) obj, ejhaVar);
                eoptVar.a(inputStreamG, cducVar.d);
                return inputStreamG;
            }
        }, this.f);
    }

    @Override // defpackage.ejly
    public final ListenableFuture d(ejha ejhaVar) {
        if ((ejhaVar.b & 2) != 0) {
            return eijx.e(Optional.of(ejhaVar.d));
        }
        ejhc ejhcVar = ejhaVar.c;
        if (ejhcVar == null) {
            ejhcVar = ejhc.a;
        }
        return k(ejhcVar).h(new ejvr() { // from class: cdua
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Uri uri = (Uri) obj;
                return uri == null ? Optional.empty() : Optional.of(uri.toString());
            }
        }, this.d);
    }

    @Override // defpackage.ejly
    public final ListenableFuture e() {
        return this.e.a().h(new ejvr() { // from class: cdtz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList((ekgb) obj);
                Collections.sort(arrayList, Comparator.EL.reversed(Comparator.CC.comparingInt(new ToIntFunction() { // from class: cdtx
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj2) {
                        return ((dtma) obj2).f;
                    }
                })));
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    dtma dtmaVar = (dtma) arrayList.get(i);
                    dtlz dtlzVarB = dtlz.b(dtmaVar.g);
                    if (dtlzVarB == null) {
                        dtlzVarB = dtlz.UNSPECIFIED;
                    }
                    if (dtlzVarB == dtlz.DOWNLOADED && hashSet.add(dtmaVar.c)) {
                        this.a.h(Optional.of(dtmaVar), dtmaVar.c);
                    }
                }
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.ejly
    public final synchronized InputStream f(ejha ejhaVar) {
        if ((ejhaVar.b & 2) != 0) {
            return new FileInputStream(ejhaVar.d);
        }
        ejhc ejhcVar = ejhaVar.c;
        if (ejhcVar == null) {
            ejhcVar = ejhc.a;
        }
        return g(j(ejhcVar), ejhaVar);
    }

    public final InputStream g(Uri uri, ejha ejhaVar) throws IOException {
        if (uri == null) {
            throw new IOException("Could not get URI for file:, ".concat(ejlx.b(ejhaVar)));
        }
        try {
            return (InputStream) this.c.c(uri, new echh());
        } catch (Exception e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleMDD");
            ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/mdd/MddFileProvider", "getInputStreamFromUri", 149, "MddFileProvider.java");
            ejhc ejhcVar = ejhaVar.c;
            if (ejhcVar == null) {
                ejhcVar = ejhc.a;
            }
            String str = ejhcVar.c;
            ejhc ejhcVar2 = ejhaVar.c;
            if (ejhcVar2 == null) {
                ejhcVar2 = ejhc.a;
            }
            ekrdVar.D("Exception while reading the MDD file. mddFileId = %s, mddGroup = %s", str, ejhcVar2.d);
            throw new IOException("Could not read file.", e);
        }
    }

    public final void h(Optional optional, String str) {
        if (optional.isEmpty()) {
            return;
        }
        try {
            for (dtlw dtlwVar : ((dtma) optional.get()).h) {
                this.b.a.put(Pair.create(dtlwVar.c, str), Uri.parse(dtlwVar.d));
            }
        } catch (Exception e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleMDD");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/mdd/MddFileProvider", "cacheFileGroup", (char) 345, "MddFileProvider.java")).q("Exception while reading mdd file from mobstore");
        }
    }

    @Override // defpackage.ejly
    public final synchronized cdta i(ejha ejhaVar) {
        int i = ejhaVar.b;
        if ((i & 2) != 0 && (i & 1) == 0) {
            return new cdta(ejhaVar.d);
        }
        ejhc ejhcVar = ejhaVar.c;
        if (ejhcVar == null) {
            ejhcVar = ejhc.a;
        }
        Uri uriJ = j(ejhcVar);
        if (uriJ == null) {
            throw new IOException("Could not find URI for file.");
        }
        try {
            return new cdta((echb) this.c.c(uriJ, new echc()));
        } catch (Exception e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleMDD");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/mdd/MddFileProvider", "getCloseableNativeFileFromUri", 204, "MddFileProvider.java")).D("Exception while reading the MDD file. mddFileId = %s, mddGroup = %s", ejhcVar.c, ejhcVar.d);
            throw new IOException("Error while tyring to create closeable native.");
        }
    }
}
