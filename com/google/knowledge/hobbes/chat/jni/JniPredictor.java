package com.google.knowledge.hobbes.chat.jni;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import com.google.knowledge.hobbes.chat.jni.JniPredictor;
import defpackage.ejxr;
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
public class JniPredictor implements euob {
    public static final /* synthetic */ int a = 0;
    static String[] predictionTypes = {PredictorResult.Types.REPLY_SUGGESTION};
    private boolean closeRequested;
    private final String modelUri;
    private int ongoingRunCounter;
    private long tfSession;

    private JniPredictor(ejxr<String> ejxrVar) {
        this.tfSession = 0L;
        this.ongoingRunCounter = 0;
        this.closeRequested = false;
        String str = ejxrVar.get();
        this.modelUri = str;
        this.tfSession = createFromUri(str);
    }

    public static JniPredictor createFromSerializedURI(final String str) {
        return new JniPredictor((ejxr<String>) new ejxr() { // from class: euop
            @Override // defpackage.ejxr
            public final Object get() {
                int i = JniPredictor.a;
                return str;
            }
        });
    }

    private native long createFromUri(String str);

    private native void internalClose();

    private synchronized void onPostRun() {
        int i = this.ongoingRunCounter - 1;
        this.ongoingRunCounter = i;
        if (i == 0 && this.closeRequested) {
            this.closeRequested = false;
            close();
        }
    }

    private native Map<String, List<? extends PredictorResult.Prediction>> runGraph(List<String> list, List<Integer> list2, List<Float> list3, int i, Map<String, Object> map);

    @Override // defpackage.euob
    public synchronized void close() {
        internalClose();
        this.tfSession = 0L;
    }

    protected void finalize() {
        close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.euob
    public Map<String, List<? extends PredictorResult.Prediction>> generatePredictions(euoe euoeVar, Map<String, Integer> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ekqh it = ((ekgb) euoeVar.a).iterator();
        while (it.hasNext()) {
            euod euodVar = (euod) it.next();
            arrayList.add(euodVar.a);
            arrayList2.add(Integer.valueOf(euodVar.b));
            arrayList3.add(Float.valueOf(euodVar.c));
        }
        int iIntValue = map.containsKey(PredictorResult.Types.REPLY_SUGGESTION) ? map.get(PredictorResult.Types.REPLY_SUGGESTION).intValue() : 0;
        Map<String, Object> map2 = euoeVar.b;
        Integer.valueOf(iIntValue).getClass();
        return euon.a(runGraphWrapper(arrayList, arrayList2, arrayList3, iIntValue, map2), map);
    }

    public List<? extends PredictorResult.Prediction> generateSuggestions(List<String> list, List<Integer> list2, List<Float> list3, int i, Map<String, Object> map) {
        return runGraphWrapper(list, list2, list3, i, map).get(PredictorResult.Types.REPLY_SUGGESTION);
    }

    public synchronized boolean isClosed() {
        return this.tfSession == 0;
    }

    public synchronized void onPreRun() {
        if (isClosed()) {
            this.tfSession = createFromUri(this.modelUri);
        }
        this.ongoingRunCounter++;
    }

    @Override // defpackage.euob
    public synchronized void onTrimMemory() {
        if (isClosed()) {
            return;
        }
        if (this.ongoingRunCounter == 0) {
            close();
        } else {
            this.closeRequested = true;
        }
    }

    public Map<String, List<? extends PredictorResult.Prediction>> runGraphWrapper(List<String> list, List<Integer> list2, List<Float> list3, int i, Map<String, Object> map) {
        onPreRun();
        try {
            return runGraph(list, list2, list3, i, map);
        } finally {
            onPostRun();
        }
    }

    public String[] supportedPredictionTypes() {
        return predictionTypes;
    }

    @Deprecated
    public JniPredictor(final String str) {
        this((ejxr<String>) new ejxr() { // from class: euoo
            @Override // defpackage.ejxr
            public final Object get() {
                return "file:".concat(String.valueOf(str));
            }
        });
    }

    static /* synthetic */ String lambda$createFromSerializedURI$0(String str) {
        return str;
    }
}
