package com.google.knowledge.hobbes.chat.tflite;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import defpackage.ekgb;
import defpackage.ekqh;
import defpackage.euob;
import defpackage.euod;
import defpackage.euoe;
import defpackage.euon;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TfLitePredictor implements euob {
    public static final /* synthetic */ int b = 0;
    long a;

    static {
        ekgb.r(PredictorResult.Types.REPLY_SUGGESTION);
    }

    public TfLitePredictor(long j) {
        this.a = j;
    }

    public static native long createFromUri(String str);

    private native void internalClose(long j);

    private native Map<String, List<? extends PredictorResult.Prediction>> runGraph(long j, List<String> list, List<Integer> list2, List<Integer> list3, Map<String, Integer> map, Map<String, Object> map2);

    @Override // defpackage.euob
    public final synchronized void close() {
        internalClose(this.a);
        this.a = 0L;
    }

    protected final void finalize() {
        close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.euob
    public final synchronized Map<String, List<? extends PredictorResult.Prediction>> generatePredictions(euoe euoeVar, Map<String, Integer> map) throws Throwable {
        Throwable th;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ekqh it = ((ekgb) euoeVar.a).iterator();
                while (it.hasNext()) {
                    try {
                        euod euodVar = (euod) it.next();
                        arrayList.add(euodVar.a);
                        arrayList2.add(Integer.valueOf(euodVar.b));
                        arrayList3.add(Float.valueOf(euodVar.c));
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                for (int i = 0; i < size; i++) {
                    arrayList4.add(Integer.valueOf((int) ((Float) arrayList3.get(i)).floatValue()));
                }
                Map<String, Object> map2 = euoeVar.b;
                long j = this.a;
                if (j == 0) {
                    throw new IllegalStateException("Predictor state uninitialized.");
                }
                return euon.a(runGraph(j, arrayList, arrayList2, arrayList4, map, map2), map);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // defpackage.euob
    public final /* synthetic */ void onTrimMemory() {
    }
}
