package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edvo {
    public final Context a;
    private final fctc c = fctd.a(new fdae() { // from class: edvl
        @Override // defpackage.fdae
        public final Object invoke() {
            return Boolean.valueOf(fbjv.a.a().a(this.a.a));
        }
    });
    private final fctc d = fctd.a(new fdae() { // from class: edvm
        @Override // defpackage.fdae
        public final Object invoke() {
            return Boolean.valueOf(fbjv.a.a().b(this.a.a));
        }
    });
    public final fctc b = fctd.a(new fdae() { // from class: edvn
        @Override // defpackage.fdae
        public final Object invoke() {
            return Boolean.valueOf(fbjv.a.a().c(this.a.a));
        }
    });

    public edvo(Context context) {
        this.a = context;
    }

    public final boolean a() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.d.a()).booleanValue();
    }
}
