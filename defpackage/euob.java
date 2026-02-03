package defpackage;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface euob {
    void close();

    Map<String, List<? extends PredictorResult.Prediction>> generatePredictions(euoe euoeVar, Map<String, Integer> map);

    void onTrimMemory();
}
