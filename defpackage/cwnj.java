package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.transferview.TransferView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwnj {
    public final TransferView a;

    public cwnj(TransferView transferView, fcsu fcsuVar) {
        this.a = transferView;
        LayoutInflater.from(transferView.getContext()).inflate(R.layout.transfer_view, (ViewGroup) transferView, true);
        View viewFindViewById = transferView.findViewById(R.id.icon);
        viewFindViewById.getClass();
        View viewFindViewById2 = transferView.findViewById(R.id.progress);
        viewFindViewById2.getClass();
    }
}
