package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class amsu {
    public static boolean a(amsv amsvVar) {
        return !amsvVar.e().equals(Uri.EMPTY) && Objects.equals(amsvVar.e().getAuthority(), "mms");
    }
}
