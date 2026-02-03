package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehlh {

    /* compiled from: PG */
    public interface a {
        ehnc et();
    }

    public static Object a(Context context, Class cls, efwo efwoVar) {
        try {
            return cls.cast(((a) ehli.a(context.getApplicationContext(), a.class)).et().a(efwoVar));
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", e);
        }
    }
}
