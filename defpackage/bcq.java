package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcq extends bab {
    public final int b;
    public final int c;
    private final bbh d;

    public bcq(bbm bbmVar, Size size, bbh bbhVar) {
        super(bbmVar);
        if (size == null) {
            this.b = super.c();
            this.c = super.b();
        } else {
            this.b = size.getWidth();
            this.c = size.getHeight();
        }
        this.d = bbhVar;
    }

    @Override // defpackage.bab, defpackage.bbm
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bab, defpackage.bbm
    public final int c() {
        return this.b;
    }

    @Override // defpackage.bab, defpackage.bbm
    public final bbh e() {
        return this.d;
    }
}
