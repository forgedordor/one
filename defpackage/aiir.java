package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aiir {
    public static aiiq d() {
        aiij aiijVar = new aiij();
        aiijVar.a = new Supplier() { // from class: aiip
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        return aiijVar;
    }

    public abstract int a();

    public abstract String b();

    public abstract Supplier c();
}
