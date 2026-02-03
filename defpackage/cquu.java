package defpackage;

import android.media.AudioAttributes;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cquu extends cquk {
    public cqum a;
    public Optional b = Optional.empty();
    private Optional c = Optional.empty();
    private final Optional d = Optional.empty();
    private Optional e = Optional.empty();
    private Optional f = Optional.empty();

    @Override // defpackage.cquk
    public final cqun a() {
        cqum cqumVar = this.a;
        if (cqumVar != null) {
            return new cquv(cqumVar, this.b, this.c, this.d, this.e, this.f);
        }
        throw new IllegalStateException("Missing required properties: dataSource");
    }

    @Override // defpackage.cquk
    public final void b(AudioAttributes audioAttributes) {
        this.e = Optional.of(audioAttributes);
    }

    @Override // defpackage.cquk
    public final void c(cquj cqujVar) {
        this.f = Optional.of(cqujVar);
    }

    @Override // defpackage.cquk
    public final void d(float f) {
        this.c = Optional.of(Float.valueOf(f));
    }
}
