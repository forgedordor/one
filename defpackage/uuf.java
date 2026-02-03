package defpackage;

import android.view.View;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uuf implements eyif {
    public static SimPickerView a(View view) {
        if (!(view instanceof SimPickerView)) {
            throw new IllegalStateException(a.L(view, uuc.class, "Attempt to inject a View wrapper of type "));
        }
        SimPickerView simPickerView = (SimPickerView) view;
        simPickerView.getClass();
        return simPickerView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
