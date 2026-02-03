package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbu extends wv {
    public static final /* synthetic */ int u = 0;
    public final MaterialButton s;
    final /* synthetic */ dnbv t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnbu(dnbv dnbvVar, View view) {
        super(view);
        this.t = dnbvVar;
        View viewFindViewById = view.findViewById(R.id.gallery_folders_tile_button);
        viewFindViewById.getClass();
        this.s = (MaterialButton) viewFindViewById;
    }
}
