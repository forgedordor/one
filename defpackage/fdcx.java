package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdcx implements fdcz {
    private Object a;

    @Override // defpackage.fdcz
    public final Object c(fdeh fdehVar) {
        fdehVar.getClass();
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Property " + fdehVar.b() + " should be initialized before get.");
    }

    @Override // defpackage.fdcz
    public final void d(fdeh fdehVar, Object obj) {
        fdehVar.getClass();
        obj.getClass();
        this.a = obj;
    }

    public final String toString() {
        String strConcat;
        Object obj = this.a;
        if (obj != null) {
            Objects.toString(obj);
            strConcat = "value=".concat(obj.toString());
        } else {
            strConcat = "value not initialized yet";
        }
        return a.a(strConcat, "NotNullProperty(", ")");
    }
}
