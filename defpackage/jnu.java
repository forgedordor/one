package defpackage;

import android.graphics.Outline;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnu {
    public static final jnu a = new jnu();

    private jnu() {
    }

    public final void a(Outline outline, ikd ikdVar) {
        if (!(ikdVar instanceof iik)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((iik) ikdVar).a);
    }
}
