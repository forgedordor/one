package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rpj implements rom {
    private final rpg a;
    private final rux b;

    public rpj(rpg rpgVar, rux ruxVar) {
        this.a = rpgVar;
        this.b = ruxVar;
    }

    @Override // defpackage.rom
    public final void a(rii riiVar, Bitmap bitmap) throws IOException {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            riiVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.rom
    public final void b() {
        this.a.a();
    }
}
