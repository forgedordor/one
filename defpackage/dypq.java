package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dypq extends dyps {
    public int a;
    public Drawable b;
    public int c;
    public String d;
    public int e;
    public View.OnClickListener f;
    public final ejwi g = ejud.a;
    public byte h;

    @Override // defpackage.dyps
    public final void a(int i) {
        this.a = i;
        this.h = (byte) (this.h | 1);
    }

    @Override // defpackage.dyps
    public final void b(int i) {
        this.e = i;
        this.h = (byte) (this.h | 4);
    }
}
