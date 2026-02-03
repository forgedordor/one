package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edmt extends rts {
    final /* synthetic */ SquareImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edmt(SquareImageView squareImageView, SquareImageView squareImageView2) {
        super(squareImageView2);
        this.b = squareImageView;
    }

    @Override // defpackage.rua
    public final void a(Drawable drawable) {
        this.b.b();
    }

    @Override // defpackage.rua
    public final /* bridge */ /* synthetic */ void b(Object obj, ruk rukVar) {
        SquareImageView squareImageView = this.b;
        squareImageView.a = (Bitmap) obj;
        squareImageView.c();
    }

    @Override // defpackage.rts
    protected final void c() {
        this.b.b();
    }
}
