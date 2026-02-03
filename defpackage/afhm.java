package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afhm implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ afhn c;

    public afhm(afhn afhnVar, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = afhnVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        afhn afhnVar = this.c;
        if (afhnVar.b) {
            return;
        }
        synchronized (afhs.b) {
            afho afhoVar = (afho) afhnVar.a.c.get();
            if (optional.isPresent() && afhoVar != null) {
                afhoVar.a(this.a, (Bitmap) optional.get(), this.b);
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (!(th instanceof dcff)) {
            throw new ejyc(th);
        }
        if (this.c.b) {
            return;
        }
        afhs.a.o("Failed to get photo for place by calling GetPhotoForPlace", th);
    }
}
