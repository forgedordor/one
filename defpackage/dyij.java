package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyij extends dyis {
    public int a;
    public Drawable b;
    public int c;
    public View.OnClickListener d;
    public dyhv e;
    public lvy f;
    public byte g;
    private String h;
    private int i;
    private final ejwi j = ejud.a;

    @Override // defpackage.dyis
    public final dyit a() {
        String str;
        View.OnClickListener onClickListener;
        lvy lvyVar;
        if (this.g == 7 && (str = this.h) != null && (onClickListener = this.d) != null && (lvyVar = this.f) != null) {
            return new dyik(this.a, this.b, this.c, str, this.i, onClickListener, this.e, lvyVar, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" id");
        }
        if ((this.g & 2) == 0) {
            sb.append(" iconResId");
        }
        if (this.h == null) {
            sb.append(" label");
        }
        if ((this.g & 4) == 0) {
            sb.append(" veId");
        }
        if (this.d == null) {
            sb.append(" onClickListener");
        }
        if (this.f == null) {
            sb.append(" trailingTextLiveData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dyis
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null label");
        }
        this.h = str;
    }

    @Override // defpackage.dyis
    public final void c(int i) {
        this.i = i;
        this.g = (byte) (this.g | 4);
    }
}
