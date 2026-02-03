package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsh {
    private static final AtomicInteger a = new AtomicInteger(0);

    public static final int a() {
        return a.addAndGet(1);
    }

    public static final ics b(ics icsVar, fdap fdapVar) {
        return icsVar.a(new ClearAndSetSemanticsElement(fdapVar));
    }

    public static final ics c(ics icsVar, boolean z, fdap fdapVar) {
        return icsVar.a(new AppendedSemanticsElement(z, fdapVar));
    }
}
