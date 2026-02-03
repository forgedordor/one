package defpackage;

import android.content.res.TypedArray;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class einq {
    /* JADX WARN: Multi-variable type inference failed */
    public static TypedArray a(View view) {
        ejwl.m(view instanceof einr, "Tried to @Inject @StyledAttributes TypedArray in a Peer not annotated by @Styleable. See g3doc.corp.google.com/java/com/google/apps/tiktok/g3doc/dagger/viewpeers.md#styleable for more information.");
        return ((einr) view).a();
    }
}
