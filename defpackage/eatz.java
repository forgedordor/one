package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eatz extends eauz {
    public String a;
    public deem b;
    private List c;

    @Override // defpackage.eauz
    public final eava a() {
        List list;
        String str = this.a;
        if (str != null && (list = this.c) != null) {
            return new eaua(str, list, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" placeId");
        }
        if (this.c == null) {
            sb.append(" placeFields");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eauz
    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeFields");
        }
        this.c = list;
    }
}
