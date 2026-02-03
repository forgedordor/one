package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbq extends wv {
    public static final /* synthetic */ int u = 0;
    public final TextView s;
    final /* synthetic */ dnbr t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnbq(dnbr dnbrVar, View view) {
        super(view);
        this.t = dnbrVar;
        View viewFindViewById = view.findViewById(R.id.select_media_request_permission_button);
        viewFindViewById.getClass();
        this.s = (TextView) viewFindViewById;
    }
}
