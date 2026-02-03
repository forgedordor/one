package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfx extends bxgj {
    private final Context b;

    public bxfx(Context context) {
        this.b = context;
    }

    @Override // defpackage.bxgj
    protected final bxgi b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? new bxgi(5, "VCardCache") : new bxgx("EmojiImageCache", this.b) : new bxgx("AvatarImageCache", this.b) : new bxgx(10240, "DefaultImageCache", this.b);
    }
}
