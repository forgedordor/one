package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwaf extends dwbe {
    public dwpk a;
    private int b;
    private String c;
    private List d;
    private dwpx e;
    private byte f;

    @Override // defpackage.dwbe
    public final dwbf a() {
        String str;
        List list;
        dwpk dwpkVar;
        dwpx dwpxVar;
        if (this.f == 1 && (str = this.c) != null && (list = this.d) != null && (dwpkVar = this.a) != null && (dwpxVar = this.e) != null) {
            return new dwag(this.b, str, list, dwpkVar, dwpxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == 0) {
            sb.append(" receiptType");
        }
        if (this.c == null) {
            sb.append(" receiptId");
        }
        if (this.d == null) {
            sb.append(" messageIds");
        }
        if (this.a == null) {
            sb.append(" recipient");
        }
        if (this.e == null) {
            sb.append(" conversationId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwbe
    public final void b(dwpx dwpxVar) {
        if (dwpxVar == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.e = dwpxVar;
    }

    @Override // defpackage.dwbe
    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null messageIds");
        }
        this.d = list;
    }

    @Override // defpackage.dwbe
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null receiptId");
        }
        this.c = str;
    }

    @Override // defpackage.dwbe
    public final void e(int i) {
        this.b = i;
        this.f = (byte) 1;
    }
}
