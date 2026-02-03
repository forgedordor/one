package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyrl extends dyri {
    public dxxk a;
    public dyvi b;
    public dxyj c;
    public View.OnClickListener d;

    @Override // defpackage.dyri
    public final dxyj a() {
        return this.c;
    }

    @Override // defpackage.dyri
    public final dyrj b() {
        View.OnClickListener onClickListener;
        dxxk dxxkVar = this.a;
        if (dxxkVar != null && (onClickListener = this.d) != null) {
            return new dyrm(dxxkVar, this.b, this.c, onClickListener);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" accountConverter");
        }
        if (this.d == null) {
            sb.append(" onAddAccount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dyri
    public final dyvi d() {
        return this.b;
    }
}
