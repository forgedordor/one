package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eany extends eapn {
    public String a;
    public String b;
    private List c;

    @Override // defpackage.eapn
    public final eapo a() {
        List list;
        String str = this.a;
        if (str != null && (list = this.c) != null) {
            return new eapw(str, this.b, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.c == null) {
            sb.append(" types");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eapn
    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.c = list;
    }
}
