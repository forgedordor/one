package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.message.transferview.TransferView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwnm implements eyif {
    public static TransferView a(View view) {
        if (!(view instanceof TransferView)) {
            throw new IllegalStateException(a.L(view, cwnj.class, "Attempt to inject a View wrapper of type "));
        }
        TransferView transferView = (TransferView) view;
        transferView.getClass();
        return transferView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
