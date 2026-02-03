package defpackage;

import java.lang.annotation.Annotation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eygm {
    public static Object a(Object obj, Class cls) {
        boolean z;
        if (!(obj instanceof eyhw)) {
            if (obj instanceof eyhx) {
                return a(((eyhx) obj).bb(), cls);
            }
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), eyhw.class, eyhx.class));
        }
        if (obj instanceof eyia) {
            Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            eyhz.a(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
        }
        return cls.cast(obj);
    }
}
