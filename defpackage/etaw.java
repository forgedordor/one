package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etaw extends etay {
    final /* synthetic */ Method a;

    public etaw(Method method) {
        this.a = method;
    }

    @Override // defpackage.etay
    public final Object a(Class cls) {
        etay.b(cls);
        return this.a.invoke(null, cls, Object.class);
    }
}
