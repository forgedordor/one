package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etao extends etaq {
    final /* synthetic */ Method a;

    public etao(Method method) {
        this.a = method;
    }

    @Override // defpackage.etaq
    public final boolean a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.a.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
