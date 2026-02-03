package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duxx implements duwe {
    @Override // defpackage.duwe
    public final ListenableFuture a(List list) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dtnq dtnqVar = (dtnq) it.next();
            if (dtnqVar.c.startsWith("global") || dtnqVar.c.equals("model_metadata.pb") || dtnqVar.c.equals("word_embeddings") || dtnqVar.c.equals("RefNet.tflite")) {
                ekfwVar.h(dtnqVar);
            }
        }
        return eork.i(ekfwVar.g());
    }
}
