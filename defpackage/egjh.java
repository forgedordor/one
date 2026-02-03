package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egjh {
    public final eosc a;
    public final ehvf b;

    public egjh(eosc eoscVar, ehvf ehvfVar) {
        this.a = eoscVar;
        this.b = ehvfVar;
    }

    final ListenableFuture a(final File file) {
        return this.a.submit(eiid.l(new Callable() { // from class: egjf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                File file2 = file;
                if (!file2.exists()) {
                    return null;
                }
                elca elcaVar = eleh.a;
                final elcc elccVar = new elcc(elcaVar, elcaVar);
                final ekhx ekhxVarN = ekhx.n(new ekph(file2));
                ekqg ekqgVarListIterator = ekhxVarN.listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    elccVar.b.b(ekqgVarListIterator.next());
                }
                boolean zDelete = true;
                for (File file3 : new Iterable() { // from class: elcb
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        elcd elcdVar = new elcd(((elcc) elccVar).a);
                        ekqg ekqgVarListIterator2 = ekhxVarN.listIterator();
                        ArrayDeque arrayDeque = new ArrayDeque();
                        ArrayDeque arrayDeque2 = new ArrayDeque();
                        arrayDeque2.add(ekqgVarListIterator2);
                        return new elce(elcdVar, arrayDeque2, arrayDeque);
                    }
                }) {
                    if (!file2.equals(file3) && file3.exists()) {
                        file3.setWritable(true, true);
                        zDelete &= file3.delete();
                    }
                }
                if (zDelete && file2.setWritable(false, false) && file2.list().length == 0) {
                    return null;
                }
                file2.setWritable(true, true);
                throw new RuntimeException("Failed to wipe: ".concat(String.valueOf(String.valueOf(file2))));
            }
        }));
    }
}
