package defpackage;

import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.support.label.Category;
import org.tensorflow.lite.task.text.nlclassifier.NLClassifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhpb implements Closeable, dhoz {
    private static final ekrg a = ekrg.c("com/google/android/libraries/abuse/hades/moirai/classifiers/Classifier");
    private final fdap b;
    private final dhum c;

    public dhpb(fdap fdapVar, dhum dhumVar) {
        this.b = fdapVar;
        this.c = dhumVar;
    }

    @Override // defpackage.dhoz
    public final dhpa a(dhuu dhuuVar) {
        List<Category> listClassifyNative;
        Map linkedHashMap;
        Object objInvoke = this.b.invoke(dhuuVar);
        if (objInvoke == null) {
            ((ekrd) a.h().h("com/google/android/libraries/abuse/hades/moirai/classifiers/Classifier", "classify", 17, "Classifier.kt")).q("Nothing found to evaluate in payload.");
            return null;
        }
        dhum dhumVar = this.c;
        fdap fdapVar = dhumVar.c;
        if (fdapVar != null) {
            objInvoke = fdapVar.invoke(objInvoke);
        }
        synchronized (dhumVar.d) {
            listClassifyNative = NLClassifier.classifyNative(dhumVar.b.a, (String) objInvoke);
        }
        if (listClassifyNative == null || listClassifyNative.size() != 1) {
            ((ekrd) dhum.a.i().h("com/google/android/libraries/abuse/hades/moirai/models/TextModelRunner", "run", 41, "TextModelRunner.kt")).q("L2CInferencer returned classification with incorrect number of results.");
            linkedHashMap = fcvp.a;
        } else {
            linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(listClassifyNative, 10)), 16));
            for (Category category : listClassifyNative) {
                String str = category.a;
                str.getClass();
                linkedHashMap.put(str, Float.valueOf(category.b));
            }
        }
        if (!linkedHashMap.isEmpty()) {
            return new dhpa(linkedHashMap);
        }
        dhpa dhpaVar = new dhpa(null);
        ((ekrd) a.i().h("com/google/android/libraries/abuse/hades/moirai/classifiers/Classifier", "classify", 24, "Classifier.kt")).q("Inference returned unknown prediction.");
        return dhpaVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
