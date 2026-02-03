package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbh {
    public static final View a(jbf jbfVar) {
        if (!jbfVar.D().C) {
            itw.d("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) jcv.a(jbg.d(jbfVar));
    }
}
