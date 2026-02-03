package defpackage;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejos implements ejol {
    private final ejjt a;
    private final euob b;
    private final double c;
    private final String d;
    private final ekgp e;

    /* JADX WARN: Multi-variable type inference failed */
    public ejos(ejjt ejjtVar, ejkt ejktVar) throws ejkv {
        this.a = ejjtVar;
        ejih ejihVar = ejjtVar.c == 3 ? (ejih) ejjtVar.d : ejih.a;
        int iA = ejil.a(ejihVar.g);
        iA = iA == 0 ? 2 : iA;
        ejha ejhaVar = ejihVar.c;
        this.b = ejktVar.b(iA, ejhaVar == null ? ejha.a : ejhaVar);
        if (ejihVar.e.size() != 1) {
            ArrayList arrayList = new ArrayList(ejihVar.e.size());
            Iterator<E> it = ejihVar.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((ejig) it.next()).c);
            }
            throw new ejkv("TfLiteSensitiveClassifier: Expected only one task: ".concat(arrayList.toString()));
        }
        ejig ejigVar = (ejig) ejihVar.e.get(0);
        this.c = ejigVar.e;
        String str = ejigVar.c;
        this.d = str;
        this.e = ekgp.l(str, Integer.valueOf(ejigVar.d));
    }

    @Override // defpackage.ejol
    public final Set a(ezcy ezcyVar) throws ejkv {
        List listA = ejoh.a(ezcyVar, System.currentTimeMillis());
        int i = ((ekoe) listA).c;
        ejjt ejjtVar = this.a;
        if (i > ejjtVar.e) {
            ekfw ekfwVar = new ekfw();
            for (int i2 = i - ejjtVar.e; i2 < i; i2++) {
                ekfwVar.h((euod) listA.get(i2));
            }
            listA = ekfwVar.g();
        }
        euoe euoeVar = new euoe(listA, null);
        new HashMap();
        try {
            Map<String, List<? extends PredictorResult.Prediction>> mapGeneratePredictions = this.b.generatePredictions(euoeVar, this.e);
            HashSet hashSet = new HashSet();
            String str = this.d;
            if (mapGeneratePredictions.containsKey(str)) {
                Iterator<? extends PredictorResult.Prediction> it = mapGeneratePredictions.get(str).iterator();
                while (it.hasNext()) {
                    PredictorResult.TextPrediction textPrediction = (PredictorResult.TextPrediction) it.next();
                    if (textPrediction.score > this.c) {
                        String str2 = textPrediction.text;
                        if (!str2.equals("NOT-SENSITIVE")) {
                            ejjt ejjtVar2 = this.a;
                            if (ejjtVar2.f.size() == 0 || ejjtVar2.f.contains(str2)) {
                                hashSet.add(textPrediction.text);
                            }
                        }
                    }
                }
            }
            return hashSet;
        } catch (Throwable th) {
            throw new ejkv("TfLiteSensitiveClassifier: Exception/Error getting results from Predictor.", th);
        }
    }
}
