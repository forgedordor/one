package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rma implements rlr {
    private final Resources a;

    public rma(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rmd(this.a, rlzVar.a(Uri.class, AssetFileDescriptor.class));
    }
}
