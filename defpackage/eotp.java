package defpackage;

import android.content.Context;
import defpackage.eotp;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eotp {
    public static volatile Context a;
    private static final Map b = new ConcurrentHashMap();

    /* compiled from: PG */
    public interface a {
        eotp eQ();
    }

    public static boolean a(String str, String str2) {
        Supplier supplierM180m = aky$$ExternalSyntheticApiModelOutline0.m180m(Map.EL.getOrDefault(b, str2, new Supplier() { // from class: eoto
            @Override // java.util.function.Supplier
            public final Object get() {
                return ((eotp.a) eygm.a(eotp.c(), eotp.a.class)).eQ();
            }
        }));
        supplierM180m.getClass();
        return ((eotp) supplierM180m.get()).b(str);
    }

    public static Context c() {
        Context context = a;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return applicationContext;
    }

    protected abstract boolean b(String str);
}
