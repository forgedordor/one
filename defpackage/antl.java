package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class antl extends fdbo implements fdat {
    public antl(Object obj) {
        super(2, obj, antm.class, "handleChange", "handleChange(Ljava/util/Set;Z)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Set set = (Set) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        set.getClass();
        ((antm) this.g).b(set, zBooleanValue);
        return fctx.a;
    }
}
