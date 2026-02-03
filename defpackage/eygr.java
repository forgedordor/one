package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eygr {

    /* compiled from: PG */
    public interface a {
        Set fR();
    }

    public static boolean a(Context context) {
        Set setFR = ((a) eygn.a(context, a.class)).fR();
        ekon ekonVar = (ekon) setFR;
        eyhz.a(ekonVar.e <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setFR.isEmpty()) {
            return true;
        }
        return ((Boolean) ekonVar.listIterator().next()).booleanValue();
    }
}
