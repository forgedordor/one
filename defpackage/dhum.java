package defpackage;

import java.io.Closeable;
import org.tensorflow.lite.task.text.nlclassifier.NLClassifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhum implements Closeable {
    public static final ekrg a = ekrg.c("com/google/android/libraries/abuse/hades/moirai/models/TextModelRunner");
    public final NLClassifier b;
    public final fdap c;
    public final Object d;

    public dhum(NLClassifier nLClassifier, final dhuk dhukVar) {
        final fdgl fdglVar = dhukVar.d;
        fdap fdapVar = fdglVar != null ? new fdap() { // from class: dhul
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                String str2 = dhukVar.e;
                str2.getClass();
                return fdglVar.b(str, str2);
            }
        } : null;
        this.b = nLClassifier;
        this.c = fdapVar;
        this.d = new Object();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
