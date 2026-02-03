package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nkt implements mcy {
    public static final /* synthetic */ int a = 0;
    private static final ejxr b = ejxx.a(new ejxr() { // from class: nks
        @Override // defpackage.ejxr
        public final Object get() {
            int i = nkt.a;
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    });

    @Override // defpackage.mcy
    public final mda a(Context context, maj majVar, mag magVar, boolean z, Executor executor, mcz mczVar) throws mcw, IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Class cls = (Class) b.get();
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            cls.getMethod("setEnableReplayableCache", Boolean.TYPE).invoke(objNewInstance, false);
            Object objInvoke = cls.getMethod("build", null).invoke(objNewInstance, null);
            mee.f(objInvoke);
            return ((mcy) objInvoke).a(context, majVar, magVar, z, executor, mczVar);
        } catch (Exception e) {
            throw new mcw(e);
        }
    }
}
