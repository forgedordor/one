package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etav extends etay {
    final /* synthetic */ Method a;
    final /* synthetic */ int b;

    public etav(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.etay
    public final Object a(Class cls) {
        etay.b(cls);
        return this.a.invoke(null, cls, Integer.valueOf(this.b));
    }
}
