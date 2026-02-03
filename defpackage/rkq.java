package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkq implements rlr, rks {
    private final Context a;

    public rkq(Context context) {
        this.a = context;
    }

    @Override // defpackage.rks
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rkt(this.a, this);
    }

    @Override // defpackage.rks
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        return resources.openRawResource(i);
    }

    @Override // defpackage.rks
    public final /* synthetic */ void d(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
