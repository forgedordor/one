package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egin {
    private final ehvf a;
    private final egjh b;

    public egin(ehvf ehvfVar, egjh egjhVar) {
        this.a = ehvfVar;
        this.b = egjhVar;
    }

    final ekgb a(final ekhx ekhxVar, final ekhx ekhxVar2, final boolean z) {
        boolean z2 = true;
        if ((ekhxVar != null || ekhxVar2 == null) && (ekhxVar == null || ekhxVar2 != null)) {
            z2 = false;
        }
        ejwl.a(z2);
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekqg ekqgVarListIterator = this.a.a().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            File[] fileArrListFiles = new File((File) ekqgVarListIterator.next(), "accounts").listFiles(new FilenameFilter() { // from class: egim
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) throws NumberFormatException {
                    File file2 = new File(file, str);
                    try {
                        Integer numValueOf = Integer.valueOf(str);
                        if (numValueOf.intValue() < 0) {
                            return false;
                        }
                        ekhx ekhxVar3 = ekhxVar2;
                        if (ekhxVar3 != null && ekhxVar3.contains(numValueOf)) {
                            return false;
                        }
                        ekhx ekhxVar4 = ekhxVar;
                        if ((ekhxVar4 != null && !ekhxVar4.contains(numValueOf)) || !file2.isDirectory()) {
                            return false;
                        }
                        if (z) {
                            return file2.canWrite();
                        }
                        return true;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
            });
            if (fileArrListFiles != null) {
                ekfwVar.i(fileArrListFiles);
            }
        }
        return ekfwVar.g();
    }

    public final ekgb b(boolean z) {
        return a(null, ekon.a, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture c(ekgb ekgbVar) {
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            arrayList.add(this.b.a((File) ekgbVar.get(i)));
        }
        return eork.a(arrayList).a(new Callable() { // from class: egil
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    eork.q((ListenableFuture) it.next());
                }
                return null;
            }
        }, eoqg.a);
    }
}
