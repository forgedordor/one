package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eggw extends ecic {
    private static final ekrg b = ekrg.c("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler");
    public final egin a;
    private final ejwi c;
    private final fcsu d;
    private final Executor e;

    public eggw(egin eginVar, ejwi ejwiVar, fcsu fcsuVar, Executor executor) {
        this.a = eginVar;
        this.c = ejwiVar;
        this.d = fcsuVar;
        this.e = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecic
    public final ListenableFuture a(final IOException iOException, final ecid ecidVar) throws NumberFormatException {
        if (!((Boolean) ((ejwt) this.c).a).booleanValue()) {
            return eork.h(iOException);
        }
        if (!(iOException instanceof FileNotFoundException) && !(iOException.getCause() instanceof FileNotFoundException) && !(iOException instanceof evtj) && !(iOException.getCause() instanceof evtj)) {
            return eork.h(iOException);
        }
        ((ekrd) ((ekrd) ((ekrd) b.i()).g(iOException)).h("com/google/apps/tiktok/account/data/manager/AccountDataStoreIOExceptionHandler", "handleReadException", (char) 127, "AccountDataStoreIOExceptionHandler.java")).q("AccountDataStore read failed. Trying to recover by resetting the store and wiping out all the account data.");
        ekgb ekgbVarB = this.a.b(false);
        int i = ((ekoe) ekgbVarB).c;
        final int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = Integer.parseInt(((File) ekgbVarB.get(i3)).getName());
            if (i4 > i2) {
                i2 = i4;
            }
        }
        Set<cuiy> set = (Set) this.d.b();
        ArrayList arrayList = new ArrayList(set.size());
        for (final cuiy cuiyVar : set) {
            cuiyVar.getClass();
            arrayList.add(eork.n(eiid.c(new eooy() { // from class: eggs
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final cuiy cuiyVar2 = cuiyVar;
                    return eijx.f(new Runnable() { // from class: cuix
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((cqji) cuiyVar2.a.b()).a("Bugle.Gaia.CorruptedPds.Counts");
                        }
                    }, eoqg.a);
                }
            }), eoqg.a));
        }
        eorg eorgVarA = eork.a(arrayList);
        eopa eopaVar = new eopa(null);
        Executor executor = this.e;
        return eooh.g(eooq.g(eooq.g(eoqt.t(eorgVarA.a(eopaVar, executor)), eiid.d(new eooz() { // from class: eggt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                egin eginVar = this.a.a;
                return eginVar.c(eginVar.b(true));
            }
        }), executor), eiid.d(new eooz() { // from class: eggu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eghq eghqVar = (eghq) eghr.a.createBuilder();
                int i5 = i2;
                int i6 = i5 == -1 ? 1 : i5 + 1;
                ecid ecidVar2 = ecidVar;
                eghqVar.copyOnWrite();
                eghr eghrVar = (eghr) eghqVar.instance;
                eghrVar.b = 1 | eghrVar.b;
                eghrVar.c = i6;
                return ecidVar2.a(eork.i((eghr) eghqVar.build()));
            }
        }), executor), IOException.class, eiid.d(new eooz() { // from class: eggv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws IOException {
                IOException iOException2 = iOException;
                iOException2.addSuppressed((IOException) obj);
                throw iOException2;
            }
        }), eoqg.a);
    }
}
