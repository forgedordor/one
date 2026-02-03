package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ehdd {
    static {
        ehdb ehdbVar = new ehdb();
        ehdbVar.a(evqs.b);
        ehdbVar.a(evqs.b);
        ehdbVar.b = (byte) 1;
        ehdbVar.c = 1;
        if (ehdbVar.a != null) {
            ejwl.m(true, "setProto is only compatible with type PROTO");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (ehdbVar.a == null) {
            sb.append(" data");
        }
        if (ehdbVar.c == 0) {
            sb.append(" type");
        }
        if (ehdbVar.b == 0) {
            sb.append(" containsPii");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
