package defpackage;

import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnii {
    public static final EditText a(dnih dnihVar) {
        if (dnihVar instanceof dpfe) {
            dnjn dnjnVarP = ((dpfe) dnihVar).p();
            if (dnjnVarP == null) {
                return null;
            }
            return a(dnjnVarP);
        }
        if (dnihVar instanceof dniu) {
            return ((dniu) dnihVar).b;
        }
        if (dnihVar instanceof dnip) {
            return ((dnip) dnihVar).a;
        }
        return null;
    }
}
