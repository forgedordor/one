package defpackage;

import com.google.mediapipe.framework.MediaPipeException;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evap extends evab {
    public static final List e = DesugarCollections.unmodifiableList(Arrays.asList("IMAGE:image_in", "NORM_RECT:norm_rect_in", "OUTPUT_SIZE:output_size_in"));
    private List f;

    static {
        System.loadLibrary("mediapipe_tasks_vision_jni");
    }

    public evap(euzo euzoVar) {
        super(euzoVar);
        this.f = new ArrayList();
        boolean z = false;
        for (erxx erxxVar : this.a.a.b().b) {
            if (erxxVar.c.contains("mediapipe.tasks.TensorsToSegmentationCalculator")) {
                if (z) {
                    throw new MediaPipeException(euxa.INTERNAL.ordinal(), "The graph has more than one mediapipe.tasks.TensorsToSegmentationCalculator.");
                }
                erxu erxuVar = erxxVar.g;
                erxuVar = erxuVar == null ? erxu.a : erxuVar;
                evsl evslVarCheckIsLite = evsn.checkIsLite(euyd.b);
                erxuVar.d(evslVarCheckIsLite);
                Object objL = erxuVar.r.l(evslVarCheckIsLite.d);
                euyd euydVar = (euyd) (objL == null ? evslVarCheckIsLite.b : evslVarCheckIsLite.c(objL));
                for (int i = 0; i < DesugarCollections.unmodifiableMap(euydVar.c).size(); i++) {
                    Long lValueOf = Long.valueOf(i);
                    if (!DesugarCollections.unmodifiableMap(euydVar.c).containsKey(lValueOf)) {
                        int iOrdinal = euxa.INTERNAL.ordinal();
                        Objects.toString(lValueOf);
                        throw new MediaPipeException(iOrdinal, "The lablemap have no expected key: ".concat(lValueOf.toString()));
                    }
                    this.f.add(((evax) DesugarCollections.unmodifiableMap(euydVar.c).get(lValueOf)).b);
                }
                z = true;
            }
        }
    }
}
