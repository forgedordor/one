package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwr extends eixl {
    private List e;
    private final Optional b = Optional.empty();
    private final Optional c = Optional.empty();
    private final Optional d = Optional.empty();
    private final Optional f = Optional.empty();
    private final Optional g = Optional.empty();
    private final Optional h = Optional.empty();

    @Override // defpackage.eixl
    public final eixm b() {
        List list = this.e;
        if (list != null) {
            return new eiws(this.b, this.c, this.d, list, this.f, this.g, this.h);
        }
        throw new IllegalStateException("Missing required properties: orderedItems");
    }

    @Override // defpackage.eixl
    public final void c(List list) {
        this.e = list;
    }
}
