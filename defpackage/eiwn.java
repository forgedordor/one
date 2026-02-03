package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwn extends eixh {
    private final Optional b = Optional.empty();
    private final Optional c = Optional.empty();
    private List d;

    @Override // defpackage.eixh
    public final eixi b() {
        List list = this.d;
        if (list != null) {
            return new eiwo(this.b, this.c, list);
        }
        throw new IllegalStateException("Missing required properties: listItems");
    }

    @Override // defpackage.eixh
    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null listItems");
        }
        this.d = list;
    }
}
