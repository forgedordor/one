package defpackage;

import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class efdf {
    public static final /* synthetic */ int a = 0;

    static {
        ejvf ejvfVar = ejuq.a;
        ejvf ejvfVar2 = ejuy.a;
        ejvf.n("()<>@,;:\\\"/[]?=");
        ejvf.n("\"\\\r");
        ejvf.m(" \t\r\n");
    }

    public abstract ekgp a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append('/');
        sb.append(b());
        ekqg ekqgVarListIterator = a().entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            sb.append("; ");
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }
}
