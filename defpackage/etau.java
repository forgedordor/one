package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etau extends etay {
    final /* synthetic */ Method a;
    final /* synthetic */ Object b;

    public etau(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    @Override // defpackage.etay
    public final Object a(Class cls) {
        etay.b(cls);
        return this.a.invoke(this.b, cls);
    }
}
