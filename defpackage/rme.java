package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rme implements rlr {
    private final Context a;

    public rme(Context context) {
        this.a = context;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rmg(this.a, rlzVar.a(Integer.class, AssetFileDescriptor.class));
    }
}
