package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzbg extends Exception {
    public abstract dcfx a();

    public abstract Status b();

    @Override // java.lang.Throwable
    public final String getMessage() {
        return b().toString();
    }
}
