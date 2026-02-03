package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwl extends eixf {
    private final Optional b = Optional.empty();
    private final Optional c = Optional.empty();
    private final Optional d = Optional.empty();
    private final Optional e = Optional.empty();
    private List f;

    @Override // defpackage.eixf
    public final eixg b() {
        List list = this.f;
        if (list != null) {
            return new eiwm(this.b, this.c, this.d, this.e, list);
        }
        throw new IllegalStateException("Missing required properties: attendeeList");
    }

    @Override // defpackage.eixf
    public final void c(List list) {
        this.f = list;
    }
}
