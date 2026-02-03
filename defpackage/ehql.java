package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehql {
    public final eosc a;
    private final ehqf b;

    public ehql(ehqf ehqfVar, eosc eoscVar) {
        this.b = ehqfVar;
        this.a = eoscVar;
    }

    public final eopy a() {
        final ehqr ehqrVar = this.b.a;
        final Callable callable = new Callable() { // from class: ehqo
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                ehqr.b();
                ehqr ehqrVar2 = ehqrVar;
                try {
                    PrintWriter printWriter = ehqrVar2.h;
                    if (printWriter != null) {
                        printWriter.flush();
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    boolean z2 = false;
                    for (int i = 1; i <= ehqrVar2.g; i++) {
                        try {
                            File fileA = ehqrVar2.a(i);
                            if (fileA.exists()) {
                                arrayList.add(new FileInputStream(fileA));
                                if (z) {
                                    z = true;
                                    z2 = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                        } catch (Throwable th) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((InputStream) it.next()).close();
                            }
                            throw th;
                        }
                    }
                    File file = (File) ehqrVar2.d.get();
                    if (file.exists()) {
                        arrayList.add(new FileInputStream(file));
                    }
                    if (z2) {
                        arrayList.add(0, ehqr.c);
                    }
                    return new SequenceInputStream(Collections.enumeration(arrayList));
                } catch (IllegalArgumentException e) {
                    Log.e(ehqr.a, "Error while obtaining bytes from internal logs", e);
                    throw e;
                }
            }
        };
        return eopy.c(new eopn() { // from class: ehqp
            @Override // defpackage.eopn
            public final Object a(eopt eoptVar) {
                String str = ehqr.a;
                InputStream inputStream = (InputStream) callable.call();
                eoptVar.a(inputStream, eoqg.a);
                return inputStream;
            }
        }, ehqrVar.e);
    }
}
