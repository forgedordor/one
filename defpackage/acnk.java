package defpackage;

import android.view.View;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicMessageDataView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnk implements eyif {
    public static ProblematicMessageDataView a(View view) {
        if (!(view instanceof ProblematicMessageDataView)) {
            throw new IllegalStateException(a.L(view, acnh.class, "Attempt to inject a View wrapper of type "));
        }
        ProblematicMessageDataView problematicMessageDataView = (ProblematicMessageDataView) view;
        problematicMessageDataView.getClass();
        return problematicMessageDataView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
