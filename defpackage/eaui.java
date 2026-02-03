package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaui extends eavi {
    private List a;
    private deem b;

    @Override // defpackage.eavi
    public final eavj a() {
        List list = this.a;
        if (list != null) {
            return new eauj(list, this.b);
        }
        throw new IllegalStateException("Missing required properties: placeFields");
    }

    @Override // defpackage.eavi
    public final void b(deem deemVar) {
        this.b = deemVar;
    }

    @Override // defpackage.eavi
    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.a = list;
    }
}
