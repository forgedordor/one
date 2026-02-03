package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rko implements rlr, rks {
    private final Context a;

    public rko(Context context) {
        this.a = context;
    }

    @Override // defpackage.rks
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rkt(this.a, this);
    }

    @Override // defpackage.rks
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        return resources.openRawResourceFd(i);
    }

    @Override // defpackage.rks
    public final /* synthetic */ void d(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
