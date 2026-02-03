package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rno implements rfa {
    private final rii a;
    private final rfa b;

    public rno(rii riiVar, rfa rfaVar) {
        this.a = riiVar;
        this.b = rfaVar;
    }

    @Override // defpackage.red
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, rex rexVar) {
        return this.b.a(new rnr(((BitmapDrawable) ((rhy) obj).c()).getBitmap(), this.a), file, rexVar);
    }

    @Override // defpackage.rfa
    public final int b() {
        return 2;
    }
}
