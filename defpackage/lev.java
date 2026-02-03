package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lev implements OnReceiveContentListener {
    private final ldo a;

    public lev(ldo ldoVar) {
        this.a = ldoVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        ldo ldoVar = this.a;
        lcw lcwVarF = lcw.f(contentInfo);
        lcw lcwVarA = ldoVar.a(view, lcwVarF);
        if (lcwVarA == null) {
            return null;
        }
        return lcwVarA == lcwVarF ? contentInfo : lcwVarA.e();
    }
}
