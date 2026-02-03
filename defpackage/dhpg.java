package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import org.tensorflow.lite.task.core.TaskJniUtils;
import org.tensorflow.lite.task.text.nlclassifier.NLClassifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhpg implements dhpc {
    public static final dhpg a = new dhpg();

    private dhpg() {
    }

    @Override // defpackage.dhpc
    public final dhoz a(dhuk dhukVar) {
        dhukVar.getClass();
        if (dhukVar.f != 1) {
            dhukVar = null;
        }
        if (dhukVar == null) {
            return null;
        }
        fdap fdapVar = new fdap() { // from class: dhpf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dhuu dhuuVar = (dhuu) obj;
                dhuuVar.getClass();
                sdi sdiVar = dhuuVar.a().c;
                if (sdiVar == null) {
                    sdiVar = sdi.a;
                }
                sbt sbtVar = sdiVar.d;
                if (sbtVar == null) {
                    sbtVar = sbt.a;
                }
                if (1 != (sbtVar.b & 1)) {
                    sbtVar = null;
                }
                if (sbtVar != null) {
                    return sbtVar.c;
                }
                return null;
            }
        };
        fgvx fgvxVar = new fgvx();
        ByteBuffer byteBuffer = dhukVar.a;
        int i = NLClassifier.b;
        if (!byteBuffer.isDirect() && !(byteBuffer instanceof MappedByteBuffer)) {
            throw new IllegalArgumentException("The model buffer should be either a direct ByteBuffer or a MappedByteBuffer.");
        }
        TaskJniUtils.a();
        try {
            return new dhpb(fdapVar, new dhum(new NLClassifier(NLClassifier.initJniWithByteBuffer(fgvxVar, byteBuffer, 0L)), dhukVar));
        } catch (RuntimeException e) {
            Log.e(TaskJniUtils.a, "Error getting native address of native library: task_text_jni", e);
            throw new IllegalStateException("Error getting native address of native library: task_text_jni", e);
        }
    }
}
