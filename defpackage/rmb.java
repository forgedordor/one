package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rmb implements rlr {
    private final Resources a;

    public rmb(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rmd(this.a, rlzVar.a(Uri.class, InputStream.class));
    }
}
