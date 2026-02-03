package defpackage;

import android.content.Context;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rmf implements rlr {
    private final Context a;

    public rmf(Context context) {
        this.a = context;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rmg(this.a, rlzVar.a(Integer.class, InputStream.class));
    }
}
